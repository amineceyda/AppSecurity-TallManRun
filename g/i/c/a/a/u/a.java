package g.i.c.a.a.u;

import android.util.SparseArray;
import g.i.c.a.a.b0.g;
import g.i.c.a.a.l.c;
import g.i.c.a.a.l.d;
import g.i.c.a.a.l.f;
import g.i.c.a.a.l.h;
import g.i.c.a.a.r.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a {

    public static class b {
        public static final a a = new a((C0184a) null);
    }

    public a(C0184a aVar) {
    }

    public c a(String str, d dVar) {
        Map<String, Object> map;
        ArrayList arrayList;
        h hVar = null;
        if (dVar == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (g.i.c.a.a.l.b next : dVar.a) {
            if (next != null) {
                String y = g.h.a.a.y(next);
                HashMap hashMap = new HashMap();
                Map<String, ?> z = g.h.a.a.z(next);
                h hVar2 = (h) g.a(8);
                hVar2.a = y;
                HashMap hashMap2 = new HashMap();
                f fVar = next.f4454d;
                if (fVar == null) {
                    map = null;
                } else {
                    map = fVar.a(str);
                }
                if (!e.e.i.b.G(map)) {
                    hashMap2.putAll(map);
                }
                if (!e.e.i.b.G(z)) {
                    hashMap.putAll(z);
                }
                if (!e.e.i.b.G(hashMap2)) {
                    hashMap.putAll(hashMap2);
                }
                hVar2.b = hashMap;
                arrayList2.add(hVar2);
                SparseArray<d> sparseArray = next.f4455e;
                if (sparseArray == null || sparseArray.size() == 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        d valueAt = sparseArray.valueAt(i2);
                        if (valueAt != null) {
                            h hVar3 = (h) g.a(8);
                            hVar3.a = valueAt.a;
                            hVar3.b = valueAt.b;
                            arrayList.add(hVar3);
                        }
                    }
                }
                if (!e.e.i.b.F(arrayList)) {
                    arrayList2.addAll(arrayList);
                }
            }
        }
        h hVar4 = (h) g.a(8);
        Object b2 = dVar.b();
        if (b2 != null) {
            String f2 = c.f(b2);
            Map<String, Object> w = e.e.i.b.w(str, b2, b2.hashCode());
            hVar4.a = f2;
            hVar4.b = w;
            hVar = hVar4;
        }
        Map<String, Object> b3 = e.b.a.d().p.b(arrayList2, hVar);
        c cVar = (c) g.a(6);
        if (b3 != null) {
            cVar.c = b3;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            g.b((h) it.next(), 8);
        }
        g.b(hVar, 8);
        return cVar;
    }
}
