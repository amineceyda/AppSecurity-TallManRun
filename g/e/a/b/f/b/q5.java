package g.e.a.b.f.b;

public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ q6 b;

    public /* synthetic */ q5(q6 q6Var) {
        this.b = q6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            g.e.a.b.f.b.q6 r0 = r14.b
            r0.h()
            g.e.a.b.f.b.n4 r1 = r0.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.n3 r1 = r1.r
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x01d5
            g.e.a.b.f.b.n4 r1 = r0.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.p3 r1 = r1.s
            long r1 = r1.a()
            g.e.a.b.f.b.n4 r3 = r0.a
            g.e.a.b.f.b.s3 r3 = r3.t()
            g.e.a.b.f.b.p3 r3 = r3.s
            r4 = 1
            long r4 = r4 + r1
            r3.b(r4)
            g.e.a.b.f.b.n4 r3 = r0.a
            g.e.a.b.f.b.f r4 = r3.f3258g
            r4 = 5
            r6 = 1
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x004f
            g.e.a.b.f.b.f3 r1 = r3.d()
            g.e.a.b.f.b.d3 r1 = r1.f3139i
            java.lang.String r2 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.a(r2)
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            g.e.a.b.f.b.n3 r0 = r0.r
            r0.a(r6)
            return
        L_0x004f:
            g.e.a.b.f.b.k4 r0 = r3.b()
            r0.h()
            g.e.a.b.f.b.v6 r0 = r3.w()
            g.e.a.b.f.b.n4.l(r0)
            g.e.a.b.f.b.w2 r0 = r3.q()
            java.lang.String r0 = r0.m()
            g.e.a.b.f.b.s3 r1 = r3.t()
            r1.h()
            g.e.a.b.f.b.n4 r2 = r1.a
            g.e.a.b.b.h.b r2 = r2.n
            g.e.a.b.b.h.c r2 = (g.e.a.b.b.h.c) r2
            java.util.Objects.requireNonNull(r2)
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = r1.f3341h
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x0092
            long r8 = r1.f3343j
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0086
            goto L_0x0092
        L_0x0086:
            android.util.Pair r4 = new android.util.Pair
            boolean r1 = r1.f3342i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.<init>(r2, r1)
            goto L_0x00d1
        L_0x0092:
            g.e.a.b.f.b.n4 r2 = r1.a
            g.e.a.b.f.b.f r2 = r2.f3258g
            g.e.a.b.f.b.r2 r8 = g.e.a.b.f.b.s2.b
            long r8 = r2.q(r0, r8)
            long r8 = r8 + r4
            r1.f3343j = r8
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ Exception -> 0x00b4 }
            android.content.Context r2 = r2.a     // Catch:{ Exception -> 0x00b4 }
            g.e.a.b.a.a.a$a r2 = g.e.a.b.a.a.a.a(r2)     // Catch:{ Exception -> 0x00b4 }
            r1.f3341h = r7     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = r2.a     // Catch:{ Exception -> 0x00b4 }
            if (r4 == 0) goto L_0x00af
            r1.f3341h = r4     // Catch:{ Exception -> 0x00b4 }
        L_0x00af:
            boolean r2 = r2.b     // Catch:{ Exception -> 0x00b4 }
            r1.f3342i = r2     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r2 = move-exception
            g.e.a.b.f.b.n4 r4 = r1.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.f3143m
            java.lang.String r5 = "Unable to get advertising id"
            r4.b(r5, r2)
            r1.f3341h = r7
        L_0x00c4:
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r2 = r1.f3341h
            boolean r1 = r1.f3342i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.<init>(r2, r1)
        L_0x00d1:
            g.e.a.b.f.b.f r1 = r3.f3258g
            boolean r1 = r1.t()
            if (r1 == 0) goto L_0x01c9
            java.lang.Object r1 = r4.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01c9
            java.lang.Object r1 = r4.first
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00ef
            goto L_0x01c9
        L_0x00ef:
            g.e.a.b.f.b.v6 r1 = r3.w()
            r1.k()
            g.e.a.b.f.b.n4 r1 = r1.a
            android.content.Context r1 = r1.a
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r2 = 0
            if (r1 == 0) goto L_0x010a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x010a }
            goto L_0x010b
        L_0x010a:
            r1 = r2
        L_0x010b:
            if (r1 == 0) goto L_0x01c0
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L_0x01c0
            g.e.a.b.f.b.q9 r1 = r3.A()
            g.e.a.b.f.b.w2 r5 = r3.q()
            g.e.a.b.f.b.n4 r5 = r5.a
            g.e.a.b.f.b.f r5 = r5.f3258g
            r5.p()
            java.lang.Object r4 = r4.first
            java.lang.String r4 = (java.lang.String) r4
            g.e.a.b.f.b.s3 r5 = r3.t()
            g.e.a.b.f.b.p3 r5 = r5.s
            long r8 = r5.a()
            r10 = -1
            long r8 = r8 + r10
            java.util.Objects.requireNonNull(r1)
            g.c.b.b.f.k(r4)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            g.c.b.b.f.k(r0)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r12 = 55005(0xd6dd, double:2.7176E-319)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r13 = 0
            r11[r13] = r12     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            int r12 = r1.l0()     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r11[r6] = r12     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            java.lang.String r12 = "v%s.%s"
            java.lang.String r11 = java.lang.String.format(r12, r11)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r5[r13] = r11     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r5[r6] = r4     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r5[r10] = r0     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r4 = 3
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r5[r4] = r6     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            java.lang.String r4 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            g.e.a.b.f.b.f r5 = r5.f3258g     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            java.lang.String r6 = "debug.deferred.deeplink"
            java.lang.String r5 = r5.j(r6, r7)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            boolean r5 = r0.equals(r5)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            if (r5 == 0) goto L_0x0185
            java.lang.String r5 = "&ddl_test=1"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
        L_0x0185:
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r5.<init>(r4)     // Catch:{ MalformedURLException -> 0x018e, IllegalArgumentException -> 0x018c }
            r2 = r5
            goto L_0x01a0
        L_0x018c:
            r4 = move-exception
            goto L_0x018f
        L_0x018e:
            r4 = move-exception
        L_0x018f:
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r1.b(r5, r4)
        L_0x01a0:
            if (r2 == 0) goto L_0x01d4
            g.e.a.b.f.b.v6 r1 = r3.w()
            g.e.a.b.f.b.l4 r4 = new g.e.a.b.f.b.l4
            r4.<init>(r3)
            r1.h()
            r1.k()
            g.e.a.b.f.b.n4 r3 = r1.a
            g.e.a.b.f.b.k4 r3 = r3.b()
            g.e.a.b.f.b.t6 r5 = new g.e.a.b.f.b.t6
            r5.<init>(r1, r0, r2, r4)
            r3.q(r5)
            goto L_0x01d4
        L_0x01c0:
            g.e.a.b.f.b.f3 r0 = r3.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.String r1 = "Network is not available for Deferred Deep Link request. Skipping"
            goto L_0x01d1
        L_0x01c9:
            g.e.a.b.f.b.f3 r0 = r3.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            java.lang.String r1 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
        L_0x01d1:
            r0.a(r1)
        L_0x01d4:
            return
        L_0x01d5:
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q5.run():void");
    }
}
