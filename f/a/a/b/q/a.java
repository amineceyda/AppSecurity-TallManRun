package f.a.a.b.q;

import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.b.q.d.b;
import f.a.a.b.q.d.e;
import f.a.a.b.q.d.i;
import f.a.a.b.q.d.j;
import f.a.a.b.q.d.l;
import f.a.a.b.q.d.m;
import f.a.a.b.w.d;
import f.a.a.b.x.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.xml.sax.InputSource;

public abstract class a extends d {

    /* renamed from: e  reason: collision with root package name */
    public j f1708e;

    public static void z(f.a.a.b.d dVar, URL url) {
        if (dVar != null) {
            b c = f.a.a.b.q.e.a.c(dVar);
            if (c == null) {
                c = new b();
                c.g(dVar);
                dVar.f1687f.put("CONFIGURATION_WATCH_LIST", c);
            } else {
                c.f1736e = null;
                c.f1738g.clear();
                c.f1737f.clear();
            }
            c.f1736e = url;
            if (url != null) {
                c.s(url);
            }
        }
    }

    public e A() {
        return new e();
    }

    public abstract void s(f.a.a.b.q.d.d dVar);

    public abstract void t(j jVar);

    public abstract void u(l lVar);

    public void v() {
        m mVar = new m(this.c);
        u(mVar);
        j jVar = new j(this.c, mVar, A());
        this.f1708e = jVar;
        i iVar = jVar.b;
        iVar.g(this.c);
        t(this.f1708e);
        s(iVar.f1744j);
    }

    public final void w(InputStream inputStream, String str) throws JoranException {
        boolean z;
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        long currentTimeMillis = System.currentTimeMillis();
        f.a.a.b.q.c.e eVar = new f.a.a.b.q.c.e(this.c);
        eVar.h(inputSource);
        y(eVar.c);
        List<f.a.a.b.x.d> a = g.a(this.c.f1685d.c(), currentTimeMillis);
        Pattern compile = Pattern.compile("XML_PARSING");
        Iterator it = ((ArrayList) a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            f.a.a.b.x.d dVar = (f.a.a.b.x.d) it.next();
            if (2 == dVar.getLevel() && compile.matcher(dVar.getMessage()).lookingAt()) {
                z = true;
                break;
            }
        }
        if (!z) {
            n("Registering current configuration as safe fallback point");
            this.c.f1687f.put("SAFE_JORAN_CONFIGURATION", eVar.c);
        }
    }

    public final void x(URL url) throws JoranException {
        InputStream inputStream = null;
        try {
            z(this.c, url);
            URLConnection openConnection = url.openConnection();
            openConnection.setUseCaches(false);
            inputStream = openConnection.getInputStream();
            w(inputStream, url.toExternalForm());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (IOException e2) {
            String str = "Could not open URL [" + url + "].";
            c(str, e2);
            throw new JoranException(str, e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void y(List<f.a.a.b.q.c.d> list) throws JoranException {
        v();
        synchronized (this.c.f1688g) {
            this.f1708e.f1749g.a(list);
        }
    }
}
