package com.apkpure.aegon.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.HorizontalScrollView;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import i.o.c.h;

public final class NestedHorizontalScrollView extends HorizontalScrollView {
    public float b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public a f298d = a.b;

    /* renamed from: e  reason: collision with root package name */
    public float f299e;

    /* renamed from: f  reason: collision with root package name */
    public int f300f = getWidth();

    /* renamed from: g  reason: collision with root package name */
    public SwipeRefreshLayout f301g;

    public enum a {
        b,
        PAGE
    }

    public NestedHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        smoothScrollTo(i2 * this.f300f, 0);
        this.c = (int) (this.f299e / ((float) this.f300f));
        return false;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f300f <= 0) {
            this.f300f = getWidth();
        }
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f299e = (float) i2;
        Log.i("HorizontalScrollView", h.j("Y=", Integer.valueOf(this.c)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r1 == true) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r1 == true) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        if (r0 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ev"
            i.o.c.h.e(r10, r0)
            int r0 = r10.getAction()
            r1 = 0
            if (r0 == 0) goto L_0x007f
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x002d
            r4 = 2
            if (r0 == r4) goto L_0x0018
            r4 = 3
            if (r0 == r4) goto L_0x002d
            goto L_0x0087
        L_0x0018:
            float r0 = r9.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x0028
            float r0 = r10.getX()
            r9.b = r0
        L_0x0028:
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r0 = r9.f301g
            if (r0 != 0) goto L_0x0084
            goto L_0x0087
        L_0x002d:
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r0 = r9.f301g
            if (r0 != 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r0.setEnabled(r3)
        L_0x0035:
            float r0 = r10.getX()
            float r4 = r9.b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r9.b = r2
            com.apkpure.aegon.widgets.NestedHorizontalScrollView$a r2 = r9.f298d
            com.apkpure.aegon.widgets.NestedHorizontalScrollView$a r4 = com.apkpure.aegon.widgets.NestedHorizontalScrollView.a.PAGE
            if (r2 != r4) goto L_0x007a
            int r2 = r9.f300f
            if (r2 != 0) goto L_0x004f
            goto L_0x007a
        L_0x004f:
            float r10 = r9.f299e
            float r2 = (float) r2
            float r4 = r10 / r2
            int r4 = (int) r4
            float r10 = r10 % r2
            float r10 = r10 / r2
            double r5 = (double) r10
            if (r0 != r3) goto L_0x0067
            r7 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0064
            r1 = 1
        L_0x0064:
            if (r1 != r3) goto L_0x0076
            goto L_0x0074
        L_0x0067:
            r7 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x0071
            r1 = 1
        L_0x0071:
            if (r1 != r3) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            int r4 = r4 + 1
        L_0x0076:
            r9.a(r4)
            goto L_0x007e
        L_0x007a:
            boolean r3 = super.onTouchEvent(r10)
        L_0x007e:
            return r3
        L_0x007f:
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r0 = r9.f301g
            if (r0 != 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r0.setEnabled(r1)
        L_0x0087:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.widgets.NestedHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setPageWidth(int i2) {
        this.f300f = i2;
    }

    public final void setScrollModel(a aVar) {
        h.e(aVar, "model");
        this.f298d = aVar;
    }

    public final void setSwipeRefreshLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.f301g = swipeRefreshLayout;
    }
}
