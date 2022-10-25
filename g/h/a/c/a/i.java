package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ n c;

    public /* synthetic */ i(q qVar, n nVar) {
        this.b = qVar;
        this.c = nVar;
    }

    public final void run() {
        q qVar = this.b;
        n nVar = this.c;
        h.e(qVar, "this$0");
        h.e(nVar, "$playerError");
        for (d p : qVar.a.getListeners()) {
            p.p(qVar.a.getInstance(), nVar);
        }
    }
}
