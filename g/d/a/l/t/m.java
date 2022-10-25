package g.d.a.l.t;

import com.bumptech.glide.load.engine.GlideException;
import g.d.a.l.l;
import g.d.a.l.t.i;
import g.d.a.l.t.q;
import g.d.a.p.f;
import g.d.a.p.g;
import g.d.a.r.k.a;
import g.d.a.r.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class m<R> implements i.a<R>, a.d {
    public static final c z = new c();
    public final e b = new e();
    public final g.d.a.r.k.d c = new d.b();

    /* renamed from: d  reason: collision with root package name */
    public final q.a f2505d;

    /* renamed from: e  reason: collision with root package name */
    public final e.e.i.c<m<?>> f2506e;

    /* renamed from: f  reason: collision with root package name */
    public final c f2507f;

    /* renamed from: g  reason: collision with root package name */
    public final n f2508g;

    /* renamed from: h  reason: collision with root package name */
    public final g.d.a.l.t.d0.a f2509h;

    /* renamed from: i  reason: collision with root package name */
    public final g.d.a.l.t.d0.a f2510i;

    /* renamed from: j  reason: collision with root package name */
    public final g.d.a.l.t.d0.a f2511j;

    /* renamed from: k  reason: collision with root package name */
    public final g.d.a.l.t.d0.a f2512k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f2513l = new AtomicInteger();

    /* renamed from: m  reason: collision with root package name */
    public l f2514m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public v<?> r;
    public g.d.a.l.a s;
    public boolean t;
    public GlideException u;
    public boolean v;
    public q<?> w;
    public i<R> x;
    public volatile boolean y;

    public class a implements Runnable {
        public final f b;

        public a(f fVar) {
            this.b = fVar;
        }

        public void run() {
            g gVar = (g) this.b;
            gVar.b.a();
            synchronized (gVar.c) {
                synchronized (m.this) {
                    if (m.this.b.b.contains(new d(this.b, g.d.a.r.e.b))) {
                        m mVar = m.this;
                        f fVar = this.b;
                        Objects.requireNonNull(mVar);
                        try {
                            ((g) fVar).o(mVar.u, 5);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.c();
                }
            }
        }
    }

    public class b implements Runnable {
        public final f b;

        public b(f fVar) {
            this.b = fVar;
        }

        public void run() {
            g gVar = (g) this.b;
            gVar.b.a();
            synchronized (gVar.c) {
                synchronized (m.this) {
                    if (m.this.b.b.contains(new d(this.b, g.d.a.r.e.b))) {
                        m.this.w.a();
                        m mVar = m.this;
                        f fVar = this.b;
                        Objects.requireNonNull(mVar);
                        try {
                            ((g) fVar).p(mVar.w, mVar.s);
                            m.this.h(this.b);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.c();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {
        public final f a;
        public final Executor b;

        public d(f fVar, Executor executor) {
            this.a = fVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final List<d> b = new ArrayList(2);

        public boolean isEmpty() {
            return this.b.isEmpty();
        }

        public Iterator<d> iterator() {
            return this.b.iterator();
        }
    }

    public m(g.d.a.l.t.d0.a aVar, g.d.a.l.t.d0.a aVar2, g.d.a.l.t.d0.a aVar3, g.d.a.l.t.d0.a aVar4, n nVar, q.a aVar5, e.e.i.c<m<?>> cVar) {
        c cVar2 = z;
        this.f2509h = aVar;
        this.f2510i = aVar2;
        this.f2511j = aVar3;
        this.f2512k = aVar4;
        this.f2508g = nVar;
        this.f2505d = aVar5;
        this.f2506e = cVar;
        this.f2507f = cVar2;
    }

    public synchronized void a(f fVar, Executor executor) {
        Runnable runnable;
        this.c.a();
        this.b.b.add(new d(fVar, executor));
        boolean z2 = true;
        if (this.t) {
            d(1);
            runnable = new b(fVar);
        } else if (this.v) {
            d(1);
            runnable = new a(fVar);
        } else {
            if (this.y) {
                z2 = false;
            }
            e.e.d.l.a.i(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(runnable);
    }

    public void b() {
        if (!f()) {
            this.y = true;
            i<R> iVar = this.x;
            iVar.S = true;
            g gVar = iVar.Q;
            if (gVar != null) {
                gVar.cancel();
            }
            n nVar = this.f2508g;
            l lVar = this.f2514m;
            l lVar2 = (l) nVar;
            synchronized (lVar2) {
                s sVar = lVar2.a;
                Objects.requireNonNull(sVar);
                Map<l, m<?>> a2 = sVar.a(this.q);
                if (equals(a2.get(lVar))) {
                    a2.remove(lVar);
                }
            }
        }
    }

    public void c() {
        q<?> qVar;
        synchronized (this) {
            this.c.a();
            e.e.d.l.a.i(f(), "Not yet complete!");
            int decrementAndGet = this.f2513l.decrementAndGet();
            e.e.d.l.a.i(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.w;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public synchronized void d(int i2) {
        q<?> qVar;
        e.e.d.l.a.i(f(), "Not yet complete!");
        if (this.f2513l.getAndAdd(i2) == 0 && (qVar = this.w) != null) {
            qVar.a();
        }
    }

    public g.d.a.r.k.d e() {
        return this.c;
    }

    public final boolean f() {
        return this.v || this.t || this.y;
    }

    public final synchronized void g() {
        boolean a2;
        if (this.f2514m != null) {
            this.b.b.clear();
            this.f2514m = null;
            this.w = null;
            this.r = null;
            this.v = false;
            this.y = false;
            this.t = false;
            i<R> iVar = this.x;
            i.e eVar = iVar.f2479h;
            synchronized (eVar) {
                eVar.a = true;
                a2 = eVar.a(false);
            }
            if (a2) {
                iVar.o();
            }
            this.x = null;
            this.u = null;
            this.s = null;
            this.f2506e.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void h(f fVar) {
        boolean z2;
        this.c.a();
        this.b.b.remove(new d(fVar, g.d.a.r.e.b));
        if (this.b.isEmpty()) {
            b();
            if (!this.t) {
                if (!this.v) {
                    z2 = false;
                    if (z2 && this.f2513l.get() == 0) {
                        g();
                    }
                }
            }
            z2 = true;
            g();
        }
    }

    public void i(i<?> iVar) {
        (this.o ? this.f2511j : this.p ? this.f2512k : this.f2510i).b.execute(iVar);
    }
}
