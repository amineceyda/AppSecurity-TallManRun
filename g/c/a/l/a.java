package g.c.a.l;

import g.c.a.l.l.o;
import i.o.b.l;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ l b;
    public final /* synthetic */ o c;

    public /* synthetic */ a(l lVar, o oVar) {
        this.b = lVar;
        this.c = oVar;
    }

    public final void run() {
        l lVar = this.b;
        o oVar = this.c;
        h.e(lVar, "$callback");
        try {
            lVar.g(oVar);
        } catch (Exception e2) {
            Logger logger = d.b;
            StringBuilder i2 = g.a.a.a.a.i("Remove on parser listeners exception[");
            i2.append(e2.getMessage());
            i2.append("].");
            logger.warn(i2.toString());
        }
    }
}
