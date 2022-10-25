package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class c extends a0.a {
    public final int a;
    public final String b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3611d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3612e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3613f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3614g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3615h;

    public static final class b extends a0.a.C0113a {
        public Integer a;
        public String b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f3616d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3617e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3618f;

        /* renamed from: g  reason: collision with root package name */
        public Long f3619g;

        /* renamed from: h  reason: collision with root package name */
        public String f3620h;

        public a0.a a() {
            String str = this.a == null ? " pid" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " processName");
            }
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " reasonCode");
            }
            if (this.f3616d == null) {
                str = g.a.a.a.a.w(str, " importance");
            }
            if (this.f3617e == null) {
                str = g.a.a.a.a.w(str, " pss");
            }
            if (this.f3618f == null) {
                str = g.a.a.a.a.w(str, " rss");
            }
            if (this.f3619g == null) {
                str = g.a.a.a.a.w(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.a.intValue(), this.b, this.c.intValue(), this.f3616d.intValue(), this.f3617e.longValue(), this.f3618f.longValue(), this.f3619g.longValue(), this.f3620h, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }
    }

    public c(int i2, String str, int i3, int i4, long j2, long j3, long j4, String str2, a aVar) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.f3611d = i4;
        this.f3612e = j2;
        this.f3613f = j3;
        this.f3614g = j4;
        this.f3615h = str2;
    }

    public int a() {
        return this.f3611d;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public long d() {
        return this.f3612e;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        if (this.a == aVar.b() && this.b.equals(aVar.c()) && this.c == aVar.e() && this.f3611d == aVar.a() && this.f3612e == aVar.d() && this.f3613f == aVar.f() && this.f3614g == aVar.g()) {
            String str = this.f3615h;
            String h2 = aVar.h();
            if (str == null) {
                if (h2 == null) {
                    return true;
                }
            } else if (str.equals(h2)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f3613f;
    }

    public long g() {
        return this.f3614g;
    }

    public String h() {
        return this.f3615h;
    }

    public int hashCode() {
        long j2 = this.f3612e;
        long j3 = this.f3613f;
        long j4 = this.f3614g;
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.f3611d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str = this.f3615h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ApplicationExitInfo{pid=");
        i2.append(this.a);
        i2.append(", processName=");
        i2.append(this.b);
        i2.append(", reasonCode=");
        i2.append(this.c);
        i2.append(", importance=");
        i2.append(this.f3611d);
        i2.append(", pss=");
        i2.append(this.f3612e);
        i2.append(", rss=");
        i2.append(this.f3613f);
        i2.append(", timestamp=");
        i2.append(this.f3614g);
        i2.append(", traceFile=");
        return g.a.a.a.a.f(i2, this.f3615h, "}");
    }
}
