package g.e.a.b.g;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class u<TResult> implements x<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public d<? super TResult> c;

    public u(Executor executor, d<? super TResult> dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public final void b(f<TResult> fVar) {
        if (fVar.k()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new t(this, fVar));
                }
            }
        }
    }
}
