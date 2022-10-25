package com.tencent.qmsp.sdk.g.j;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;
import com.tencent.qmsp.sdk.base.c;
import java.lang.reflect.Method;

public class a implements b {
    private static Class b;
    private static Object c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f909d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f910e;
    private Context a;

    public a() {
        try {
            c.c("xm start");
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            b = cls;
            c = cls.newInstance();
            f909d = b.getMethod("getOAID", new Class[]{Context.class});
            f910e = b.getMethod("getAAID", new Class[]{Context.class});
        } catch (Exception e2) {
            c.a("xm reflect exception!" + e2);
        }
    }

    private String a(Context context, Object obj, Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, new Object[]{context});
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String a() {
        Method method;
        Object obj = c;
        if (obj == null || (method = f909d) == null) {
            return null;
        }
        return a(this.a, obj, method);
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = context;
    }

    public String b() {
        Method method;
        Object obj = c;
        if (obj == null || (method = f910e) == null) {
            return null;
        }
        return a(this.a, obj, method);
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return (b == null || c == null) ? false : true;
    }

    public void f() {
    }
}
