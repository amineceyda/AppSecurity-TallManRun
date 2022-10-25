package g.e.b.r;

import g.e.b.h;
import g.e.b.r.l.a;
import g.e.b.r.l.c;
import g.e.b.r.l.d;
import java.util.Objects;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar) {
        this.b = eVar;
    }

    public final void run() {
        d c;
        e eVar = this.b;
        Objects.requireNonNull(eVar);
        synchronized (e.f3728m) {
            h hVar = eVar.a;
            hVar.a();
            d a = d.a(hVar.a, "generatefid.lock");
            try {
                c = eVar.c.c();
                if (c.i()) {
                    String g2 = eVar.g(c);
                    c cVar = eVar.c;
                    a.b bVar = (a.b) c.j();
                    bVar.a = g2;
                    bVar.b(c.a.UNREGISTERED);
                    c = bVar.a();
                    cVar.b(c);
                }
            } finally {
                if (a != null) {
                    a.b();
                }
            }
        }
        eVar.j(c);
        eVar.f3734i.execute(new a(eVar, false));
    }
}
