package g.c.b.a.h;

import g.c.b.a.d;
import g.c.b.a.e;
import g.c.b.a.j.k;
import i.o.c.h;
import java.util.Objects;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ d b;
    public final /* synthetic */ e c;

    public /* synthetic */ a(d dVar, e eVar) {
        this.b = dVar;
        this.c = eVar;
    }

    public final void run() {
        d dVar = this.b;
        e eVar = this.c;
        h.e(dVar, "$response");
        h.e(eVar, "this$0");
        if (dVar.d()) {
            e eVar2 = eVar.b;
            Objects.requireNonNull(eVar2);
            h.e(dVar, "response");
            k kVar = eVar2.c;
            if (kVar != null) {
                kVar.onResponse(dVar);
                return;
            }
            return;
        }
        eVar.b.a(dVar.c, dVar.f2205d);
    }
}
