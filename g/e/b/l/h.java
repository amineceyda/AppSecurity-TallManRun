package g.e.b.l;

import g.e.a.b.g.g;
import g.e.b.l.j.j.a0;
import g.e.b.l.j.j.p0;
import g.e.b.l.j.j.q0;
import g.e.b.l.j.j.z;
import g.e.b.l.j.p.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class h implements Callable<Void> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ a0 b;
    public final /* synthetic */ e c;

    public h(boolean z, a0 a0Var, e eVar) {
        this.a = z;
        this.b = a0Var;
        this.c = eVar;
    }

    public Object call() throws Exception {
        if (!this.a) {
            return null;
        }
        a0 a0Var = this.b;
        e eVar = this.c;
        ExecutorService executorService = a0Var.f3480k;
        z zVar = new z(a0Var, eVar);
        ExecutorService executorService2 = q0.a;
        executorService.execute(new p0(zVar, new g()));
        return null;
    }
}
