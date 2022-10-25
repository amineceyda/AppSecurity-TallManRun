package g.e.a.a.f;

import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.j.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public final class c implements d<g.e.a.a.f.x.a.c> {
    public static final c a = new c();
    public static final g.e.b.n.c b;
    public static final g.e.b.n.c c;

    static {
        f.a aVar = f.a.DEFAULT;
        g.e.b.n.j.c cVar = new g.e.b.n.j.c(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        b = new g.e.b.n.c("eventsDroppedCount", hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap)), (c.a) null);
        g.e.b.n.j.c cVar2 = new g.e.b.n.j.c(3, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        c = new g.e.b.n.c("reason", hashMap2 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap2)), (c.a) null);
    }

    public void a(Object obj, Object obj2) throws IOException {
        g.e.a.a.f.x.a.c cVar = (g.e.a.a.f.x.a.c) obj;
        e eVar = (e) obj2;
        eVar.b(b, cVar.a);
        eVar.f(c, cVar.b);
    }
}
