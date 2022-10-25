package g.e.b.k;

import g.e.b.q.a;
import g.e.b.q.b;

public class z<T> implements b<T>, a<T> {
    public static final /* synthetic */ int c = 0;
    public a.C0124a<T> a;
    public volatile b<T> b;

    public z(a.C0124a<T> aVar, b<T> bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public void a(a.C0124a<T> aVar) {
        b<T> bVar;
        b<T> bVar2 = this.b;
        j jVar = j.a;
        if (bVar2 != jVar) {
            aVar.a(bVar2);
            return;
        }
        b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.b;
            if (bVar != jVar) {
                bVar3 = bVar;
            } else {
                this.a = new l(this.a, aVar);
            }
        }
        if (bVar3 != null) {
            aVar.a(bVar);
        }
    }

    public T get() {
        return this.b.get();
    }
}
