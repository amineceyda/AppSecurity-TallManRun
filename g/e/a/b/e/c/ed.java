package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public final class ed extends j {

    /* renamed from: d  reason: collision with root package name */
    public final id f2924d;

    public ed(id idVar) {
        super("internal.registerCallback");
        this.f2924d = idVar;
    }

    public final p a(h4 h4Var, List list) {
        TreeMap treeMap;
        e.a0(this.b, 3, list);
        h4Var.b((p) list.get(0)).e();
        p b = h4Var.b((p) list.get(1));
        if (b instanceof o) {
            p b2 = h4Var.b((p) list.get(2));
            if (b2 instanceof m) {
                m mVar = (m) b2;
                if (mVar.b.containsKey("type")) {
                    String e2 = mVar.h("type").e();
                    int C = mVar.b.containsKey("priority") ? e.C(mVar.h("priority").d().doubleValue()) : 1000;
                    id idVar = this.f2924d;
                    o oVar = (o) b;
                    Objects.requireNonNull(idVar);
                    if ("create".equals(e2)) {
                        treeMap = idVar.b;
                    } else if ("edit".equals(e2)) {
                        treeMap = idVar.a;
                    } else {
                        String valueOf = String.valueOf(e2);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
                    }
                    if (treeMap.containsKey(Integer.valueOf(C))) {
                        C = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(C), oVar);
                    return p.E;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
