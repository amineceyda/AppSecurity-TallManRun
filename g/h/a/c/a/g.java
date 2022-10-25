package g.h.a.c.a;

import g.h.a.c.a.r.d;
import i.o.c.h;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ q b;
    public final /* synthetic */ String c;

    public /* synthetic */ g(q qVar, String str) {
        this.b = qVar;
        this.c = str;
    }

    public final void run() {
        q qVar = this.b;
        String str = this.c;
        h.e(qVar, "this$0");
        h.e(str, "$videoId");
        for (d g2 : qVar.a.getListeners()) {
            g2.g(qVar.a.getInstance(), str);
        }
    }
}
