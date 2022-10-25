package e.h.b;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.e.f.a;
import e.e.j.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public abstract class q0 {
    public final ViewGroup a;
    public final ArrayList<d> b = new ArrayList<>();
    public final ArrayList<d> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1492d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1493e = false;

    public class a implements Runnable {
        public final /* synthetic */ c b;

        public a(c cVar) {
            this.b = cVar;
        }

        public void run() {
            if (q0.this.b.contains(this.b)) {
                c cVar = this.b;
                cVar.a.a(cVar.c.mView);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ c b;

        public b(c cVar) {
            this.b = cVar;
        }

        public void run() {
            q0.this.b.remove(this.b);
            q0.this.c.remove(this.b);
        }
    }

    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final a0 f1494h;

        public c(d.c cVar, d.b bVar, a0 a0Var, e.e.f.a aVar) {
            super(cVar, bVar, a0Var.c, aVar);
            this.f1494h = a0Var;
        }

        public void b() {
            super.b();
            this.f1494h.k();
        }

        public void d() {
            if (this.b == d.b.ADDING) {
                Fragment fragment = this.f1494h.c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.N(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = this.c.requireView();
                if (requireView.getParent() == null) {
                    this.f1494h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    public static class d {
        public c a;
        public b b;
        public final Fragment c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f1495d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<e.e.f.a> f1496e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1497f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1498g = false;

        public class a implements a.C0042a {
            public a() {
            }

            public void a() {
                d.this.a();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(g.a.a.a.a.q("Unknown visibility ", i2));
            }

            public static c d(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i2;
                int ordinal = ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (FragmentManager.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i2 = 0;
                    } else if (ordinal == 2) {
                        if (FragmentManager.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i2 = 8;
                    } else if (ordinal == 3) {
                        if (FragmentManager.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        i2 = 4;
                    } else {
                        return;
                    }
                    view.setVisibility(i2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.N(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public d(c cVar, b bVar, Fragment fragment, e.e.f.a aVar) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            aVar.b(new a());
        }

        public final void a() {
            if (!this.f1497f) {
                this.f1497f = true;
                if (this.f1496e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.f1496e).iterator();
                while (it.hasNext()) {
                    ((e.e.f.a) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f1498g) {
                if (FragmentManager.N(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1498g = true;
                for (Runnable run : this.f1495d) {
                    run.run();
                }
            }
        }

        public final void c(c cVar, b bVar) {
            b bVar2;
            c cVar2 = c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (FragmentManager.N(2)) {
                            StringBuilder i2 = g.a.a.a.a.i("SpecialEffectsController: For fragment ");
                            i2.append(this.c);
                            i2.append(" mFinalState = ");
                            i2.append(this.a);
                            i2.append(" -> REMOVED. mLifecycleImpact  = ");
                            i2.append(this.b);
                            i2.append(" to REMOVING.");
                            Log.v("FragmentManager", i2.toString());
                        }
                        this.a = cVar2;
                        bVar2 = b.REMOVING;
                    } else {
                        return;
                    }
                } else if (this.a == cVar2) {
                    if (FragmentManager.N(2)) {
                        StringBuilder i3 = g.a.a.a.a.i("SpecialEffectsController: For fragment ");
                        i3.append(this.c);
                        i3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        i3.append(this.b);
                        i3.append(" to ADDING.");
                        Log.v("FragmentManager", i3.toString());
                    }
                    this.a = c.VISIBLE;
                    bVar2 = b.ADDING;
                } else {
                    return;
                }
                this.b = bVar2;
            } else if (this.a != cVar2) {
                if (FragmentManager.N(2)) {
                    StringBuilder i4 = g.a.a.a.a.i("SpecialEffectsController: For fragment ");
                    i4.append(this.c);
                    i4.append(" mFinalState = ");
                    i4.append(this.a);
                    i4.append(" -> ");
                    i4.append(cVar);
                    i4.append(". ");
                    Log.v("FragmentManager", i4.toString());
                }
                this.a = cVar;
            }
        }

        public void d() {
        }

        public String toString() {
            StringBuilder l2 = g.a.a.a.a.l("Operation ", "{");
            l2.append(Integer.toHexString(System.identityHashCode(this)));
            l2.append("} ");
            l2.append("{");
            l2.append("mFinalState = ");
            l2.append(this.a);
            l2.append("} ");
            l2.append("{");
            l2.append("mLifecycleImpact = ");
            l2.append(this.b);
            l2.append("} ");
            l2.append("{");
            l2.append("mFragment = ");
            l2.append(this.c);
            l2.append("}");
            return l2.toString();
        }
    }

    public q0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static q0 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.L());
    }

    public static q0 g(ViewGroup viewGroup, r0 r0Var) {
        Object tag = viewGroup.getTag(2131297581);
        if (tag instanceof q0) {
            return (q0) tag;
        }
        Objects.requireNonNull((FragmentManager.f) r0Var);
        b bVar = new b(viewGroup);
        viewGroup.setTag(2131297581, bVar);
        return bVar;
    }

    public final void a(d.c cVar, d.b bVar, a0 a0Var) {
        synchronized (this.b) {
            e.e.f.a aVar = new e.e.f.a();
            d d2 = d(a0Var.c);
            if (d2 != null) {
                d2.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, a0Var, aVar);
            this.b.add(cVar2);
            cVar2.f1495d.add(new a(cVar2));
            cVar2.f1495d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z);

    public void c() {
        if (!this.f1493e) {
            ViewGroup viewGroup = this.a;
            WeakHashMap<View, String> weakHashMap = q.a;
            if (!viewGroup.isAttachedToWindow()) {
                e();
                this.f1492d = false;
                return;
            }
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (FragmentManager.N(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                        }
                        dVar.a();
                        if (!dVar.f1498g) {
                            this.c.add(dVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((d) it2.next()).d();
                    }
                    b(arrayList2, this.f1492d);
                    this.f1492d = false;
                }
            }
        }
    }

    public final d d(Fragment fragment) {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.c.equals(fragment) && !next.f1497f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.a;
        WeakHashMap<View, String> weakHashMap = q.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            i();
            Iterator<d> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (FragmentManager.N(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (FragmentManager.N(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.b) {
            i();
            this.f1493e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.b.get(size);
                d.c d2 = d.c.d(dVar.c.mView);
                d.c cVar = dVar.a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && d2 != cVar2) {
                    this.f1493e = dVar.c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.b == d.b.ADDING) {
                next.c(d.c.b(next.c.requireView().getVisibility()), d.b.NONE);
            }
        }
    }
}
