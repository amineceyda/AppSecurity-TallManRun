package i.m;

import i.m.f;
import i.o.b.p;
import java.io.Serializable;

public final class h implements f, Serializable {
    public static final h b = new h();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return b;
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.o.c.h.e(pVar, "operation");
        return r;
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        i.o.c.h.e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public f minusKey(f.b<?> bVar) {
        i.o.c.h.e(bVar, "key");
        return this;
    }

    public f plus(f fVar) {
        i.o.c.h.e(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
