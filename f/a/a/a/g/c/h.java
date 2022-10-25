package f.a.a.a.g.c;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import f.a.a.a.h.a;
import f.a.a.b.d;
import f.a.a.b.q.b.b;
import f.a.a.b.q.d.i;
import org.xml.sax.Attributes;

public class h extends b {

    /* renamed from: e  reason: collision with root package name */
    public a f1631e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1632f;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        String value = attributes.getValue(Constants.Service.CLASS);
        if (e.e.f.b.s(value)) {
            StringBuilder n = g.a.a.a.a.n("Missing class name for receiver. Near [", str, "] line ");
            n.append(v(iVar));
            m(n.toString());
            this.f1632f = true;
            return;
        }
        try {
            n("About to instantiate receiver of type [" + value + "]");
            a aVar = (a) e.e.f.b.r(value, a.class, this.c);
            this.f1631e = aVar;
            aVar.g(this.c);
            iVar.f1739e.push(this.f1631e);
        } catch (Exception e2) {
            this.f1632f = true;
            c("Could not create a receiver of type [" + value + "].", e2);
            throw new ActionException(e2);
        }
    }

    public void u(i iVar, String str) throws ActionException {
        if (!this.f1632f) {
            d dVar = iVar.c;
            dVar.c().a.add(this.f1631e);
            this.f1631e.start();
            if (iVar.u() != this.f1631e) {
                p("The object at the of the stack is not the remote pushed earlier.");
            } else {
                iVar.v();
            }
        }
    }
}
