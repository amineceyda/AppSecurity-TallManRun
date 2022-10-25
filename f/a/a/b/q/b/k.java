package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.b.q.c.d;
import f.a.a.b.q.c.e;
import f.a.a.b.q.d.g;
import f.a.a.b.q.d.i;
import g.a.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import org.xml.sax.InputSource;

public class k extends a {

    /* renamed from: g  reason: collision with root package name */
    public int f1722g = 2;

    public e A(InputStream inputStream, URL url) {
        return new e(this.c);
    }

    public final void B(e eVar) {
        boolean z;
        boolean z2;
        int i2;
        d dVar;
        List<d> list = eVar.c;
        if (list.size() != 0) {
            d dVar2 = list.get(0);
            if (dVar2 != null) {
                String str = dVar2.c.length() > 0 ? dVar2.c : dVar2.b;
                z = "included".equalsIgnoreCase(str);
                z2 = "configuration".equalsIgnoreCase(str);
            } else {
                z2 = false;
                z = false;
            }
            if (z || z2) {
                list.remove(0);
                int size = list.size();
                if (size != 0 && (dVar = list.get(i2)) != null) {
                    String str2 = dVar.c.length() > 0 ? dVar.c : dVar.b;
                    if ((z && "included".equalsIgnoreCase(str2)) || (z2 && "configuration".equalsIgnoreCase(str2))) {
                        list.remove(size - 1);
                    }
                }
            }
        }
    }

    public void z(i iVar, URL url) throws JoranException {
        InputStream inputStream;
        try {
            inputStream = url.openStream();
        } catch (IOException e2) {
            StringBuilder i2 = a.i("Failed to open [");
            i2.append(url.toString());
            i2.append("]");
            y(i2.toString(), e2);
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                f.a.a.b.q.e.a.b(this.c, url);
                e A = A(inputStream, url);
                A.b.g(this.c);
                A.h(new InputSource(inputStream));
                B(A);
                g gVar = iVar.f1742h.f1749g;
                gVar.b.addAll(gVar.c + this.f1722g, A.c);
            } catch (JoranException e3) {
                y("Failed processing [" + url.toString() + "]", e3);
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }
}
