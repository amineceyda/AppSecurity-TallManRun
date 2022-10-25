package g.e.a.b.f.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcl;
import g.e.a.b.b.h.b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;

public final class n4 implements j5 {
    public static volatile n4 H;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public final AtomicInteger F = new AtomicInteger(0);
    public final long G;
    public final Context a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3255d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3256e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3257f;

    /* renamed from: g  reason: collision with root package name */
    public final f f3258g;

    /* renamed from: h  reason: collision with root package name */
    public final s3 f3259h;

    /* renamed from: i  reason: collision with root package name */
    public final f3 f3260i;

    /* renamed from: j  reason: collision with root package name */
    public final k4 f3261j;

    /* renamed from: k  reason: collision with root package name */
    public final w8 f3262k;

    /* renamed from: l  reason: collision with root package name */
    public final q9 f3263l;

    /* renamed from: m  reason: collision with root package name */
    public final a3 f3264m;
    public final b n;
    public final f7 o;
    public final q6 p;
    public final z1 q;
    public final v6 r;
    public final String s;
    public z2 t;
    public f8 u;
    public n v;
    public w2 w;
    public boolean x = false;
    public Boolean y;
    public long z;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public n4(g.e.a.b.f.b.p5 r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.x = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r9.F = r1
            android.content.Context r1 = r10.a
            g.e.a.b.f.b.b r2 = new g.e.a.b.f.b.b
            r2.<init>()
            r9.f3257f = r2
            g.e.a.b.b.h.e.c = r2
            r9.a = r1
            java.lang.String r2 = r10.b
            r9.b = r2
            java.lang.String r2 = r10.c
            r9.c = r2
            java.lang.String r2 = r10.f3291d
            r9.f3255d = r2
            boolean r2 = r10.f3295h
            r9.f3256e = r2
            java.lang.Boolean r2 = r10.f3292e
            r9.A = r2
            java.lang.String r2 = r10.f3297j
            r9.s = r2
            r2 = 1
            r9.D = r2
            com.google.android.gms.internal.measurement.zzcl r3 = r10.f3294g
            if (r3 == 0) goto L_0x005b
            android.os.Bundle r4 = r3.zzg
            if (r4 == 0) goto L_0x005b
            java.lang.String r5 = "measurementEnabled"
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x004b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r9.B = r4
        L_0x004b:
            android.os.Bundle r3 = r3.zzg
            java.lang.String r4 = "measurementDeactivated"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x005b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r9.C = r3
        L_0x005b:
            g.e.a.b.e.c.w5 r3 = g.e.a.b.e.c.x5.f3081g
            if (r3 != 0) goto L_0x00bf
            java.lang.Object r3 = g.e.a.b.e.c.x5.f3080f
            monitor-enter(r3)
            g.e.a.b.e.c.w5 r4 = g.e.a.b.e.c.x5.f3081g     // Catch:{ all -> 0x00bc }
            if (r4 != 0) goto L_0x00ba
            monitor-enter(r3)     // Catch:{ all -> 0x00bc }
            g.e.a.b.e.c.w5 r4 = g.e.a.b.e.c.x5.f3081g     // Catch:{ all -> 0x00b7 }
            android.content.Context r5 = r1.getApplicationContext()     // Catch:{ all -> 0x00b7 }
            if (r5 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r5 = r1
        L_0x0071:
            if (r4 == 0) goto L_0x0079
            android.content.Context r4 = r4.a()     // Catch:{ all -> 0x00b7 }
            if (r4 == r5) goto L_0x00b2
        L_0x0079:
            g.e.a.b.e.c.g5.d()     // Catch:{ all -> 0x00b7 }
            g.e.a.b.e.c.y5.c()     // Catch:{ all -> 0x00b7 }
            java.lang.Class<g.e.a.b.e.c.m5> r4 = g.e.a.b.e.c.m5.class
            monitor-enter(r4)     // Catch:{ all -> 0x00b7 }
            g.e.a.b.e.c.m5 r6 = g.e.a.b.e.c.m5.c     // Catch:{ all -> 0x00b4 }
            if (r6 == 0) goto L_0x0099
            android.content.Context r7 = r6.a     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x0099
            android.database.ContentObserver r6 = r6.b     // Catch:{ all -> 0x00b4 }
            if (r6 == 0) goto L_0x0099
            android.content.ContentResolver r6 = r7.getContentResolver()     // Catch:{ all -> 0x00b4 }
            g.e.a.b.e.c.m5 r7 = g.e.a.b.e.c.m5.c     // Catch:{ all -> 0x00b4 }
            android.database.ContentObserver r7 = r7.b     // Catch:{ all -> 0x00b4 }
            r6.unregisterContentObserver(r7)     // Catch:{ all -> 0x00b4 }
        L_0x0099:
            r6 = 0
            g.e.a.b.e.c.m5.c = r6     // Catch:{ all -> 0x00b4 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b7 }
            g.e.a.b.e.c.q5 r4 = new g.e.a.b.e.c.q5     // Catch:{ all -> 0x00b7 }
            r4.<init>(r5)     // Catch:{ all -> 0x00b7 }
            g.e.a.b.e.c.c6 r4 = g.e.a.b.b.h.e.u(r4)     // Catch:{ all -> 0x00b7 }
            g.e.a.b.e.c.d5 r6 = new g.e.a.b.e.c.d5     // Catch:{ all -> 0x00b7 }
            r6.<init>(r5, r4)     // Catch:{ all -> 0x00b7 }
            g.e.a.b.e.c.x5.f3081g = r6     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.atomic.AtomicInteger r4 = g.e.a.b.e.c.x5.f3082h     // Catch:{ all -> 0x00b7 }
            r4.incrementAndGet()     // Catch:{ all -> 0x00b7 }
        L_0x00b2:
            monitor-exit(r3)     // Catch:{ all -> 0x00b7 }
            goto L_0x00ba
        L_0x00b4:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b7 }
            throw r10     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b7 }
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x00ba:
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            goto L_0x00bf
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            throw r10
        L_0x00bf:
            g.e.a.b.b.h.c r3 = g.e.a.b.b.h.c.a
            r9.n = r3
            java.lang.Long r3 = r10.f3296i
            if (r3 == 0) goto L_0x00cc
            long r3 = r3.longValue()
            goto L_0x00d0
        L_0x00cc:
            long r3 = java.lang.System.currentTimeMillis()
        L_0x00d0:
            r9.G = r3
            g.e.a.b.f.b.f r3 = new g.e.a.b.f.b.f
            r3.<init>(r9)
            r9.f3258g = r3
            g.e.a.b.f.b.s3 r3 = new g.e.a.b.f.b.s3
            r3.<init>(r9)
            r3.l()
            r9.f3259h = r3
            g.e.a.b.f.b.f3 r3 = new g.e.a.b.f.b.f3
            r3.<init>(r9)
            r3.l()
            r9.f3260i = r3
            g.e.a.b.f.b.q9 r3 = new g.e.a.b.f.b.q9
            r3.<init>(r9)
            r3.l()
            r9.f3263l = r3
            g.e.a.b.f.b.o5 r3 = new g.e.a.b.f.b.o5
            r3.<init>(r9)
            g.e.a.b.f.b.a3 r4 = new g.e.a.b.f.b.a3
            r4.<init>(r3)
            r9.f3264m = r4
            g.e.a.b.f.b.z1 r3 = new g.e.a.b.f.b.z1
            r3.<init>(r9)
            r9.q = r3
            g.e.a.b.f.b.f7 r3 = new g.e.a.b.f.b.f7
            r3.<init>(r9)
            r3.j()
            r9.o = r3
            g.e.a.b.f.b.q6 r3 = new g.e.a.b.f.b.q6
            r3.<init>(r9)
            r3.j()
            r9.p = r3
            g.e.a.b.f.b.w8 r3 = new g.e.a.b.f.b.w8
            r3.<init>(r9)
            r3.j()
            r9.f3262k = r3
            g.e.a.b.f.b.v6 r3 = new g.e.a.b.f.b.v6
            r3.<init>(r9)
            r3.l()
            r9.r = r3
            g.e.a.b.f.b.k4 r3 = new g.e.a.b.f.b.k4
            r3.<init>(r9)
            r3.l()
            r9.f3261j = r3
            com.google.android.gms.internal.measurement.zzcl r4 = r10.f3294g
            if (r4 == 0) goto L_0x0149
            long r4 = r4.zzb
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r0 = 1
        L_0x014a:
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L_0x018e
            g.e.a.b.f.b.q6 r1 = r9.v()
            g.e.a.b.f.b.n4 r2 = r1.a
            android.content.Context r2 = r2.a
            android.content.Context r2 = r2.getApplicationContext()
            boolean r2 = r2 instanceof android.app.Application
            if (r2 == 0) goto L_0x0199
            g.e.a.b.f.b.n4 r2 = r1.a
            android.content.Context r2 = r2.a
            android.content.Context r2 = r2.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            g.e.a.b.f.b.p6 r4 = r1.c
            if (r4 != 0) goto L_0x0177
            g.e.a.b.f.b.p6 r4 = new g.e.a.b.f.b.p6
            r4.<init>(r1)
            r1.c = r4
        L_0x0177:
            if (r0 == 0) goto L_0x0199
            g.e.a.b.f.b.p6 r0 = r1.c
            r2.unregisterActivityLifecycleCallbacks(r0)
            g.e.a.b.f.b.p6 r0 = r1.c
            r2.registerActivityLifecycleCallbacks(r0)
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r1 = "Registered activity lifecycle callback"
            goto L_0x0196
        L_0x018e:
            g.e.a.b.f.b.f3 r0 = r9.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.String r1 = "Application context is not an Application"
        L_0x0196:
            r0.a(r1)
        L_0x0199:
            g.e.a.b.f.b.m4 r0 = new g.e.a.b.f.b.m4
            r0.<init>(r9, r10)
            r3.r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.n4.<init>(g.e.a.b.f.b.p5):void");
    }

    public static final void j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void k(w3 w3Var) {
        if (w3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!w3Var.b) {
            String valueOf = String.valueOf(w3Var.getClass());
            valueOf.length();
            throw new IllegalStateException("Component not initialized: ".concat(valueOf));
        }
    }

    public static final void l(i5 i5Var) {
        if (i5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!i5Var.n()) {
            String valueOf = String.valueOf(i5Var.getClass());
            valueOf.length();
            throw new IllegalStateException("Component not initialized: ".concat(valueOf));
        }
    }

    public static n4 u(Context context, zzcl zzcl, Long l2) {
        Bundle bundle;
        if (zzcl != null && (zzcl.zze == null || zzcl.zzf == null)) {
            zzcl = new zzcl(zzcl.zza, zzcl.zzb, zzcl.zzc, zzcl.zzd, (String) null, (String) null, zzcl.zzg, (String) null);
        }
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (H == null) {
            synchronized (n4.class) {
                if (H == null) {
                    H = new n4(new p5(context, zzcl, l2));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Objects.requireNonNull(H, "null reference");
            H.A = Boolean.valueOf(zzcl.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Objects.requireNonNull(H, "null reference");
        return H;
    }

    @Pure
    public final q9 A() {
        q9 q9Var = this.f3263l;
        if (q9Var != null) {
            return q9Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean a() {
        return this.A != null && this.A.booleanValue();
    }

    @Pure
    public final k4 b() {
        l(this.f3261j);
        return this.f3261j;
    }

    @Pure
    public final Context c() {
        return this.a;
    }

    @Pure
    public final f3 d() {
        l(this.f3260i);
        return this.f3260i;
    }

    @Pure
    public final b e() {
        return this.n;
    }

    @Pure
    public final b f() {
        return this.f3257f;
    }

    public final boolean g() {
        return m() == 0;
    }

    @Pure
    public final boolean h() {
        return TextUtils.isEmpty(this.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.z) > 1000) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
            r6 = this;
            boolean r0 = r6.x
            if (r0 == 0) goto L_0x00c8
            g.e.a.b.f.b.k4 r0 = r6.b()
            r0.h()
            java.lang.Boolean r0 = r6.y
            if (r0 == 0) goto L_0x0035
            long r1 = r6.z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0035
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c1
            g.e.a.b.b.h.b r0 = r6.n
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.z
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c1
        L_0x0035:
            g.e.a.b.b.h.b r0 = r6.n
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.z = r0
            g.e.a.b.f.b.q9 r0 = r6.A()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.Q(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0082
            g.e.a.b.f.b.q9 r0 = r6.A()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.Q(r3)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r6.a
            g.e.a.b.b.i.a r0 = g.e.a.b.b.i.b.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0080
            g.e.a.b.f.b.f r0 = r6.f3258g
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0080
            android.content.Context r0 = r6.a
            boolean r0 = g.e.a.b.f.b.q9.W(r0)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r6.a
            boolean r0 = g.e.a.b.f.b.q9.X(r0)
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c1
            g.e.a.b.f.b.q9 r0 = r6.A()
            g.e.a.b.f.b.w2 r3 = r6.q()
            java.lang.String r3 = r3.n()
            g.e.a.b.f.b.w2 r4 = r6.q()
            r4.i()
            java.lang.String r4 = r4.f3376l
            boolean r0 = r0.J(r3, r4)
            if (r0 != 0) goto L_0x00bb
            g.e.a.b.f.b.w2 r0 = r6.q()
            r0.i()
            java.lang.String r0 = r0.f3376l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r1 = 0
        L_0x00bb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.y = r0
        L_0x00c1:
            java.lang.Boolean r0 = r6.y
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.n4.i():boolean");
    }

    public final int m() {
        b().h();
        if (this.f3258g.w()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        b().h();
        if (!this.D) {
            return 8;
        }
        Boolean q2 = t().q();
        if (q2 != null) {
            return q2.booleanValue() ? 0 : 3;
        }
        f fVar = this.f3258g;
        b bVar = fVar.a.f3257f;
        Boolean s2 = fVar.s("firebase_analytics_collection_enabled");
        if (s2 != null) {
            return s2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    @Pure
    public final z1 n() {
        z1 z1Var = this.q;
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final f o() {
        return this.f3258g;
    }

    @Pure
    public final n p() {
        l(this.v);
        return this.v;
    }

    @Pure
    public final w2 q() {
        k(this.w);
        return this.w;
    }

    @Pure
    public final z2 r() {
        k(this.t);
        return this.t;
    }

    @Pure
    public final a3 s() {
        return this.f3264m;
    }

    @Pure
    public final s3 t() {
        s3 s3Var = this.f3259h;
        if (s3Var != null) {
            return s3Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final q6 v() {
        k(this.p);
        return this.p;
    }

    @Pure
    public final v6 w() {
        l(this.r);
        return this.r;
    }

    @Pure
    public final f7 x() {
        k(this.o);
        return this.o;
    }

    @Pure
    public final f8 y() {
        k(this.u);
        return this.u;
    }

    @Pure
    public final w8 z() {
        k(this.f3262k);
        return this.f3262k;
    }
}
