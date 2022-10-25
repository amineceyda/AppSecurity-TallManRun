package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class r implements Iterator {
    public int b = 0;
    public final /* synthetic */ t c;

    public r(t tVar) {
        this.c = tVar;
    }

    public final boolean hasNext() {
        return this.b < this.c.b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.b;
        if (i2 < this.c.b.length()) {
            this.b = i2 + 1;
            return new t(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
