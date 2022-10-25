package g.e.a.b.f.b;

import g.e.a.b.b.h.c;
import java.util.Objects;

public final class n8 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ w8 c;

    public n8(w8 w8Var, long j2) {
        this.c = w8Var;
        this.b = j2;
    }

    public final void run() {
        w8 w8Var = this.c;
        long j2 = this.b;
        w8Var.h();
        w8Var.l();
        w8Var.a.d().n.b("Activity resumed, time", Long.valueOf(j2));
        if (w8Var.a.f3258g.v() || w8Var.a.t().q.b()) {
            t8 t8Var = w8Var.f3391e;
            t8Var.f3359d.h();
            t8Var.c.a();
            t8Var.a = j2;
            t8Var.b = j2;
        }
        r8 r8Var = w8Var.f3392f;
        r8Var.b.h();
        q8 q8Var = r8Var.a;
        if (q8Var != null) {
            r8Var.b.c.removeCallbacks(q8Var);
        }
        r8Var.b.a.t().q.a(false);
        u8 u8Var = w8Var.f3390d;
        u8Var.a.h();
        if (u8Var.a.a.g()) {
            Objects.requireNonNull((c) u8Var.a.a.n);
            u8Var.b(System.currentTimeMillis(), false);
        }
    }
}
