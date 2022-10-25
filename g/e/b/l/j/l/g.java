package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class g extends a0.e {
    public final String a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f3621d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3622e;

    /* renamed from: f  reason: collision with root package name */
    public final a0.e.a f3623f;

    /* renamed from: g  reason: collision with root package name */
    public final a0.e.f f3624g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e.C0122e f3625h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.e.c f3626i;

    /* renamed from: j  reason: collision with root package name */
    public final b0<a0.e.d> f3627j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3628k;

    public static final class b extends a0.e.b {
        public String a;
        public String b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3629d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f3630e;

        /* renamed from: f  reason: collision with root package name */
        public a0.e.a f3631f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e.f f3632g;

        /* renamed from: h  reason: collision with root package name */
        public a0.e.C0122e f3633h;

        /* renamed from: i  reason: collision with root package name */
        public a0.e.c f3634i;

        /* renamed from: j  reason: collision with root package name */
        public b0<a0.e.d> f3635j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f3636k;

        public b() {
        }

        public b(a0.e eVar, a aVar) {
            g gVar = (g) eVar;
            this.a = gVar.a;
            this.b = gVar.b;
            this.c = Long.valueOf(gVar.c);
            this.f3629d = gVar.f3621d;
            this.f3630e = Boolean.valueOf(gVar.f3622e);
            this.f3631f = gVar.f3623f;
            this.f3632g = gVar.f3624g;
            this.f3633h = gVar.f3625h;
            this.f3634i = gVar.f3626i;
            this.f3635j = gVar.f3627j;
            this.f3636k = Integer.valueOf(gVar.f3628k);
        }

        public a0.e a() {
            String str = this.a == null ? " generator" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " identifier");
            }
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " startedAt");
            }
            if (this.f3630e == null) {
                str = g.a.a.a.a.w(str, " crashed");
            }
            if (this.f3631f == null) {
                str = g.a.a.a.a.w(str, " app");
            }
            if (this.f3636k == null) {
                str = g.a.a.a.a.w(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b, this.c.longValue(), this.f3629d, this.f3630e.booleanValue(), this.f3631f, this.f3632g, this.f3633h, this.f3634i, this.f3635j, this.f3636k.intValue(), (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public a0.e.b b(boolean z) {
            this.f3630e = Boolean.valueOf(z);
            return this;
        }
    }

    public g(String str, String str2, long j2, Long l2, boolean z, a0.e.a aVar, a0.e.f fVar, a0.e.C0122e eVar, a0.e.c cVar, b0 b0Var, int i2, a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f3621d = l2;
        this.f3622e = z;
        this.f3623f = aVar;
        this.f3624g = fVar;
        this.f3625h = eVar;
        this.f3626i = cVar;
        this.f3627j = b0Var;
        this.f3628k = i2;
    }

    public a0.e.a a() {
        return this.f3623f;
    }

    public a0.e.c b() {
        return this.f3626i;
    }

    public Long c() {
        return this.f3621d;
    }

    public b0<a0.e.d> d() {
        return this.f3627j;
    }

    public String e() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f3621d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f3624g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f3625h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f3626i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f3627j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof g.e.b.l.j.l.a0.e
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            g.e.b.l.j.l.a0$e r8 = (g.e.b.l.j.l.a0.e) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.c
            long r5 = r8.i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f3621d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f3622e
            boolean r3 = r8.k()
            if (r1 != r3) goto L_0x00b3
            g.e.b.l.j.l.a0$e$a r1 = r7.f3623f
            g.e.b.l.j.l.a0$e$a r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            g.e.b.l.j.l.a0$e$f r1 = r7.f3624g
            if (r1 != 0) goto L_0x0061
            g.e.b.l.j.l.a0$e$f r1 = r8.j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            g.e.b.l.j.l.a0$e$f r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            g.e.b.l.j.l.a0$e$e r1 = r7.f3625h
            if (r1 != 0) goto L_0x0076
            g.e.b.l.j.l.a0$e$e r1 = r8.h()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            g.e.b.l.j.l.a0$e$e r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            g.e.b.l.j.l.a0$e$c r1 = r7.f3626i
            if (r1 != 0) goto L_0x008b
            g.e.b.l.j.l.a0$e$c r1 = r8.b()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            g.e.b.l.j.l.a0$e$c r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            g.e.b.l.j.l.b0<g.e.b.l.j.l.a0$e$d> r1 = r7.f3627j
            if (r1 != 0) goto L_0x00a0
            g.e.b.l.j.l.b0 r1 = r8.d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            g.e.b.l.j.l.b0 r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f3628k
            int r8 = r8.f()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.l.g.equals(java.lang.Object):boolean");
    }

    public int f() {
        return this.f3628k;
    }

    public String g() {
        return this.b;
    }

    public a0.e.C0122e h() {
        return this.f3625h;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f3621d;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f3622e ? 1231 : 1237)) * 1000003) ^ this.f3623f.hashCode()) * 1000003;
        a0.e.f fVar = this.f3624g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.C0122e eVar = this.f3625h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.e.c cVar = this.f3626i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f3627j;
        if (b0Var != null) {
            i2 = b0Var.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.f3628k;
    }

    public long i() {
        return this.c;
    }

    public a0.e.f j() {
        return this.f3624g;
    }

    public boolean k() {
        return this.f3622e;
    }

    public a0.e.b l() {
        return new b(this, (a) null);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Session{generator=");
        i2.append(this.a);
        i2.append(", identifier=");
        i2.append(this.b);
        i2.append(", startedAt=");
        i2.append(this.c);
        i2.append(", endedAt=");
        i2.append(this.f3621d);
        i2.append(", crashed=");
        i2.append(this.f3622e);
        i2.append(", app=");
        i2.append(this.f3623f);
        i2.append(", user=");
        i2.append(this.f3624g);
        i2.append(", os=");
        i2.append(this.f3625h);
        i2.append(", device=");
        i2.append(this.f3626i);
        i2.append(", events=");
        i2.append(this.f3627j);
        i2.append(", generatorType=");
        return g.a.a.a.a.e(i2, this.f3628k, "}");
    }
}
