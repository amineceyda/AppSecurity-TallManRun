package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class s implements Iterator {
    public int b = 0;
    public final /* synthetic */ t c;

    public s(t tVar) {
        this.c = tVar;
    }

    public final boolean hasNext() {
        return this.b < this.c.b.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.b;
        t tVar = this.c;
        if (i2 < tVar.b.length()) {
            String str = tVar.b;
            this.b = i2 + 1;
            return new t(String.valueOf(str.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
