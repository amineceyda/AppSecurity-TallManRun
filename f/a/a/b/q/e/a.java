package f.a.a.b.q.e;

import f.a.a.b.c;
import f.a.a.b.d;
import f.a.a.b.q.d.b;
import f.a.a.b.x.h;
import java.io.PrintStream;
import java.net.URL;

public class a {
    public static final a a = new a();

    public static void a(d dVar, f.a.a.b.x.d dVar2) {
        if (dVar == null) {
            PrintStream printStream = System.out;
            StringBuilder i2 = g.a.a.a.a.i("Null context in ");
            i2.append(b.class.getName());
            printStream.println(i2.toString());
            return;
        }
        c cVar = dVar.f1685d;
        if (cVar != null) {
            cVar.a(dVar2);
        }
    }

    public static void b(d dVar, URL url) {
        b c = c(dVar);
        if (c == null) {
            a(dVar, new h("Null ConfigurationWatchList. Cannot add " + url, a));
            return;
        }
        a(dVar, new f.a.a.b.x.b("Adding [" + url + "] to configuration watch list.", a));
        c.s(url);
    }

    public static b c(d dVar) {
        if (dVar == null) {
            return null;
        }
        return (b) dVar.f1687f.get("CONFIGURATION_WATCH_LIST");
    }
}
