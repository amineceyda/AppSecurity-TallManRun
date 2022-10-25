package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class s extends a0.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3670d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3671e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3672f;

    public static final class b extends a0.e.d.c.a {
        public Double a;
        public Integer b;
        public Boolean c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f3673d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3674e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3675f;

        public a0.e.d.c a() {
            String str = this.b == null ? " batteryVelocity" : "";
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " proximityOn");
            }
            if (this.f3673d == null) {
                str = g.a.a.a.a.w(str, " orientation");
            }
            if (this.f3674e == null) {
                str = g.a.a.a.a.w(str, " ramUsed");
            }
            if (this.f3675f == null) {
                str = g.a.a.a.a.w(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new s(this.a, this.b.intValue(), this.c.booleanValue(), this.f3673d.intValue(), this.f3674e.longValue(), this.f3675f.longValue(), (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }
    }

    public s(Double d2, int i2, boolean z, int i3, long j2, long j3, a aVar) {
        this.a = d2;
        this.b = i2;
        this.c = z;
        this.f3670d = i3;
        this.f3671e = j2;
        this.f3672f = j3;
    }

    public Double a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.f3672f;
    }

    public int d() {
        return this.f3670d;
    }

    public long e() {
        return this.f3671e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.c)) {
            return false;
        }
        a0.e.d.c cVar = (a0.e.d.c) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(cVar.a()) : cVar.a() == null) {
            return this.b == cVar.b() && this.c == cVar.f() && this.f3670d == cVar.d() && this.f3671e == cVar.e() && this.f3672f == cVar.c();
        }
    }

    public boolean f() {
        return this.c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        int i2 = this.c ? 1231 : 1237;
        long j2 = this.f3671e;
        long j3 = this.f3672f;
        return ((((((hashCode ^ i2) * 1000003) ^ this.f3670d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Device{batteryLevel=");
        i2.append(this.a);
        i2.append(", batteryVelocity=");
        i2.append(this.b);
        i2.append(", proximityOn=");
        i2.append(this.c);
        i2.append(", orientation=");
        i2.append(this.f3670d);
        i2.append(", ramUsed=");
        i2.append(this.f3671e);
        i2.append(", diskUsed=");
        i2.append(this.f3672f);
        i2.append("}");
        return i2.toString();
    }
}
