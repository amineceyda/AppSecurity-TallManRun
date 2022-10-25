package g.i.c.a.a.x.d;

import java.util.concurrent.Callable;

public class g implements Callable<Void> {
    public final /* synthetic */ Runnable a;

    public g(f fVar, Runnable runnable) {
        this.a = runnable;
    }

    public Object call() throws Exception {
        this.a.run();
        return null;
    }
}
