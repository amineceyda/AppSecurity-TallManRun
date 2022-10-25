package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import e.b.c.w;
import e.b.g.i.m;
import e.b.h.c0;
import e.b.h.d0;
import e.b.h.d1;
import e.e.j.h;
import e.e.j.i;
import e.e.j.j;
import e.e.j.k;
import e.e.j.q;
import e.e.j.x;
import java.util.Objects;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements c0, j, h, i {
    public static final int[] T = {2130968583, 16842841};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable Q;
    public final Runnable R;
    public final k S;
    public int b;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f99d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f100e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f101f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f102g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f103h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f104i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f105j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f106k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f107l;

    /* renamed from: m  reason: collision with root package name */
    public int f108m;
    public int n;
    public final Rect o = new Rect();
    public final Rect p = new Rect();
    public final Rect q = new Rect();
    public final Rect r = new Rect();
    public final Rect s = new Rect();
    public final Rect t = new Rect();
    public final Rect u = new Rect();
    public x v;
    public x w;
    public x x;
    public x y;
    public d z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f107l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f107l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f100e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f100e.animate().translationY((float) (-ActionBarOverlayLayout.this.f100e.getHeight())).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x xVar = x.b;
        this.v = xVar;
        this.w = xVar;
        this.x = xVar;
        this.y = xVar;
        this.C = new a();
        this.Q = new b();
        this.R = new c();
        r(context);
        this.S = new k();
    }

    public void a(Menu menu, m.a aVar) {
        s();
        this.f101f.a(menu, aVar);
    }

    public boolean b() {
        s();
        return this.f101f.b();
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d() {
        s();
        this.f101f.d();
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f102g != null && !this.f103h) {
            if (this.f100e.getVisibility() == 0) {
                i2 = (int) (this.f100e.getTranslationY() + ((float) this.f100e.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f102g.setBounds(0, i2, getWidth(), this.f102g.getIntrinsicHeight() + i2);
            this.f102g.draw(canvas);
        }
    }

    public boolean e() {
        s();
        return this.f101f.e();
    }

    public boolean f() {
        s();
        return this.f101f.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        s();
        boolean p2 = p(this.f100e, rect, true, true, false, true);
        this.r.set(rect);
        d1.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            p2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            p2 = true;
        }
        if (p2) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        s();
        return this.f101f.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f100e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        k kVar = this.S;
        return kVar.b | kVar.a;
    }

    public CharSequence getTitle() {
        s();
        return this.f101f.getTitle();
    }

    public boolean h() {
        s();
        return this.f101f.h();
    }

    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public void k(int i2) {
        s();
        if (i2 == 2) {
            this.f101f.t();
        } else if (i2 == 5) {
            this.f101f.u();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        s();
        this.f101f.i();
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        x j2 = x.j(windowInsets, this);
        boolean p2 = p(this.f100e, new Rect(j2.b(), j2.d(), j2.c(), j2.a()), true, true, false, true);
        Rect rect = this.o;
        WeakHashMap<View, String> weakHashMap = q.a;
        if (Build.VERSION.SDK_INT >= 21) {
            e.e.i.b.f(this, j2, rect);
        }
        Rect rect2 = this.o;
        x h2 = j2.a.h(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.v = h2;
        boolean z2 = true;
        if (!this.w.equals(h2)) {
            this.w = this.v;
            p2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
        } else {
            z2 = p2;
        }
        if (z2) {
            requestLayout();
        }
        return j2.a.a().a.c().a.b().h();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, String> weakHashMap = q.a;
        if (Build.VERSION.SDK_INT >= 20) {
            requestApplyInsets();
        } else {
            requestFitSystemWindows();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.s()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f100e
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f100e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f100e
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r7 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f100e
            int r1 = r1.getMeasuredHeight()
            int r3 = r0.topMargin
            int r1 = r1 + r3
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f100e
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r2, r0)
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = e.e.j.q.a
            int r0 = r12.getWindowSystemUiVisibility()
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 == 0) goto L_0x0061
            int r1 = r12.b
            boolean r3 = r12.f105j
            if (r3 == 0) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f100e
            android.view.View r3 = r3.getTabContainer()
            if (r3 == 0) goto L_0x0073
            int r3 = r12.b
            int r1 = r1 + r3
            goto L_0x0073
        L_0x0061:
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f100e
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x0072
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f100e
            int r1 = r1.getMeasuredHeight()
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            android.graphics.Rect r3 = r12.q
            android.graphics.Rect r4 = r12.o
            r3.set(r4)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x0085
            e.e.j.x r3 = r12.v
            r12.x = r3
            goto L_0x008c
        L_0x0085:
            android.graphics.Rect r3 = r12.t
            android.graphics.Rect r4 = r12.r
            r3.set(r4)
        L_0x008c:
            boolean r3 = r12.f104i
            if (r3 != 0) goto L_0x00a9
            if (r0 != 0) goto L_0x00a9
            android.graphics.Rect r0 = r12.q
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r3 = r0.bottom
            int r3 = r3 + r2
            r0.bottom = r3
            if (r10 < r11) goto L_0x0104
            e.e.j.x r0 = r12.x
            e.e.j.x$k r0 = r0.a
            e.e.j.x r0 = r0.h(r2, r1, r2, r2)
            goto L_0x00f5
        L_0x00a9:
            if (r10 < r11) goto L_0x00f8
            e.e.j.x r0 = r12.x
            int r0 = r0.b()
            e.e.j.x r3 = r12.x
            int r3 = r3.d()
            int r3 = r3 + r1
            e.e.j.x r1 = r12.x
            int r1 = r1.c()
            e.e.j.x r4 = r12.x
            int r4 = r4.a()
            int r4 = r4 + r2
            e.e.d.b r0 = e.e.d.b.a(r0, r3, r1, r4)
            e.e.j.x r1 = r12.x
            r2 = 30
            if (r10 < r2) goto L_0x00d5
            e.e.j.x$d r2 = new e.e.j.x$d
            r2.<init>(r1)
            goto L_0x00ee
        L_0x00d5:
            r2 = 29
            if (r10 < r2) goto L_0x00df
            e.e.j.x$c r2 = new e.e.j.x$c
            r2.<init>(r1)
            goto L_0x00ee
        L_0x00df:
            r2 = 20
            if (r10 < r2) goto L_0x00e9
            e.e.j.x$b r2 = new e.e.j.x$b
            r2.<init>(r1)
            goto L_0x00ee
        L_0x00e9:
            e.e.j.x$e r2 = new e.e.j.x$e
            r2.<init>(r1)
        L_0x00ee:
            r2.c(r0)
            e.e.j.x r0 = r2.a()
        L_0x00f5:
            r12.x = r0
            goto L_0x0104
        L_0x00f8:
            android.graphics.Rect r0 = r12.t
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r1 = r0.bottom
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x0104:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f99d
            android.graphics.Rect r2 = r12.q
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r0 = r12
            r0.p(r1, r2, r3, r4, r5, r6)
            if (r10 < r11) goto L_0x0126
            e.e.j.x r0 = r12.y
            e.e.j.x r1 = r12.x
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0126
            e.e.j.x r0 = r12.x
            r12.y = r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f99d
            e.e.j.q.c(r1, r0)
            goto L_0x0140
        L_0x0126:
            if (r10 >= r11) goto L_0x0140
            android.graphics.Rect r0 = r12.u
            android.graphics.Rect r1 = r12.t
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0140
            android.graphics.Rect r0 = r12.u
            android.graphics.Rect r1 = r12.t
            r0.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f99d
            android.graphics.Rect r1 = r12.t
            r0.a(r1)
        L_0x0140:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f99d
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f99d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f99d
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f99d
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r8, r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f99d
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r2 = r2 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r14, r2)
            r12.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.f106k || !z2) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.f100e.getHeight()) {
            z3 = true;
        }
        if (z3) {
            q();
            this.R.run();
        } else {
            q();
            this.Q.run();
        }
        this.f107l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f108m + i3;
        this.f108m = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (e.b.c.w) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            e.e.j.k r1 = r0.S
            r1.a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f108m = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.z
            if (r1 == 0) goto L_0x001d
            e.b.c.w r1 = (e.b.c.w) r1
            e.b.g.g r2 = r1.t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f100e.getVisibility() != 0) {
            return false;
        }
        return this.f106k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f106k && !this.f107l) {
            if (this.f108m <= this.f100e.getHeight()) {
                q();
                postDelayed(this.Q, 600);
            } else {
                q();
                postDelayed(this.R, 600);
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            Objects.requireNonNull((w) dVar);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i2);
        s();
        int i4 = this.n ^ i2;
        this.n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.z;
        if (dVar != null) {
            ((w) dVar).p = !z3;
            if (z2 || !z3) {
                w wVar = (w) dVar;
                if (wVar.q) {
                    wVar.q = false;
                    wVar.g(true);
                }
            } else {
                w wVar2 = (w) dVar;
                if (!wVar2.q) {
                    wVar2.q = true;
                    wVar2.g(true);
                }
            }
        }
        if ((i4 & 256) != 0 && this.z != null) {
            WeakHashMap<View, String> weakHashMap = q.a;
            if (i3 >= 20) {
                requestApplyInsets();
            } else {
                requestFitSystemWindows();
            }
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.c = i2;
        d dVar = this.z;
        if (dVar != null) {
            ((w) dVar).o = i2;
        }
    }

    public final boolean p(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    public void q() {
        removeCallbacks(this.Q);
        removeCallbacks(this.R);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(T);
        boolean z2 = false;
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f102g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f103h = z2;
        this.A = new OverScroller(context);
    }

    public void s() {
        d0 d0Var;
        if (this.f99d == null) {
            this.f99d = (ContentFrameLayout) findViewById(2131296323);
            this.f100e = (ActionBarContainer) findViewById(2131296324);
            View findViewById = findViewById(2131296322);
            if (findViewById instanceof d0) {
                d0Var = (d0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                d0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder i2 = g.a.a.a.a.i("Can't make a decor toolbar out of ");
                i2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(i2.toString());
            }
            this.f101f = d0Var;
        }
    }

    public void setActionBarHideOffset(int i2) {
        q();
        this.f100e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f100e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            ((w) this.z).o = this.c;
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap<View, String> weakHashMap = q.a;
                if (Build.VERSION.SDK_INT >= 20) {
                    requestApplyInsets();
                } else {
                    requestFitSystemWindows();
                }
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f105j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f106k) {
            this.f106k = z2;
            if (!z2) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        s();
        this.f101f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f101f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        s();
        this.f101f.q(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f104i = z2;
        this.f103h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f101f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f101f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
