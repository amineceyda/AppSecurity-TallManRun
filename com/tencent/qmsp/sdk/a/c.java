package com.tencent.qmsp.sdk.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.app.a;
import com.tencent.qmsp.sdk.c.b;
import com.tencent.qmsp.sdk.f.e;
import java.io.File;
import java.security.MessageDigest;

public class c {
    public static int a() {
        try {
            String str = a.getContext().getPackageManager().getPackageInfo(a.getContext().getPackageName(), 0).packageName;
            ApplicationInfo applicationInfo = a.getContext().getApplicationInfo();
            if (applicationInfo.packageName.equals(str)) {
                return Integer.valueOf((int) new File(applicationInfo.publicSourceDir).length()).intValue();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static String a(int i2) {
        return String.format("%d.%d.%d", new Object[]{Integer.valueOf(i2 >> 24), Integer.valueOf((16711680 & i2) >> 16), Integer.valueOf((i2 & 65280) >> 8)});
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return e.a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String b() {
        try {
            String packageName = a.getContext().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                return packageName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c() {
        try {
            PackageInfo packageInfo = a.getContext().getPackageManager().getPackageInfo(a.getContext().getPackageName(), 0);
            if (TextUtils.isEmpty(packageInfo.versionName)) {
                return null;
            }
            return packageInfo.versionName.replaceAll("[^0-9.]", "");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String d() {
        return a(512);
    }

    public static String e() {
        try {
            return b.c;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f() {
        PackageInfo packageInfo;
        try {
            packageInfo = a.getContext().getPackageManager().getPackageInfo(a.getContext().getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr.length <= 0) {
            return "";
        }
        try {
            return e.a(MessageDigest.getInstance("MD5").digest(signatureArr[0].toByteArray()));
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static int g() {
        int parseInt;
        String str;
        try {
            String[] split = c().split("\\.");
            if (split.length == 2) {
                parseInt = (Integer.parseInt(split[0]) << 16) | 0;
                str = split[1];
            } else {
                if (split.length == 3) {
                    parseInt = (Integer.parseInt(split[0]) << 24) | 0 | (Integer.parseInt(split[1]) << 16);
                    str = split[2];
                }
                return 0;
            }
            return (Integer.parseInt(str) << 8) | parseInt;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean h() {
        String property = System.getProperty("os.arch");
        return property != null && property.contains("64");
    }
}
