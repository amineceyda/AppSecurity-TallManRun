package g.e.a.b.f.b;

import java.lang.Thread;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class k4 extends i5 {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLong f3220k = new AtomicLong(Long.MIN_VALUE);
    public j4 c;

    /* renamed from: d  reason: collision with root package name */
    public j4 f3221d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue f3222e = new PriorityBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue f3223f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f3224g = new h4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f3225h = new h4(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i  reason: collision with root package name */
    public final Object f3226i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f3227j = new Semaphore(2);

    public k4(n4 n4Var) {
        super(n4Var);
    }

    public final void g() {
        if (Thread.currentThread() != this.f3221d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void h() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean j() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r5.length() == 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.a.d().f3139i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5.length() != 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.a.d().f3139i;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ all -> 0x0054 }
            g.e.a.b.f.b.k4 r0 = r0.b()     // Catch:{ all -> 0x0054 }
            r0.r(r6)     // Catch:{ all -> 0x0054 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0032
            g.e.a.b.f.b.n4 r3 = r1.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3139i
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0029
            java.lang.String r4 = r4.concat(r5)
            goto L_0x002f
        L_0x0029:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x002f:
            r3.a(r4)
        L_0x0032:
            return r2
        L_0x0033:
            g.e.a.b.f.b.n4 r3 = r1.a     // Catch:{ all -> 0x0054 }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ all -> 0x0054 }
            g.e.a.b.f.b.d3 r3 = r3.f3139i     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x004e
        L_0x0048:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0054 }
            r5.<init>(r4)     // Catch:{ all -> 0x0054 }
            r4 = r5
        L_0x004e:
            r3.a(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r2 = 0
            return r2
        L_0x0054:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k4.o(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final Future p(Callable callable) throws IllegalStateException {
        k();
        i4 i4Var = new i4(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.f3222e.isEmpty()) {
                this.a.d().f3139i.a("Callable skipped the worker queue.");
            }
            i4Var.run();
        } else {
            u(i4Var);
        }
        return i4Var;
    }

    public final void q(Runnable runnable) throws IllegalStateException {
        k();
        i4 i4Var = new i4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f3226i) {
            this.f3223f.add(i4Var);
            j4 j4Var = this.f3221d;
            if (j4Var == null) {
                j4 j4Var2 = new j4(this, "Measurement Network", this.f3223f);
                this.f3221d = j4Var2;
                j4Var2.setUncaughtExceptionHandler(this.f3225h);
                this.f3221d.start();
            } else {
                synchronized (j4Var.b) {
                    j4Var.b.notifyAll();
                }
            }
        }
    }

    public final void r(Runnable runnable) throws IllegalStateException {
        k();
        Objects.requireNonNull(runnable, "null reference");
        u(new i4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void s(Runnable runnable) throws IllegalStateException {
        k();
        u(new i4(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean t() {
        return Thread.currentThread() == this.c;
    }

    public final void u(i4 i4Var) {
        synchronized (this.f3226i) {
            this.f3222e.add(i4Var);
            j4 j4Var = this.c;
            if (j4Var == null) {
                j4 j4Var2 = new j4(this, "Measurement Worker", this.f3222e);
                this.c = j4Var2;
                j4Var2.setUncaughtExceptionHandler(this.f3224g);
                this.c.start();
            } else {
                synchronized (j4Var.b) {
                    j4Var.b.notifyAll();
                }
            }
        }
    }
}
