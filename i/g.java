package i;

import i.o.b.a;
import i.o.c.h;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class g<T> implements c<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<g<?>, Object> b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f0final;
    private volatile a<? extends T> initializer;

    public g(a<? extends T> aVar) {
        h.e(aVar, "initializer");
        this.initializer = aVar;
        i iVar = i.a;
        this._value = iVar;
        this.f0final = iVar;
    }

    private final Object writeReplace() {
        return new a(getValue());
    }

    public T getValue() {
        T t = this._value;
        T t2 = i.a;
        if (t != t2) {
            return t;
        }
        a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T a = aVar.a();
            if (b.compareAndSet(this, t2, a)) {
                this.initializer = null;
                return a;
            }
        }
        return this._value;
    }

    public String toString() {
        return this._value != i.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
