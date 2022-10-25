package g.e.a.b.g;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class s<TResult> implements x<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy("mLock")
    @Nullable
    public c c;

    public s(Executor executor, c cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void b(f<TResult> fVar) {
        if (!fVar.k() && !fVar.i()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new r(this, fVar));
                }
            }
        }
    }
}
