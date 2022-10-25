package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ float c;

    public /* synthetic */ a(q qVar, float f2) {
        this.b = qVar;
        this.c = f2;
    }

    public final void run() {
        q qVar = this.b;
        float f2 = this.c;
        h.e(qVar, "this$0");
        for (d r : qVar.a.getListeners()) {
            r.r(qVar.a.getInstance(), f2);
        }
    }
}
