package g.i.b.f.j;

import g.i.b.e.b.a.d;
import g.i.b.e.b.h;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class a {

    /* renamed from: f  reason: collision with root package name */
    public static volatile a f4273f;
    public Map<g.i.b.f.b, c> a = new HashMap();
    public Map<g.i.b.f.b, Integer> b = new HashMap();
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public d f4274d;

    /* renamed from: e  reason: collision with root package name */
    public d f4275e;

    /* renamed from: g.i.b.f.j.a$a  reason: collision with other inner class name */
    public static final class C0156a implements h {
        public Future<?> a;

        public C0156a(Future<?> future) {
            this.a = future;
        }

        public final boolean a() {
            Future<?> future = this.a;
            if (future != null) {
                try {
                    return future.cancel(false);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return false;
        }
    }

    public final class b extends PriorityBlockingQueue<Runnable> {
        public c a = null;
        private Integer b = null;

        public b() {
            super(64);
        }

        public final /* synthetic */ boolean offer(Object obj) {
            Runnable runnable = (Runnable) obj;
            c cVar = this.a;
            if (cVar == null || cVar.getPoolSize() == this.a.getMaximumPoolSize() || this.a.b.get() < this.a.getPoolSize() || this.a.getPoolSize() >= this.a.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public final Object poll(long j2, TimeUnit timeUnit) {
            c cVar;
            Runnable runnable = (Runnable) super.poll(j2, timeUnit);
            if (runnable == null && (cVar = this.a) != null) {
                cVar.a();
            }
            return runnable;
        }

        public final int remainingCapacity() {
            Integer num = this.b;
            return num != null ? num.intValue() : super.remainingCapacity();
        }

        public final Object take() {
            c cVar;
            c cVar2 = this.a;
            if (cVar2 == null || !cVar2.b()) {
                return (Runnable) super.take();
            }
            c cVar3 = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Runnable runnable = (Runnable) super.poll(cVar3.getKeepAliveTime(timeUnit), timeUnit);
            if (runnable == null && (cVar = this.a) != null) {
                cVar.a();
            }
            return runnable;
        }
    }

    public final class c extends ThreadPoolExecutor {
        public final AtomicInteger b = new AtomicInteger(0);
        public final AtomicLong c = new AtomicLong(0);

        /* renamed from: d  reason: collision with root package name */
        public final AtomicLong f4276d = new AtomicLong(0);

        /* renamed from: e  reason: collision with root package name */
        public long f4277e = 1000;

        /* renamed from: g.i.b.f.j.a$c$a  reason: collision with other inner class name */
        public class C0157a implements Thread.UncaughtExceptionHandler {
            public C0157a(c cVar) {
            }

            public final void uncaughtException(Thread thread, Throwable th) {
                th.printStackTrace();
            }
        }

        public class b<T> extends FutureTask<T> implements Comparable<b<T>> {
            public Object b;

            public b(Runnable runnable, T t) {
                super(t, (Object) null);
                this.b = t;
            }

            public final /* synthetic */ int compareTo(Object obj) {
                b bVar = (b) obj;
                if (this == bVar) {
                    return 0;
                }
                if (bVar == null) {
                    return -1;
                }
                Object obj2 = this.b;
                if (obj2 == null || bVar.b == null || !obj2.getClass().equals(bVar.b.getClass())) {
                    return 0;
                }
                Object obj3 = this.b;
                if (obj3 instanceof Comparable) {
                    return ((Comparable) obj3).compareTo(bVar.b);
                }
                return 0;
            }
        }

        /* renamed from: g.i.b.f.j.a$c$c  reason: collision with other inner class name */
        public static class C0158c implements RejectedExecutionHandler {
            public C0158c(byte b) {
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                throw new RejectedExecutionException();
            }
        }

        public c(int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
            super(0, i2, 5, timeUnit, blockingQueue, threadFactory, new C0158c((byte) 0));
        }

        public final void a() {
            if (b()) {
                long longValue = this.f4276d.longValue();
                if (this.f4277e + longValue < System.currentTimeMillis() && this.f4276d.compareAndSet(longValue, System.currentTimeMillis() + 1)) {
                    Thread.currentThread().setUncaughtExceptionHandler(new C0157a(this));
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
            if (this.f4277e < 0 || !(Thread.currentThread() instanceof g.i.b.e.b.a.c)) {
                return false;
            }
            Objects.requireNonNull((g.i.b.e.b.a.c) Thread.currentThread());
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

        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return (RunnableFuture) runnable;
        }

        public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
            return (RunnableFuture) callable;
        }

        public final Future<?> submit(Runnable runnable) {
            return super.submit(new b(this, runnable));
        }
    }

    public static a b() {
        if (f4273f == null) {
            synchronized (a.class) {
                if (f4273f == null) {
                    f4273f = new a();
                }
            }
        }
        return f4273f;
    }

    public final synchronized c a(g.i.b.f.b bVar) {
        c cVar;
        g.i.b.f.b bVar2 = g.i.b.f.b.Cate_DefaultEase;
        synchronized (this) {
            Integer num = this.b.get(bVar);
            int min = Math.min(Math.max(num == null ? bVar == bVar2 ? 3 : 2 : num.intValue(), 1), 5);
            cVar = this.a.get(bVar);
            if (cVar == null) {
                b bVar3 = new b();
                c cVar2 = new c(min, TimeUnit.SECONDS, bVar3, new g.i.b.e.b.a.a(bVar.name()));
                bVar3.a = cVar2;
                this.a.put(bVar, cVar2);
                g.i.b.e.h.b.f("halley-downloader-ThreadPoolHolder", "create thread pool for category:" + bVar + ",num:" + min);
                cVar = cVar2;
            } else {
                int maximumPoolSize = min - cVar.getMaximumPoolSize();
                cVar.setMaximumPoolSize(min);
                g.i.b.e.h.b.f("halley-downloader-ThreadPoolHolder", "update thread pool for category:" + bVar + ",num:" + min);
                min = maximumPoolSize;
            }
            d dVar = this.c;
            if (dVar == null) {
                g.i.b.e.b.a.b bVar4 = new g.i.b.e.b.a.b((byte) 0);
                int i2 = (min <= 0 ? 1 : min) + 1;
                d dVar2 = new d(i2, TimeUnit.SECONDS, bVar4, new g.i.b.e.b.a.a("HallyDownload-DirectPool"));
                this.c = dVar2;
                bVar4.a = dVar2;
                g.i.b.e.h.b.f("halley-downloader-ThreadPoolHolder", "create thread pool for Direct Download, cur num:" + i2);
            } else {
                int maximumPoolSize2 = dVar.getMaximumPoolSize() + min;
                this.c.setMaximumPoolSize(maximumPoolSize2);
                g.i.b.e.h.b.f("halley-downloader-ThreadPoolHolder", "update thread pool for Direct Download, cur num:" + maximumPoolSize2);
            }
            if (bVar != bVar2) {
                c(min);
            }
            if (this.f4275e != null) {
                d();
            }
        }
        return cVar;
    }

    public final void c(int i2) {
        String str;
        d dVar = this.f4274d;
        if (dVar == null) {
            g.i.b.e.b.a.b bVar = new g.i.b.e.b.a.b((byte) 0);
            if (i2 <= 0) {
                i2 = 1;
            }
            int i3 = i2 + 1;
            d dVar2 = new d(i3, TimeUnit.SECONDS, bVar, new g.i.b.e.b.a.a("HallyDownload-SchedulePool"));
            this.f4274d = dVar2;
            bVar.a = dVar2;
            str = "create thread pool for Schedule Download, cur num:" + i3;
        } else {
            int maximumPoolSize = dVar.getMaximumPoolSize() + i2;
            this.f4274d.setMaximumPoolSize(maximumPoolSize);
            str = "update thread pool for Schedule Download, cur num:" + maximumPoolSize;
        }
        g.i.b.e.h.b.f("halley-downloader-ThreadPoolHolder", str);
    }

    public final void d() {
        int i2 = 0;
        for (g.i.b.f.b next : this.a.keySet()) {
            if (next != g.i.b.f.b.Cate_DefaultEase) {
                i2 += this.a.get(next).getMaximumPoolSize();
            }
        }
        if (i2 == 0) {
            i2 = 2;
        }
        d dVar = this.f4275e;
        if (dVar == null) {
            g.i.b.e.b.a.b bVar = new g.i.b.e.b.a.b((byte) 0);
            int i3 = (i2 * 2) + 1;
            d dVar2 = new d(i3, TimeUnit.SECONDS, bVar, new g.i.b.e.b.a.a("HallyDownload-HijackPool"));
            this.f4275e = dVar2;
            bVar.a = dVar2;
            g.i.b.e.h.b.f("halley-downloader-ThreadPoolHolder", "create thread pool for Hijack Task, cur num:" + i3);
            return;
        }
        dVar.setMaximumPoolSize((i2 * 2) + 1);
    }
}
