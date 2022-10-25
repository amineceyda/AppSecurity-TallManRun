package g.e.a.b.f.b;

import android.net.Uri;

public final class o6 implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Uri c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3274d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f3275e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p6 f3276f;

    public o6(p6 p6Var, boolean z, Uri uri, String str, String str2) {
        this.f3276f = p6Var;
        this.b = z;
        this.c = uri;
        this.f3274d = str;
        this.f3275e = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[SYNTHETIC, Splitter:B:32:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[Catch:{ RuntimeException -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4 A[Catch:{ RuntimeException -> 0x0179 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            g.e.a.b.f.b.p6 r2 = r1.f3276f
            boolean r0 = r1.b
            android.net.Uri r3 = r1.c
            java.lang.String r4 = r1.f3274d
            java.lang.String r5 = r1.f3275e
            g.e.a.b.f.b.q6 r6 = r2.b
            r6.h()
            g.e.a.b.f.b.q6 r6 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r6 = r6.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q9 r6 = r6.A()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.e.c.ua.b()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q6 r7 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r7 = r7.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f r7 = r7.f3258g     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.r2 r8 = g.e.a.b.f.b.s2.t0     // Catch:{ RuntimeException -> 0x0179 }
            r9 = 0
            boolean r7 = r7.u(r9, r8)     // Catch:{ RuntimeException -> 0x0179 }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0179 }
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "_cis"
            java.lang.String r13 = "utm_medium"
            java.lang.String r14 = "utm_source"
            java.lang.String r15 = "utm_campaign"
            java.lang.String r9 = "gclid"
            if (r10 == 0) goto L_0x003d
        L_0x003b:
            r1 = 0
            goto L_0x0098
        L_0x003d:
            boolean r10 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0179 }
            if (r10 != 0) goto L_0x0076
            boolean r10 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0179 }
            if (r10 != 0) goto L_0x0076
            boolean r10 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0179 }
            if (r10 != 0) goto L_0x0076
            boolean r10 = r5.contains(r13)     // Catch:{ RuntimeException -> 0x0179 }
            if (r10 != 0) goto L_0x0076
            if (r7 == 0) goto L_0x006a
            java.lang.String r7 = "utm_id"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0179 }
            if (r7 != 0) goto L_0x0068
            java.lang.String r7 = "dclid"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0179 }
            if (r7 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r7 = 1
            goto L_0x0076
        L_0x006a:
            g.e.a.b.f.b.n4 r6 = r6.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f3 r6 = r6.d()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.d3 r6 = r6.f3143m     // Catch:{ RuntimeException -> 0x0179 }
            r6.a(r11)     // Catch:{ RuntimeException -> 0x0179 }
            goto L_0x003b
        L_0x0076:
            java.lang.String r10 = "https://google.com/search?"
            int r16 = r5.length()     // Catch:{ RuntimeException -> 0x0179 }
            if (r16 == 0) goto L_0x0083
            java.lang.String r10 = r10.concat(r5)     // Catch:{ RuntimeException -> 0x0179 }
            goto L_0x0089
        L_0x0083:
            java.lang.String r1 = new java.lang.String     // Catch:{ RuntimeException -> 0x0179 }
            r1.<init>(r10)     // Catch:{ RuntimeException -> 0x0179 }
            r10 = r1
        L_0x0089:
            android.net.Uri r1 = android.net.Uri.parse(r10)     // Catch:{ RuntimeException -> 0x0179 }
            android.os.Bundle r1 = r6.p0(r1, r7)     // Catch:{ RuntimeException -> 0x0179 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r6 = "referrer"
            r1.putString(r12, r6)     // Catch:{ RuntimeException -> 0x0179 }
        L_0x0098:
            java.lang.String r6 = "_cmp"
            if (r0 == 0) goto L_0x00ec
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q9 r0 = r0.A()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.e.c.ua.b()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q6 r7 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r7 = r7.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f r7 = r7.f3258g     // Catch:{ RuntimeException -> 0x0179 }
            r10 = 0
            boolean r7 = r7.u(r10, r8)     // Catch:{ RuntimeException -> 0x0179 }
            android.os.Bundle r0 = r0.p0(r3, r7)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r3 = "intent"
            r0.putString(r12, r3)     // Catch:{ RuntimeException -> 0x0179 }
            boolean r3 = r0.containsKey(r9)     // Catch:{ RuntimeException -> 0x0179 }
            if (r3 != 0) goto L_0x00e0
            if (r1 == 0) goto L_0x00e0
            boolean r3 = r1.containsKey(r9)     // Catch:{ RuntimeException -> 0x0179 }
            if (r3 == 0) goto L_0x00e0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x0179 }
            r7 = 0
            java.lang.String r8 = r1.getString(r9)     // Catch:{ RuntimeException -> 0x0179 }
            r3[r7] = r8     // Catch:{ RuntimeException -> 0x0179 }
            java.lang.String r7 = "_cer"
            java.lang.String r8 = "gclid=%s"
            java.lang.String r3 = java.lang.String.format(r8, r3)     // Catch:{ RuntimeException -> 0x0179 }
            r0.putString(r7, r3)     // Catch:{ RuntimeException -> 0x0179 }
        L_0x00e0:
            g.e.a.b.f.b.q6 r3 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            r3.o(r4, r6, r0)     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q6 r3 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.w9 r3 = r3.n     // Catch:{ RuntimeException -> 0x0179 }
            r3.a(r4, r0)     // Catch:{ RuntimeException -> 0x0179 }
        L_0x00ec:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 == 0) goto L_0x00f4
            goto L_0x016a
        L_0x00f4:
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.d3 r0 = r0.f3143m     // Catch:{ RuntimeException -> 0x0179 }
            java.lang.String r3 = "Activity created with referrer"
            r0.b(r3, r5)     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f r0 = r0.f3258g     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.r2 r3 = g.e.a.b.f.b.s2.Z     // Catch:{ RuntimeException -> 0x0179 }
            r7 = 0
            boolean r0 = r0.u(r7, r3)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 == 0) goto L_0x0137
            if (r1 == 0) goto L_0x0121
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            r0.o(r4, r6, r1)     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.w9 r0 = r0.n     // Catch:{ RuntimeException -> 0x0179 }
            r0.a(r4, r1)     // Catch:{ RuntimeException -> 0x0179 }
            goto L_0x0130
        L_0x0121:
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.d3 r0 = r0.f3143m     // Catch:{ RuntimeException -> 0x0179 }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.b(r1, r5)     // Catch:{ RuntimeException -> 0x0179 }
        L_0x0130:
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            r1 = 0
            r0.z(r1)     // Catch:{ RuntimeException -> 0x0179 }
            return
        L_0x0137:
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 == 0) goto L_0x016b
            boolean r0 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 != 0) goto L_0x015f
            boolean r0 = r5.contains(r13)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 != 0) goto L_0x015f
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 != 0) goto L_0x015f
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 == 0) goto L_0x016b
        L_0x015f:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0179 }
            if (r0 != 0) goto L_0x016a
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            r0.z(r5)     // Catch:{ RuntimeException -> 0x0179 }
        L_0x016a:
            return
        L_0x016b:
            g.e.a.b.f.b.q6 r0 = r2.b     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ RuntimeException -> 0x0179 }
            g.e.a.b.f.b.d3 r0 = r0.f3143m     // Catch:{ RuntimeException -> 0x0179 }
            r0.a(r11)     // Catch:{ RuntimeException -> 0x0179 }
            return
        L_0x0179:
            r0 = move-exception
            g.e.a.b.f.b.q6 r1 = r2.b
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.o6.run():void");
    }
}
