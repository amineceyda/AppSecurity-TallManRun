package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class e extends a0.d {
    public final b0<a0.d.a> a;
    public final String b;

    public e(b0 b0Var, String str, a aVar) {
        this.a = b0Var;
        this.b = str;
    }

    public b0<a0.d.a> a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d)) {
            return false;
        }
        a0.d dVar = (a0.d) obj;
        if (this.a.equals(dVar.a())) {
            String str = this.b;
            String b2 = dVar.b();
            if (str == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (str.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("FilesPayload{files=");
        i2.append(this.a);
        i2.append(", orgId=");
        return g.a.a.a.a.f(i2, this.b, "}");
    }
}
