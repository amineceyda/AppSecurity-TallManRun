package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.Arrays;
import java.util.Comparator;

public final class b0 implements Comparator {
    public final /* synthetic */ j b;
    public final /* synthetic */ h4 c;

    public b0(j jVar, h4 h4Var) {
        this.b = jVar;
        this.c = h4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        j jVar = this.b;
        h4 h4Var = this.c;
        if (pVar instanceof u) {
            return !(pVar2 instanceof u) ? 1 : 0;
        }
        if (pVar2 instanceof u) {
            return -1;
        }
        if (jVar == null) {
            return pVar.e().compareTo(pVar2.e());
        }
        return (int) e.q(jVar.a(h4Var, Arrays.asList(new p[]{pVar, pVar2})).d().doubleValue());
    }
}
