package g.i.b.e.b.a;

import java.lang.Thread;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class d extends ThreadPoolExecutor {
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicLong c = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f4095d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public long f4096e = 1000;

    public class a implements Thread.UncaughtExceptionHandler {
        public a(d dVar) {
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            th.printStackTrace();
        }
    }

    public static class b implements RejectedExecutionHandler {
        public b(byte b) {
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            throw new RejectedExecutionException();
        }
    }

    public d(int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(0, i2, 5, timeUnit, blockingQueue, threadFactory, new b((byte) 0));
    }

    public final void a() {
        if (b()) {
            long longValue = this.f4095d.longValue();
            if (this.f4096e + longValue < System.currentTimeMillis() && this.f4095d.compareAndSet(longValue, System.currentTimeMillis() + 1)) {
                Thread.currentThread().setUncaughtExceptionHandler(new a(this));
                throw new RuntimeException("Stopping thread to avoid potential memory leaks after a context was stopped.");
            }
        }
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        this.b.decrementAndGet();
        if (th == null) {
            a();
        }
    }

    public final boolean b() {
        if (this.f4096e < 0 || !(Thread.currentThread() instanceof c)) {
            return false;
        }
        Objects.requireNonNull((c) Thread.currentThread());
        return 0 < this.c.longValue();
    }

    public final void execute(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b.incrementAndGet();
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e2) {
            if (getQueue() instanceof b) {
                b bVar = (b) getQueue();
                if (bVar.a.isShutdown()) {
                    throw new RejectedExecutionException("Executor not running, can't force a command into the queue");
                } else if (!bVar.offer(runnable, 0, timeUnit)) {
                    this.b.decrementAndGet();
                    throw new RejectedExecutionException("Queue capacity is full.");
                }
            } else {
                this.b.decrementAndGet();
                throw e2;
            }
        } catch (InterruptedException e3) {
            this.b.decrementAndGet();
            Thread.interrupted();
            throw new RejectedExecutionException(e3);
        }
    }
}
