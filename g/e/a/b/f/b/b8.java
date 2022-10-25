package g.e.a.b.f.b;

import java.util.Objects;

public final class b8 implements Runnable {
    public final /* synthetic */ v2 b;
    public final /* synthetic */ e8 c;

    public b8(e8 e8Var, v2 v2Var) {
        this.c = e8Var;
        this.b = v2Var;
    }

    public final void run() {
        synchronized (this.c) {
            this.c.a = false;
            if (!this.c.c.n()) {
                this.c.c.a.d().f3143m.a("Connected to remote service");
                f8 f8Var = this.c.c;
                v2 v2Var = this.b;
                f8Var.h();
                Objects.requireNonNull(v2Var, "null reference");
                f8Var.f3157d = v2Var;
                f8Var.s();
                f8Var.r();
            }
        }
    }
}
