package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ q b;

    public /* synthetic */ j(q qVar) {
        this.b = qVar;
    }

    public final void run() {
        q qVar = this.b;
        h.e(qVar, "this$0");
        for (d f2 : qVar.a.getListeners()) {
            f2.f(qVar.a.getInstance());
        }
    }
}
