package j.a;

import i.j;
import i.m.f;
import i.m.i.a;
import i.m.j.a.d;
import i.o.b.l;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

public class g<T> extends g0<T> implements f<T>, d {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4604g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_decision");

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4605h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    private volatile Object _state = b.b;

    /* renamed from: e  reason: collision with root package name */
    public final f f4606e;

    /* renamed from: f  reason: collision with root package name */
    public final i.m.d<T> f4607f;

    public g(i.m.d<? super T> dVar, int i2) {
        super(i2);
        this.f4607f = dVar;
        this.f4606e = dVar.c();
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof r) {
            try {
                Objects.requireNonNull((r) obj);
                throw null;
            } catch (Throwable th2) {
                f fVar = this.f4606e;
                g.c.b.b.f.J(fVar, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    public final i.m.d<T> b() {
        return this.f4607f;
    }

    public f c() {
        return this.f4606e;
    }

    public <T> T d(Object obj) {
        Object obj2;
        if (obj instanceof q) {
            obj2 = (q) obj;
        } else if (!(obj instanceof r)) {
            return obj;
        } else {
            obj2 = (r) obj;
        }
        Objects.requireNonNull(obj2);
        return null;
    }

    public void e(v vVar, T t) {
        i.m.d<T> dVar = this.f4607f;
        v vVar2 = null;
        if (!(dVar instanceof d0)) {
            dVar = null;
        }
        d0 d0Var = (d0) dVar;
        if (d0Var != null) {
            vVar2 = d0Var.f4596h;
        }
        q(t, vVar2 == vVar ? 2 : this.f4608d);
    }

    public void g(Object obj) {
        Throwable a = i.f.a(obj);
        if (a != null) {
            obj = new p(a, false, 2);
        }
        q(obj, this.f4608d);
    }

    public boolean h(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof i1)) {
                return false;
            }
            z = obj instanceof d;
        } while (!f4605h.compareAndSet(this, obj, new h(this, th, z)));
        if (z) {
            try {
                ((d) obj).a(th);
            } catch (Throwable th2) {
                f fVar = this.f4606e;
                g.c.b.b.f.J(fVar, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
        k();
        l(0);
        return true;
    }

    public void i(l<? super Throwable, j> lVar) {
        Object obj;
        Throwable th = null;
        d dVar = null;
        do {
            obj = this._state;
            if (obj instanceof b) {
                if (dVar == null) {
                    dVar = o(lVar);
                }
            } else if (obj instanceof d) {
                p(lVar, obj);
                throw null;
            } else if (obj instanceof h) {
                h hVar = (h) obj;
                Objects.requireNonNull(hVar);
                if (p.b.compareAndSet(hVar, 0, 1)) {
                    try {
                        if (!(obj instanceof p)) {
                            obj = null;
                        }
                        p pVar = (p) obj;
                        if (pVar != null) {
                            th = pVar.a;
                        }
                        lVar.g(th);
                        return;
                    } catch (Throwable th2) {
                        g.c.b.b.f.J(this.f4606e, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
                        return;
                    }
                } else {
                    p(lVar, obj);
                    throw null;
                }
            } else {
                return;
            }
        } while (!f4605h.compareAndSet(this, obj, dVar));
    }

    public Object j() {
        return this._state;
    }

    public final void k() {
        if (!n()) {
            i0 i0Var = (i0) this._parentHandle;
            if (i0Var != null) {
                i0Var.b();
            }
            this._parentHandle = h1.b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r5._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = 0
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4604g
            boolean r0 = r0.compareAndSet(r5, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            i.m.d r0 = r5.b()
            if (r6 == 0) goto L_0x002b
            if (r6 != r3) goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r2 == 0) goto L_0x0080
            boolean r2 = r0 instanceof j.a.d0
            if (r2 == 0) goto L_0x0080
            boolean r2 = g.c.b.b.f.O(r6)
            int r4 = r5.f4608d
            boolean r4 = g.c.b.b.f.O(r4)
            if (r2 != r4) goto L_0x0080
            r6 = r0
            j.a.d0 r6 = (j.a.d0) r6
            j.a.v r6 = r6.f4596h
            i.m.f r0 = r0.c()
            boolean r2 = r6.F(r0)
            if (r2 == 0) goto L_0x0051
            r6.v(r0, r5)
            goto L_0x0083
        L_0x0051:
            j.a.n1 r6 = j.a.n1.b
            j.a.l0 r6 = j.a.n1.a()
            boolean r0 = r6.V()
            if (r0 == 0) goto L_0x0061
            r6.Q(r5)
            goto L_0x0083
        L_0x0061:
            r6.S(r3)
            i.m.d r0 = r5.b()     // Catch:{ all -> 0x0072 }
            g.c.b.b.f.i0(r5, r0, r1)     // Catch:{ all -> 0x0072 }
        L_0x006b:
            boolean r0 = r6.X()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006b
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r1 = 0
            r5.f(r0, r1)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r6.O(r3)
            goto L_0x0083
        L_0x007b:
            r0 = move-exception
            r6.O(r3)
            throw r0
        L_0x0080:
            g.c.b.b.f.i0(r5, r0, r6)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.g.l(int):void");
    }

    public final Object m() {
        boolean z;
        y0 y0Var;
        r();
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 == 0) {
                if (f4604g.compareAndSet(this, 0, 1)) {
                    z = true;
                    break;
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return a.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof p) {
            throw ((p) obj).a;
        } else if (this.f4608d != 1 || (y0Var = (y0) this.f4606e.get(y0.P)) == null || y0Var.a()) {
            return d(obj);
        } else {
            CancellationException o = y0Var.o();
            a(obj, o);
            throw o;
        }
    }

    public final boolean n() {
        i.m.d<T> dVar = this.f4607f;
        return (dVar instanceof d0) && ((d0) dVar).m(this);
    }

    public final d o(l<? super Throwable, j> lVar) {
        return lVar instanceof d ? (d) lVar : new v0(lVar);
    }

    public final void p(l<? super Throwable, j> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final h q(Object obj, int i2) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof i1)) {
                if (obj2 instanceof h) {
                    h hVar = (h) obj2;
                    Objects.requireNonNull(hVar);
                    if (h.c.compareAndSet(hVar, 0, 1)) {
                        return hVar;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!f4605h.compareAndSet(this, obj2, obj));
        k();
        l(i2);
        return null;
    }

    public final void r() {
        y0 y0Var;
        Throwable k2;
        boolean z = !(this._state instanceof i1);
        if (this.f4608d == 0) {
            i.m.d<T> dVar = this.f4607f;
            if (!(dVar instanceof d0)) {
                dVar = null;
            }
            d0 d0Var = (d0) dVar;
            if (!(d0Var == null || (k2 = d0Var.k(this)) == null)) {
                if (!z) {
                    h(k2);
                }
                z = true;
            }
        }
        if (!z && ((i0) this._parentHandle) == null && (y0Var = (y0) this.f4607f.c().get(y0.P)) != null) {
            y0Var.start();
            i0 N = g.c.b.b.f.N(y0Var, true, false, new i(y0Var, this), 2, (Object) null);
            this._parentHandle = N;
            if ((true ^ (this._state instanceof i1)) && !n()) {
                N.b();
                this._parentHandle = h1.b;
            }
        }
    }

    public String toString() {
        return "CancellableContinuation" + '(' + g.c.b.b.f.r0(this.f4607f) + "){" + this._state + "}@" + g.c.b.b.f.E(this);
    }
}
