package g.e.a.b.f.b;

public final class m4 implements Runnable {
    public final /* synthetic */ p5 b;
    public final /* synthetic */ n4 c;

    public m4(n4 n4Var, p5 p5Var) {
        this.c = n4Var;
        this.b = p5Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03eb, code lost:
        if (android.text.TextUtils.isEmpty(r1.f3376l) == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0298, code lost:
        if (android.text.TextUtils.isEmpty(r1.f3376l) == false) goto L_0x029a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            g.e.a.b.f.b.n4 r0 = r12.c
            g.e.a.b.f.b.p5 r1 = r12.b
            g.e.a.b.f.b.k4 r2 = r0.b()
            r2.h()
            g.e.a.b.f.b.f r2 = r0.f3258g
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.b r2 = r2.f3257f
            g.e.a.b.f.b.n r2 = new g.e.a.b.f.b.n
            r2.<init>(r0)
            r2.l()
            r0.v = r2
            g.e.a.b.f.b.w2 r2 = new g.e.a.b.f.b.w2
            long r3 = r1.f3293f
            r2.<init>(r0, r3)
            r2.j()
            r0.w = r2
            g.e.a.b.f.b.z2 r1 = new g.e.a.b.f.b.z2
            r1.<init>(r0)
            r1.j()
            r0.t = r1
            g.e.a.b.f.b.f8 r1 = new g.e.a.b.f.b.f8
            r1.<init>(r0)
            r1.j()
            r0.u = r1
            g.e.a.b.f.b.q9 r1 = r0.f3263l
            r1.m()
            g.e.a.b.f.b.s3 r1 = r0.f3259h
            r1.m()
            g.e.a.b.f.b.w2 r1 = r0.w
            boolean r3 = r1.b
            if (r3 != 0) goto L_0x045d
            r1.l()
            g.e.a.b.f.b.n4 r3 = r1.a
            java.util.concurrent.atomic.AtomicInteger r3 = r3.F
            r3.incrementAndGet()
            r3 = 1
            r1.b = r3
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3142l
            g.e.a.b.f.b.f r4 = r0.f3258g
            r4.p()
            r4 = 55005(0xd6dd, double:2.7176E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "App measurement initialized, version"
            r1.b(r5, r4)
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3142l
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.a(r4)
            java.lang.String r1 = r2.m()
            java.lang.String r2 = r0.b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00bb
            g.e.a.b.f.b.q9 r2 = r0.A()
            boolean r2 = r2.R(r1)
            if (r2 == 0) goto L_0x009c
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3142l
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r1.a(r2)
            goto L_0x00bb
        L_0x009c:
            g.e.a.b.f.b.f3 r2 = r0.d()
            g.e.a.b.f.b.d3 r2 = r2.f3142l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            int r5 = r1.length()
            if (r5 == 0) goto L_0x00b3
            java.lang.String r1 = r4.concat(r1)
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x00b8:
            r2.a(r1)
        L_0x00bb:
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3143m
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.a(r2)
            int r1 = r0.E
            java.util.concurrent.atomic.AtomicInteger r2 = r0.F
            int r2 = r2.get()
            if (r1 == r2) goto L_0x00eb
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            int r2 = r0.E
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.F
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all components initialized"
            r1.c(r5, r2, r4)
        L_0x00eb:
            r0.x = r3
            g.e.a.b.f.b.n4 r0 = r12.c
            g.e.a.b.f.b.p5 r1 = r12.b
            com.google.android.gms.internal.measurement.zzcl r1 = r1.f3294g
            g.e.a.b.f.b.k4 r2 = r0.b()
            r2.h()
            g.e.a.b.f.b.s3 r2 = r0.t()
            g.e.a.b.f.b.h r2 = r2.p()
            g.e.a.b.f.b.s3 r4 = r0.t()
            g.e.a.b.f.b.n4 r5 = r4.a
            r4.h()
            android.content.SharedPreferences r4 = r4.o()
            r5 = 100
            java.lang.String r6 = "consent_source"
            int r4 = r4.getInt(r6, r5)
            g.e.a.b.f.b.f r6 = r0.f3258g
            g.e.a.b.f.b.n4 r7 = r6.a
            java.lang.String r7 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r6 = r6.s(r7)
            g.e.a.b.f.b.f r7 = r0.f3258g
            g.e.a.b.f.b.n4 r8 = r7.a
            java.lang.String r8 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r7 = r7.s(r8)
            r8 = 0
            r9 = 30
            r10 = -10
            if (r6 != 0) goto L_0x0134
            if (r7 == 0) goto L_0x0146
        L_0x0134:
            g.e.a.b.f.b.s3 r11 = r0.t()
            boolean r11 = r11.u(r10)
            if (r11 == 0) goto L_0x0146
            g.e.a.b.f.b.h r1 = new g.e.a.b.f.b.h
            r1.<init>(r6, r7)
            r5 = -10
            goto L_0x01a0
        L_0x0146:
            g.e.a.b.f.b.w2 r6 = r0.q()
            java.lang.String r6 = r6.n()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0170
            if (r4 == 0) goto L_0x0164
            if (r4 == r9) goto L_0x0164
            r6 = 10
            if (r4 == r6) goto L_0x0164
            if (r4 == r9) goto L_0x0164
            if (r4 == r9) goto L_0x0164
            r6 = 40
            if (r4 != r6) goto L_0x0170
        L_0x0164:
            g.e.a.b.f.b.q6 r1 = r0.v()
            g.e.a.b.f.b.h r4 = g.e.a.b.f.b.h.b
            long r6 = r0.G
            r1.w(r4, r10, r6)
            goto L_0x019f
        L_0x0170:
            g.e.a.b.f.b.w2 r4 = r0.q()
            java.lang.String r4 = r4.n()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x019f
            if (r1 == 0) goto L_0x019f
            android.os.Bundle r4 = r1.zzg
            if (r4 == 0) goto L_0x019f
            g.e.a.b.f.b.s3 r4 = r0.t()
            boolean r4 = r4.u(r9)
            if (r4 == 0) goto L_0x019f
            android.os.Bundle r1 = r1.zzg
            g.e.a.b.f.b.h r1 = g.e.a.b.f.b.h.a(r1)
            g.e.a.b.f.b.h r4 = g.e.a.b.f.b.h.b
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x019f
            r5 = 30
            goto L_0x01a0
        L_0x019f:
            r1 = r8
        L_0x01a0:
            if (r1 == 0) goto L_0x01ac
            g.e.a.b.f.b.q6 r2 = r0.v()
            long r6 = r0.G
            r2.w(r1, r5, r6)
            r2 = r1
        L_0x01ac:
            g.e.a.b.f.b.q6 r1 = r0.v()
            r1.y(r2)
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.p3 r1 = r1.f3338e
            long r1 = r1.a()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x01df
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.n
            long r4 = r0.G
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Persisting first open"
            r1.b(r4, r2)
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.p3 r1 = r1.f3338e
            long r4 = r0.G
            r1.b(r4)
        L_0x01df:
            g.e.a.b.f.b.q6 r1 = r0.v()
            g.e.a.b.f.b.w9 r1 = r1.n
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x01fc
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01fc
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.r3 r1 = r1.u
            r1.b(r8)
        L_0x01fc:
            boolean r1 = r0.i()
            if (r1 != 0) goto L_0x027d
            boolean r1 = r0.g()
            if (r1 == 0) goto L_0x0453
            g.e.a.b.f.b.q9 r1 = r0.A()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r1 = r1.Q(r2)
            if (r1 != 0) goto L_0x021f
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "App is missing INTERNET permission"
            r1.a(r2)
        L_0x021f:
            g.e.a.b.f.b.q9 r1 = r0.A()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.Q(r2)
            if (r1 != 0) goto L_0x0236
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.a(r2)
        L_0x0236:
            android.content.Context r1 = r0.a
            g.e.a.b.b.i.a r1 = g.e.a.b.b.i.b.a(r1)
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0270
            g.e.a.b.f.b.f r1 = r0.f3258g
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x0270
            android.content.Context r1 = r0.a
            boolean r1 = g.e.a.b.f.b.q9.W(r1)
            if (r1 != 0) goto L_0x025d
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r1.a(r2)
        L_0x025d:
            android.content.Context r1 = r0.a
            boolean r1 = g.e.a.b.f.b.q9.X(r1)
            if (r1 != 0) goto L_0x0270
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.a(r2)
        L_0x0270:
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.a(r2)
            goto L_0x0453
        L_0x027d:
            g.e.a.b.f.b.w2 r1 = r0.q()
            java.lang.String r1 = r1.n()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x029a
            g.e.a.b.f.b.w2 r1 = r0.q()
            r1.i()
            java.lang.String r1 = r1.f3376l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0360
        L_0x029a:
            g.e.a.b.f.b.q9 r1 = r0.A()
            g.e.a.b.f.b.w2 r2 = r0.q()
            java.lang.String r2 = r2.n()
            g.e.a.b.f.b.s3 r4 = r0.t()
            r4.h()
            android.content.SharedPreferences r4 = r4.o()
            java.lang.String r5 = "gmp_app_id"
            java.lang.String r4 = r4.getString(r5, r8)
            g.e.a.b.f.b.w2 r6 = r0.q()
            r6.i()
            java.lang.String r6 = r6.f3376l
            g.e.a.b.f.b.s3 r7 = r0.t()
            r7.h()
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r9 = "admob_app_id"
            java.lang.String r7 = r7.getString(r9, r8)
            boolean r1 = r1.Z(r2, r4, r6, r7)
            if (r1 == 0) goto L_0x0325
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3142l
            java.lang.String r2 = "Rechecking which service to use due to a GMP App Id change"
            r1.a(r2)
            g.e.a.b.f.b.s3 r1 = r0.t()
            r1.h()
            java.lang.Boolean r2 = r1.q()
            android.content.SharedPreferences r4 = r1.o()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.clear()
            r4.apply()
            if (r2 == 0) goto L_0x0300
            r1.r(r2)
        L_0x0300:
            g.e.a.b.f.b.z2 r1 = r0.r()
            r1.m()
            g.e.a.b.f.b.f8 r1 = r0.u
            r1.x()
            g.e.a.b.f.b.f8 r1 = r0.u
            r1.w()
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.p3 r1 = r1.f3338e
            long r6 = r0.G
            r1.b(r6)
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.r3 r1 = r1.f3340g
            r1.b(r8)
        L_0x0325:
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.w2 r2 = r0.q()
            java.lang.String r2 = r2.n()
            r1.h()
            android.content.SharedPreferences r1 = r1.o()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r5, r2)
            r1.apply()
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.w2 r2 = r0.q()
            r2.i()
            java.lang.String r2 = r2.f3376l
            r1.h()
            android.content.SharedPreferences r1 = r1.o()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r9, r2)
            r1.apply()
        L_0x0360:
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.h r1 = r1.p()
            g.e.a.b.f.b.g r2 = g.e.a.b.f.b.g.ANALYTICS_STORAGE
            boolean r1 = r1.e(r2)
            if (r1 != 0) goto L_0x0379
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.r3 r1 = r1.f3340g
            r1.b(r8)
        L_0x0379:
            g.e.a.b.f.b.q6 r1 = r0.v()
            g.e.a.b.f.b.s3 r2 = r0.t()
            g.e.a.b.f.b.r3 r2 = r2.f3340g
            java.lang.String r2 = r2.a()
            java.util.concurrent.atomic.AtomicReference r1 = r1.f3305g
            r1.set(r2)
            g.e.a.b.e.c.db.b()
            g.e.a.b.f.b.f r1 = r0.f3258g
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.d0
            boolean r1 = r1.u(r8, r2)
            if (r1 == 0) goto L_0x03d0
            g.e.a.b.f.b.q9 r1 = r0.A()
            g.e.a.b.f.b.n4 r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x03ab }
            android.content.Context r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x03ab }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x03ab }
            java.lang.String r2 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x03ab }
            goto L_0x03d0
        L_0x03ab:
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.r3 r1 = r1.t
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03d0
            g.e.a.b.f.b.f3 r1 = r0.d()
            g.e.a.b.f.b.d3 r1 = r1.f3139i
            java.lang.String r2 = "Remote config removed with active feature rollouts"
            r1.a(r2)
            g.e.a.b.f.b.s3 r1 = r0.t()
            g.e.a.b.f.b.r3 r1 = r1.t
            r1.b(r8)
        L_0x03d0:
            g.e.a.b.f.b.w2 r1 = r0.q()
            java.lang.String r1 = r1.n()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x03ed
            g.e.a.b.f.b.w2 r1 = r0.q()
            r1.i()
            java.lang.String r1 = r1.f3376l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0453
        L_0x03ed:
            boolean r1 = r0.g()
            g.e.a.b.f.b.s3 r2 = r0.t()
            android.content.SharedPreferences r2 = r2.c
            r4 = 0
            if (r2 != 0) goto L_0x03fc
            r2 = 0
            goto L_0x0402
        L_0x03fc:
            java.lang.String r5 = "deferred_analytics_collection"
            boolean r2 = r2.contains(r5)
        L_0x0402:
            if (r2 != 0) goto L_0x0415
            g.e.a.b.f.b.f r2 = r0.f3258g
            boolean r2 = r2.w()
            if (r2 != 0) goto L_0x0415
            g.e.a.b.f.b.s3 r2 = r0.t()
            r5 = r1 ^ 1
            r2.s(r5)
        L_0x0415:
            if (r1 == 0) goto L_0x041e
            g.e.a.b.f.b.q6 r1 = r0.v()
            r1.H()
        L_0x041e:
            g.e.a.b.f.b.w8 r1 = r0.z()
            g.e.a.b.f.b.u8 r1 = r1.f3390d
            r1.a()
            g.e.a.b.f.b.f8 r1 = r0.y()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.y(r2)
            g.e.a.b.f.b.f8 r1 = r0.y()
            g.e.a.b.f.b.s3 r2 = r0.t()
            g.e.a.b.f.b.o3 r2 = r2.w
            android.os.Bundle r2 = r2.a()
            r1.h()
            r1.i()
            com.google.android.gms.measurement.internal.zzp r4 = r1.q(r4)
            g.e.a.b.f.b.n7 r5 = new g.e.a.b.f.b.n7
            r5.<init>(r1, r4, r2)
            r1.t(r5)
        L_0x0453:
            g.e.a.b.f.b.s3 r0 = r0.t()
            g.e.a.b.f.b.n3 r0 = r0.n
            r0.a(r3)
            return
        L_0x045d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.m4.run():void");
    }
}
