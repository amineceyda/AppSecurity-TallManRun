package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.List;

public final class y extends w {
    public y() {
        this.a.add(l0.EQUALS);
        this.a.add(l0.GREATER_THAN);
        this.a.add(l0.GREATER_THAN_EQUALS);
        this.a.add(l0.IDENTITY_EQUALS);
        this.a.add(l0.IDENTITY_NOT_EQUALS);
        this.a.add(l0.LESS_THAN);
        this.a.add(l0.LESS_THAN_EQUALS);
        this.a.add(l0.NOT_EQUALS);
    }

    public static boolean c(p pVar, p pVar2) {
        if (pVar.getClass().equals(pVar2.getClass())) {
            if ((pVar instanceof u) || (pVar instanceof n)) {
                return true;
            }
            return pVar instanceof i ? !Double.isNaN(pVar.d().doubleValue()) && !Double.isNaN(pVar2.d().doubleValue()) && pVar.d().doubleValue() == pVar2.d().doubleValue() : pVar instanceof t ? pVar.e().equals(pVar2.e()) : pVar instanceof g ? pVar.m().equals(pVar2.m()) : pVar == pVar2;
        } else if (((pVar instanceof u) || (pVar instanceof n)) && ((pVar2 instanceof u) || (pVar2 instanceof n))) {
            return true;
        } else {
            boolean z = pVar instanceof i;
            if (z && (pVar2 instanceof t)) {
                return c(pVar, new i(pVar2.d()));
            }
            boolean z2 = pVar instanceof t;
            if (z2 && (pVar2 instanceof i)) {
                return c(new i(pVar.d()), pVar2);
            }
            if (pVar instanceof g) {
                return c(new i(pVar.d()), pVar2);
            }
            if (pVar2 instanceof g) {
                return c(pVar, new i(pVar2.d()));
            }
            if ((z2 || z) && (pVar2 instanceof l)) {
                return c(pVar, new t(pVar2.e()));
            }
            if (!(pVar instanceof l) || (!(pVar2 instanceof t) && !(pVar2 instanceof i))) {
                return false;
            }
            return c(new t(pVar.e()), pVar2);
        }
    }

    public static boolean d(p pVar, p pVar2) {
        if (pVar instanceof l) {
            pVar = new t(pVar.e());
        }
        if (pVar2 instanceof l) {
            pVar2 = new t(pVar2.e());
        }
        if ((pVar instanceof t) && (pVar2 instanceof t)) {
            return pVar.e().compareTo(pVar2.e()) < 0;
        }
        double doubleValue = pVar.d().doubleValue();
        double doubleValue2 = pVar2.d().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == 0.0d) && (!(doubleValue == 0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    public static boolean e(p pVar, p pVar2) {
        if (pVar instanceof l) {
            pVar = new t(pVar.e());
        }
        if (pVar2 instanceof l) {
            pVar2 = new t(pVar2.e());
        }
        return (((pVar instanceof t) && (pVar2 instanceof t)) || (!Double.isNaN(pVar.d().doubleValue()) && !Double.isNaN(pVar2.d().doubleValue()))) && !d(pVar2, pVar);
    }

    public final p a(String str, h4 h4Var, List list) {
        boolean z;
        boolean z2;
        e.a0(e.T(str).name(), 2, list);
        p b = h4Var.b((p) list.get(0));
        p b2 = h4Var.b((p) list.get(1));
        int ordinal = e.T(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                z2 = c(b, b2);
            } else if (ordinal == 42) {
                z = d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = d(b2, b);
                        break;
                    case 38:
                        z = e(b2, b);
                        break;
                    case 39:
                        z = e.i0(b, b2);
                        break;
                    case 40:
                        z2 = e.i0(b, b2);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                z = e(b, b2);
            }
            z = !z2;
        } else {
            z = c(b, b2);
        }
        return z ? p.J : p.K;
    }
}
