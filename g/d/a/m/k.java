package g.d.a.m;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import g.d.a.b;
import g.d.a.g;
import g.i.c.a.a.q.c.c;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
public class k extends c {
    public final a b;
    public final m c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final Set<k> f2632d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public g f2633e;

    /* renamed from: f  reason: collision with root package name */
    public k f2634f;

    /* renamed from: g  reason: collision with root package name */
    public Fragment f2635g;

    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        a aVar = new a();
        this.b = aVar;
    }

    public final void a(Activity activity) {
        b();
        l lVar = b.b(activity).f2320g;
        Objects.requireNonNull(lVar);
        k j2 = lVar.j(activity.getFragmentManager(), (Fragment) null, l.l(activity));
        this.f2634f = j2;
        if (!equals(j2)) {
            this.f2634f.f2632d.add(this);
        }
    }

    public final void b() {
        k kVar = this.f2634f;
        if (kVar != null) {
            kVar.f2632d.remove(this);
            this.f2634f = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.b.c();
        b();
    }

    public void onDetach() {
        super.onDetach();
        b();
    }

    public void onStart() {
        super.onStart();
        this.b.d();
    }

    public void onStop() {
        super.onStop();
        this.b.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f2635g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
