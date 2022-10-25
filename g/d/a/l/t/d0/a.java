package g.d.a.l.t.d0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a implements ExecutorService {
    public static final long c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d  reason: collision with root package name */
    public static volatile int f2464d;
    public final ExecutorService b;

    /* renamed from: g.d.a.l.t.d0.a$a  reason: collision with other inner class name */
    public static final class C0084a implements ThreadFactory {
        public final String a;
        public final boolean b;
        public int c;

        /* renamed from: g.d.a.l.t.d0.a$a$a  reason: collision with other inner class name */
        public class C0085a extends Thread {
            public C0085a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C0084a.this.b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(C0084a.this);
                    ((b.C0086a) b.b).a(th);
                }
            }
        }

        public C0084a(String str, b bVar, boolean z) {
            this.a = str;
            this.b = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C0085a aVar;
            aVar = new C0085a(runnable, "glide-" + this.a + "-thread-" + this.c);
            this.c = this.c + 1;
            return aVar;
        }
    }

    public interface b {
        public static final b a;
        public static final b b;

        /* renamed from: g.d.a.l.t.d0.a$b$a  reason: collision with other inner class name */
        public class C0086a implements b {
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0086a aVar = new C0086a();
            a = aVar;
            b = aVar;
        }
    }

    public a(ExecutorService executorService) {
        this.b = executorService;
    }

    public static int a() {
        if (f2464d == 0) {
            f2464d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f2464d;
    }

    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.b.awaitTermination(j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.b.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.b.invokeAll(collection, j2, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.b.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.b.invokeAny(collection, j2, timeUnit);
    }

    public boolean isShutdown() {
        return this.b.isShutdown();
    }

    public boolean isTerminated() {
        return this.b.isTerminated();
    }

    public void shutdown() {
        this.b.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.b.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(callable);
    }

    public String toString() {
        return this.b.toString();
    }
}
