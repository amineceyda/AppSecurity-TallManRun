package g.e.b.r.m;

import g.e.b.r.m.f;

public final class b extends f {
    public final String a;
    public final long b;
    public final f.b c;

    /* renamed from: g.e.b.r.m.b$b  reason: collision with other inner class name */
    public static final class C0127b extends f.a {
        public String a;
        public Long b;
        public f.b c;

        public f a() {
            String str = this.b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public f.a b(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    public b(String str, long j2, f.b bVar, a aVar) {
        this.a = str;
        this.b = j2;
        this.c = bVar;
    }

    public f.b b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.b == fVar.d()) {
                f.b bVar = this.c;
                f.b b2 = fVar.b();
                if (bVar == null) {
                    if (b2 == null) {
                        return true;
                    }
                } else if (bVar.equals(b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("TokenResult{token=");
        i2.append(this.a);
        i2.append(", tokenExpirationTimestamp=");
        i2.append(this.b);
        i2.append(", responseCode=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
