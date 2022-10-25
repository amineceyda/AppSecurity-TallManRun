package g.e.a.a.f.z;

import g.e.a.a.f.l;
import g.e.a.a.f.p;
import g.e.a.a.f.v.m;
import g.e.b.l.j.o.b;
import java.util.Objects;
import java.util.logging.Logger;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ c b;
    public final /* synthetic */ p c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f2791d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f2792e;

    public /* synthetic */ a(c cVar, p pVar, b bVar, l lVar) {
        this.b = cVar;
        this.c = pVar;
        this.f2791d = bVar;
        this.f2792e = lVar;
    }

    public final void run() {
        c cVar = this.b;
        p pVar = this.c;
        b bVar = this.f2791d;
        l lVar = this.f2792e;
        Objects.requireNonNull(cVar);
        try {
            m mVar = cVar.c.get(pVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                c.f2793f.warning(format);
                bVar.a.a(new IllegalArgumentException(format));
                return;
            }
            cVar.f2795e.a(new b(cVar, pVar, mVar.a(lVar)));
            bVar.a((Exception) null);
        } catch (Exception e2) {
            Logger logger = c.f2793f;
            StringBuilder i2 = g.a.a.a.a.i("Error scheduling event ");
            i2.append(e2.getMessage());
            logger.warning(i2.toString());
            bVar.a.a(e2);
        }
    }
}
