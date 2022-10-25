package com.ola.qsea.d;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.ola.qsea.l.f;
import com.ola.qsea.v.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    public static String a;
    public static Map<String, Boolean> b = new HashMap();
    public static String c = null;

    public static String a() {
        if (a == null) {
            a = d();
        }
        return a;
    }

    public static String a(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke((Object) null, new Object[0]);
            c = str2;
            return str2;
        } catch (Throwable th) {
            com.ola.qsea.m.a.a(th);
            return "";
        }
    }

    public static void a(String str) {
        b(str);
        com.ola.qsea.m.a.b("SDK_INIT ｜ AppInfo", " initialization has been completed", new Object[0]);
    }

    public static boolean a(Context context, String str) {
        if (!(context == null || str == null || str.trim().length() <= 0)) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.size() == 0) {
                com.ola.qsea.m.a.e("[appInfo] no running proc", new Object[0]);
            } else {
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (next.importance == 100) {
                        for (String equals : next.pkgList) {
                            if (str.equals(equals)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static long b() {
        Context F = d.b().F();
        if (F == null) {
            return 0;
        }
        try {
            return F.getPackageManager().getPackageInfo(F.getPackageName(), 0).firstInstallTime;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static void b(String str) {
        try {
            String e2 = com.ola.qsea.k.a.c(str).e("A_V");
            String a2 = a();
            if (TextUtils.isEmpty(e2) || !a2.equals(e2)) {
                b.put(str, Boolean.TRUE);
                com.ola.qsea.k.a.c(str).b("A_V", a2);
                com.ola.qsea.m.a.b("SDK_INIT ｜ QSEA", "App is a new version", new Object[0]);
                return;
            }
            b.put(str, Boolean.FALSE);
        } catch (Exception e3) {
            com.ola.qsea.m.a.b("[core] app version check fail!", new Object[0]);
            com.ola.qsea.m.a.a((Throwable) e3);
        }
    }

    public static boolean b(Context context) {
        return a(context, context.getPackageName());
    }

    public static String c() {
        Context F = d.b().F();
        String packageName = F != null ? F.getPackageName() : null;
        return TextUtils.isEmpty(packageName) ? "" : packageName;
    }

    public static boolean c(String str) {
        Boolean bool = b.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static synchronized String d() {
        synchronized (a.class) {
            String c2 = c();
            if (TextUtils.isEmpty(c2)) {
                return "";
            }
            try {
                PackageInfo packageInfo = d.b().F().getPackageManager().getPackageInfo(c2, 0);
                String str = packageInfo.versionName;
                int i2 = packageInfo.versionCode;
                if (str != null) {
                    if (str.trim().length() > 0) {
                        String replace = str.trim().replace(10, ' ').replace(13, ' ').replace("|", "%7C");
                        char[] charArray = replace.toCharArray();
                        int i3 = 0;
                        for (char c3 : charArray) {
                            if (c3 == '.') {
                                i3++;
                            }
                        }
                        if (i3 < 3) {
                            com.ola.qsea.m.a.a("[appInfo] add versionCode: %s", Integer.valueOf(i2));
                            StringBuilder sb = new StringBuilder();
                            sb.append(replace);
                            sb.append(".");
                            sb.append(i2);
                            replace = sb.toString();
                        }
                        com.ola.qsea.m.a.a("[appInfo] final Version: %s", replace);
                        return replace;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(i2);
                String sb3 = sb2.toString();
                return sb3;
            } catch (Exception e2) {
                com.ola.qsea.m.a.a((Throwable) e2);
                com.ola.qsea.m.a.b(e2.toString(), new Object[0]);
                return "";
            }
        }
    }

    public static void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            a = str;
        }
    }

    public static String e() {
        Context F = d.b().F();
        return F == null ? "" : (String) f.a(ApplicationInfo.class.getName(), F.getApplicationInfo(), "nativeLibraryDir");
    }

    public static String f() {
        Context F = d.b().F();
        return F == null ? "" : (String) f.a(ApplicationInfo.class.getName(), F.getApplicationInfo(), "primaryCpuAbi");
    }

    public static boolean g() {
        Context F = d.b().F();
        if (F == null) {
            return false;
        }
        String a2 = a(F);
        return TextUtils.isEmpty(a2) || a2.equals(F.getPackageName());
    }
}
