package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import f.a.a.b.p.a;
import f.a.a.b.p.b;
import f.a.a.b.q.d.i;
import org.xml.sax.Attributes;

public class r extends b {

    /* renamed from: e  reason: collision with root package name */
    public b f1725e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1726f;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        this.f1725e = null;
        this.f1726f = false;
        String value = attributes.getValue(Constants.Service.CLASS);
        if (e.e.f.b.s(value)) {
            value = a.class.getName();
            n("Assuming className [" + value + "]");
        }
        try {
            n("About to instantiate shutdown hook of type [" + value + "]");
            b bVar = (b) e.e.f.b.r(value, b.class, this.c);
            this.f1725e = bVar;
            bVar.g(this.c);
            iVar.f1739e.push(this.f1725e);
        } catch (Exception e2) {
            this.f1726f = true;
            c("Could not create a shutdown hook of type [" + value + "].", e2);
            throw new ActionException(e2);
        }
    }

    public void u(i iVar, String str) throws ActionException {
        if (!this.f1726f) {
            if (iVar.u() != this.f1725e) {
                p("The object at the of the stack is not the hook pushed earlier.");
                return;
            }
            iVar.v();
            Thread thread = new Thread(this.f1725e, g.a.a.a.a.f(g.a.a.a.a.i("Logback shutdown hook ["), this.c.c, "]"));
            n("Registering shutdown hook with JVM runtime");
            this.c.f1687f.put("SHUTDOWN_HOOK", thread);
            Runtime.getRuntime().addShutdownHook(thread);
        }
    }
}
