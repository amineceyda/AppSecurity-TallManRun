package g.i.b.f.f.a;

import g.i.b.f.f.c;
import g.i.b.f.k.f.a;
import g.i.b.f.k.f.b;
import g.i.b.f.k.g.a;
import java.util.Iterator;
import java.util.Map;

public final class e extends a {
    public e(a aVar, Map<String, String> map, a.C0162a aVar2, boolean z, c cVar, boolean z2, b bVar, int i2, boolean z3) {
        Map<String, String> map2;
        int i3;
        Map<Integer, Map<String, String>> map3;
        boolean z4;
        this.b = cVar;
        this.f4235d = aVar;
        this.f4237f = map;
        this.a = z;
        this.f4236e = z2;
        if (aVar2 != null) {
            a.b bVar2 = this.n;
            Iterator<a.C0162a> it = bVar2.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(aVar2)) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                bVar2.a.add(aVar2);
            }
        }
        this.f4240i = bVar.f4352l;
        a.C0161a aVar3 = aVar.b;
        Map<Integer, Map<String, String>> map4 = bVar.n;
        if (map4 != null && map4.size() > 0) {
            if (aVar3 == a.C0161a.Type_CDN_Ip_Socket_Schedule) {
                map3 = bVar.n;
                i3 = 0;
            } else if (aVar3 == a.C0161a.Type_CDN_Ip_Socket_Schedule_Https) {
                map3 = bVar.n;
                i3 = 1;
            }
            map2 = map3.get(i3);
            this.f4241j = map2;
            this.c = i2;
            this.f4242k = z3;
        }
        map2 = null;
        this.f4241j = map2;
        this.c = i2;
        this.f4242k = z3;
    }
}
