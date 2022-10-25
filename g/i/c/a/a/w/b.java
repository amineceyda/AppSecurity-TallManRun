package g.i.c.a.a.w;

import g.c.b.b.f;
import g.i.c.a.a.r.e;
import g.i.c.a.a.w.g.a;
import java.util.Objects;

public class b implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f4549d;

    public b(e eVar, String str, a aVar) {
        this.f4549d = eVar;
        this.b = str;
        this.c = aVar;
    }

    public void run() {
        e eVar = this.f4549d;
        String str = this.b;
        a aVar = this.c;
        Objects.requireNonNull(eVar);
        if (e.b.a.a) {
            f.K("EventStashManager", "realStashEvent, stash event, stashKey: " + str + ", stashEvent: " + aVar);
        }
        if (!eVar.c) {
            eVar.b.put(str, aVar);
        } else {
            eVar.a.b(aVar, str);
        }
        g.i.c.a.a.y.a.a(new d(eVar));
    }
}
