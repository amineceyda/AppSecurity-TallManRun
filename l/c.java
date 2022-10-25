package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class c extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f4962h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f4963i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public static c f4964j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4965e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public c f4966f;

    /* renamed from: g  reason: collision with root package name */
    public long f4967g;

    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.m();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<l.c> r0 = l.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                l.c r1 = l.c.h()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                l.c r2 = l.c.f4964j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                l.c.f4964j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.m()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: l.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f4962h = millis;
        f4963i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static c h() throws InterruptedException {
        Class<c> cls = c.class;
        c cVar = f4964j.f4966f;
        long nanoTime = System.nanoTime();
        if (cVar == null) {
            cls.wait(f4962h);
            if (f4964j.f4966f != null || System.nanoTime() - nanoTime < f4963i) {
                return null;
            }
            return f4964j;
        }
        long j2 = cVar.f4967g - nanoTime;
        if (j2 > 0) {
            long j3 = j2 / 1000000;
            cls.wait(j3, (int) (j2 - (1000000 * j3)));
            return null;
        }
        f4964j.f4966f = cVar.f4966f;
        cVar.f4966f = null;
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0061 A[EDGE_INSN: B:41:0x0061->B:28:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r10 = this;
            boolean r0 = r10.f4965e
            if (r0 != 0) goto L_0x0077
            long r0 = r10.c
            boolean r2 = r10.a
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0011
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            r5 = 1
            r10.f4965e = r5
            java.lang.Class<l.c> r5 = l.c.class
            monitor-enter(r5)
            l.c r6 = f4964j     // Catch:{ all -> 0x0074 }
            if (r6 != 0) goto L_0x002a
            l.c r6 = new l.c     // Catch:{ all -> 0x0074 }
            r6.<init>()     // Catch:{ all -> 0x0074 }
            f4964j = r6     // Catch:{ all -> 0x0074 }
            l.c$a r6 = new l.c$a     // Catch:{ all -> 0x0074 }
            r6.<init>()     // Catch:{ all -> 0x0074 }
            r6.start()     // Catch:{ all -> 0x0074 }
        L_0x002a:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0074 }
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            long r2 = r10.c()     // Catch:{ all -> 0x0074 }
            long r2 = r2 - r6
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0074 }
            goto L_0x0042
        L_0x003e:
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0046
        L_0x0042:
            long r0 = r0 + r6
            r10.f4967g = r0     // Catch:{ all -> 0x0074 }
            goto L_0x004e
        L_0x0046:
            if (r2 == 0) goto L_0x006e
            long r0 = r10.c()     // Catch:{ all -> 0x0074 }
            r10.f4967g = r0     // Catch:{ all -> 0x0074 }
        L_0x004e:
            long r0 = r10.f4967g     // Catch:{ all -> 0x0074 }
            long r0 = r0 - r6
            l.c r2 = f4964j     // Catch:{ all -> 0x0074 }
        L_0x0053:
            l.c r3 = r2.f4966f     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0061
            long r8 = r3.f4967g     // Catch:{ all -> 0x0074 }
            long r8 = r8 - r6
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = r3
            goto L_0x0053
        L_0x0061:
            r10.f4966f = r3     // Catch:{ all -> 0x0074 }
            r2.f4966f = r10     // Catch:{ all -> 0x0074 }
            l.c r0 = f4964j     // Catch:{ all -> 0x0074 }
            if (r2 != r0) goto L_0x006c
            r5.notify()     // Catch:{ all -> 0x0074 }
        L_0x006c:
            monitor-exit(r5)
            return
        L_0x006e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0074 }
            r0.<init>()     // Catch:{ all -> 0x0074 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            goto L_0x0080
        L_0x007f:
            throw r0
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.i():void");
    }

    public final void j(boolean z) throws IOException {
        if (k() && z) {
            throw l((IOException) null);
        }
    }

    public final boolean k() {
        boolean z = false;
        if (!this.f4965e) {
            return false;
        }
        this.f4965e = false;
        synchronized (c.class) {
            c cVar = f4964j;
            while (true) {
                if (cVar == null) {
                    z = true;
                    break;
                }
                c cVar2 = cVar.f4966f;
                if (cVar2 == this) {
                    cVar.f4966f = this.f4966f;
                    this.f4966f = null;
                    break;
                }
                cVar = cVar2;
            }
        }
        return z;
    }

    public IOException l(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
