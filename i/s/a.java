package i.s;

import i.o.c.h;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements b<T> {
    public final AtomicReference<b<T>> a;

    public a(b<? extends T> bVar) {
        h.e(bVar, "sequence");
        this.a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        b andSet = this.a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
