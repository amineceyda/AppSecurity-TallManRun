package f.a.a.a.g.c;

import f.a.a.b.q.b.b;
import f.a.a.b.q.d.i;
import g.a.a.a.a;
import org.xml.sax.Attributes;

public class c extends b {
    public void s(i iVar, String str, Attributes attributes) {
    }

    public void t(i iVar, String str) {
        String w = iVar.w(str);
        n("Setting logger context name as [" + w + "]");
        try {
            this.c.e(w);
        } catch (IllegalStateException e2) {
            StringBuilder i2 = a.i("Failed to rename context [");
            i2.append(this.c.c);
            i2.append("] as [");
            i2.append(w);
            i2.append("]");
            c(i2.toString(), e2);
        }
    }

    public void u(i iVar, String str) {
    }
}
