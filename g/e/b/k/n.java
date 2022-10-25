package g.e.b.k;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class n<T> {
    public final Set<Class<? super T>> a;
    public final Set<v> b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3461d;

    /* renamed from: e  reason: collision with root package name */
    public final p<T> f3462e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f3463f;

    public static class b<T> {
        public final Set<Class<? super T>> a;
        public final Set<v> b = new HashSet();
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3464d;

        /* renamed from: e  reason: collision with root package name */
        public p<T> f3465e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f3466f;

        public b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.c = 0;
            this.f3464d = 0;
            this.f3466f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class requireNonNull : clsArr) {
                Objects.requireNonNull(requireNonNull, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        public b<T> a(v vVar) {
            if (!this.a.contains(vVar.a)) {
                this.b.add(vVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public n<T> b() {
            if (this.f3465e != null) {
                return new n(new HashSet(this.a), new HashSet(this.b), this.c, this.f3464d, this.f3465e, this.f3466f, (a) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public b<T> c() {
            if (this.c == 0) {
                this.c = 2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }

        public b<T> d(p<T> pVar) {
            this.f3465e = pVar;
            return this;
        }
    }

    public n(Set set, Set set2, int i2, int i3, p pVar, Set set3, a aVar) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.f3461d = i3;
        this.f3462e = pVar;
        this.f3463f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], (a) null);
    }

    @SafeVarargs
    public static <T> n<T> c(T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, (a) null);
        bVar.d(new b(t));
        return bVar.b();
    }

    public boolean b() {
        return this.f3461d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f3461d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
