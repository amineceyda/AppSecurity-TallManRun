package j.a;

import i.m.d;
import i.m.f;
import j.a.t1.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class f0<T> extends m<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4603f = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_decision");
    private volatile int _decision = 0;

    public f0(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4603f
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            i.m.d<T> r0 = r4.f4628e
            i.m.d r0 = g.c.b.b.f.M(r0)
            i.m.d<T> r1 = r4.f4628e
            java.lang.Object r5 = g.c.b.b.f.h0(r5, r1)
            j.a.e0.a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.f0.V(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4603f
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            i.m.i.a r0 = i.m.i.a.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.E()
            java.lang.Object r0 = j.a.d1.a(r0)
            boolean r1 = r0 instanceof j.a.p
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            j.a.p r0 = (j.a.p) r0
            java.lang.Throwable r0 = r0.a
            goto L_0x0037
        L_0x0036:
            throw r0
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.f0.Y():java.lang.Object");
    }

    public void m(Object obj) {
        V(obj);
    }
}
