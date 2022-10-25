package i.m;

import i.m.f;
import i.m.f.a;
import i.o.b.l;
import i.o.c.h;

public abstract class b<B extends f.a, E extends B> implements f.b<E> {
    public final f.b<?> a;
    public final l<f.a, E> b;

    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        h.e(bVar, "baseKey");
        h.e(lVar, "safeCast");
        this.b = lVar;
        this.a = bVar instanceof b ? ((b) bVar).a : bVar;
    }

    public final E a(f.a aVar) {
        h.e(aVar, "element");
        return (f.a) this.b.g(aVar);
    }
}
