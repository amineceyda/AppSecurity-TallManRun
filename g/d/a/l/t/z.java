package g.d.a.l.t;

import g.d.a.l.l;
import g.d.a.l.s.d;
import g.d.a.l.t.g;
import g.d.a.l.u.n;

public class z implements d.a<Object> {
    public final /* synthetic */ n.a b;
    public final /* synthetic */ a0 c;

    public z(a0 a0Var, n.a aVar) {
        this.c = a0Var;
        this.b = aVar;
    }

    public void c(Exception exc) {
        a0 a0Var = this.c;
        n.a<?> aVar = this.b;
        n.a<?> aVar2 = a0Var.f2433g;
        if (aVar2 != null && aVar2 == aVar) {
            a0 a0Var2 = this.c;
            n.a aVar3 = this.b;
            g.a aVar4 = a0Var2.c;
            e eVar = a0Var2.f2434h;
            d<Data> dVar = aVar3.c;
            aVar4.b(eVar, exc, dVar, dVar.e());
        }
    }

    public void d(Object obj) {
        a0 a0Var = this.c;
        n.a<?> aVar = this.b;
        n.a<?> aVar2 = a0Var.f2433g;
        if (aVar2 != null && aVar2 == aVar) {
            a0 a0Var2 = this.c;
            n.a aVar3 = this.b;
            k kVar = a0Var2.b.p;
            if (obj == null || !kVar.c(aVar3.c.e())) {
                g.a aVar4 = a0Var2.c;
                l lVar = aVar3.a;
                d<Data> dVar = aVar3.c;
                aVar4.d(lVar, obj, dVar, dVar.e(), a0Var2.f2434h);
                return;
            }
            a0Var2.f2432f = obj;
            a0Var2.c.a();
        }
    }
}
