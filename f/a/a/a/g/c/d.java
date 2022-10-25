package f.a.a.a.g.c;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.a.g.c.a;
import f.a.a.b.q.b.k;
import f.a.a.b.q.c.e;
import f.a.a.b.q.d.i;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

public class d extends k {
    public d() {
        this.f1722g = 1;
    }

    public e A(InputStream inputStream, URL url) {
        return new e(this.c);
    }

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
    }

    public void u(i iVar, String str) throws ActionException {
        if (!iVar.t() && (iVar.u() instanceof a.C0056a)) {
            URL url = ((a.C0056a) iVar.v()).a;
            if (url != null) {
                StringBuilder i2 = g.a.a.a.a.i("Path found [");
                i2.append(url.toString());
                i2.append("]");
                n(i2.toString());
                try {
                    z(iVar, url);
                } catch (JoranException e2) {
                    StringBuilder i3 = g.a.a.a.a.i("Failed to process include [");
                    i3.append(url.toString());
                    i3.append("]");
                    c(i3.toString(), e2);
                }
            } else {
                n("No paths found from includes");
            }
        }
    }
}
