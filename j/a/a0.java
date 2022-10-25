package j.a;

import java.util.concurrent.TimeUnit;

public final class a0 extends m0 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* renamed from: h  reason: collision with root package name */
    public static final long f4582h;

    /* renamed from: i  reason: collision with root package name */
    public static final a0 f4583i;

    static {
        Long l2;
        a0 a0Var = new a0();
        f4583i = a0Var;
        a0Var.S(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f4582h = timeUnit.toNanos(l2.longValue());
    }

    public Thread Y() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final synchronized void l0() {
        if (m0()) {
            debugStatus = 3;
            j0();
            notifyAll();
        }
    }

    public final boolean m0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        _thread = null;
        l0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (h0() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            j.a.n1 r0 = j.a.n1.b
            java.lang.ThreadLocal<j.a.l0> r0 = j.a.n1.a
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0083 }
            boolean r1 = r12.m0()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0011
            r1 = 0
            goto L_0x0017
        L_0x0011:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0080 }
            r12.notifyAll()     // Catch:{ all -> 0x0080 }
        L_0x0017:
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0029
            _thread = r0
            r12.l0()
            boolean r0 = r12.h0()
            if (r0 != 0) goto L_0x0028
            r12.Y()
        L_0x0028:
            return
        L_0x0029:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x002f:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0083 }
            long r5 = r12.i0()     // Catch:{ all -> 0x0083 }
            r7 = 0
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x0062
            long r9 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0083 }
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L_0x0047
            long r3 = f4582h     // Catch:{ all -> 0x0083 }
            long r3 = r3 + r9
        L_0x0047:
            long r9 = r3 - r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x005c
            _thread = r0
            r12.l0()
            boolean r0 = r12.h0()
            if (r0 != 0) goto L_0x005b
            r12.Y()
        L_0x005b:
            return
        L_0x005c:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0063
            r5 = r9
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x002f
            boolean r7 = r12.m0()     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x007c
            _thread = r0
            r12.l0()
            boolean r0 = r12.h0()
            if (r0 != 0) goto L_0x007b
            r12.Y()
        L_0x007b:
            return
        L_0x007c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0083 }
            goto L_0x002f
        L_0x0080:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            _thread = r0
            r12.l0()
            boolean r0 = r12.h0()
            if (r0 != 0) goto L_0x0092
            r12.Y()
        L_0x0092:
            goto L_0x0094
        L_0x0093:
            throw r1
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.a0.run():void");
    }
}
