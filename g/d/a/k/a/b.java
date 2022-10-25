package g.d.a.k.a;

import g.d.a.l.u.g;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.r;
import java.io.InputStream;
import k.d;
import k.u;

public class b implements n<g, InputStream> {
    public final d.a a;

    public static class a implements o<g, InputStream> {
        public static volatile d.a b;
        public final d.a a;

        public a() {
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        b = new u(new u.b());
                    }
                }
            }
            this.a = b;
        }

        public n<g, InputStream> b(r rVar) {
            return new b(this.a);
        }

        public void c() {
        }
    }

    public b(d.a aVar) {
        this.a = aVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        g gVar = (g) obj;
        return new n.a(gVar, new a(this.a, gVar));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        return true;
    }
}
