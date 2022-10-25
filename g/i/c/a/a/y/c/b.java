package g.i.c.a.a.y.c;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();
    public final String b;
    public final AtomicInteger c = new AtomicInteger(0);

    public b(String str) {
        this.b = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        if (newThread != null) {
            newThread.setName(this.b + "-" + this.c.getAndIncrement());
        }
        return newThread;
    }
}
