package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import f.a.a.b.q.d.i;
import f.a.a.b.w.l;
import g.a.a.a.a;
import org.xml.sax.Attributes;

public class g extends b {

    /* renamed from: e  reason: collision with root package name */
    public String f1715e;

    /* renamed from: f  reason: collision with root package name */
    public c f1716f;

    /* renamed from: g  reason: collision with root package name */
    public String f1717g;

    /* renamed from: h  reason: collision with root package name */
    public l f1718h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1719i;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        StringBuilder sb;
        String str2;
        this.f1715e = null;
        this.f1716f = null;
        this.f1717g = null;
        this.f1718h = null;
        this.f1719i = false;
        this.f1717g = attributes.getValue("name");
        String value = attributes.getValue(Constants.Service.SCOPE);
        this.f1715e = value;
        this.f1716f = b.y(value);
        if (b.s(this.f1717g)) {
            sb = new StringBuilder();
            str2 = "Missing property name for property definer. Near [";
        } else {
            String value2 = attributes.getValue(Constants.Service.CLASS);
            if (b.s(value2)) {
                sb = new StringBuilder();
                str2 = "Missing class name for property definer. Near [";
            } else {
                try {
                    n("About to instantiate property definer of type [" + value2 + "]");
                    l lVar = (l) b.r(value2, l.class, this.c);
                    this.f1718h = lVar;
                    lVar.g(this.c);
                    l lVar2 = this.f1718h;
                    if (lVar2 instanceof f.a.a.b.w.i) {
                        ((f.a.a.b.w.i) lVar2).start();
                    }
                    iVar.f1739e.push(this.f1718h);
                    return;
                } catch (Exception e2) {
                    this.f1719i = true;
                    c("Could not create an PropertyDefiner of type [" + value2 + "].", e2);
                    throw new ActionException(e2);
                }
            }
        }
        sb.append(str2);
        sb.append(str);
        sb.append("] line ");
        sb.append(v(iVar));
        m(sb.toString());
        this.f1719i = true;
    }

    public void u(i iVar, String str) {
        if (!this.f1719i) {
            if (iVar.u() != this.f1718h) {
                StringBuilder i2 = a.i("The object at the of the stack is not the property definer for property named [");
                i2.append(this.f1717g);
                i2.append("] pushed earlier.");
                p(i2.toString());
                return;
            }
            StringBuilder i3 = a.i("Popping property definer for property named [");
            i3.append(this.f1717g);
            i3.append("] from the object stack");
            n(i3.toString());
            iVar.v();
            String d2 = this.f1718h.d();
            if (d2 != null) {
                b.v(iVar, this.f1717g, d2, this.f1716f);
            }
        }
    }
}
