package g.e.a.b.e.c;

import g.a.a.a.a;
import g.e.a.b.b.h.e;
import java.util.List;

public final class c0 extends w {
    public c0() {
        this.a.add(l0.AND);
        this.a.add(l0.NOT);
        this.a.add(l0.OR);
    }

    public final p a(String str, h4 h4Var, List list) {
        l0 l0Var = l0.ADD;
        int ordinal = e.T(str).ordinal();
        if (ordinal == 1) {
            p b = h4Var.b((p) a.m(l0.AND, 2, list, 0));
            if (!b.m().booleanValue()) {
                return b;
            }
        } else if (ordinal == 47) {
            return new g(Boolean.valueOf(!h4Var.b((p) a.m(l0.NOT, 1, list, 0)).m().booleanValue()));
        } else {
            if (ordinal == 50) {
                p b2 = h4Var.b((p) a.m(l0.OR, 2, list, 0));
                if (b2.m().booleanValue()) {
                    return b2;
                }
            } else {
                b(str);
                throw null;
            }
        }
        return h4Var.b((p) list.get(1));
    }
}
