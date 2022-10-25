package g.e.b.k;

import g.e.b.q.b;
import java.util.Set;

public abstract class m implements o {
    public <T> T a(Class<T> cls) {
        b<T> c = c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }

    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
