package com.tencent.raft.raftframework.service;

import com.tencent.raft.raftframework.IServiceProvider;
import com.tencent.raft.raftframework.constant.RAFTConstants;
import com.tencent.raft.raftframework.log.RLog;
import com.tencent.raft.raftframework.remote.RAFTIPCMainProcessorEntry;
import com.tencent.raft.raftframework.service.api.IServiceEntry;
import com.tencent.raft.raftframework.service.api.ServiceWrapper;
import com.tencent.raft.raftframework.service.export.IRAFTIPCMainProcessor;
import g.a.a.a.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class RAServiceManager implements IRAServiceManager {
    public static final String TAG = "RAServiceManager";
    private HashMap<Class<?>, IServiceEntry> mServiceEntryMap = new HashMap<>();
    private HashMap<String, Object> mSingletonMap = new HashMap<>();
    private HashMap<String, WeakReference<Object>> mWeakSingletonMap = new HashMap<>();

    public RAServiceManager(String str) {
        init(str);
    }

    private void addFrameworkExportService() {
        this.mServiceEntryMap.put(IRAFTIPCMainProcessor.class, new RAFTIPCMainProcessorEntry());
    }

    private Object getFromCache(String str) {
        WeakReference weakReference;
        if (this.mSingletonMap.containsKey(str)) {
            return this.mSingletonMap.get(str);
        }
        if (!this.mWeakSingletonMap.containsKey(str) || (weakReference = this.mWeakSingletonMap.get(str)) == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }

    private void init(String str) {
        RLog.d(TAG, "init ...");
        try {
            addFrameworkExportService();
            for (Map.Entry entry : ((Map) Class.forName(str).getDeclaredField("sServicesMap").get((Object) null)).entrySet()) {
                Class cls = (Class) entry.getKey();
                IServiceEntry iServiceEntry = (IServiceEntry) entry.getValue();
                IServiceEntry iServiceEntry2 = this.mServiceEntryMap.get(cls);
                if (iServiceEntry2 != null) {
                    if (iServiceEntry2.getPriority() <= iServiceEntry.getPriority()) {
                    }
                }
                this.mServiceEntryMap.put(cls, iServiceEntry);
            }
            StringBuilder i2 = a.i("init success :");
            i2.append(this.mServiceEntryMap.size());
            RLog.d(TAG, i2.toString());
        } catch (Exception e2) {
            RLog.w(TAG, "init entryMap error :" + e2);
        }
    }

    private void putToCache(String str, ServiceWrapper serviceWrapper) {
        RAFTConstants.Scope scope = serviceWrapper.scope;
        if (scope == RAFTConstants.Scope.SINGLETON || scope == RAFTConstants.Scope.LAZY_SINGLETON) {
            this.mSingletonMap.put(str, serviceWrapper.service);
        } else if (scope == RAFTConstants.Scope.WEAK_SINGLETON) {
            this.mWeakSingletonMap.put(str, new WeakReference(serviceWrapper.service));
        }
    }

    public void destroy() {
        this.mServiceEntryMap.clear();
        this.mSingletonMap.clear();
        this.mWeakSingletonMap.clear();
    }

    public <T> T getService(Class<T> cls, IServiceProvider iServiceProvider) {
        T fromCache;
        IServiceEntry iServiceEntry = this.mServiceEntryMap.get(cls);
        if (iServiceEntry != null) {
            String key = iServiceEntry.getKey();
            T fromCache2 = getFromCache(key);
            if (fromCache2 != null) {
                return fromCache2;
            }
            synchronized (iServiceEntry) {
                fromCache = getFromCache(key);
                if (fromCache == null) {
                    ServiceWrapper provide = iServiceProvider != null ? iServiceProvider.provide() : iServiceEntry.createService();
                    putToCache(key, provide);
                    fromCache = provide.service;
                }
            }
            return fromCache;
        } else if (iServiceProvider != null) {
            return iServiceProvider.provide().service;
        } else {
            StringBuilder i2 = a.i("getService error :cannot found entry >> ");
            i2.append(cls.getName());
            RLog.w(TAG, i2.toString());
            return null;
        }
    }
}
