package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ l c;

    public /* synthetic */ c(q qVar, l lVar) {
        this.b = qVar;
        this.c = lVar;
    }

    public final void run() {
        q qVar = this.b;
        l lVar = this.c;
        h.e(qVar, "this$0");
        h.e(lVar, "$playbackQuality");
        for (d s : qVar.a.getListeners()) {
            s.s(qVar.a.getInstance(), lVar);
        }
    }
}
