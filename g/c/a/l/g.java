package g.c.a.l;

import g.a.a.a.a;
import g.c.a.l.l.e0;
import g.c.a.l.l.o;
import i.o.c.h;
import org.slf4j.Logger;

public final class g implements e0 {
    public void a(o oVar) {
        h.e(oVar, "apkDescription");
        Logger logger = d.b;
        StringBuilder i2 = a.i("Apk description  status[");
        i2.append(Integer.valueOf(oVar.c));
        i2.append("] progress[");
        i2.append(Double.valueOf(oVar.a));
        i2.append("].");
        logger.info(i2.toString());
        d.a.i(oVar);
    }
}
