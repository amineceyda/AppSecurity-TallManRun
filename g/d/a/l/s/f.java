package g.d.a.l.s;

import g.d.a.l.s.e;
import java.util.HashMap;
import java.util.Map;

public class f {
    public static final e.a<?> b = new a();
    public final Map<Class<?>, e.a<?>> a = new HashMap();

    public class a implements e.a<Object> {
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        public Object a() {
            return this.a;
        }

        public void b() {
        }
    }
}
