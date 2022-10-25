package g.e.b.l.j.j;

import g.e.a.b.g.f;
import g.e.a.b.g.g;
import java.util.concurrent.Callable;

public class p0 implements Runnable {
    public final /* synthetic */ Callable b;
    public final /* synthetic */ g c;

    public class a implements g.e.a.b.g.a<T, Void> {
        public a() {
        }

        public Object a(f fVar) throws Exception {
            if (fVar.k()) {
                g gVar = p0.this.c;
                gVar.a.n(fVar.h());
                return null;
            }
            g gVar2 = p0.this.c;
            gVar2.a.m(fVar.g());
            return null;
        }
    }

    public p0(Callable callable, g gVar) {
        this.b = callable;
        this.c = gVar;
    }

    public void run() {
        try {
            ((f) this.b.call()).d(new a());
        } catch (Exception e2) {
            this.c.a.m(e2);
        }
    }
}
