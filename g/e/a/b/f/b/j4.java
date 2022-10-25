package g.e.a.b.f.b;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;

public final class j4 extends Thread {
    public final Object b;
    public final BlockingQueue c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3204d = false;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k4 f3205e;

    public j4(k4 k4Var, String str, BlockingQueue blockingQueue) {
        this.f3205e = k4Var;
        Objects.requireNonNull(blockingQueue, "null reference");
        this.b = new Object();
        this.c = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f3205e.f3226i) {
            if (!this.f3204d) {
                this.f3205e.f3227j.release();
                this.f3205e.f3226i.notifyAll();
                k4 k4Var = this.f3205e;
                if (this == k4Var.c) {
                    k4Var.c = null;
                } else if (this == k4Var.f3221d) {
                    k4Var.f3221d = null;
                } else {
                    k4Var.a.d().f3136f.a("Current scheduler thread is neither worker nor network");
                }
                this.f3204d = true;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        this.f3205e.a.d().f3139i.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0012
            g.e.a.b.f.b.k4 r2 = r6.f3205e     // Catch:{ InterruptedException -> 0x000d }
            java.util.concurrent.Semaphore r2 = r2.f3227j     // Catch:{ InterruptedException -> 0x000d }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000d }
            r1 = 1
            goto L_0x0002
        L_0x000d:
            r2 = move-exception
            r6.b(r2)
            goto L_0x0002
        L_0x0012:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x007c }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x007c }
        L_0x001a:
            java.util.concurrent.BlockingQueue r2 = r6.c     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x007c }
            g.e.a.b.f.b.i4 r2 = (g.e.a.b.f.b.i4) r2     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0033
            boolean r3 = r2.c     // Catch:{ all -> 0x007c }
            if (r0 == r3) goto L_0x002b
            r3 = 10
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x007c }
            r2.run()     // Catch:{ all -> 0x007c }
            goto L_0x001a
        L_0x0033:
            java.lang.Object r2 = r6.b     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue r3 = r6.c     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x004f
            g.e.a.b.f.b.k4 r3 = r6.f3205e     // Catch:{ all -> 0x0079 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r6.b     // Catch:{ InterruptedException -> 0x004b }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r3 = move-exception
            r6.b(r3)     // Catch:{ all -> 0x0079 }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            g.e.a.b.f.b.k4 r2 = r6.f3205e     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.f3226i     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue r3 = r6.c     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0074
            g.e.a.b.f.b.k4 r0 = r6.f3205e     // Catch:{ all -> 0x0076 }
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ all -> 0x0076 }
            g.e.a.b.f.b.f r0 = r0.f3258g     // Catch:{ all -> 0x0076 }
            g.e.a.b.f.b.r2 r1 = g.e.a.b.f.b.s2.f0     // Catch:{ all -> 0x0076 }
            r3 = 0
            boolean r0 = r0.u(r3, r1)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            r6.a()     // Catch:{ all -> 0x0076 }
        L_0x006f:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            r6.a()
            return
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            goto L_0x001a
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r6.a()
            goto L_0x0082
        L_0x0081:
            throw r0
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.j4.run():void");
    }
}
