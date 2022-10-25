package e.h.b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class v {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public final FragmentManager b;

    public static final class a {
    }

    public v(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.q.c;
        Fragment fragment2 = fragmentManager.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.q.c;
        Fragment fragment2 = fragmentManager.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z) {
                throw null;
            }
        }
    }
}
