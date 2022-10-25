package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class n extends a0.e.d.a.b.C0116a {
    public final long a;
    public final long b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3663d;

    public n(long j2, long j3, String str, String str2, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.f3663d = str2;
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.f3663d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0116a)) {
            return false;
        }
        a0.e.d.a.b.C0116a aVar = (a0.e.d.a.b.C0116a) obj;
        if (this.a == aVar.a() && this.b == aVar.c() && this.c.equals(aVar.b())) {
            String str = this.f3663d;
            String d2 = aVar.d();
            if (str == null) {
                if (d2 == null) {
                    return true;
                }
            } else if (str.equals(d2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.f3663d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("BinaryImage{baseAddress=");
        i2.append(this.a);
        i2.append(", size=");
        i2.append(this.b);
        i2.append(", name=");
        i2.append(this.c);
        i2.append(", uuid=");
        return g.a.a.a.a.f(i2, this.f3663d, "}");
    }
}
