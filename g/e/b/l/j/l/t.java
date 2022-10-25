package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class t extends a0.e.d.C0121d {
    public final String a;

    public t(String str, a aVar) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.C0121d) {
            return this.a.equals(((a0.e.d.C0121d) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return g.a.a.a.a.f(g.a.a.a.a.i("Log{content="), this.a, "}");
    }
}
