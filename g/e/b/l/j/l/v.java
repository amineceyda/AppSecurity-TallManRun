package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class v extends a0.e.f {
    public final String a;

    public v(String str, a aVar) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.a.equals(((a0.e.f) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return g.a.a.a.a.f(g.a.a.a.a.i("User{identifier="), this.a, "}");
    }
}
