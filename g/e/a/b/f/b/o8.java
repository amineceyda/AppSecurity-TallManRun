package g.e.a.b.f.b;

import g.e.a.b.b.h.c;
import java.util.Objects;

public final class o8 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ w8 c;

    public o8(w8 w8Var, long j2) {
        this.c = w8Var;
        this.b = j2;
    }

    public final void run() {
        w8 w8Var = this.c;
        long j2 = this.b;
        w8Var.h();
        w8Var.l();
        w8Var.a.d().n.b("Activity paused, time", Long.valueOf(j2));
        r8 r8Var = w8Var.f3392f;
        Objects.requireNonNull((c) r8Var.b.a.n);
        q8 q8Var = new q8(r8Var, System.currentTimeMillis(), j2);
        r8Var.a = q8Var;
        r8Var.b.c.postDelayed(q8Var, 2000);
        if (w8Var.a.f3258g.v()) {
            w8Var.f3391e.c.a();
        }
    }
}
