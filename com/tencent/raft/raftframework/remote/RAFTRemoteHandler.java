package com.tencent.raft.raftframework.remote;

import android.os.Bundle;
import com.tencent.raft.raftframework.RAFT;
import com.tencent.raft.raftframework.log.RLog;
import g.a.a.a.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RAFTRemoteHandler implements InvocationHandler {
    private static final String TAG = "RAFTRemoteHandler";
    private final Class<?> clazz;
    private final String key;

    public RAFTRemoteHandler(Class<?> cls, String str) {
        this.clazz = cls;
        this.key = str;
    }

    private Object checkResult(String str, RAFTRemoteResult rAFTRemoteResult) {
        Bundle bundle;
        boolean z = false;
        if (rAFTRemoteResult == null) {
            StringBuilder i2 = a.i("callAPISync before init, ");
            i2.append(this.clazz.getName());
            i2.append(RemoteProxyUtil.SPLIT_CHAR);
            i2.append(str);
            i2.append(" fail, result is null");
            String sb = i2.toString();
            RLog.w(TAG, sb);
            throw new IllegalStateException(sb);
        } else if (rAFTRemoteResult.code != 0 || (bundle = rAFTRemoteResult.data) == null) {
            StringBuilder i3 = a.i("Call ");
            i3.append(this.clazz.getName());
            i3.append(RemoteProxyUtil.SPLIT_CHAR);
            i3.append(str);
            i3.append(" fail, code=");
            i3.append(rAFTRemoteResult.code);
            i3.append(" data=");
            if (rAFTRemoteResult.data == null) {
                z = true;
            }
            i3.append(z);
            String sb2 = i3.toString();
            RLog.w(TAG, sb2, rAFTRemoteResult.throwable);
            throw new IllegalStateException(sb2, rAFTRemoteResult.throwable);
        } else {
            String string = bundle.getString(RemoteProxyUtil.KEY_RESULT_TYPE);
            if (string != null) {
                return RemoteProxyUtil.getBundleParameter(rAFTRemoteResult.data, string, RemoteProxyUtil.KEY_RESULT);
            }
            StringBuilder i4 = a.i("Call ");
            i4.append(this.clazz.getName());
            i4.append(RemoteProxyUtil.SPLIT_CHAR);
            i4.append(str);
            i4.append(" fail, resultType is null");
            String sb3 = i4.toString();
            RLog.w(TAG, sb3);
            throw new IllegalStateException(sb3, rAFTRemoteResult.throwable);
        }
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (RAFT.getConfig().isForceCheck()) {
            RemoteProxyUtil.checkCurrentThread(this.clazz, method);
        }
        Bundle bundle = new Bundle();
        bundle.setClassLoader(getClass().getClassLoader());
        RemoteProxyUtil.checkMethodAndParameter(method, true, objArr);
        RemoteProxyUtil.setMethodAndParameter(method, objArr, bundle);
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder i2 = a.i("callRaft$");
        i2.append(this.clazz.getName());
        i2.append(RemoteProxyUtil.SPLIT_CHAR);
        i2.append(this.key);
        i2.append(RemoteProxyUtil.SPLIT_CHAR);
        i2.append(method.getName());
        String sb = i2.toString();
        RAFTRemoteResult callServerSync = RAFTRemoteProxy.callServerSync(sb, bundle);
        if (RAFT.getConfig().isDebugVersion()) {
            StringBuilder n = a.n("action=", sb, " cost=");
            n.append(System.currentTimeMillis() - currentTimeMillis);
            RLog.d(TAG, n.toString());
        }
        return checkResult(method.getName(), callServerSync);
    }
}
