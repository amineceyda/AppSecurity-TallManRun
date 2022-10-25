package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ m c;

    public /* synthetic */ f(q qVar, m mVar) {
        this.b = qVar;
        this.c = mVar;
    }

    public final void run() {
        q qVar = this.b;
        m mVar = this.c;
        h.e(qVar, "this$0");
        h.e(mVar, "$playbackRate");
        for (d e2 : qVar.a.getListeners()) {
            e2.e(qVar.a.getInstance(), mVar);
        }
    }
}
