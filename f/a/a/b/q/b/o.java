package f.a.a.b.q.b;

import e.e.f.b;
import f.a.a.b.q.d.f;
import f.a.a.b.q.d.i;
import f.a.a.b.q.d.m;
import g.a.a.a.a;
import org.xml.sax.Attributes;

public class o extends b {
    public void s(i iVar, String str, Attributes attributes) {
        String str2;
        String value = attributes.getValue("pattern");
        String value2 = attributes.getValue("actionClass");
        if (b.s(value)) {
            str2 = "No 'pattern' attribute in <newRule>";
        } else if (b.s(value2)) {
            str2 = "No 'actionClass' attribute in <newRule>";
        } else {
            try {
                n("About to add new Joran parsing rule [" + value + "," + value2 + "].");
                ((m) iVar.f1742h.a).t(new f(value), value2);
                return;
            } catch (Exception unused) {
                m(a.d("Could not add new Joran parsing rule [", value, ",", value2, "]"));
                return;
            }
        }
        m(str2);
    }

    public void u(i iVar, String str) {
    }
}
