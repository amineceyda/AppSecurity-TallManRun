package g.i.c.a.a.w;

import e.e.i.b;
import g.c.b.b.f;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.t.g;
import g.i.c.a.a.t.j;
import g.i.c.a.a.w.g.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d implements Runnable {
    public final /* synthetic */ e b;

    public d(e eVar) {
        this.b = eVar;
    }

    public void run() {
        if (!this.b.c) {
            e eVar = this.b;
            Class<a> cls = a.class;
            List<a> e2 = eVar.a.e(cls);
            HashMap hashMap = null;
            if (b.F(e2)) {
                f.w0("EventStashManager", "realReportEvent, stash event is empty, report stash event is ignored!");
            } else {
                StringBuilder i2 = g.a.a.a.a.i("realReportEvent, stash event count: ");
                i2.append(e2.size());
                f.w0("EventStashManager", i2.toString());
                eVar.a.c(cls);
                for (a next : e2) {
                    String str = next.a;
                    Map<String, Object> map = next.b;
                    String str2 = next.c;
                    e<g.d> eVar2 = g.a;
                    j.b(str2, str, map);
                    g.e((Object) null, str, (g.i.c.a.a.j.a) null, map, str2);
                }
            }
            this.b.c = true;
            e eVar3 = this.b;
            synchronized (eVar3.b) {
                if (!eVar3.b.isEmpty()) {
                    hashMap = new HashMap(eVar3.b);
                    eVar3.b.clear();
                }
            }
            if (hashMap != null) {
                ArrayList arrayList = new ArrayList(hashMap.keySet());
                eVar3.a.a(new ArrayList(hashMap.values()), arrayList);
            }
        }
    }
}
