package g.c.a.g.a.n.j;

import g.c.a.g.a.n.i;
import g.c.a.m.f;
import i.o.c.h;
import i.o.c.r;
import java.util.List;

public final /* synthetic */ class c implements f {
    public final /* synthetic */ i a;

    public /* synthetic */ c(i iVar) {
        this.a = iVar;
    }

    public final void a(Object obj, Object obj2, Object obj3) {
        i iVar = this.a;
        i.a aVar = (i.a) obj;
        List list = (List) obj2;
        List list2 = (List) obj3;
        h.e(iVar, "this$0");
        if (aVar != null) {
            i.p.debug("mainTabCardsChange size[{}]", (Object) list == null ? null : Integer.valueOf(list.size()));
            iVar.n = true;
            if (list != null) {
                iVar.j(r.a(list));
            }
        }
    }
}
