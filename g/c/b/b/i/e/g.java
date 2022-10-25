package g.c.b.b.i.e;

import g.c.b.b.i.c;
import g.c.b.b.j.a;
import i.o.c.h;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ k b;
    public final /* synthetic */ a c;

    public /* synthetic */ g(k kVar, a aVar) {
        this.b = kVar;
        this.c = aVar;
    }

    public final void run() {
        k kVar = this.b;
        a aVar = this.c;
        h.e(kVar, "this$0");
        h.e(aVar, "$installTask");
        kVar.f();
        a aVar2 = kVar.f2268d;
        if (aVar2 == null || !h.a(aVar.a, aVar2.a)) {
            kVar.b.f(aVar);
        } else {
            c cVar = kVar.b;
            a aVar3 = kVar.f2268d;
            h.c(aVar3);
            cVar.f(aVar3);
        }
        kVar.f2268d = null;
    }
}
