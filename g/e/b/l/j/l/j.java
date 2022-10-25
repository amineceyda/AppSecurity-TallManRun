package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class j extends a0.e.c {
    public final int a;
    public final String b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3641d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3642e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3643f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3644g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3645h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3646i;

    public static final class b extends a0.e.c.a {
        public Integer a;
        public String b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3647d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3648e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f3649f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f3650g;

        /* renamed from: h  reason: collision with root package name */
        public String f3651h;

        /* renamed from: i  reason: collision with root package name */
        public String f3652i;

        public a0.e.c a() {
            String str = this.a == null ? " arch" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " model");
            }
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " cores");
            }
            if (this.f3647d == null) {
                str = g.a.a.a.a.w(str, " ram");
            }
            if (this.f3648e == null) {
                str = g.a.a.a.a.w(str, " diskSpace");
            }
            if (this.f3649f == null) {
                str = g.a.a.a.a.w(str, " simulator");
            }
            if (this.f3650g == null) {
                str = g.a.a.a.a.w(str, " state");
            }
            if (this.f3651h == null) {
                str = g.a.a.a.a.w(str, " manufacturer");
            }
            if (this.f3652i == null) {
                str = g.a.a.a.a.w(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new j(this.a.intValue(), this.b, this.c.intValue(), this.f3647d.longValue(), this.f3648e.longValue(), this.f3649f.booleanValue(), this.f3650g.intValue(), this.f3651h, this.f3652i, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }
    }

    public j(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3, a aVar) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.f3641d = j2;
        this.f3642e = j3;
        this.f3643f = z;
        this.f3644g = i4;
        this.f3645h = str2;
        this.f3646i = str3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public long c() {
        return this.f3642e;
    }

    public String d() {
        return this.f3645h;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.c)) {
            return false;
        }
        a0.e.c cVar = (a0.e.c) obj;
        return this.a == cVar.a() && this.b.equals(cVar.e()) && this.c == cVar.b() && this.f3641d == cVar.g() && this.f3642e == cVar.c() && this.f3643f == cVar.i() && this.f3644g == cVar.h() && this.f3645h.equals(cVar.d()) && this.f3646i.equals(cVar.f());
    }

    public String f() {
        return this.f3646i;
    }

    public long g() {
        return this.f3641d;
    }

    public int h() {
        return this.f3644g;
    }

    public int hashCode() {
        long j2 = this.f3641d;
        long j3 = this.f3642e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f3643f ? 1231 : 1237)) * 1000003) ^ this.f3644g) * 1000003) ^ this.f3645h.hashCode()) * 1000003) ^ this.f3646i.hashCode();
    }

    public boolean i() {
        return this.f3643f;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Device{arch=");
        i2.append(this.a);
        i2.append(", model=");
        i2.append(this.b);
        i2.append(", cores=");
        i2.append(this.c);
        i2.append(", ram=");
        i2.append(this.f3641d);
        i2.append(", diskSpace=");
        i2.append(this.f3642e);
        i2.append(", simulator=");
        i2.append(this.f3643f);
        i2.append(", state=");
        i2.append(this.f3644g);
        i2.append(", manufacturer=");
        i2.append(this.f3645h);
        i2.append(", modelClass=");
        return g.a.a.a.a.f(i2, this.f3646i, "}");
    }
}
