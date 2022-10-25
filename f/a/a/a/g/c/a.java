package f.a.a.a.g.c;

import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.b.q.d.i;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;

public class a extends f.a.a.b.q.b.a {

    /* renamed from: f.a.a.a.g.c.a$a  reason: collision with other inner class name */
    public class C0056a {
        public URL a;

        public C0056a(a aVar) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(f.a.a.b.q.d.i r3, java.lang.String r4, org.xml.sax.Attributes r5) throws ch.qos.logback.core.joran.spi.ActionException {
        /*
            r2 = this;
            boolean r0 = r3.t()
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r3.u()
            boolean r1 = r0 instanceof f.a.a.a.g.c.a.C0056a
            if (r1 == 0) goto L_0x0015
            f.a.a.a.g.c.a$a r0 = (f.a.a.a.g.c.a.C0056a) r0
            java.net.URL r0 = r0.a
            if (r0 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            return
        L_0x0019:
            super.s(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.g.c.a.s(f.a.a.b.q.d.i, java.lang.String, org.xml.sax.Attributes):void");
    }

    public void x(String str, Exception exc) {
        if (exc == null || (exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException)) {
            n(str);
        } else {
            q(str, exc);
        }
    }

    public void z(i iVar, URL url) throws JoranException {
        C0056a aVar = new C0056a(this);
        aVar.a = url;
        iVar.f1739e.push(aVar);
    }
}
