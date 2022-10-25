package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.HashMap;
import java.util.List;

public final class q7 extends j {

    /* renamed from: d  reason: collision with root package name */
    public final c f3022d;

    public q7(c cVar) {
        super("internal.eventLogger");
        this.f3022d = cVar;
    }

    public final p a(h4 h4Var, List list) {
        e.a0(this.b, 3, list);
        String e2 = h4Var.b((p) list.get(0)).e();
        long q = (long) e.q(h4Var.b((p) list.get(1)).d().doubleValue());
        p b = h4Var.b((p) list.get(2));
        this.f3022d.c.add(new b(e2, q, b instanceof m ? e.Y((m) b) : new HashMap()));
        return p.E;
    }
}
