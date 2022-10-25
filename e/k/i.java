package e.k;

import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import e.c.a.b.b;
import e.k.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class i extends e {
    public e.c.a.b.a<g, a> a = new e.c.a.b.a<>();
    public e.b b;
    public final WeakReference<h> c;

    /* renamed from: d  reason: collision with root package name */
    public int f1518d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1519e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1520f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<e.b> f1521g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1522h;

    public static class a {
        public e.b a;
        public f b;

        public a(g gVar, e.b bVar) {
            f fVar;
            Map<Class<?>, Integer> map = k.a;
            boolean z = gVar instanceof f;
            boolean z2 = gVar instanceof c;
            if (z && z2) {
                fVar = new FullLifecycleObserverAdapter((c) gVar, (f) gVar);
            } else if (z2) {
                fVar = new FullLifecycleObserverAdapter((c) gVar, (f) null);
            } else if (z) {
                fVar = (f) gVar;
            } else {
                Class<?> cls = gVar.getClass();
                if (k.c(cls) == 2) {
                    List list = k.b.get(cls);
                    if (list.size() == 1) {
                        fVar = new SingleGeneratedAdapterObserver(k.a((Constructor) list.get(0), gVar));
                    } else {
                        d[] dVarArr = new d[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            dVarArr[i2] = k.a((Constructor) list.get(i2), gVar);
                        }
                        fVar = new CompositeGeneratedAdaptersObserver(dVarArr);
                    }
                } else {
                    fVar = new ReflectiveGenericLifecycleObserver(gVar);
                }
            }
            this.b = fVar;
            this.a = bVar;
        }

        public void a(h hVar, e.a aVar) {
            e.b a2 = aVar.a();
            this.a = i.f(this.a, a2);
            this.b.d(hVar, aVar);
            this.a = a2;
        }
    }

    public i(h hVar) {
        this.c = new WeakReference<>(hVar);
        this.b = e.b.INITIALIZED;
        this.f1522h = true;
    }

    public static e.b f(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public void a(g gVar) {
        h hVar;
        d("addObserver");
        e.b bVar = this.b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        a aVar = new a(gVar, bVar2);
        if (this.a.h(gVar, aVar) == null && (hVar = (h) this.c.get()) != null) {
            boolean z = this.f1518d != 0 || this.f1519e;
            e.b c2 = c(gVar);
            this.f1518d++;
            while (aVar.a.compareTo(c2) < 0 && this.a.f1226f.containsKey(gVar)) {
                this.f1521g.add(aVar.a);
                e.a b2 = e.a.b(aVar.a);
                if (b2 != null) {
                    aVar.a(hVar, b2);
                    h();
                    c2 = c(gVar);
                } else {
                    StringBuilder i2 = g.a.a.a.a.i("no event up from ");
                    i2.append(aVar.a);
                    throw new IllegalStateException(i2.toString());
                }
            }
            if (!z) {
                i();
            }
            this.f1518d--;
        }
    }

    public void b(g gVar) {
        d("removeObserver");
        this.a.i(gVar);
    }

    public final e.b c(g gVar) {
        e.c.a.b.a<g, a> aVar = this.a;
        e.b bVar = null;
        b.c<K, V> cVar = aVar.f1226f.containsKey(gVar) ? aVar.f1226f.get(gVar).f1230e : null;
        e.b bVar2 = cVar != null ? ((a) cVar.c).a : null;
        if (!this.f1521g.isEmpty()) {
            ArrayList<e.b> arrayList = this.f1521g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return f(f(this.b, bVar2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (this.f1522h && !e.c.a.a.a.b().a()) {
            throw new IllegalStateException(g.a.a.a.a.c("Method ", str, " must be called on the main thread"));
        }
    }

    public void e(e.a aVar) {
        d("handleLifecycleEvent");
        g(aVar.a());
    }

    public final void g(e.b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.f1519e || this.f1518d != 0) {
                this.f1520f = true;
                return;
            }
            this.f1519e = true;
            i();
            this.f1519e = false;
        }
    }

    public final void h() {
        ArrayList<e.b> arrayList = this.f1521g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void i() {
        e.b bVar;
        h hVar = (h) this.c.get();
        if (hVar != null) {
            while (true) {
                e.c.a.b.a<g, a> aVar = this.a;
                boolean z = true;
                if (!(aVar.f1228e == 0 || (((a) aVar.b.c).a == (bVar = ((a) aVar.c.c).a) && this.b == bVar))) {
                    z = false;
                }
                this.f1520f = false;
                if (!z) {
                    if (this.b.compareTo(((a) aVar.b.c).a) < 0) {
                        e.c.a.b.a<g, a> aVar2 = this.a;
                        b.C0039b bVar2 = new b.C0039b(aVar2.c, aVar2.b);
                        aVar2.f1227d.put(bVar2, Boolean.FALSE);
                        while (bVar2.hasNext() && !this.f1520f) {
                            Map.Entry entry = (Map.Entry) bVar2.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.a.compareTo(this.b) > 0 && !this.f1520f && this.a.contains(entry.getKey())) {
                                int ordinal = aVar3.a.ordinal();
                                e.a aVar4 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e.a.ON_PAUSE : e.a.ON_STOP : e.a.ON_DESTROY;
                                if (aVar4 != null) {
                                    this.f1521g.add(aVar4.a());
                                    aVar3.a(hVar, aVar4);
                                    h();
                                } else {
                                    StringBuilder i2 = g.a.a.a.a.i("no event down from ");
                                    i2.append(aVar3.a);
                                    throw new IllegalStateException(i2.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar = this.a.c;
                    if (!this.f1520f && cVar != null && this.b.compareTo(((a) cVar.c).a) > 0) {
                        b<K, V>.d e2 = this.a.e();
                        while (e2.hasNext() && !this.f1520f) {
                            Map.Entry entry2 = (Map.Entry) e2.next();
                            a aVar5 = (a) entry2.getValue();
                            while (aVar5.a.compareTo(this.b) < 0 && !this.f1520f && this.a.contains(entry2.getKey())) {
                                this.f1521g.add(aVar5.a);
                                e.a b2 = e.a.b(aVar5.a);
                                if (b2 != null) {
                                    aVar5.a(hVar, b2);
                                    h();
                                } else {
                                    StringBuilder i3 = g.a.a.a.a.i("no event up from ");
                                    i3.append(aVar5.a);
                                    throw new IllegalStateException(i3.toString());
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
