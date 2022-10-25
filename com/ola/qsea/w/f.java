package com.ola.qsea.w;

import android.annotation.SuppressLint;
import android.content.Context;
import com.ola.qsea.h.b;
import com.ola.qsea.h.c;
import com.ola.qsea.m.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class f {
    public static final Map<String, f> a = new ConcurrentHashMap();
    public static final Object b = new Object();
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public j f508d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f509e = false;

    public f(String str) {
        this.c = str;
        this.f508d = new j(this, str);
    }

    public static synchronized f a(String str) {
        f fVar;
        synchronized (f.class) {
            Map<String, f> map = a;
            fVar = map.get(str);
            if (fVar == null) {
                fVar = new f(str);
                map.put(str, fVar);
            }
        }
        return fVar;
    }

    @SuppressLint({"MissingPermission"})
    public void a(Context context, k kVar) {
        this.f508d.a(kVar);
        this.f508d.c();
        a.b("QSEA", "Start executing Strategy request task, appKey: %s)", this.c);
        if (com.ola.qsea.j.a.b()) {
            d();
        } else {
            a.b("QSEA", "No network, cancel Strategy request. appKey: %s", this.c);
        }
        b.a().a(this.c, (c) new e(this));
        a.b("SDK_INIT ｜ STRATEGY", " initialization completed ", new Object[0]);
    }

    public void a(boolean z) {
        synchronized (b) {
            this.f509e = z;
        }
    }

    public boolean a() {
        boolean z;
        synchronized (b) {
            z = this.f509e;
        }
        return z;
    }

    public final boolean b() {
        return com.ola.qsea.l.c.a(com.ola.qsea.k.a.c(this.c).d("s_s_t"));
    }

    public void c() {
        com.ola.qsea.c.a.a().a(this.f508d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.ola.qsea.d.a.g()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            boolean r0 = r3.b()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0016
            com.ola.qsea.w.j r0 = r3.f508d     // Catch:{ all -> 0x0033 }
            r0.a()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)
            return
        L_0x0016:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "SDK_INIT ｜ STRATEGY"
            java.lang.String r2 = "It is more than 24 hours since the last request for Strategy"
            com.ola.qsea.m.a.b(r1, r2, r0)     // Catch:{ all -> 0x0033 }
            com.ola.qsea.w.j r0 = r3.f508d     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0031
            com.ola.qsea.c.a r0 = com.ola.qsea.c.a.a()     // Catch:{ all -> 0x0033 }
            com.ola.qsea.w.j r1 = r3.f508d     // Catch:{ all -> 0x0033 }
            r0.a(r1)     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r3)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.w.f.d():void");
    }
}
