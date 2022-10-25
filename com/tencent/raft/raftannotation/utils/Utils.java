package com.tencent.raft.raftannotation.utils;

import java.util.Collection;

public class Utils {
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty() || str.trim().isEmpty();
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static Object makeParamValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Double.TYPE) {
            return 0;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return null;
    }
}
