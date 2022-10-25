package i.l;

import i.o.c.s.a;
import java.util.Iterator;

public abstract class h implements Iterator<Integer>, a {
    public abstract int a();

    public Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
