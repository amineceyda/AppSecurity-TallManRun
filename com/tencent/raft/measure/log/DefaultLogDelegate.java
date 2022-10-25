package com.tencent.raft.measure.log;

import android.util.Log;

public class DefaultLogDelegate implements ILogDelegate {
    public void debug(String str, String str2) {
        Log.d(str, str2);
    }

    public void debug(String str, String str2, Throwable th) {
        Log.d(str, str2, th);
    }

    public void error(String str, String str2) {
        Log.e(str, str2);
    }

    public void error(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public void info(String str, String str2) {
        Log.i(str, str2);
    }

    public void info(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    public void warn(String str, String str2) {
        Log.w(str, str2);
    }

    public void warn(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }
}
