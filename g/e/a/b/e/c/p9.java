package g.e.a.b.e.c;

import java.util.Iterator;

public final class p9 implements Iterator {
    public final Iterator b;
    public final /* synthetic */ q9 c;

    public p9(q9 q9Var) {
        this.c = q9Var;
        this.b = q9Var.b.iterator();
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
