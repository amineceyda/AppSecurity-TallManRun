package g.d.a.l.t;

import g.d.a.l.a;
import g.d.a.l.l;
import g.d.a.l.s.d;
import g.d.a.l.t.g;
import g.d.a.l.u.n;
import java.io.File;
import java.util.List;

public class d implements g, d.a<Object> {
    public final List<l> b;
    public final h<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a f2457d;

    /* renamed from: e  reason: collision with root package name */
    public int f2458e = -1;

    /* renamed from: f  reason: collision with root package name */
    public l f2459f;

    /* renamed from: g  reason: collision with root package name */
    public List<n<File, ?>> f2460g;

    /* renamed from: h  reason: collision with root package name */
    public int f2461h;

    /* renamed from: i  reason: collision with root package name */
    public volatile n.a<?> f2462i;

    /* renamed from: j  reason: collision with root package name */
    public File f2463j;

    public d(h<?> hVar, g.a aVar) {
        List<l> a = hVar.a();
        this.b = a;
        this.c = hVar;
        this.f2457d = aVar;
    }

    public d(List<l> list, h<?> hVar, g.a aVar) {
        this.b = list;
        this.c = hVar;
        this.f2457d = aVar;
    }

    public void c(Exception exc) {
        this.f2457d.b(this.f2459f, exc, this.f2462i.c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.f2462i;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void d(Object obj) {
        this.f2457d.d(this.f2459f, obj, this.f2462i.c, a.DATA_DISK_CACHE, this.f2459f);
    }

    public boolean e() {
        while (true) {
            List<n<File, ?>> list = this.f2460g;
            if (list != null) {
                if (this.f2461h < list.size()) {
                    this.f2462i = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f2461h < this.f2460g.size())) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f2460g;
                        int i2 = this.f2461h;
                        this.f2461h = i2 + 1;
                        File file = this.f2463j;
                        h<?> hVar = this.c;
                        this.f2462i = list2.get(i2).a(file, hVar.f2466e, hVar.f2467f, hVar.f2470i);
                        if (this.f2462i != null && this.c.g(this.f2462i.c.a())) {
                            this.f2462i.c.f(this.c.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f2458e + 1;
            this.f2458e = i3;
            if (i3 >= this.b.size()) {
                return false;
            }
            l lVar = this.b.get(this.f2458e);
            h<?> hVar2 = this.c;
            File b2 = hVar2.b().b(new e(lVar, hVar2.n));
            this.f2463j = b2;
            if (b2 != null) {
                this.f2459f = lVar;
                this.f2460g = this.c.c.b.f(b2);
                this.f2461h = 0;
            }
        }
    }
}
