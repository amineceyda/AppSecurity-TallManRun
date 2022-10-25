package g.e.a.b.e.c;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import g.a.a.a.a;
import g.e.a.b.b.h.e;
import java.util.Iterator;
import java.util.List;

public final class k0 extends w {
    public k0() {
        this.a.add(l0.ASSIGN);
        this.a.add(l0.CONST);
        this.a.add(l0.CREATE_ARRAY);
        this.a.add(l0.CREATE_OBJECT);
        this.a.add(l0.EXPRESSION_LIST);
        this.a.add(l0.GET);
        this.a.add(l0.GET_INDEX);
        this.a.add(l0.GET_PROPERTY);
        this.a.add(l0.NULL);
        this.a.add(l0.SET_PROPERTY);
        this.a.add(l0.TYPEOF);
        this.a.add(l0.UNDEFINED);
        this.a.add(l0.VAR);
    }

    public final p a(String str, h4 h4Var, List list) {
        String str2;
        l0 l0Var = l0.ADD;
        int ordinal = e.T(str).ordinal();
        int i2 = 0;
        if (ordinal == 3) {
            p b = h4Var.b((p) a.m(l0.ASSIGN, 2, list, 0));
            if (!(b instanceof t)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (h4Var.g(b.e())) {
                p b2 = h4Var.b((p) list.get(1));
                h4Var.f(b.e(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.e()}));
            }
        } else if (ordinal == 14) {
            e.c0(l0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i3 = 0;
                while (i3 < list.size() - 1) {
                    p b3 = h4Var.b((p) list.get(i3));
                    if (b3 instanceof t) {
                        String e2 = b3.e();
                        h4Var.e(e2, h4Var.b((p) list.get(i3 + 1)));
                        h4Var.f2941d.put(e2, Boolean.TRUE);
                        i3 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return p.E;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            e.c0(l0.EXPRESSION_LIST.name(), 1, list);
            p pVar = p.E;
            while (i2 < list.size()) {
                pVar = h4Var.b((p) list.get(i2));
                if (!(pVar instanceof h)) {
                    i2++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return pVar;
        } else if (ordinal == 33) {
            p b4 = h4Var.b((p) a.m(l0.GET, 1, list, 0));
            if (b4 instanceof t) {
                return h4Var.d(b4.e());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            e.a0(l0.NULL.name(), 0, list);
            return p.F;
        } else if (ordinal == 58) {
            p b5 = h4Var.b((p) a.m(l0.SET_PROPERTY, 3, list, 0));
            p b6 = h4Var.b((p) list.get(1));
            p b7 = h4Var.b((p) list.get(2));
            if (b5 == p.E || b5 == p.F) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.e(), b5.e()}));
            }
            if ((b5 instanceof f) && (b6 instanceof i)) {
                ((f) b5).A(b6.d().intValue(), b7);
            } else if (b5 instanceof l) {
                ((l) b5).p(b6.e(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    p b8 = h4Var.b((p) a.m(l0.GET_PROPERTY, 2, list, 0));
                    p b9 = h4Var.b((p) list.get(1));
                    if ((b8 instanceof f) && e.g0(b9)) {
                        return ((f) b8).v(b9.d().intValue());
                    }
                    if (b8 instanceof l) {
                        return ((l) b8).h(b9.e());
                    }
                    if (b8 instanceof t) {
                        if ("length".equals(b9.e())) {
                            return new i(Double.valueOf((double) b8.e().length()));
                        }
                        if (e.g0(b9) && b9.d().doubleValue() < ((double) b8.e().length())) {
                            return new t(String.valueOf(b8.e().charAt(b9.d().intValue())));
                        }
                    }
                    return p.E;
                }
                switch (ordinal) {
                    case 62:
                        p b10 = h4Var.b((p) a.m(l0.TYPEOF, 1, list, 0));
                        if (b10 instanceof u) {
                            str2 = "undefined";
                        } else if (b10 instanceof g) {
                            str2 = "boolean";
                        } else if (b10 instanceof i) {
                            str2 = "number";
                        } else if (b10 instanceof t) {
                            str2 = "string";
                        } else if (b10 instanceof o) {
                            str2 = "function";
                        } else if ((b10 instanceof q) || (b10 instanceof h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new t(str2);
                    case 63:
                        e.a0(l0.UNDEFINED.name(), 0, list);
                        return p.E;
                    case ModuleDescriptor.MODULE_VERSION:
                        e.c0(l0.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            p b11 = h4Var.b((p) it.next());
                            if (b11 instanceof t) {
                                h4Var.e(b11.e(), p.E);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return p.E;
                    default:
                        b(str);
                        throw null;
                }
            } else if (list.isEmpty()) {
                return new m();
            } else {
                if (list.size() % 2 == 0) {
                    m mVar = new m();
                    while (i2 < list.size() - 1) {
                        p b12 = h4Var.b((p) list.get(i2));
                        p b13 = h4Var.b((p) list.get(i2 + 1));
                        if ((b12 instanceof h) || (b13 instanceof h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        mVar.p(b12.e(), b13);
                        i2 += 2;
                    }
                    return mVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new f();
        } else {
            f fVar = new f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                p b14 = h4Var.b((p) it2.next());
                if (!(b14 instanceof h)) {
                    fVar.A(i2, b14);
                    i2++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
