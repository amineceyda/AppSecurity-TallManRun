package i.o.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, i.o.c.s.a {
    public int b;
    public final T[] c;

    public a(T[] tArr) {
        h.e(tArr, "array");
        this.c = tArr;
    }

    public boolean hasNext() {
        return this.b < this.c.length;
    }

    public T next() {
        try {
            T[] tArr = this.c;
            int i2 = this.b;
            this.b = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
