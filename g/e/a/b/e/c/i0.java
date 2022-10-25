package g.e.a.b.e.c;

import g.a.a.a.a;
import g.e.a.b.b.h.e;
import java.util.List;

public final class i0 extends w {
    public i0() {
        this.a.add(l0.ADD);
        this.a.add(l0.DIVIDE);
        this.a.add(l0.MODULUS);
        this.a.add(l0.MULTIPLY);
        this.a.add(l0.NEGATE);
        this.a.add(l0.POST_DECREMENT);
        this.a.add(l0.POST_INCREMENT);
        this.a.add(l0.PRE_DECREMENT);
        this.a.add(l0.PRE_INCREMENT);
        this.a.add(l0.SUBTRACT);
    }

    public final p a(String str, h4 h4Var, List list) {
        l0 l0Var = l0.ADD;
        int ordinal = e.T(str).ordinal();
        if (ordinal == 0) {
            p b = h4Var.b((p) a.m(l0Var, 2, list, 0));
            p b2 = h4Var.b((p) list.get(1));
            if ((b instanceof l) || (b instanceof t) || (b2 instanceof l) || (b2 instanceof t)) {
                String valueOf = String.valueOf(b.e());
                String valueOf2 = String.valueOf(b2.e());
                return new t(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            return new i(Double.valueOf(b2.d().doubleValue() + b.d().doubleValue()));
        } else if (ordinal == 21) {
            return new i(Double.valueOf(h4Var.b((p) a.m(l0.DIVIDE, 2, list, 0)).d().doubleValue() / h4Var.b((p) list.get(1)).d().doubleValue()));
        } else {
            if (ordinal == 59) {
                p b3 = h4Var.b((p) a.m(l0.SUBTRACT, 2, list, 0));
                return new i(Double.valueOf(new i(Double.valueOf(-h4Var.b((p) list.get(1)).d().doubleValue())).b.doubleValue() + b3.d().doubleValue()));
            } else if (ordinal == 52 || ordinal == 53) {
                e.a0(str, 2, list);
                p b4 = h4Var.b((p) list.get(0));
                h4Var.b((p) list.get(1));
                return b4;
            } else if (ordinal == 55 || ordinal == 56) {
                e.a0(str, 1, list);
                return h4Var.b((p) list.get(0));
            } else {
                switch (ordinal) {
                    case 44:
                        return new i(Double.valueOf(h4Var.b((p) a.m(l0.MODULUS, 2, list, 0)).d().doubleValue() % h4Var.b((p) list.get(1)).d().doubleValue()));
                    case 45:
                        return new i(Double.valueOf(h4Var.b((p) a.m(l0.MULTIPLY, 2, list, 0)).d().doubleValue() * h4Var.b((p) list.get(1)).d().doubleValue()));
                    case 46:
                        return new i(Double.valueOf(-h4Var.b((p) a.m(l0.NEGATE, 1, list, 0)).d().doubleValue()));
                    default:
                        b(str);
                        throw null;
                }
            }
        }
    }
}
