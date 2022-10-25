package g.i.c.a.a.s;

import android.graphics.Rect;
import android.view.View;
import e.e.i.b;
import g.i.c.a.a.o.c;
import g.i.c.a.a.o.e;
import java.util.Set;

public class h implements e<c> {
    public i a;
    public View b;
    public Set<View> c;

    /* renamed from: d  reason: collision with root package name */
    public i f4500d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4501e = false;

    public h(View view, Set set, g gVar) {
        this.b = view;
        this.c = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (1 == r11.intValue()) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r9, g.i.c.a.a.o.c r10, g.i.c.a.a.o.b r11) {
        /*
            r8 = this;
            g.i.c.a.a.r.e r10 = g.i.c.a.a.r.e.b.a
            g.i.c.a.a.a r0 = r10.d()
            double r0 = r0.f4389e
            boolean r2 = r10.a
            java.lang.String r3 = "PageFinder"
            if (r2 == 0) goto L_0x0032
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onExposed: view = "
            r2.append(r4)
            r2.append(r9)
            java.lang.String r4 = ", exposureInfo = "
            r2.append(r4)
            r2.append(r11)
            java.lang.String r4 = ", exposureMinRate = "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            g.c.b.b.f.w(r3, r2)
        L_0x0032:
            double r4 = r11.c
            r6 = 0
            double r0 = java.lang.Math.max(r0, r6)
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x003f
            return
        L_0x003f:
            g.i.c.a.a.s.i r9 = e.e.i.b.m(r9)
            if (r9 == 0) goto L_0x00fb
            java.lang.Object r11 = r9.c()
            g.i.c.a.a.l.b r11 = g.i.c.a.a.l.a.a(r11)
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x007b
            java.lang.String r2 = "page_report_ignore"
            java.lang.Object r11 = g.h.a.a.C(r11, r2)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r10.a
            if (r10 == 0) goto L_0x0071
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "isIgnorePageInOutEvent: ignoreReport="
            r10.append(r2)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            g.c.b.b.f.w(r3, r10)
        L_0x0071:
            if (r11 == 0) goto L_0x007b
            boolean r10 = r11.booleanValue()
            if (r10 == 0) goto L_0x007b
            r10 = 1
            goto L_0x007c
        L_0x007b:
            r10 = 0
        L_0x007c:
            if (r10 == 0) goto L_0x0080
            goto L_0x00fb
        L_0x0080:
            g.i.c.a.a.s.i r10 = r8.f4500d
            if (r10 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            boolean r11 = r8.f4501e
            if (r11 != 0) goto L_0x008d
            r10.f4502d = r9
        L_0x008b:
            r8.f4500d = r9
        L_0x008d:
            g.i.c.a.a.s.i r10 = r8.a
            if (r10 != 0) goto L_0x00b5
            r8.a = r9
            android.view.View r10 = r9.e()
            android.graphics.Rect r11 = g.i.c.a.a.b0.n.a
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            if (r10 != 0) goto L_0x00a1
            goto L_0x00b3
        L_0x00a1:
            android.view.ViewParent r2 = r10.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x00b3
            android.view.ViewParent r10 = r10.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r11.add(r10)
            goto L_0x00a1
        L_0x00b3:
            r8.c = r11
        L_0x00b5:
            android.view.View r10 = r8.b
            java.lang.String r11 = "page_link_enable"
            java.lang.Object r10 = g.i.c.a.a.l.c.e(r10, r11)
            if (r10 != 0) goto L_0x00c8
            g.i.c.a.a.r.e r10 = g.i.c.a.a.r.e.b.a
            g.i.c.a.a.a r10 = r10.d()
            boolean r10 = r10.v
            goto L_0x00d7
        L_0x00c8:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x00d6
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r10 != 0) goto L_0x00da
            goto L_0x00f6
        L_0x00da:
            g.i.c.a.a.r.e r10 = g.i.c.a.a.r.e.b.a
            java.lang.Object r11 = r9.c()
            java.lang.Integer r11 = r10.e(r11)
            if (r11 != 0) goto L_0x00ee
            android.view.View r9 = r9.e()
            java.lang.Integer r11 = r10.e(r9)
        L_0x00ee:
            if (r11 == 0) goto L_0x00f7
            int r9 = r11.intValue()
            if (r1 != r9) goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            if (r0 == 0) goto L_0x00fb
            r8.f4501e = r1
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.s.h.a(android.view.View, g.i.c.a.a.o.c, g.i.c.a.a.o.b):void");
    }

    public void b(View view, c cVar) {
    }

    public final c c() {
        return new c();
    }

    public boolean d(View view, c cVar) {
        if (this.f4501e) {
            return false;
        }
        Set<View> set = this.c;
        return (b.F(set) || view == null) ? false : set.contains(view);
    }

    public Rect e() {
        return null;
    }
}
