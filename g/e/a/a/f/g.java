package g.e.a.a.f;

import g.e.a.a.f.x.a.f;
import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.j.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public final class g implements d<f> {
    public static final g a = new g();
    public static final c b;
    public static final c c;

    static {
        f.a aVar = f.a.DEFAULT;
        g.e.b.n.j.c cVar = new g.e.b.n.j.c(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        b = new c("startMs", hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap)), (c.a) null);
        g.e.b.n.j.c cVar2 = new g.e.b.n.j.c(2, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        c = new c("endMs", hashMap2 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap2)), (c.a) null);
    }

    public void a(Object obj, Object obj2) throws IOException {
        g.e.a.a.f.x.a.f fVar = (g.e.a.a.f.x.a.f) obj;
        e eVar = (e) obj2;
        eVar.b(b, fVar.a);
        eVar.b(c, fVar.b);
    }
}
