package com.tencent.raft.raftframework.service.util;

import com.tencent.raft.raftannotation.RService;
import com.tencent.raft.raftframework.exception.RAFTNotDeclareServiceException;
import java.util.concurrent.ConcurrentHashMap;

public class RServiceUtil {
    private static final ConcurrentHashMap<Class<?>, String> IMPL_CLASS_NAME_HASH_MAP = new ConcurrentHashMap<>(2048);

    private RServiceUtil() {
    }

    public static <T> void checkRServiceAnnotation(Class<T> cls) throws RAFTNotDeclareServiceException {
        if (!cls.isAnnotationPresent(RService.class)) {
            throw new RAFTNotDeclareServiceException(cls);
        }
    }

    public static String convertApiToImplClass(Class<?> cls) {
        ConcurrentHashMap<Class<?>, String> concurrentHashMap = IMPL_CLASS_NAME_HASH_MAP;
        String str = concurrentHashMap.get(cls);
        if (str == null) {
            synchronized (cls) {
                str = concurrentHashMap.get(cls);
                if (str == null) {
                    str = getImplNameInner(cls);
                    concurrentHashMap.put(cls, str);
                }
            }
        }
        return str;
    }

    private static String getImplNameInner(Class<?> cls) {
        StringBuilder sb = new StringBuilder(cls.getName());
        sb.append("Impl");
        int lastIndexOf = sb.lastIndexOf(".");
        if (lastIndexOf <= 0) {
            return "";
        }
        int i2 = lastIndexOf + 1;
        sb.deleteCharAt(i2);
        sb.insert(i2, "impl.");
        return sb.toString();
    }

    public static <T> boolean isSingleton(Class<T> cls) {
        RService rService;
        if (!cls.isAnnotationPresent(RService.class) || (rService = (RService) cls.getAnnotation(RService.class)) == null) {
            return true;
        }
        return rService.scope().equals("Singleton");
    }
}
