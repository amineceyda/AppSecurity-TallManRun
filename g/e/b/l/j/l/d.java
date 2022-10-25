package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class d extends a0.c {
    public final String a;
    public final String b;

    public d(String str, String str2, a aVar) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return this.a.equals(cVar.a()) && this.b.equals(cVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("CustomAttribute{key=");
        i2.append(this.a);
        i2.append(", value=");
        return g.a.a.a.a.f(i2, this.b, "}");
    }
}
