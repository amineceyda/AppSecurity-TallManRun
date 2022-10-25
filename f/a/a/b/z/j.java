package f.a.a.b.z;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class j {
    public static final ThreadFactory a = new a();

    public static class a implements ThreadFactory {
        public final ThreadFactory a = Executors.defaultThreadFactory();
        public final AtomicInteger b = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.newThread(runnable);
            if (!newThread.isDaemon()) {
                newThread.setDaemon(true);
            }
            StringBuilder i2 = g.a.a.a.a.i("logback-");
            i2.append(this.b.getAndIncrement());
            newThread.setName(i2.toString());
            return newThread;
        }
    }
}
