package com.tencent.raft.codegenmeta.utils;

public class RLog {
    public static final String DEBUG = "DEBUG";
    public static final String ERROR = "ERROR";
    public static final String WARN = " WARN";

    public static void d(String str, Object... objArr) {
        System.out.println(format(DEBUG, str, getLogMsg(objArr).toString()));
    }

    public static void e(String str, Object... objArr) {
        System.out.println(format("ERROR", str, getLogMsg(objArr).toString()));
    }

    private static String format(String str, String str2, String str3) {
        return "[" + str + "] [" + str2 + "] " + str3;
    }

    private static StringBuilder getLogMsg(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb;
    }

    public static void w(String str, Object... objArr) {
        System.out.println(format(WARN, str, getLogMsg(objArr).toString()));
    }
}
