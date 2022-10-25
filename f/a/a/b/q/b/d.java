package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import f.a.a.b.a;
import f.a.a.b.q.d.i;
import java.util.HashMap;
import org.xml.sax.Attributes;

public class d<E> extends b {

    /* renamed from: e  reason: collision with root package name */
    public a<E> f1713e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1714f = false;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        this.f1713e = null;
        this.f1714f = false;
        String value = attributes.getValue(Constants.Service.CLASS);
        if (b.s(value)) {
            StringBuilder n = g.a.a.a.a.n("Missing class name for appender. Near [", str, "] line ");
            n.append(v(iVar));
            m(n.toString());
            this.f1714f = true;
            return;
        }
        try {
            n("About to instantiate appender of type [" + value + "]");
            if (value.equals("ch.qos.logback.core.ConsoleAppender")) {
                p("ConsoleAppender is deprecated for LogcatAppender");
            }
            a<E> aVar = (a) b.r(value, a.class, this.c);
            this.f1713e = aVar;
            aVar.g(this.c);
            String w = iVar.w(attributes.getValue("name"));
            if (b.s(w)) {
                p("No appender name given for appender of type " + value + "].");
            } else {
                this.f1713e.e(w);
                n("Naming appender as [" + w + "]");
            }
            ((HashMap) iVar.f1740f.get("APPENDER_BAG")).put(w, this.f1713e);
            iVar.f1739e.push(this.f1713e);
        } catch (Exception e2) {
            this.f1714f = true;
            c("Could not create an Appender of type [" + value + "].", e2);
            throw new ActionException(e2);
        }
    }

    public void u(i iVar, String str) {
        if (!this.f1714f) {
            a<E> aVar = this.f1713e;
            if (aVar instanceof f.a.a.b.w.i) {
                aVar.start();
            }
            if (iVar.u() != this.f1713e) {
                StringBuilder i2 = g.a.a.a.a.i("The object at the of the stack is not the appender named [");
                i2.append(this.f1713e.getName());
                i2.append("] pushed earlier.");
                p(i2.toString());
                return;
            }
            iVar.v();
        }
    }
}
