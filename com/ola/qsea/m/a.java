package com.ola.qsea.m;

import android.util.Log;
import com.ola.qsea.log.IObservableLog;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;

public class a {
    public static boolean a = false;
    public static boolean b = true;
    public static IObservableLog c;

    public static int a(StackTraceElement[] stackTraceElementArr, Class cls) {
        for (int i2 = 5; i2 < stackTraceElementArr.length; i2++) {
            String className = stackTraceElementArr[i2].getClassName();
            if ((!cls.equals(Log.class) || i2 >= stackTraceElementArr.length - 1 || !stackTraceElementArr[i2 + 1].getClassName().equals(Log.class.getName())) && className.equals(cls.getName())) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static void a(IObservableLog iObservableLog) {
        c = iObservableLog;
    }

    public static void a(String str, int i2, String str2, Object... objArr) {
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a()) {
            Log.e("qSea", c("Qsea-Core-Error: " + str + " " + str2, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void a(Throwable th) {
        if (th == null) {
            return;
        }
        if (a()) {
            th.printStackTrace();
        } else {
            b(th.getMessage(), new Object[0]);
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (a.class) {
            Log.i("qSea", "qSea logAble: " + z);
            a = z;
        }
    }

    public static boolean a() {
        return d();
    }

    public static StackTraceElement b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int a2 = a(stackTrace, a.class);
        if (a2 == -1 && (a2 = a(stackTrace, Log.class)) == -1) {
            return null;
        }
        return stackTrace[a2];
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a()) {
            Log.i("qSea", c("Qsea-Core-Info: " + str + " " + str2, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
    }

    public static synchronized void b(boolean z) {
        synchronized (a.class) {
            b = z;
        }
    }

    public static String c() {
        StackTraceElement b2;
        String str = "";
        if (!e() || (b2 = b()) == null) {
            return str;
        }
        String fileName = b2.getFileName();
        if (fileName != null) {
            str = fileName;
        }
        String methodName = b2.getMethodName();
        if (methodName.contains(RemoteProxyUtil.SPLIT_CHAR)) {
            methodName = methodName.substring(methodName.indexOf(RemoteProxyUtil.SPLIT_CHAR) + 1, methodName.lastIndexOf(RemoteProxyUtil.SPLIT_CHAR) - 2);
        }
        StringBuilder n = g.a.a.a.a.n("(", str, Constants.KEY_INDEX_FILE_SEPARATOR);
        n.append(b2.getLineNumber());
        n.append(")");
        n.append(methodName);
        n.append(" ");
        return n.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r4, java.lang.Object... r5) {
        /*
            java.lang.String r0 = c()
            if (r4 != 0) goto L_0x000d
            java.lang.String r4 = "msg is null"
        L_0x0008:
            java.lang.String r4 = g.a.a.a.a.w(r0, r4)
            goto L_0x0035
        L_0x000d:
            if (r5 == 0) goto L_0x0008
            int r1 = r5.length
            if (r1 != 0) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "s"
            r1[r2] = r3
            java.lang.String r2 = "is %s"
            java.lang.String.format(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = java.lang.String.format(r0, r4, r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L_0x0035:
            com.ola.qsea.log.IObservableLog r5 = c
            if (r5 == 0) goto L_0x003c
            r5.onLog(r4)
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.m.a.c(java.lang.String, java.lang.Object[]):java.lang.String");
    }

    public static void d(String str, Object... objArr) {
    }

    public static synchronized boolean d() {
        boolean z;
        synchronized (a.class) {
            z = a;
        }
        return z;
    }

    public static void e(String str, Object... objArr) {
    }

    public static synchronized boolean e() {
        boolean z;
        synchronized (a.class) {
            z = b;
        }
        return z;
    }
}
