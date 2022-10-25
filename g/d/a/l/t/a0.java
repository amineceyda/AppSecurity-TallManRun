package g.d.a.l.t;

import android.os.SystemClock;
import android.util.Log;
import g.d.a.l.a;
import g.d.a.l.l;
import g.d.a.l.s.d;
import g.d.a.l.t.g;
import g.d.a.l.u.n;
import g.d.a.r.f;
import java.util.Collections;
import java.util.List;

public class a0 implements g, g.a {
    public final h<?> b;
    public final g.a c;

    /* renamed from: d  reason: collision with root package name */
    public int f2430d;

    /* renamed from: e  reason: collision with root package name */
    public d f2431e;

    /* renamed from: f  reason: collision with root package name */
    public Object f2432f;

    /* renamed from: g  reason: collision with root package name */
    public volatile n.a<?> f2433g;

    /* renamed from: h  reason: collision with root package name */
    public e f2434h;

    public a0(h<?> hVar, g.a aVar) {
        this.b = hVar;
        this.c = aVar;
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void b(l lVar, Exception exc, d<?> dVar, a aVar) {
        this.c.b(lVar, exc, dVar, this.f2433g.c.e());
    }

    public void cancel() {
        n.a<?> aVar = this.f2433g;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void d(l lVar, Object obj, d<?> dVar, a aVar, l lVar2) {
        this.c.d(lVar, obj, dVar, this.f2433g.c.e(), lVar);
    }

    /* JADX INFO: finally extract failed */
    public boolean e() {
        Object obj = this.f2432f;
        if (obj != null) {
            this.f2432f = null;
            int i2 = f.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                g.d.a.l.d<X> e2 = this.b.e(obj);
                f fVar = new f(e2, obj, this.b.f2470i);
                l lVar = this.f2433g.a;
                h<?> hVar = this.b;
                this.f2434h = new e(lVar, hVar.n);
                hVar.b().a(this.f2434h, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f2434h + ", data: " + obj + ", encoder: " + e2 + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f2433g.c.b();
                this.f2431e = new d(Collections.singletonList(this.f2433g.a), this.b, this);
            } catch (Throwable th) {
                this.f2433g.c.b();
                throw th;
            }
        }
        d dVar = this.f2431e;
        if (dVar != null && dVar.e()) {
            return true;
        }
        this.f2431e = null;
        this.f2433g = null;
        boolean z = false;
        while (!z) {
            if (!(this.f2430d < this.b.c().size())) {
                break;
            }
            List<n.a<?>> c2 = this.b.c();
            int i3 = this.f2430d;
            this.f2430d = i3 + 1;
            this.f2433g = c2.get(i3);
            if (this.f2433g != null && (this.b.p.c(this.f2433g.c.e()) || this.b.g(this.f2433g.c.a()))) {
                this.f2433g.c.f(this.b.o, new z(this, this.f2433g));
                z = true;
            }
        }
        return z;
    }
}
