package com.ola.qsea.p;

import android.content.Context;
import com.ola.qsea.l.i;
import com.ola.qsea.w.b;
import com.ola.qsea.w.k;
import java.util.concurrent.TimeUnit;

public class c implements k {
    public static final String a = "com.ola.qsea.p.c";
    public i b = new i(new Object(), 100);
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public Context f459d;

    /* renamed from: e  reason: collision with root package name */
    public String f460e = "0";

    /* renamed from: f  reason: collision with root package name */
    public String f461f = "0";

    /* renamed from: g  reason: collision with root package name */
    public a f462g;

    /* renamed from: h  reason: collision with root package name */
    public b f463h;

    /* renamed from: i  reason: collision with root package name */
    public com.ola.qsea.h.c f464i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f465j = new a(this);

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f466k = new b(this);

    public interface a {
        void d();
    }

    public c(String str, Context context, a aVar, com.ola.qsea.y.b bVar, com.ola.qsea.h.c cVar) {
        this.c = str;
        this.f459d = context;
        this.f462g = aVar;
        this.f463h = bVar;
        this.f464i = cVar;
    }

    public void a() {
    }

    public final void a(int i2) {
        try {
            TimeUnit.SECONDS.sleep((long) i2);
        } catch (InterruptedException e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
        }
    }

    public void c() {
        com.ola.qsea.c.a.a().a(this.f465j);
        com.ola.qsea.c.a.a().a(this.f466k);
    }
}
