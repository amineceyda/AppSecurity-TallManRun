package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class r extends a0.e.d.a.b.C0118d.C0119a {
    public final long a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3666d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3667e;

    public static final class b extends a0.e.d.a.b.C0118d.C0119a.C0120a {
        public Long a;
        public String b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3668d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f3669e;

        public a0.e.d.a.b.C0118d.C0119a a() {
            String str = this.a == null ? " pc" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " symbol");
            }
            if (this.f3668d == null) {
                str = g.a.a.a.a.w(str, " offset");
            }
            if (this.f3669e == null) {
                str = g.a.a.a.a.w(str, " importance");
            }
            if (str.isEmpty()) {
                return new r(this.a.longValue(), this.b, this.c, this.f3668d.longValue(), this.f3669e.intValue(), (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }
    }

    public r(long j2, String str, String str2, long j3, int i2, a aVar) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.f3666d = j3;
        this.f3667e = i2;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.f3667e;
    }

    public long c() {
        return this.f3666d;
    }

    public long d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof g.e.b.l.j.l.a0.e.d.a.b.C0118d.C0119a
            r2 = 0
            if (r1 == 0) goto L_0x004b
            g.e.b.l.j.l.a0$e$d$a$b$d$a r8 = (g.e.b.l.j.l.a0.e.d.a.b.C0118d.C0119a) r8
            long r3 = r7.a
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.a()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f3666d
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f3667e
            int r8 = r8.b()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.l.r.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f3666d;
        return this.f3667e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Frame{pc=");
        i2.append(this.a);
        i2.append(", symbol=");
        i2.append(this.b);
        i2.append(", file=");
        i2.append(this.c);
        i2.append(", offset=");
        i2.append(this.f3666d);
        i2.append(", importance=");
        return g.a.a.a.a.e(i2, this.f3667e, "}");
    }
}
