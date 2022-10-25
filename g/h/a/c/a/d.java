package g.h.a.c.a;

import i.o.c.h;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ float c;

    public /* synthetic */ d(q qVar, float f2) {
        this.b = qVar;
        this.c = f2;
    }

    public final void run() {
        q qVar = this.b;
        float f2 = this.c;
        h.e(qVar, "this$0");
        for (g.h.a.c.a.r.d b2 : qVar.a.getListeners()) {
            b2.b(qVar.a.getInstance(), f2);
        }
    }
}
