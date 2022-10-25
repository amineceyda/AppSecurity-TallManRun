package g.i.c.a.a.p;

import g.i.c.a.a.l.c;
import g.i.c.a.a.s.i;
import g.i.c.a.a.s.n;
import java.util.Set;

public class b implements n.b {

    /* renamed from: g.i.c.a.a.p.b$b  reason: collision with other inner class name */
    public static class C0174b {
        public static final b a = new b((a) null);
    }

    public b(a aVar) {
        n.d.a.f4507g.a(this);
    }

    public void a(i iVar, Set<i> set, int i2) {
        for (i e2 : set) {
            Object d2 = c.d(e2.e(), "flutter_api");
            a aVar = d2 instanceof a ? (a) d2 : null;
            if (aVar != null) {
                aVar.b(0);
            }
        }
    }

    public g.i.c.a.a.l.b b(g.i.c.a.a.l.b bVar) {
        Object A = g.h.a.a.A(bVar, "flutter_api");
        a aVar = A instanceof a ? (a) A : null;
        if (aVar == null) {
            return bVar;
        }
        bVar.a();
        aVar.a();
        throw null;
    }

    public void c(i iVar, g.i.c.a.a.l.b bVar, Set<i> set, boolean z) {
        Object A = g.h.a.a.A(bVar, "flutter_api");
        if (A instanceof a) {
            ((a) A).a();
            throw null;
        }
    }

    public void d(i iVar, int i2) {
    }
}
