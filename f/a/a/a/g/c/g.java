package f.a.a.a.g.c;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import f.a.a.a.l.e;
import f.a.a.b.q.b.b;
import f.a.a.b.q.d.i;
import f.a.a.b.w.c;
import org.xml.sax.Attributes;

public class g extends b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1629e = false;

    /* renamed from: f  reason: collision with root package name */
    public e f1630f;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        this.f1629e = false;
        String value = attributes.getValue(Constants.Service.CLASS);
        if (e.e.f.b.s(value)) {
            m("Mandatory \"class\" attribute not set for <loggerContextListener> element");
            this.f1629e = true;
            return;
        }
        try {
            e eVar = (e) e.e.f.b.r(value, e.class, this.c);
            this.f1630f = eVar;
            if (eVar instanceof c) {
                ((c) eVar).g(this.c);
            }
            iVar.f1739e.push(this.f1630f);
            n("Adding LoggerContextListener of type [" + value + "] to the object stack");
        } catch (Exception e2) {
            this.f1629e = true;
            c("Could not create LoggerContextListener of type " + value + "].", e2);
        }
    }

    public void u(i iVar, String str) throws ActionException {
        if (!this.f1629e) {
            Object u = iVar.u();
            e eVar = this.f1630f;
            if (u != eVar) {
                p("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
                return;
            }
            if (eVar instanceof f.a.a.b.w.i) {
                ((f.a.a.b.w.i) eVar).start();
                n("Starting LoggerContextListener");
            }
            ((f.a.a.a.c) this.c).o.add(this.f1630f);
            iVar.v();
        }
    }
}
