package j.a;

import i.j;
import i.m.f;
import i.o.b.l;
import i.o.b.p;
import i.o.c.h;
import j.a.t1.f;
import j.a.t1.g;
import j.a.t1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import org.slf4j.helpers.MessageFormatter;

public class c1 implements y0, l, j1 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(c1.class, Object.class, "_state");
    public volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a extends b1<y0> {

        /* renamed from: f  reason: collision with root package name */
        public final c1 f4586f;

        /* renamed from: g  reason: collision with root package name */
        public final b f4587g;

        /* renamed from: h  reason: collision with root package name */
        public final k f4588h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f4589i;

        public a(c1 c1Var, b bVar, k kVar, Object obj) {
            super(kVar.f4610f);
            this.f4586f = c1Var;
            this.f4587g = bVar;
            this.f4588h = kVar;
            this.f4589i = obj;
        }

        public /* bridge */ /* synthetic */ Object g(Object obj) {
            n((Throwable) obj);
            return j.a;
        }

        public void n(Throwable th) {
            c1 c1Var = this.f4586f;
            b bVar = this.f4587g;
            k kVar = this.f4588h;
            Object obj = this.f4589i;
            k M = c1Var.M(kVar);
            if (M == null || !c1Var.U(bVar, M, obj)) {
                c1Var.m(c1Var.z(bVar, obj));
            }
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("ChildCompletion[");
            i2.append(this.f4588h);
            i2.append(", ");
            i2.append(this.f4589i);
            i2.append(']');
            return i2.toString();
        }
    }

    public static final class b implements t0 {
        public volatile Object _exceptionsHolder = null;
        public volatile int _isCompleting;
        public volatile Object _rootCause;
        public final g1 b;

        public b(g1 g1Var, boolean z, Throwable th) {
            this.b = g1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> d2 = d();
                        d2.add(obj);
                        d2.add(th);
                        this._exceptionsHolder = d2;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public g1 c() {
            return this.b;
        }

        public final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            return this._exceptionsHolder == d1.f4599e;
        }

        public final List<Throwable> h(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = d();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> d2 = d();
                d2.add(obj);
                arrayList = d2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!h.a(th, th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = d1.f4599e;
            return arrayList;
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("Finishing[cancelling=");
            i2.append(e());
            i2.append(", completing=");
            i2.append(f());
            i2.append(", rootCause=");
            i2.append((Throwable) this._rootCause);
            i2.append(", exceptions=");
            i2.append(this._exceptionsHolder);
            i2.append(", list=");
            i2.append(this.b);
            i2.append(']');
            return i2.toString();
        }
    }

    public static final class c extends g.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c1 f4590d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f4591e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar, g gVar2, c1 c1Var, Object obj) {
            super(gVar2);
            this.f4590d = c1Var;
            this.f4591e = obj;
        }

        public Object c(Object obj) {
            g gVar = (g) obj;
            if (this.f4590d.E() == this.f4591e) {
                return null;
            }
            return f.a;
        }
    }

    public c1(boolean z) {
        this._state = z ? d1.f4601g : d1.f4600f;
        this._parentHandle = null;
    }

    public final Throwable A(b bVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (bVar.e()) {
            return new JobCancellationException(u(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return false;
    }

    public final g1 D(t0 t0Var) {
        g1 c2 = t0Var.c();
        if (c2 != null) {
            return c2;
        }
        if (t0Var instanceof k0) {
            return new g1();
        }
        if (t0Var instanceof b1) {
            Q((b1) t0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + t0Var).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public void G(Throwable th) {
        throw th;
    }

    public final void H(y0 y0Var) {
        if (y0Var == null) {
            this._parentHandle = h1.b;
            return;
        }
        y0Var.start();
        j x = y0Var.x(this);
        this._parentHandle = x;
        if (!(E() instanceof t0)) {
            x.b();
            this._parentHandle = h1.b;
        }
    }

    public boolean I() {
        return false;
    }

    public final Object J(Object obj) {
        Object T;
        do {
            T = T(E(), obj);
            if (T == d1.a) {
                String str = "Job " + this + " is already complete or completing, " + "but is being completed with " + obj;
                Throwable th = null;
                if (!(obj instanceof p)) {
                    obj = null;
                }
                p pVar = (p) obj;
                if (pVar != null) {
                    th = pVar.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (T == d1.c);
        return T;
    }

    public final b1<?> K(l<? super Throwable, j> lVar, boolean z) {
        z0 z0Var = null;
        if (z) {
            if (lVar instanceof z0) {
                z0Var = lVar;
            }
            z0 z0Var2 = z0Var;
            return z0Var2 != null ? z0Var2 : new w0(this, lVar);
        }
        if (lVar instanceof b1) {
            z0Var = lVar;
        }
        b1<?> b1Var = z0Var;
        return b1Var != null ? b1Var : new x0(this, lVar);
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final k M(g gVar) {
        while (gVar.l()) {
            gVar = gVar.k();
        }
        while (true) {
            gVar = gVar.j();
            if (!gVar.l()) {
                if (gVar instanceof k) {
                    return (k) gVar;
                }
                if (gVar instanceof g1) {
                    return null;
                }
            }
        }
    }

    public final void N(g1 g1Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        Object i2 = g1Var.i();
        Objects.requireNonNull(i2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        for (g gVar = (g) i2; !h.a(gVar, g1Var); gVar = gVar.j()) {
            if (gVar instanceof z0) {
                b1 b1Var = (b1) gVar;
                try {
                    b1Var.n(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        g.c.b.b.f.c(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            G(completionHandlerException);
        }
        r(th);
    }

    public void O(Object obj) {
    }

    public void P() {
    }

    public final void Q(b1<?> b1Var) {
        g1 g1Var = new g1();
        g.c.lazySet(g1Var, b1Var);
        g.b.lazySet(g1Var, b1Var);
        while (true) {
            if (b1Var.i() == b1Var) {
                if (g.b.compareAndSet(b1Var, b1Var, g1Var)) {
                    g1Var.h(b1Var);
                    break;
                }
            } else {
                break;
            }
        }
        b.compareAndSet(this, b1Var, b1Var.j());
    }

    public final String R(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof t0 ? ((t0) obj).a() ? "Active" : "New" : obj instanceof p ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.e() ? "Cancelling" : bVar.f() ? "Completing" : "Active";
    }

    public final CancellationException S(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = u();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0092, code lost:
        if (r5 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0094, code lost:
        N(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0099, code lost:
        if ((r7 instanceof j.a.k) != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x009d, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009e, code lost:
        r0 = (j.a.k) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a0, code lost:
        if (r0 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a2, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a4, code lost:
        r7 = r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a8, code lost:
        if (r7 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00aa, code lost:
        r4 = M(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ae, code lost:
        if (r4 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b4, code lost:
        if (U(r3, r4, r8) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return j.a.d1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return z(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j.a.t0
            if (r0 != 0) goto L_0x0007
            j.a.t1.n r7 = j.a.d1.a
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof j.a.k0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7 instanceof j.a.b1
            if (r0 == 0) goto L_0x003f
        L_0x0011:
            boolean r0 = r7 instanceof j.a.k
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof j.a.p
            if (r0 != 0) goto L_0x003f
            j.a.t0 r7 = (j.a.t0) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b
            boolean r3 = r8 instanceof j.a.t0
            if (r3 == 0) goto L_0x002a
            j.a.u0 r3 = new j.a.u0
            r4 = r8
            j.a.t0 r4 = (j.a.t0) r4
            r3.<init>(r4)
            goto L_0x002b
        L_0x002a:
            r3 = r8
        L_0x002b:
            boolean r0 = r0.compareAndSet(r6, r7, r3)
            if (r0 != 0) goto L_0x0033
            r1 = 0
            goto L_0x0039
        L_0x0033:
            r6.O(r8)
            r6.w(r7, r8)
        L_0x0039:
            if (r1 == 0) goto L_0x003c
            return r8
        L_0x003c:
            j.a.t1.n r7 = j.a.d1.c
            return r7
        L_0x003f:
            j.a.t0 r7 = (j.a.t0) r7
            j.a.g1 r0 = r6.D(r7)
            if (r0 == 0) goto L_0x00c1
            boolean r3 = r7 instanceof j.a.c1.b
            r4 = 0
            if (r3 != 0) goto L_0x004e
            r3 = r4
            goto L_0x004f
        L_0x004e:
            r3 = r7
        L_0x004f:
            j.a.c1$b r3 = (j.a.c1.b) r3
            if (r3 == 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            j.a.c1$b r3 = new j.a.c1$b
            r3.<init>(r0, r2, r4)
        L_0x0059:
            monitor-enter(r3)
            boolean r2 = r3.f()     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x0065
            j.a.t1.n r7 = j.a.d1.a     // Catch:{ all -> 0x00be }
        L_0x0062:
            monitor-exit(r3)
            goto L_0x00c3
        L_0x0065:
            r3._isCompleting = r1     // Catch:{ all -> 0x00be }
            if (r3 == r7) goto L_0x0074
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = b     // Catch:{ all -> 0x00be }
            boolean r2 = r2.compareAndSet(r6, r7, r3)     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x0074
            j.a.t1.n r7 = j.a.d1.c     // Catch:{ all -> 0x00be }
            goto L_0x0062
        L_0x0074:
            boolean r2 = r3.e()     // Catch:{ all -> 0x00be }
            boolean r5 = r8 instanceof j.a.p     // Catch:{ all -> 0x00be }
            if (r5 != 0) goto L_0x007e
            r5 = r4
            goto L_0x007f
        L_0x007e:
            r5 = r8
        L_0x007f:
            j.a.p r5 = (j.a.p) r5     // Catch:{ all -> 0x00be }
            if (r5 == 0) goto L_0x0088
            java.lang.Throwable r5 = r5.a     // Catch:{ all -> 0x00be }
            r3.b(r5)     // Catch:{ all -> 0x00be }
        L_0x0088:
            java.lang.Object r5 = r3._rootCause     // Catch:{ all -> 0x00be }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00be }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r5 = r4
        L_0x0091:
            monitor-exit(r3)
            if (r5 == 0) goto L_0x0097
            r6.N(r0, r5)
        L_0x0097:
            boolean r0 = r7 instanceof j.a.k
            if (r0 != 0) goto L_0x009d
            r0 = r4
            goto L_0x009e
        L_0x009d:
            r0 = r7
        L_0x009e:
            j.a.k r0 = (j.a.k) r0
            if (r0 == 0) goto L_0x00a4
            r4 = r0
            goto L_0x00ae
        L_0x00a4:
            j.a.g1 r7 = r7.c()
            if (r7 == 0) goto L_0x00ae
            j.a.k r4 = r6.M(r7)
        L_0x00ae:
            if (r4 == 0) goto L_0x00b9
            boolean r7 = r6.U(r3, r4, r8)
            if (r7 == 0) goto L_0x00b9
            j.a.t1.n r7 = j.a.d1.b
            goto L_0x00c3
        L_0x00b9:
            java.lang.Object r7 = r6.z(r3, r8)
            goto L_0x00c3
        L_0x00be:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L_0x00c1:
            j.a.t1.n r7 = j.a.d1.c
        L_0x00c3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.c1.T(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean U(b bVar, k kVar, Object obj) {
        while (g.c.b.b.f.N(kVar.f4610f, false, false, new a(this, bVar, kVar, obj), 1, (Object) null) == h1.b) {
            kVar = M(kVar);
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    public boolean a() {
        Object E = E();
        return (E instanceof t0) && ((t0) E).a();
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        return f.a.C0191a.a(this, r, pVar);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        return f.a.C0191a.b(this, bVar);
    }

    public final f.b<?> getKey() {
        return y0.P;
    }

    public CancellationException k() {
        Throwable th;
        Object E = E();
        CancellationException cancellationException = null;
        if (E instanceof b) {
            th = (Throwable) ((b) E)._rootCause;
        } else if (E instanceof p) {
            th = ((p) E).a;
        } else if (!(E instanceof t0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + E).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder i2 = g.a.a.a.a.i("Parent job is ");
        i2.append(R(E));
        return new JobCancellationException(i2.toString(), th, this);
    }

    public final boolean l(Object obj, g1 g1Var, b1<?> b1Var) {
        char c2;
        c cVar = new c(b1Var, b1Var, this, obj);
        do {
            g k2 = g1Var.k();
            g.c.lazySet(b1Var, k2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.b;
            atomicReferenceFieldUpdater.lazySet(b1Var, g1Var);
            cVar.b = g1Var;
            c2 = !atomicReferenceFieldUpdater.compareAndSet(k2, g1Var, cVar) ? 0 : cVar.a(k2) == null ? (char) 1 : 2;
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void m(Object obj) {
    }

    public i.m.f minusKey(f.b<?> bVar) {
        return f.a.C0191a.c(this, bVar);
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [j.a.s0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.a.i0 n(boolean r8, boolean r9, i.o.b.l<? super java.lang.Throwable, i.j> r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.E()
            boolean r3 = r2 instanceof j.a.k0
            if (r3 == 0) goto L_0x0037
            r3 = r2
            j.a.k0 r3 = (j.a.k0) r3
            boolean r4 = r3.b
            if (r4 == 0) goto L_0x0021
            if (r1 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            j.a.b1 r1 = r7.K(r10, r8)
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = b
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0002
            return r1
        L_0x0021:
            j.a.g1 r2 = new j.a.g1
            r2.<init>()
            boolean r4 = r3.b
            if (r4 == 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            j.a.s0 r4 = new j.a.s0
            r4.<init>(r2)
            r2 = r4
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = b
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0002
        L_0x0037:
            boolean r3 = r2 instanceof j.a.t0
            if (r3 == 0) goto L_0x009e
            r3 = r2
            j.a.t0 r3 = (j.a.t0) r3
            j.a.g1 r3 = r3.c()
            if (r3 != 0) goto L_0x004f
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            java.util.Objects.requireNonNull(r2, r3)
            j.a.b1 r2 = (j.a.b1) r2
            r7.Q(r2)
            goto L_0x0002
        L_0x004f:
            j.a.h1 r4 = j.a.h1.b
            if (r8 == 0) goto L_0x0087
            boolean r5 = r2 instanceof j.a.c1.b
            if (r5 == 0) goto L_0x0087
            monitor-enter(r2)
            r5 = r2
            j.a.c1$b r5 = (j.a.c1.b) r5     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r5._rootCause     // Catch:{ all -> 0x0084 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x006e
            boolean r6 = r10 instanceof j.a.k     // Catch:{ all -> 0x0084 }
            if (r6 == 0) goto L_0x0082
            r6 = r2
            j.a.c1$b r6 = (j.a.c1.b) r6     // Catch:{ all -> 0x0084 }
            boolean r6 = r6.f()     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0082
        L_0x006e:
            if (r1 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            j.a.b1 r1 = r7.K(r10, r8)     // Catch:{ all -> 0x0084 }
        L_0x0075:
            boolean r4 = r7.l(r2, r3, r1)     // Catch:{ all -> 0x0084 }
            if (r4 != 0) goto L_0x007d
            monitor-exit(r2)
            goto L_0x0002
        L_0x007d:
            if (r5 != 0) goto L_0x0081
            monitor-exit(r2)
            return r1
        L_0x0081:
            r4 = r1
        L_0x0082:
            monitor-exit(r2)
            goto L_0x0088
        L_0x0084:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x0087:
            r5 = r0
        L_0x0088:
            if (r5 == 0) goto L_0x0090
            if (r9 == 0) goto L_0x008f
            r10.g(r5)
        L_0x008f:
            return r4
        L_0x0090:
            if (r1 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            j.a.b1 r1 = r7.K(r10, r8)
        L_0x0097:
            boolean r2 = r7.l(r2, r3, r1)
            if (r2 == 0) goto L_0x0002
            return r1
        L_0x009e:
            if (r9 == 0) goto L_0x00ae
            boolean r8 = r2 instanceof j.a.p
            if (r8 != 0) goto L_0x00a5
            r2 = r0
        L_0x00a5:
            j.a.p r2 = (j.a.p) r2
            if (r2 == 0) goto L_0x00ab
            java.lang.Throwable r0 = r2.a
        L_0x00ab:
            r10.g(r0)
        L_0x00ae:
            j.a.h1 r8 = j.a.h1.b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.c1.n(boolean, boolean, i.o.b.l):j.a.i0");
    }

    public final CancellationException o() {
        Object E = E();
        if (E instanceof b) {
            Throwable th = (Throwable) ((b) E)._rootCause;
            if (th != null) {
                return S(th, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (E instanceof t0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (E instanceof p) {
            return S(((p) E).a, (String) null);
        } else {
            return new JobCancellationException(getClass().getSimpleName() + " has completed normally", (Throwable) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x00b9 A[EDGE_INSN: B:84:0x00b9->B:58:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(java.lang.Object r10) {
        /*
            r9 = this;
            j.a.t1.n r0 = j.a.d1.a
            boolean r1 = r9.C()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
        L_0x000b:
            java.lang.Object r0 = r9.E()
            boolean r1 = r0 instanceof j.a.t0
            if (r1 == 0) goto L_0x0033
            boolean r1 = r0 instanceof j.a.c1.b
            if (r1 == 0) goto L_0x0021
            r1 = r0
            j.a.c1$b r1 = (j.a.c1.b) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            j.a.p r1 = new j.a.p
            java.lang.Throwable r5 = r9.y(r10)
            r1.<init>(r5, r3, r2)
            java.lang.Object r0 = r9.T(r0, r1)
            j.a.t1.n r1 = j.a.d1.c
            if (r0 == r1) goto L_0x000b
            goto L_0x0035
        L_0x0033:
            j.a.t1.n r0 = j.a.d1.a
        L_0x0035:
            j.a.t1.n r1 = j.a.d1.b
            if (r0 != r1) goto L_0x003a
            return r4
        L_0x003a:
            j.a.t1.n r1 = j.a.d1.a
            if (r0 != r1) goto L_0x00ef
            r0 = 0
            r1 = r0
        L_0x0040:
            java.lang.Object r5 = r9.E()
            boolean r6 = r5 instanceof j.a.c1.b
            if (r6 == 0) goto L_0x0089
            monitor-enter(r5)
            r2 = r5
            j.a.c1$b r2 = (j.a.c1.b) r2     // Catch:{ all -> 0x0086 }
            boolean r2 = r2.g()     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0057
            j.a.t1.n r10 = j.a.d1.f4598d     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)
            goto L_0x00ee
        L_0x0057:
            r2 = r5
            j.a.c1$b r2 = (j.a.c1.b) r2     // Catch:{ all -> 0x0086 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0086 }
            if (r10 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x006f
        L_0x0062:
            if (r1 == 0) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            java.lang.Throwable r1 = r9.y(r10)     // Catch:{ all -> 0x0086 }
        L_0x0069:
            r10 = r5
            j.a.c1$b r10 = (j.a.c1.b) r10     // Catch:{ all -> 0x0086 }
            r10.b(r1)     // Catch:{ all -> 0x0086 }
        L_0x006f:
            r10 = r5
            j.a.c1$b r10 = (j.a.c1.b) r10     // Catch:{ all -> 0x0086 }
            java.lang.Object r10 = r10._rootCause     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ all -> 0x0086 }
            r1 = r2 ^ 1
            if (r1 == 0) goto L_0x007b
            r0 = r10
        L_0x007b:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00b9
            j.a.c1$b r5 = (j.a.c1.b) r5
            j.a.g1 r10 = r5.b
            r9.N(r10, r0)
            goto L_0x00b9
        L_0x0086:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L_0x0089:
            boolean r6 = r5 instanceof j.a.t0
            if (r6 == 0) goto L_0x00ec
            if (r1 == 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            java.lang.Throwable r1 = r9.y(r10)
        L_0x0094:
            r6 = r5
            j.a.t0 r6 = (j.a.t0) r6
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x00bc
            j.a.g1 r5 = r9.D(r6)
            if (r5 == 0) goto L_0x00b6
            j.a.c1$b r7 = new j.a.c1$b
            r7.<init>(r5, r3, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = b
            boolean r6 = r8.compareAndSet(r9, r6, r7)
            if (r6 != 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r9.N(r5, r1)
            r5 = 1
            goto L_0x00b7
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            if (r5 == 0) goto L_0x0040
        L_0x00b9:
            j.a.t1.n r10 = j.a.d1.a
            goto L_0x00ee
        L_0x00bc:
            j.a.p r6 = new j.a.p
            r6.<init>(r1, r3, r2)
            java.lang.Object r6 = r9.T(r5, r6)
            j.a.t1.n r7 = j.a.d1.a
            if (r6 == r7) goto L_0x00d1
            j.a.t1.n r5 = j.a.d1.c
            if (r6 != r5) goto L_0x00cf
            goto L_0x0040
        L_0x00cf:
            r0 = r6
            goto L_0x00ef
        L_0x00d1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Cannot happen in "
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x00ec:
            j.a.t1.n r10 = j.a.d1.f4598d
        L_0x00ee:
            r0 = r10
        L_0x00ef:
            j.a.t1.n r10 = j.a.d1.a
            if (r0 != r10) goto L_0x00f5
        L_0x00f3:
            r3 = 1
            goto L_0x0103
        L_0x00f5:
            j.a.t1.n r10 = j.a.d1.b
            if (r0 != r10) goto L_0x00fa
            goto L_0x00f3
        L_0x00fa:
            j.a.t1.n r10 = j.a.d1.f4598d
            if (r0 != r10) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            r9.m(r0)
            goto L_0x00f3
        L_0x0103:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.c1.p(java.lang.Object):boolean");
    }

    public i.m.f plus(i.m.f fVar) {
        return f.a.C0191a.d(this, fVar);
    }

    public void q(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(u(), (Throwable) null, this);
        }
        p(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (I()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        j jVar = (j) this._parentHandle;
        if (jVar == null || jVar == h1.b) {
            return z;
        }
        if (jVar.f(th) || z) {
            return true;
        }
        return false;
    }

    public final void s(j1 j1Var) {
        p(j1Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (b.compareAndSet(r6, r0, j.a.d1.f4601g) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (b.compareAndSet(r6, r0, ((j.a.s0) r0).b) == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:13:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean start() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6.E()
            boolean r1 = r0 instanceof j.a.k0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001e
            r1 = r0
            j.a.k0 r1 = (j.a.k0) r1
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = b
            j.a.k0 r5 = j.a.d1.f4601g
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0036
        L_0x001e:
            boolean r1 = r0 instanceof j.a.s0
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = b
            r5 = r0
            j.a.s0 r5 = (j.a.s0) r5
            j.a.g1 r5 = r5.b
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            r6.P()
            r2 = 1
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x003b
            goto L_0x0000
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.c1.start():boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(L() + MessageFormatter.DELIM_START + R(E()) + MessageFormatter.DELIM_STOP);
        sb.append('@');
        sb.append(g.c.b.b.f.E(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return p(th) && B();
    }

    public final void w(t0 t0Var, Object obj) {
        j jVar = (j) this._parentHandle;
        if (jVar != null) {
            jVar.b();
            this._parentHandle = h1.b;
        }
        CompletionHandlerException completionHandlerException = null;
        if (!(obj instanceof p)) {
            obj = null;
        }
        p pVar = (p) obj;
        Throwable th = pVar != null ? pVar.a : null;
        if (t0Var instanceof b1) {
            try {
                ((b1) t0Var).n(th);
            } catch (Throwable th2) {
                G(new CompletionHandlerException("Exception in completion handler " + t0Var + " for " + this, th2));
            }
        } else {
            g1 c2 = t0Var.c();
            if (c2 != null) {
                Object i2 = c2.i();
                Objects.requireNonNull(i2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                for (g gVar = (g) i2; !h.a(gVar, c2); gVar = gVar.j()) {
                    if (gVar instanceof b1) {
                        b1 b1Var = (b1) gVar;
                        try {
                            b1Var.n(th);
                        } catch (Throwable th3) {
                            if (completionHandlerException != null) {
                                g.c.b.b.f.c(completionHandlerException, th3);
                            } else {
                                completionHandlerException = new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (completionHandlerException != null) {
                    G(completionHandlerException);
                }
            }
        }
    }

    public final j x(l lVar) {
        i0 N = g.c.b.b.f.N(this, true, false, new k(this, lVar), 2, (Object) null);
        Objects.requireNonNull(N, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (j) N;
    }

    public final Throwable y(Object obj) {
        if (!(obj != null ? obj instanceof Throwable : true)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            return ((j1) obj).k();
        } else if (obj != null) {
            return (Throwable) obj;
        } else {
            return new JobCancellationException(u(), (Throwable) null, this);
        }
    }

    public final Object z(b bVar, Object obj) {
        Throwable A;
        Throwable th = null;
        p pVar = (p) (!(obj instanceof p) ? null : obj);
        if (pVar != null) {
            th = pVar.a;
        }
        synchronized (bVar) {
            bVar.e();
            List<Throwable> h2 = bVar.h(th);
            A = A(bVar, h2);
            if (A != null) {
                if (h2.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(h2.size()));
                    for (Throwable next : h2) {
                        if (next != A && next != A && !(next instanceof CancellationException) && newSetFromMap.add(next)) {
                            g.c.b.b.f.c(A, next);
                        }
                    }
                }
            }
        }
        if (!(A == null || A == th)) {
            obj = new p(A, false, 2);
        }
        if (A != null) {
            if (r(A) || F(A)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                p.b.compareAndSet((p) obj, 0, 1);
            }
        }
        O(obj);
        b.compareAndSet(this, bVar, obj instanceof t0 ? new u0((t0) obj) : obj);
        w(bVar, obj);
        return obj;
    }
}
