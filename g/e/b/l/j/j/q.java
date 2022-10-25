package g.e.b.l.j.j;

import g.e.a.b.g.e;
import g.e.a.b.g.f;
import g.e.b.l.j.p.j.a;
import java.util.Arrays;
import java.util.concurrent.Executor;

public class q implements e<a, Void> {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ r b;

    public q(r rVar, Executor executor) {
        this.b = rVar;
        this.a = executor;
    }

    public f a(Object obj) throws Exception {
        if (((a) obj) == null) {
            g.e.b.l.j.f.a.f("Received null app settings, cannot send reports at crash time.");
            return g.e.a.b.b.h.e.h(null);
        }
        return g.e.a.b.b.h.e.p(Arrays.asList(new f[]{v.b(this.b.f3520e), this.b.f3520e.f3529l.f(this.a)}));
    }
}
