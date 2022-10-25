package m.b.a.a.b.g.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import m.b.a.a.b.g.a.a;
import m.b.a.a.b.g.a.b;
import m.b.a.a.b.g.a.c;
import m.b.a.a.b.g.a.d;
import m.b.a.a.b.g.a.e;

public class f {
    public final b a = new b();
    public long b = System.currentTimeMillis();
    public String c = "<none>";

    public final void a(d dVar, e eVar, boolean z) {
        synchronized (this.a) {
            ((c) eVar).c(new m.b.a.a.b.g.a.f(this.c, this.b, System.currentTimeMillis()));
            b bVar = this.a;
            Objects.requireNonNull(bVar);
            Iterator it = new ArrayList(bVar.a.values()).iterator();
            while (it.hasNext()) {
                ((c) dVar).b((a) it.next());
            }
            if (z) {
                c();
            }
        }
    }

    public a b(Long l2, String str, int i2) {
        a aVar;
        synchronized (this.a) {
            b bVar = this.a;
            aVar = bVar.a.get(l2);
            if (aVar == null) {
                aVar = new a(l2.longValue(), str, i2);
                bVar.a.put(l2, aVar);
                bVar.b.add(str);
            } else {
                aVar.a(l2.longValue(), str, i2);
            }
        }
        return aVar;
    }

    public final void c() {
        synchronized (this.a) {
            for (a aVar : this.a.a.values()) {
                Arrays.fill(aVar.c, false);
            }
            this.b = System.currentTimeMillis();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            objArr[0] = b((Long) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()).c;
        }
        return super.equals(obj);
    }
}
