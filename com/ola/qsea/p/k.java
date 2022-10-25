package com.ola.qsea.p;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ola.qsea.o.c;
import com.ola.qsea.p.f;
import com.ola.qsea.sdk.Qsea;
import com.ola.qsea.sdk.QseaSDK;
import com.ola.qsea.w.d;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class k implements Runnable {
    public static final Map<String, k> a = new ConcurrentHashMap();
    public static final Random b = new Random(System.currentTimeMillis());
    public AtomicInteger c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    public long f485d = 0;

    /* renamed from: e  reason: collision with root package name */
    public b f486e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f487f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public long f488g;

    /* renamed from: h  reason: collision with root package name */
    public long f489h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f490i = false;

    /* renamed from: j  reason: collision with root package name */
    public String f491j = "";

    /* renamed from: k  reason: collision with root package name */
    public a f492k = new a(3, new g(this));

    public static class a {
        public final int a;
        public final C0002a b;
        public AtomicInteger c = new AtomicInteger();

        /* renamed from: com.ola.qsea.p.k$a$a  reason: collision with other inner class name */
        public interface C0002a {
            void a();
        }

        public a(int i2, C0002a aVar) {
            this.a = i2;
            this.b = aVar;
        }

        public boolean a() {
            return this.c.get() >= this.a - 1;
        }

        public boolean b() {
            this.c.getAndIncrement();
            boolean z = this.c.get() >= this.a;
            if (z) {
                c();
                C0002a aVar = this.b;
                if (aVar != null) {
                    aVar.a();
                }
            }
            return z;
        }

        public void c() {
            this.c.set(0);
        }
    }

    public interface b {
        long c();
    }

    public k(String str) {
        this.f491j = str;
    }

    public static synchronized k a(String str, b bVar) {
        k kVar;
        synchronized (k.class) {
            Map<String, k> map = a;
            kVar = map.get(str);
            if (kVar == null) {
                kVar = new k(str);
                kVar.f486e = bVar;
                map.put(str, kVar);
            }
        }
        return kVar;
    }

    public final String a(String str, String str2) {
        return com.ola.qsea.a.a.c(f.b.KEY_DATA.a(str2, new f.b[0]), str);
    }

    public void a() {
        this.f487f.set(false);
    }

    public final void a(Qsea qsea, Qsea qsea2, boolean z) {
        if (qsea != null && !qsea.isEmpty()) {
            String a2 = qsea.a();
            String b2 = qsea.b();
            if (a2 != null && b2 != null) {
                if (a2.isEmpty() || !b2.isEmpty()) {
                    String a3 = qsea2.a();
                    String b3 = qsea2.b();
                    if (!a3.isEmpty() && b3.isEmpty()) {
                        return;
                    }
                    if (!a2.equals(a3) || !b2.equals(b3)) {
                        c.a(this.f491j, a2, b2, a3, b3, z);
                    }
                }
            }
        }
    }

    public final void a(String str) {
        Qsea c2 = e.a(this.f491j).c();
        if (c2 == null || c2.isEmpty()) {
            c.a(this.f491j, str);
        }
    }

    public final void a(String str, int i2, String str2) {
        com.ola.qsea.m.a.a(QseaSDK.TAG, 1, "onFailure msg: %s,%d,%s. Waiting next query.", str, Integer.valueOf(i2), str2);
        if (this.f492k.a()) {
            c.a(this.f491j, str, i2, str2);
        }
        e();
    }

    public final String b() {
        return this.f490i ? d.a(this.f491j).r() : "";
    }

    public final void b(String str, String str2) {
        String b2 = com.ola.qsea.g.b.KEY_CODE.a(str).b(this.f491j);
        if (!b2.equals("0")) {
            e();
            return;
        }
        String a2 = a(str2, str);
        com.ola.qsea.m.a.b("QSEA", "appKey is %s, Qsea response data decryption result: %s", this.f491j, a2);
        if (a2 == null || a2.isEmpty()) {
            c.a(this.f491j, str2, str);
            e();
            return;
        }
        e a3 = e.a(this.f491j);
        Qsea c2 = a3.c();
        a3.b(a2);
        a(c2, a3.c(), a3.b());
        a(b2);
        Qsea c3 = a3.c();
        if (c3 != null && !c3.isEmpty()) {
            d();
            p.a(this.f491j, a2);
            a3.a(this.f485d);
        }
        a();
    }

    public boolean c() {
        return this.f487f.get();
    }

    public final void d() {
        com.ola.qsea.c.a.a().a(new j(this));
    }

    public final void e() {
        com.ola.qsea.m.a.b("QSEA", "Qsea request failed, appKey is %s", this.f491j);
        a();
        if (this.f490i) {
            this.f490i = false;
        } else if (!this.f492k.b()) {
            com.ola.qsea.c.a.a().a(10000, this);
        }
    }

    public final void f() {
        com.ola.qsea.c.a.a().a(300, new i(this));
    }

    public final void g() {
        if (!com.ola.qsea.t.c.a(this.f491j)) {
            com.ola.qsea.m.a.b("UPLOAD", "QSEA performance report blocked", new Object[0]);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = uptimeMillis - this.f489h;
        long j3 = uptimeMillis - this.f488g;
        long j4 = com.ola.qsea.d.c.n().c;
        long j5 = 0;
        b bVar = this.f486e;
        if (bVar != null) {
            j5 = bVar.c();
        }
        long j6 = j5;
        c.a(this.f491j, j2, j3, j4, j6);
        com.ola.qsea.m.a.b("QSEA", "QSEA performance report, appKey is %s, %d %d %d %d", this.f491j, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j6));
    }

    @SuppressLint({"MissingPermission"})
    public void run() {
        if (c()) {
            com.ola.qsea.m.a.b("QSEA", "QSEA is requesting,this request be cancelled. appKey is %s", this.f491j);
            return;
        }
        this.f487f.set(true);
        com.ola.qsea.m.a.b("QSEA", "start to execute the QSEA request task, appKey is %s ", this.f491j);
        if (!com.ola.qsea.j.a.b()) {
            com.ola.qsea.m.a.b("QSEA", "no network,cancel QSEA request. appKey is %s", this.f491j);
            a();
        } else if (!com.ola.qsea.d.a.g()) {
            f();
            a();
        } else {
            this.f488g = SystemClock.uptimeMillis();
            f a2 = f.a();
            String a3 = com.ola.qsea.l.a.a();
            String a4 = a2.a(d.a(this.f491j).B(), b());
            Qsea c2 = e.a(this.f491j).c();
            this.f485d = System.currentTimeMillis();
            String str = a3;
            String a5 = a2.a(str, this.f491j, c2, this.f485d, p.d(this.f491j));
            if (TextUtils.isEmpty(a5)) {
                com.ola.qsea.m.a.b("QSEA", "get parameter error,cancel QSEA request. appKey is %s", this.f491j);
                a();
                return;
            }
            this.f489h = SystemClock.uptimeMillis();
            com.ola.qsea.e.b.b(a4, a5, new h(this, a3));
            com.ola.qsea.m.a.b("QSEA", "start requesting QSEA, appKey is %s, url is %s", this.f491j, a4);
        }
    }
}
