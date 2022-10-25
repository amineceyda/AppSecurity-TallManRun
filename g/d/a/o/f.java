package g.d.a.o;

import g.d.a.l.q;
import java.util.ArrayList;
import java.util.List;

public class f {
    public final List<a<?>> a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final q<T> b;

        public a(Class<T> cls, q<T> qVar) {
            this.a = cls;
            this.b = qVar;
        }
    }

    public synchronized <Z> q<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.a.get(i2);
            if (aVar.a.isAssignableFrom(cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
