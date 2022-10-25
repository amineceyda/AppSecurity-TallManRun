package g.e.a.b.e.c;

import java.util.NoSuchElementException;

public final class n6 extends o6 {
    public int b = 0;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s6 f3009d;

    public n6(s6 s6Var) {
        this.f3009d = s6Var;
        this.c = s6Var.h();
    }

    public final byte a() {
        int i2 = this.b;
        if (i2 < this.c) {
            this.b = i2 + 1;
            return this.f3009d.e(i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.b < this.c;
    }
}
