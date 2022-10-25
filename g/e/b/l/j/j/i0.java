package g.e.b.l.j.j;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class i0 implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicLong b;

    public class a extends j {
        public final /* synthetic */ Runnable b;

        public a(i0 i0Var, Runnable runnable) {
            this.b = runnable;
        }

        public void a() {
            this.b.run();
        }
    }

    public i0(String str, AtomicLong atomicLong) {
        this.a = str;
        this.b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        newThread.setName(this.a + this.b.getAndIncrement());
        return newThread;
    }
}
