package g.e.b.l;

import g.e.b.l.j.i.a;
import g.e.b.l.j.i.b;

public final /* synthetic */ class c implements b {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e eVar) {
        this.a = eVar;
    }

    public final void a(a aVar) {
        e eVar = this.a;
        synchronized (eVar) {
            if (eVar.c instanceof g.e.b.l.j.i.c) {
                eVar.f3471d.add(aVar);
            }
            eVar.c.a(aVar);
        }
    }
}
