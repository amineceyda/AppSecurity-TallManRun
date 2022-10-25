package g.e.b.k;

import g.e.b.q.a;
import g.e.b.q.b;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ z b;
    public final /* synthetic */ b c;

    public /* synthetic */ g(z zVar, b bVar) {
        this.b = zVar;
        this.c = bVar;
    }

    public final void run() {
        a.C0124a<T> aVar;
        z zVar = this.b;
        b<T> bVar = this.c;
        if (zVar.b == j.a) {
            synchronized (zVar) {
                aVar = zVar.a;
                zVar.a = null;
                zVar.b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
