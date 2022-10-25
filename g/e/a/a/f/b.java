package g.e.a.a.f;

import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.j.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public final class b implements d<g.e.a.a.f.x.a.b> {
    public static final b a = new b();
    public static final c b;

    static {
        f.a aVar = f.a.DEFAULT;
        g.e.b.n.j.c cVar = new g.e.b.n.j.c(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        b = new c("storageMetrics", hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap)), (c.a) null);
    }

    public void a(Object obj, Object obj2) throws IOException {
        ((e) obj2).f(b, ((g.e.a.a.f.x.a.b) obj).a);
    }
}
