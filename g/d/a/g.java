package g.d.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import g.d.a.c;
import g.d.a.l.t.k;
import g.d.a.m.c;
import g.d.a.m.f;
import g.d.a.m.h;
import g.d.a.m.i;
import g.d.a.m.j;
import g.d.a.m.m;
import g.d.a.m.n;
import g.d.a.m.o;
import g.d.a.p.d;
import g.d.a.p.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements ComponentCallbacks2, i {

    /* renamed from: m  reason: collision with root package name */
    public static final e f2344m;
    public final b b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final h f2345d;

    /* renamed from: e  reason: collision with root package name */
    public final n f2346e;

    /* renamed from: f  reason: collision with root package name */
    public final m f2347f;

    /* renamed from: g  reason: collision with root package name */
    public final o f2348g = new o();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f2349h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f2350i;

    /* renamed from: j  reason: collision with root package name */
    public final c f2351j;

    /* renamed from: k  reason: collision with root package name */
    public final CopyOnWriteArrayList<d<Object>> f2352k;

    /* renamed from: l  reason: collision with root package name */
    public e f2353l;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            g gVar = g.this;
            gVar.f2345d.a(gVar);
        }
    }

    public class b implements c.a {
        public final n a;

        public b(n nVar) {
            this.a = nVar;
        }
    }

    static {
        e eVar = (e) new e().c(Bitmap.class);
        eVar.u = true;
        f2344m = eVar;
        ((e) new e().c(g.d.a.l.v.g.c.class)).u = true;
        e eVar2 = (e) ((e) ((e) new e().d(k.c)).j(e.LOW)).n(true);
    }

    public g(b bVar, h hVar, m mVar, Context context) {
        e eVar;
        n nVar = new n();
        g.d.a.m.d dVar = bVar.f2321h;
        a aVar = new a();
        this.f2349h = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2350i = handler;
        this.b = bVar;
        this.f2345d = hVar;
        this.f2347f = mVar;
        this.f2346e = nVar;
        this.c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(nVar);
        Objects.requireNonNull((f) dVar);
        boolean z = e.e.c.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        c eVar2 = z ? new g.d.a.m.e(applicationContext, bVar2) : new j();
        this.f2351j = eVar2;
        if (g.d.a.r.j.g()) {
            handler.post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(eVar2);
        this.f2352k = new CopyOnWriteArrayList<>(bVar.f2317d.f2335e);
        d dVar2 = bVar.f2317d;
        synchronized (dVar2) {
            if (dVar2.f2340j == null) {
                Objects.requireNonNull((c.a) dVar2.f2334d);
                e eVar3 = new e();
                eVar3.u = true;
                dVar2.f2340j = eVar3;
            }
            eVar = dVar2.f2340j;
        }
        synchronized (this) {
            e eVar4 = (e) eVar.clone();
            if (eVar4.u) {
                if (!eVar4.w) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            eVar4.w = true;
            eVar4.u = true;
            this.f2353l = eVar4;
        }
        synchronized (bVar.f2322i) {
            if (!bVar.f2322i.contains(this)) {
                bVar.f2322i.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public synchronized void a() {
        n();
        this.f2348g.a();
    }

    public synchronized void e() {
        m();
        this.f2348g.e();
    }

    public synchronized void k() {
        this.f2348g.k();
        for (T l2 : g.d.a.r.j.e(this.f2348g.b)) {
            l(l2);
        }
        this.f2348g.b.clear();
        n nVar = this.f2346e;
        Iterator it = ((ArrayList) g.d.a.r.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            nVar.a((g.d.a.p.b) it.next());
        }
        nVar.b.clear();
        this.f2345d.b(this);
        this.f2345d.b(this.f2351j);
        this.f2350i.removeCallbacks(this.f2349h);
        b bVar = this.b;
        synchronized (bVar.f2322i) {
            if (bVar.f2322i.contains(this)) {
                bVar.f2322i.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void l(g.d.a.p.i.h<?> hVar) {
        boolean z;
        if (hVar != null) {
            boolean o = o(hVar);
            g.d.a.p.b g2 = hVar.g();
            if (!o) {
                b bVar = this.b;
                synchronized (bVar.f2322i) {
                    Iterator<g> it = bVar.f2322i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().o(hVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z && g2 != null) {
                    hVar.j((g.d.a.p.b) null);
                    g2.clear();
                }
            }
        }
    }

    public synchronized void m() {
        n nVar = this.f2346e;
        nVar.c = true;
        Iterator it = ((ArrayList) g.d.a.r.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            g.d.a.p.b bVar = (g.d.a.p.b) it.next();
            if (bVar.isRunning()) {
                bVar.b();
                nVar.b.add(bVar);
            }
        }
    }

    public synchronized void n() {
        n nVar = this.f2346e;
        nVar.c = false;
        Iterator it = ((ArrayList) g.d.a.r.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            g.d.a.p.b bVar = (g.d.a.p.b) it.next();
            if (!bVar.k() && !bVar.isRunning()) {
                bVar.i();
            }
        }
        nVar.b.clear();
    }

    public synchronized boolean o(g.d.a.p.i.h<?> hVar) {
        g.d.a.p.b g2 = hVar.g();
        if (g2 == null) {
            return true;
        }
        if (!this.f2346e.a(g2)) {
            return false;
        }
        this.f2348g.b.remove(hVar);
        hVar.j((g.d.a.p.b) null);
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i2) {
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2346e + ", treeNode=" + this.f2347f + "}";
    }
}
