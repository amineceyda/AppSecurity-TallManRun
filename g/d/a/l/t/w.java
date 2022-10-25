package g.d.a.l.t;

import com.bumptech.glide.Registry;
import g.d.a.l.a;
import g.d.a.l.l;
import g.d.a.l.r;
import g.d.a.l.s.d;
import g.d.a.l.t.g;
import g.d.a.l.u.n;
import g.d.a.l.u.p;
import g.d.a.r.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class w implements g, d.a<Object> {
    public final g.a b;
    public final h<?> c;

    /* renamed from: d  reason: collision with root package name */
    public int f2530d;

    /* renamed from: e  reason: collision with root package name */
    public int f2531e = -1;

    /* renamed from: f  reason: collision with root package name */
    public l f2532f;

    /* renamed from: g  reason: collision with root package name */
    public List<n<File, ?>> f2533g;

    /* renamed from: h  reason: collision with root package name */
    public int f2534h;

    /* renamed from: i  reason: collision with root package name */
    public volatile n.a<?> f2535i;

    /* renamed from: j  reason: collision with root package name */
    public File f2536j;

    /* renamed from: k  reason: collision with root package name */
    public x f2537k;

    public w(h<?> hVar, g.a aVar) {
        this.c = hVar;
        this.b = aVar;
    }

    public void c(Exception exc) {
        this.b.b(this.f2537k, exc, this.f2535i.c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.f2535i;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void d(Object obj) {
        this.b.d(this.f2532f, obj, this.f2535i.c, a.RESOURCE_DISK_CACHE, this.f2537k);
    }

    public boolean e() {
        List orDefault;
        List<Class<?>> e2;
        List<l> a = this.c.a();
        if (a.isEmpty()) {
            return false;
        }
        h<?> hVar = this.c;
        Registry registry = hVar.c.b;
        Class<?> cls = hVar.f2465d.getClass();
        Class<?> cls2 = hVar.f2468g;
        Class<Transcode> cls3 = hVar.f2472k;
        g.d.a.o.d dVar = registry.f350h;
        i andSet = dVar.a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.b = cls2;
            andSet.c = cls3;
        }
        synchronized (dVar.b) {
            orDefault = dVar.b.getOrDefault(andSet, null);
        }
        dVar.a.set(andSet);
        ArrayList arrayList = orDefault;
        if (orDefault == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = registry.a;
            synchronized (pVar) {
                e2 = pVar.a.e(cls);
            }
            Iterator it = ((ArrayList) e2).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) registry.c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) registry.f348f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            g.d.a.o.d dVar2 = registry.f350h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.b) {
                dVar2.b.put(new i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<n<File, ?>> list = this.f2533g;
                if (list != null) {
                    if (this.f2534h < list.size()) {
                        this.f2535i = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f2534h < this.f2533g.size())) {
                                break;
                            }
                            List<n<File, ?>> list2 = this.f2533g;
                            int i2 = this.f2534h;
                            this.f2534h = i2 + 1;
                            File file = this.f2536j;
                            h<?> hVar2 = this.c;
                            this.f2535i = list2.get(i2).a(file, hVar2.f2466e, hVar2.f2467f, hVar2.f2470i);
                            if (this.f2535i != null && this.c.g(this.f2535i.c.a())) {
                                this.f2535i.c.f(this.c.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i3 = this.f2531e + 1;
                this.f2531e = i3;
                if (i3 >= arrayList.size()) {
                    int i4 = this.f2530d + 1;
                    this.f2530d = i4;
                    if (i4 >= a.size()) {
                        return false;
                    }
                    this.f2531e = 0;
                }
                l lVar = a.get(this.f2530d);
                Class cls5 = (Class) arrayList.get(this.f2531e);
                r<Z> f2 = this.c.f(cls5);
                h<?> hVar3 = this.c;
                this.f2537k = new x(hVar3.c.a, lVar, hVar3.n, hVar3.f2466e, hVar3.f2467f, f2, cls5, hVar3.f2470i);
                File b2 = hVar3.b().b(this.f2537k);
                this.f2536j = b2;
                if (b2 != null) {
                    this.f2532f = lVar;
                    this.f2533g = this.c.c.b.f(b2);
                    this.f2534h = 0;
                }
            }
        } else if (File.class.equals(this.c.f2472k)) {
            return false;
        } else {
            StringBuilder i5 = g.a.a.a.a.i("Failed to find any load path from ");
            i5.append(this.c.f2465d.getClass());
            i5.append(" to ");
            i5.append(this.c.f2472k);
            throw new IllegalStateException(i5.toString());
        }
    }
}
