package g.i.c.a.a.s;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import g.i.c.a.a.a0.d;
import g.i.c.a.a.b0.c;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

public class p extends g.i.c.a.a.i.a implements a.d {
    public final g.i.c.a.a.b0.e<d> a = new g.i.c.a.a.b0.e<>();
    public boolean b = true;
    public Set<Activity> c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d  reason: collision with root package name */
    public g.i.c.a.a.b0.c f4510d = new g.i.c.a.a.b0.c();

    /* renamed from: e  reason: collision with root package name */
    public c f4511e = new c((a) null);

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Activity b;
        public final /* synthetic */ View c;

        public a(Activity activity, View view) {
            this.b = activity;
            this.c = view;
        }

        public void onGlobalLayout() {
            p.this.A(this.b);
            this.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener c;

        public b(p pVar, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.b = view;
            this.c = onGlobalLayoutListener;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this.c);
        }
    }

    public class c extends c.b {
        public WeakReference<Activity> b = new WeakReference<>((Object) null);

        public c(a aVar) {
        }

        public void a(int i2) {
            int i3;
            WeakReference<Activity> weakReference = this.b;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (e.b.a.a) {
                g.c.b.b.f.w("PageSwitchObserver", "PendingTask.run: -------------------------------------------------------------------");
                g.c.b.b.f.w("PageSwitchObserver", "PendingTask.run: activity = " + activity + ", mIsAppForeground = " + p.this.b);
            }
            if (p.this.b && activity != null && !activity.isFinishing()) {
                p pVar = p.this;
                Objects.requireNonNull(pVar);
                String str = "PageSwitchObserver.detectActivity(" + activity.getClass().getSimpleName() + ")";
                g.i.c.a.a.z.a.a(str);
                List<WeakReference<Dialog>> b2 = a.b(activity);
                if (b2 == null) {
                    i3 = 0;
                } else {
                    i3 = b2.size();
                }
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        pVar.v(activity.getWindow(), i2);
                        g.i.c.a.a.z.a.b(str);
                        break;
                    }
                    WeakReference weakReference2 = b2.get(i3);
                    Dialog dialog = weakReference2 == null ? null : (Dialog) weakReference2.get();
                    if (dialog != null && pVar.v(dialog.getWindow(), i2)) {
                        break;
                    }
                }
                this.b = null;
            }
        }
    }

    public interface d {
        void c();

        boolean d(View view);

        void e(i iVar, int i2);
    }

    public static class e {
        public static final p a;

        static {
            p pVar = new p((a) null);
            a = pVar;
            Objects.requireNonNull(pVar);
            b.C0166b.a.b.c.a(pVar);
            a.e.a.s.a(pVar);
        }
    }

    public static class f implements e.b<d> {
        public boolean a;
        public View b;

        public f(View view) {
            this.b = view;
        }

        /* renamed from: b */
        public void a(d dVar) {
            this.a = dVar.d(this.b);
        }
    }

    public p(a aVar) {
    }

    public static p w() {
        return e.a;
    }

    public final void A(Activity activity) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            g.c.b.b.f.w("PageSwitchObserver", "postAppearDetectionTask: activity = " + activity);
        }
        if (activity == null || !g.i.c.a.a.m.d.b.a(activity)) {
            if (eVar.a) {
                g.c.b.b.f.w("PageSwitchObserver", "postAppearDetectionTask: unable to detect activity");
            }
        } else if (this.c.contains(activity)) {
            this.f4510d.b(this.f4511e);
            c cVar = this.f4511e;
            Objects.requireNonNull(cVar);
            cVar.b = new WeakReference<>(activity);
            this.f4510d.a(this.f4511e, 80);
        } else if (eVar.a) {
            g.c.b.b.f.w("PageSwitchObserver", "postAppearDetectionTask: activity is not resumed, skip detection");
        }
    }

    public void b() {
        this.b = true;
    }

    public void c(Activity activity, Dialog dialog) {
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onDialogHide: activity = " + activity + "dialog =" + dialog);
        }
        A(activity);
    }

    public void e(g.i.c.a.a.q.c.a aVar) {
        View view = aVar.a;
        if (view != null) {
            x(aVar.b, view);
        } else if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onFragmentResume: fragment = " + aVar + ", null getView()");
        }
    }

    public void g(g.i.c.a.a.q.c.a aVar) {
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onFragmentPause: fragment=" + aVar);
        }
        A(aVar.b);
    }

    public void j(Activity activity, Configuration configuration) {
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onActivityConfigurationChanged: activity = " + activity);
        }
        t(activity);
    }

    public void k(Activity activity) {
        Window window;
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onActivityPause: activity = " + activity);
        }
        WeakReference<Activity> weakReference = this.f4511e.b;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            if (eVar.a) {
                g.c.b.b.f.w("PageSwitchObserver", "onActivityPause: activity matched, remove idle handler");
            }
            this.f4510d.b(this.f4511e);
        }
        this.c.remove(activity);
        if (eVar.d().q && (window = activity.getWindow()) != null) {
            u(window.getDecorView());
        }
    }

    public void m(g.i.c.a.a.q.c.a aVar) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onFragmentDestroyView: fragment = " + aVar);
        }
        View view = aVar.a;
        if (view != null) {
            u(view);
        } else if (eVar.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onFragmentDestroyView: Fragment = " + aVar + ", null getView()");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onActivityDestroyed: activity = " + activity);
        }
        Window window = activity.getWindow();
        if (window != null) {
            u(window.getDecorView());
        }
    }

    public void p(Activity activity, Dialog dialog) {
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onDialogShow: activity = " + activity + ", dialog = " + dialog);
        }
        A(a.a(dialog));
    }

    public void q(boolean z) {
        if (e.b.a.a) {
            g.c.b.b.f.K("PageSwitchObserver", "onAppOut: ");
        }
        this.b = false;
    }

    public void s(Activity activity) {
        this.c.add(activity);
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onActivityResume: activity = " + activity);
        }
        t(activity);
    }

    public final void t(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            x(activity, decorView);
        } else if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "onActivityResume: activity = " + activity + ", null getView()");
        }
    }

    public final boolean u(View view) {
        if (view == null) {
            return false;
        }
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "notifyPageDestroyed");
        }
        f fVar = new f(view);
        this.a.b(fVar);
        return fVar.a;
    }

    public final boolean v(Window window, int i2) {
        boolean z;
        HashSet hashSet;
        if (window != null) {
            View decorView = window.getDecorView();
            g.i.c.a.a.z.a.a("PagePageFinder.findExposurePage");
            i iVar = null;
            if (!(decorView == null || decorView.getRootView() == null)) {
                Context context = decorView.getRootView().getContext();
                j jVar = e.b.a.f4499h;
                Iterator<View> it = jVar.b.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    Context b2 = jVar.b(next, next);
                    if (b2 != null) {
                        jVar.a(next, b2);
                        it.remove();
                    }
                }
                Set<View> set = jVar.a.get(context);
                if (e.e.i.b.F(set)) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (View view : set) {
                        if (view != null) {
                            hashSet.add(view);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                hashSet.add((View) parent);
                            }
                        }
                    }
                }
                h hVar = new h(decorView.getRootView(), hashSet, (g) null);
                g.h.a.a.t(decorView, false, hVar, d.b.a);
                g.i.c.a.a.z.a.b("PagePageFinder.findExposurePage");
                i iVar2 = hVar.a;
                if (iVar2 != null && e.b.a.a) {
                    g.c.b.b.f.K("PageFinder", "PageLink —— " + iVar2);
                }
                iVar = hVar.a;
            }
            if (iVar == null) {
                g.i.c.a.a.r.e eVar = e.b.a;
                if (eVar.a) {
                    g.c.b.b.f.w("PageSwitchObserver", "detectActivePage: no active page found");
                }
                if (eVar.d().q) {
                    if (eVar.a) {
                        g.c.b.b.f.w("PageSwitchObserver", "notifyPageDisappear");
                    }
                    this.a.b(new r(this));
                }
                z = false;
            } else {
                g.i.c.a.a.r.e eVar2 = e.b.a;
                if (eVar2.a) {
                    g.c.b.b.f.w("PageSwitchObserver", "detectActivePage: active page found, view = " + decorView + ", page = " + iVar);
                }
                if (eVar2.a) {
                    g.c.b.b.f.w("PageSwitchObserver", "notifyPageAppear: page = " + iVar + ", view = " + iVar.e());
                }
                this.a.b(new q(this, iVar, i2));
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void x(Activity activity, View view) {
        boolean e2 = g.i.c.a.a.b0.p.a.e(view);
        if (e.b.a.a) {
            g.c.b.b.f.w("PageSwitchObserver", "laidOutAppear: activity = " + activity + ", isLaidOut = " + e2);
        }
        if (e2) {
            A(activity);
            return;
        }
        a aVar = new a(activity, view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        view.addOnAttachStateChangeListener(new b(this, view, aVar));
    }

    public void y(Object obj) {
        Activity a2;
        if (obj != null) {
            if (e.b.a.a) {
                g.c.b.b.f.w("PageSwitchObserver", "onPageReport: object=" + obj);
            }
            if (obj instanceof Activity) {
                a2 = (Activity) obj;
            } else if (obj instanceof Dialog) {
                a2 = a.a((Dialog) obj);
            } else if (obj instanceof View) {
                z((View) obj);
                return;
            } else {
                return;
            }
            A(a2);
        }
    }

    public void z(View view) {
        if (view != null) {
            if (e.b.a.a) {
                g.c.b.b.f.w("PageSwitchObserver", "onPageViewVisible: view = " + view);
            }
            A(n.a(view));
        }
    }
}
