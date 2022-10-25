package g.i.c.a.a.t.k;

import g.i.c.a.a.t.g;
import g.i.c.a.a.t.k.h;
import g.i.c.a.a.t.k.i;
import java.util.Locale;

public class c implements i.b {

    public static class b {
        public static final c a;

        static {
            c cVar = new c((a) null);
            a = cVar;
            h.a.a.c.a(cVar);
        }
    }

    public c(a aVar) {
    }

    public static c b() {
        return b.a;
    }

    public void a(i.a aVar, long j2) {
        g.i.c.a.a.u.c cVar;
        long j3;
        if (aVar.f4543f && (cVar = aVar.f4542e) != null) {
            cVar.a = "imp_end";
            cVar.c.put("element_lvtm", String.valueOf(j2));
            g.i.c.a.a.o.b bVar = aVar.f4541d;
            double d2 = 0.0d;
            long j4 = 0;
            if (bVar != null) {
                long j5 = bVar.a;
                j3 = bVar.b;
                if (j5 != 0) {
                    double d3 = (double) j3;
                    double d4 = (double) j5;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d2 = d3 / d4;
                }
                j4 = j5;
            } else {
                j3 = 0;
            }
            cVar.c.put("element_area", String.valueOf(j4));
            cVar.c.put("ele_imp_area", String.valueOf(j3));
            cVar.c.put("ele_imp_rate", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(d2)}));
            g.d(aVar.b, cVar, false, false);
        }
    }
}
