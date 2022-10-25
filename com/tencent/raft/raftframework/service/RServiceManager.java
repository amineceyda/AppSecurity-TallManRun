package com.tencent.raft.raftframework.service;

import com.tencent.raft.raftframework.RAFT;
import com.tencent.raft.raftframework.exception.RAFTCallWrongProcessException;
import com.tencent.raft.raftframework.exception.RAFTNotDeclareServiceException;
import com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException;
import com.tencent.raft.raftframework.log.RLog;
import com.tencent.raft.raftframework.service.util.RServiceCycleInitCheckUtil;
import com.tencent.raft.raftframework.service.util.RServiceUtil;
import com.tencent.raft.raftframework.util.ProcessUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RServiceManager implements IRServiceManager {
    public static final String TAG = "RServiceManager";
    private ConcurrentHashMap<Class<?>, RAServiceEntry> mServiceEntryMap = new ConcurrentHashMap<>(512);
    private final ConcurrentHashMap<Class<?>, ConcurrentHashMap<String, Object>> mSingletonServiceMap = new ConcurrentHashMap<>(512);
    private HashMap<String, String> mUnParseServiceMap = new HashMap<>();

    public RServiceManager(String str) {
        RLog.d(TAG, "init ...");
        try {
            this.mUnParseServiceMap = (HashMap) Class.forName(str).getDeclaredField("sServicesMap").get((Object) null);
        } catch (Exception e2) {
            RLog.w(TAG, "init entryMap error :" + str, e2);
        }
    }

    private <T> T getFromCache(Class<T> cls, String str) {
        T t;
        ConcurrentHashMap concurrentHashMap = this.mSingletonServiceMap.get(cls);
        if (concurrentHashMap == null || (t = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return t;
    }

    private <T> RAServiceEntry getRAServiceEntry(Class<T> cls) {
        RAServiceEntry rAServiceEntry;
        InstantiationException e2;
        RAServiceEntry rAServiceEntry2;
        String str;
        String str2;
        ClassNotFoundException e3;
        IllegalAccessException e4;
        RAServiceEntry rAServiceEntry3 = this.mServiceEntryMap.get(cls);
        if (rAServiceEntry3 != null) {
            return rAServiceEntry3;
        }
        String str3 = this.mUnParseServiceMap.get(cls.getName());
        if (str3 == null) {
            return null;
        }
        synchronized (cls) {
            rAServiceEntry = this.mServiceEntryMap.get(cls);
            if (rAServiceEntry == null) {
                try {
                    rAServiceEntry2 = (RAServiceEntry) Class.forName(str3).newInstance();
                    try {
                        this.mServiceEntryMap.put(cls, rAServiceEntry2);
                    } catch (ClassNotFoundException e5) {
                        e3 = e5;
                    } catch (IllegalAccessException e6) {
                        e4 = e6;
                        str = TAG;
                        str2 = "getRaServiceEntry error :";
                        RLog.w(str, str2, e2);
                        rAServiceEntry = rAServiceEntry2;
                        return rAServiceEntry;
                    } catch (InstantiationException e7) {
                        e2 = e7;
                        str = TAG;
                        str2 = "getRaServiceEntry error :";
                        RLog.w(str, str2, e2);
                        rAServiceEntry = rAServiceEntry2;
                        return rAServiceEntry;
                    }
                } catch (ClassNotFoundException e8) {
                    RAServiceEntry rAServiceEntry4 = rAServiceEntry;
                    e3 = e8;
                    rAServiceEntry2 = rAServiceEntry4;
                    str = TAG;
                    str2 = "getRaServiceEntry error :";
                    RLog.w(str, str2, e2);
                    rAServiceEntry = rAServiceEntry2;
                    return rAServiceEntry;
                } catch (IllegalAccessException e9) {
                    RAServiceEntry rAServiceEntry5 = rAServiceEntry;
                    e4 = e9;
                    rAServiceEntry2 = rAServiceEntry5;
                    str = TAG;
                    str2 = "getRaServiceEntry error :";
                    RLog.w(str, str2, e2);
                    rAServiceEntry = rAServiceEntry2;
                    return rAServiceEntry;
                } catch (InstantiationException e10) {
                    RAServiceEntry rAServiceEntry6 = rAServiceEntry;
                    e2 = e10;
                    rAServiceEntry2 = rAServiceEntry6;
                    str = TAG;
                    str2 = "getRaServiceEntry error :";
                    RLog.w(str, str2, e2);
                    rAServiceEntry = rAServiceEntry2;
                    return rAServiceEntry;
                }
                rAServiceEntry = rAServiceEntry2;
            }
        }
        return rAServiceEntry;
    }

    private <T> T getRServiceByAnnotation(Class<T> cls, String str, boolean z) {
        T rServiceByAnnotation;
        RAServiceEntry rAServiceEntry = getRAServiceEntry(cls);
        if (rAServiceEntry == null) {
            throw new RAFTServiceNotFoundException(2);
        } else if (!z) {
            return getRServiceByAnnotation(cls, str, false, rAServiceEntry);
        } else {
            synchronized (cls) {
                rServiceByAnnotation = getRServiceByAnnotation(cls, str, true, rAServiceEntry);
            }
            return rServiceByAnnotation;
        }
    }

    private <T> T getRServiceByAnnotation(Class<T> cls, String str, boolean z, RAServiceEntry rAServiceEntry) {
        T fromCache = getFromCache(cls, str);
        if (fromCache == null) {
            fromCache = rAServiceEntry.createService(str).service;
            if (fromCache == null) {
                throw new RAFTServiceNotFoundException(2);
            } else if (z) {
                putToServiceCache(cls, str, fromCache);
            }
        }
        return fromCache;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T getRServiceByName(java.lang.Class<T> r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = com.tencent.raft.raftframework.service.util.RServiceUtil.convertApiToImplClass(r6)
            r1 = 3
            boolean r2 = com.tencent.raft.raftframework.service.util.RServiceCycleInitCheckUtil.checkAndSet(r0)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x0019
            monitor-enter(r6)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            java.lang.Object r7 = r5.getRServiceByName(r6, r3, r0)     // Catch:{ all -> 0x0016 }
            monitor-exit(r6)     // Catch:{ all -> 0x0016 }
            goto L_0x001d
        L_0x0016:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0016 }
            throw r7     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
        L_0x0019:
            java.lang.Object r7 = r5.getRServiceByName(r6, r4, r0)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
        L_0x001d:
            return r7
        L_0x001e:
            com.tencent.raft.raftframework.service.util.RServiceCycleInitCheckUtil.removeOnException()     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            java.lang.String r7 = "find cycle init from:"
            r6.append(r7)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            r6.append(r0)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            java.lang.String r7 = "RServiceManager"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            r0[r4] = r6     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            com.tencent.raft.raftframework.log.RLog.d(r7, r0)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException r7 = new com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            r7.<init>(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
            throw r7     // Catch:{ ClassNotFoundException -> 0x0054, IllegalAccessException -> 0x004d, InstantiationException -> 0x0046 }
        L_0x0046:
            r6 = move-exception
            com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException r7 = new com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException
            r7.<init>(r1, r6)
            throw r7
        L_0x004d:
            r6 = move-exception
            com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException r7 = new com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException
            r7.<init>(r1, r6)
            throw r7
        L_0x0054:
            r6 = move-exception
            com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException r7 = new com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException
            r7.<init>(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.raft.raftframework.service.RServiceManager.getRServiceByName(java.lang.Class, boolean):java.lang.Object");
    }

    private <T> T getRServiceByName(Class<T> cls, boolean z, String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        T fromCache = getFromCache(cls, str);
        if (fromCache == null) {
            fromCache = Class.forName(str).newInstance();
            RServiceCycleInitCheckUtil.checkAndRemove(str);
            if (z) {
                putToServiceCache(cls, str, fromCache);
            }
        }
        return fromCache;
    }

    private <T> T putToServiceCache(Class<T> cls, String str, T t) {
        ConcurrentHashMap concurrentHashMap = this.mSingletonServiceMap.get(cls);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap(16);
        }
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        concurrentHashMap.put(str, t);
        this.mSingletonServiceMap.put(cls, concurrentHashMap);
        return t;
    }

    public void destroy() {
        this.mSingletonServiceMap.clear();
        this.mServiceEntryMap.clear();
    }

    public <T> T get(Class<T> cls, String str) throws RAFTServiceNotFoundException {
        T fromCache;
        if (RAFT.getConfig().getProcessCheck().check(cls, ProcessUtil.getProcessName(RAFT.getContext()), RAFT.getConfig().isForceCheck())) {
            boolean isSingleton = RServiceUtil.isSingleton(cls);
            if (isSingleton && (fromCache = getFromCache(cls, str)) != null) {
                return fromCache;
            }
            try {
                return getRServiceByAnnotation(cls, str, isSingleton);
            } catch (RAFTServiceNotFoundException e2) {
                if (RAFT.getConfig().isDebugVersion()) {
                    RLog.i(TAG, e2.getMessage(), e2);
                }
                return getRServiceByName(cls, isSingleton);
            }
        } else {
            throw new RAFTCallWrongProcessException(cls);
        }
    }

    public <T> Map<String, T> getAllRService(Class<T> cls) throws RAFTNotDeclareServiceException, RAFTServiceNotFoundException {
        RServiceUtil.checkRServiceAnnotation(cls);
        HashMap hashMap = new HashMap();
        RAServiceEntry rAServiceEntry = getRAServiceEntry(cls);
        if (rAServiceEntry != null) {
            for (String next : RAServiceLoader.get(rAServiceEntry.getKey()).getAllKey()) {
                hashMap.put(next, get(cls, next));
            }
            return hashMap;
        }
        throw new RAFTServiceNotFoundException(2);
    }
}
