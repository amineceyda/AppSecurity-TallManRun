package j.a;

import g.a.a.a.a;
import g.c.b.b.f;
import i.j;
import i.o.b.l;

public final class v0 extends d {
    public final l<Throwable, j> b;

    public v0(l<? super Throwable, j> lVar) {
        this.b = lVar;
    }

    public void a(Throwable th) {
        this.b.g(th);
    }

    public Object g(Object obj) {
        this.b.g((Throwable) obj);
        return j.a;
    }

    public String toString() {
        StringBuilder i2 = a.i("InvokeOnCancel[");
        i2.append(f.B(this.b));
        i2.append('@');
        i2.append(f.E(this));
        i2.append(']');
        return i2.toString();
    }
}
