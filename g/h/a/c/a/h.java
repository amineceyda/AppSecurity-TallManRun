package g.h.a.c.a;

import g.h.a.c.a.r.d;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ float c;

    public /* synthetic */ h(q qVar, float f2) {
        this.b = qVar;
        this.c = f2;
    }

    public final void run() {
        q qVar = this.b;
        float f2 = this.c;
        i.o.c.h.e(qVar, "this$0");
        for (d l2 : qVar.a.getListeners()) {
            l2.l(qVar.a.getInstance(), f2);
        }
    }
}
