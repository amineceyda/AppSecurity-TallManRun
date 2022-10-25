package g.e.a.b.e.c;

import g.a.a.a.a;
import g.e.a.b.b.h.e;
import java.util.List;

public final class v extends w {
    public v() {
        this.a.add(l0.BITWISE_AND);
        this.a.add(l0.BITWISE_LEFT_SHIFT);
        this.a.add(l0.BITWISE_NOT);
        this.a.add(l0.BITWISE_OR);
        this.a.add(l0.BITWISE_RIGHT_SHIFT);
        this.a.add(l0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(l0.BITWISE_XOR);
    }

    public final p a(String str, h4 h4Var, List list) {
        l0 l0Var = l0.ADD;
        switch (e.T(str).ordinal()) {
            case 4:
                return new i(Double.valueOf((double) (e.C(h4Var.b((p) a.m(l0.BITWISE_AND, 2, list, 0)).d().doubleValue()) & e.C(h4Var.b((p) list.get(1)).d().doubleValue()))));
            case 5:
                return new i(Double.valueOf((double) (e.C(h4Var.b((p) a.m(l0.BITWISE_LEFT_SHIFT, 2, list, 0)).d().doubleValue()) << ((int) (e.P(h4Var.b((p) list.get(1)).d().doubleValue()) & 31)))));
            case 6:
                return new i(Double.valueOf((double) (e.C(h4Var.b((p) a.m(l0.BITWISE_NOT, 1, list, 0)).d().doubleValue()) ^ -1)));
            case 7:
                return new i(Double.valueOf((double) (e.C(h4Var.b((p) a.m(l0.BITWISE_OR, 2, list, 0)).d().doubleValue()) | e.C(h4Var.b((p) list.get(1)).d().doubleValue()))));
            case 8:
                return new i(Double.valueOf((double) (e.C(h4Var.b((p) a.m(l0.BITWISE_RIGHT_SHIFT, 2, list, 0)).d().doubleValue()) >> ((int) (e.P(h4Var.b((p) list.get(1)).d().doubleValue()) & 31)))));
            case 9:
                return new i(Double.valueOf((double) (e.P(h4Var.b((p) a.m(l0.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list, 0)).d().doubleValue()) >>> ((int) (e.P(h4Var.b((p) list.get(1)).d().doubleValue()) & 31)))));
            case 10:
                return new i(Double.valueOf((double) (e.C(h4Var.b((p) a.m(l0.BITWISE_XOR, 2, list, 0)).d().doubleValue()) ^ e.C(h4Var.b((p) list.get(1)).d().doubleValue()))));
            default:
                b(str);
                throw null;
        }
    }
}
