package g.e.a.b.f.b;

import android.os.Bundle;

public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ q8 b;

    public /* synthetic */ p8(q8 q8Var) {
        this.b = q8Var;
    }

    public final void run() {
        q8 q8Var = this.b;
        r8 r8Var = q8Var.f3313d;
        long j2 = q8Var.b;
        long j3 = q8Var.c;
        r8Var.b.h();
        r8Var.b.a.d().f3143m.a("Application going to the background");
        r8Var.b.a.t().q.a(true);
        Bundle bundle = new Bundle();
        if (!r8Var.b.a.f3258g.v()) {
            r8Var.b.f3391e.c.a();
            r8Var.b.f3391e.a(false, false, j3);
        }
        r8Var.b.a.v().p("auto", "_ab", j2, bundle);
    }
}
