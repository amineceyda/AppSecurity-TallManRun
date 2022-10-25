package g.i.c.a.a.t.m;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Toast;
import g.c.b.b.f;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.p;
import g.i.c.a.a.t.m.b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

public class c extends g.i.c.a.a.i.a {
    public C0183c a = new C0183c((a) null);
    public Handler b = new Handler(Looper.getMainLooper());
    public d c = new d((a) null);

    /* renamed from: d  reason: collision with root package name */
    public boolean f4548d = false;

    public static class b {
        public static final c a = new c((a) null);
    }

    /* renamed from: g.i.c.a.a.t.m.c$c  reason: collision with other inner class name */
    public static class C0183c implements Runnable {
        public Set<View> b = Collections.newSetFromMap(new WeakHashMap());

        public C0183c(a aVar) {
        }

        public void run() {
            if (!this.b.isEmpty()) {
                for (View z : this.b) {
                    p.e.a.z(z);
                }
                this.b.clear();
            }
        }
    }

    public static class d extends a {
        public d(a aVar) {
        }

        public boolean c(View view) {
            Object d2 = g.i.c.a.a.l.c.d(view, "element_scroll_exposure");
            if (d2 instanceof Boolean) {
                return ((Boolean) d2).booleanValue();
            }
            return false;
        }

        public void d(View view, int i2) {
            if (c(view) && ((view instanceof AbsListView) || (view instanceof e.o.a.a))) {
                b bVar = b.c.a;
                bVar.a = i2;
                if (i2 == 0) {
                    b.C0182b bVar2 = bVar.f4547f;
                    Objects.requireNonNull(bVar2);
                    bVar2.b = new WeakReference<>(view);
                    bVar.f4546e.b(bVar.f4547f);
                    bVar.f4546e.a(bVar.f4547f, 20);
                }
            }
            if (i2 == 0) {
                p.e.a.z(view);
            }
        }
    }

    public c(a aVar) {
        b.C0166b.a.b.c.a(this);
    }

    public static c t() {
        return b.a;
    }

    public void f(ViewGroup viewGroup, View view, long j2) {
        e eVar = e.b.a;
        if (eVar.a) {
            f.K("ScrollableViewObserver", "onViewReused: parent=" + viewGroup + ", view=" + view);
        }
        if (viewGroup != null) {
            if (!(this.c.c.size() > 0)) {
                this.b.removeCallbacks(this.a);
                this.a.b.add(viewGroup);
                this.b.post(this.a);
            }
        } else if (eVar.a) {
            String string = view.getContext().getString(2131821431);
            if (!this.f4548d) {
                this.f4548d = true;
                Toast.makeText(g.i.c.a.a.b0.f.c(), string, 1).show();
            }
            f.x("ScrollableViewObserver", string);
        }
    }
}
