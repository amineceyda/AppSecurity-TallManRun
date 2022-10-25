package g.e.a.b.e.c;

import java.util.Iterator;

public abstract class o6 implements Iterator {
    public abstract byte a();

    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
