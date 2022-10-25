package g.e.b.p;

import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ g a;

    public /* synthetic */ e(g gVar) {
        this.a = gVar;
    }

    public final Object call() {
        g gVar = this.a;
        synchronized (gVar) {
            gVar.a.get().e(System.currentTimeMillis(), gVar.c.get().a());
        }
        return null;
    }
}
