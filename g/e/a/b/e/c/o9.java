package g.e.a.b.e.c;

import java.util.ListIterator;

public final class o9 implements ListIterator {
    public final ListIterator b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q9 f3015d;

    public o9(q9 q9Var, int i2) {
        this.f3015d = q9Var;
        this.c = i2;
        this.b = q9Var.b.listIterator(i2);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.b.next();
    }

    public final int nextIndex() {
        return this.b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.b.previous();
    }

    public final int previousIndex() {
        return this.b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
