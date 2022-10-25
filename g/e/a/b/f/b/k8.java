package g.e.a.b.f.b;

import java.util.ArrayList;

public final class k8 implements Runnable {
    public final /* synthetic */ k9 b;
    public final /* synthetic */ Runnable c;

    public k8(k9 k9Var, Runnable runnable) {
        this.b = k9Var;
        this.c = runnable;
    }

    public final void run() {
        this.b.a();
        k9 k9Var = this.b;
        Runnable runnable = this.c;
        k9Var.b().h();
        if (k9Var.p == null) {
            k9Var.p = new ArrayList();
        }
        k9Var.p.add(runnable);
        this.b.u();
    }
}
