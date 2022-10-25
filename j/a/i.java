package j.a;

import g.a.a.a.a;
import i.j;
import i.m.d;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public final class i extends z0<y0> {

    /* renamed from: f  reason: collision with root package name */
    public final g<?> f4609f;

    public i(y0 y0Var, g<?> gVar) {
        super(y0Var);
        this.f4609f = gVar;
    }

    public /* bridge */ /* synthetic */ Object g(Object obj) {
        n((Throwable) obj);
        return j.a;
    }

    public void n(Throwable th) {
        g<?> gVar = this.f4609f;
        J j2 = this.f4584e;
        Objects.requireNonNull(gVar);
        CancellationException o = j2.o();
        boolean z = false;
        if (gVar.f4608d == 0) {
            d<T> dVar = gVar.f4607f;
            if (!(dVar instanceof d0)) {
                dVar = null;
            }
            d0 d0Var = (d0) dVar;
            if (d0Var != null) {
                z = d0Var.n(o);
            }
        }
        if (!z) {
            gVar.h(o);
            gVar.k();
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("ChildContinuation[");
        i2.append(this.f4609f);
        i2.append(']');
        return i2.toString();
    }
}
