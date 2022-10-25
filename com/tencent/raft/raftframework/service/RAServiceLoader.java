package com.tencent.raft.raftframework.service;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RAServiceLoader {
    private static final Map<String, RAServiceLoader> SERVICE_LOADER = new ConcurrentHashMap();
    private final Map<String, Class<?>> serviceImplMap = new ConcurrentHashMap();

    private RAServiceLoader() {
    }

    public static void clear() {
        SERVICE_LOADER.clear();
    }

    public static RAServiceLoader get(String str) {
        Map<String, RAServiceLoader> map = SERVICE_LOADER;
        RAServiceLoader rAServiceLoader = map.get(str);
        if (rAServiceLoader != null) {
            return rAServiceLoader;
        }
        RAServiceLoader rAServiceLoader2 = new RAServiceLoader();
        map.put(str, rAServiceLoader2);
        return rAServiceLoader2;
    }

    public Set<String> getAllKey() {
        return this.serviceImplMap.keySet();
    }

    public Object loadSingleService(String str) {
        Class cls = this.serviceImplMap.get(str);
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void register(String str, Class<?> cls) {
        this.serviceImplMap.put(str, cls);
    }
}
