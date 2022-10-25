package com.ola.qsea.w;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class g {
    public static Map<String, String> a = new ConcurrentHashMap();

    public static String a(String str) {
        return a.get(str);
    }

    public static void a(String str, String str2) {
        a.put(str, str2);
    }
}
