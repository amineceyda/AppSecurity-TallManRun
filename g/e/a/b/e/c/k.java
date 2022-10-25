package g.e.a.b.e.c;

import java.util.Iterator;

public final class k implements Iterator {
    public final /* synthetic */ Iterator b;

    public k(Iterator it) {
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new t((String) this.b.next());
    }
}
