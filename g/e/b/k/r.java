package g.e.b.k;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import g.e.a.b.b.h.e;
import g.e.b.o.c;
import g.e.b.o.d;
import g.e.b.q.a;
import g.e.b.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class r extends m implements g.e.b.m.a {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f3467g = 0;
    public final Map<n<?>, b<?>> a = new HashMap();
    public final Map<Class<?>, b<?>> b = new HashMap();
    public final Map<Class<?>, y<?>> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final List<b<q>> f3468d;

    /* renamed from: e  reason: collision with root package name */
    public final w f3469e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Boolean> f3470f = new AtomicReference<>();

    public r(Executor executor, Iterable iterable, Collection collection, a aVar) {
        w wVar = new w(executor);
        this.f3469e = wVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.c(wVar, w.class, d.class, c.class));
        arrayList.add(n.c(this, g.e.b.m.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.f3468d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    q qVar = (q) ((b) it2.next()).get();
                    if (qVar != null) {
                        arrayList.addAll(qVar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.a.isEmpty()) {
                e.g(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                e.g(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                n nVar2 = (n) it3.next();
                this.a.put(nVar2, new x(new d(this, nVar2)));
            }
            arrayList3.addAll(h(arrayList));
            arrayList3.addAll(i());
            g();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f3470f.get();
        if (bool != null) {
            f(this.a, bool.booleanValue());
        }
    }

    public synchronized <T> b<T> c(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    public synchronized <T> b<Set<T>> d(Class<T> cls) {
        y yVar = this.c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return i.a;
    }

    public <T> g.e.b.q.a<T> e(Class<T> cls) {
        b<T> c2 = c(cls);
        if (c2 == null) {
            return new z(k.a, j.a);
        }
        if (c2 instanceof z) {
            return (z) c2;
        }
        return new z((a.C0124a) null, c2);
    }

    public final void f(Map<n<?>, b<?>> map, boolean z) {
        Queue<g.e.b.o.a<?>> queue;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            b bVar = (b) next.getValue();
            int i2 = ((n) next.getKey()).c;
            boolean z2 = false;
            if (!(i2 == 1)) {
                if (i2 == 2) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                    }
                }
            }
            bVar.get();
        }
        w wVar = this.f3469e;
        synchronized (wVar) {
            queue = wVar.b;
            if (queue != null) {
                wVar.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (g.e.b.o.a aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (wVar) {
                    Queue<g.e.b.o.a<?>> queue2 = wVar.b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (wVar) {
                            Map map2 = wVar.a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new h(entry, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        for (n next : this.a.keySet()) {
            Iterator<v> it = next.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    v next2 = it.next();
                    if (next2.a() && !this.c.containsKey(next2.a)) {
                        this.c.put(next2.a, new y(Collections.emptySet()));
                    } else if (this.b.containsKey(next2.a)) {
                        continue;
                    } else {
                        if (next2.b == 1) {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a}));
                        } else if (!next2.a()) {
                            this.b.put(next2.a, new z(k.a, j.a));
                        }
                    }
                }
            }
        }
    }

    public final List<Runnable> h(List<n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (n next : list) {
            if (next.b()) {
                b bVar = this.a.get(next);
                for (Class next2 : next.a) {
                    if (!this.b.containsKey(next2)) {
                        this.b.put(next2, bVar);
                    } else {
                        arrayList.add(new g((z) this.b.get(next2), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> i() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.entrySet()) {
            n nVar = (n) next.getKey();
            if (!nVar.b()) {
                b bVar = (b) next.getValue();
                for (Class next2 : nVar.a) {
                    if (!hashMap.containsKey(next2)) {
                        hashMap.put(next2, new HashSet());
                    }
                    ((Set) hashMap.get(next2)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.c.containsKey(entry.getKey())) {
                this.c.put((Class) entry.getKey(), new y((Set) ((Collection) entry.getValue())));
            } else {
                y yVar = this.c.get(entry.getKey());
                for (b fVar : (Set) entry.getValue()) {
                    arrayList.add(new f(yVar, fVar));
                }
            }
        }
        return arrayList;
    }
}
