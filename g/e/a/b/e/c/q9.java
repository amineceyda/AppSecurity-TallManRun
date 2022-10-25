package g.e.a.b.e.c;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class q9 extends AbstractList implements RandomAccess, z7 {
    public final z7 b;

    public q9(z7 z7Var) {
        this.b = z7Var;
    }

    public final Object F(int i2) {
        return this.b.F(i2);
    }

    public final z7 b() {
        return this;
    }

    public final List d() {
        return this.b.d();
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((y7) this.b).get(i2);
    }

    public final Iterator iterator() {
        return new p9(this);
    }

    public final ListIterator listIterator(int i2) {
        return new o9(this, i2);
    }

    public final void n(s6 s6Var) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.b.size();
    }
}
