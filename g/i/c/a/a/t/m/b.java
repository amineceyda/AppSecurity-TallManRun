package g.i.c.a.a.t.m;

import android.view.View;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.i.c.a.a.b0.c;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.g;
import g.i.c.a.a.u.a;
import g.i.c.a.a.u.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class b {
    public int a = 0;
    public ArrayList<g.i.c.a.a.l.b> b = new ArrayList<>();
    public ArrayList<g.i.c.a.a.l.b> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<g.i.c.a.a.l.b> f4545d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public g.i.c.a.a.b0.c f4546e = new g.i.c.a.a.b0.c();

    /* renamed from: f  reason: collision with root package name */
    public C0182b f4547f = new C0182b((a) null);

    /* renamed from: g.i.c.a.a.t.m.b$b  reason: collision with other inner class name */
    public class C0182b extends c.b {
        public WeakReference<View> b;

        public C0182b(a aVar) {
        }

        public void a(int i2) {
            WeakReference<View> weakReference = this.b;
            if (weakReference != null && weakReference.get() != null) {
                b bVar = b.this;
                View view = (View) this.b.get();
                Objects.requireNonNull(bVar);
                g.i.c.a.a.z.a.a("scrollEventReport");
                if (bVar.a == 0) {
                    d e2 = e.e.i.b.e(view);
                    int size = bVar.c.size();
                    g.i.c.a.a.z.a.a("scrollEventReport start " + size);
                    Iterator<g.i.c.a.a.l.b> it = bVar.c.iterator();
                    while (it.hasNext()) {
                        g.i.c.a.a.l.b next = it.next();
                        d a = e2.a();
                        a.a.addFirst(next);
                        bVar.a(view, "imp", next, a);
                    }
                    g.i.c.a.a.z.a.b("scrollEventReport start " + size);
                    int size2 = bVar.f4545d.size();
                    g.i.c.a.a.z.a.a("scrollEventReport end " + size2);
                    Iterator<g.i.c.a.a.l.b> it2 = bVar.f4545d.iterator();
                    while (it2.hasNext()) {
                        g.i.c.a.a.l.b next2 = it2.next();
                        d a2 = e2.a();
                        a2.a.addFirst(next2);
                        bVar.a(view, "imp_end", next2, a2);
                    }
                    g.i.c.a.a.z.a.b("scrollEventReport end " + size2);
                    bVar.b.clear();
                    bVar.c.clear();
                    bVar.f4545d.clear();
                    g.i.c.a.a.z.a.b("scrollEventReport");
                }
            }
        }
    }

    public static class c {
        public static final b a = new b();
    }

    public final void a(View view, String str, g.i.c.a.a.l.b bVar, d dVar) {
        Object obj;
        String str2;
        g.i.c.a.a.u.c a2 = a.b.a.a(str, dVar);
        if (a2 != null) {
            a2.a = str;
            a2.b = g.i.c.a.a.l.c.c(view);
            g.i.c.a.a.c cVar = e.b.a.f4498g;
            if (cVar != null) {
                cVar.b(str, a2.c);
            }
            a2.b("dt_ele_scroll_flag", SLAConstant.TYPE_DEPRECATED_START);
            if (str.equals("imp")) {
                a2.b("dt_ele_is_first_scroll_imp", g.h.a.a.A(bVar, "element_is_first_scroll_exposure"));
                a2.b("dt_ele_is_first_imp", "0");
                obj = g.h.a.a.A(bVar, "element_exposure_reuseid");
                str2 = "dt_ele_reuse_id";
            } else {
                if (str.equals("imp_end")) {
                    a2.b("element_lvtm", g.h.a.a.A(bVar, "element_exposure_interval_time"));
                    obj = "";
                    a2.b("dt_element_area", obj);
                    a2.b("dt_ele_imp_rate", obj);
                    str2 = "dt_ele_imp_area";
                }
                g.d((Object) null, a2, false, false);
            }
            a2.b(str2, obj);
            g.d((Object) null, a2, false, false);
        }
    }
}
