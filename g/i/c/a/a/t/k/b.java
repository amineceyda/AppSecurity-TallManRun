package g.i.c.a.a.t.k;

import android.os.SystemClock;
import android.view.View;
import g.c.b.b.f;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.g;
import g.i.c.a.a.u.a;
import g.i.c.a.a.u.c;
import java.util.Objects;
import java.util.WeakHashMap;

public class b extends g.i.c.a.a.i.a {
    public WeakHashMap<View, Long> a = new WeakHashMap<>();

    /* renamed from: g.i.c.a.a.t.k.b$b  reason: collision with other inner class name */
    public static class C0178b {
        public static final b a;

        static {
            b bVar = new b((a) null);
            a = bVar;
            Objects.requireNonNull(bVar);
            b.C0166b.a.b.c.a(bVar);
        }
    }

    public b(a aVar) {
        if (e.b.a.a) {
            f.w("ElementClickReporter", "init ");
        }
    }

    public static b t() {
        return C0178b.a;
    }

    public void h(View view) {
        g.i.c.a.a.l.b a2 = g.i.c.a.a.l.a.a(view);
        if (a2 != null && l.c(a2)) {
            Long l2 = this.a.get(view);
            boolean z = true;
            if (l2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                Long l3 = (Long) g.h.a.a.C(a2, "click_interval");
                if (l3 == null) {
                    l3 = Long.valueOf(e.b.a.d().f4392h);
                }
                if (uptimeMillis <= l3.longValue() + l2.longValue()) {
                    z = false;
                }
            }
            if (z) {
                this.a.put(view, Long.valueOf(SystemClock.uptimeMillis()));
                e eVar = e.b.a;
                if (eVar.a) {
                    f.w("ElementClickReporter", "onViewClick: view=" + view);
                }
                c a3 = a.b.a.a("clck", e.e.i.b.e(view));
                if (a3 != null) {
                    a3.a = "clck";
                    a3.b = g.i.c.a.a.l.c.c(view);
                    g.i.c.a.a.c cVar = eVar.f4498g;
                    if (cVar != null) {
                        cVar.b("clck", a3.c);
                    }
                    g.d(view, a3, false, false);
                }
            } else if (e.b.a.a) {
                f.w("ElementClickReporter", "onViewClick: not valid click ");
            }
        } else if (e.b.a.a) {
            f.w("ElementClickReporter", "onViewClick: dataEntity=" + a2);
        }
    }
}
