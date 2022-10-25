package com.ola.qsea.w;

import com.ola.qsea.a.a;
import com.ola.qsea.g.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class j implements Runnable {
    public final String a;
    public volatile AtomicBoolean b = new AtomicBoolean(false);
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public k f510d;

    public j(f fVar, String str) {
        this.c = fVar;
        this.a = str;
        this.f510d = null;
    }

    public final String a(String str, String str2) {
        return a.c(b.KEY_DATA.a(str).b(this.a), str2);
    }

    public void a() {
        k kVar = this.f510d;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void a(k kVar) {
        this.f510d = kVar;
    }

    public final void a(String str) {
        com.ola.qsea.k.a.c(str).a("s_s_t", System.currentTimeMillis());
    }

    public final void a(String str, int i2, String str2) {
        d();
    }

    public void a(String str, boolean z) {
        try {
            g.a(this.a, str);
            h();
            if (z) {
                com.ola.qsea.k.a.c(this.a).a("s_d", str);
                StringBuilder sb = new StringBuilder();
                sb.append(com.ola.qsea.x.a.a().b());
                sb.append(" | save strategy: ");
                sb.append(str);
                com.ola.qsea.m.a.d(sb.toString(), new Object[0]);
                a(this.a);
            }
        } catch (Throwable th) {
            com.ola.qsea.m.a.a(th);
            com.ola.qsea.m.a.b("[strategy] error to common strategy!", new Object[0]);
        }
    }

    public final void b(String str, String str2) {
        try {
            String b2 = b.KEY_CODE.a(str).b(this.a);
            if (!b2.equals("0")) {
                if (b2.equals("304")) {
                    a(this.a);
                }
                d();
                return;
            }
            a(a(str, str2), true);
            this.c.a(true);
            d();
        } catch (Throwable th) {
            com.ola.qsea.m.a.a(th);
            com.ola.qsea.m.a.b("[strategy] error to response Success!", new Object[0]);
        }
    }

    public boolean b() {
        return this.b.get();
    }

    public void c() {
        try {
            String b2 = com.ola.qsea.k.a.c(this.a).b("s_d");
            StringBuilder sb = new StringBuilder();
            sb.append(com.ola.qsea.x.a.a().b());
            sb.append(" | load strategy: ");
            sb.append(b2);
            com.ola.qsea.m.a.d(sb.toString(), new Object[0]);
            if (b2 != null) {
                a(b2, false);
            } else {
                com.ola.qsea.m.a.a("[strategy] local strategy is null!", new Object[0]);
            }
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
        } catch (Throwable th) {
            e();
            throw th;
        }
        e();
    }

    public final void d() {
        f();
        a();
        this.b.set(false);
    }

    public final void e() {
        com.ola.qsea.m.a.a("local strategyQuery finish!", new Object[0]);
    }

    public final void f() {
        long convert = TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS);
        com.ola.qsea.c.a.a().a(convert, this);
        com.ola.qsea.m.a.a("[strategy] next time: %d", Long.valueOf(convert));
    }

    public final void g() {
        com.ola.qsea.x.a a2 = com.ola.qsea.x.a.a();
        String a3 = com.ola.qsea.l.a.a();
        com.ola.qsea.e.b.b(a2.a(d.a(this.a).B()), a2.a(a3, this.a), new i(this, a3));
    }

    public final void h() {
        String str = this.a;
        d.a(this.a, new h(str, d.a(str)));
    }

    public void run() {
        this.b.set(true);
        g();
    }
}
