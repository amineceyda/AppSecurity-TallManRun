package g.e.c.t;

import g.e.c.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class g {
    public final Map<Type, f<?>> a;
    public final g.e.c.t.a0.b b = g.e.c.t.a0.b.a;

    public class a implements s<T> {
        public final /* synthetic */ f a;
        public final /* synthetic */ Type b;

        public a(g gVar, f fVar, Type type) {
            this.a = fVar;
            this.b = type;
        }

        public T a() {
            return this.a.a(this.b);
        }
    }

    public class b implements s<T> {
        public final /* synthetic */ f a;
        public final /* synthetic */ Type b;

        public b(g gVar, f fVar, Type type) {
            this.a = fVar;
            this.b = type;
        }

        public T a() {
            return this.a.a(this.b);
        }
    }

    public g(Map<Type, f<?>> map) {
        this.a = map;
    }

    public <T> s<T> a(g.e.c.u.a<T> aVar) {
        h hVar;
        Type type = aVar.b;
        Class<? super T> cls = aVar.a;
        f fVar = this.a.get(type);
        if (fVar != null) {
            return new a(this, fVar, type);
        }
        f fVar2 = this.a.get(cls);
        if (fVar2 != null) {
            return new b(this, fVar2, type);
        }
        s<T> sVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            sVar = SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                sVar = new n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                sVar = new b(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                sVar = new c(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a2 = a.a(type2);
                    Class<?> e2 = a.e(a2);
                    a2.hashCode();
                    if (!String.class.isAssignableFrom(e2)) {
                        sVar = new d(this);
                    }
                }
                sVar = new e(this);
            }
        }
        if (sVar != null) {
            return sVar;
        }
        return new f(this, cls, type);
    }

    public String toString() {
        return this.a.toString();
    }
}
