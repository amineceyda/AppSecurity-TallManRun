package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ o c;

    public /* synthetic */ e(q qVar, o oVar) {
        this.b = qVar;
        this.c = oVar;
    }

    public final void run() {
        q qVar = this.b;
        o oVar = this.c;
        h.e(qVar, "this$0");
        h.e(oVar, "$playerState");
        for (d h2 : qVar.a.getListeners()) {
            h2.h(qVar.a.getInstance(), oVar);
        }
    }
}
