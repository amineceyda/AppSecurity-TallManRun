package g.c.a.e.j;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {
    public ThreadPoolExecutor a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public long f1991d;

    public b(int i2, int i3, long j2) {
        this.b = i2;
        this.c = i3;
        this.f1991d = j2;
    }

    public void a(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (this) {
            ThreadPoolExecutor threadPoolExecutor2 = this.a;
            if (threadPoolExecutor2 == null || threadPoolExecutor2.isShutdown()) {
                this.a = new ThreadPoolExecutor(this.b, this.c, this.f1991d, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
            }
            threadPoolExecutor = this.a;
        }
        threadPoolExecutor.execute(runnable);
    }
}
