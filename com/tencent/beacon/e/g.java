package com.tencent.beacon.e;

import android.content.Context;
import android.util.Base64;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.base.util.b;
import java.util.Date;

public class g {
    private static volatile g a;
    private final String b = "sid";
    /* access modifiers changed from: private */
    public final Context c = c.d().c();

    /* renamed from: d  reason: collision with root package name */
    private c f673d;

    /* renamed from: e  reason: collision with root package name */
    private String f674e = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f675f = true;

    /* renamed from: g  reason: collision with root package name */
    private int f676g = 8081;

    /* renamed from: h  reason: collision with root package name */
    private String f677h = "";

    /* renamed from: i  reason: collision with root package name */
    private String f678i = "";

    private g() {
        a.a().a((Runnable) new e(this));
    }

    public static g b() {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new g();
                }
            }
        }
        return a;
    }

    public synchronized String a() {
        return this.f678i;
    }

    public synchronized void a(Context context) {
        com.tencent.beacon.a.d.a a2 = com.tencent.beacon.a.d.a.a();
        String string = a2.getString("sid_value", "");
        if (a2.getLong("sid_mt", 0) > new Date().getTime() / 1000) {
            a(string);
        }
        a(context, b.b());
    }

    public synchronized void a(Context context, String str) {
        this.f678i = str;
        byte[] a2 = com.tencent.beacon.base.net.b.c.a(context, str);
        if (a2 != null) {
            this.f677h = Base64.encodeToString(a2, 2);
        }
    }

    public void a(c cVar) {
        this.f673d = cVar;
    }

    public synchronized void a(String str) {
        this.f674e = str;
    }

    public synchronized void a(String str, String str2) {
        com.tencent.beacon.base.util.c.a("[net] -> update local sid|time[%s|%s].", str, str2);
        this.f674e = str;
        a.a().a((Runnable) new f(this, str2, str));
    }

    public synchronized String c() {
        return this.f674e;
    }

    public synchronized String d() {
        return this.f677h;
    }
}
