package j.a.t1;

import i.o.c.f;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class i<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4623e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4624f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f4625g = new n("REMOVE_FROZEN");

    /* renamed from: h  reason: collision with root package name */
    public static final a f4626h = new a((f) null);
    private volatile Object _next = null;
    private volatile long _state = 0;
    public final int a;
    public AtomicReferenceArray b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4627d;

    public static final class a {
        public a(f fVar) {
        }
    }

    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    static {
        Class<i> cls = i.class;
        f4623e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f4624f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public i(int i2, boolean z) {
        this.c = i2;
        this.f4627d = z;
        int i3 = i2 - 1;
        this.a = i3;
        this.b = new AtomicReferenceArray(i2);
        boolean z2 = false;
        if (i3 <= 1073741823) {
            if (!((i2 & i3) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e2) {
        E e3 = e2;
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((j2 & 1152921503533105152L) >> 30);
            int i4 = this.a;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (this.f4627d || this.b.get(i3 & i4) == null) {
                if (f4624f.compareAndSet(this, j2, ((1152921503533105152L ^ -1) & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                    this.b.set(i3 & i4, e3);
                    i iVar = this;
                    while ((iVar._state & 1152921504606846976L) != 0) {
                        iVar = iVar.e();
                        Object obj = iVar.b.get(iVar.a & i3);
                        if (!(obj instanceof b) || ((b) obj).a != i3) {
                            iVar = null;
                            continue;
                        } else {
                            iVar.b.set(iVar.a & i3, e3);
                            continue;
                        }
                        if (iVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.c;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f4624f.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.a.t1.i<E> e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f4624f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            j.a.t1.i r0 = (j.a.t1.i) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f4623e
            r1 = 0
            j.a.t1.i r4 = new j.a.t1.i
            int r5 = r10.c
            int r5 = r5 * 2
            boolean r6 = r10.f4627d
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r6 = (int) r5
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0040:
            int r7 = r10.a
            r8 = r6 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.b
            java.lang.Object r7 = r7.get(r8)
            if (r7 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            j.a.t1.i$b r7 = new j.a.t1.i$b
            r7.<init>(r6)
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.b
            int r9 = r4.a
            r9 = r9 & r6
            r8.set(r9, r7)
            int r6 = r6 + 1
            goto L_0x0040
        L_0x0060:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.t1.i.e():j.a.t1.i");
    }

    public final Object f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f4625g;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.a;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.b.get(i5);
            if (obj == null) {
                if (this.f4627d) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j3 = ((long) ((i2 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f4624f.compareAndSet(this, j2, (j2 & -1073741824) | j3)) {
                    this.b.set(this.a & i2, (Object) null);
                    return obj2;
                } else if (this.f4627d) {
                    i iVar = this;
                    while (true) {
                        long j4 = iVar._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            iVar = iVar.e();
                        } else {
                            if (f4624f.compareAndSet(iVar, j4, j3 | (j4 & -1073741824))) {
                                iVar.b.set(iVar.a & i6, (Object) null);
                                iVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (iVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
