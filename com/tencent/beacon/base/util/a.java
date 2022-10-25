package com.tencent.beacon.base.util;

public class a {
    private static String a;

    public static String a() {
        String str = a;
        if (str != null) {
            return str;
        }
        try {
            a = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke((Object) null, new Object[0]);
            return "";
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }
}
