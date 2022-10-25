package g.d.a.l.u;

import com.bumptech.glide.Registry;
import g.d.a.l.u.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f2559e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final n<Object, Object> f2560f = new a();
    public final List<b<?, ?>> a = new ArrayList();
    public final c b;
    public final Set<b<?, ?>> c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final e.e.i.c<List<Throwable>> f2561d;

    public static class a implements n<Object, Object> {
        public n.a<Object> a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
            return null;
        }

        public boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final o<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.b = cls2;
            this.c = oVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    public static class c {
    }

    public r(e.e.i.c<List<Throwable>> cVar) {
        c cVar2 = f2559e;
        this.f2561d = cVar;
        this.b = cVar2;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        b bVar = new b(cls, cls2, oVar);
        List<b<?, ?>> list = this.a;
        list.add(list.size(), bVar);
    }

    public final <Model, Data> n<Model, Data> b(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> b2 = bVar.c.b(this);
        Objects.requireNonNull(b2, "Argument must not be null");
        return b2;
    }

    public synchronized <Model, Data> n<Model, Data> c(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b next : this.a) {
                if (this.c.contains(next)) {
                    z = true;
                } else if (next.a(cls, cls2)) {
                    this.c.add(next);
                    arrayList.add(b(next));
                    this.c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                e.e.i.c<List<Throwable>> cVar2 = this.f2561d;
                Objects.requireNonNull(cVar);
                return new q(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return f2560f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public synchronized <Model> List<n<Model, ?>> d(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.a) {
                if (!this.c.contains(next)) {
                    if (next.a.isAssignableFrom(cls)) {
                        this.c.add(next);
                        n<? extends Model, ? extends Data> b2 = next.c.b(this);
                        Objects.requireNonNull(b2, "Argument must not be null");
                        arrayList.add(b2);
                        this.c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Class<?>> e(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.a) {
            if (!arrayList.contains(next.b) && next.a.isAssignableFrom(cls)) {
                arrayList.add(next.b);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> f(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a(cls, cls2)) {
                it.remove();
                arrayList.add(next.c);
            }
        }
        return arrayList;
    }
}
