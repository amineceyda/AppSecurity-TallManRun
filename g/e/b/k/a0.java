package g.e.b.k;

import com.google.firebase.components.DependencyException;
import g.e.b.o.c;
import g.e.b.q.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a0 extends m {
    public final Set<Class<?>> a;
    public final Set<Class<?>> b;
    public final Set<Class<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Class<?>> f3457d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Class<?>> f3458e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f3459f;

    /* renamed from: g  reason: collision with root package name */
    public final o f3460g;

    public static class a implements c {
        public final c a;

        public a(Set<Class<?>> set, c cVar) {
            this.a = cVar;
        }
    }

    public a0(n<?> nVar, o oVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (v next : nVar.b) {
            int i2 = next.c;
            boolean z = false;
            if (!(i2 == 0)) {
                if (i2 == 2 ? true : z) {
                    hashSet3.add(next.a);
                } else if (next.a()) {
                    hashSet5.add(next.a);
                } else {
                    hashSet2.add(next.a);
                }
            } else if (next.a()) {
                hashSet4.add(next.a);
            } else {
                hashSet.add(next.a);
            }
        }
        if (!nVar.f3463f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.f3457d = Collections.unmodifiableSet(hashSet4);
        this.f3458e = Collections.unmodifiableSet(hashSet5);
        this.f3459f = nVar.f3463f;
        this.f3460g = oVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.f3460g.a(cls);
            return !cls.equals(c.class) ? a2 : new a(this.f3459f, (c) a2);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> Set<T> b(Class<T> cls) {
        if (this.f3457d.contains(cls)) {
            return this.f3460g.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> b<T> c(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f3460g.c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> b<Set<T>> d(Class<T> cls) {
        if (this.f3458e.contains(cls)) {
            return this.f3460g.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> g.e.b.q.a<T> e(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f3460g.e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
