package g.e.a.a.f;

import g.e.a.a.f.x.a.e;
import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.j.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public final class f implements d<e> {
    public static final f a = new f();
    public static final c b;
    public static final c c;

    static {
        f.a aVar = f.a.DEFAULT;
        g.e.b.n.j.c cVar = new g.e.b.n.j.c(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        b = new c("currentCacheSizeBytes", hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap)), (c.a) null);
        g.e.b.n.j.c cVar2 = new g.e.b.n.j.c(2, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        c = new c("maxCacheSizeBytes", hashMap2 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap2)), (c.a) null);
    }

    public void a(Object obj, Object obj2) throws IOException {
        e eVar = (e) obj;
        g.e.b.n.e eVar2 = (g.e.b.n.e) obj2;
        eVar2.b(b, eVar.a);
        eVar2.b(c, eVar.b);
    }
}
