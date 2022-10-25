package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class l extends a0.e.d.a {
    public final a0.e.d.a.b a;
    public final b0<a0.c> b;
    public final b0<a0.c> c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f3657d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3658e;

    public static final class b extends a0.e.d.a.C0115a {
        public a0.e.d.a.b a;
        public b0<a0.c> b;
        public b0<a0.c> c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f3659d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f3660e;

        public b() {
        }

        public b(a0.e.d.a aVar, a aVar2) {
            l lVar = (l) aVar;
            this.a = lVar.a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.f3659d = lVar.f3657d;
            this.f3660e = Integer.valueOf(lVar.f3658e);
        }

        public a0.e.d.a a() {
            String str = this.a == null ? " execution" : "";
            if (this.f3660e == null) {
                str = g.a.a.a.a.w(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.f3659d, this.f3660e.intValue(), (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i2, a aVar) {
        this.a = bVar;
        this.b = b0Var;
        this.c = b0Var2;
        this.f3657d = bool;
        this.f3658e = i2;
    }

    public Boolean a() {
        return this.f3657d;
    }

    public b0<a0.c> b() {
        return this.b;
    }

    public a0.e.d.a.b c() {
        return this.a;
    }

    public b0<a0.c> d() {
        return this.c;
    }

    public int e() {
        return this.f3658e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f3657d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof g.e.b.l.j.l.a0.e.d.a
            r2 = 0
            if (r1 == 0) goto L_0x0061
            g.e.b.l.j.l.a0$e$d$a r5 = (g.e.b.l.j.l.a0.e.d.a) r5
            g.e.b.l.j.l.a0$e$d$a$b r1 = r4.a
            g.e.b.l.j.l.a0$e$d$a$b r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
            g.e.b.l.j.l.b0<g.e.b.l.j.l.a0$c> r1 = r4.b
            if (r1 != 0) goto L_0x0022
            g.e.b.l.j.l.b0 r1 = r5.b()
            if (r1 != 0) goto L_0x005f
            goto L_0x002c
        L_0x0022:
            g.e.b.l.j.l.b0 r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x002c:
            g.e.b.l.j.l.b0<g.e.b.l.j.l.a0$c> r1 = r4.c
            if (r1 != 0) goto L_0x0037
            g.e.b.l.j.l.b0 r1 = r5.d()
            if (r1 != 0) goto L_0x005f
            goto L_0x0041
        L_0x0037:
            g.e.b.l.j.l.b0 r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0041:
            java.lang.Boolean r1 = r4.f3657d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.a()
            if (r1 != 0) goto L_0x005f
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0056:
            int r1 = r4.f3658e
            int r5 = r5.e()
            if (r1 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.l.l.equals(java.lang.Object):boolean");
    }

    public a0.e.d.a.C0115a f() {
        return new b(this, (a) null);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f3657d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((hashCode3 ^ i2) * 1000003) ^ this.f3658e;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Application{execution=");
        i2.append(this.a);
        i2.append(", customAttributes=");
        i2.append(this.b);
        i2.append(", internalKeys=");
        i2.append(this.c);
        i2.append(", background=");
        i2.append(this.f3657d);
        i2.append(", uiOrientation=");
        return g.a.a.a.a.e(i2, this.f3658e, "}");
    }
}
