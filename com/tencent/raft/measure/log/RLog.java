package com.tencent.raft.measure.log;

import com.tencent.raft.measure.RAFTMeasure;

public final class RLog {
    private RLog() {
    }

    public static void d(String str, String str2, Throwable th) {
        RAFTMeasure.getAppConfig().getLogDelegate().debug(str, str2, th);
    }

    public static void d(String str, Object... objArr) {
        RAFTMeasure.getAppConfig().getLogDelegate().debug(str, getLogMsg(objArr).toString());
    }

    public static void e(String str, String str2, Throwable th) {
        RAFTMeasure.getAppConfig().getLogDelegate().error(str, str2, th);
    }

    public static void e(String str, Object... objArr) {
        RAFTMeasure.getAppConfig().getLogDelegate().error(str, getLogMsg(objArr).toString());
    }

    private static StringBuilder getLogMsg(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb;
    }

    public static void i(String str, String str2, Throwable th) {
        RAFTMeasure.getAppConfig().getLogDelegate().info(str, str2, th);
    }

    public static void i(String str, Object... objArr) {
        RAFTMeasure.getAppConfig().getLogDelegate().info(str, getLogMsg(objArr).toString());
    }

    public static void w(String str, String str2, Throwable th) {
        RAFTMeasure.getAppConfig().getLogDelegate().warn(str, str2, th);
    }

    public static void w(String str, Object... objArr) {
        RAFTMeasure.getAppConfig().getLogDelegate().warn(str, getLogMsg(objArr).toString());
    }
}
