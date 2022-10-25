package f.a.a.a.g;

import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.a.c;
import f.a.a.b.q.e.a;
import f.a.a.b.w.d;
import f.a.a.b.x.g;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class b extends d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public long f1625e = System.currentTimeMillis();

    /* JADX WARNING: type inference failed for: r3v8, types: [f.a.a.b.w.d, f.a.a.a.g.a, f.a.a.b.q.a] */
    public void run() {
        boolean z;
        f.a.a.b.q.d.b c = a.c(this.c);
        if (c == null) {
            p("Empty ConfigurationWatchList in context");
        } else if (new ArrayList(c.f1737f).isEmpty()) {
            n("Empty watch file list. Disabling ");
        } else {
            int size = c.f1737f.size();
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                } else if (c.f1738g.get(i2).longValue() != c.f1737f.get(i2).lastModified()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                URL url = c.f1736e;
                n("Detected change in configuration files.");
                n("Will reset and reconfigure context named [" + this.c.c + "]");
                c cVar = (c) this.c;
                if (url.toString().endsWith("xml")) {
                    ? aVar = new a();
                    aVar.g(this.c);
                    f.a.a.b.c cVar2 = this.c.f1685d;
                    List list = (List) aVar.c.f1687f.get("SAFE_JORAN_CONFIGURATION");
                    a.c(this.c);
                    cVar.n();
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        aVar.x(url);
                        List<f.a.a.b.x.d> a = g.a(cVar2.c(), currentTimeMillis);
                        Pattern compile = Pattern.compile("XML_PARSING");
                        Iterator it = ((ArrayList) a).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            f.a.a.b.x.d dVar = (f.a.a.b.x.d) it.next();
                            if (2 == dVar.getLevel()) {
                                if (compile.matcher(dVar.getMessage()).lookingAt()) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            s(cVar, list);
                        }
                    } catch (JoranException unused) {
                        s(cVar, list);
                    }
                } else if (url.toString().endsWith("groovy")) {
                    m("Groovy classes are not available on the class path. ABORTING INITIALIZATION.");
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [f.a.a.b.w.d, f.a.a.a.g.a, f.a.a.b.q.a] */
    public final void s(c cVar, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f.a.a.b.q.c.d dVar = (f.a.a.b.q.c.d) it.next();
                if (!"include".equalsIgnoreCase(dVar.b)) {
                    arrayList.add(dVar);
                }
            }
        }
        ? aVar = new a();
        aVar.g(this.c);
        f.a.a.b.q.d.b c = a.c(this.c);
        Objects.requireNonNull(c);
        f.a.a.b.q.d.b bVar = new f.a.a.b.q.d.b();
        bVar.f1736e = c.f1736e;
        bVar.f1737f = new ArrayList(c.f1737f);
        bVar.f1738g = new ArrayList(c.f1738g);
        if (arrayList.isEmpty()) {
            p("No previous configuration to fall back on.");
            return;
        }
        p("Given previous errors, falling back to previously registered safe configuration.");
        try {
            cVar.n();
            this.c.f1687f.put("CONFIGURATION_WATCH_LIST", bVar);
            aVar.y(arrayList);
            n("Re-registering previous fallback configuration once more as a fallback configuration point");
            aVar.c.f1687f.put("SAFE_JORAN_CONFIGURATION", list);
            n("after registerSafeConfiguration: " + list);
        } catch (JoranException e2) {
            c("Unexpected exception thrown by a configuration considered safe.", e2);
        }
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ReconfigureOnChangeTask(born:");
        i2.append(this.f1625e);
        i2.append(")");
        return i2.toString();
    }
}
