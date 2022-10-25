package g.e.a.a.f;

import java.util.concurrent.Executor;

public class o implements Executor {
    public final Executor b;

    public static class a implements Runnable {
        public final Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        public void run() {
            try {
                this.b.run();
            } catch (Exception e2) {
                e.e.d.l.a.w("Executor", "Background execution failure.", e2);
            }
        }
    }

    public o(Executor executor) {
        this.b = executor;
    }

    public void execute(Runnable runnable) {
        this.b.execute(new a(runnable));
    }
}
