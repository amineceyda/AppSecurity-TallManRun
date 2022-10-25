package g.e.a.b.f.b;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class g6 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ q6 c;

    public g6(q6 q6Var, AtomicReference atomicReference) {
        this.c = q6Var;
        this.b = atomicReference;
    }

    public final void run() {
        String str;
        synchronized (this.b) {
            try {
                AtomicReference atomicReference = this.b;
                n4 n4Var = this.c.a;
                f fVar = n4Var.f3258g;
                String m2 = n4Var.q().m();
                r2 r2Var = s2.L;
                Objects.requireNonNull(fVar);
                if (m2 == null) {
                    str = null;
                } else {
                    str = fVar.c.a(m2, r2Var.a);
                }
                atomicReference.set((String) r2Var.a(str));
                this.b.notify();
            } catch (Throwable th) {
                this.b.notify();
                throw th;
            }
        }
    }
}
