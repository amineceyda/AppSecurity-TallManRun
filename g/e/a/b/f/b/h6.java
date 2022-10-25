package g.e.a.b.f.b;

import java.util.concurrent.atomic.AtomicReference;

public final class h6 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ q6 c;

    public h6(q6 q6Var, AtomicReference atomicReference) {
        this.c = q6Var;
        this.b = atomicReference;
    }

    public final void run() {
        synchronized (this.b) {
            try {
                AtomicReference atomicReference = this.b;
                n4 n4Var = this.c.a;
                atomicReference.set(Long.valueOf(n4Var.f3258g.q(n4Var.q().m(), s2.M)));
                this.b.notify();
            } catch (Throwable th) {
                this.b.notify();
                throw th;
            }
        }
    }
}
