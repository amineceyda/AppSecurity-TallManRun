package g.e.a.a.f.z.h;

import g.e.a.a.f.z.h.t;
import java.util.Set;

public final class r extends t.a {
    public final long a;
    public final long b;
    public final Set<t.b> c;

    public static final class b extends t.a.C0105a {
        public Long a;
        public Long b;
        public Set<t.b> c;

        public t.a a() {
            String str = this.a == null ? " delta" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " flags");
            }
            if (str.isEmpty()) {
                return new r(this.a.longValue(), this.b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public t.a.C0105a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public t.a.C0105a c(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    public r(long j2, long j3, Set set, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = set;
    }

    public long b() {
        return this.a;
    }

    public Set<t.b> c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        return this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c());
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ConfigValue{delta=");
        i2.append(this.a);
        i2.append(", maxAllowedDelay=");
        i2.append(this.b);
        i2.append(", flags=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
