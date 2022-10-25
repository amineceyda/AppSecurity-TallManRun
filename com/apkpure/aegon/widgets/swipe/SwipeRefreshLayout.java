package com.apkpure.aegon.widgets.swipe;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import g.c.a.o.e.d;
import g.c.a.o.e.i;
import java.util.Objects;

public class SwipeRefreshLayout extends ViewGroup {
    public static final String a0 = SwipeRefreshLayout.class.getSimpleName();
    public static final int[] b0 = {16842766};
    public Animation A;
    public Animation B;
    public Animation C;
    public Animation Q;
    public boolean R;
    public int S;
    public g T;
    public Animation.AnimationListener U = new a();
    public final Animation V = new e();
    public final Animation W = new f();
    public View b;
    public h c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f315d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f316e;

    /* renamed from: f  reason: collision with root package name */
    public float f317f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f318g;

    /* renamed from: h  reason: collision with root package name */
    public final g.c.a.o.e.h f319h;

    /* renamed from: i  reason: collision with root package name */
    public final g.c.a.o.e.g f320i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f321j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public final int[] f322k = new int[2];

    /* renamed from: l  reason: collision with root package name */
    public boolean f323l;

    /* renamed from: m  reason: collision with root package name */
    public int f324m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r = -1;
    public final DecelerateInterpolator s;
    public g.c.a.o.e.a t;
    public int u = -1;
    public int v;
    public int w;
    public int x;
    public int y;
    public g.c.a.o.e.d z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        public void onAnimationEnd(Animation animation) {
            h hVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f315d) {
                swipeRefreshLayout.z.setAlpha(255);
                SwipeRefreshLayout.this.z.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.R && (hVar = swipeRefreshLayout2.c) != null) {
                    hVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.n = swipeRefreshLayout3.t.getTop();
                return;
            }
            swipeRefreshLayout.i();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        public b() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
        }
    }

    public class c extends Animation {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public c(int i2, int i3) {
            this.b = i2;
            this.c = i3;
        }

        public void applyTransformation(float f2, Transformation transformation) {
            g.c.a.o.e.d dVar = SwipeRefreshLayout.this.z;
            int i2 = this.b;
            dVar.setAlpha((int) ((((float) (this.c - i2)) * f2) + ((float) i2)));
        }
    }

    public class d implements Animation.AnimationListener {
        public d() {
        }

        public void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.m((Animation.AnimationListener) null);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class e extends Animation {
        public e() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.x - Math.abs(swipeRefreshLayout.w);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.v;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (abs - i2)) * f2))) - swipeRefreshLayout2.t.getTop());
            g.c.a.o.e.d dVar = SwipeRefreshLayout.this.z;
            float f3 = 1.0f - f2;
            d.a aVar = dVar.b;
            if (f3 != aVar.p) {
                aVar.p = f3;
            }
            dVar.invalidateSelf();
        }
    }

    public class f extends Animation {
        public f() {
        }

        public void applyTransformation(float f2, Transformation transformation) {
            SwipeRefreshLayout.this.g(f2);
        }
    }

    public interface g {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface h {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f316e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f324m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.S = (int) (displayMetrics.density * 40.0f);
        this.t = new g.c.a.o.e.a(getContext(), -328966);
        g.c.a.o.e.d dVar = new g.c.a.o.e.d(getContext());
        this.z = dVar;
        dVar.c(1);
        this.t.setImageDrawable(this.z);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.x = i2;
        this.f317f = (float) i2;
        this.f319h = new g.c.a.o.e.h();
        this.f320i = new g.c.a.o.e.g(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.S;
        this.n = i3;
        this.w = i3;
        g(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i2) {
        this.t.getBackground().setAlpha(i2);
        g.c.a.o.e.d dVar = this.z;
        dVar.b.t = i2;
        dVar.invalidateSelf();
    }

    public boolean a() {
        g gVar = this.T;
        if (gVar != null) {
            return gVar.a(this, this.b);
        }
        View view = this.b;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.b == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.t)) {
                    this.b = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f2) {
        if (f2 > this.f317f) {
            j(true, true);
            return;
        }
        this.f315d = false;
        g.c.a.o.e.d dVar = this.z;
        d.a aVar = dVar.b;
        aVar.f2158e = 0.0f;
        aVar.f2159f = 0.0f;
        dVar.invalidateSelf();
        d dVar2 = new d();
        this.v = this.n;
        this.W.reset();
        this.W.setDuration(200);
        this.W.setInterpolator(this.s);
        g.c.a.o.e.a aVar2 = this.t;
        aVar2.c = dVar2;
        aVar2.clearAnimation();
        this.t.startAnimation(this.W);
        g.c.a.o.e.d dVar3 = this.z;
        d.a aVar3 = dVar3.b;
        if (aVar3.n) {
            aVar3.n = false;
        }
        dVar3.invalidateSelf();
    }

    public final int d(int i2) {
        if (getContext() == null) {
            return 0;
        }
        Resources resources = getContext().getResources();
        if (getContext().getResources() == null) {
            return 0;
        }
        return resources.getColor(i2);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        ViewParent a2;
        g.c.a.o.e.g gVar = this.f320i;
        if (!gVar.f2167d || (a2 = gVar.a(0)) == null) {
            return false;
        }
        View view = gVar.c;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            return a2.onNestedFling(view, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            g.a.a.a.a.o("ViewParent ", a2, " does not implement interface method onNestedFling", "ViewCompat", e2);
            return false;
        }
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        ViewParent a2;
        g.c.a.o.e.g gVar = this.f320i;
        if (!gVar.f2167d || (a2 = gVar.a(0)) == null) {
            return false;
        }
        View view = gVar.c;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            return a2.onNestedPreFling(view, f2, f3);
        } catch (AbstractMethodError e2) {
            g.a.a.a.a.o("ViewParent ", a2, " does not implement interface method onNestedPreFling", "ViewCompat", e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r12[1] == 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchNestedPreScroll(int r10, int r11, int[] r12, int[] r13) {
        /*
            r9 = this;
            g.c.a.o.e.g r0 = r9.f320i
            boolean r1 = r0.f2167d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x006a
            android.view.ViewParent r1 = r0.a(r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x006c
        L_0x000f:
            if (r10 != 0) goto L_0x001b
            if (r11 == 0) goto L_0x0014
            goto L_0x001b
        L_0x0014:
            if (r13 == 0) goto L_0x006a
            r13[r3] = r3
            r13[r2] = r3
            goto L_0x006a
        L_0x001b:
            if (r13 == 0) goto L_0x0027
            android.view.View r4 = r0.c
            r4.getLocationInWindow(r13)
            r4 = r13[r3]
            r5 = r13[r2]
            goto L_0x0029
        L_0x0027:
            r4 = 0
            r5 = 0
        L_0x0029:
            if (r12 != 0) goto L_0x0036
            int[] r12 = r0.f2168e
            if (r12 != 0) goto L_0x0034
            r12 = 2
            int[] r12 = new int[r12]
            r0.f2168e = r12
        L_0x0034:
            int[] r12 = r0.f2168e
        L_0x0036:
            r12[r3] = r3
            r12[r2] = r3
            android.view.View r6 = r0.c
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x0050
            r1.onNestedPreScroll(r6, r10, r11, r12)     // Catch:{ AbstractMethodError -> 0x0046 }
            goto L_0x0050
        L_0x0046:
            r10 = move-exception
            java.lang.String r11 = "ViewParent "
            java.lang.String r6 = " does not implement interface method onNestedPreScroll"
            java.lang.String r7 = "ViewCompat"
            g.a.a.a.a.o(r11, r1, r6, r7, r10)
        L_0x0050:
            if (r13 == 0) goto L_0x0061
            android.view.View r10 = r0.c
            r10.getLocationInWindow(r13)
            r10 = r13[r3]
            int r10 = r10 - r4
            r13[r3] = r10
            r10 = r13[r2]
            int r10 = r10 - r5
            r13[r2] = r10
        L_0x0061:
            r10 = r12[r3]
            if (r10 != 0) goto L_0x006b
            r10 = r12[r2]
            if (r10 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            r3 = r2
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout.dispatchNestedPreScroll(int, int, int[], int[]):boolean");
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent a2;
        int i6;
        int i7;
        int[] iArr2 = iArr;
        g.c.a.o.e.g gVar = this.f320i;
        if (gVar.f2167d && (a2 = gVar.a(0)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                if (iArr2 != null) {
                    gVar.c.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (gVar.f2168e == null) {
                    gVar.f2168e = new int[2];
                }
                int[] iArr3 = gVar.f2168e;
                iArr3[0] = 0;
                iArr3[1] = 0;
                View view = gVar.c;
                iArr3[0] = iArr3[0] + i4;
                iArr3[1] = iArr3[1] + i5;
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        a2.onNestedScroll(view, i2, i3, i4, i5);
                    } catch (AbstractMethodError e2) {
                        g.a.a.a.a.o("ViewParent ", a2, " does not implement interface method onNestedScroll", "ViewCompat", e2);
                    }
                }
                if (iArr2 == null) {
                    return true;
                }
                gVar.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i7;
                iArr2[1] = iArr2[1] - i6;
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final boolean e(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    public final void f(float f2) {
        g.c.a.o.e.d dVar = this.z;
        d.a aVar = dVar.b;
        if (!aVar.n) {
            aVar.n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f2 / this.f317f));
        double d2 = (double) min;
        Double.isNaN(d2);
        Double.isNaN(d2);
        float max = (((float) Math.max(d2 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f317f;
        int i2 = this.y;
        if (i2 <= 0) {
            i2 = this.x;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.w + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.t.getVisibility() != 0) {
            this.t.setVisibility(0);
        }
        this.t.setScaleX(1.0f);
        this.t.setScaleY(1.0f);
        if (f2 < this.f317f) {
            if (this.z.b.t > 76 && !e(this.C)) {
                this.C = k(this.z.b.t, 76);
            }
        } else if (this.z.b.t < 255 && !e(this.Q)) {
            this.Q = k(this.z.b.t, 255);
        }
        g.c.a.o.e.d dVar2 = this.z;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar2 = dVar2.b;
        aVar2.f2158e = 0.0f;
        aVar2.f2159f = min2;
        dVar2.invalidateSelf();
        g.c.a.o.e.d dVar3 = this.z;
        float min3 = Math.min(1.0f, max);
        d.a aVar3 = dVar3.b;
        if (min3 != aVar3.p) {
            aVar3.p = min3;
        }
        dVar3.invalidateSelf();
        g.c.a.o.e.d dVar4 = this.z;
        dVar4.b.f2160g = ((f4 * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.n);
    }

    public void g(float f2) {
        int i2 = this.v;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.w - i2)) * f2))) - this.t.getTop());
    }

    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.u;
        return i4 < 0 ? i3 : i3 == i2 + -1 ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    public int getNestedScrollAxes() {
        g.c.a.o.e.h hVar = this.f319h;
        return hVar.b | hVar.a;
    }

    public int getProgressCircleDiameter() {
        return this.S;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.w;
    }

    public final void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.f320i.a(0) != null;
    }

    public void i() {
        this.t.clearAnimation();
        this.z.stop();
        this.t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.w - this.n);
        this.n = this.t.getTop();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f320i.f2167d;
    }

    public final void j(boolean z2, boolean z3) {
        if (this.f315d != z2) {
            this.R = z3;
            b();
            this.f315d = z2;
            if (z2) {
                int i2 = this.n;
                Animation.AnimationListener animationListener = this.U;
                this.v = i2;
                this.V.reset();
                this.V.setDuration(200);
                this.V.setInterpolator(this.s);
                if (animationListener != null) {
                    this.t.c = animationListener;
                }
                this.t.clearAnimation();
                this.t.startAnimation(this.V);
                return;
            }
            m(this.U);
        }
    }

    public final Animation k(int i2, int i3) {
        c cVar = new c(i2, i3);
        cVar.setDuration(300);
        g.c.a.o.e.a aVar = this.t;
        aVar.c = null;
        aVar.clearAnimation();
        this.t.startAnimation(cVar);
        return cVar;
    }

    public final void l(float f2) {
        float f3 = this.p;
        int i2 = this.f316e;
        if (f2 - f3 > ((float) i2) && !this.q) {
            this.o = f3 + ((float) i2);
            this.q = true;
            this.z.setAlpha(76);
        }
    }

    public void m(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.B = bVar;
        bVar.setDuration(150);
        g.c.a.o.e.a aVar = this.t;
        aVar.c = animationListener;
        aVar.clearAnimation();
        this.t.startAnimation(this.B);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f315d || this.f323l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.r;
                    if (i2 == -1) {
                        Log.e(a0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    l(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        h(motionEvent);
                    }
                }
            }
            this.q = false;
            this.r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.w - this.t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.r = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.p = motionEvent.getY(findPointerIndex2);
        }
        return this.q;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.b == null) {
                b();
            }
            View view = this.b;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.t.getMeasuredWidth();
                int measuredHeight2 = this.t.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.n;
                this.t.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.b == null) {
            b();
        }
        View view = this.b;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.t.measure(View.MeasureSpec.makeMeasureSpec(this.S, 1073741824), View.MeasureSpec.makeMeasureSpec(this.S, 1073741824));
            this.u = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.t) {
                    this.u = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f318g;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.f318g = 0.0f;
                } else {
                    this.f318g = f2 - f3;
                    iArr[1] = i3;
                }
                f(this.f318g);
            }
        }
        int[] iArr2 = this.f321j;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.f322k);
        int i6 = i5 + this.f322k[1];
        if (i6 < 0 && !a()) {
            float abs = this.f318g + ((float) Math.abs(i6));
            this.f318g = abs;
            f(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f319h.a = i2;
        startNestedScroll(i2 & 2);
        this.f318g = 0.0f;
        this.f323l = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.f315d && (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f319h.a = 0;
        this.f323l = false;
        float f2 = this.f318g;
        if (f2 > 0.0f) {
            c(f2);
            this.f318g = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f315d || this.f323l) {
            return false;
        }
        if (actionMasked == 0) {
            this.r = motionEvent.getPointerId(0);
            this.q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.r);
            if (findPointerIndex < 0) {
                Log.e(a0, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.q) {
                this.q = false;
                c((motionEvent.getY(findPointerIndex) - this.o) * 0.5f);
            }
            this.r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.r);
            if (findPointerIndex2 < 0) {
                Log.e(a0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            l(y2);
            if (this.q) {
                float f2 = (y2 - this.o) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                f(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(a0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                h(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 || !(this.b instanceof AbsListView)) {
            View view = this.b;
            if (view != null) {
                if (!(i2 >= 21 ? view.isNestedScrollingEnabled() : false)) {
                    return;
                }
            }
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setAnimationProgress(float f2) {
        this.t.setScaleX(f2);
        this.t.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        g.c.a.o.e.d dVar = this.z;
        d.a aVar = dVar.b;
        aVar.f2162i = iArr;
        aVar.a(0);
        dVar.b.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = d(iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f317f = (float) i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            i();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        g.c.a.o.e.g gVar = this.f320i;
        if (gVar.f2167d) {
            View view = gVar.c;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            }
        }
        gVar.f2167d = z2;
    }

    public void setOnChildScrollUpCallback(g gVar) {
        this.T = gVar;
    }

    public void setOnRefreshListener(h hVar) {
        this.c = hVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.t.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(d(i2));
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.f315d == z2) {
            j(z2, false);
            return;
        }
        this.f315d = z2;
        setTargetOffsetTopAndBottom((this.x + this.w) - this.n);
        this.R = false;
        Animation.AnimationListener animationListener = this.U;
        this.t.setVisibility(0);
        this.z.setAlpha(255);
        i iVar = new i(this);
        this.A = iVar;
        iVar.setDuration((long) this.f324m);
        if (animationListener != null) {
            this.t.c = animationListener;
        }
        this.t.clearAnimation();
        this.t.startAnimation(this.A);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.S = (int) (getResources().getDisplayMetrics().density * (i2 == 0 ? 56.0f : 40.0f));
            this.t.setImageDrawable((Drawable) null);
            this.z.c(i2);
            this.t.setImageDrawable(this.z);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.y = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.t.bringToFront();
        g.c.a.o.e.a aVar = this.t;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            aVar.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            if (e.e.d.l.a.f1310k == null) {
                e.e.d.l.a.f1310k = new ThreadLocal<>();
            }
            Rect rect = e.e.d.l.a.f1310k.get();
            if (rect == null) {
                rect = new Rect();
                e.e.d.l.a.f1310k.set(rect);
            }
            rect.setEmpty();
            boolean z2 = false;
            ViewParent parent = aVar.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                z2 = !rect.intersects(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
            }
            e.e.d.l.a.l(aVar, i2);
            if (z2 && rect.intersect(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom())) {
                ((View) parent).invalidate(rect);
            }
        } else {
            e.e.d.l.a.l(aVar, i2);
        }
        this.n = this.t.getTop();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0037 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startNestedScroll(int r10) {
        /*
            r9 = this;
            g.c.a.o.e.g r0 = r9.f320i
            r1 = 0
            android.view.ViewParent r2 = r0.a(r1)
            if (r2 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 == 0) goto L_0x000f
            goto L_0x0049
        L_0x000f:
            boolean r2 = r0.f2167d
            if (r2 == 0) goto L_0x0057
            android.view.View r2 = r0.c
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r3 = r0.c
        L_0x001b:
            if (r2 == 0) goto L_0x0057
            android.view.View r4 = r0.c
            java.lang.String r5 = "ViewCompat"
            java.lang.String r6 = "ViewParent "
            r7 = 21
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r7) goto L_0x0034
            boolean r4 = r2.onStartNestedScroll(r3, r4, r10)     // Catch:{ AbstractMethodError -> 0x002e }
            goto L_0x0035
        L_0x002e:
            r4 = move-exception
            java.lang.String r8 = " does not implement interface method onStartNestedScroll"
            g.a.a.a.a.o(r6, r2, r8, r5, r4)
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r4 == 0) goto L_0x004b
            r0.a = r2
            android.view.View r0 = r0.c
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r7) goto L_0x0049
            r2.onNestedScrollAccepted(r3, r0, r10)     // Catch:{ AbstractMethodError -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            r10 = move-exception
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            g.a.a.a.a.o(r6, r2, r0, r5, r10)
        L_0x0049:
            r1 = 1
            goto L_0x0057
        L_0x004b:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L_0x0052
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L_0x0052:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x001b
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout.startNestedScroll(int):boolean");
    }

    public void stopNestedScroll() {
        g.c.a.o.e.g gVar = this.f320i;
        ViewParent a2 = gVar.a(0);
        if (a2 != null) {
            View view = gVar.c;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    a2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    g.a.a.a.a.o("ViewParent ", a2, " does not implement interface method onStopNestedScroll", "ViewCompat", e2);
                }
            }
            gVar.a = null;
        }
    }
}
