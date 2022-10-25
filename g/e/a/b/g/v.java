package g.e.a.b.g;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class v implements Runnable {
    public final /* synthetic */ f b;
    public final /* synthetic */ w c;

    public v(w wVar, f fVar) {
        this.c = wVar;
        this.b = fVar;
    }

    public final void run() {
        try {
            f<TContinuationResult> a = this.c.b.a(this.b.h());
            if (a == null) {
                w wVar = this.c;
                wVar.c.m(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = h.b;
            a.c(executor, this.c);
            a.b(executor, this.c);
            a.a(executor, this.c);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.c.c.m((Exception) e2.getCause());
                return;
            }
            this.c.c.m(e2);
        } catch (CancellationException unused) {
            this.c.c.o();
        } catch (Exception e3) {
            this.c.c.m(e3);
        }
    }
}
