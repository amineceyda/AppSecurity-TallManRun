package i;

import java.io.Serializable;

public final class a<T> implements c<T>, Serializable {
    private final T value;

    public a(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
