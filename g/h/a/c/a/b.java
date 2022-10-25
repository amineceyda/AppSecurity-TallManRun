package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ q b;

    public /* synthetic */ b(q qVar) {
        this.b = qVar;
    }

    public final void run() {
        q qVar = this.b;
        h.e(qVar, "this$0");
        for (d j2 : qVar.a.getListeners()) {
            j2.j(qVar.a.getInstance());
        }
    }
}
