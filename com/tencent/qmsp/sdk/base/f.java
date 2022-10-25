package com.tencent.qmsp.sdk.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

public class f {
    private static Context a;

    public static Context a() {
        Context context;
        synchronized (f.class) {
            if (a == null) {
                a = b();
            }
            context = a;
        }
        return context;
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                if (!TextUtils.isEmpty(applicationInfo.packageName)) {
                    return applicationInfo.packageName;
                }
            }
            return a().getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static Context b() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
