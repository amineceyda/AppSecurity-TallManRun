package j.a;

import g.a.a.a.a;
import i.j;

public final class k extends z0<c1> implements j {

    /* renamed from: f  reason: collision with root package name */
    public final l f4610f;

    public k(c1 c1Var, l lVar) {
        super(c1Var);
        this.f4610f = lVar;
    }

    public boolean f(Throwable th) {
        return ((c1) this.f4584e).v(th);
    }

    public /* bridge */ /* synthetic */ Object g(Object obj) {
        n((Throwable) obj);
        return j.a;
    }

    public void n(Throwable th) {
        this.f4610f.s((j1) this.f4584e);
    }

    public String toString() {
        StringBuilder i2 = a.i("ChildHandle[");
        i2.append(this.f4610f);
        i2.append(']');
        return i2.toString();
    }
}
