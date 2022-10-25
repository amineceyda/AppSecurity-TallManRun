package f.a.a.b.q.b;

import e.e.f.b;
import f.a.a.b.q.d.i;
import f.a.a.b.w.a;
import java.util.HashMap;
import org.xml.sax.Attributes;

public class e<E> extends b {
    public void s(i iVar, String str, Attributes attributes) {
        Object u = iVar.u();
        if (!(u instanceof a)) {
            StringBuilder n = g.a.a.a.a.n("Could not find an AppenderAttachable at the top of execution stack. Near [", str, "] line ");
            n.append(v(iVar));
            m(n.toString());
            return;
        }
        a aVar = (a) u;
        String w = iVar.w(attributes.getValue("ref"));
        if (b.s(w)) {
            m("Missing appender ref attribute in <appender-ref> tag.");
            return;
        }
        f.a.a.b.a aVar2 = (f.a.a.b.a) ((HashMap) iVar.f1740f.get("APPENDER_BAG")).get(w);
        if (aVar2 == null) {
            m("Could not find an appender named [" + w + "]. Did you define it below instead of above in the configuration file?");
            m("See http://logback.qos.ch/codes.html#appender_order for more details.");
            return;
        }
        n("Attaching appender named [" + w + "] to " + aVar);
        aVar.a(aVar2);
    }

    public void u(i iVar, String str) {
    }
}
