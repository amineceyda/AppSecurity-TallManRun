package g.i.c.a.a.t.k;

import android.os.SystemClock;
import android.view.View;
import g.c.b.b.f;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.l.c;
import g.i.c.a.a.o.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.k.i;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class h implements i {
    public final Map<Long, i.a> a;
    public final Map<Long, i.a> b;
    public e<i.b> c = new e<>();

    public static class a {
        public static final h a = new h((g) null);
    }

    public h() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        this.b = Collections.unmodifiableMap(concurrentHashMap);
    }

    public h(g gVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        this.b = Collections.unmodifiableMap(concurrentHashMap);
    }

    public void a(f fVar) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            f.w("ExposureRecorderImpl", "markExposed: exposureElementInfo = " + fVar);
        }
        View b2 = fVar.b();
        if (b2 != null) {
            long a2 = g.i.c.a.a.b0.f.a(b2);
            if (eVar.a) {
                StringBuilder i2 = g.a.a.a.a.i("markExposed: identifier = ");
                i2.append(c.e(b2, "element_identifier"));
                i2.append("， uniqueId = ");
                i2.append(a2);
                f.w("ExposureRecorderImpl", i2.toString());
            }
            this.a.put(Long.valueOf(a2), new i.a(fVar, SystemClock.elapsedRealtime()));
        }
    }

    public void b(Collection<Long> collection) {
        if (e.b.a.a) {
            f.w("ExposureRecorderImpl", "markUnexposed: targets=" + collection);
        }
        for (Long next : collection) {
            if (next != null) {
                i.a remove = this.a.remove(Long.valueOf(next.longValue()));
                if (remove != null) {
                    this.c.b(new g(this, remove, SystemClock.elapsedRealtime() - remove.a));
                }
            }
        }
    }

    public void c(long j2, b bVar) {
        if (e.b.a.a) {
            f.w("ExposureRecorderImpl", "updateAreaInfo: uniqueId = " + j2 + ", areaInfo = " + bVar);
        }
        i.a aVar = this.a.get(Long.valueOf(j2));
        if (aVar != null) {
            b bVar2 = aVar.f4541d;
            if (bVar2 == null || bVar2.c <= bVar.c) {
                aVar.f4541d = bVar;
            }
        }
    }
}
