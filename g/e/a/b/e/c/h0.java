package g.e.a.b.e.c;

import g.a.a.a.a;
import g.e.a.b.b.h.e;
import java.util.Iterator;
import java.util.List;

public final class h0 extends w {
    public h0() {
        this.a.add(l0.FOR_IN);
        this.a.add(l0.FOR_IN_CONST);
        this.a.add(l0.FOR_IN_LET);
        this.a.add(l0.FOR_LET);
        this.a.add(l0.FOR_OF);
        this.a.add(l0.FOR_OF_CONST);
        this.a.add(l0.FOR_OF_LET);
        this.a.add(l0.WHILE);
    }

    public static p c(f0 f0Var, Iterator it, p pVar) {
        if (it != null) {
            while (it.hasNext()) {
                p c = f0Var.a((p) it.next()).c((f) pVar);
                if (c instanceof h) {
                    h hVar = (h) c;
                    if ("break".equals(hVar.c)) {
                        return p.E;
                    }
                    if ("return".equals(hVar.c)) {
                        return hVar;
                    }
                }
            }
        }
        return p.E;
    }

    public static p d(f0 f0Var, p pVar, p pVar2) {
        return c(f0Var, pVar.f(), pVar2);
    }

    public static p e(f0 f0Var, p pVar, p pVar2) {
        if (pVar instanceof Iterable) {
            return c(f0Var, ((Iterable) pVar).iterator(), pVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final p a(String str, h4 h4Var, List list) {
        l0 l0Var = l0.ADD;
        int ordinal = e.T(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    if (a.m(l0.FOR_IN, 3, list, 0) instanceof t) {
                        String e2 = ((p) list.get(0)).e();
                        return d(new g0(h4Var, e2), h4Var.b((p) list.get(1)), h4Var.b((p) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    if (a.m(l0.FOR_IN_CONST, 3, list, 0) instanceof t) {
                        String e3 = ((p) list.get(0)).e();
                        return d(new d0(h4Var, e3), h4Var.b((p) list.get(1)), h4Var.b((p) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    if (a.m(l0.FOR_IN_LET, 3, list, 0) instanceof t) {
                        String e4 = ((p) list.get(0)).e();
                        return d(new e0(h4Var, e4), h4Var.b((p) list.get(1)), h4Var.b((p) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    p b = h4Var.b((p) a.m(l0.FOR_LET, 4, list, 0));
                    if (b instanceof f) {
                        f fVar = (f) b;
                        p pVar = (p) list.get(1);
                        p pVar2 = (p) list.get(2);
                        p b2 = h4Var.b((p) list.get(3));
                        h4 a = h4Var.a();
                        for (int i2 = 0; i2 < fVar.r(); i2++) {
                            String e5 = fVar.v(i2).e();
                            a.f(e5, h4Var.d(e5));
                        }
                        while (h4Var.b(pVar).m().booleanValue()) {
                            p c = h4Var.c((f) b2);
                            if (c instanceof h) {
                                h hVar = (h) c;
                                if ("break".equals(hVar.c)) {
                                    return p.E;
                                }
                                if ("return".equals(hVar.c)) {
                                    return hVar;
                                }
                            }
                            h4 a2 = h4Var.a();
                            for (int i3 = 0; i3 < fVar.r(); i3++) {
                                String e6 = fVar.v(i3).e();
                                a2.f(e6, a.d(e6));
                            }
                            a2.b(pVar2);
                            a = a2;
                        }
                        return p.E;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    if (a.m(l0.FOR_OF, 3, list, 0) instanceof t) {
                        String e7 = ((p) list.get(0)).e();
                        return e(new g0(h4Var, e7), h4Var.b((p) list.get(1)), h4Var.b((p) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    if (a.m(l0.FOR_OF_CONST, 3, list, 0) instanceof t) {
                        String e8 = ((p) list.get(0)).e();
                        return e(new d0(h4Var, e8), h4Var.b((p) list.get(1)), h4Var.b((p) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    if (a.m(l0.FOR_OF_LET, 3, list, 0) instanceof t) {
                        String e9 = ((p) list.get(0)).e();
                        return e(new e0(h4Var, e9), h4Var.b((p) list.get(1)), h4Var.b((p) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    b(str);
                    throw null;
            }
        } else {
            p pVar3 = (p) a.m(l0.WHILE, 4, list, 0);
            p pVar4 = (p) list.get(1);
            p b3 = h4Var.b((p) list.get(3));
            if (h4Var.b((p) list.get(2)).m().booleanValue()) {
                p c2 = h4Var.c((f) b3);
                if (c2 instanceof h) {
                    h hVar2 = (h) c2;
                    if (!"break".equals(hVar2.c)) {
                        if ("return".equals(hVar2.c)) {
                            return hVar2;
                        }
                    }
                    return p.E;
                }
            }
            while (h4Var.b(pVar3).m().booleanValue()) {
                p c3 = h4Var.c((f) b3);
                if (c3 instanceof h) {
                    h hVar3 = (h) c3;
                    if ("break".equals(hVar3.c)) {
                        break;
                    } else if ("return".equals(hVar3.c)) {
                        return hVar3;
                    }
                }
                h4Var.b(pVar4);
            }
            return p.E;
        }
    }
}
