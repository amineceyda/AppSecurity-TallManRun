package f.a.a.a.g.c;

import f.a.a.a.a;
import f.a.a.a.c;
import f.a.a.b.q.b.b;
import org.slf4j.Logger;
import org.xml.sax.Attributes;

public class i extends b {

    /* renamed from: e  reason: collision with root package name */
    public f.a.a.a.b f1633e;

    public void s(f.a.a.b.q.d.i iVar, String str, Attributes attributes) {
        this.f1633e = ((c) this.c).getLogger(Logger.ROOT_LOGGER_NAME);
        String w = iVar.w(attributes.getValue("level"));
        if (!e.e.f.b.s(w)) {
            a b = a.b(w, a.f1612f);
            n("Setting level of ROOT logger to " + b);
            this.f1633e.l(b);
        }
        iVar.f1739e.push(this.f1633e);
    }

    public void u(f.a.a.b.q.d.i iVar, String str) {
        Object u = iVar.u();
        if (u != this.f1633e) {
            p("The object on the top the of the stack is not the root logger");
            p("It is: " + u);
            return;
        }
        iVar.v();
    }
}
