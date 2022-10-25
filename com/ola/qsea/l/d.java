package com.ola.qsea.l;

import android.content.Context;
import android.os.Build;
import com.ola.qsea.d.a;

public class d {
    public static int a(String str, String[] strArr) {
        if (strArr.length < 5) {
            return 0;
        }
        String str2 = strArr[3];
        String str3 = strArr[4];
        if (!a(str2) || str2.equals("0")) {
            return !str3.equals(str) ? 2 : 0;
        }
        return 1;
    }

    public static String a(Context context) {
        if (context == null) {
            return "0";
        }
        String c = a.c();
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String[] split = absolutePath.split("/");
        int b = Build.VERSION.SDK_INT < 23 ? b(c, split) : a(c, split);
        com.ola.qsea.m.a.b("MultiUser", "userType: %s package: %s file: %s", Integer.valueOf(b), c, absolutePath);
        return String.valueOf(b);
    }

    public static boolean a(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(String str, String[] strArr) {
        if (strArr.length < 4) {
            return 0;
        }
        String str2 = strArr[3];
        if (str2.equals(str)) {
            return 0;
        }
        return (!a(str2) || str2.equals("0")) ? 2 : 1;
    }
}
