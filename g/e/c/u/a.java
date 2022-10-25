package g.e.c.u;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public class a<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a2 = g.e.c.t.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.b = a2;
            this.a = g.e.c.t.a.e(a2);
            this.c = a2.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && g.e.c.t.a.c(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return g.e.c.t.a.i(this.b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a2 = g.e.c.t.a.a(type);
        this.b = a2;
        this.a = g.e.c.t.a.e(a2);
        this.c = a2.hashCode();
    }
}
