package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class x {
    public final Map a = new HashMap();
    public final j0 b = new j0();

    public x() {
        b(new v());
        b(new y());
        b(new z());
        b(new c0());
        b(new h0());
        b(new i0());
        b(new k0());
    }

    public final p a(h4 h4Var, p pVar) {
        e.K(h4Var);
        if (!(pVar instanceof q)) {
            return pVar;
        }
        q qVar = (q) pVar;
        ArrayList arrayList = qVar.c;
        String str = qVar.b;
        return (this.a.containsKey(str) ? (w) this.a.get(str) : this.b).a(str, h4Var, arrayList);
    }

    public final void b(w wVar) {
        for (l0 a2 : wVar.a) {
            this.a.put(a2.a().toString(), wVar);
        }
    }
}
