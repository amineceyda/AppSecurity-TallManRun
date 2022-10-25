package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class p extends a0.e.d.a.b.c {
    public final String a;
    public final String b;
    public final long c;

    public p(String str, String str2, long j2, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = j2;
    }

    public long a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.c)) {
            return false;
        }
        a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public int hashCode() {
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Signal{name=");
        i2.append(this.a);
        i2.append(", code=");
        i2.append(this.b);
        i2.append(", address=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
