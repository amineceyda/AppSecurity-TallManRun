package g.d.a.l.t;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import g.d.a.l.l;
import g.d.a.l.m;
import g.d.a.l.n;
import g.d.a.l.q;
import g.d.a.l.s.e;
import g.d.a.l.t.g;
import g.d.a.l.t.j;
import g.d.a.l.t.l;
import g.d.a.l.t.m;
import g.d.a.l.t.q;
import g.d.a.r.k.a;
import g.d.a.r.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public Object A;
    public g.d.a.l.a B;
    public g.d.a.l.s.d<?> C;
    public volatile g Q;
    public volatile boolean R;
    public volatile boolean S;
    public final h<R> b = new h<>();
    public final List<Throwable> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final g.d.a.r.k.d f2475d = new d.b();

    /* renamed from: e  reason: collision with root package name */
    public final d f2476e;

    /* renamed from: f  reason: collision with root package name */
    public final e.e.i.c<i<?>> f2477f;

    /* renamed from: g  reason: collision with root package name */
    public final c<?> f2478g = new c<>();

    /* renamed from: h  reason: collision with root package name */
    public final e f2479h = new e();

    /* renamed from: i  reason: collision with root package name */
    public g.d.a.d f2480i;

    /* renamed from: j  reason: collision with root package name */
    public l f2481j;

    /* renamed from: k  reason: collision with root package name */
    public g.d.a.e f2482k;

    /* renamed from: l  reason: collision with root package name */
    public o f2483l;

    /* renamed from: m  reason: collision with root package name */
    public int f2484m;
    public int n;
    public k o;
    public n p;
    public a<R> q;
    public int r;
    public g s;
    public f t;
    public long u;
    public boolean v;
    public Object w;
    public Thread x;
    public l y;
    public l z;

    public interface a<R> {
    }

    public final class b<Z> implements j.a<Z> {
        public final g.d.a.l.a a;

        public b(g.d.a.l.a aVar) {
            this.a = aVar;
        }
    }

    public static class c<Z> {
        public l a;
        public q<Z> b;
        public u<Z> c;
    }

    public interface d {
    }

    public static class e {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }
    }

    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, e.e.i.c<i<?>> cVar) {
        this.f2476e = dVar;
        this.f2477f = cVar;
    }

    public void a() {
        this.t = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.q).i(this);
    }

    public void b(l lVar, Exception exc, g.d.a.l.s.d<?> dVar, g.d.a.l.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.i(lVar, aVar, dVar.a());
        this.c.add(glideException);
        if (Thread.currentThread() != this.x) {
            this.t = f.SWITCH_TO_SOURCE_SERVICE;
            ((m) this.q).i(this);
            return;
        }
        p();
    }

    public int compareTo(Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f2482k.ordinal() - iVar.f2482k.ordinal();
        return ordinal == 0 ? this.r - iVar.r : ordinal;
    }

    public void d(l lVar, Object obj, g.d.a.l.s.d<?> dVar, g.d.a.l.a aVar, l lVar2) {
        this.y = lVar;
        this.A = obj;
        this.C = dVar;
        this.B = aVar;
        this.z = lVar2;
        if (Thread.currentThread() != this.x) {
            this.t = f.DECODE_DATA;
            ((m) this.q).i(this);
            return;
        }
        h();
    }

    public g.d.a.r.k.d e() {
        return this.f2475d;
    }

    public final <Data> v<R> f(g.d.a.l.s.d<?> dVar, Data data, g.d.a.l.a aVar) throws GlideException {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i2 = g.d.a.r.f.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            v<R> g2 = g(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m("Decoded result " + g2, elapsedRealtimeNanos, (String) null);
            }
            return g2;
        } finally {
            dVar.b();
        }
    }

    public final <Data> v<R> g(Data data, g.d.a.l.a aVar) throws GlideException {
        g.d.a.l.s.e<?> b2;
        t<Data, ?, R> d2 = this.b.d(data.getClass());
        n nVar = this.p;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = aVar == g.d.a.l.a.RESOURCE_DISK_CACHE || this.b.r;
            m mVar = g.d.a.l.v.c.l.f2587i;
            Boolean bool = (Boolean) nVar.c(mVar);
            if (bool == null || (bool.booleanValue() && !z2)) {
                nVar = new n();
                nVar.d(this.p);
                nVar.b.put(mVar, Boolean.valueOf(z2));
            }
        }
        n nVar2 = nVar;
        g.d.a.l.s.f fVar = this.f2480i.b.f347e;
        synchronized (fVar) {
            e.a<?> aVar2 = fVar.a.get(data.getClass());
            if (aVar2 == null) {
                Iterator<e.a<?>> it = fVar.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(data.getClass())) {
                        aVar2 = next;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = g.d.a.l.s.f.b;
            }
            b2 = aVar2.b(data);
        }
        try {
            return d2.a(b2, nVar2, this.f2484m, this.n, new b(aVar));
        } finally {
            b2.b();
        }
    }

    public final void h() {
        v<R> vVar;
        c<?> cVar;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.u;
            StringBuilder i2 = g.a.a.a.a.i("data: ");
            i2.append(this.A);
            i2.append(", cache key: ");
            i2.append(this.y);
            i2.append(", fetcher: ");
            i2.append(this.C);
            m("Retrieved data", j2, i2.toString());
        }
        u<R> uVar = null;
        try {
            vVar = f(this.C, this.A, this.B);
        } catch (GlideException e2) {
            e2.h(this.z, this.B);
            this.c.add(e2);
            vVar = null;
        }
        if (vVar != null) {
            g.d.a.l.a aVar = this.B;
            if (vVar instanceof r) {
                ((r) vVar).a();
            }
            if (this.f2478g.c != null) {
                uVar = u.a(vVar);
                vVar = uVar;
            }
            r();
            m mVar = (m) this.q;
            synchronized (mVar) {
                mVar.r = vVar;
                mVar.s = aVar;
            }
            synchronized (mVar) {
                mVar.c.a();
                if (mVar.y) {
                    mVar.r.d();
                    mVar.g();
                } else if (mVar.b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!mVar.t) {
                    m.c cVar2 = mVar.f2507f;
                    v<?> vVar2 = mVar.r;
                    boolean z2 = mVar.n;
                    l lVar = mVar.f2514m;
                    q.a aVar2 = mVar.f2505d;
                    Objects.requireNonNull(cVar2);
                    mVar.w = new q(vVar2, z2, true, lVar, aVar2);
                    mVar.t = true;
                    m.e eVar = mVar.b;
                    Objects.requireNonNull(eVar);
                    ArrayList arrayList = new ArrayList(eVar.b);
                    mVar.d(arrayList.size() + 1);
                    l lVar2 = mVar.f2514m;
                    q<?> qVar = mVar.w;
                    ((l) mVar.f2508g).e(mVar, lVar2, qVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m.d dVar = (m.d) it.next();
                        dVar.b.execute(new m.b(dVar.a));
                    }
                    mVar.c();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            this.s = g.ENCODE;
            try {
                cVar = this.f2478g;
                if (cVar.c != null) {
                    ((l.c) this.f2476e).a().a(cVar.a, new f(cVar.b, cVar.c, this.p));
                    cVar.c.f();
                }
                if (uVar != null) {
                    uVar.f();
                }
                e eVar2 = this.f2479h;
                synchronized (eVar2) {
                    eVar2.b = true;
                    a2 = eVar2.a(false);
                }
                if (a2) {
                    o();
                }
            } catch (Throwable th) {
                if (uVar != null) {
                    uVar.f();
                }
                throw th;
            }
        } else {
            p();
        }
    }

    public final g i() {
        int ordinal = this.s.ordinal();
        if (ordinal == 1) {
            return new w(this.b, this);
        }
        if (ordinal == 2) {
            return new d(this.b, this);
        }
        if (ordinal == 3) {
            return new a0(this.b, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder i2 = g.a.a.a.a.i("Unrecognized stage: ");
        i2.append(this.s);
        throw new IllegalStateException(i2.toString());
    }

    public final g l(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.o.b() ? gVar2 : l(gVar2);
        }
        if (ordinal == 1) {
            return this.o.a() ? gVar3 : l(gVar3);
        }
        if (ordinal == 2) {
            return this.v ? gVar4 : g.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    public final void m(String str, long j2, String str2) {
        StringBuilder l2 = g.a.a.a.a.l(str, " in ");
        l2.append(g.d.a.r.f.a(j2));
        l2.append(", load key: ");
        l2.append(this.f2483l);
        l2.append(str2 != null ? g.a.a.a.a.w(", ", str2) : "");
        l2.append(", thread: ");
        l2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", l2.toString());
    }

    public final void n() {
        boolean a2;
        r();
        GlideException glideException = new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.c));
        m mVar = (m) this.q;
        synchronized (mVar) {
            mVar.u = glideException;
        }
        synchronized (mVar) {
            mVar.c.a();
            if (mVar.y) {
                mVar.g();
            } else if (mVar.b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!mVar.v) {
                mVar.v = true;
                g.d.a.l.l lVar = mVar.f2514m;
                m.e eVar = mVar.b;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.b);
                mVar.d(arrayList.size() + 1);
                ((l) mVar.f2508g).e(mVar, lVar, (q<?>) null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.d dVar = (m.d) it.next();
                    dVar.b.execute(new m.a(dVar.a));
                }
                mVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar2 = this.f2479h;
        synchronized (eVar2) {
            eVar2.c = true;
            a2 = eVar2.a(false);
        }
        if (a2) {
            o();
        }
    }

    public final void o() {
        e eVar = this.f2479h;
        synchronized (eVar) {
            eVar.b = false;
            eVar.a = false;
            eVar.c = false;
        }
        c<?> cVar = this.f2478g;
        cVar.a = null;
        cVar.b = null;
        cVar.c = null;
        h<R> hVar = this.b;
        hVar.c = null;
        hVar.f2465d = null;
        hVar.n = null;
        hVar.f2468g = null;
        hVar.f2472k = null;
        hVar.f2470i = null;
        hVar.o = null;
        hVar.f2471j = null;
        hVar.p = null;
        hVar.a.clear();
        hVar.f2473l = false;
        hVar.b.clear();
        hVar.f2474m = false;
        this.R = false;
        this.f2480i = null;
        this.f2481j = null;
        this.p = null;
        this.f2482k = null;
        this.f2483l = null;
        this.q = null;
        this.s = null;
        this.Q = null;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.u = 0;
        this.S = false;
        this.w = null;
        this.c.clear();
        this.f2477f.a(this);
    }

    public final void p() {
        this.x = Thread.currentThread();
        int i2 = g.d.a.r.f.b;
        this.u = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        while (!this.S && this.Q != null && !(z2 = this.Q.e())) {
            this.s = l(this.s);
            this.Q = i();
            if (this.s == g.SOURCE) {
                this.t = f.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.q).i(this);
                return;
            }
        }
        if ((this.s == g.FINISHED || this.S) && !z2) {
            n();
        }
    }

    public final void q() {
        int ordinal = this.t.ordinal();
        if (ordinal == 0) {
            this.s = l(g.INITIALIZE);
            this.Q = i();
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                h();
                return;
            }
            StringBuilder i2 = g.a.a.a.a.i("Unrecognized run reason: ");
            i2.append(this.t);
            throw new IllegalStateException(i2.toString());
        }
        p();
    }

    public final void r() {
        Throwable th;
        this.f2475d.a();
        if (this.R) {
            if (this.c.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.c;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.R = true;
    }

    public void run() {
        g.d.a.l.s.d<?> dVar = this.C;
        try {
            if (this.S) {
                n();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            q();
            if (dVar != null) {
                dVar.b();
            }
        } catch (c e2) {
            throw e2;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }
}
