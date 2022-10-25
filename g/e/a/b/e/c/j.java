package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class j implements p, l {
    public final String b;
    public final Map c = new HashMap();

    public j(String str) {
        this.b = str;
    }

    public abstract p a(h4 h4Var, List list);

    public final boolean c(String str) {
        return this.c.containsKey(str);
    }

    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.b;
        if (str != null) {
            return str.equals(jVar.b);
        }
        return false;
    }

    public final Iterator f() {
        return new k(this.c.keySet().iterator());
    }

    public final p h(String str) {
        return this.c.containsKey(str) ? (p) this.c.get(str) : p.E;
    }

    public final int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final p i(String str, h4 h4Var, List list) {
        return "toString".equals(str) ? new t(this.b) : e.s(this, new t(str), h4Var, list);
    }

    public p l() {
        return this;
    }

    public final Boolean m() {
        return Boolean.TRUE;
    }

    public final void p(String str, p pVar) {
        if (pVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, pVar);
        }
    }
}
