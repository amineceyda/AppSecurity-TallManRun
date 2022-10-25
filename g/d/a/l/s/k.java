package g.d.a.l.s;

import g.d.a.l.s.e;
import g.d.a.l.t.b0.b;
import g.d.a.l.v.c.v;
import java.io.IOException;
import java.io.InputStream;

public final class k implements e<InputStream> {
    public final v a;

    public static final class a implements e.a<InputStream> {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }

        public e b(Object obj) {
            return new k((InputStream) obj, this.a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        v vVar = new v(inputStream, bVar);
        this.a = vVar;
        vVar.mark(5242880);
    }

    public void b() {
        this.a.b();
    }

    /* renamed from: c */
    public InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }
}
