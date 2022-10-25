package com.ola.qsea.p;

import android.text.TextUtils;
import com.ola.qsea.k.a;
import com.ola.qsea.p.f;
import com.ola.qsea.sdk.Qsea;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e {
    public static final Map<String, e> a = new ConcurrentHashMap();
    public final String b;
    public Qsea c;

    /* renamed from: d  reason: collision with root package name */
    public String f467d;

    /* renamed from: e  reason: collision with root package name */
    public long f468e;

    /* renamed from: f  reason: collision with root package name */
    public int f469f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f470g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f471h = false;

    public e(String str) {
        this.b = str;
        this.f467d = "";
        this.f468e = 0;
        this.f469f = 0;
        this.f470g = false;
        Qsea qsea = new Qsea();
        this.c = qsea;
        qsea.setAppKey(str);
    }

    public static synchronized e a(String str) {
        e eVar;
        synchronized (e.class) {
            Map<String, e> map = a;
            eVar = map.get(str);
            if (eVar == null) {
                eVar = new e(str);
                eVar.e();
                map.put(str, eVar);
            }
        }
        return eVar;
    }

    public int a() {
        return this.f469f;
    }

    public void a(int i2) {
        this.f469f = i2;
    }

    public void a(long j2) {
        this.f468e = j2;
        this.f467d = g();
        a.c(this.b).b("tt", this.f467d);
    }

    public void b(String str) {
        if (str != null && !str.isEmpty()) {
            Qsea a2 = f.b.a(str);
            this.c = a2;
            a2.setAppKey(this.b);
        }
    }

    public boolean b() {
        return this.f470g;
    }

    public Qsea c() {
        return this.c;
    }

    public String d() {
        if (this.f468e == 0) {
            this.f468e = System.currentTimeMillis();
        }
        if (TextUtils.isEmpty(this.f467d)) {
            String e2 = a.c(this.b).e("tt");
            this.f467d = e2;
            if (TextUtils.isEmpty(e2)) {
                this.f467d = g();
            }
        }
        return this.f467d + this.f468e;
    }

    public void e() {
        if (!this.f471h) {
            f();
            this.f471h = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.b     // Catch:{ all -> 0x005f }
            java.lang.String r0 = com.ola.qsea.p.p.f(r0)     // Catch:{ all -> 0x005f }
            r3.b(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r3.b     // Catch:{ all -> 0x005f }
            com.ola.qsea.r.a r0 = com.ola.qsea.r.a.a((java.lang.String) r0)     // Catch:{ all -> 0x005f }
            boolean r1 = r0.a()     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0039
            com.ola.qsea.sdk.Qsea r1 = r3.c     // Catch:{ all -> 0x005f }
            r0.a((com.ola.qsea.sdk.Qsea) r1)     // Catch:{ all -> 0x005f }
            com.ola.qsea.sdk.Qsea r0 = new com.ola.qsea.sdk.Qsea     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            r3.c = r0     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r3.b     // Catch:{ all -> 0x005f }
            r0.setAppKey(r1)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r3.b     // Catch:{ all -> 0x005f }
            com.ola.qsea.p.p.a(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r3.b     // Catch:{ all -> 0x005f }
            com.ola.qsea.k.a r0 = com.ola.qsea.k.a.c(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "is_first"
            r0.a(r1)     // Catch:{ all -> 0x005f }
            monitor-exit(r3)
            return
        L_0x0039:
            com.ola.qsea.sdk.Qsea r0 = r3.c     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.getQsea36()     // Catch:{ all -> 0x005f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r3.b     // Catch:{ all -> 0x005f }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x005f }
            com.ola.qsea.sdk.Qsea r1 = r3.c     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005f }
            r2 = 1
            r0[r2] = r1     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "QSEA"
            java.lang.String r2 = "(appKey: %s) Qsea load successfully from cache, detail: %s"
            com.ola.qsea.m.a.b(r1, r2, r0)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r3)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.p.e.f():void");
    }

    public final String g() {
        String d2 = com.ola.qsea.n.a.a(this.b).d();
        return d2 == null ? "" : com.ola.qsea.l.a.b(d2);
    }
}
