package g.i.c.a.a.w;

import g.c.b.b.f;
import g.i.c.a.a.w.g.a;

public class c implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public c(e eVar, String str) {
        this.c = eVar;
        this.b = str;
    }

    public void run() {
        e eVar = this.c;
        String str = this.b;
        Class<a> cls = a.class;
        if (!eVar.a.d(cls, str)) {
            f.K("EventStashManager", "realRemoveStashEvent, not found stash event, stashKey: " + str + ", report stash event is ignored!");
            return;
        }
        f.K("EventStashManager", "realCancelStashEvent, remove stash event, stashKey: " + str);
        eVar.a.f(cls, str);
    }
}
