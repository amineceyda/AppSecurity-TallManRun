package i.o.c;

import java.io.Serializable;

public final class o<T> implements Serializable {
    public T element;

    public String toString() {
        return String.valueOf(this.element);
    }
}
