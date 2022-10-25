package com.tencent.raft.standard.log;

public interface IRLog {
    public static final int ALL = 0;
    public static final int DEBUG = 1;
    public static final int ERROR = 4;
    public static final int INFO = 2;
    public static final int NONE = 6;
    public static final int VERBOSE = 0;
    public static final int WARN = 3;

    void d(String str, String str2);

    void d(String str, String str2, Throwable th);

    void d(String str, String str2, Object... objArr);

    void d(String[] strArr, String str, Throwable th);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    void e(String str, String str2, Object... objArr);

    void e(String[] strArr, String str, Throwable th);

    void flushLog();

    void i(String str, String str2);

    void i(String str, String str2, Throwable th);

    void i(String str, String str2, Object... objArr);

    void i(String[] strArr, String str, Throwable th);

    boolean isColorLevel();

    void log(String str, int i2, String str2);

    void log(String str, int i2, String str2, Throwable th);

    void log(String str, int i2, String str2, Object... objArr);

    void log(String[] strArr, int i2, String str, Throwable th);

    void v(String str, String str2);

    void v(String str, String str2, Throwable th);

    void v(String str, String str2, Object... objArr);

    void v(String[] strArr, String str, Throwable th);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);

    void w(String str, String str2, Object... objArr);

    void w(String[] strArr, String str, Throwable th);
}
