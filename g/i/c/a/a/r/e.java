package g.i.c.a.a.r;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import g.i.c.a.a.b0.o;
import g.i.c.a.a.i.b;
import g.i.c.a.a.j.c;
import g.i.c.a.a.n.c.a;
import g.i.c.a.a.n.h.a.a;
import g.i.c.a.a.s.j;
import g.i.c.a.a.s.n;
import g.i.c.a.a.s.p;
import g.i.c.a.a.s.t;
import g.i.c.a.a.t.g;
import g.i.c.a.a.t.i;
import g.i.c.a.a.t.k.c;
import g.i.c.a.a.t.k.f;
import g.i.c.a.a.t.k.h;
import g.i.c.a.a.u.a;
import g.i.c.a.a.u.d;
import g.i.c.a.a.w.e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class e {
    public boolean a;
    public volatile boolean b;
    public Set<c> c;

    /* renamed from: d  reason: collision with root package name */
    public Collection<c> f4495d;

    /* renamed from: e  reason: collision with root package name */
    public g.i.c.a.a.a f4496e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Object> f4497f;

    /* renamed from: g  reason: collision with root package name */
    public g.i.c.a.a.c f4498g;

    /* renamed from: h  reason: collision with root package name */
    public j f4499h = new j();

    public static class b {
        public static final e a = new e((a) null);
    }

    public e(a aVar) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.f4495d = Collections.unmodifiableCollection(hashSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void l(Object obj, String str) {
        View view;
        Window window;
        if (b(obj)) {
            g.i.c.a.a.l.c.l(obj, str);
            p.w().y(obj);
            if (!TextUtils.isEmpty(str)) {
                j jVar = this.f4499h;
                Objects.requireNonNull(jVar);
                if (obj != null) {
                    if (obj instanceof View) {
                        view = (View) obj;
                    } else {
                        if (obj instanceof Activity) {
                            window = ((Activity) obj).getWindow();
                        } else {
                            if (obj instanceof Dialog) {
                                Dialog dialog = (Dialog) obj;
                                if (dialog.getWindow() != null) {
                                    window = dialog.getWindow();
                                }
                            }
                            view = null;
                        }
                        view = window.getDecorView();
                    }
                    Context b2 = jVar.b(obj, view);
                    if (b2 == null) {
                        jVar.b.add((View) obj);
                        return;
                    }
                    jVar.a(view, b2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void n(Object obj, String str, Object obj2) {
        if (b(obj)) {
            g.i.c.a.a.l.c.m(obj, str, obj2);
        }
    }

    public boolean a(Object obj) {
        return (obj instanceof Dialog) || (obj instanceof View);
    }

    public final boolean b(Object obj) {
        return a(obj) || (obj instanceof Activity);
    }

    public final boolean c(String str, View view, g.i.c.a.a.j.a aVar, Map<String, ?> map) {
        d e2 = e.e.i.b.e(view);
        g.i.c.a.a.u.c a2 = a.b.a.a(str, e2);
        if (a2 == null) {
            return false;
        }
        a2.e(str);
        a2.f(aVar);
        if (map != null) {
            a2.c(map);
        }
        if ("imp".equals(str)) {
            ((h) e.e.i.b.t()).a(new f(view, e2.b(), a2, e2));
        }
        g.b(view, a2);
        return true;
    }

    public g.i.c.a.a.a d() {
        g.i.c.a.a.a aVar = this.f4496e;
        if (aVar != null) {
            return aVar;
        }
        if (g.i.c.a.a.a.y == null) {
            synchronized (g.i.c.a.a.a.class) {
                if (g.i.c.a.a.a.y == null) {
                    g.i.c.a.a.a.y = new g.i.c.a.a.a(g.i.c.a.a.a.x);
                }
            }
        }
        return g.i.c.a.a.a.y;
    }

    public Integer e(Object obj) {
        Object e2 = g.i.c.a.a.l.c.e(obj, "page_launch_mode");
        if (e2 instanceof Integer) {
            return Integer.valueOf(((Integer) e2).intValue());
        }
        return null;
    }

    public final void f() {
        g.i.c.a.a.a0.e.b();
        g.i.c.a.a.t.a.v();
        g.i.c.a.a.t.k.b.t();
        t tVar = t.b.a;
        p.w();
        n.g();
        i.e();
        g.i.c.a.a.t.k.d.h();
        g.i.c.a.a.t.m.c.t();
        g.i.c.a.a.t.k.c.b();
        g.i.c.a.a.t.k.c cVar = c.b.a;
        g.i.c.a.a.n.c.a.t();
        g.i.c.a.a.n.c.a aVar = a.C0170a.a;
        g.i.c.a.a.n.h.a.a.b();
        g.i.c.a.a.n.h.a.a aVar2 = a.b.a;
        g.i.c.a.a.t.l.a.t();
        g.i.c.a.a.w.e.t();
        g.i.c.a.a.w.e eVar = e.a.a;
        g.i.c.a.a.h.d.a();
        g.i.c.a.a.c0.a.a.t();
    }

    public final void g() {
        g.i.c.a.a.t.a.v();
        g.i.c.a.a.n.c.a.t();
        g.i.c.a.a.n.c.a aVar = a.C0170a.a;
        g.i.c.a.a.w.e.t();
        g.i.c.a.a.w.e eVar = e.a.a;
        g.i.c.a.a.h.d.a();
    }

    public final void h(g.i.c.a.a.k.d dVar) {
        if (dVar == g.i.c.a.a.k.d.INIT_ALL) {
            f();
        } else if (dVar == g.i.c.a.a.k.d.INIT_AUDIO) {
            g();
        }
    }

    public boolean i() {
        return d().b;
    }

    public synchronized boolean j() {
        return this.b;
    }

    public Map<String, Object> o(String str, View view) {
        g.i.c.a.a.u.c a2 = a.b.a.a(str, e.e.i.b.e(view));
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(a2.a());
        a2.d();
        g.i.c.a.a.b0.g.b(a2, 6);
        return hashMap;
    }

    public final boolean p(g.i.c.a.a.j.b bVar) {
        if (TextUtils.isEmpty(g.i.c.a.a.l.c.b(bVar.c()))) {
            return false;
        }
        if (bVar.c() instanceof Dialog) {
            Dialog dialog = (Dialog) bVar.c();
            if (dialog.getWindow() != null) {
                return c(bVar.a(), dialog.getWindow().getDecorView(), bVar.d(), bVar.b());
            }
            return false;
        } else if (bVar.c() instanceof View) {
            return c(bVar.a(), (View) bVar.c(), bVar.d(), bVar.b());
        } else {
            return false;
        }
    }

    public final boolean q(g.i.c.a.a.j.b bVar) {
        if (!e.e.i.b.J(bVar.c())) {
            return false;
        }
        g.i.c.a.a.u.c k2 = e.e.i.b.k(bVar.a(), bVar.c());
        k2.f(bVar.d());
        k2.c(bVar.b());
        g.b(bVar.c(), k2);
        return true;
    }

    public boolean r(g.i.c.a.a.j.b bVar) {
        if (this.a) {
            g.c.b.b.f.K("VideoReportInner", "reportEvent: eventData=" + bVar);
        }
        if (TextUtils.isEmpty(bVar.a())) {
            if (!this.a) {
                return false;
            }
            throw new IllegalArgumentException("reportEvent, eventId is empty");
        } else if (bVar.c() == null) {
            g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.i.c.a.a.b0.g.a(6);
            cVar.e(bVar.a());
            cVar.f(bVar.d());
            cVar.c(bVar.b());
            g.b((Object) null, cVar);
            return true;
        } else {
            Object c2 = bVar.c();
            if (!(a(c2) || (c2 instanceof Activity))) {
                return false;
            }
            if (q(bVar)) {
                return true;
            }
            return p(bVar);
        }
    }

    public void s(Object obj, String str, boolean z) {
        if (this.a) {
            g.c.b.b.f.K("VideoReportInner", "setPageId: object=" + obj + ", pageContentId=" + str);
        }
        if (b(obj)) {
            g.i.c.a.a.l.c.k(obj, str);
            if (z) {
                g.i.c.a.a.l.c.j(obj, "page_last_content_id", (Object) null);
            }
        }
    }

    public synchronized void t(Application application, g.i.c.a.a.a aVar, g.i.c.a.a.k.d dVar) {
        if (j()) {
            g.c.b.b.f.w0("VideoReportInner", "startWithConfiguration already initialized");
            return;
        }
        if (!g.i.c.a.a.y.a.c()) {
            g.c.b.b.f.x("VideoReportInner", "We recommend initializing the 大同 SDK in the main thread");
        }
        this.f4496e = aVar;
        if (this.a) {
            g.c.b.b.f.K("VideoReportInner", "startWithConfiguration: application =" + application + ", configuration =" + aVar);
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(b.C0166b.a);
            g.i.c.a.a.b0.f.a = application.getApplicationContext();
            g.i.c.a.a.b0.f.e(application);
            o.b(application);
            e.e.i.b.K(application);
            h(dVar);
        } else if (this.a) {
            throw new NullPointerException("Application = null");
        }
        g.i.c.a.a.w.a.a().c();
        this.b = true;
    }
}
