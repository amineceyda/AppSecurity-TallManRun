package g.e.b.l.j.j;

import g.e.a.b.g.f;
import g.e.b.l.j.j.v;
import g.e.b.l.j.n.e;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class u implements Callable<f<Void>> {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ v.a b;

    public u(v.a aVar, Boolean bool) {
        this.b = aVar;
        this.a = bool;
    }

    public Object call() throws Exception {
        if (!this.a.booleanValue()) {
            g.e.b.l.j.f.a.e("Deleting cached crash reports...");
            g.e.b.l.j.n.f fVar = v.this.f3524g;
            for (File delete : g.e.b.l.j.n.f.i(fVar.a.listFiles(a.a))) {
                delete.delete();
            }
            e eVar = v.this.f3529l.b;
            eVar.a(eVar.b.d());
            eVar.a(eVar.b.c());
            eVar.a(eVar.b.b());
            v.this.p.b(null);
            return g.e.a.b.b.h.e.h(null);
        }
        g.e.b.l.j.f.a.b("Sending cached crash reports...");
        boolean booleanValue = this.a.booleanValue();
        g0 g0Var = v.this.b;
        Objects.requireNonNull(g0Var);
        if (booleanValue) {
            g0Var.f3491g.b(null);
            v.a aVar = this.b;
            Executor executor = v.this.f3522e.a;
            return aVar.a.l(executor, new t(this, executor));
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
