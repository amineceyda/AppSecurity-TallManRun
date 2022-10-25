package g.e.a.b.g;

import com.google.android.gms.tasks.RuntimeExecutionException;

public final class l implements Runnable {
    public final /* synthetic */ f b;
    public final /* synthetic */ m c;

    public l(m mVar, f fVar) {
        this.c = mVar;
        this.b = fVar;
    }

    public final void run() {
        if (this.b.i()) {
            this.c.c.o();
            return;
        }
        try {
            this.c.c.n(this.c.b.a(this.b));
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
