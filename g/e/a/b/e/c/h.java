package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.List;

public final class h implements p {
    public final p b;
    public final String c;

    public h() {
        throw null;
    }

    public h(String str) {
        this.b = p.E;
        this.c = str;
    }

    public h(String str, p pVar) {
        this.b = pVar;
        this.c = str;
    }

    public final Double d() {
        throw new IllegalStateException("Control is not a double");
    }

    public final String e() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.c.equals(hVar.c) && this.b.equals(hVar.b);
    }

    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }

    public final p i(String str, h4 h4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final p l() {
        return new h(this.c, this.b.l());
    }

    public final Boolean m() {
        throw new IllegalStateException("Control is not a boolean");
    }
}
