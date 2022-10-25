package f.a.a.b.q.d;

import f.a.a.b.q.b.b;
import f.a.a.b.w.d;
import g.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Marker;

public class m extends d implements l {

    /* renamed from: e  reason: collision with root package name */
    public HashMap<f, List<b>> f1752e = new HashMap<>();

    public m(f.a.a.b.d dVar) {
        g(dVar);
    }

    public void s(f fVar, b bVar) {
        bVar.g(this.c);
        List list = this.f1752e.get(fVar);
        if (list == null) {
            list = new ArrayList();
            this.f1752e.put(fVar, list);
        }
        list.add(bVar);
    }

    public void t(f fVar, String str) {
        b bVar;
        try {
            bVar = (b) e.e.f.b.r(str, b.class, this.c);
        } catch (Exception e2) {
            c("Could not instantiate class [" + str + "]", e2);
            bVar = null;
        }
        if (bVar != null) {
            s(fVar, bVar);
        }
    }

    public String toString() {
        StringBuilder l2 = a.l("SimpleRuleStore ( ", "rules = ");
        l2.append(this.f1752e);
        l2.append("  ");
        l2.append(" )");
        return l2.toString();
    }

    public final boolean u(String str) {
        return Marker.ANY_MARKER.equals(str);
    }
}
