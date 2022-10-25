package j.a;

import g.a.a.a.a;
import i.m.f;
import i.m.j.a.d;
import i.o.c.h;
import j.a.t1.n;
import j.a.t1.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d0<T> extends g0<T> implements d, i.m.d<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4592j = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e  reason: collision with root package name */
    public Object f4593e = e0.a;

    /* renamed from: f  reason: collision with root package name */
    public final d f4594f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4595g;

    /* renamed from: h  reason: collision with root package name */
    public final v f4596h;

    /* renamed from: i  reason: collision with root package name */
    public final i.m.d<T> f4597i;

    public d0(v vVar, i.m.d<? super T> dVar) {
        super(0);
        this.f4596h = vVar;
        this.f4597i = dVar;
        this.f4594f = (d) (!(dVar instanceof d) ? null : dVar);
        f c = c();
        n nVar = p.a;
        Object fold = c.fold(0, p.a.b);
        h.c(fold);
        this.f4595g = fold;
        this._reusableCancellableContinuation = null;
    }

    public i.m.d<T> b() {
        return this;
    }

    public f c() {
        return this.f4597i.c();
    }

    public void g(Object obj) {
        f c;
        Object c2;
        f c3 = this.f4597i.c();
        Object t0 = g.c.b.b.f.t0(obj);
        if (this.f4596h.F(c3)) {
            this.f4593e = t0;
            this.f4608d = 0;
            this.f4596h.v(c3, this);
            return;
        }
        n1 n1Var = n1.b;
        l0 a = n1.a();
        if (a.V()) {
            this.f4593e = t0;
            this.f4608d = 0;
            a.Q(this);
            return;
        }
        a.S(true);
        try {
            c = c();
            c2 = p.c(c, this.f4595g);
            this.f4597i.g(obj);
            p.a(c, c2);
            do {
            } while (a.X());
        } catch (Throwable th) {
            try {
                f(th, (Throwable) null);
            } catch (Throwable th2) {
                a.O(true);
                throw th2;
            }
        }
        a.O(true);
    }

    public Object j() {
        Object obj = this.f4593e;
        this.f4593e = e0.a;
        return obj;
    }

    public final Throwable k(f<?> fVar) {
        n nVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            nVar = e0.b;
            if (obj != nVar) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (f4592j.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f4592j.compareAndSet(this, nVar, fVar));
        return null;
    }

    public final g<?> l() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof g)) {
            obj = null;
        }
        return (g) obj;
    }

    public final boolean m(g<?> gVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj != null) {
            return !(obj instanceof g) || obj == gVar;
        }
        return false;
    }

    public final boolean n(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            n nVar = e0.b;
            if (h.a(obj, nVar)) {
                if (f4592j.compareAndSet(this, nVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f4592j.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("DispatchedContinuation[");
        i2.append(this.f4596h);
        i2.append(", ");
        i2.append(g.c.b.b.f.r0(this.f4597i));
        i2.append(']');
        return i2.toString();
    }
}
