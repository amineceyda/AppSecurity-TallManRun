package i;

import i.o.b.a;
import java.io.Serializable;

public final class h<T> implements c<T>, Serializable {
    private volatile Object _value = i.a;
    private a<? extends T> initializer;
    private final Object lock = this;

    public h(a aVar, Object obj, int i2) {
        int i3 = i2 & 2;
        i.o.c.h.e(aVar, "initializer");
        this.initializer = aVar;
    }

    private final Object writeReplace() {
        return new a(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        T t3 = i.a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                a aVar = this.initializer;
                i.o.c.h.c(aVar);
                t = aVar.a();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public String toString() {
        return this._value != i.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
