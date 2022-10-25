package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.Collections;
import java.util.TreeMap;

public final class id {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int b(h4 h4Var, o oVar, p pVar) {
        p a2 = oVar.a(h4Var, Collections.singletonList(pVar));
        if (a2 instanceof i) {
            return e.C(a2.d().doubleValue());
        }
        return -1;
    }

    public final void a(h4 h4Var, c cVar) {
        m8 m8Var = new m8(cVar);
        for (Integer num : this.a.keySet()) {
            b a2 = cVar.b.clone();
            int b2 = b(h4Var, (o) this.a.get(num), m8Var);
            if (b2 == 2 || b2 == -1) {
                cVar.b = a2;
            }
        }
        for (Integer num2 : this.b.keySet()) {
            b(h4Var, (o) this.b.get(num2), m8Var);
        }
    }
}
