package g.i.c.a.a.t.k;

import android.text.TextUtils;
import android.view.View;
import g.h.a.a;
import g.i.c.a.a.k.c;
import g.i.c.a.a.l.b;
import g.i.c.a.a.r.e;

public class l {
    public static boolean a(b bVar) {
        return bVar == null || TextUtils.isEmpty(a.y(bVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.lang.ref.WeakReference) g.h.a.a.C(r3, "logic_parent");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View b(android.view.View r2, g.i.c.a.a.l.b r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            goto L_0x000e
        L_0x0004:
            java.lang.String r1 = "logic_parent"
            java.lang.Object r3 = g.h.a.a.C(r3, r1)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 != 0) goto L_0x0010
        L_0x000e:
            r3 = r0
            goto L_0x0016
        L_0x0010:
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
        L_0x0016:
            if (r3 == 0) goto L_0x0019
            return r3
        L_0x0019:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0024
            r0 = r2
            android.view.View r0 = (android.view.View) r0
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.t.k.l.b(android.view.View, g.i.c.a.a.l.b):android.view.View");
    }

    public static boolean c(b bVar) {
        if (a(bVar)) {
            return false;
        }
        g.i.c.a.a.k.a aVar = (g.i.c.a.a.k.a) a.C(bVar, "element_click_policy");
        if (aVar == null) {
            aVar = e.b.a.d().f4394j;
        }
        if (aVar == g.i.c.a.a.k.a.REPORT_ALL) {
            return true;
        }
        return false;
    }

    public static boolean d(View view, boolean z) {
        g.i.c.a.a.k.b bVar;
        b a = g.i.c.a.a.l.a.a(view);
        if (a(a)) {
            return false;
        }
        if (z) {
            bVar = (g.i.c.a.a.k.b) a.C(a, "element_scroll_end_expose_policy");
            if (bVar == null) {
                bVar = e.b.a.d().n;
            }
        } else {
            bVar = (g.i.c.a.a.k.b) a.C(a, "element_end_expose_policy");
            if (bVar == null) {
                bVar = e.b.a.d().f4396l;
            }
        }
        if (g.i.c.a.a.k.b.REPORT_ALL == bVar) {
            return true;
        }
        return false;
    }

    public static boolean e(Object obj, String str, View view, boolean z) {
        c cVar;
        b a = g.i.c.a.a.l.a.a(view);
        if (a(a)) {
            return false;
        }
        if (z) {
            cVar = (c) a.C(a, "element_scroll_expose_policy");
            if (cVar == null) {
                cVar = e.b.a.d().f4397m;
            }
        } else {
            cVar = (c) a.C(a, "element_expose_policy");
            if (cVar == null) {
                cVar = e.b.a.d().f4395k;
            }
        }
        if (cVar == c.REPORT_NONE) {
            return false;
        }
        if (cVar == c.REPORT_ALL) {
            return true;
        }
        if (cVar != c.REPORT_FIRST) {
            return false;
        }
        a w = a.w(obj, view, str, z);
        if (w != null && w.b) {
            return w.a();
        }
        return true;
    }
}
