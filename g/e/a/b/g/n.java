package g.e.a.b.g;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

public final class n implements Runnable {
    public final /* synthetic */ f b;
    public final /* synthetic */ o c;

    public n(o oVar, f fVar) {
        this.c = oVar;
        this.b = fVar;
    }

    public final void run() {
        try {
            f a = this.c.b.a(this.b);
            if (a == null) {
                o oVar = this.c;
                oVar.c.m(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = h.b;
            a.c(executor, this.c);
            a.b(executor, this.c);
            a.a(executor, this.c);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.c.c.m((Exception) e2.getCause());
            } else {
                this.c.c.m(e2);
            }
        } catch (Exception e3) {
            this.c.c.m(e3);
        }
    }
}
