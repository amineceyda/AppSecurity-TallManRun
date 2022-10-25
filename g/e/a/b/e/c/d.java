package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {
    public final /* synthetic */ Iterator b;
    public final /* synthetic */ Iterator c;

    public d(Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }

    public final boolean hasNext() {
        if (this.b.hasNext()) {
            return true;
        }
        return this.c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b.hasNext()) {
            return new t(((Integer) this.b.next()).toString());
        }
        if (this.c.hasNext()) {
            return new t((String) this.c.next());
        }
        throw new NoSuchElementException();
    }
}
