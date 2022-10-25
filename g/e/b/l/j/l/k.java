package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;
import java.util.Objects;

public final class k extends a0.e.d {
    public final long a;
    public final String b;
    public final a0.e.d.a c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.c f3653d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.e.d.C0121d f3654e;

    public static final class b extends a0.e.d.b {
        public Long a;
        public String b;
        public a0.e.d.a c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.c f3655d;

        /* renamed from: e  reason: collision with root package name */
        public a0.e.d.C0121d f3656e;

        public b() {
        }

        public b(a0.e.d dVar, a aVar) {
            k kVar = (k) dVar;
            this.a = Long.valueOf(kVar.a);
            this.b = kVar.b;
            this.c = kVar.c;
            this.f3655d = kVar.f3653d;
            this.f3656e = kVar.f3654e;
        }

        public a0.e.d a() {
            String str = this.a == null ? " timestamp" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " type");
            }
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " app");
            }
            if (this.f3655d == null) {
                str = g.a.a.a.a.w(str, " device");
            }
            if (str.isEmpty()) {
                return new k(this.a.longValue(), this.b, this.c, this.f3655d, this.f3656e, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public a0.e.d.b b(a0.e.d.a aVar) {
            this.c = aVar;
            return this;
        }

        public a0.e.d.b c(a0.e.d.c cVar) {
            this.f3655d = cVar;
            return this;
        }

        public a0.e.d.b d(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        public a0.e.d.b e(String str) {
            Objects.requireNonNull(str, "Null type");
            this.b = str;
            return this;
        }
    }

    public k(long j2, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.C0121d dVar, a aVar2) {
        this.a = j2;
        this.b = str;
        this.c = aVar;
        this.f3653d = cVar;
        this.f3654e = dVar;
    }

    public a0.e.d.a a() {
        return this.c;
    }

    public a0.e.d.c b() {
        return this.f3653d;
    }

    public a0.e.d.C0121d c() {
        return this.f3654e;
    }

    public long d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d)) {
            return false;
        }
        a0.e.d dVar = (a0.e.d) obj;
        if (this.a == dVar.d() && this.b.equals(dVar.e()) && this.c.equals(dVar.a()) && this.f3653d.equals(dVar.b())) {
            a0.e.d.C0121d dVar2 = this.f3654e;
            a0.e.d.C0121d c2 = dVar.c();
            if (dVar2 == null) {
                if (c2 == null) {
                    return true;
                }
            } else if (dVar2.equals(c2)) {
                return true;
            }
        }
        return false;
    }

    public a0.e.d.b f() {
        return new b(this, (a) null);
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f3653d.hashCode()) * 1000003;
        a0.e.d.C0121d dVar = this.f3654e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Event{timestamp=");
        i2.append(this.a);
        i2.append(", type=");
        i2.append(this.b);
        i2.append(", app=");
        i2.append(this.c);
        i2.append(", device=");
        i2.append(this.f3653d);
        i2.append(", log=");
        i2.append(this.f3654e);
        i2.append("}");
        return i2.toString();
    }
}
