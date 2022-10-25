package j.a.t1;

import i.o.c.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class g {
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicReferenceFieldUpdater c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4622d;
    public volatile Object _next = this;
    public volatile Object _prev = this;
    private volatile Object _removedRef = null;

    public static abstract class a extends c<g> {
        public g b;
        public final g c;

        public a(g gVar) {
            this.c = gVar;
        }

        public void b(Object obj, Object obj2) {
            g gVar = (g) obj;
            boolean z = obj2 == null;
            g gVar2 = z ? this.c : this.b;
            if (gVar2 != null && g.b.compareAndSet(gVar, this, gVar2) && z) {
                g gVar3 = this.c;
                g gVar4 = this.b;
                h.c(gVar4);
                gVar3.h(gVar4);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<g> cls2 = g.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f4622d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (b.compareAndSet(r2, r1, ((j.a.t1.l) r3).a) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.a.t1.g d(j.a.t1.k r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            j.a.t1.g r7 = (j.a.t1.g) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = c
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.l()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof j.a.t1.k
            if (r4 == 0) goto L_0x002c
            j.a.t1.k r3 = (j.a.t1.k) r3
            r3.a(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof j.a.t1.l
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = b
            j.a.t1.l r3 = (j.a.t1.l) r3
            j.a.t1.g r3 = r3.a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            j.a.t1.g r1 = (j.a.t1.g) r1
            goto L_0x0007
        L_0x0046:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            java.util.Objects.requireNonNull(r3, r2)
            r2 = r3
            j.a.t1.g r2 = (j.a.t1.g) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.t1.g.d(j.a.t1.k):j.a.t1.g");
    }

    public final void h(g gVar) {
        g gVar2;
        do {
            gVar2 = (g) gVar._prev;
            if (i() != gVar) {
                return;
            }
        } while (!c.compareAndSet(gVar, gVar2, this));
        if (l()) {
            gVar.d((k) null);
        }
    }

    public final Object i() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public final g j() {
        g gVar;
        Object i2 = i();
        l lVar = (l) (!(i2 instanceof l) ? null : i2);
        if (lVar != null && (gVar = lVar.a) != null) {
            return gVar;
        }
        Objects.requireNonNull(i2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (g) i2;
    }

    public final g k() {
        g d2 = d((k) null);
        if (d2 == null) {
            Object obj = this._prev;
            while (true) {
                d2 = (g) obj;
                if (!d2.l()) {
                    break;
                }
                obj = d2._prev;
            }
        }
        return d2;
    }

    public boolean l() {
        return i() instanceof l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.i()
            boolean r1 = r0 instanceof j.a.t1.l
            if (r1 == 0) goto L_0x000d
            j.a.t1.l r0 = (j.a.t1.l) r0
            j.a.t1.g r0 = r0.a
            goto L_0x0037
        L_0x000d:
            if (r0 != r4) goto L_0x0012
            j.a.t1.g r0 = (j.a.t1.g) r0
            goto L_0x0037
        L_0x0012:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            java.util.Objects.requireNonNull(r0, r1)
            r1 = r0
            j.a.t1.g r1 = (j.a.t1.g) r1
            java.lang.Object r2 = r1._removedRef
            j.a.t1.l r2 = (j.a.t1.l) r2
            if (r2 == 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            j.a.t1.l r2 = new j.a.t1.l
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f4622d
            r3.lazySet(r1, r2)
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = b
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r1.d(r0)
        L_0x0037:
            if (r0 != 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.t1.g.m():boolean");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
