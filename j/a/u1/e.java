package j.a.u1;

import i.m.f;
import j.a.a0;
import j.a.q0;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e extends q0 implements i, Executor {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4654h = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");
    public final ConcurrentLinkedQueue<Runnable> c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public final c f4655d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4656e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4657f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4658g;
    private volatile int inFlightTasks = 0;

    public e(c cVar, int i2, String str, int i3) {
        this.f4655d = cVar;
        this.f4656e = i2;
        this.f4657f = str;
        this.f4658g = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v6 java.lang.Runnable) binds: [B:0:0x0000, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4654h
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f4656e
            if (r1 > r2) goto L_0x0021
            j.a.u1.c r0 = r3.f4655d
            java.util.Objects.requireNonNull(r0)
            j.a.u1.a r1 = r0.c     // Catch:{ RejectedExecutionException -> 0x0015 }
            r1.f(r4, r3, r5)     // Catch:{ RejectedExecutionException -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            j.a.a0 r5 = j.a.a0.f4583i
            j.a.u1.a r0 = r0.c
            j.a.u1.h r4 = r0.b(r4, r3)
            r5.e0(r4)
        L_0x0020:
            return
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.c
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f4656e
            if (r4 < r0) goto L_0x002f
            return
        L_0x002f:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.c
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 == 0) goto L_0x003a
            goto L_0x0000
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.u1.e.O(java.lang.Runnable, boolean):void");
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        O(runnable, false);
    }

    public void g() {
        Runnable poll = this.c.poll();
        if (poll != null) {
            c cVar = this.f4655d;
            Objects.requireNonNull(cVar);
            try {
                cVar.c.f(poll, this, true);
            } catch (RejectedExecutionException unused) {
                a0.f4583i.e0(cVar.c.b(poll, this));
            }
        } else {
            f4654h.decrementAndGet(this);
            Runnable poll2 = this.c.poll();
            if (poll2 != null) {
                O(poll2, true);
            }
        }
    }

    public String toString() {
        String str = this.f4657f;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f4655d + ']';
    }

    public int u() {
        return this.f4658g;
    }

    public void v(f fVar, Runnable runnable) {
        O(runnable, false);
    }
}
