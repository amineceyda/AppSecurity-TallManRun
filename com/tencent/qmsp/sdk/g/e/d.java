package com.tencent.qmsp.sdk.g.e;

import android.content.Context;
import android.util.Log;
import g.a.a.a.a;
import java.lang.reflect.Method;

public class d {
    public static String a(Context context) {
        c a = c.a();
        return a.a(context.getApplicationContext(), a.c);
    }

    public static final boolean a() {
        Context context = null;
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
            method.setAccessible(true);
            context = (Context) method.invoke((Object) null, new Object[0]);
        } catch (Exception e2) {
            StringBuilder i2 = a.i("ActivityThread:currentApplication --> ");
            i2.append(e2.toString());
            Log.e("OpenIdHelper", i2.toString());
        }
        if (context == null) {
            return false;
        }
        return c.a().a(context, false);
    }

    public static String b(Context context) {
        c a = c.a();
        return a.a(context.getApplicationContext(), a.b);
    }
}
