package g.e.a.b.g;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class q<TResult> implements x<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public b c;

    public q(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void b(f<TResult> fVar) {
        if (fVar.i()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new p(this));
                }
            }
        }
    }
}
