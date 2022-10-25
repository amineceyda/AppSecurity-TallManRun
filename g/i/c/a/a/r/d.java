package g.i.c.a.a.r;

import g.c.b.b.f;
import g.i.c.a.a.j.c;

public class d implements c {
    public final g.i.c.a.a.d a;

    public d(g.i.c.a.a.d dVar) {
        this.a = dVar;
    }

    public void a(g.i.c.a.a.j.d dVar) {
        g.i.c.a.a.d dVar2 = this.a;
        if (dVar2 != null) {
            String str = dVar.b;
            g.i.c.a.a.n.f.c cVar = (g.i.c.a.a.n.f.c) dVar2;
            synchronized (cVar) {
                Long l2 = cVar.a.get(str);
                if (l2 == null) {
                    cVar.a.put(str, 1L);
                } else {
                    cVar.a.put(str, Long.valueOf(l2.longValue() + 1));
                }
                f.w("DTDebugChannel", cVar.a.toString());
            }
        }
    }
}
