package i.m;

import i.m.f;
import i.o.b.p;
import i.o.c.h;

public abstract class a implements f.a {
    private final f.b<?> key;

    public a(f.b<?> bVar) {
        h.e(bVar, "key");
        this.key = bVar;
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        h.e(pVar, "operation");
        return f.a.C0191a.a(this, r, pVar);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        h.e(bVar, "key");
        return f.a.C0191a.b(this, bVar);
    }

    public f.b<?> getKey() {
        return this.key;
    }

    public f minusKey(f.b<?> bVar) {
        h.e(bVar, "key");
        return f.a.C0191a.c(this, bVar);
    }

    public f plus(f fVar) {
        h.e(fVar, "context");
        return f.a.C0191a.d(this, fVar);
    }
}
