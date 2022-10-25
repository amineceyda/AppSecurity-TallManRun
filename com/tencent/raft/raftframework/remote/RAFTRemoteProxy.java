package com.tencent.raft.raftframework.remote;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.raft.raftframework.RAFT;
import com.tencent.raft.raftframework.log.RLog;
import g.a.a.a.a;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class RAFTRemoteProxy {
    private static final HashMap<String, Class<?>> CACHE_CLASS_MAP = new HashMap<>(512);
    private static final HashMap<String, Method> CACHE_METHOD_MAP = new HashMap<>(512);
    private static final ConcurrentHashMap<String, Object> CACHE_PROXY_CLASS_MAP = new ConcurrentHashMap<>(512);
    private static final Object LOCK_OBJECT = new Object();
    private static final String SPLIT_KEY = "##";
    private static final String TAG = "RAFTRemoteProxy";
    private static IRAFTRemoteProxy mRaftRemoteProxy;

    private RAFTRemoteProxy() {
    }

    public static RAFTRemoteResult callInMainProcess(String str, Bundle bundle, int i2) {
        Class<?> cls;
        Method method;
        if (RAFT.getConfig().isDebugVersion()) {
            RLog.d(TAG, "action:" + str + "  callbackId:" + i2);
        }
        if (TextUtils.isEmpty(str) || !str.contains(RemoteProxyUtil.SPLIT_CHAR)) {
            return new RAFTRemoteResult(RAFTRemoteResult.CODE_HAS_EXCEPTION, bundle, new IllegalStateException("wrong acton"));
        }
        String[] split = str.split("\\$");
        if (split.length != 4) {
            return new RAFTRemoteResult(RAFTRemoteResult.CODE_HAS_EXCEPTION, bundle, new IllegalStateException(a.w("wrong action, action = ", str)));
        }
        String str2 = split[1];
        String str3 = split[2];
        String str4 = split[3];
        try {
            HashMap<String, Class<?>> hashMap = CACHE_CLASS_MAP;
            if (hashMap.containsKey(str2)) {
                cls = hashMap.get(str2);
            } else {
                Class<?> cls2 = Class.forName(str2);
                hashMap.put(str2, cls2);
                cls = cls2;
            }
            try {
                Object obj = RAFT.get(cls, str3);
                bundle.setClassLoader(cls.getClassLoader());
                ArrayList<String> stringArrayList = bundle.getStringArrayList("__parameterTypes__");
                int size = stringArrayList.size();
                Class[] clsArr = new Class[size];
                Object[] objArr = new Object[size];
                for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                    String str5 = stringArrayList.get(i3);
                    clsArr[i3] = RemoteProxyUtil.getClassFromName(str5);
                    objArr[i3] = RemoteProxyUtil.getBundleParameter(bundle, str5, "__arg+" + i3 + "__");
                }
                HashMap<String, Method> hashMap2 = CACHE_METHOD_MAP;
                if (hashMap2.get(str) != null) {
                    method = hashMap2.get(str);
                } else {
                    Method declaredMethod = cls.getDeclaredMethod(str4, clsArr);
                    hashMap2.put(str, declaredMethod);
                    method = declaredMethod;
                }
                Object invoke = method.invoke(obj, objArr);
                RAFTRemoteResult rAFTRemoteResult = new RAFTRemoteResult(0, bundle);
                RemoteProxyUtil.setBundleParameter(bundle, method.getReturnType().getName(), RemoteProxyUtil.KEY_RESULT, invoke);
                bundle.putString(RemoteProxyUtil.KEY_RESULT_TYPE, method.getReturnType().getName());
                return rAFTRemoteResult;
            } catch (Throwable th) {
                RLog.d(TAG, "RAFT service has exception in main process, action = " + str);
                return new RAFTRemoteResult(RAFTRemoteResult.CODE_HAS_EXCEPTION, bundle, th);
            }
        } catch (Exception e2) {
            CACHE_METHOD_MAP.clear();
            e2.printStackTrace();
            RAFTRemoteResult rAFTRemoteResult2 = new RAFTRemoteResult(RAFTRemoteResult.CODE_HAS_EXCEPTION, bundle, e2);
            RLog.w(TAG, "onCall exception", e2);
            return rAFTRemoteResult2;
        }
    }

    public static RAFTRemoteResult callServerSync(String str, Bundle bundle) {
        IRAFTRemoteProxy iRAFTRemoteProxy = mRaftRemoteProxy;
        if (iRAFTRemoteProxy != null) {
            return iRAFTRemoteProxy.callServerSync(str, bundle);
        }
        RLog.w(TAG, a.w("callServerSync before init, action=", str));
        return null;
    }

    public static void clear() {
        CACHE_CLASS_MAP.clear();
        CACHE_PROXY_CLASS_MAP.clear();
    }

    public static Object getProxy(Class<?> cls, String str) {
        String c = a.c(cls.getName(), SPLIT_KEY, str);
        ConcurrentHashMap<String, Object> concurrentHashMap = CACHE_PROXY_CLASS_MAP;
        if (concurrentHashMap.containsKey(c)) {
            return concurrentHashMap.get(c);
        }
        synchronized (LOCK_OBJECT) {
            if (concurrentHashMap.containsKey(c)) {
                return concurrentHashMap.get(c);
            }
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RAFTRemoteHandler(cls, str));
            concurrentHashMap.put(c, newProxyInstance);
            return newProxyInstance;
        }
    }

    public static void init(IRAFTRemoteProxy iRAFTRemoteProxy) {
        mRaftRemoteProxy = iRAFTRemoteProxy;
    }
}
