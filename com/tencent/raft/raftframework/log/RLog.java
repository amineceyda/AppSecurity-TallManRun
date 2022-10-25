package com.tencent.raft.raftframework.log;

public class RLog {
    private static ILogDelegate sLogDelegate = new DefaultLogDelegate();

    public static void d(String str, String str2, Throwable th) {
        sLogDelegate.debug(str, str2, th);
    }

    public static void d(String str, Object... objArr) {
        sLogDelegate.debug(str, getLogMsg(objArr).toString());
    }

    public static void e(String str, String str2, Throwable th) {
        sLogDelegate.error(str, str2, th);
    }

    public static void e(String str, Object... objArr) {
        sLogDelegate.error(str, getLogMsg(objArr).toString());
    }

    private static StringBuilder getLogMsg(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb;
    }

    public static void i(String str, String str2, Throwable th) {
        sLogDelegate.info(str, str2, th);
    }

    public static void i(String str, Object... objArr) {
        sLogDelegate.info(str, getLogMsg(objArr).toString());
    }

    public static void setLogDelegate(ILogDelegate iLogDelegate) {
        if (iLogDelegate == null) {
            iLogDelegate = new DefaultLogDelegate();
        }
        sLogDelegate = iLogDelegate;
    }

    public static void w(String str, String str2, Throwable th) {
        sLogDelegate.warn(str, str2, th);
    }

    public static void w(String str, Object... objArr) {
        sLogDelegate.warn(str, getLogMsg(objArr).toString());
    }
}
