package g.e.a.b.f.b;

import g.e.a.b.e.c.z2;

public final class ba extends aa {

    /* renamed from: g  reason: collision with root package name */
    public final z2 f3113g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ca f3114h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba(ca caVar, String str, int i2, z2 z2Var) {
        super(str, i2);
        this.f3114h = caVar;
        this.f3113g = z2Var;
    }

    public final int a() {
        return this.f3113g.s();
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v15, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.lang.Long r12, java.lang.Long r13, g.e.a.b.e.c.p4 r14, boolean r15) {
        /*
            r11 = this;
            g.e.a.b.e.c.jb.b()
            g.e.a.b.f.b.ca r0 = r11.f3114h
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            java.lang.String r1 = r11.a
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.V
            boolean r0 = r0.u(r1, r2)
            g.e.a.b.e.c.z2 r1 = r11.f3113g
            boolean r1 = r1.y()
            g.e.a.b.e.c.z2 r2 = r11.f3113g
            boolean r2 = r2.z()
            g.e.a.b.e.c.z2 r3 = r11.f3113g
            boolean r3 = r3.A()
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x002e
            if (r2 != 0) goto L_0x002e
            if (r3 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r1 = 0
            goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            r2 = 0
            if (r15 == 0) goto L_0x005c
            if (r1 != 0) goto L_0x005c
            g.e.a.b.f.b.ca r12 = r11.f3114h
            g.e.a.b.f.b.n4 r12 = r12.a
            g.e.a.b.f.b.f3 r12 = r12.d()
            g.e.a.b.f.b.d3 r12 = r12.n
            int r13 = r11.b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            g.e.a.b.e.c.z2 r14 = r11.f3113g
            boolean r14 = r14.B()
            if (r14 == 0) goto L_0x0056
            g.e.a.b.e.c.z2 r14 = r11.f3113g
            int r14 = r14.s()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
        L_0x0056:
            java.lang.String r14 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r12.c(r14, r13, r2)
            return r4
        L_0x005c:
            g.e.a.b.e.c.z2 r6 = r11.f3113g
            g.e.a.b.e.c.t2 r6 = r6.t()
            boolean r7 = r6.y()
            boolean r8 = r14.I()
            if (r8 == 0) goto L_0x009c
            boolean r8 = r6.A()
            if (r8 != 0) goto L_0x008e
            g.e.a.b.f.b.ca r6 = r11.f3114h
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.f3 r6 = r6.d()
            g.e.a.b.f.b.d3 r6 = r6.f3139i
            g.e.a.b.f.b.ca r7 = r11.f3114h
            g.e.a.b.f.b.n4 r7 = r7.a
            g.e.a.b.f.b.a3 r7 = r7.f3264m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            goto L_0x0174
        L_0x008e:
            long r8 = r14.t()
            g.e.a.b.e.c.x2 r2 = r6.u()
            java.lang.Boolean r2 = g.e.a.b.f.b.aa.f(r8, r2)
            goto L_0x0155
        L_0x009c:
            boolean r8 = r14.H()
            if (r8 == 0) goto L_0x00db
            boolean r8 = r6.A()
            if (r8 != 0) goto L_0x00c4
            g.e.a.b.f.b.ca r6 = r11.f3114h
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.f3 r6 = r6.d()
            g.e.a.b.f.b.d3 r6 = r6.f3139i
            g.e.a.b.f.b.ca r7 = r11.f3114h
            g.e.a.b.f.b.n4 r7 = r7.a
            g.e.a.b.f.b.a3 r7 = r7.f3264m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0174
        L_0x00c4:
            double r8 = r14.s()
            g.e.a.b.e.c.x2 r6 = r6.u()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0155 }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x0155 }
            double r8 = java.lang.Math.ulp(r8)     // Catch:{ NumberFormatException -> 0x0155 }
            java.lang.Boolean r2 = g.e.a.b.f.b.aa.d(r10, r6, r8)     // Catch:{ NumberFormatException -> 0x0155 }
            goto L_0x0155
        L_0x00db:
            boolean r8 = r14.K()
            if (r8 == 0) goto L_0x015a
            boolean r8 = r6.C()
            if (r8 != 0) goto L_0x0141
            boolean r8 = r6.A()
            if (r8 != 0) goto L_0x0108
            g.e.a.b.f.b.ca r6 = r11.f3114h
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.f3 r6 = r6.d()
            g.e.a.b.f.b.d3 r6 = r6.f3139i
            g.e.a.b.f.b.ca r7 = r11.f3114h
            g.e.a.b.f.b.n4 r7 = r7.a
            g.e.a.b.f.b.a3 r7 = r7.f3264m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0174
        L_0x0108:
            java.lang.String r8 = r14.y()
            boolean r8 = g.e.a.b.f.b.m9.L(r8)
            if (r8 == 0) goto L_0x011f
            java.lang.String r2 = r14.y()
            g.e.a.b.e.c.x2 r6 = r6.u()
            java.lang.Boolean r2 = g.e.a.b.f.b.aa.g(r2, r6)
            goto L_0x0155
        L_0x011f:
            g.e.a.b.f.b.ca r6 = r11.f3114h
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.f3 r6 = r6.d()
            g.e.a.b.f.b.d3 r6 = r6.f3139i
            g.e.a.b.f.b.ca r7 = r11.f3114h
            g.e.a.b.f.b.n4 r7 = r7.a
            g.e.a.b.f.b.a3 r7 = r7.f3264m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = r14.y()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0177
        L_0x0141:
            java.lang.String r2 = r14.y()
            g.e.a.b.e.c.d3 r6 = r6.v()
            g.e.a.b.f.b.ca r8 = r11.f3114h
            g.e.a.b.f.b.n4 r8 = r8.a
            g.e.a.b.f.b.f3 r8 = r8.d()
            java.lang.Boolean r2 = g.e.a.b.f.b.aa.e(r2, r6, r8)
        L_0x0155:
            java.lang.Boolean r2 = g.e.a.b.f.b.aa.h(r2, r7)
            goto L_0x0177
        L_0x015a:
            g.e.a.b.f.b.ca r6 = r11.f3114h
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.f3 r6 = r6.d()
            g.e.a.b.f.b.d3 r6 = r6.f3139i
            g.e.a.b.f.b.ca r7 = r11.f3114h
            g.e.a.b.f.b.n4 r7 = r7.a
            g.e.a.b.f.b.a3 r7 = r7.f3264m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "User property has no value, property"
        L_0x0174:
            r6.b(r8, r7)
        L_0x0177:
            g.e.a.b.f.b.ca r6 = r11.f3114h
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.f3 r6 = r6.d()
            g.e.a.b.f.b.d3 r6 = r6.n
            if (r2 != 0) goto L_0x0186
            java.lang.String r7 = "null"
            goto L_0x0187
        L_0x0186:
            r7 = r2
        L_0x0187:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r2 != 0) goto L_0x018f
            return r5
        L_0x018f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r11.c = r5
            if (r3 == 0) goto L_0x019d
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            return r4
        L_0x019d:
            if (r15 == 0) goto L_0x01a7
            g.e.a.b.e.c.z2 r15 = r11.f3113g
            boolean r15 = r15.y()
            if (r15 == 0) goto L_0x01a9
        L_0x01a7:
            r11.f3110d = r2
        L_0x01a9:
            boolean r15 = r2.booleanValue()
            if (r15 == 0) goto L_0x01ee
            if (r1 == 0) goto L_0x01ee
            boolean r15 = r14.J()
            if (r15 == 0) goto L_0x01ee
            long r14 = r14.u()
            if (r12 == 0) goto L_0x01c1
            long r14 = r12.longValue()
        L_0x01c1:
            if (r0 == 0) goto L_0x01d9
            g.e.a.b.e.c.z2 r12 = r11.f3113g
            boolean r12 = r12.y()
            if (r12 == 0) goto L_0x01d9
            g.e.a.b.e.c.z2 r12 = r11.f3113g
            boolean r12 = r12.z()
            if (r12 != 0) goto L_0x01d9
            if (r13 == 0) goto L_0x01d9
            long r14 = r13.longValue()
        L_0x01d9:
            g.e.a.b.e.c.z2 r12 = r11.f3113g
            boolean r12 = r12.z()
            if (r12 == 0) goto L_0x01e8
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f3112f = r12
            goto L_0x01ee
        L_0x01e8:
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f3111e = r12
        L_0x01ee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.ba.i(java.lang.Long, java.lang.Long, g.e.a.b.e.c.p4, boolean):boolean");
    }
}
