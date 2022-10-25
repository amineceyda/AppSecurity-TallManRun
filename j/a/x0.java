package j.a;

import g.a.a.a.a;
import g.c.b.b.f;
import i.j;
import i.o.b.l;

public final class x0 extends b1<y0> {

    /* renamed from: f  reason: collision with root package name */
    public final l<Throwable, j> f4666f;

    public x0(y0 y0Var, l<? super Throwable, j> lVar) {
        super(y0Var);
        this.f4666f = lVar;
    }

    public Object g(Object obj) {
        this.f4666f.g((Throwable) obj);
        return j.a;
    }

    public void n(Throwable th) {
        this.f4666f.g(th);
    }

    public String toString() {
        StringBuilder i2 = a.i("InvokeOnCompletion[");
        i2.append(x0.class.getSimpleName());
        i2.append('@');
        i2.append(f.E(this));
        i2.append(']');
        return i2.toString();
    }
}
