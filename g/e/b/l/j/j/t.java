package g.e.b.l.j.j;

import g.e.a.b.g.e;
import g.e.a.b.g.f;
import g.e.b.l.j.p.j.a;
import java.util.concurrent.Executor;

public class t implements e<a, Void> {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ u b;

    public t(u uVar, Executor executor) {
        this.b = uVar;
        this.a = executor;
    }

    public f a(Object obj) throws Exception {
        if (((a) obj) == null) {
            g.e.b.l.j.f.a.f("Received null app settings at app startup. Cannot send cached reports");
        } else {
            v.b(v.this);
            v.this.f3529l.f(this.a);
            v.this.p.b(null);
        }
        return g.e.a.b.b.h.e.h(null);
    }
}
