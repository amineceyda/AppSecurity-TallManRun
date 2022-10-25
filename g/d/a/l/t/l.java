package g.d.a.l.t;

import android.os.SystemClock;
import android.util.Log;
import g.d.a.l.n;
import g.d.a.l.r;
import g.d.a.l.t.a;
import g.d.a.l.t.c0.a;
import g.d.a.l.t.c0.e;
import g.d.a.l.t.c0.f;
import g.d.a.l.t.c0.h;
import g.d.a.l.t.c0.i;
import g.d.a.l.t.i;
import g.d.a.l.t.q;
import g.d.a.p.g;
import g.d.a.r.k.a;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class l implements n, i.a, q.a {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f2495i = Log.isLoggable("Engine", 2);
    public final s a;
    public final p b;
    public final i c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2496d;

    /* renamed from: e  reason: collision with root package name */
    public final y f2497e;

    /* renamed from: f  reason: collision with root package name */
    public final c f2498f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2499g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2500h;

    public static class a {
        public final i.d a;
        public final e.e.i.c<i<?>> b = g.d.a.r.k.a.a(150, new C0087a());
        public int c;

        /* renamed from: g.d.a.l.t.l$a$a  reason: collision with other inner class name */
        public class C0087a implements a.b<i<?>> {
            public C0087a() {
            }

            public Object a() {
                a aVar = a.this;
                return new i(aVar.a, aVar.b);
            }
        }

        public a(i.d dVar) {
            this.a = dVar;
        }
    }

    public static class b {
        public final g.d.a.l.t.d0.a a;
        public final g.d.a.l.t.d0.a b;
        public final g.d.a.l.t.d0.a c;

        /* renamed from: d  reason: collision with root package name */
        public final g.d.a.l.t.d0.a f2501d;

        /* renamed from: e  reason: collision with root package name */
        public final n f2502e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f2503f;

        /* renamed from: g  reason: collision with root package name */
        public final e.e.i.c<m<?>> f2504g = g.d.a.r.k.a.a(150, new a());

        public class a implements a.b<m<?>> {
            public a() {
            }

            public Object a() {
                b bVar = b.this;
                return new m(bVar.a, bVar.b, bVar.c, bVar.f2501d, bVar.f2502e, bVar.f2503f, bVar.f2504g);
            }
        }

        public b(g.d.a.l.t.d0.a aVar, g.d.a.l.t.d0.a aVar2, g.d.a.l.t.d0.a aVar3, g.d.a.l.t.d0.a aVar4, n nVar, q.a aVar5) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.f2501d = aVar4;
            this.f2502e = nVar;
            this.f2503f = aVar5;
        }
    }

    public static class c implements i.d {
        public final a.C0083a a;
        public volatile g.d.a.l.t.c0.a b;

        public c(a.C0083a aVar) {
            this.a = aVar;
        }

        public g.d.a.l.t.c0.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        g.d.a.l.t.c0.d dVar = (g.d.a.l.t.c0.d) this.a;
                        f fVar = (f) dVar.b;
                        File cacheDir = fVar.a.getCacheDir();
                        e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.b != null) {
                            cacheDir = new File(cacheDir, fVar.b);
                        }
                        if (cacheDir != null) {
                            if (!cacheDir.mkdirs()) {
                                if (cacheDir.exists()) {
                                    if (!cacheDir.isDirectory()) {
                                    }
                                }
                            }
                            eVar = new e(cacheDir, dVar.a);
                        }
                        this.b = eVar;
                    }
                    if (this.b == null) {
                        this.b = new g.d.a.l.t.c0.b();
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        public final m<?> a;
        public final g.d.a.p.f b;

        public d(g.d.a.p.f fVar, m<?> mVar) {
            this.b = fVar;
            this.a = mVar;
        }
    }

    public l(g.d.a.l.t.c0.i iVar, a.C0083a aVar, g.d.a.l.t.d0.a aVar2, g.d.a.l.t.d0.a aVar3, g.d.a.l.t.d0.a aVar4, g.d.a.l.t.d0.a aVar5, boolean z) {
        this.c = iVar;
        c cVar = new c(aVar);
        this.f2498f = cVar;
        a aVar6 = new a(z);
        this.f2500h = aVar6;
        synchronized (this) {
            synchronized (aVar6) {
                aVar6.f2429d = this;
            }
        }
        this.b = new p();
        this.a = new s();
        this.f2496d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f2499g = new a(cVar);
        this.f2497e = new y();
        ((h) iVar).f2453d = this;
    }

    public static void d(String str, long j2, g.d.a.l.l lVar) {
        StringBuilder l2 = g.a.a.a.a.l(str, " in ");
        l2.append(g.d.a.r.f.a(j2));
        l2.append("ms, key: ");
        l2.append(lVar);
        Log.v("Engine", l2.toString());
    }

    public void a(g.d.a.l.l lVar, q<?> qVar) {
        a aVar = this.f2500h;
        synchronized (aVar) {
            a.b remove = aVar.b.remove(lVar);
            if (remove != null) {
                remove.c = null;
                remove.clear();
            }
        }
        if (qVar.b) {
            v vVar = (v) ((h) this.c).d(lVar, qVar);
        } else {
            this.f2497e.a(qVar, false);
        }
    }

    public <R> d b(g.d.a.d dVar, Object obj, g.d.a.l.l lVar, int i2, int i3, Class<?> cls, Class<R> cls2, g.d.a.e eVar, k kVar, Map<Class<?>, r<?>> map, boolean z, boolean z2, n nVar, boolean z3, boolean z4, boolean z5, boolean z6, g.d.a.p.f fVar, Executor executor) {
        long j2;
        if (f2495i) {
            int i4 = g.d.a.r.f.b;
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        long j3 = j2;
        Objects.requireNonNull(this.b);
        o oVar = new o(obj, lVar, i2, i3, map, cls, cls2, nVar);
        synchronized (this) {
            q<?> c2 = c(oVar, z3, j3);
            if (c2 == null) {
                d g2 = g(dVar, obj, lVar, i2, i3, cls, cls2, eVar, kVar, map, z, z2, nVar, z3, z4, z5, z6, fVar, executor, oVar, j3);
                return g2;
            }
            ((g) fVar).p(c2, g.d.a.l.a.MEMORY_CACHE);
            return null;
        }
    }

    public final q<?> c(o oVar, boolean z, long j2) {
        q<?> qVar;
        Y remove;
        q<?> qVar2;
        if (!z) {
            return null;
        }
        a aVar = this.f2500h;
        synchronized (aVar) {
            a.b bVar = aVar.b.get(oVar);
            if (bVar == null) {
                qVar = null;
            } else {
                qVar = (q) bVar.get();
                if (qVar == null) {
                    aVar.b(bVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f2495i) {
                d("Loaded resource from active resources", j2, oVar);
            }
            return qVar;
        }
        h hVar = (h) this.c;
        synchronized (hVar) {
            remove = hVar.a.remove(oVar);
            if (remove != null) {
                hVar.c -= (long) hVar.b(remove);
            }
        }
        v vVar = (v) remove;
        if (vVar == null) {
            qVar2 = null;
        } else {
            qVar2 = vVar instanceof q ? (q) vVar : new q<>(vVar, true, true, oVar, this);
        }
        if (qVar2 != null) {
            qVar2.a();
            this.f2500h.a(oVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f2495i) {
            d("Loaded resource from cache", j2, oVar);
        }
        return qVar2;
    }

    public synchronized void e(m<?> mVar, g.d.a.l.l lVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.b) {
                this.f2500h.a(lVar, qVar);
            }
        }
        s sVar = this.a;
        Objects.requireNonNull(sVar);
        Map<g.d.a.l.l, m<?>> a2 = sVar.a(mVar.q);
        if (mVar.equals(a2.get(lVar))) {
            a2.remove(lVar);
        }
    }

    public void f(v<?> vVar) {
        if (vVar instanceof q) {
            ((q) vVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> g.d.a.l.t.l.d g(g.d.a.d r17, java.lang.Object r18, g.d.a.l.l r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, g.d.a.e r24, g.d.a.l.t.k r25, java.util.Map<java.lang.Class<?>, g.d.a.l.r<?>> r26, boolean r27, boolean r28, g.d.a.l.n r29, boolean r30, boolean r31, boolean r32, boolean r33, g.d.a.p.f r34, java.util.concurrent.Executor r35, g.d.a.l.t.o r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            g.d.a.l.t.s r15 = r1.a
            if (r9 == 0) goto L_0x0023
            java.util.Map<g.d.a.l.l, g.d.a.l.t.m<?>> r15 = r15.b
            goto L_0x0025
        L_0x0023:
            java.util.Map<g.d.a.l.l, g.d.a.l.t.m<?>> r15 = r15.a
        L_0x0025:
            java.lang.Object r15 = r15.get(r12)
            g.d.a.l.t.m r15 = (g.d.a.l.t.m) r15
            if (r15 == 0) goto L_0x003f
            r15.a(r10, r11)
            boolean r0 = f2495i
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "Added to existing load"
            d(r0, r13, r12)
        L_0x0039:
            g.d.a.l.t.l$d r0 = new g.d.a.l.t.l$d
            r0.<init>(r10, r15)
            return r0
        L_0x003f:
            g.d.a.l.t.l$b r15 = r1.f2496d
            e.e.i.c<g.d.a.l.t.m<?>> r15 = r15.f2504g
            java.lang.Object r15 = r15.b()
            g.d.a.l.t.m r15 = (g.d.a.l.t.m) r15
            java.lang.String r13 = "Argument must not be null"
            java.util.Objects.requireNonNull(r15, r13)
            monitor-enter(r15)
            r15.f2514m = r12     // Catch:{ all -> 0x0116 }
            r13 = r30
            r15.n = r13     // Catch:{ all -> 0x0116 }
            r13 = r31
            r15.o = r13     // Catch:{ all -> 0x0116 }
            r13 = r32
            r15.p = r13     // Catch:{ all -> 0x0116 }
            r15.q = r9     // Catch:{ all -> 0x0116 }
            monitor-exit(r15)
            g.d.a.l.t.l$a r13 = r1.f2499g
            e.e.i.c<g.d.a.l.t.i<?>> r14 = r13.b
            java.lang.Object r14 = r14.b()
            g.d.a.l.t.i r14 = (g.d.a.l.t.i) r14
            java.lang.String r10 = "Argument must not be null"
            java.util.Objects.requireNonNull(r14, r10)
            int r10 = r13.c
            int r11 = r10 + 1
            r13.c = r11
            g.d.a.l.t.h<R> r11 = r14.b
            g.d.a.l.t.i$d r13 = r14.f2476e
            r11.c = r0
            r11.f2465d = r2
            r11.n = r3
            r11.f2466e = r4
            r11.f2467f = r5
            r11.p = r7
            r1 = r22
            r11.f2468g = r1
            r11.f2469h = r13
            r1 = r23
            r11.f2472k = r1
            r11.o = r6
            r11.f2470i = r8
            r1 = r26
            r11.f2471j = r1
            r1 = r27
            r11.q = r1
            r1 = r28
            r11.r = r1
            r14.f2480i = r0
            r14.f2481j = r3
            r14.f2482k = r6
            r14.f2483l = r12
            r14.f2484m = r4
            r14.n = r5
            r14.o = r7
            r14.v = r9
            r14.p = r8
            r14.q = r15
            r14.r = r10
            g.d.a.l.t.i$f r0 = g.d.a.l.t.i.f.INITIALIZE
            r14.t = r0
            r14.w = r2
            r1 = r16
            g.d.a.l.t.s r0 = r1.a
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r15.q
            java.util.Map r0 = r0.a(r2)
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.a(r0, r2)
            monitor-enter(r15)
            r15.x = r14     // Catch:{ all -> 0x0113 }
            g.d.a.l.t.i$g r2 = g.d.a.l.t.i.g.INITIALIZE     // Catch:{ all -> 0x0113 }
            g.d.a.l.t.i$g r2 = r14.l(r2)     // Catch:{ all -> 0x0113 }
            g.d.a.l.t.i$g r3 = g.d.a.l.t.i.g.RESOURCE_CACHE     // Catch:{ all -> 0x0113 }
            if (r2 == r3) goto L_0x00e6
            g.d.a.l.t.i$g r3 = g.d.a.l.t.i.g.DATA_CACHE     // Catch:{ all -> 0x0113 }
            if (r2 != r3) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r2 = 0
            goto L_0x00e7
        L_0x00e6:
            r2 = 1
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            g.d.a.l.t.d0.a r2 = r15.f2509h     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00ec:
            boolean r2 = r15.o     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00f3
            g.d.a.l.t.d0.a r2 = r15.f2511j     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00f3:
            boolean r2 = r15.p     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00fa
            g.d.a.l.t.d0.a r2 = r15.f2512k     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00fa:
            g.d.a.l.t.d0.a r2 = r15.f2510i     // Catch:{ all -> 0x0113 }
        L_0x00fc:
            java.util.concurrent.ExecutorService r2 = r2.b     // Catch:{ all -> 0x0113 }
            r2.execute(r14)     // Catch:{ all -> 0x0113 }
            monitor-exit(r15)
            boolean r2 = f2495i
            if (r2 == 0) goto L_0x010d
            java.lang.String r2 = "Started new load"
            r3 = r37
            d(r2, r3, r12)
        L_0x010d:
            g.d.a.l.t.l$d r2 = new g.d.a.l.t.l$d
            r2.<init>(r0, r15)
            return r2
        L_0x0113:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0116:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.t.l.g(g.d.a.d, java.lang.Object, g.d.a.l.l, int, int, java.lang.Class, java.lang.Class, g.d.a.e, g.d.a.l.t.k, java.util.Map, boolean, boolean, g.d.a.l.n, boolean, boolean, boolean, boolean, g.d.a.p.f, java.util.concurrent.Executor, g.d.a.l.t.o, long):g.d.a.l.t.l$d");
    }
}
