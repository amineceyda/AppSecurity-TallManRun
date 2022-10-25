package k;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.h0.f.c;
import k.h0.f.d;
import k.h0.f.f;

public final class h {

    /* renamed from: g  reason: collision with root package name */
    public static final Executor f4722g;
    public final int a;
    public final long b;
    public final Runnable c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final Deque<c> f4723d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final d f4724e = new d();

    /* renamed from: f  reason: collision with root package name */
    public boolean f4725f;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
            L_0x0000:
                k.h r0 = k.h.this
                long r1 = java.lang.System.nanoTime()
                monitor-enter(r0)
                java.util.Deque<k.h0.f.c> r3 = r0.f4723d     // Catch:{ all -> 0x007f }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007f }
                r4 = 0
                r5 = -9223372036854775808
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x0013:
                boolean r10 = r3.hasNext()     // Catch:{ all -> 0x007f }
                if (r10 == 0) goto L_0x0035
                java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x007f }
                k.h0.f.c r10 = (k.h0.f.c) r10     // Catch:{ all -> 0x007f }
                int r11 = r0.a(r10, r1)     // Catch:{ all -> 0x007f }
                if (r11 <= 0) goto L_0x0028
                int r9 = r9 + 1
                goto L_0x0013
            L_0x0028:
                int r8 = r8 + 1
                long r11 = r10.o     // Catch:{ all -> 0x007f }
                long r11 = r1 - r11
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 <= 0) goto L_0x0013
                r4 = r10
                r5 = r11
                goto L_0x0013
            L_0x0035:
                long r1 = r0.b     // Catch:{ all -> 0x007f }
                r10 = -1
                r12 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 >= 0) goto L_0x0052
                int r3 = r0.a     // Catch:{ all -> 0x007f }
                if (r8 <= r3) goto L_0x0044
                goto L_0x0052
            L_0x0044:
                if (r8 <= 0) goto L_0x0049
                long r1 = r1 - r5
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                goto L_0x005e
            L_0x0049:
                if (r9 <= 0) goto L_0x004d
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                goto L_0x005e
            L_0x004d:
                r0.f4725f = r7     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                r1 = r10
                goto L_0x005e
            L_0x0052:
                java.util.Deque<k.h0.f.c> r1 = r0.f4723d     // Catch:{ all -> 0x007f }
                r1.remove(r4)     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                java.net.Socket r0 = r4.f4738e
                k.h0.c.g(r0)
                r1 = r12
            L_0x005e:
                int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r0 != 0) goto L_0x0063
                return
            L_0x0063:
                int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r0 <= 0) goto L_0x0000
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r1 / r3
                long r3 = r3 * r5
                long r1 = r1 - r3
                k.h r0 = k.h.this
                monitor-enter(r0)
                k.h r3 = k.h.this     // Catch:{ InterruptedException -> 0x007b }
                int r2 = (int) r1     // Catch:{ InterruptedException -> 0x007b }
                r3.wait(r5, r2)     // Catch:{ InterruptedException -> 0x007b }
                goto L_0x007b
            L_0x0079:
                r1 = move-exception
                goto L_0x007d
            L_0x007b:
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                goto L_0x0000
            L_0x007d:
                monitor-exit(r0)     // Catch:{ all -> 0x0079 }
                throw r1
            L_0x007f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                goto L_0x0083
            L_0x0082:
                throw r1
            L_0x0083:
                goto L_0x0082
            */
            throw new UnsupportedOperationException("Method not decompiled: k.h.a.run():void");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = k.h0.c.a;
        f4722g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new k.h0.d("OkHttp ConnectionPool", true));
    }

    public h(int i2, long j2, TimeUnit timeUnit) {
        this.a = i2;
        this.b = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException(g.a.a.a.a.s("keepAliveDuration <= 0: ", j2));
        }
    }

    public final int a(c cVar, long j2) {
        List<Reference<f>> list = cVar.n;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder i3 = g.a.a.a.a.i("A connection to ");
                i3.append(cVar.c.a.a);
                i3.append(" was leaked. Did you forget to close a response body?");
                k.h0.j.f.a.m(i3.toString(), ((f.a) reference).a);
                list.remove(i2);
                cVar.f4744k = true;
                if (list.isEmpty()) {
                    cVar.o = j2 - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
