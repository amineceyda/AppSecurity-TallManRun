package g.e.b.l;

import g.e.b.j.a.a;
import g.e.b.l.j.f;
import g.e.b.l.j.h.c;
import g.e.b.l.j.h.d;
import g.e.b.l.j.h.e;
import g.e.b.q.a;
import g.e.b.q.b;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class a implements a.C0124a {
    public final /* synthetic */ e a;

    public /* synthetic */ a(e eVar) {
        this.a = eVar;
    }

    public final void a(b bVar) {
        e eVar = this.a;
        Objects.requireNonNull(eVar);
        f fVar = f.a;
        fVar.b("AnalyticsConnector now available.");
        g.e.b.j.a.a aVar = (g.e.b.j.a.a) bVar.get();
        e eVar2 = new e(aVar);
        f fVar2 = new f();
        a.C0111a a2 = aVar.a("clx", fVar2);
        if (a2 == null) {
            fVar.b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a2 = aVar.a("crash", fVar2);
            if (a2 != null) {
                fVar.f("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (a2 != null) {
            fVar.b("Registered Firebase Analytics listener.");
            d dVar = new d();
            c cVar = new c(eVar2, 500, TimeUnit.MILLISECONDS);
            synchronized (eVar) {
                for (g.e.b.l.j.i.a a3 : eVar.f3471d) {
                    dVar.a(a3);
                }
                fVar2.b = dVar;
                fVar2.a = cVar;
                eVar.c = dVar;
                eVar.b = cVar;
            }
            return;
        }
        fVar.f("Could not register Firebase Analytics listener; a listener is already registered.");
    }
}
