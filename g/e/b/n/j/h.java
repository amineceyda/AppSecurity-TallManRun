package g.e.b.n.j;

import com.google.firebase.encoders.EncodingException;
import g.e.b.n.d;
import g.e.b.n.f;
import g.e.b.n.h.b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class h {
    public final Map<Class<?>, d<?>> a;
    public final Map<Class<?>, f<?>> b;
    public final d<Object> c;

    public static final class a implements b<a> {
        public final Map<Class<?>, d<?>> a = new HashMap();
        public final Map<Class<?>, f<?>> b = new HashMap();
        public d<Object> c = b.a;

        public b a(Class cls, d dVar) {
            this.a.put(cls, dVar);
            this.b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.a = map;
        this.b = map2;
        this.c = dVar;
    }

    public void a(Object obj, OutputStream outputStream) throws IOException {
        Map<Class<?>, d<?>> map = this.a;
        g gVar = new g(outputStream, map, this.b, this.c);
        if (obj != null) {
            d dVar = map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, gVar);
                return;
            }
            StringBuilder i2 = g.a.a.a.a.i("No encoder for ");
            i2.append(obj.getClass());
            throw new EncodingException(i2.toString());
        }
    }
}
