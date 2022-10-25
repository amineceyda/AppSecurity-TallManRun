package g.e.a.b.e.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class h4 {
    public final h4 a;
    public final x b;
    public final Map c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map f2941d = new HashMap();

    public h4(h4 h4Var, x xVar) {
        this.a = h4Var;
        this.b = xVar;
    }

    public final h4 a() {
        return new h4(this, this.b);
    }

    public final p b(p pVar) {
        return this.b.a(this, pVar);
    }

    public final p c(f fVar) {
        p pVar = p.E;
        Iterator x = fVar.x();
        while (x.hasNext()) {
            pVar = this.b.a(this, fVar.v(((Integer) x.next()).intValue()));
            if (pVar instanceof h) {
                break;
            }
        }
        return pVar;
    }

    public final p d(String str) {
        if (this.c.containsKey(str)) {
            return (p) this.c.get(str);
        }
        h4 h4Var = this.a;
        if (h4Var != null) {
            return h4Var.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    public final void e(String str, p pVar) {
        if (!this.f2941d.containsKey(str)) {
            if (pVar == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, pVar);
            }
        }
    }

    public final void f(String str, p pVar) {
        h4 h4Var;
        if (!this.c.containsKey(str) && (h4Var = this.a) != null && h4Var.g(str)) {
            this.a.f(str, pVar);
        } else if (!this.f2941d.containsKey(str)) {
            if (pVar == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, pVar);
            }
        }
    }

    public final boolean g(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        h4 h4Var = this.a;
        if (h4Var != null) {
            return h4Var.g(str);
        }
        return false;
    }
}
