package g.d.a.l.u.y;

import g.d.a.l.u.g;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.r;
import java.io.InputStream;
import java.net.URL;

public class f implements n<URL, InputStream> {
    public final n<g, InputStream> a;

    public static class a implements o<URL, InputStream> {
        public n<URL, InputStream> b(r rVar) {
            return new f(rVar.c(g.class, InputStream.class));
        }

        public void c() {
        }
    }

    public f(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        return this.a.a(new g((URL) obj), i2, i3, nVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
