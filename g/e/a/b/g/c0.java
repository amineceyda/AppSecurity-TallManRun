package g.e.a.b.g;

import java.util.concurrent.Callable;

public final class c0 implements Runnable {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ Callable c;

    public c0(b0 b0Var, Callable callable) {
        this.b = b0Var;
        this.c = callable;
    }

    public final void run() {
        try {
            this.b.n(this.c.call());
        } catch (Exception e2) {
            this.b.m(e2);
        } catch (Throwable th) {
            this.b.m(new RuntimeException(th));
        }
    }
}
