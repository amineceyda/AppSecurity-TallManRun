package g.i.c.a.a.t;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.i.c.a.a.b0.g;
import g.i.c.a.a.l.c;
import g.i.c.a.a.p.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class i implements n.b {
    public final SparseArray<Long> a = new SparseArray<>();

    public static class b {
        public static final i a;

        static {
            i iVar = new i((a) null);
            a = iVar;
            Objects.requireNonNull(iVar);
            n.d.a.f4507g.a(iVar);
        }
    }

    public i(a aVar) {
    }

    public static i e() {
        return b.a;
    }

    public void a(g.i.c.a.a.s.i iVar, Set<g.i.c.a.a.s.i> set, int i2) {
        g.i.c.a.a.l.b a2;
        Map<String, Object> map;
        ArrayList arrayList = new ArrayList(set);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g.i.c.a.a.s.i iVar2 = (g.i.c.a.a.s.i) arrayList.get(size);
            this.a.put(iVar2.c, Long.valueOf(SystemClock.elapsedRealtime()));
            Object c = iVar2.c();
            if (!(c == null || (a2 = c.a(c, true)) == null || (map = a2.f4459i) == null)) {
                map.remove("page_interactive_flag");
            }
            g.i.c.a.a.p.b bVar = b.C0174b.a;
            View e2 = iVar2.e();
            Objects.requireNonNull(bVar);
            if (!(c.d(e2, "flutter_api") instanceof g.i.c.a.a.p.a)) {
                Object c2 = iVar2.c();
                g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.a(6);
                cVar.a = "pgin";
                cVar.b = c.c(iVar2.c());
                Map<String, Object> f2 = f("pgin", iVar2);
                g.i.c.a.a.l.b a3 = g.i.c.a.a.l.a.a(iVar2.c());
                String str = (String) g.h.a.a.C(a3, "page_last_content_id");
                String v = g.h.a.a.v(a3);
                ((HashMap) f2).put("dt_pg_isreturn", Integer.valueOf((a3 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(v)) ? false : v.equals(str) ? 1 : 0));
                cVar.c(f2);
                g.i.c.a.a.c cVar2 = e.b.a.f4498g;
                if (cVar2 != null) {
                    cVar2.b("pgin", cVar.c);
                }
                g.d(c2, cVar, false, false);
            }
            if (iVar2.c() != null) {
                Object c3 = iVar2.c();
                c.j(c3, "page_last_content_id", g.h.a.a.v(c.a(c3, false)));
            }
        }
    }

    public final g.i.c.a.a.u.c b(g.i.c.a.a.s.i iVar) {
        Object obj;
        Long l2 = this.a.get(iVar.c);
        this.a.remove(iVar.c);
        long longValue = l2 == null ? 0 : l2.longValue();
        g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.a(6);
        cVar.a = "pgout";
        cVar.b = c.c(iVar.c());
        cVar.b("lvtm", Long.valueOf(SystemClock.elapsedRealtime() - longValue));
        n nVar = n.d.a;
        g.i.c.a.a.s.i iVar2 = nVar.b;
        Object obj2 = null;
        if (iVar2 == null) {
            obj = null;
        } else {
            obj = iVar2.c();
        }
        Object e2 = c.e(obj, "page_body_info");
        if (e2 instanceof g.i.c.a.a.s.c) {
            Objects.requireNonNull((g.i.c.a.a.s.c) e2);
            cVar.b("pg_area", String.valueOf(0));
            cVar.b("pg_imp_area", String.valueOf(0));
            cVar.b("pg_imp_rate", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(0.0d)}));
        }
        g.i.c.a.a.s.i iVar3 = nVar.b;
        if (iVar3 != null) {
            obj2 = iVar3.c();
        }
        if (obj2 != null) {
            cVar.b("is_interactive_flag", c.e(obj2, "page_interactive_flag") == Boolean.TRUE ? SLAConstant.TYPE_DEPRECATED_START : "0");
        }
        cVar.c(f("pgout", iVar));
        g.i.c.a.a.c cVar2 = e.b.a.f4498g;
        if (cVar2 != null) {
            cVar2.b("pgout", cVar.c);
        }
        return cVar;
    }

    public void c(g.i.c.a.a.s.i iVar, g.i.c.a.a.l.b bVar, Set<g.i.c.a.a.s.i> set, boolean z) {
        for (g.i.c.a.a.s.i next : set) {
            g.i.c.a.a.p.b bVar2 = b.C0174b.a;
            View e2 = next.e();
            Objects.requireNonNull(bVar2);
            if (!(c.d(e2, "flutter_api") instanceof g.i.c.a.a.p.a)) {
                Object c = next.c();
                g.i.c.a.a.u.c b2 = b(next);
                if (z) {
                    g.d(c, b2, true, false);
                } else {
                    g.d(c, b2, false, false);
                }
            }
        }
    }

    public void d(g.i.c.a.a.s.i iVar, int i2) {
    }

    public final Map<String, Object> f(String str, g.i.c.a.a.s.i iVar) {
        return e.e.i.b.w(str, iVar.c(), iVar.c);
    }
}
