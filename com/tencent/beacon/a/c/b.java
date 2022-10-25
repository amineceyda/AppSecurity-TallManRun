package com.tencent.beacon.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.c;
import java.util.Date;
import java.util.List;

public class b {
    public static String a = null;
    public static int b = 0;
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f583d = false;

    /* renamed from: e  reason: collision with root package name */
    private static String f584e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f585f = false;

    /* renamed from: g  reason: collision with root package name */
    private static String f586g = "";

    /* renamed from: h  reason: collision with root package name */
    private static boolean f587h = false;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f588i = false;

    /* renamed from: j  reason: collision with root package name */
    private static int f589j = -2;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f590k = true;

    public static String a() {
        if (a == null) {
            a = e();
        }
        return a;
    }

    public static synchronized String a(Context context) {
        String str;
        synchronized (b.class) {
            if (TextUtils.isEmpty(f584e)) {
                String str2 = "on_app_first_install_time_" + c(context);
                a a2 = a.a();
                long j2 = a2.getLong(str2, 0);
                if (j2 == 0) {
                    j2 = new Date().getTime();
                    com.tencent.beacon.a.b.a.a().a((Runnable) new a(a2, str2, j2));
                }
                String valueOf = String.valueOf(j2);
                f584e = valueOf;
                c.a("[appInfo] process: %s, getAppFirstInstallTime: %s", str2, valueOf);
            }
            c.a("[appInfo] getAppFirstInstallTime: %s", f584e);
            str = f584e;
        }
        return str;
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (Long.parseLong(str) > 10000) {
                    f586g = str;
                }
            } catch (Exception unused) {
                c.e("[appInfo] set qq is not available !", new Object[0]);
            }
        } else {
            c.e("[appInfo] set qq is null !", new Object[0]);
        }
    }

    public static boolean a(Context context, String str) {
        if (f588i) {
            return f590k;
        }
        if (!(context == null || str == null || str.trim().length() <= 0)) {
            if (!com.tencent.beacon.e.b.a().i()) {
                c.a("[DeviceInfo] current collect Process Info be refused! isCollect Process Info: %s", Boolean.FALSE);
                return true;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.size() == 0) {
                c.e("[appInfo] no running proc", new Object[0]);
            } else {
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.importance == 100) {
                        for (String equals : next.pkgList) {
                            if (str.equals(equals)) {
                                f590k = true;
                                f588i = true;
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f590k = false;
                f588i = true;
                return false;
            }
        }
        return false;
    }

    public static int b(Context context) {
        if (f587h) {
            return f589j;
        }
        if (b == 0) {
            b = Process.myPid();
        }
        if (!com.tencent.beacon.e.b.a().i()) {
            c.a("[DeviceInfo] current collect Process Info be refused! isCollect Process Info: %s", Boolean.FALSE);
            return -2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || activityManager.getRunningAppProcesses() == null)) {
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.pid == b) {
                    int i2 = next.importance;
                    f589j = i2;
                    f587h = true;
                    return i2;
                }
            }
        }
        f589j = 0;
        f587h = true;
        return 0;
    }

    public static String b() {
        Context c2 = c.d().c();
        if (c2 == null) {
            return null;
        }
        String packageName = c2.getPackageName();
        return TextUtils.isEmpty(packageName) ? "" : packageName;
    }

    public static String c() {
        return f586g;
    }

    public static String c(Context context) {
        return com.tencent.beacon.base.util.a.a();
    }

    public static String d() {
        if (!"".equals(c)) {
            return c;
        }
        if (b == 0) {
            b = Process.myPid();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        c = g.a.a.a.a.e(sb, b, "_");
        String str = c + new Date().getTime();
        c = str;
        return str;
    }

    public static boolean d(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e2) {
            c.a((Throwable) e2);
            return false;
        }
    }

    public static synchronized String e() {
        synchronized (b.class) {
            String b2 = b();
            if (TextUtils.isEmpty(b2)) {
                return null;
            }
            try {
                PackageInfo packageInfo = c.d().c().getPackageManager().getPackageInfo(b2, 0);
                String str = packageInfo.versionName;
                int i2 = packageInfo.versionCode;
                if (str != null) {
                    if (str.trim().length() > 0) {
                        String replace = str.trim().replace(10, ' ').replace(13, ' ').replace("|", "%7C");
                        char[] charArray = replace.toCharArray();
                        int i3 = 0;
                        for (char c2 : charArray) {
                            if (c2 == '.') {
                                i3++;
                            }
                        }
                        if (i3 < 3) {
                            c.a("[appInfo] add versionCode: %s", Integer.valueOf(i2));
                            StringBuilder sb = new StringBuilder();
                            sb.append(replace);
                            sb.append(".");
                            sb.append(i2);
                            replace = sb.toString();
                        }
                        c.a("[appInfo] final Version: %s", replace);
                        return replace;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(i2);
                String sb3 = sb2.toString();
                return sb3;
            } catch (Throwable th) {
                c.a(th);
                c.b(th.toString(), new Object[0]);
                return "";
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean e(android.content.Context r5) {
        /*
            java.lang.Class<com.tencent.beacon.a.c.b> r0 = com.tencent.beacon.a.c.b.class
            monitor-enter(r0)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "[appInfo] context is null"
            com.tencent.beacon.base.util.c.b(r2, r5)     // Catch:{ all -> 0x003d }
            monitor-exit(r0)
            return r1
        L_0x000f:
            com.tencent.beacon.a.d.a r5 = com.tencent.beacon.a.d.a.a()     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "APPVER_DENGTA"
            java.lang.String r3 = ""
            java.lang.String r2 = r5.getString(r2, r3)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = a()     // Catch:{ all -> 0x003d }
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x002b
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x003b
        L_0x002b:
            r1 = 1
            com.tencent.beacon.a.d.a$a r5 = r5.edit()     // Catch:{ all -> 0x003d }
            boolean r2 = com.tencent.beacon.base.util.b.a((android.content.SharedPreferences.Editor) r5)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "APPVER_DENGTA"
            r5.putString(r2, r3)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)
            return r1
        L_0x003d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.b.e(android.content.Context):boolean");
    }

    public static void f() {
        h();
    }

    public static boolean f(Context context) {
        return a(context, context.getPackageName());
    }

    public static synchronized boolean g() {
        boolean z;
        synchronized (b.class) {
            z = false;
            a a2 = a.a();
            String string = a2.getString("APPKEY_DENGTA", "");
            String f2 = c.d().f();
            if (TextUtils.isEmpty(string) || !f2.equals(string)) {
                z = true;
                a.C0005a edit = a2.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString("APPKEY_DENGTA", f2);
                }
            }
        }
        return z;
    }

    public static boolean g(Context context) {
        if (context == null) {
            return true;
        }
        String c2 = c(context);
        return TextUtils.isEmpty(c2) || c2.equals(context.getPackageName());
    }

    private static void h() {
        try {
            a a2 = a.a();
            String string = a2.getString("APPVER_DENGTA", "");
            String a3 = a();
            if (TextUtils.isEmpty(string) || !a3.equals(string)) {
                f585f = true;
                a.C0005a edit = a2.edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString("APPVER_DENGTA", a3);
                    return;
                }
                return;
            }
            f585f = false;
        } catch (Exception e2) {
            c.b("[core] app version check fail!", new Object[0]);
            c.a((Throwable) e2);
        }
    }
}
