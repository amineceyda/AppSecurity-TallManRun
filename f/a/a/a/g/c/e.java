package f.a.a.a.g.c;

import f.a.a.a.a;
import f.a.a.b.q.b.b;
import f.a.a.b.q.d.i;
import org.xml.sax.Attributes;

@Deprecated
public class e extends b {
    public void s(i iVar, String str, Attributes attributes) {
        Object u = iVar.u();
        if (!(u instanceof f.a.a.a.b)) {
            m("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        f.a.a.a.b bVar = (f.a.a.a.b) u;
        String name = bVar.getName();
        String w = iVar.w(attributes.getValue("value"));
        bVar.l(("INHERITED".equalsIgnoreCase(w) || "NULL".equalsIgnoreCase(w)) ? null : a.b(w, a.f1612f));
        n(name + " level set to " + bVar.b);
    }

    public void u(i iVar, String str) {
    }
}
