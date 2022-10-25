package g.e.a.b.e.c;

import g.e.a.b.b.h.e;

public final class g3 {
    public final x a;
    public final h4 b;
    public final h4 c;

    /* renamed from: d  reason: collision with root package name */
    public final u6 f2932d;

    public g3() {
        x xVar = new x();
        this.a = xVar;
        h4 h4Var = new h4((h4) null, xVar);
        this.c = h4Var;
        this.b = h4Var.a();
        u6 u6Var = new u6();
        this.f2932d = u6Var;
        h4Var.f("require", new fd(u6Var));
        u6Var.a.put("internal.platform", h2.a);
        h4Var.f("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final p a(h4 h4Var, z4... z4VarArr) {
        p pVar = p.E;
        for (z4 t : z4VarArr) {
            pVar = e.t(t);
            e.K(this.c);
            if ((pVar instanceof q) || (pVar instanceof o)) {
                pVar = this.a.a(h4Var, pVar);
            }
        }
        return pVar;
    }
}
