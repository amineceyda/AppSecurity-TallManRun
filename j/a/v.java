package j.a;

import i.m.b;
import i.m.d;
import i.m.e;
import i.m.f;
import i.o.c.f;
import i.o.c.h;

public abstract class v extends i.m.a implements e {
    public static final a b = new a((f) null);

    public static final class a extends b<e, v> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(e.a.a, u.b);
            int i2 = e.N;
        }
    }

    public v() {
        super(e.a.a);
    }

    public boolean F(i.m.f fVar) {
        return true;
    }

    public void b(d<?> dVar) {
        g<?> l2 = ((d0) dVar).l();
        if (l2 != null) {
            i0 i0Var = (i0) l2._parentHandle;
            if (i0Var != null) {
                i0Var.b();
            }
            l2._parentHandle = h1.b;
        }
    }

    public final <T> d<T> d(d<? super T> dVar) {
        return new d0(this, dVar);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        h.e(bVar, "key");
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            f.b<?> key = getKey();
            h.e(key, "key");
            if (!(key == bVar2 || bVar2.a == key)) {
                return null;
            }
            h.e(this, "element");
            E e2 = (f.a) bVar2.b.g(this);
            if (!(e2 instanceof f.a)) {
                return null;
            }
            return e2;
        } else if (e.a.a == bVar) {
            return this;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3.a(r2) != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (i.m.e.a.a == r3) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.m.f minusKey(i.m.f.b<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            i.o.c.h.e(r3, r0)
            boolean r1 = r3 instanceof i.m.b
            if (r1 == 0) goto L_0x0029
            i.m.b r3 = (i.m.b) r3
            i.m.f$b r1 = r2.getKey()
            i.o.c.h.e(r1, r0)
            if (r1 == r3) goto L_0x001b
            i.m.f$b<?> r0 = r3.a
            if (r0 != r1) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0027
            i.m.f$a r3 = r3.a(r2)
            if (r3 == 0) goto L_0x0027
        L_0x0024:
            i.m.h r3 = i.m.h.b
            goto L_0x002e
        L_0x0027:
            r3 = r2
            goto L_0x002e
        L_0x0029:
            i.m.e$a r0 = i.m.e.a.a
            if (r0 != r3) goto L_0x0027
            goto L_0x0024
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.v.minusKey(i.m.f$b):i.m.f");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + g.c.b.b.f.E(this);
    }

    public abstract void v(i.m.f fVar, Runnable runnable);
}
