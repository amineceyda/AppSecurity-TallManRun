package i.m;

import i.m.e;
import i.m.f;
import i.o.b.p;
import i.o.c.h;
import i.o.c.i;

public final class g extends i implements p<f, f.a, f> {
    public static final g b = new g();

    public g() {
        super(2);
    }

    public Object d(Object obj, Object obj2) {
        c cVar;
        f fVar = (f) obj;
        f.a aVar = (f.a) obj2;
        h.e(fVar, "acc");
        h.e(aVar, "element");
        f minusKey = fVar.minusKey(aVar.getKey());
        h hVar = h.b;
        if (minusKey == hVar) {
            return aVar;
        }
        int i2 = e.N;
        e.a aVar2 = e.a.a;
        e eVar = (e) minusKey.get(aVar2);
        if (eVar == null) {
            cVar = new c(minusKey, aVar);
        } else {
            f minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == hVar) {
                return new c(aVar, eVar);
            }
            cVar = new c(new c(minusKey2, aVar), eVar);
        }
        return cVar;
    }
}
