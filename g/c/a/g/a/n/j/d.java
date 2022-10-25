package g.c.a.g.a.n.j;

import g.c.a.g.a.n.i;
import g.c.a.m.f;
import i.o.c.h;
import java.util.List;
import org.slf4j.Logger;

public final /* synthetic */ class d implements f {
    public final /* synthetic */ j a;

    public /* synthetic */ d(j jVar) {
        this.a = jVar;
    }

    public final void a(Object obj, Object obj2, Object obj3) {
        j jVar = this.a;
        List list = (List) obj2;
        h.e(jVar, "this$0");
        h.e((i.a) obj, "loadType");
        h.e(list, "totalCards");
        h.e((List) obj3, "newCards");
        Logger logger = j.p;
        logger.debug("mainTabCardsChange size[{}]", (Object) Integer.valueOf(list.size()));
        jVar.n = true;
        jVar.j(list);
        logger.debug("Data size[{}]", (Object) Integer.valueOf(jVar.f2183g.size()));
    }
}
