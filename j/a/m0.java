package j.a;

import i.j;
import i.m.f;
import j.a.t1.i;
import j.a.t1.n;
import j.a.t1.q;
import j.a.t1.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class m0 extends n0 implements c0 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4614f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4615g;
    private volatile Object _delayed = null;
    public volatile int _isCompleted = 0;
    private volatile Object _queue = null;

    public final class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public final f<j> f4616e;

        public a(long j2, f<? super j> fVar) {
            super(j2);
            this.f4616e = fVar;
        }

        public void run() {
            this.f4616e.e(m0.this, j.a);
        }

        public String toString() {
            return super.toString() + this.f4616e.toString();
        }
    }

    public static abstract class b implements Runnable, Comparable<b>, i0, r {
        public Object b;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f4618d;

        public b(long j2) {
            this.f4618d = j2;
        }

        public void a(int i2) {
            this.c = i2;
        }

        public final synchronized void b() {
            Object obj = this.b;
            n nVar = o0.a;
            if (obj != nVar) {
                if (!(obj instanceof c)) {
                    obj = null;
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    synchronized (cVar) {
                        if (g() != null) {
                            cVar.c(e());
                        }
                    }
                }
                this.b = nVar;
            }
        }

        public int compareTo(Object obj) {
            long j2 = this.f4618d - ((b) obj).f4618d;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        public void d(q<?> qVar) {
            if (this.b != o0.a) {
                this.b = qVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public int e() {
            return this.c;
        }

        public q<?> g() {
            Object obj = this.b;
            if (!(obj instanceof q)) {
                obj = null;
            }
            return (q) obj;
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("Delayed[nanos=");
            i2.append(this.f4618d);
            i2.append(']');
            return i2.toString();
        }
    }

    public static final class c extends q<b> {
        public long b;

        public c(long j2) {
            this.b = j2;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<m0> cls2 = m0.class;
        f4614f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f4615g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    public final void e0(Runnable runnable) {
        if (f0(runnable)) {
            Thread Y = Y();
            if (Thread.currentThread() != Y) {
                LockSupport.unpark(Y);
                return;
            }
            return;
        }
        a0.f4583i.e0(runnable);
    }

    public void f(long j2, f<? super j> fVar) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2;
        }
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j3 + nanoTime, fVar);
            e.e.i.b.l(fVar, aVar);
            k0(nanoTime, aVar);
        }
    }

    public final boolean f0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (g0()) {
                return false;
            }
            if (obj == null) {
                if (f4614f.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof i) {
                i iVar = (i) obj;
                int a2 = iVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f4614f.compareAndSet(this, obj, iVar.e());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == o0.b) {
                return false;
            } else {
                i iVar2 = new i(8, true);
                iVar2.a((Runnable) obj);
                iVar2.a(runnable);
                if (f4614f.compareAndSet(this, obj, iVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean g0() {
        return this._isCompleted;
    }

    public boolean h0() {
        j.a.t1.a<g0<?>> aVar = this.f4612e;
        if (!(aVar == null || aVar.b == aVar.c)) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null) {
            if (!(cVar._size == 0)) {
                return false;
            }
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof i) {
            return ((i) obj).d();
        }
        if (obj == o0.b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i0() {
        /*
            r12 = this;
            boolean r0 = r12.X()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            j.a.m0$c r0 = (j.a.m0.c) r0
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x004f
            int r6 = r0._size
            if (r6 != 0) goto L_0x0018
            r6 = 1
            goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            if (r6 != 0) goto L_0x004f
            long r6 = java.lang.System.nanoTime()
        L_0x001f:
            monitor-enter(r0)
            j.a.t1.r r8 = r0.b()     // Catch:{ all -> 0x004c }
            if (r8 == 0) goto L_0x0045
            j.a.m0$b r8 = (j.a.m0.b) r8     // Catch:{ all -> 0x004c }
            long r9 = r8.f4618d     // Catch:{ all -> 0x004c }
            long r9 = r6 - r9
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 < 0) goto L_0x0032
            r9 = 1
            goto L_0x0033
        L_0x0032:
            r9 = 0
        L_0x0033:
            if (r9 == 0) goto L_0x003a
            boolean r8 = r12.f0(r8)     // Catch:{ all -> 0x004c }
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r8 == 0) goto L_0x0042
            j.a.t1.r r8 = r0.c(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0043
        L_0x0042:
            r8 = r3
        L_0x0043:
            monitor-exit(r0)
            goto L_0x0047
        L_0x0045:
            monitor-exit(r0)
            r8 = r3
        L_0x0047:
            j.a.m0$b r8 = (j.a.m0.b) r8
            if (r8 == 0) goto L_0x004f
            goto L_0x001f
        L_0x004c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004f:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L_0x0054
            goto L_0x0081
        L_0x0054:
            boolean r6 = r0 instanceof j.a.t1.i
            if (r6 == 0) goto L_0x0071
            r6 = r0
            j.a.t1.i r6 = (j.a.t1.i) r6
            java.lang.Object r7 = r6.f()
            j.a.t1.n r8 = j.a.t1.i.f4625g
            if (r7 == r8) goto L_0x0067
            r3 = r7
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            goto L_0x0081
        L_0x0067:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f4614f
            j.a.t1.i r6 = r6.e()
            r7.compareAndSet(r12, r0, r6)
            goto L_0x004f
        L_0x0071:
            j.a.t1.n r6 = j.a.o0.b
            if (r0 != r6) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f4614f
            boolean r6 = r6.compareAndSet(r12, r0, r3)
            if (r6 == 0) goto L_0x004f
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L_0x0081:
            if (r3 == 0) goto L_0x0087
            r3.run()
            return r1
        L_0x0087:
            j.a.t1.a<j.a.g0<?>> r0 = r12.f4612e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x009d
            int r3 = r0.b
            int r0 = r0.c
            if (r3 != r0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r4 = 0
        L_0x0098:
            if (r4 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r3 = r1
            goto L_0x009e
        L_0x009d:
            r3 = r6
        L_0x009e:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a3
            goto L_0x00db
        L_0x00a3:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L_0x00a8
            goto L_0x00b5
        L_0x00a8:
            boolean r3 = r0 instanceof j.a.t1.i
            if (r3 == 0) goto L_0x00d6
            j.a.t1.i r0 = (j.a.t1.i) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00b5
            goto L_0x00db
        L_0x00b5:
            java.lang.Object r0 = r12._delayed
            j.a.m0$c r0 = (j.a.m0.c) r0
            if (r0 == 0) goto L_0x00da
            monitor-enter(r0)
            j.a.t1.r r3 = r0.b()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            j.a.m0$b r3 = (j.a.m0.b) r3
            if (r3 == 0) goto L_0x00da
            long r3 = r3.f4618d
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            goto L_0x00db
        L_0x00d1:
            r1 = r3
            goto L_0x00db
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d6:
            j.a.t1.n r3 = j.a.o0.b
            if (r0 != r3) goto L_0x00db
        L_0x00da:
            r1 = r6
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.m0.i0():long");
    }

    public final void j0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [j.a.t1.r] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if ((r8 - r0.b) > 0) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0(long r13, j.a.m0.b r15) {
        /*
            r12 = this;
            boolean r0 = r12.g0()
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x0067
        L_0x000c:
            java.lang.Object r0 = r12._delayed
            j.a.m0$c r0 = (j.a.m0.c) r0
            if (r0 == 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4615g
            j.a.m0$c r5 = new j.a.m0$c
            r5.<init>(r13)
            r0.compareAndSet(r12, r4, r5)
            java.lang.Object r0 = r12._delayed
            i.o.c.h.c(r0)
            j.a.m0$c r0 = (j.a.m0.c) r0
        L_0x0024:
            monitor-enter(r15)
            java.lang.Object r5 = r15.b     // Catch:{ all -> 0x00a9 }
            j.a.t1.n r6 = j.a.o0.a     // Catch:{ all -> 0x00a9 }
            if (r5 != r6) goto L_0x002d
            r0 = 2
            goto L_0x0066
        L_0x002d:
            monitor-enter(r0)     // Catch:{ all -> 0x00a9 }
            j.a.t1.r r5 = r0.b()     // Catch:{ all -> 0x00a6 }
            j.a.m0$b r5 = (j.a.m0.b) r5     // Catch:{ all -> 0x00a6 }
            boolean r6 = r12.g0()     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x003d
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 1
            goto L_0x0066
        L_0x003d:
            r6 = 0
            if (r5 != 0) goto L_0x0043
            r8 = r13
            goto L_0x0054
        L_0x0043:
            long r8 = r5.f4618d     // Catch:{ all -> 0x00a6 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x004c
            r8 = r13
        L_0x004c:
            long r10 = r0.b     // Catch:{ all -> 0x00a6 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0056
        L_0x0054:
            r0.b = r8     // Catch:{ all -> 0x00a6 }
        L_0x0056:
            long r8 = r15.f4618d     // Catch:{ all -> 0x00a6 }
            long r10 = r0.b     // Catch:{ all -> 0x00a6 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0061
            r15.f4618d = r10     // Catch:{ all -> 0x00a6 }
        L_0x0061:
            r0.a(r15)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 0
        L_0x0066:
            monitor-exit(r15)
        L_0x0067:
            if (r0 == 0) goto L_0x0080
            if (r0 == r3) goto L_0x007a
            if (r0 != r1) goto L_0x006e
            goto L_0x00a5
        L_0x006e:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x007a:
            j.a.a0 r0 = j.a.a0.f4583i
            r0.k0(r13, r15)
            goto L_0x00a5
        L_0x0080:
            java.lang.Object r13 = r12._delayed
            j.a.m0$c r13 = (j.a.m0.c) r13
            if (r13 == 0) goto L_0x0093
            monitor-enter(r13)
            j.a.t1.r r14 = r13.b()     // Catch:{ all -> 0x0090 }
            monitor-exit(r13)
            r4 = r14
            j.a.m0$b r4 = (j.a.m0.b) r4
            goto L_0x0093
        L_0x0090:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x0093:
            if (r4 != r15) goto L_0x0096
            r2 = 1
        L_0x0096:
            if (r2 == 0) goto L_0x00a5
            java.lang.Thread r13 = r12.Y()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00a5
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00a5:
            return
        L_0x00a6:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            throw r13     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.m0.k0(long, j.a.m0$b):void");
    }

    public void shutdown() {
        r c2;
        n1 n1Var = n1.b;
        n1.a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f4614f.compareAndSet(this, (Object) null, o0.b)) {
                    break;
                }
            } else if (obj instanceof i) {
                ((i) obj).b();
                break;
            } else if (obj == o0.b) {
                break;
            } else {
                i iVar = new i(8, true);
                iVar.a((Runnable) obj);
                if (f4614f.compareAndSet(this, obj, iVar)) {
                    break;
                }
            }
        }
        do {
        } while (i0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar != null) {
                synchronized (cVar) {
                    c2 = cVar._size > 0 ? cVar.c(0) : null;
                }
                b bVar = (b) c2;
                if (bVar != null) {
                    a0.f4583i.k0(nanoTime, bVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void v(f fVar, Runnable runnable) {
        e0(runnable);
    }
}
