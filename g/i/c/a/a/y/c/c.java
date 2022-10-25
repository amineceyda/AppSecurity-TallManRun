package g.i.c.a.a.y.c;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class c implements ScheduledExecutorService {
    public Handler b;
    public BlockingQueue<a> c = new LinkedBlockingDeque();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f4563d = false;

    public c(Looper looper) {
        this.b = new Handler(looper);
    }

    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    public void execute(Runnable runnable) {
        schedule(runnable, 0, TimeUnit.MILLISECONDS);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return null;
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return null;
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return null;
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isShutdown() {
        return this.f4563d;
    }

    public boolean isTerminated() {
        return this.f4563d;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (this.f4563d) {
            return null;
        }
        a aVar = new a(runnable, this.b, timeUnit.convert(j2, TimeUnit.MILLISECONDS), 0);
        this.c.add(aVar);
        this.b.postAtTime(aVar, aVar.a());
        return aVar;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        if (this.f4563d) {
            return null;
        }
        a aVar = new a(callable, this.b, timeUnit.convert(j2, TimeUnit.MILLISECONDS), 0);
        this.c.add(aVar);
        this.b.postAtTime(aVar, aVar.a());
        return aVar;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        long j4 = j2;
        long j5 = j3;
        TimeUnit timeUnit2 = timeUnit;
        if (this.f4563d) {
            return null;
        }
        if (j5 > 0) {
            Handler handler = this.b;
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            a aVar = new a(runnable, handler, timeUnit2.convert(j4, timeUnit3), timeUnit2.convert(j5, timeUnit3));
            this.c.add(aVar);
            this.b.postAtTime(aVar, aVar.a());
            return aVar;
        }
        Runnable runnable2 = runnable;
        return schedule(runnable, j4, timeUnit2);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        long j4 = j2;
        long j5 = j3;
        TimeUnit timeUnit2 = timeUnit;
        if (this.f4563d) {
            return null;
        }
        if (j5 > 0) {
            Handler handler = this.b;
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            a aVar = new a(runnable, handler, timeUnit2.convert(j4, timeUnit3), timeUnit2.convert(j5, timeUnit3));
            this.c.add(aVar);
            this.b.postAtTime(aVar, aVar.a());
            return aVar;
        }
        Runnable runnable2 = runnable;
        return schedule(runnable, j4, timeUnit2);
    }

    public void shutdown() {
        for (a aVar : this.c) {
            if (aVar != null) {
                aVar.cancel(false);
            }
        }
        this.c.clear();
        this.f4563d = true;
    }

    public List<Runnable> shutdownNow() {
        shutdown();
        return null;
    }

    public Future<?> submit(Runnable runnable) {
        return schedule(runnable, 0, TimeUnit.MILLISECONDS);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return null;
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return schedule(callable, 0, TimeUnit.MILLISECONDS);
    }
}
