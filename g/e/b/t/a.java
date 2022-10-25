package g.e.b.t;

import g.e.b.k.a0;
import g.e.b.k.o;
import g.e.b.k.p;
import java.util.Set;

public final /* synthetic */ class a implements p {
    public static final /* synthetic */ a a = new a();

    public final Object a(o oVar) {
        Set<f> b = ((a0) oVar).b(f.class);
        e eVar = e.b;
        if (eVar == null) {
            synchronized (e.class) {
                eVar = e.b;
                if (eVar == null) {
                    eVar = new e();
                    e.b = eVar;
                }
            }
        }
        return new d(b, eVar);
    }
}
