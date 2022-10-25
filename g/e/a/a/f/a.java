package g.e.a.a.f;

import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.j.f;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public final class a implements d<g.e.a.a.f.x.a.a> {
    public static final a a = new a();
    public static final c b;
    public static final c c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f2754d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f2755e;

    static {
        f.a aVar = f.a.DEFAULT;
        g.e.b.n.j.c cVar = new g.e.b.n.j.c(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        b = new c("window", hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap)), (c.a) null);
        g.e.b.n.j.c cVar2 = new g.e.b.n.j.c(2, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        c = new c("logSourceMetrics", hashMap2 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap2)), (c.a) null);
        g.e.b.n.j.c cVar3 = new g.e.b.n.j.c(3, aVar);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(cVar3.annotationType(), cVar3);
        f2754d = new c("globalMetrics", hashMap3 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap3)), (c.a) null);
        g.e.b.n.j.c cVar4 = new g.e.b.n.j.c(4, aVar);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(cVar4.annotationType(), cVar4);
        f2755e = new c("appNamespace", hashMap4 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap4)), (c.a) null);
    }

    public void a(Object obj, Object obj2) throws IOException {
        g.e.a.a.f.x.a.a aVar = (g.e.a.a.f.x.a.a) obj;
        e eVar = (e) obj2;
        eVar.f(b, aVar.a);
        eVar.f(c, aVar.b);
        eVar.f(f2754d, aVar.c);
        eVar.f(f2755e, aVar.f2783d);
    }
}
