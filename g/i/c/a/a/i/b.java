package g.i.c.a.a.i;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import g.c.b.b.f;
import g.i.c.a.a.b0.g;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.i.e.h;
import g.i.c.a.a.i.e.j;
import g.i.c.a.a.r.e;

public class b implements Application.ActivityLifecycleCallbacks {
    public c b = new c();

    /* renamed from: g.i.c.a.a.i.b$b  reason: collision with other inner class name */
    public static class C0166b {
        public static b a = new b((a) null);
    }

    public b(a aVar) {
    }

    public final void a(Object obj, Window window, MotionEvent motionEvent, boolean z, boolean z2) {
        g.i.c.a.a.i.e.b bVar = (g.i.c.a.a.i.e.b) g.a(10);
        bVar.d(obj, window, motionEvent, z, z2);
        this.b.b(obj.hashCode() + "_" + motionEvent.getAction() + "_" + z2, bVar);
    }

    public void b(Activity activity, Configuration configuration) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityConfigurationChanged: activity=");
            i2.append(activity.getClass().getName());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            g.i.c.a.a.i.e.a aVar = (g.i.c.a.a.i.e.a) g.a(9);
            aVar.d(activity, configuration);
            this.b.a(activity, aVar);
        }
    }

    public void c(Activity activity, MotionEvent motionEvent, boolean z, boolean z2) {
        a(activity, activity.getWindow(), motionEvent, z, z2);
    }

    public void d(g.i.c.a.a.q.c.a aVar) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onFragmentDestroyView: fragment = ");
            i2.append(g.i.c.a.a.q.c.a.class.getName());
            i2.append(aVar.hashCode());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            this.b.n(aVar);
        }
    }

    public void e(g.i.c.a.a.q.c.a aVar) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onFragmentPaused: fragment = ");
            i2.append(g.i.c.a.a.q.c.a.class.getName());
            i2.append(aVar.hashCode());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            this.b.o(aVar);
        }
    }

    public void f(g.i.c.a.a.q.c.a aVar) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onFragmentResumed: fragment = ");
            i2.append(g.i.c.a.a.q.c.a.class.getName());
            i2.append(aVar.hashCode());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            this.b.p(aVar);
        }
    }

    public void g(AdapterView adapterView, View view, int i2) {
        String str;
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i3 = g.a.a.a.a.i("onItemClick, parent = ");
            if (adapterView == null) {
                str = "null";
            } else {
                str = adapterView.getClass().getSimpleName();
            }
            i3.append(str);
            i3.append(", view = ");
            i3.append(n.b(view));
            i3.append(", position = ");
            i3.append(i2);
            f.K("EventCollector", i3.toString());
        }
        if (eVar.i()) {
            h hVar = (h) g.a(3);
            hVar.d(view);
            this.b.a(view, hVar);
        }
    }

    public void h(int i2, View view, ViewGroup viewGroup, long j2) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i3 = g.a.a.a.a.i("onListGetView, parent = ");
            i3.append(n.b(viewGroup));
            i3.append(", convertView = ");
            i3.append(n.b(view));
            i3.append(", position = ");
            i3.append(i2);
            f.K("EventCollector", i3.toString());
        }
        if (eVar.i() && view != null) {
            j jVar = (j) g.a(5);
            jVar.d(viewGroup, view, j2);
            this.b.a(view, jVar);
        }
    }

    public void i(AbsListView absListView, int i2) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i3 = g.a.a.a.a.i("onListScrollStateChanged, view = ");
            i3.append(n.b(absListView));
            i3.append(", scrollState = ");
            i3.append(i2);
            f.K("EventCollector", i3.toString());
        }
        if (eVar.i()) {
            g.i.c.a.a.i.e.e eVar2 = (g.i.c.a.a.i.e.e) g.a(1);
            eVar2.d(absListView, i2);
            this.b.a(absListView, eVar2);
        }
    }

    public void j(View view) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onViewClicked, view = ");
            i2.append(n.b(view));
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            h hVar = (h) g.a(3);
            hVar.d(view);
            this.b.a(view, hVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityCreated: activity=");
            i2.append(activity.getClass().getName());
            f.w("EventCollector", i2.toString());
        }
        this.b.f(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityDestroyed: activity=");
            i2.append(activity.getClass().getName());
            f.K("EventCollector", i2.toString());
        }
        this.b.g(activity);
    }

    public void onActivityPaused(Activity activity) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityPause: activity = ");
            i2.append(activity.getClass().getName());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            this.b.h(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityResumed: activity = ");
            i2.append(activity.getClass().getName());
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            this.b.i(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivitySaveInstanceState: activity=");
            i2.append(activity.getClass().getName());
            f.w("EventCollector", i2.toString());
        }
    }

    public void onActivityStarted(Activity activity) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityStarted: activity = ");
            i2.append(activity.getClass().getName());
            f.K("EventCollector", i2.toString());
        }
        this.b.j(activity);
    }

    public void onActivityStopped(Activity activity) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onActivityStopped: activity=");
            i2.append(activity.getClass().getName());
            f.K("EventCollector", i2.toString());
        }
        this.b.k(activity);
    }
}
