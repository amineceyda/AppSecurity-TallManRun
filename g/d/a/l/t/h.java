package g.d.a.l.t;

import com.bumptech.glide.Registry;
import g.d.a.d;
import g.d.a.e;
import g.d.a.l.l;
import g.d.a.l.r;
import g.d.a.l.t.c0.a;
import g.d.a.l.t.i;
import g.d.a.l.t.l;
import g.d.a.l.u.n;
import g.d.a.l.v.b;
import g.d.a.l.v.h.f;
import g.d.a.l.v.h.g;
import g.d.a.o.a;
import g.d.a.o.c;
import g.d.a.o.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class h<Transcode> {
    public final List<n.a<?>> a = new ArrayList();
    public final List<l> b = new ArrayList();
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2465d;

    /* renamed from: e  reason: collision with root package name */
    public int f2466e;

    /* renamed from: f  reason: collision with root package name */
    public int f2467f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f2468g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f2469h;

    /* renamed from: i  reason: collision with root package name */
    public g.d.a.l.n f2470i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, r<?>> f2471j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f2472k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2473l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2474m;
    public l n;
    public e o;
    public k p;
    public boolean q;
    public boolean r;

    public List<l> a() {
        if (!this.f2474m) {
            this.f2474m = true;
            this.b.clear();
            List<n.a<?>> c2 = c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = c2.get(i2);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.b.size(); i3++) {
                    if (!this.b.contains(aVar.b.get(i3))) {
                        this.b.add(aVar.b.get(i3));
                    }
                }
            }
        }
        return this.b;
    }

    public a b() {
        return ((l.c) this.f2469h).a();
    }

    public List<n.a<?>> c() {
        if (!this.f2473l) {
            this.f2473l = true;
            this.a.clear();
            List f2 = this.c.b.f(this.f2465d);
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a a2 = ((n) f2.get(i2)).a(this.f2465d, this.f2466e, this.f2467f, this.f2470i);
                if (a2 != null) {
                    this.a.add(a2);
                }
            }
        }
        return this.a;
    }

    public <Data> t<Data, ?, Transcode> d(Class<Data> cls) {
        t<Data, ?, Transcode> orDefault;
        ArrayList arrayList;
        g.d.a.l.v.h.e eVar;
        g.d.a.l.v.h.e eVar2;
        Class<Data> cls2 = cls;
        Registry registry = this.c.b;
        Class<?> cls3 = this.f2468g;
        Class<Transcode> cls4 = this.f2472k;
        c cVar = registry.f351i;
        g.d.a.r.i andSet = cVar.b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new g.d.a.r.i();
        }
        andSet.a = cls2;
        andSet.b = cls3;
        andSet.c = cls4;
        synchronized (cVar.a) {
            orDefault = cVar.a.getOrDefault(andSet, null);
        }
        cVar.b.set(andSet);
        Objects.requireNonNull(registry.f351i);
        if (c.c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) registry.c.b(cls2, cls3)).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = ((ArrayList) registry.f348f.a(cls5, cls4)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    g.d.a.o.e eVar3 = registry.c;
                    synchronized (eVar3) {
                        arrayList = new ArrayList();
                        for (String str : eVar3.a) {
                            List<e.a> list = eVar3.b.get(str);
                            if (list != null) {
                                for (e.a aVar : list) {
                                    if (aVar.a(cls2, cls5)) {
                                        arrayList.add(aVar.c);
                                    }
                                }
                            }
                        }
                    }
                    f fVar = registry.f348f;
                    synchronized (fVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            eVar = g.a;
                        } else {
                            for (f.a next : fVar.a) {
                                if (next.a(cls5, cls6)) {
                                    eVar = next.c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        eVar2 = eVar;
                    }
                    j jVar = r2;
                    j jVar2 = new j(cls, cls5, cls6, arrayList, eVar2, registry.f352j);
                    arrayList2.add(jVar);
                }
            }
        }
        t<Data, ?, Transcode> tVar = arrayList2.isEmpty() ? null : new t<>(cls, cls3, cls4, arrayList2, registry.f352j);
        c cVar2 = registry.f351i;
        synchronized (cVar2.a) {
            cVar2.a.put(new g.d.a.r.i(cls2, cls3, cls4), tVar != null ? tVar : c.c);
        }
        return tVar;
    }

    public <X> g.d.a.l.d<X> e(X x) throws Registry.NoSourceEncoderAvailableException {
        g.d.a.l.d<T> dVar;
        g.d.a.o.a aVar = this.c.b.b;
        Class<?> cls = x.getClass();
        synchronized (aVar) {
            Iterator<a.C0097a<?>> it = aVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0097a next = it.next();
                if (next.a.isAssignableFrom(cls)) {
                    dVar = next.b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(x.getClass());
    }

    public <Z> r<Z> f(Class<Z> cls) {
        r<Z> rVar = this.f2471j.get(cls);
        if (rVar == null) {
            Iterator<Map.Entry<Class<?>, r<?>>> it = this.f2471j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    rVar = (r) next.getValue();
                    break;
                }
            }
        }
        if (rVar != null) {
            return rVar;
        }
        if (!this.f2471j.isEmpty() || !this.q) {
            return (b) b.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
