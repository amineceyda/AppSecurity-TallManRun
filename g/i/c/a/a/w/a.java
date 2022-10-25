package g.i.c.a.a.w;

import g.c.b.b.f;
import g.i.c.a.a.r.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class a {
    public List<g.i.c.a.a.j.b> a = new CopyOnWriteArrayList();

    /* renamed from: g.i.c.a.a.w.a$a  reason: collision with other inner class name */
    public class C0185a implements Runnable {
        public C0185a() {
        }

        public void run() {
            Objects.requireNonNull(a.this);
            e eVar = e.b.a;
            if (eVar.a) {
                f.K("StagingManager", "supplementReportsEvent");
            }
            a aVar = a.this;
            synchronized (aVar) {
                if (aVar.a.isEmpty()) {
                    f.K("StagingManager", "supplementStagingEvent dataList is empty");
                } else {
                    if (eVar.a) {
                        f.K("StagingManager", "supplementStagingEvent");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (g.i.c.a.a.j.b next : aVar.a) {
                        e.b.a.r(next);
                        arrayList.add(next);
                    }
                    aVar.a.removeAll(arrayList);
                    arrayList.clear();
                }
            }
        }
    }

    public static class b {
        public static final a a = new a((C0185a) null);
    }

    public a(C0185a aVar) {
    }

    public static a a() {
        return b.a;
    }

    public void b(g.i.c.a.a.j.b bVar) {
        if (e.b.a.a) {
            f.K("StagingManager", "eventData:" + bVar);
        }
        this.a.add(bVar);
    }

    public void c() {
        if (!this.a.isEmpty()) {
            g.i.c.a.a.y.a.a(new C0185a());
        }
    }
}
