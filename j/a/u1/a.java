package j.a.u1;

import android.support.v4.media.session.PlaybackStateCompat;
import g.c.b.b.f;
import i.o.c.h;
import i.p.c;
import j.a.t1.n;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

public final class a implements Executor, Closeable {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4629i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4630j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4631k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: l  reason: collision with root package name */
    public static final n f4632l = new n("NOT_IN_STACK");
    private volatile int _isTerminated;
    public final d b;
    public final d c;
    public volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray<C0195a> f4633d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4634e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4635f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4636g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4637h;
    private volatile long parkedWorkersStack;

    /* renamed from: j.a.u1.a$a  reason: collision with other inner class name */
    public final class C0195a extends Thread {

        /* renamed from: i  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f4638i = AtomicIntegerFieldUpdater.newUpdater(C0195a.class, "workerCtl");
        public final m b = new m();
        public b c = b.DORMANT;

        /* renamed from: d  reason: collision with root package name */
        public long f4639d;

        /* renamed from: e  reason: collision with root package name */
        public long f4640e;

        /* renamed from: f  reason: collision with root package name */
        public int f4641f = c.c.b();

        /* renamed from: g  reason: collision with root package name */
        public boolean f4642g;
        public volatile int indexInArray;
        public volatile Object nextParkedWorker = a.f4632l;
        public volatile int workerCtl = 0;

        public C0195a(int i2) {
            setDaemon(true);
            d(i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final j.a.u1.h a(boolean r11) {
            /*
                r10 = this;
                j.a.u1.a$b r0 = j.a.u1.a.b.CPU_ACQUIRED
                j.a.u1.a$b r1 = r10.c
                r2 = 1
                r3 = 0
                if (r1 != r0) goto L_0x0009
                goto L_0x0030
            L_0x0009:
                j.a.u1.a r1 = j.a.u1.a.this
            L_0x000b:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r5 = (int) r4
                if (r5 != 0) goto L_0x001b
                r1 = 0
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = j.a.u1.a.f4630j
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L_0x000b
                r1 = 1
            L_0x002c:
                if (r1 == 0) goto L_0x0032
                r10.c = r0
            L_0x0030:
                r0 = 1
                goto L_0x0033
            L_0x0032:
                r0 = 0
            L_0x0033:
                if (r0 == 0) goto L_0x006c
                if (r11 == 0) goto L_0x0060
                j.a.u1.a r11 = j.a.u1.a.this
                int r11 = r11.f4634e
                int r11 = r11 * 2
                int r11 = r10.b(r11)
                if (r11 != 0) goto L_0x0044
                goto L_0x0045
            L_0x0044:
                r2 = 0
            L_0x0045:
                if (r2 == 0) goto L_0x004e
                j.a.u1.h r11 = r10.c()
                if (r11 == 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                j.a.u1.m r11 = r10.b
                j.a.u1.h r11 = r11.e()
                if (r11 == 0) goto L_0x0057
                goto L_0x006b
            L_0x0057:
                if (r2 != 0) goto L_0x0067
                j.a.u1.h r11 = r10.c()
                if (r11 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0060:
                j.a.u1.h r11 = r10.c()
                if (r11 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                j.a.u1.h r11 = r10.f(r3)
            L_0x006b:
                return r11
            L_0x006c:
                if (r11 == 0) goto L_0x0077
                j.a.u1.m r11 = r10.b
                j.a.u1.h r11 = r11.e()
                if (r11 == 0) goto L_0x0077
                goto L_0x0081
            L_0x0077:
                j.a.u1.a r11 = j.a.u1.a.this
                j.a.u1.d r11 = r11.c
                java.lang.Object r11 = r11.d()
                j.a.u1.h r11 = (j.a.u1.h) r11
            L_0x0081:
                if (r11 == 0) goto L_0x0084
                goto L_0x0088
            L_0x0084:
                j.a.u1.h r11 = r10.f(r2)
            L_0x0088:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: j.a.u1.a.C0195a.a(boolean):j.a.u1.h");
        }

        public final int b(int i2) {
            int i3 = this.f4641f;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f4641f = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final h c() {
            d dVar;
            if (b(2) == 0) {
                h hVar = (h) a.this.b.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.c;
            } else {
                h hVar2 = (h) a.this.c.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.b;
            }
            return (h) dVar.d();
        }

        public final void d(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f4637h);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final boolean e(b bVar) {
            b bVar2 = this.c;
            boolean z = bVar2 == b.CPU_ACQUIRED;
            if (z) {
                a.f4630j.addAndGet(a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.c = bVar;
            }
            return z;
        }

        public final h f(boolean z) {
            long j2;
            long j3;
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int b2 = b(i2);
            long j4 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                b2++;
                if (b2 > i2) {
                    b2 = 1;
                }
                C0195a aVar = a.this.f4633d.get(b2);
                if (!(aVar == null || aVar == this)) {
                    m mVar = this.b;
                    m mVar2 = aVar.b;
                    if (z) {
                        j2 = mVar.g(mVar2);
                    } else {
                        Objects.requireNonNull(mVar);
                        h f2 = mVar2.f();
                        if (f2 != null) {
                            mVar.a(f2, false);
                            j3 = -1;
                        } else {
                            j3 = mVar.h(mVar2, false);
                        }
                        j2 = j3;
                    }
                    if (j2 == -1) {
                        return this.b.e();
                    }
                    if (j2 > 0) {
                        j4 = Math.min(j4, j2);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f4640e = j4;
            return null;
        }

        public void run() {
            b bVar = b.PARKING;
            b bVar2 = b.TERMINATED;
            loop0:
            while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.c != bVar2) {
                    h a = a(this.f4642g);
                    if (a == null) {
                        this.f4642g = false;
                        if (this.f4640e == 0) {
                            if (this.nextParkedWorker != a.f4632l) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.f4632l) || a.this.isTerminated() || this.c == bVar2) {
                                        break;
                                    }
                                    e(bVar);
                                    Thread.interrupted();
                                    if (this.f4639d == 0) {
                                        this.f4639d = System.nanoTime() + a.this.f4636g;
                                    }
                                    LockSupport.parkNanos(a.this.f4636g);
                                    if (System.nanoTime() - this.f4639d >= 0) {
                                        this.f4639d = 0;
                                        synchronized (a.this.f4633d) {
                                            if (!a.this.isTerminated()) {
                                                if (((int) (a.this.controlState & 2097151)) > a.this.f4634e) {
                                                    if (f4638i.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        d(0);
                                                        a.this.k(this, i2, 0);
                                                        int andDecrement = (int) (2097151 & a.f4630j.getAndDecrement(a.this));
                                                        if (andDecrement != i2) {
                                                            C0195a aVar = a.this.f4633d.get(andDecrement);
                                                            h.c(aVar);
                                                            C0195a aVar2 = aVar;
                                                            a.this.f4633d.set(i2, aVar2);
                                                            aVar2.d(i2);
                                                            a.this.k(aVar2, andDecrement, i2);
                                                        }
                                                        a.this.f4633d.set(andDecrement, (Object) null);
                                                        this.c = bVar2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.j(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            e(bVar);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4640e);
                            this.f4640e = 0;
                        }
                    } else {
                        this.f4640e = 0;
                        b bVar3 = b.BLOCKING;
                        int u = a.c.u();
                        this.f4639d = 0;
                        if (this.c == bVar) {
                            this.c = bVar3;
                        }
                        if (u != 0 && e(bVar3)) {
                            a.this.o();
                        }
                        a.this.n(a);
                        if (u != 0) {
                            a.f4630j.addAndGet(a.this, -2097152);
                            if (this.c != bVar2) {
                                this.c = b.DORMANT;
                            }
                        }
                    }
                }
            }
            e(bVar2);
        }
    }

    public enum b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f4634e = i2;
        this.f4635f = i3;
        this.f4636g = j2;
        this.f4637h = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.b = new d();
                        this.c = new d();
                        this.parkedWorkersStack = 0;
                        this.f4633d = new AtomicReferenceArray<>(i3 + 1);
                        this.controlState = ((long) i2) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(g.a.a.a.a.r("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        throw new IllegalArgumentException(g.a.a.a.a.r("Core pool size ", i2, " should be at least 1").toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<j.a.u1.a$a> r0 = r10.f4633d
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x0079 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x0079 }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x0079 }
            int r1 = r6 - r2
            r2 = 0
            if (r1 >= 0) goto L_0x0024
            r1 = 0
        L_0x0024:
            int r5 = r10.f4634e     // Catch:{ all -> 0x0079 }
            if (r1 < r5) goto L_0x002a
            monitor-exit(r0)
            return r2
        L_0x002a:
            int r5 = r10.f4635f     // Catch:{ all -> 0x0079 }
            if (r6 < r5) goto L_0x0030
            monitor-exit(r0)
            return r2
        L_0x0030:
            long r5 = r10.controlState     // Catch:{ all -> 0x0079 }
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x0079 }
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L_0x0042
            java.util.concurrent.atomic.AtomicReferenceArray<j.a.u1.a$a> r7 = r10.f4633d     // Catch:{ all -> 0x0079 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0079 }
            if (r7 != 0) goto L_0x0042
            r7 = 1
            goto L_0x0043
        L_0x0042:
            r7 = 0
        L_0x0043:
            if (r7 == 0) goto L_0x006d
            j.a.u1.a$a r7 = new j.a.u1.a$a     // Catch:{ all -> 0x0079 }
            r7.<init>(r6)     // Catch:{ all -> 0x0079 }
            java.util.concurrent.atomic.AtomicReferenceArray<j.a.u1.a$a> r8 = r10.f4633d     // Catch:{ all -> 0x0079 }
            r8.set(r6, r7)     // Catch:{ all -> 0x0079 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f4630j     // Catch:{ all -> 0x0079 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0079 }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x0079 }
            if (r6 != r4) goto L_0x005a
            r2 = 1
        L_0x005a:
            if (r2 == 0) goto L_0x0061
            r7.start()     // Catch:{ all -> 0x0079 }
            int r1 = r1 + r5
            goto L_0x000a
        L_0x0061:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0079 }
            r2.<init>(r1)     // Catch:{ all -> 0x0079 }
            throw r2     // Catch:{ all -> 0x0079 }
        L_0x006d:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0079 }
            r2.<init>(r1)     // Catch:{ all -> 0x0079 }
            throw r2     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x007d
        L_0x007c:
            throw r1
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.u1.a.a():int");
    }

    public final h b(Runnable runnable, i iVar) {
        long a = k.f4661e.a();
        if (!(runnable instanceof h)) {
            return new j(runnable, a, iVar);
        }
        h hVar = (h) runnable;
        hVar.b = a;
        hVar.c = iVar;
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4631k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x009c
        L_0x000c:
            j.a.u1.a$a r0 = r9.d()
            java.util.concurrent.atomic.AtomicReferenceArray<j.a.u1.a$a> r3 = r9.f4633d
            monitor-enter(r3)
            long r4 = r9.controlState     // Catch:{ all -> 0x009d }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x0063
            r3 = 1
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceArray<j.a.u1.a$a> r4 = r9.f4633d
            java.lang.Object r4 = r4.get(r3)
            i.o.c.h.c(r4)
            j.a.u1.a$a r4 = (j.a.u1.a.C0195a) r4
            if (r4 == r0) goto L_0x005e
        L_0x002b:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x003a
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L_0x002b
        L_0x003a:
            j.a.u1.m r4 = r4.b
            j.a.u1.d r6 = r9.c
            java.util.Objects.requireNonNull(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = j.a.u1.m.b
            r8 = 0
            java.lang.Object r7 = r7.getAndSet(r4, r8)
            j.a.u1.h r7 = (j.a.u1.h) r7
            if (r7 == 0) goto L_0x004f
            r6.a(r7)
        L_0x004f:
            j.a.u1.h r7 = r4.f()
            if (r7 == 0) goto L_0x005a
            r6.a(r7)
            r7 = 1
            goto L_0x005b
        L_0x005a:
            r7 = 0
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            goto L_0x004f
        L_0x005e:
            if (r3 == r5) goto L_0x0063
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0063:
            j.a.u1.d r1 = r9.c
            r1.b()
            j.a.u1.d r1 = r9.b
            r1.b()
        L_0x006d:
            if (r0 == 0) goto L_0x0076
            j.a.u1.h r1 = r0.a(r2)
            if (r1 == 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            j.a.u1.d r1 = r9.b
            java.lang.Object r1 = r1.d()
            j.a.u1.h r1 = (j.a.u1.h) r1
        L_0x007e:
            if (r1 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            j.a.u1.d r1 = r9.c
            java.lang.Object r1 = r1.d()
            j.a.u1.h r1 = (j.a.u1.h) r1
        L_0x0089:
            if (r1 == 0) goto L_0x008f
            r9.n(r1)
            goto L_0x006d
        L_0x008f:
            if (r0 == 0) goto L_0x0096
            j.a.u1.a$b r1 = j.a.u1.a.b.TERMINATED
            r0.e(r1)
        L_0x0096:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x009c:
            return
        L_0x009d:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x00a1
        L_0x00a0:
            throw r0
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.u1.a.close():void");
    }

    public final C0195a d() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C0195a)) {
            currentThread = null;
        }
        C0195a aVar = (C0195a) currentThread;
        if (aVar == null || !h.a(a.this, this)) {
            return null;
        }
        return aVar;
    }

    public void execute(Runnable runnable) {
        f(runnable, g.b, false);
    }

    public final void f(Runnable runnable, i iVar, boolean z) {
        h hVar;
        h b2 = b(runnable, iVar);
        C0195a d2 = d();
        boolean z2 = true;
        if (d2 == null || d2.c == b.TERMINATED || (b2.c.u() == 0 && d2.c == b.BLOCKING)) {
            hVar = b2;
        } else {
            d2.f4642g = true;
            hVar = d2.b.a(b2, z);
        }
        if (hVar != null) {
            if (!(hVar.c.u() == 1 ? this.c : this.b).a(hVar)) {
                throw new RejectedExecutionException(g.a.a.a.a.f(new StringBuilder(), this.f4637h, " was terminated"));
            }
        }
        if (!z || d2 == null) {
            z2 = false;
        }
        if (b2.c.u() != 0) {
            long addAndGet = f4630j.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
            if (!z2 && !s() && !q(addAndGet)) {
                s();
            }
        } else if (!z2) {
            o();
        }
    }

    public final int g(C0195a aVar) {
        int i2;
        do {
            Object obj = aVar.nextParkedWorker;
            if (obj == f4632l) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            aVar = (C0195a) obj;
            i2 = aVar.indexInArray;
        } while (i2 == 0);
        return i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean j(C0195a aVar) {
        long j2;
        int i2;
        if (aVar.nextParkedWorker != f4632l) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            i2 = aVar.indexInArray;
            aVar.nextParkedWorker = this.f4633d.get((int) (2097151 & j2));
        } while (!f4629i.compareAndSet(this, j2, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & -2097152) | ((long) i2)));
        return true;
    }

    public final void k(C0195a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? g(aVar) : i3;
            }
            if (i4 >= 0) {
                if (f4629i.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    public final void n(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    public final void o() {
        if (!s() && !q(this.controlState)) {
            s();
        }
    }

    public final boolean q(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.f4634e) {
            int a = a();
            if (a == 1 && this.f4634e > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            C0195a aVar = this.f4633d.get((int) (2097151 & j2));
            if (aVar != null) {
                long j3 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & -2097152;
                int g2 = g(aVar);
                if (g2 < 0) {
                    continue;
                } else {
                    if (f4629i.compareAndSet(this, j2, ((long) g2) | j3)) {
                        aVar.nextParkedWorker = f4632l;
                    } else {
                        continue;
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            if (C0195a.f4638i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        int length = this.f4633d.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            C0195a aVar = this.f4633d.get(i7);
            if (aVar != null) {
                int d2 = aVar.b.d();
                int ordinal = aVar.c.ordinal();
                if (ordinal == 0) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d2));
                    str = "c";
                } else if (ordinal == 1) {
                    i3++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d2));
                    str = g.c.a.e.k.d.b.a;
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (d2 > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(d2));
                        str = "d";
                    }
                } else if (ordinal == 4) {
                    i6++;
                }
                sb.append(str);
                arrayList.add(sb.toString());
            }
        }
        long j2 = this.controlState;
        return this.f4637h + '@' + f.E(this) + '[' + "Pool Size {" + "core = " + this.f4634e + ", " + "max = " + this.f4635f + "}, " + "Worker States {" + "CPU = " + i2 + ", " + "blocking = " + i3 + ", " + "parked = " + i4 + ", " + "dormant = " + i5 + ", " + "terminated = " + i6 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.b.c() + ", " + "global blocking queue size = " + this.c.c() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j2)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", " + "CPUs acquired = " + (this.f4634e - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }
}
