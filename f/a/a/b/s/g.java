package f.a.a.b.s;

import ch.qos.logback.core.spi.ScanException;
import e.e.f.b;
import f.a.a.a.i.h;
import f.a.a.b.d;
import f.a.a.b.s.k.a;
import f.a.a.b.s.k.e;
import f.a.a.b.s.l.c;
import java.util.HashMap;
import java.util.Map;

public abstract class g<E> extends f.a.a.b.g<E> {

    /* renamed from: f  reason: collision with root package name */
    public b<E> f1762f;

    /* renamed from: g  reason: collision with root package name */
    public String f1763g;

    /* renamed from: h  reason: collision with root package name */
    public h<E> f1764h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f1765i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public boolean f1766j = false;

    public void start() {
        Map map;
        String str = this.f1763g;
        if (str == null || str.length() == 0) {
            m("Empty or null pattern.");
            return;
        }
        try {
            e eVar = new e(this.f1763g, new c());
            d dVar = this.c;
            if (dVar != null) {
                eVar.g(dVar);
            }
            f.a.a.b.s.k.d t = eVar.t();
            HashMap hashMap = new HashMap();
            Map<String, String> map2 = f.a.a.a.d.f1623k;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            d dVar2 = this.c;
            if (!(dVar2 == null || (map = (Map) dVar2.f1687f.get("PATTERN_RULE_REGISTRY")) == null)) {
                hashMap.putAll(map);
            }
            hashMap.putAll(this.f1765i);
            a aVar = new a(t, hashMap);
            aVar.g(eVar.c);
            b<E> t2 = aVar.t();
            this.f1762f = t2;
            h<E> hVar = this.f1764h;
            if (hVar != null) {
                hVar.a(this.c, t2);
            }
            d dVar3 = this.c;
            for (b<E> bVar = this.f1762f; bVar != null; bVar = bVar.b) {
                if (bVar instanceof f.a.a.b.w.c) {
                    ((f.a.a.b.w.c) bVar).g(dVar3);
                }
            }
            b.x(this.f1762f);
            this.f1693e = true;
        } catch (ScanException e2) {
            this.c.f1685d.a(new f.a.a.b.x.a(g.a.a.a.a.f(g.a.a.a.a.i("Failed to parse pattern \""), this.f1763g, "\"."), this, e2));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("(\"");
        return g.a.a.a.a.f(sb, this.f1763g, "\")");
    }
}
