package com.tencent.beacon.base.util;

import android.util.Log;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import g.a.a.a.a;
import java.util.Locale;

public class c {
    public static boolean a = true;
    private static BeaconLogger b = null;
    private static boolean c = false;

    private c() {
    }

    private static int a(StackTraceElement[] stackTraceElementArr, Class cls) {
        for (int i2 = 5; i2 < stackTraceElementArr.length; i2++) {
            String className = stackTraceElementArr[i2].getClassName();
            if ((!cls.equals(Log.class) || i2 >= stackTraceElementArr.length - 1 || !stackTraceElementArr[i2 + 1].getClassName().equals(Log.class.getName())) && className.equals(cls.getName())) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static void a(BeaconLogger beaconLogger) {
        b = beaconLogger;
    }

    public static void a(String str, int i2, String str2, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = b;
            if (beaconLogger == null) {
                Log.d("beacon", c(str + " step: " + i2 + ". " + str2, objArr));
                return;
            }
            beaconLogger.d("beacon", c(str + " step: " + i2 + ". " + str2, objArr));
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = b;
            if (beaconLogger == null) {
                Log.d("beacon", c(str + " " + str2, objArr));
                return;
            }
            beaconLogger.d("beacon", c(str + " " + str2, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = b;
            String c2 = c(str, objArr);
            if (beaconLogger == null) {
                Log.d("beacon", c2);
            } else {
                beaconLogger.d("beacon", c2);
            }
        }
    }

    public static void a(Throwable th) {
        if (th != null && c()) {
            BeaconLogger beaconLogger = b;
            if (beaconLogger == null) {
                th.printStackTrace();
            } else {
                beaconLogger.printStackTrace(th);
            }
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (c.class) {
            Log.i("beacon", "beacon logAble: " + z);
            c = z;
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (c.class) {
            z = c;
        }
        return z;
    }

    public static void b(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = b;
            String c2 = c(str, objArr);
            if (beaconLogger == null) {
                Log.e("beacon", c2);
            } else {
                beaconLogger.e("beacon", c2);
            }
        }
    }

    public static synchronized void b(boolean z) {
        synchronized (c.class) {
            a = z;
        }
    }

    public static synchronized boolean b() {
        boolean z;
        synchronized (c.class) {
            z = a;
        }
        return z;
    }

    public static String c(String str, Object... objArr) {
        String e2 = e();
        if (str == null) {
            return a.w(e2, "msg is null");
        }
        if (objArr == null || objArr.length == 0) {
            return a.w(e2, str);
        }
        StringBuilder i2 = a.i(e2);
        i2.append(String.format(Locale.US, str, objArr));
        return i2.toString();
    }

    private static boolean c() {
        return a();
    }

    private static StackTraceElement d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int a2 = a(stackTrace, c.class);
        if (a2 == -1 && (a2 = a(stackTrace, Log.class)) == -1) {
            return null;
        }
        return stackTrace[a2];
    }

    public static void d(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = b;
            String c2 = c(str, objArr);
            if (beaconLogger == null) {
                Log.i("beacon", c2);
            } else {
                beaconLogger.i("beacon", c2);
            }
        }
    }

    private static String e() {
        StackTraceElement d2;
        String str = "";
        if (!b() || (d2 = d()) == null) {
            return str;
        }
        String fileName = d2.getFileName();
        if (fileName != null) {
            str = fileName;
        }
        String methodName = d2.getMethodName();
        if (methodName.contains(RemoteProxyUtil.SPLIT_CHAR)) {
            methodName = methodName.substring(methodName.indexOf(RemoteProxyUtil.SPLIT_CHAR) + 1, methodName.lastIndexOf(RemoteProxyUtil.SPLIT_CHAR) - 2);
        }
        StringBuilder n = a.n("(", str, Constants.KEY_INDEX_FILE_SEPARATOR);
        n.append(d2.getLineNumber());
        n.append(")");
        n.append(methodName);
        n.append(" ");
        return n.toString();
    }

    public static void e(String str, Object... objArr) {
        if (c()) {
            BeaconLogger beaconLogger = b;
            String c2 = c(str, objArr);
            if (beaconLogger == null) {
                Log.w("beacon", c2);
            } else {
                beaconLogger.w("beacon", c2);
            }
        }
    }
}
