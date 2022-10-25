package f.a.a.a.g.c;

import f.a.a.a.c;
import f.a.a.b.q.b.b;
import f.a.a.b.q.d.i;
import g.a.a.a.a;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public class f extends b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1627e = false;

    /* renamed from: f  reason: collision with root package name */
    public f.a.a.a.b f1628f;

    public void s(i iVar, String str, Attributes attributes) {
        this.f1627e = false;
        this.f1628f = null;
        c cVar = (c) this.c;
        String w = iVar.w(attributes.getValue("name"));
        if (e.e.f.b.s(w)) {
            this.f1627e = true;
            StringBuilder i2 = a.i("line: ");
            i2.append(v(iVar));
            i2.append(", column: ");
            Locator locator = iVar.f1742h.f1748f;
            i2.append(locator != null ? locator.getColumnNumber() : -1);
            String sb = i2.toString();
            m("No 'name' attribute in element " + str + ", around " + sb);
            return;
        }
        this.f1628f = cVar.getLogger(w);
        String w2 = iVar.w(attributes.getValue("level"));
        if (!e.e.f.b.s(w2)) {
            if ("INHERITED".equalsIgnoreCase(w2) || "NULL".equalsIgnoreCase(w2)) {
                n("Setting level of logger [" + w + "] to null, i.e. INHERITED");
                this.f1628f.l((f.a.a.a.a) null);
            } else {
                f.a.a.a.a b = f.a.a.a.a.b(w2, f.a.a.a.a.f1612f);
                n("Setting level of logger [" + w + "] to " + b);
                this.f1628f.l(b);
            }
        }
        String w3 = iVar.w(attributes.getValue("additivity"));
        if (!e.e.f.b.s(w3)) {
            boolean booleanValue = Boolean.valueOf(w3).booleanValue();
            n("Setting additivity of logger [" + w + "] to " + booleanValue);
            this.f1628f.f1619g = booleanValue;
        }
        iVar.f1739e.push(this.f1628f);
    }

    public void u(i iVar, String str) {
        if (!this.f1627e) {
            Object u = iVar.u();
            if (u != this.f1628f) {
                StringBuilder i2 = a.i("The object on the top the of the stack is not ");
                i2.append(this.f1628f);
                i2.append(" pushed earlier");
                p(i2.toString());
                p("It is: " + u);
                return;
            }
            iVar.v();
        }
    }
}
