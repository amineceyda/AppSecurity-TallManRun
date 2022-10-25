package g.i.c.a.a.s;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import e.e.i.b;
import g.i.c.a.a.i.a;
import g.i.c.a.a.l.c;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class k extends a {
    public final n a;
    public final Rect b = new Rect();
    public final Map<View, Set<View>> c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f4503d = false;

    public k(n nVar) {
        this.a = nVar;
    }

    public void a(Object obj, Window window, MotionEvent motionEvent, boolean z, boolean z2) {
        View view;
        if (z2) {
            n nVar = this.a;
            boolean z3 = nVar.c;
            i iVar = nVar.b;
            boolean z4 = false;
            if (!(motionEvent.getAction() == 0 || z3 || iVar == null)) {
                Object c2 = iVar.c();
                View e2 = iVar.e();
                if (!(c2 == null || e2 == null)) {
                    Object e3 = c.e(c2, "page_interactive_flag");
                    if (!(e3 instanceof Boolean) || !((Boolean) e3).booleanValue()) {
                        if (window == null) {
                            view = null;
                        } else {
                            view = window.getDecorView();
                        }
                        View rootView = e2.getRootView();
                        if (view != null && view == rootView && e2.getGlobalVisibleRect(this.b) && this.b.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            Set set = this.c.get(e2);
                            if (set == null) {
                                set = Collections.newSetFromMap(new WeakHashMap());
                                Object obj2 = e2;
                                while (obj2 instanceof View) {
                                    View view2 = (View) obj2;
                                    set.add(view2);
                                    obj2 = view2.getParent();
                                }
                                this.c.put(e2, set);
                            }
                            if (!set.isEmpty()) {
                                z4 = t(view, e2, set);
                            }
                        }
                    }
                }
            }
            this.f4503d = z4;
        } else if (z && this.f4503d) {
            c.j(this.a.b.c(), "page_interactive_flag", Boolean.TRUE);
        }
    }

    public final boolean t(View view, View view2, Set<View> set) {
        if (view == view2) {
            return true;
        }
        if (!set.contains(view)) {
            return false;
        }
        Object r = !(view instanceof ViewGroup) ? Boolean.FALSE : b.r(ViewGroup.class, "mFirstTouchTarget", view);
        if (r == null) {
            return false;
        }
        while (r != null) {
            Object s = b.s("child", r);
            if ((s instanceof View) && t((View) s, view2, set)) {
                return true;
            }
            r = b.s("next", r);
        }
        return false;
    }
}
