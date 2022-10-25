package j.a;

import i.m.d;
import i.m.f;
import j.a.t1.n;
import j.a.t1.p;

public final class e0 {
    public static final n a = new n("UNDEFINED");
    public static final n b = new n("REUSABLE_CLAIMED");

    public static final <T> void a(d<? super T> dVar, Object obj) {
        boolean z;
        f c;
        Object c2;
        if (dVar instanceof d0) {
            d0 d0Var = (d0) dVar;
            Object t0 = g.c.b.b.f.t0(obj);
            if (d0Var.f4596h.F(d0Var.c())) {
                d0Var.f4593e = t0;
                d0Var.f4608d = 1;
                d0Var.f4596h.v(d0Var.c(), d0Var);
                return;
            }
            n1 n1Var = n1.b;
            l0 a2 = n1.a();
            if (a2.V()) {
                d0Var.f4593e = t0;
                d0Var.f4608d = 1;
                a2.Q(d0Var);
                return;
            }
            a2.S(true);
            try {
                y0 y0Var = (y0) d0Var.c().get(y0.P);
                if (y0Var == null || y0Var.a()) {
                    z = false;
                } else {
                    d0Var.g(g.c.b.b.f.v(y0Var.o()));
                    z = true;
                }
                if (!z) {
                    c = d0Var.c();
                    c2 = p.c(c, d0Var.f4595g);
                    d0Var.f4597i.g(obj);
                    p.a(c, c2);
                }
                do {
                } while (a2.X());
            } catch (Throwable th) {
                try {
                    d0Var.f(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.O(true);
                    throw th2;
                }
            }
            a2.O(true);
            return;
        }
        dVar.g(obj);
    }
}
