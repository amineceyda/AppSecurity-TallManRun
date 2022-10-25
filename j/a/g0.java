package j.a;

import g.c.b.b.f;
import i.j;
import i.m.d;
import j.a.t1.p;
import j.a.u1.h;
import j.a.u1.i;

public abstract class g0<T> extends h {

    /* renamed from: d  reason: collision with root package name */
    public int f4608d;

    public g0(int i2) {
        this.f4608d = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract d<T> b();

    public <T> T d(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                f.c(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            i.o.c.h.c(th);
            f.J(b().c(), new z("Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object j();

    public final void run() {
        Object obj;
        i.m.f c;
        Object c2;
        Object obj2;
        i iVar = this.c;
        try {
            d b = b();
            if (b != null) {
                d0 d0Var = (d0) b;
                d<T> dVar = d0Var.f4597i;
                c = dVar.c();
                Object j2 = j();
                c2 = p.c(c, d0Var.f4595g);
                p pVar = (p) (!(j2 instanceof p) ? null : j2);
                Throwable th = pVar != null ? pVar.a : null;
                y0 y0Var = f.O(this.f4608d) ? (y0) c.get(y0.P) : null;
                if (th == null && y0Var != null && !y0Var.a()) {
                    th = y0Var.o();
                    a(j2, th);
                } else if (th == null) {
                    obj2 = d(j2);
                    dVar.g(obj2);
                    Object obj3 = j.a;
                    p.a(c, c2);
                    iVar.g();
                    f((Throwable) null, i.f.a(obj3));
                    return;
                }
                obj2 = f.v(th);
                dVar.g(obj2);
                Object obj32 = j.a;
                p.a(c, c2);
                try {
                    iVar.g();
                } catch (Throwable th2) {
                    obj32 = f.v(th2);
                }
                f((Throwable) null, i.f.a(obj32));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th3) {
            try {
                iVar.g();
                obj = j.a;
            } catch (Throwable th4) {
                obj = f.v(th4);
            }
            f(th3, i.f.a(obj));
        }
    }
}
