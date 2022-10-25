package g.i.c.a.a.a0;

import android.view.ViewGroup;
import g.i.c.a.a.r.e;

public class f implements b {
    public c a;

    public static class a {
        public static final f a = new f();
    }

    public f() {
        if (e.b.a.a) {
            g.c.b.b.f.w("ViewTraverser", "ViewTraverser.<init>: ");
        }
    }

    public int a(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public int b(ViewGroup viewGroup) {
        return 0;
    }

    public int c(int i2) {
        return i2 + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.view.View r27, int r28, g.i.c.a.a.a0.a r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            g.i.c.a.a.a0.c r4 = r0.a
            r5 = 0
            if (r4 == 0) goto L_0x005c
            g.i.c.a.a.t.m.a r4 = (g.i.c.a.a.t.m.a) r4
            boolean r6 = r1 instanceof android.widget.AbsListView
            if (r6 == 0) goto L_0x0047
            r6 = r1
            android.widget.AbsListView r6 = (android.widget.AbsListView) r6
            android.graphics.Rect r7 = g.i.c.a.a.b0.n.a
            if (r6 != 0) goto L_0x001c
            r7 = r5
            goto L_0x0024
        L_0x001c:
            java.lang.Class<android.widget.AbsListView> r7 = android.widget.AbsListView.class
            java.lang.String r8 = "mOnScrollListener"
            java.lang.Object r7 = e.e.i.b.r(r7, r8, r6)
        L_0x0024:
            if (r7 != 0) goto L_0x0029
            r6.setOnScrollListener(r4)
        L_0x0029:
            if (r6 != 0) goto L_0x002d
            r7 = r5
            goto L_0x0035
        L_0x002d:
            java.lang.Class<android.view.ViewGroup> r7 = android.view.ViewGroup.class
            java.lang.String r8 = "mOnHierarchyChangeListener"
            java.lang.Object r7 = e.e.i.b.r(r7, r8, r6)
        L_0x0035:
            boolean r8 = r4.c(r6)
            if (r8 == 0) goto L_0x0041
            if (r7 != 0) goto L_0x005c
            r6.setOnHierarchyChangeListener(r4)
            goto L_0x005c
        L_0x0041:
            if (r7 != r4) goto L_0x005c
            r6.setOnHierarchyChangeListener(r5)
            goto L_0x005c
        L_0x0047:
            boolean r6 = r1 instanceof e.o.a.a
            if (r6 == 0) goto L_0x0052
            r6 = r1
            e.o.a.a r6 = (e.o.a.a) r6
            r4.a(r6)
            goto L_0x005c
        L_0x0052:
            boolean r6 = r1 instanceof androidx.viewpager.widget.ViewPager
            if (r6 == 0) goto L_0x005c
            r6 = r1
            androidx.viewpager.widget.ViewPager r6 = (androidx.viewpager.widget.ViewPager) r6
            r4.b(r6)
        L_0x005c:
            r4 = r3
            g.i.c.a.a.o.d r4 = (g.i.c.a.a.o.d) r4
            g.i.c.a.a.o.c r6 = r4.a
            g.i.c.a.a.o.e r7 = r4.b
            boolean r8 = r4.c
            int r9 = r6.a
            r10 = 1
            int r9 = r9 + r10
            r6.a = r9
            g.i.c.a.a.o.f<g.i.c.a.a.o.b> r9 = r6.f4488e
            r9.set(r2, r5)
            boolean r9 = r7.d(r1, r6)
            if (r9 != 0) goto L_0x007b
        L_0x0076:
            r17 = r4
        L_0x0078:
            r8 = 0
            goto L_0x01c8
        L_0x007b:
            int r9 = r27.getVisibility()
            if (r9 == 0) goto L_0x0082
            goto L_0x0076
        L_0x0082:
            g.i.c.a.a.o.f<g.i.c.a.a.o.a> r9 = r6.f4487d
            int r12 = r2 + -1
            java.lang.Object r9 = r9.get(r12)
            g.i.c.a.a.o.a r9 = (g.i.c.a.a.o.a) r9
            android.graphics.Rect r12 = r9.b
            int r12 = r12.left
            int r13 = r27.getLeft()
            int r13 = r13 + r12
            int r12 = r9.f4484d
            int r13 = r13 - r12
            android.graphics.Rect r12 = r9.b
            int r12 = r12.top
            int r14 = r27.getTop()
            int r14 = r14 + r12
            int r12 = r9.f4485e
            int r14 = r14 - r12
            android.graphics.RectF r12 = r6.b
            int r15 = r27.getWidth()
            float r15 = (float) r15
            int r5 = r27.getHeight()
            float r5 = (float) r5
            r10 = 0
            r12.set(r10, r10, r15, r5)
            android.graphics.Matrix r5 = r27.getMatrix()
            boolean r10 = r5.isIdentity()
            if (r10 != 0) goto L_0x00c1
            r5.mapRect(r12)
        L_0x00c1:
            float r5 = (float) r13
            float r10 = (float) r14
            r12.offset(r5, r10)
            g.i.c.a.a.o.f<g.i.c.a.a.o.a> r5 = r6.f4487d
            java.lang.Object r5 = r5.get(r2)
            g.i.c.a.a.o.a r5 = (g.i.c.a.a.o.a) r5
            android.graphics.Rect r10 = r5.a
            float r13 = r12.left
            int r13 = (int) r13
            float r14 = r12.top
            int r14 = (int) r14
            float r15 = r12.right
            int r15 = (int) r15
            float r12 = r12.bottom
            int r12 = (int) r12
            r10.set(r13, r14, r15, r12)
            android.graphics.Rect r12 = r5.b
            r12.set(r10)
            android.graphics.Rect r12 = r9.c
            boolean r12 = r10.intersect(r12)
            if (r12 == 0) goto L_0x00f5
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r12 = 0
            goto L_0x00f6
        L_0x00f5:
            r12 = 1
        L_0x00f6:
            if (r12 == 0) goto L_0x00fa
            goto L_0x0076
        L_0x00fa:
            android.graphics.Rect r12 = r6.c
            r12.set(r10)
            android.graphics.Rect r13 = r7.e()
            r14 = 0
            if (r13 == 0) goto L_0x0119
            boolean r13 = r12.intersect(r13)
            if (r13 == 0) goto L_0x0119
            int r13 = r12.width()
            int r12 = r12.height()
            int r12 = r12 * r13
            long r12 = (long) r12
            goto L_0x011a
        L_0x0119:
            r12 = r14
        L_0x011a:
            int r17 = r10.width()
            int r18 = r10.height()
            int r11 = r17 * r18
            r17 = r4
            long r3 = (long) r11
            long r3 = r3 - r12
            int r11 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x012e
            r11 = 1
            goto L_0x012f
        L_0x012e:
            r11 = 0
        L_0x012f:
            if (r11 == 0) goto L_0x015b
            int r11 = r27.getWidth()
            int r12 = r27.getHeight()
            int r12 = r12 * r11
            long r11 = (long) r12
            float r13 = (float) r3
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r14
            float r14 = (float) r11
            float r13 = r13 / r14
            double r13 = (double) r13
            g.i.c.a.a.o.b r15 = new g.i.c.a.a.o.b
            r19 = r15
            r20 = r11
            r22 = r3
            r24 = r13
            r19.<init>(r20, r22, r24)
            g.i.c.a.a.o.f<g.i.c.a.a.o.b> r3 = r6.f4488e
            r3.set(r2, r15)
            if (r8 == 0) goto L_0x015b
            r7.a(r1, r6, r15)
        L_0x015b:
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 != 0) goto L_0x0161
            goto L_0x0078
        L_0x0161:
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.graphics.Rect r4 = r5.c
            boolean r6 = r9.f4486f
            if (r6 != 0) goto L_0x0171
            android.graphics.Rect r6 = r9.c
            r4.set(r6)
            r8 = 0
            goto L_0x01c1
        L_0x0171:
            int r6 = r10.right
            int r7 = r10.left
            int r6 = r6 - r7
            int r7 = r10.bottom
            int r8 = r10.top
            int r7 = r7 - r8
            r8 = 0
            r4.set(r8, r8, r6, r7)
            java.util.WeakHashMap<android.view.View, java.lang.String> r6 = e.e.j.q.a
            android.graphics.Rect r6 = r27.getClipBounds()
            if (r6 == 0) goto L_0x018e
            boolean r6 = r4.intersect(r6)
            if (r6 != 0) goto L_0x018e
            goto L_0x01b6
        L_0x018e:
            g.i.c.a.a.b0.p$e r6 = g.i.c.a.a.b0.p.a
            boolean r6 = r6.b(r3)
            if (r6 == 0) goto L_0x01ba
            int r6 = r27.getPaddingLeft()
            int r7 = r27.getPaddingTop()
            int r9 = r27.getWidth()
            int r11 = r27.getPaddingRight()
            int r9 = r9 - r11
            int r11 = r27.getHeight()
            int r12 = r27.getPaddingBottom()
            int r11 = r11 - r12
            boolean r6 = r4.intersect(r6, r7, r9, r11)
            if (r6 != 0) goto L_0x01ba
        L_0x01b6:
            r4 = 1
            r16 = 0
            goto L_0x01c4
        L_0x01ba:
            int r6 = r10.left
            int r7 = r10.top
            r4.offset(r6, r7)
        L_0x01c1:
            r4 = 1
            r16 = 1
        L_0x01c4:
            r6 = r16 ^ 1
            if (r6 == 0) goto L_0x01ca
        L_0x01c8:
            r10 = 0
            goto L_0x01df
        L_0x01ca:
            int r6 = r27.getScrollX()
            r5.f4484d = r6
            int r6 = r27.getScrollY()
            r5.f4485e = r6
            g.i.c.a.a.b0.p$e r6 = g.i.c.a.a.b0.p.a
            boolean r3 = r6.a(r3)
            r5.f4486f = r3
            r10 = 1
        L_0x01df:
            if (r10 == 0) goto L_0x0226
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0226
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.getChildCount()
            if (r4 == 0) goto L_0x0226
            java.util.HashSet<java.lang.String> r4 = g.i.c.a.a.a0.e.a
            android.view.View[] r4 = g.i.c.a.a.a0.e.a(r3)     // Catch:{ all -> 0x01f5 }
            goto L_0x01f6
        L_0x01f5:
            r4 = 0
        L_0x01f6:
            int r5 = r0.b(r3)
            int r6 = r0.a(r3)
        L_0x01fe:
            if (r5 == r6) goto L_0x0226
            if (r4 != 0) goto L_0x0207
            android.view.View r7 = r3.getChildAt(r5)
            goto L_0x0215
        L_0x0207:
            int r7 = r4.length
            if (r5 >= r7) goto L_0x020d
            r7 = r4[r5]
            goto L_0x0215
        L_0x020d:
            java.lang.String r7 = "ViewTraverser"
            java.lang.String r8 = "Attention: get child errorrrrrrrrr!"
            g.c.b.b.f.x(r7, r8)
            r7 = 0
        L_0x0215:
            if (r7 == 0) goto L_0x021f
            int r8 = r2 + 1
            r9 = r29
            r0.d(r7, r8, r9)
            goto L_0x0221
        L_0x021f:
            r9 = r29
        L_0x0221:
            int r5 = r0.c(r5)
            goto L_0x01fe
        L_0x0226:
            r3 = r17
            g.i.c.a.a.o.c r4 = r3.a
            g.i.c.a.a.o.f<g.i.c.a.a.o.b> r4 = r4.f4488e
            java.lang.Object r2 = r4.get(r2)
            g.i.c.a.a.o.b r2 = (g.i.c.a.a.o.b) r2
            if (r2 == 0) goto L_0x023f
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x023f
            g.i.c.a.a.o.e r4 = r3.b
            g.i.c.a.a.o.c r5 = r3.a
            r4.a(r1, r5, r2)
        L_0x023f:
            g.i.c.a.a.o.e r2 = r3.b
            g.i.c.a.a.o.c r3 = r3.a
            r2.b(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.a0.f.d(android.view.View, int, g.i.c.a.a.a0.a):void");
    }
}
