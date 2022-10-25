package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c9 implements Iterator {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
