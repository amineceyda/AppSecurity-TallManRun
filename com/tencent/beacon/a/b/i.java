package com.tencent.beacon.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import com.tencent.beacon.base.util.c;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class i extends a {
    private static final int c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f574d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicInteger f575e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f576f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<a> f577g;

    /* renamed from: h  reason: collision with root package name */
    private final SparseArray<Handler> f578h;

    /* renamed from: i  reason: collision with root package name */
    private final j f579i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f580j;

    public static final class a {
        /* access modifiers changed from: private */
        public final Runnable a;
        /* access modifiers changed from: private */
        public final long b;
        /* access modifiers changed from: private */
        public final long c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f581d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Future<?> f582e;

        public a(Future<?> future, Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            this.f582e = future;
            this.a = runnable;
            this.b = j2;
            this.c = j3;
            this.f581d = timeUnit;
        }

        public boolean a() {
            return this.f582e.isCancelled();
        }

        public boolean a(boolean z) {
            return this.f582e.cancel(z);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors;
        f574d = Math.max(2, Math.min(availableProcessors - 1, 3));
    }

    public i() {
        this((ScheduledExecutorService) null);
    }

    public i(ScheduledExecutorService scheduledExecutorService) {
        this.f580j = false;
        j jVar = new j();
        this.f579i = jVar;
        this.f576f = scheduledExecutorService == null ? Executors.newScheduledThreadPool(f574d, jVar) : scheduledExecutorService;
        this.f577g = new SparseArray<>();
        this.f578h = new SparseArray<>();
    }

    private Runnable b(Runnable runnable) {
        return new h(this, runnable);
    }

    private boolean f() {
        if (!this.f580j) {
            return false;
        }
        c.b("[task] was closed , should all stopped!", new Object[0]);
        return true;
    }

    public synchronized Handler a(int i2) {
        Handler handler;
        handler = this.f578h.get(i2);
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread(this.f579i.a());
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        }
        this.f578h.put(i2, handler);
        return handler;
    }

    public synchronized void a(int i2, long j2, long j3, Runnable runnable) {
        if (!f()) {
            a aVar = this.f577g.get(i2);
            if (aVar == null || aVar.a()) {
                Runnable b = b(runnable);
                if (j2 <= 0) {
                    j2 = 0;
                }
                if (j3 < 100) {
                    j3 = 100;
                }
                ScheduledExecutorService scheduledExecutorService = this.f576f;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                a aVar2 = new a(scheduledExecutorService.scheduleAtFixedRate(b, j2, j3, timeUnit), b, j2, j3, timeUnit);
                c.a("[task] add a new polling task! taskId: %d , periodTime: %d", Integer.valueOf(i2), Long.valueOf(j3));
                this.f577g.put(i2, aVar2);
            }
        }
    }

    public void a(int i2, boolean z) {
        a aVar = this.f577g.get(i2);
        if (aVar != null && !aVar.a()) {
            c.a("[task] cancel a old pollingTaskWrapper!", new Object[0]);
            aVar.a(z);
        }
    }

    public synchronized void a(long j2, Runnable runnable) {
        if (!f()) {
            Runnable b = b(runnable);
            if (j2 <= 0) {
                j2 = 0;
            }
            this.f576f.schedule(b, j2, TimeUnit.MILLISECONDS);
        }
    }

    public synchronized void a(Runnable runnable) {
        if (!f()) {
            this.f576f.execute(b(runnable));
        }
    }

    public synchronized void a(boolean z) {
        if (!f()) {
            for (int i2 = 0; i2 < this.f577g.size(); i2++) {
                a(this.f577g.keyAt(i2), z);
            }
            c.a("[task] All schedule tasks stop", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.c()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r8)
            return
        L_0x0009:
            android.util.SparseArray<com.tencent.beacon.a.b.i$a> r0 = r8.f577g     // Catch:{ all -> 0x0036 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0036 }
            com.tencent.beacon.a.b.i$a r9 = (com.tencent.beacon.a.b.i.a) r9     // Catch:{ all -> 0x0036 }
            if (r9 == 0) goto L_0x0034
            boolean r0 = r9.a()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r8)
            return
        L_0x001b:
            java.util.concurrent.ScheduledExecutorService r1 = r8.f576f     // Catch:{ all -> 0x0036 }
            java.lang.Runnable r2 = r9.a     // Catch:{ all -> 0x0036 }
            long r3 = r9.b     // Catch:{ all -> 0x0036 }
            long r5 = r9.c     // Catch:{ all -> 0x0036 }
            java.util.concurrent.TimeUnit r7 = r9.f581d     // Catch:{ all -> 0x0036 }
            java.util.concurrent.ScheduledFuture r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7)     // Catch:{ all -> 0x0036 }
            java.util.concurrent.Future unused = r9.f582e = r0     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r8)
            return
        L_0x0036:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.b.i.b(int):void");
    }

    public synchronized void d() {
        c.a("[task] Resumed all schedule task", new Object[0]);
        if (!f()) {
            for (int i2 = 0; i2 < this.f577g.size(); i2++) {
                b(this.f577g.keyAt(i2));
            }
            c.a("[task] Resumed all schedule task", new Object[0]);
        }
    }
}
