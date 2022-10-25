package g.e.b.k;

import g.e.b.q.a;
import g.e.b.q.b;
import java.util.Set;

public interface o {
    <T> T a(Class<T> cls);

    <T> Set<T> b(Class<T> cls);

    <T> b<T> c(Class<T> cls);

    <T> b<Set<T>> d(Class<T> cls);

    <T> a<T> e(Class<T> cls);
}
