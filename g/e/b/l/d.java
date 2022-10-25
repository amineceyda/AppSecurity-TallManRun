package g.e.b.l;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import g.e.b.k.p;

public final /* synthetic */ class d implements p {
    public final /* synthetic */ CrashlyticsRegistrar a;

    public /* synthetic */ d(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03fc A[Catch:{ Exception -> 0x0410 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0437  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(g.e.b.k.o r31) {
        /*
            r30 = this;
            r1 = r30
            com.google.firebase.crashlytics.CrashlyticsRegistrar r0 = r1.a
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<g.e.b.h> r0 = g.e.b.h.class
            r2 = r31
            g.e.b.k.a0 r2 = (g.e.b.k.a0) r2
            java.lang.Object r0 = r2.a(r0)
            g.e.b.h r0 = (g.e.b.h) r0
            java.lang.Class<g.e.b.l.j.c> r3 = g.e.b.l.j.c.class
            g.e.b.q.a r3 = r2.e(r3)
            java.lang.Class<g.e.b.j.a.a> r4 = g.e.b.j.a.a.class
            g.e.b.q.a r4 = r2.e(r4)
            java.lang.Class<g.e.b.r.f> r5 = g.e.b.r.f.class
            java.lang.Object r2 = r2.a(r5)
            g.e.b.r.f r2 = (g.e.b.r.f) r2
            r0.a()
            android.content.Context r12 = r0.a
            java.lang.String r5 = r12.getPackageName()
            g.e.b.l.j.f r13 = g.e.b.l.j.f.a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Initializing Firebase Crashlytics "
            r6.append(r7)
            java.lang.String r7 = "18.2.9"
            r6.append(r7)
            java.lang.String r7 = " for "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r7 = 4
            boolean r7 = r13.a(r7)
            r8 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.String r7 = "FirebaseCrashlytics"
            android.util.Log.i(r7, r6, r8)
        L_0x005a:
            g.e.b.l.j.n.f r14 = new g.e.b.l.j.n.f
            r14.<init>(r12)
            g.e.b.l.j.j.g0 r15 = new g.e.b.l.j.j.g0
            r15.<init>(r0)
            g.e.b.l.j.j.k0 r11 = new g.e.b.l.j.j.k0
            r11.<init>(r12, r5, r2, r15)
            g.e.b.l.j.d r6 = new g.e.b.l.j.d
            r6.<init>(r3)
            g.e.b.l.e r2 = new g.e.b.l.e
            r2.<init>(r4)
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r16 = g.e.a.b.b.h.e.c(r3)
            g.e.b.l.j.j.a0 r10 = new g.e.b.l.j.j.a0
            g.e.b.l.c r8 = new g.e.b.l.c
            r8.<init>(r2)
            g.e.b.l.b r9 = new g.e.b.l.b
            r9.<init>(r2)
            r3 = r10
            r4 = r0
            r5 = r11
            r7 = r15
            r2 = r10
            r10 = r14
            r31 = r11
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.a()
            g.e.b.i r0 = r0.c
            java.lang.String r0 = r0.b
            java.lang.String r5 = g.e.b.l.j.j.l.e(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mapping file ID is: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.b(r3)
            g.e.b.l.j.e r10 = new g.e.b.l.j.e
            r10.<init>(r12)
            java.lang.String r7 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x0440 }
            java.lang.String r6 = r31.d()     // Catch:{ NameNotFoundException -> 0x0440 }
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0440 }
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0440 }
            int r4 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0440 }
            java.lang.String r8 = java.lang.Integer.toString(r4)     // Catch:{ NameNotFoundException -> 0x0440 }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x0440 }
            if (r3 != 0) goto L_0x00d3
            java.lang.String r3 = "0.0"
        L_0x00d3:
            r9 = r3
            g.e.b.l.j.j.h r11 = new g.e.b.l.j.j.h     // Catch:{ NameNotFoundException -> 0x0440 }
            r26 = 0
            r3 = r11
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0440 }
            java.lang.String r3 = "Installer package name is: "
            java.lang.StringBuilder r3 = g.a.a.a.a.i(r3)
            java.lang.String r4 = r11.c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r13.e(r3)
            java.lang.String r3 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = g.e.a.b.b.h.e.c(r3)
            g.e.b.l.j.m.b r4 = new g.e.b.l.j.m.b
            r4.<init>()
            java.lang.String r5 = r11.f3493e
            java.lang.String r6 = r11.f3494f
            java.lang.String r7 = r31.d()
            g.e.b.l.j.j.o0 r8 = new g.e.b.l.j.j.o0
            r8.<init>()
            g.e.b.l.j.p.g r9 = new g.e.b.l.j.p.g
            r9.<init>(r8)
            g.e.b.l.j.p.a r10 = new g.e.b.l.j.p.a
            r10.<init>(r14)
            java.util.Locale r13 = java.util.Locale.US
            r14 = 1
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r26] = r0
            java.lang.String r1 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r1 = java.lang.String.format(r13, r1, r14)
            g.e.b.l.j.p.k.a r14 = new g.e.b.l.j.p.k.a
            r14.<init>(r1, r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = android.os.Build.MANUFACTURER
            r27 = r11
            r11 = r31
            java.lang.String r4 = r11.e(r4)
            r1[r26] = r4
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r4 = r11.e(r4)
            r16 = 1
            r1[r16] = r4
            java.lang.String r4 = "%s/%s"
            java.lang.String r18 = java.lang.String.format(r13, r4, r1)
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r19 = r11.e(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r20 = r11.e(r1)
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r4 = g.e.b.l.j.j.l.e(r12)
            r1[r26] = r4
            r1[r16] = r0
            r4 = 2
            r1[r4] = r6
            r4 = 3
            r1[r4] = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r13 = 4
            r16 = 0
            r31 = r2
            r2 = 0
        L_0x016a:
            if (r2 >= r13) goto L_0x0190
            r13 = r1[r2]
            r16 = r1
            if (r13 == 0) goto L_0x0186
            java.lang.String r1 = "-"
            r29 = r3
            java.lang.String r3 = ""
            java.lang.String r1 = r13.replace(r1, r3)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r3)
            r4.add(r1)
            goto L_0x0188
        L_0x0186:
            r29 = r3
        L_0x0188:
            int r2 = r2 + 1
            r13 = 4
            r1 = r16
            r3 = r29
            goto L_0x016a
        L_0x0190:
            r29 = r3
            java.util.Collections.sort(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
        L_0x019e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ae
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            goto L_0x019e
        L_0x01ae:
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x01bd
            java.lang.String r1 = g.e.b.l.j.j.l.l(r1)
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            r22 = r1
            if (r7 == 0) goto L_0x01c5
            g.e.b.l.j.j.h0 r1 = g.e.b.l.j.j.h0.APP_STORE
            goto L_0x01c7
        L_0x01c5:
            g.e.b.l.j.j.h0 r1 = g.e.b.l.j.j.h0.DEVELOPER
        L_0x01c7:
            int r25 = r1.f()
            g.e.b.l.j.p.j.f r7 = new g.e.b.l.j.p.j.f
            r16 = r7
            r17 = r0
            r21 = r11
            r23 = r6
            r24 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            g.e.b.l.j.p.e r1 = new g.e.b.l.j.p.e
            r5 = r1
            r6 = r12
            r0 = r27
            r11 = r14
            r12 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            g.e.b.l.j.p.c r2 = g.e.b.l.j.p.c.USE_CACHE
            android.content.Context r3 = r1.a
            android.content.SharedPreferences r3 = g.e.b.l.j.j.l.g(r3)
            java.lang.String r4 = "existing_instance_identifier"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            g.e.b.l.j.p.j.f r4 = r1.b
            java.lang.String r4 = r4.f3706f
            boolean r3 = r3.equals(r4)
            r3 = r3 ^ 1
            if (r3 != 0) goto L_0x0221
            g.e.b.l.j.p.j.e r2 = r1.a(r2)
            if (r2 == 0) goto L_0x0221
            java.util.concurrent.atomic.AtomicReference<g.e.b.l.j.p.j.d> r3 = r1.f3701h
            r3.set(r2)
            java.util.concurrent.atomic.AtomicReference<g.e.a.b.g.g<g.e.b.l.j.p.j.a>> r3 = r1.f3702i
            java.lang.Object r3 = r3.get()
            g.e.a.b.g.g r3 = (g.e.a.b.g.g) r3
            g.e.b.l.j.p.j.a r2 = r2.a
            r3.b(r2)
            r2 = 0
            g.e.a.b.g.f r2 = g.e.a.b.b.h.e.h(r2)
            r6 = r29
            goto L_0x0268
        L_0x0221:
            g.e.b.l.j.p.c r2 = g.e.b.l.j.p.c.IGNORE_CACHE_EXPIRATION
            g.e.b.l.j.p.j.e r2 = r1.a(r2)
            if (r2 == 0) goto L_0x023b
            java.util.concurrent.atomic.AtomicReference<g.e.b.l.j.p.j.d> r3 = r1.f3701h
            r3.set(r2)
            java.util.concurrent.atomic.AtomicReference<g.e.a.b.g.g<g.e.b.l.j.p.j.a>> r3 = r1.f3702i
            java.lang.Object r3 = r3.get()
            g.e.a.b.g.g r3 = (g.e.a.b.g.g) r3
            g.e.b.l.j.p.j.a r2 = r2.a
            r3.b(r2)
        L_0x023b:
            g.e.b.l.j.j.g0 r2 = r1.f3700g
            g.e.a.b.g.g<java.lang.Void> r3 = r2.f3491g
            g.e.a.b.g.b0<TResult> r3 = r3.a
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            g.e.a.b.g.g<java.lang.Void> r2 = r2.f3488d     // Catch:{ all -> 0x043d }
            g.e.a.b.g.b0<TResult> r2 = r2.a     // Catch:{ all -> 0x043d }
            monitor-exit(r4)     // Catch:{ all -> 0x043d }
            java.util.concurrent.ExecutorService r4 = g.e.b.l.j.j.q0.a
            g.e.a.b.g.g r4 = new g.e.a.b.g.g
            r4.<init>()
            g.e.b.l.j.j.e r5 = new g.e.b.l.j.j.e
            r5.<init>(r4)
            r6 = r29
            r3.e(r6, r5)
            r2.e(r6, r5)
            g.e.a.b.g.b0<TResult> r2 = r4.a
            g.e.b.l.j.p.d r3 = new g.e.b.l.j.p.d
            r3.<init>(r1)
            g.e.a.b.g.f r2 = r2.l(r6, r3)
        L_0x0268:
            g.e.b.l.g r3 = new g.e.b.l.g
            r3.<init>()
            r2.e(r6, r3)
            r2 = r31
            android.content.Context r3 = r2.a
            if (r3 == 0) goto L_0x029c
            android.content.res.Resources r4 = r3.getResources()
            if (r4 == 0) goto L_0x029c
            java.lang.String r5 = "com.crashlytics.RequireBuildId"
            java.lang.String r7 = "bool"
            int r7 = g.e.b.l.j.j.l.f(r3, r5, r7)
            if (r7 <= 0) goto L_0x028b
            boolean r3 = r4.getBoolean(r7)
            goto L_0x029d
        L_0x028b:
            java.lang.String r4 = "string"
            int r4 = g.e.b.l.j.j.l.f(r3, r5, r4)
            if (r4 <= 0) goto L_0x029c
            java.lang.String r3 = r3.getString(r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            goto L_0x029d
        L_0x029c:
            r3 = 1
        L_0x029d:
            java.lang.String r4 = r0.b
            java.lang.String r5 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            java.lang.String r7 = "FirebaseCrashlytics"
            if (r3 != 0) goto L_0x02ad
            g.e.b.l.j.f r3 = g.e.b.l.j.f.a
            java.lang.String r4 = "Configured not to require a build ID."
            r3.e(r4)
            goto L_0x02b3
        L_0x02ad:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x02b5
        L_0x02b3:
            r3 = 1
            goto L_0x0305
        L_0x02b5:
            java.lang.String r3 = "."
            android.util.Log.e(r7, r3)
            java.lang.String r4 = ".     |  | "
            android.util.Log.e(r7, r4)
            java.lang.String r4 = ".     |  |"
            android.util.Log.e(r7, r4)
            android.util.Log.e(r7, r4)
            java.lang.String r8 = ".   \\ |  | /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".    \\    /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".     \\  /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".      \\/"
            android.util.Log.e(r7, r8)
            android.util.Log.e(r7, r3)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r3)
            java.lang.String r8 = ".      /\\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".     /  \\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".    /    \\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".   / |  | \\"
            android.util.Log.e(r7, r8)
            android.util.Log.e(r7, r4)
            android.util.Log.e(r7, r4)
            android.util.Log.e(r7, r4)
            android.util.Log.e(r7, r3)
            r3 = 0
        L_0x0305:
            if (r3 == 0) goto L_0x0437
            g.e.b.l.j.j.k r3 = new g.e.b.l.j.j.k
            g.e.b.l.j.j.k0 r4 = r2.f3476g
            r3.<init>(r4)
            java.lang.String r3 = g.e.b.l.j.j.k.b
            g.e.b.l.j.j.c0 r4 = new g.e.b.l.j.j.c0     // Catch:{ Exception -> 0x0412 }
            java.lang.String r5 = "crash_marker"
            g.e.b.l.j.n.f r8 = r2.f3477h     // Catch:{ Exception -> 0x0412 }
            r4.<init>(r5, r8)     // Catch:{ Exception -> 0x0412 }
            r2.f3474e = r4     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.c0 r4 = new g.e.b.l.j.j.c0     // Catch:{ Exception -> 0x0412 }
            java.lang.String r5 = "initialization_marker"
            r4.<init>(r5, r8)     // Catch:{ Exception -> 0x0412 }
            r2.f3473d = r4     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.k.k r4 = new g.e.b.l.j.k.k     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.m r5 = r2.f3481l     // Catch:{ Exception -> 0x0412 }
            r4.<init>(r3, r8, r5)     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.k.e r5 = new g.e.b.l.j.k.e     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.n.f r8 = r2.f3477h     // Catch:{ Exception -> 0x0412 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.q.a r8 = new g.e.b.l.j.q.a     // Catch:{ Exception -> 0x0412 }
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 1
            g.e.b.l.j.q.d[] r10 = new g.e.b.l.j.q.d[r10]     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.q.c r11 = new g.e.b.l.j.q.c     // Catch:{ Exception -> 0x0412 }
            r12 = 10
            r11.<init>(r12)     // Catch:{ Exception -> 0x0412 }
            r10[r26] = r11     // Catch:{ Exception -> 0x0412 }
            r8.<init>(r9, r10)     // Catch:{ Exception -> 0x0412 }
            android.content.Context r9 = r2.a     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.k0 r10 = r2.f3476g     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.n.f r11 = r2.f3477h     // Catch:{ Exception -> 0x0412 }
            r16 = r9
            r17 = r10
            r18 = r11
            r19 = r0
            r20 = r5
            r21 = r4
            r22 = r8
            r23 = r1
            g.e.b.l.j.j.n0 r26 = g.e.b.l.j.j.n0.c(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.v r8 = new g.e.b.l.j.j.v     // Catch:{ Exception -> 0x0412 }
            android.content.Context r9 = r2.a     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.m r10 = r2.f3481l     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.k0 r11 = r2.f3476g     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.g0 r12 = r2.b     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.n.f r13 = r2.f3477h     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.j.c0 r14 = r2.f3474e     // Catch:{ Exception -> 0x0412 }
            g.e.b.l.j.c r15 = r2.f3482m     // Catch:{ Exception -> 0x0412 }
            r29 = r6
            g.e.b.l.j.h.a r6 = r2.f3479j     // Catch:{ Exception -> 0x0410 }
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r0
            r24 = r4
            r25 = r5
            r27 = r15
            r28 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0410 }
            r2.f3475f = r8     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.c0 r0 = r2.f3473d     // Catch:{ Exception -> 0x0410 }
            java.io.File r0 = r0.b()     // Catch:{ Exception -> 0x0410 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.m r4 = r2.f3481l     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.b0 r5 = new g.e.b.l.j.j.b0     // Catch:{ Exception -> 0x0410 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0410 }
            g.e.a.b.g.f r4 = r4.b(r5)     // Catch:{ Exception -> 0x0410 }
            java.lang.Object r4 = g.e.b.l.j.j.q0.a(r4)     // Catch:{ Exception -> 0x03b0 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x03b0 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0410 }
            r5.equals(r4)     // Catch:{ Exception -> 0x0410 }
        L_0x03b0:
            g.e.b.l.j.j.v r4 = r2.f3475f     // Catch:{ Exception -> 0x0410 }
            java.lang.Thread$UncaughtExceptionHandler r5 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.m r6 = r4.f3522e     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.x r8 = new g.e.b.l.j.j.x     // Catch:{ Exception -> 0x0410 }
            r8.<init>(r4, r3)     // Catch:{ Exception -> 0x0410 }
            r6.b(r8)     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.p r3 = new g.e.b.l.j.j.p     // Catch:{ Exception -> 0x0410 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.j.f0 r6 = new g.e.b.l.j.j.f0     // Catch:{ Exception -> 0x0410 }
            g.e.b.l.j.c r8 = r4.f3527j     // Catch:{ Exception -> 0x0410 }
            r6.<init>(r3, r1, r5, r8)     // Catch:{ Exception -> 0x0410 }
            r4.f3530m = r6     // Catch:{ Exception -> 0x0410 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch:{ Exception -> 0x0410 }
            if (r0 == 0) goto L_0x0407
            android.content.Context r0 = r2.a     // Catch:{ Exception -> 0x0410 }
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            int r3 = r0.checkCallingOrSelfPermission(r3)     // Catch:{ Exception -> 0x0410 }
            if (r3 != 0) goto L_0x03df
            r3 = 1
            goto L_0x03e0
        L_0x03df:
            r3 = 0
        L_0x03e0:
            if (r3 == 0) goto L_0x03f9
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch:{ Exception -> 0x0410 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x0410 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0410 }
            if (r0 == 0) goto L_0x03f7
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ Exception -> 0x0410 }
            if (r0 == 0) goto L_0x03f7
            goto L_0x03f9
        L_0x03f7:
            r0 = 0
            goto L_0x03fa
        L_0x03f9:
            r0 = 1
        L_0x03fa:
            if (r0 == 0) goto L_0x0407
            g.e.b.l.j.f r0 = g.e.b.l.j.f.a     // Catch:{ Exception -> 0x0410 }
            java.lang.String r3 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r0.b(r3)     // Catch:{ Exception -> 0x0410 }
            r2.b(r1)     // Catch:{ Exception -> 0x0410 }
            goto L_0x0426
        L_0x0407:
            g.e.b.l.j.f r0 = g.e.b.l.j.f.a
            java.lang.String r3 = "Successfully configured exception handler."
            r0.b(r3)
            r0 = 1
            goto L_0x0427
        L_0x0410:
            r0 = move-exception
            goto L_0x0415
        L_0x0412:
            r0 = move-exception
            r29 = r6
        L_0x0415:
            g.e.b.l.j.f r3 = g.e.b.l.j.f.a
            r4 = 6
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L_0x0423
            java.lang.String r3 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r7, r3, r0)
        L_0x0423:
            r0 = 0
            r2.f3475f = r0
        L_0x0426:
            r0 = 0
        L_0x0427:
            g.e.b.l.h r3 = new g.e.b.l.h
            r3.<init>(r0, r2, r1)
            r1 = r29
            g.e.a.b.b.h.e.d(r1, r3)
            g.e.b.l.i r0 = new g.e.b.l.i
            r0.<init>(r2)
            goto L_0x0453
        L_0x0437:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x043d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x043d }
            throw r0
        L_0x0440:
            r0 = move-exception
            r1 = 0
            g.e.b.l.j.f r2 = g.e.b.l.j.f.a
            java.lang.String r3 = "Error retrieving app package info."
            r4 = 6
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L_0x0452
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r3, r0)
        L_0x0452:
            r0 = r1
        L_0x0453:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.d.a(g.e.b.k.o):java.lang.Object");
    }
}
