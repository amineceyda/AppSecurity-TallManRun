package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import e.e.j.f;
import e.e.j.g;
import e.e.j.h;
import e.e.j.i;
import e.e.j.j;
import e.e.j.k;
import e.e.j.q;
import e.e.j.y.b;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements i, f {
    public static final a B = new a();
    public static final int[] C = {16843130};
    public b A;
    public long b;
    public final Rect c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f169d = new OverScroller(getContext());

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f170e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f171f;

    /* renamed from: g  reason: collision with root package name */
    public int f172g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f173h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f174i = false;

    /* renamed from: j  reason: collision with root package name */
    public View f175j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f176k = false;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f177l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f178m;
    public boolean n = true;
    public int o;
    public int p;
    public int q;
    public int r = -1;
    public final int[] s = new int[2];
    public final int[] t = new int[2];
    public int u;
    public int v;
    public SavedState w;
    public final k x;
    public final g y;
    public float z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int scrollPosition;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("HorizontalScrollView.SavedState{");
            i2.append(Integer.toHexString(System.identityHashCode(this)));
            i2.append(" scrollPosition=");
            return g.a.a.a.a.e(i2, this.scrollPosition, "}");
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.scrollPosition);
        }
    }

    public static class a extends e.e.j.a {
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public void c(View view, e.e.j.y.b bVar) {
            int scrollRange;
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.a(b.a.f1359e);
                    bVar.a(b.a.f1360f);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.a(b.a.f1358d);
                    bVar.a(b.a.f1361g);
                }
            }
        }

        public boolean d(View view, int i2, Bundle bundle) {
            int min;
            if (super.d(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.A(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.A(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    public interface b {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new k();
        this.y = new g(this);
        setNestedScrollingEnabled(true);
        q.o(this, B);
    }

    public static int d(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.z;
    }

    public static boolean r(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && r((View) parent, view2);
    }

    public final void A(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f169d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                x(z2);
            } else {
                if (!this.f169d.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public boolean B(int i2, int i3) {
        boolean z2;
        g gVar = this.y;
        if (gVar.b(i3) != null) {
            return true;
        }
        if (gVar.f1336d) {
            ViewParent parent = gVar.c.getParent();
            View view = gVar.c;
            while (parent != null) {
                View view2 = gVar.c;
                boolean z3 = parent instanceof h;
                if (z3) {
                    z2 = ((h) parent).o(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z2 = parent.onStartNestedScroll(view, view2, i2);
                            } catch (AbstractMethodError e2) {
                                g.a.a.a.a.o("ViewParent ", parent, " does not implement interface method onStartNestedScroll", "ViewParentCompat", e2);
                            }
                        } else if (parent instanceof j) {
                            z2 = ((j) parent).onStartNestedScroll(view, view2, i2);
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if (i3 == 0) {
                        gVar.a = parent;
                    } else if (i3 == 1) {
                        gVar.b = parent;
                    }
                    View view3 = gVar.c;
                    if (z3) {
                        ((h) parent).c(view, view3, i2, i3);
                        return true;
                    } else if (i3 != 0) {
                        return true;
                    } else {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i2);
                                return true;
                            } catch (AbstractMethodError e3) {
                                g.a.a.a.a.o("ViewParent ", parent, " does not implement interface method onNestedScrollAccepted", "ViewParentCompat", e3);
                                return true;
                            }
                        } else if (!(parent instanceof j)) {
                            return true;
                        } else {
                            ((j) parent).onNestedScrollAccepted(view, view3, i2);
                            return true;
                        }
                    }
                } else {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                }
            }
        }
        return false;
    }

    public void C(int i2) {
        g gVar = this.y;
        ViewParent b2 = gVar.b(i2);
        if (b2 != null) {
            View view = gVar.c;
            if (b2 instanceof h) {
                ((h) b2).i(view, i2);
            } else if (i2 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        b2.onStopNestedScroll(view);
                    } catch (AbstractMethodError e2) {
                        g.a.a.a.a.o("ViewParent ", b2, " does not implement interface method onStopNestedScroll", "ViewParentCompat", e2);
                    }
                } else if (b2 instanceof j) {
                    ((j) b2).onStopNestedScroll(view);
                }
            }
            if (i2 == 0) {
                gVar.a = null;
            } else if (i2 == 1) {
                gVar.b = null;
            }
        }
    }

    public final void a() {
        this.f169d.abortAnimation();
        C(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !s(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            g(e(this.c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!s(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void c(View view, View view2, int i2, int i3) {
        k kVar = this.x;
        if (i3 == 1) {
            kVar.b = i2;
        } else {
            kVar.a = i2;
        }
        B(2, i3);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f169d.isFinished()) {
            this.f169d.computeScrollOffset();
            int currY = this.f169d.getCurrY();
            int i2 = currY - this.v;
            this.v = currY;
            int[] iArr = this.t;
            boolean z2 = false;
            iArr[1] = 0;
            f(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.t[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                v(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                this.y.a(0, scrollY2, 0, i4, this.s, 1, iArr2);
                i3 = i4 - this.t[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    h();
                    if (i3 < 0) {
                        if (this.f170e.isFinished()) {
                            edgeEffect = this.f170e;
                        }
                    } else if (this.f171f.isFinished()) {
                        edgeEffect = this.f171f;
                    }
                    edgeEffect.onAbsorb((int) this.f169d.getCurrVelocity());
                }
                a();
            }
            if (!this.f169d.isFinished()) {
                WeakHashMap<View, String> weakHashMap = q.a;
                postInvalidateOnAnimation();
                return;
            }
            C(1);
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        ViewParent b2;
        g gVar = this.y;
        if (!gVar.f1336d || (b2 = gVar.b(0)) == null) {
            return false;
        }
        return e.e.d.l.a.c0(b2, gVar.c, f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        ViewParent b2;
        g gVar = this.y;
        if (!gVar.f1336d || (b2 = gVar.b(0)) == null) {
            return false;
        }
        return e.e.d.l.a.d0(b2, gVar.c, f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return f(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.y.a(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f170e != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f170e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.f170e.setSize(width, height);
                if (this.f170e.draw(canvas)) {
                    WeakHashMap<View, String> weakHashMap = q.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.f171f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 21 || getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i3 = 0 + getPaddingLeft();
                }
                if (i5 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f171f.setSize(width2, height2);
                if (this.f171f.draw(canvas)) {
                    WeakHashMap<View, String> weakHashMap2 = q.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r14[1] == 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(int r16, int r17, int[] r18, int[] r19, int r20) {
        /*
            r15 = this;
            r0 = r19
            r1 = r15
            e.e.j.g r2 = r1.y
            boolean r3 = r2.f1336d
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x006b
            r3 = r20
            android.view.ViewParent r6 = r2.b(r3)
            if (r6 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            if (r16 != 0) goto L_0x0020
            if (r17 == 0) goto L_0x0019
            goto L_0x0020
        L_0x0019:
            if (r0 == 0) goto L_0x006b
            r0[r5] = r5
            r0[r4] = r5
            goto L_0x006b
        L_0x0020:
            if (r0 == 0) goto L_0x002e
            android.view.View r7 = r2.c
            r7.getLocationInWindow(r0)
            r7 = r0[r5]
            r8 = r0[r4]
            r12 = r7
            r13 = r8
            goto L_0x0030
        L_0x002e:
            r12 = 0
            r13 = 0
        L_0x0030:
            if (r18 != 0) goto L_0x003f
            int[] r7 = r2.f1337e
            if (r7 != 0) goto L_0x003b
            r7 = 2
            int[] r7 = new int[r7]
            r2.f1337e = r7
        L_0x003b:
            int[] r7 = r2.f1337e
            r14 = r7
            goto L_0x0041
        L_0x003f:
            r14 = r18
        L_0x0041:
            r14[r5] = r5
            r14[r4] = r5
            android.view.View r7 = r2.c
            r8 = r16
            r9 = r17
            r10 = r14
            r11 = r20
            e.e.d.l.a.e0(r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0062
            android.view.View r2 = r2.c
            r2.getLocationInWindow(r0)
            r2 = r0[r5]
            int r2 = r2 - r12
            r0[r5] = r2
            r2 = r0[r4]
            int r2 = r2 - r13
            r0[r4] = r2
        L_0x0062:
            r0 = r14[r5]
            if (r0 != 0) goto L_0x006c
            r0 = r14[r4]
            if (r0 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            r5 = r4
        L_0x006d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.f(int, int, int[], int[], int):boolean");
    }

    public final void g(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.n) {
            A(0, i2, 250, false);
        } else {
            scrollBy(0, i2);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        k kVar = this.x;
        return kVar.b | kVar.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void h() {
        if (getOverScrollMode() == 2) {
            this.f170e = null;
            this.f171f = null;
        } else if (this.f170e == null) {
            Context context = getContext();
            this.f170e = new EdgeEffect(context);
            this.f171f = new EdgeEffect(context);
        }
    }

    public boolean hasNestedScrollingParent() {
        return q(0);
    }

    public void i(View view, int i2) {
        k kVar = this.x;
        if (i2 == 1) {
            kVar.b = 0;
        } else {
            kVar.a = 0;
        }
        C(i2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.f1336d;
    }

    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        f(i2, i3, iArr, (int[]) null, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fb
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ec
            r4 = 20
            if (r0 == r4) goto L_0x00dc
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fb
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00bf
            android.graphics.Rect r7 = r6.c
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d1
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.c
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d1
            int r1 = r1 - r0
            goto L_0x00cf
        L_0x00bf:
            android.graphics.Rect r7 = r6.c
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.c
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d1
            r1 = 0
        L_0x00cf:
            r7.top = r1
        L_0x00d1:
            android.graphics.Rect r7 = r6.c
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.y(r5, r1, r0)
            goto L_0x00fb
        L_0x00dc:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e7
            boolean r2 = r6.b(r3)
            goto L_0x00fb
        L_0x00e7:
            boolean r2 = r6.p(r3)
            goto L_0x00fb
        L_0x00ec:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f7
            boolean r2 = r6.b(r5)
            goto L_0x00fb
        L_0x00f7:
            boolean r2 = r6.p(r5)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.k(android.view.KeyEvent):boolean");
    }

    public void l(int i2) {
        if (getChildCount() > 0) {
            this.f169d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            x(true);
        }
    }

    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        t(i5, i6, iArr);
    }

    public void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        t(i5, i6, (int[]) null);
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f174i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f176k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r11.f176k
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00ac
            r4 = -1
            if (r0 == r1) goto L_0x0085
            if (r0 == r2) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0115
        L_0x001f:
            r11.u(r12)
            goto L_0x0115
        L_0x0024:
            int r0 = r11.r
            if (r0 != r4) goto L_0x002a
            goto L_0x0115
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0115
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f172g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.o
            if (r4 <= r5) goto L_0x0115
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto L_0x0115
            r11.f176k = r1
            r11.f172g = r0
            android.view.VelocityTracker r0 = r11.f177l
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f177l = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f177l
            r0.addMovement(r12)
            r11.u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0115
            r12.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0115
        L_0x0085:
            r11.f176k = r3
            r11.r = r4
            r11.w()
            android.widget.OverScroller r4 = r11.f169d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a8
            java.util.WeakHashMap<android.view.View, java.lang.String> r12 = e.e.j.q.a
            r11.postInvalidateOnAnimation()
        L_0x00a8:
            r11.C(r3)
            goto L_0x0115
        L_0x00ac:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e0
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e0
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e0
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e0
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e0
            r4 = 1
            goto L_0x00e1
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            if (r4 != 0) goto L_0x00e9
            r11.f176k = r3
            r11.w()
            goto L_0x0115
        L_0x00e9:
            r11.f172g = r0
            int r0 = r12.getPointerId(r3)
            r11.r = r0
            android.view.VelocityTracker r0 = r11.f177l
            if (r0 != 0) goto L_0x00fc
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f177l = r0
            goto L_0x00ff
        L_0x00fc:
            r0.clear()
        L_0x00ff:
            android.view.VelocityTracker r0 = r11.f177l
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f169d
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f169d
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r1
            r11.f176k = r12
            r11.B(r2, r3)
        L_0x0115:
            boolean r12 = r11.f176k
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f173h = false;
        View view = this.f175j;
        if (view != null && r(view, this)) {
            z(this.f175j);
        }
        this.f175j = null;
        if (!this.f174i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.scrollPosition);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d2 = d(scrollY, paddingTop, i6);
            if (d2 != scrollY) {
                scrollTo(getScrollX(), d2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f174i = true;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f178m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        l((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        f(i2, i3, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        t(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.x.a = i2;
        B(2, 0);
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i2) : instance.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !(true ^ s(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.w = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            e.b.c.b bVar2 = (e.b.c.b) bVar;
            AlertController.c(this, bVar2.a, bVar2.b);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && s(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            g(e(this.c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.x.a = 0;
        C(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r0 != null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0241, code lost:
        if (r0 != null) goto L_0x0243;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            android.view.VelocityTracker r0 = r9.f177l
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f177l = r0
        L_0x000e:
            int r0 = r23.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.u = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r23)
            int r1 = r9.u
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x024c
            r3 = -1
            if (r0 == r13) goto L_0x01ee
            if (r0 == r1) goto L_0x0094
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x0282
        L_0x0036:
            r22.u(r23)
            int r0 = r9.r
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f172g = r0
            goto L_0x0282
        L_0x0048:
            int r0 = r23.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f172g = r1
            int r0 = r10.getPointerId(r0)
            r9.r = r0
            goto L_0x0282
        L_0x005b:
            boolean r0 = r9.f176k
            if (r0 == 0) goto L_0x0084
            int r0 = r22.getChildCount()
            if (r0 <= 0) goto L_0x0084
            android.widget.OverScroller r14 = r9.f169d
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0084
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = e.e.j.q.a
            r22.postInvalidateOnAnimation()
        L_0x0084:
            r9.r = r3
            r9.f176k = r11
            r22.w()
            r9.C(r11)
            android.widget.EdgeEffect r0 = r9.f170e
            if (r0 == 0) goto L_0x0282
            goto L_0x0243
        L_0x0094:
            int r0 = r9.r
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x00b7
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            int r1 = r9.r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0282
        L_0x00b7:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f172g
            int r0 = r0 - r6
            boolean r1 = r9.f176k
            if (r1 != 0) goto L_0x00dd
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.o
            if (r1 <= r2) goto L_0x00dd
            android.view.ViewParent r1 = r22.getParent()
            if (r1 == 0) goto L_0x00d4
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x00d4:
            r9.f176k = r13
            int r1 = r9.o
            if (r0 <= 0) goto L_0x00dc
            int r0 = r0 - r1
            goto L_0x00dd
        L_0x00dc:
            int r0 = r0 + r1
        L_0x00dd:
            r7 = r0
            boolean r0 = r9.f176k
            if (r0 == 0) goto L_0x0282
            r1 = 0
            int[] r3 = r9.t
            int[] r4 = r9.s
            r5 = 0
            r0 = r22
            r2 = r7
            boolean r0 = r0.f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ff
            int[] r0 = r9.t
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.u
            int[] r1 = r9.s
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.u = r0
        L_0x00ff:
            r15 = r7
            int[] r0 = r9.s
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f172g = r6
            int r16 = r22.getScrollY()
            int r8 = r22.getScrollRange()
            int r0 = r22.getOverScrollMode()
            if (r0 == 0) goto L_0x011e
            if (r0 != r13) goto L_0x011a
            if (r8 <= 0) goto L_0x011a
            goto L_0x011e
        L_0x011a:
            r0 = 0
            r17 = 0
            goto L_0x0121
        L_0x011e:
            r0 = 1
            r17 = 1
        L_0x0121:
            r1 = 0
            r3 = 0
            int r4 = r22.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r22
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.v(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r9.q(r11)
            if (r0 != 0) goto L_0x0144
            android.view.VelocityTracker r0 = r9.f177l
            r0.clear()
        L_0x0144:
            int r0 = r22.getScrollY()
            int r3 = r0 - r16
            int r5 = r15 - r3
            int[] r8 = r9.t
            r8[r13] = r11
            r2 = 0
            r4 = 0
            int[] r6 = r9.s
            r7 = 0
            e.e.j.g r1 = r9.y
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.f172g
            int[] r1 = r9.s
            r2 = r1[r13]
            int r0 = r0 - r2
            r9.f172g = r0
            int r0 = r9.u
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.u = r0
            if (r17 == 0) goto L_0x0282
            int[] r0 = r9.t
            r0 = r0[r13]
            int r15 = r15 - r0
            r22.h()
            int r0 = r16 + r15
            r1 = 21
            if (r0 >= 0) goto L_0x01a3
            android.widget.EdgeEffect r0 = r9.f170e
            float r2 = (float) r15
            int r3 = r22.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r22.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L_0x0195
            r0.onPull(r2, r3)
            goto L_0x0198
        L_0x0195:
            r0.onPull(r2)
        L_0x0198:
            android.widget.EdgeEffect r0 = r9.f171f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d5
            android.widget.EdgeEffect r0 = r9.f171f
            goto L_0x01d2
        L_0x01a3:
            r2 = r21
            if (r0 <= r2) goto L_0x01d5
            android.widget.EdgeEffect r0 = r9.f171f
            float r2 = (float) r15
            int r3 = r22.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r10.getX(r14)
            int r5 = r22.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r3 = r3 - r4
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L_0x01c5
            r0.onPull(r2, r3)
            goto L_0x01c8
        L_0x01c5:
            r0.onPull(r2)
        L_0x01c8:
            android.widget.EdgeEffect r0 = r9.f170e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d5
            android.widget.EdgeEffect r0 = r9.f170e
        L_0x01d2:
            r0.onRelease()
        L_0x01d5:
            android.widget.EdgeEffect r0 = r9.f170e
            if (r0 == 0) goto L_0x0282
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01e7
            android.widget.EdgeEffect r0 = r9.f171f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0282
        L_0x01e7:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = e.e.j.q.a
            r22.postInvalidateOnAnimation()
            goto L_0x0282
        L_0x01ee:
            android.view.VelocityTracker r0 = r9.f177l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.q
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.p
            if (r1 < r4) goto L_0x0216
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x0235
            r9.dispatchNestedFling(r2, r1, r13)
            r9.l(r0)
            goto L_0x0235
        L_0x0216:
            android.widget.OverScroller r14 = r9.f169d
            int r15 = r22.getScrollX()
            int r16 = r22.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r22.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0235
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = e.e.j.q.a
            r22.postInvalidateOnAnimation()
        L_0x0235:
            r9.r = r3
            r9.f176k = r11
            r22.w()
            r9.C(r11)
            android.widget.EdgeEffect r0 = r9.f170e
            if (r0 == 0) goto L_0x0282
        L_0x0243:
            r0.onRelease()
            android.widget.EdgeEffect r0 = r9.f171f
            r0.onRelease()
            goto L_0x0282
        L_0x024c:
            int r0 = r22.getChildCount()
            if (r0 != 0) goto L_0x0253
            return r11
        L_0x0253:
            android.widget.OverScroller r0 = r9.f169d
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r13
            r9.f176k = r0
            if (r0 == 0) goto L_0x0267
            android.view.ViewParent r0 = r22.getParent()
            if (r0 == 0) goto L_0x0267
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x0267:
            android.widget.OverScroller r0 = r9.f169d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0272
            r22.a()
        L_0x0272:
            float r0 = r23.getY()
            int r0 = (int) r0
            r9.f172g = r0
            int r0 = r10.getPointerId(r11)
            r9.r = r0
            r9.B(r1, r11)
        L_0x0282:
            android.view.VelocityTracker r0 = r9.f177l
            if (r0 == 0) goto L_0x0289
            r0.addMovement(r12)
        L_0x0289:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.c;
        return y(i2, rect3.top, rect3.bottom);
    }

    public boolean q(int i2) {
        return this.y.b(i2) != null;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f173h) {
            z(view2);
        } else {
            this.f175j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e2 = e(rect);
        boolean z3 = e2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, e2);
            } else {
                A(0, e2, 250, false);
            }
        }
        return z3;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            w();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.f173h = true;
        super.requestLayout();
    }

    public final boolean s(View view, int i2, int i3) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i2 >= getScrollY() && this.c.top - i2 <= getScrollY() + i3;
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d2 = d(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d3 = d(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d2 != getScrollX() || d3 != getScrollY()) {
                super.scrollTo(d2, d3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f178m) {
            this.f178m = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        g gVar = this.y;
        if (gVar.f1336d) {
            View view = gVar.c;
            WeakHashMap<View, String> weakHashMap = q.a;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof f) {
                ((f) view).stopNestedScroll();
            }
        }
        gVar.f1336d = z2;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.n = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return B(i2, 0);
    }

    public void stopNestedScroll() {
        C(0);
    }

    public final void t(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public final void u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f172g = (int) motionEvent.getY(i2);
            this.r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f177l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.q(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f169d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.v(int, int, int, int, int, int, int, int):boolean");
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f177l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f177l = null;
        }
    }

    public final void x(boolean z2) {
        if (z2) {
            B(2, 1);
        } else {
            C(1);
        }
        this.v = getScrollY();
        WeakHashMap<View, String> weakHashMap = q.a;
        postInvalidateOnAnimation();
    }

    public final boolean y(int i2, int i3, int i4) {
        boolean z2;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z3 = i5 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z5 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            g(z3 ? i6 - scrollY : i7 - i8);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z2;
    }

    public final void z(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int e2 = e(this.c);
        if (e2 != 0) {
            scrollBy(0, e2);
        }
    }
}
