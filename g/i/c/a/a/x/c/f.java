package g.i.c.a.a.x.c;

import java.util.concurrent.Callable;

public class f implements Callable<Void> {
    public final /* synthetic */ Runnable a;

    public f(g gVar, Runnable runnable) {
        this.a = runnable;
    }

    public Object call() throws Exception {
        this.a.run();
        return null;
    }
}
