package f.a.a.b.q.b;

import f.a.a.b.q.d.i;
import f.a.a.b.q.e.d;
import org.xml.sax.Attributes;

public class p extends b {
    public void s(i iVar, String str, Attributes attributes) {
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        if (value == null) {
            m("No name attribute in <param> element");
        } else if (value2 == null) {
            m("No value attribute in <param> element");
        } else {
            String trim = value2.trim();
            d dVar = new d(iVar.u());
            dVar.g(this.c);
            dVar.E(iVar.w(value), iVar.w(trim));
        }
    }

    public void u(i iVar, String str) {
    }
}
