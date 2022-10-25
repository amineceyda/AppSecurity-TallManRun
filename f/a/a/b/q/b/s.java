package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import f.a.a.b.q.d.i;
import f.a.a.b.w.c;
import f.a.a.b.x.f;
import g.a.a.a.a;
import org.xml.sax.Attributes;

public class s extends b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1727e = false;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f1728f = null;

    /* renamed from: g  reason: collision with root package name */
    public f f1729g = null;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        this.f1727e = false;
        this.f1728f = null;
        String value = attributes.getValue(Constants.Service.CLASS);
        if (b.s(value)) {
            StringBuilder n = a.n("Missing class name for statusListener. Near [", str, "] line ");
            n.append(v(iVar));
            m(n.toString());
            this.f1727e = true;
            return;
        }
        try {
            f fVar = (f) b.r(value, f.class, this.c);
            this.f1729g = fVar;
            this.f1728f = Boolean.valueOf(iVar.c.f1685d.b(fVar));
            f fVar2 = this.f1729g;
            if (fVar2 instanceof c) {
                ((c) fVar2).g(this.c);
            }
            n("Added status listener of type [" + value + "]");
            iVar.f1739e.push(this.f1729g);
        } catch (Exception e2) {
            this.f1727e = true;
            c("Could not create an StatusListener of type [" + value + "].", e2);
            throw new ActionException(e2);
        }
    }

    public void u(i iVar, String str) {
        if (!this.f1727e) {
            Boolean bool = this.f1728f;
            if (bool == null ? false : bool.booleanValue()) {
                f fVar = this.f1729g;
                if (fVar instanceof f.a.a.b.w.i) {
                    ((f.a.a.b.w.i) fVar).start();
                }
            }
            if (iVar.u() != this.f1729g) {
                p("The object at the of the stack is not the statusListener pushed earlier.");
            } else {
                iVar.v();
            }
        }
    }
}
