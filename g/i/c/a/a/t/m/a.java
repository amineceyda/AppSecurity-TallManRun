package g.i.c.a.a.t.m;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;
import e.o.a.a;
import g.c.b.b.f;
import g.i.c.a.a.a0.f;
import g.i.c.a.a.i.b;
import g.i.c.a.a.i.d;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.i;
import g.i.c.a.a.s.n;
import g.i.c.a.a.t.k.l;
import g.i.c.a.a.t.m.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class a extends a.C0052a implements AbsListView.OnScrollListener, g.i.c.a.a.a0.c, ViewGroup.OnHierarchyChangeListener {
    public final WeakHashMap<ViewPager, ViewPager.h> b = new WeakHashMap<>();
    public final Set<View> c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d  reason: collision with root package name */
    public final d f4544d;

    public class b implements ViewPager.h {
        public WeakReference<ViewPager> a;

        public b(ViewPager viewPager) {
            this.a = new WeakReference<>(viewPager);
        }

        public void a(int i2, float f2, int i3) {
        }

        public void b(int i2) {
            if (e.b.a.a) {
                f.w("ScrollStateObserver", "ViewPager.onPageScrollStateChanged: state = " + i2);
            }
            ViewPager viewPager = (ViewPager) this.a.get();
            if (viewPager != null) {
                a aVar = a.this;
                boolean z = i2 != 0;
                Set<View> set = aVar.c;
                if (z) {
                    set.add(viewPager);
                } else {
                    set.remove(viewPager);
                }
                a.this.d(viewPager, i2);
            }
        }

        public void c(int i2) {
        }
    }

    public class c extends g.i.c.a.a.i.a {
        public c(C0181a aVar) {
        }

        public void d(AbsListView absListView, int i2) {
            if (e.b.a.a) {
                f.w("ScrollStateObserver", "onListScrollStateChanged: scrollState=" + i2);
            }
            a.this.onScrollStateChanged(absListView, i2);
        }

        public void i(e.o.a.a aVar) {
            throw null;
        }

        public void r(ViewPager viewPager) {
            a.this.b(viewPager);
        }
    }

    public a() {
        c cVar = new c((C0181a) null);
        this.f4544d = cVar;
        b.C0166b.a.b.c.a(cVar);
        f.a.a.a = this;
    }

    public void a(e.o.a.a aVar) {
        aVar.removeOnScrollListener(this);
        aVar.addOnScrollListener(this);
        aVar.removeOnChildAttachStateChangeListener(this);
        if (c(aVar)) {
            aVar.addOnChildAttachStateChangeListener(this);
        }
    }

    public void b(ViewPager viewPager) {
        if (this.b.get(viewPager) == null) {
            b bVar = new b(viewPager);
            this.b.put(viewPager, bVar);
            if (viewPager.i0 == null) {
                viewPager.i0 = new ArrayList();
            }
            viewPager.i0.add(bVar);
        }
    }

    public abstract boolean c(View view);

    public abstract void d(View view, int i2);

    public void onChildViewAdded(View view, View view2) {
        if (c(view)) {
            b bVar = b.c.a;
            Objects.requireNonNull(bVar);
            g.i.c.a.a.z.a.a("onChildViewAttached");
            if (bVar.a != 0) {
                g.i.c.a.a.l.b a = g.i.c.a.a.l.c.a(view2, false);
                if (a != null) {
                    g.i.c.a.a.l.c.g(a, "element_exposure_time", Long.valueOf(System.currentTimeMillis()));
                    Object C = g.h.a.a.C(a, "element_identifier");
                    Object obj = null;
                    String str = C instanceof String ? (String) C : null;
                    i iVar = n.d.a.b;
                    if (l.e(iVar != null ? iVar.c() : null, str, view2, true)) {
                        bVar.b.add(a);
                        if (iVar != null) {
                            obj = iVar.c();
                        }
                        g.i.c.a.a.t.k.a w = g.h.a.a.w(obj, view2, str, true);
                        if (w == null) {
                            w = new g.i.c.a.a.t.k.a();
                            g.h.a.a.U(obj, view2, str, w, true);
                        }
                        if (w.a()) {
                            w.b = false;
                        }
                        w.a = SystemClock.elapsedRealtime();
                        g.i.c.a.a.l.c.g(a, "element_is_first_scroll_exposure", String.valueOf(w.b ^ true ? 1 : 0));
                        g.i.c.a.a.l.c.g(a, "element_exposure_reuseid", str);
                    }
                }
                g.i.c.a.a.z.a.b("onChildViewAttached");
            }
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        if (c(view)) {
            b bVar = b.c.a;
            Objects.requireNonNull(bVar);
            g.i.c.a.a.z.a.a("onChildViewDetached");
            if (bVar.a != 0) {
                g.i.c.a.a.l.b a = g.i.c.a.a.l.c.a(view2, false);
                if (bVar.b.contains(a)) {
                    Object C = g.h.a.a.C(a, "element_identifier");
                    Object obj = null;
                    String str = C instanceof String ? (String) C : null;
                    i iVar = n.d.a.b;
                    if (iVar != null) {
                        obj = iVar.c();
                    }
                    g.i.c.a.a.t.k.a w = g.h.a.a.w(obj, view2, str, true);
                    if (w == null) {
                        w = new g.i.c.a.a.t.k.a();
                        g.h.a.a.U(obj, view2, str, w, true);
                    }
                    w.b = true;
                    bVar.b.remove(a);
                    g.i.c.a.a.l.b a2 = a.a();
                    bVar.c.add(a2);
                    g.i.c.a.a.l.c.g(a2, "element_exposure_interval_time", String.valueOf(System.currentTimeMillis() - ((Long) g.h.a.a.A(a2, "element_exposure_time")).longValue()));
                    if (l.d(view2, true)) {
                        bVar.f4545d.add(a2);
                    }
                }
                g.i.c.a.a.z.a.b("onChildViewDetached");
            }
        }
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (e.b.a.a) {
            g.c.b.b.f.w("ScrollStateObserver", "AbsListView.onScrollStateChanged: scrollState = " + i2);
        }
        if (i2 != 0) {
            this.c.add(absListView);
        } else {
            this.c.remove(absListView);
        }
        d(absListView, i2);
    }
}
