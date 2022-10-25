package i;

import i.o.b.a;
import i.o.c.h;
import java.io.Serializable;

public final class k<T> implements c<T>, Serializable {
    private Object _value = i.a;
    private a<? extends T> initializer;

    public k(a<? extends T> aVar) {
        h.e(aVar, "initializer");
        this.initializer = aVar;
    }

    private final Object writeReplace() {
        return new a(getValue());
    }

    public T getValue() {
        if (this._value == i.a) {
            a<? extends T> aVar = this.initializer;
            h.c(aVar);
            this._value = aVar.a();
            this.initializer = null;
        }
        return this._value;
    }

    public String toString() {
        return this._value != i.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
