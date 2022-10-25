package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment;
import e.e.j.q;
import e.h.b.c0;
import e.h.b.z;
import e.k.e;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class ViewPager extends ViewGroup {
    public static final int[] m0 = {16842931};
    public static final Comparator<e> n0 = new a();
    public static final Interpolator o0 = new b();
    public static final j p0 = new j();
    public int A;
    public int B;
    public int C;
    public float Q;
    public float R;
    public float S;
    public float T;
    public int U = -1;
    public VelocityTracker V;
    public int W;
    public int a0;
    public int b;
    public int b0;
    public final ArrayList<e> c = new ArrayList<>();
    public int c0;

    /* renamed from: d  reason: collision with root package name */
    public final e f243d = new e();
    public EdgeEffect d0;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f244e = new Rect();
    public EdgeEffect e0;

    /* renamed from: f  reason: collision with root package name */
    public e.s.a.a f245f;
    public boolean f0 = true;

    /* renamed from: g  reason: collision with root package name */
    public int f246g;
    public boolean g0;

    /* renamed from: h  reason: collision with root package name */
    public int f247h = -1;
    public int h0;

    /* renamed from: i  reason: collision with root package name */
    public Parcelable f248i = null;
    public List<h> i0;

    /* renamed from: j  reason: collision with root package name */
    public ClassLoader f249j = null;
    public h j0;

    /* renamed from: k  reason: collision with root package name */
    public Scroller f250k;
    public final Runnable k0 = new c();

    /* renamed from: l  reason: collision with root package name */
    public boolean f251l;
    public int l0 = 0;

    /* renamed from: m  reason: collision with root package name */
    public i f252m;
    public int n;
    public Drawable o;
    public int p;
    public int q;
    public float r = -3.4028235E38f;
    public float s = Float.MAX_VALUE;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x = 1;
    public boolean y;
    public boolean z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public Parcelable c;

        /* renamed from: d  reason: collision with root package name */
        public ClassLoader f253d;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
            this.f253d = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("FragmentPager.SavedState{");
            i2.append(Integer.toHexString(System.identityHashCode(this)));
            i2.append(" position=");
            return g.a.a.a.a.e(i2, this.b, "}");
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i2);
        }
    }

    public static class a implements Comparator<e> {
        public int compare(Object obj, Object obj2) {
            return ((e) obj).b - ((e) obj2).b;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.q(viewPager.f246g);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {
        public Object a;
        public int b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public float f254d;

        /* renamed from: e  reason: collision with root package name */
        public float f255e;
    }

    public static class f extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f256d;

        /* renamed from: e  reason: collision with root package name */
        public int f257e;

        /* renamed from: f  reason: collision with root package name */
        public int f258f;

        public f() {
            super(-1, -1);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.m0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class g extends e.e.j.a {
        public g() {
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            e.s.a.a aVar;
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            e.s.a.a aVar2 = ViewPager.this.f245f;
            boolean z = true;
            if (aVar2 == null || aVar2.c() <= 1) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f245f) != null) {
                accessibilityEvent.setItemCount(aVar.c());
                accessibilityEvent.setFromIndex(ViewPager.this.f246g);
                accessibilityEvent.setToIndex(ViewPager.this.f246g);
            }
        }

        public void c(View view, e.e.j.y.b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a.setClassName(ViewPager.class.getName());
            e.s.a.a aVar = ViewPager.this.f245f;
            bVar.a.setScrollable(aVar != null && aVar.c() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.a.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.a.addAction(8192);
            }
        }

        public boolean d(View view, int i2, Bundle bundle) {
            ViewPager viewPager;
            int i3;
            if (super.d(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i3 = viewPager.f246g - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i3 = viewPager.f246g + 1;
            }
            viewPager.setCurrentItem(i3);
            return true;
        }
    }

    public interface h {
        void a(int i2, float f2, int i3);

        void b(int i2);

        void c(int i2);
    }

    public class i extends DataSetObserver {
        public i() {
        }

        public void onChanged() {
            ViewPager.this.e();
        }

        public void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public static class j implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            f fVar = (f) ((View) obj).getLayoutParams();
            f fVar2 = (f) ((View) obj2).getLayoutParams();
            boolean z = fVar.a;
            if (z != fVar2.a) {
                return z ? 1 : -1;
            }
            return fVar.f257e - fVar2.f257e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f250k = new Scroller(context2, o0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.W = (int) (400.0f * f2);
        this.a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d0 = new EdgeEffect(context2);
        this.e0 = new EdgeEffect(context2);
        this.b0 = (int) (25.0f * f2);
        this.c0 = (int) (2.0f * f2);
        this.A = (int) (f2 * 16.0f);
        q.o(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        e.s.a.b bVar = new e.s.a.b(this);
        if (Build.VERSION.SDK_INT >= 21) {
            e.e.i.b.P(this, bVar);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
        }
    }

    public e a(int i2, int i3) {
        e eVar = new e();
        eVar.b = i2;
        z zVar = (z) this.f245f;
        if (zVar.c == null) {
            zVar.c = new e.h.b.a(zVar.a);
        }
        long j2 = (long) i2;
        Fragment H = zVar.a.H(z.e(getId(), j2));
        if (H != null) {
            zVar.c.b(new c0.a(7, H));
        } else {
            H = ((g.c.a.d.a.j.h) zVar).f1938f.get(i2);
            zVar.c.d(getId(), H, z.e(getId(), j2), 1);
        }
        if (H != zVar.f1512d) {
            H.setMenuVisibility(false);
            if (zVar.b == 1) {
                zVar.c.e(H, e.b.STARTED);
            } else {
                H.setUserVisibleHint(false);
            }
        }
        eVar.a = H;
        Objects.requireNonNull(this.f245f);
        eVar.f254d = 1.0f;
        if (i3 < 0 || i3 >= this.c.size()) {
            this.c.add(eVar);
        } else {
            this.c.add(i3, eVar);
        }
        return eVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        e h2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (h2 = h(childAt)) != null && h2.b == this.f246g) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        e h2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (h2 = h(childAt)) != null && h2.b == this.f246g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z2 = fVar.a | (view.getClass().getAnnotation(d.class) != null);
        fVar.a = z2;
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else if (!z2) {
            fVar.f256d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000a
            goto L_0x0063
        L_0x000a:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r4 = r0.getParent()
        L_0x0010:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001d
            if (r4 != r6) goto L_0x0018
            r4 = 1
            goto L_0x001e
        L_0x0018:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0010
        L_0x001d:
            r4 = 0
        L_0x001e:
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0034:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0034
        L_0x004d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L_0x0063:
            r0 = r3
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b0
            if (r3 == r0) goto L_0x00b0
            if (r7 != r5) goto L_0x008f
            android.graphics.Rect r1 = r6.f244e
            android.graphics.Rect r1 = r6.g(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f244e
            android.graphics.Rect r2 = r6.g(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00aa
            if (r1 < r2) goto L_0x00aa
            boolean r0 = r6.m()
            goto L_0x00ae
        L_0x008f:
            if (r7 != r4) goto L_0x00c3
            android.graphics.Rect r1 = r6.f244e
            android.graphics.Rect r1 = r6.g(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f244e
            android.graphics.Rect r2 = r6.g(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00aa
            if (r1 > r2) goto L_0x00aa
            boolean r0 = r6.n()
            goto L_0x00ae
        L_0x00aa:
            boolean r0 = r3.requestFocus()
        L_0x00ae:
            r2 = r0
            goto L_0x00c3
        L_0x00b0:
            if (r7 == r5) goto L_0x00bf
            if (r7 != r1) goto L_0x00b5
            goto L_0x00bf
        L_0x00b5:
            if (r7 == r4) goto L_0x00ba
            r0 = 2
            if (r7 != r0) goto L_0x00c3
        L_0x00ba:
            boolean r2 = r6.n()
            goto L_0x00c3
        L_0x00bf:
            boolean r2 = r6.m()
        L_0x00c3:
            if (r2 == 0) goto L_0x00cc
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    public boolean c(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (c(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f245f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.r)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.s));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f251l = true;
        if (this.f250k.isFinished() || !this.f250k.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f250k.getCurrX();
        int currY = this.f250k.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.f250k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, String> weakHashMap = q.a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z2) {
        boolean z3 = this.l0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f250k.isFinished()) {
                this.f250k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f250k.getCurrX();
                int currY = this.f250k.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.w = false;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            e eVar = this.c.get(i2);
            if (eVar.c) {
                eVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            Runnable runnable = this.k0;
            WeakHashMap<View, String> weakHashMap = q.a;
            postOnAnimation(runnable);
            return;
        }
        this.k0.run();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0059
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0056
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0044
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0056
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.b(r4)
            goto L_0x0057
        L_0x002b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L_0x0056
            boolean r6 = r5.b(r2)
            goto L_0x0057
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.n()
            goto L_0x0057
        L_0x0041:
            r6 = 66
            goto L_0x0051
        L_0x0044:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.m()
            goto L_0x0057
        L_0x004f:
            r6 = 17
        L_0x0051:
            boolean r6 = r5.b(r6)
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (h2 = h(childAt)) != null && h2.b == this.f246g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        e.s.a.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f245f) != null && aVar.c() > 1)) {
            if (!this.d0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.r * ((float) width));
                this.d0.setSize(height, width);
                z2 = false | this.d0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.e0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.s + 1.0f)) * ((float) width2));
                this.e0.setSize(height2, width2);
                z2 |= this.e0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.d0.finish();
            this.e0.finish();
        }
        if (z2) {
            WeakHashMap<View, String> weakHashMap = q.a;
            postInvalidateOnAnimation();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void e() {
        int c2 = this.f245f.c();
        this.b = c2;
        boolean z2 = this.c.size() < (this.x * 2) + 1 && this.c.size() < c2;
        int i2 = this.f246g;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            e.s.a.a aVar = this.f245f;
            Object obj = this.c.get(i3).a;
            Objects.requireNonNull(aVar);
        }
        Collections.sort(this.c, n0);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                f fVar = (f) getChildAt(i4).getLayoutParams();
                if (!fVar.a) {
                    fVar.c = 0.0f;
                }
            }
            w(i2, false, true, 0);
            requestLayout();
        }
    }

    public final void f(int i2) {
        h hVar = this.j0;
        if (hVar != null) {
            hVar.c(i2);
        }
        List<h> list = this.i0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar2 = this.i0.get(i3);
                if (hVar2 != null) {
                    hVar2.c(i2);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public e.s.a.a getAdapter() {
        return this.f245f;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f246g;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.n;
    }

    public e h(View view) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            e eVar = this.c.get(i2);
            e.s.a.a aVar = this.f245f;
            Object obj = eVar.a;
            Objects.requireNonNull((z) aVar);
            if (((Fragment) obj).getView() == view) {
                return eVar;
            }
        }
        return null;
    }

    public final e i() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.n) / ((float) clientWidth) : 0.0f;
        e eVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.c.size()) {
            e eVar2 = this.c.get(i4);
            if (!z2 && eVar2.b != (i2 = i3 + 1)) {
                eVar2 = this.f243d;
                eVar2.f255e = f2 + f4 + f3;
                eVar2.b = i2;
                Objects.requireNonNull(this.f245f);
                eVar2.f254d = 1.0f;
                i4--;
            }
            f2 = eVar2.f255e;
            float f5 = eVar2.f254d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return eVar;
            }
            if (scrollX < f5 || i4 == this.c.size() - 1) {
                return eVar2;
            }
            i3 = eVar2.b;
            f4 = eVar2.f254d;
            i4++;
            eVar = eVar2;
            z2 = false;
        }
        return eVar;
    }

    public e j(int i2) {
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            e eVar = this.c.get(i3);
            if (eVar.b == i2) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.h0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$h r0 = r12.j0
            if (r0 == 0) goto L_0x0072
            r0.a(r13, r14, r15)
        L_0x0072:
            java.util.List<androidx.viewpager.widget.ViewPager$h> r0 = r12.i0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
        L_0x007a:
            if (r1 >= r0) goto L_0x008c
            java.util.List<androidx.viewpager.widget.ViewPager$h> r3 = r12.i0
            java.lang.Object r3 = r3.get(r1)
            androidx.viewpager.widget.ViewPager$h r3 = (androidx.viewpager.widget.ViewPager.h) r3
            if (r3 == 0) goto L_0x0089
            r3.a(r13, r14, r15)
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008c:
            r12.g0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(int, float, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getX(i2);
            this.U = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.V;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean m() {
        int i2 = this.f246g;
        if (i2 <= 0) {
            return false;
        }
        v(i2 - 1, true);
        return true;
    }

    public boolean n() {
        e.s.a.a aVar = this.f245f;
        if (aVar == null || this.f246g >= aVar.c() - 1) {
            return false;
        }
        v(this.f246g + 1, true);
        return true;
    }

    public final boolean o(int i2) {
        if (this.c.size() != 0) {
            e i3 = i();
            int clientWidth = getClientWidth();
            int i4 = this.n;
            int i5 = clientWidth + i4;
            float f2 = (float) clientWidth;
            int i6 = i3.b;
            float f3 = ((((float) i2) / f2) - i3.f255e) / (i3.f254d + (((float) i4) / f2));
            this.g0 = false;
            k(i6, f3, (int) (((float) i5) * f3));
            if (this.g0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f0) {
            return false;
        } else {
            this.g0 = false;
            k(0, 0.0f, 0);
            if (this.g0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f0 = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        Scroller scroller = this.f250k;
        if (scroller != null && !scroller.isFinished()) {
            this.f250k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.n
            if (r1 <= 0) goto L_0x00ac
            android.graphics.drawable.Drawable r1 = r0.o
            if (r1 == 0) goto L_0x00ac
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r1 = r0.c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00ac
            e.s.a.a r1 = r0.f245f
            if (r1 == 0) goto L_0x00ac
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.n
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r5 = r0.c
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            float r7 = r5.f255e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            int r8 = r8.size()
            int r9 = r5.b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.c
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            int r10 = r10.b
        L_0x0045:
            if (r9 >= r10) goto L_0x00ac
        L_0x0047:
            int r11 = r5.b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r5 = r0.c
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f255e
            float r11 = r5.f254d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0073
        L_0x0065:
            e.s.a.a r11 = r0.f245f
            java.util.Objects.requireNonNull(r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r11 = r11 + r7
            r7 = r11
        L_0x0073:
            int r11 = r0.n
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x009b
            android.graphics.drawable.Drawable r11 = r0.o
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.p
            int r15 = r0.n
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.q
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.o
            r11 = r18
            r3.draw(r11)
            goto L_0x009f
        L_0x009b:
            r11 = r18
            r16 = r3
        L_0x009f:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.S = x2;
            this.Q = x2;
            float y2 = motionEvent.getY();
            this.T = y2;
            this.R = y2;
            this.U = motionEvent2.getPointerId(0);
            this.z = false;
            this.f251l = true;
            this.f250k.computeScrollOffset();
            if (this.l0 != 2 || Math.abs(this.f250k.getFinalX() - this.f250k.getCurrX()) <= this.c0) {
                d(false);
                this.y = false;
            } else {
                this.f250k.abortAnimation();
                this.w = false;
                q(this.f246g);
                this.y = true;
                s(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.U;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.Q;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.T);
                if (f2 != 0.0f) {
                    float f3 = this.Q;
                    if (!((f3 < ((float) this.B) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.B)) && f2 < 0.0f))) {
                        if (c(this, false, (int) f2, (int) x3, (int) y3)) {
                            this.Q = x3;
                            this.R = y3;
                            this.z = true;
                            return false;
                        }
                    }
                }
                int i3 = this.C;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.y = true;
                    s(true);
                    setScrollState(1);
                    this.Q = f2 > 0.0f ? this.S + ((float) this.C) : this.S - ((float) this.C);
                    this.R = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.z = true;
                }
                if (this.y && p(x3)) {
                    WeakHashMap<View, String> weakHashMap = q.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.V == null) {
            this.V = VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent2);
        return this.y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r12 = (androidx.viewpager.widget.ViewPager.f) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$e r10 = r0.h(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f255e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f256d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f256d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.p = r5
            int r3 = r3 - r7
            r0.q = r3
            r0.h0 = r11
            boolean r1 = r0.f0
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f246g
            r2 = 0
            r0.u(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.A
            int r15 = java.lang.Math.min(r15, r1)
            r13.B = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r3 = (androidx.viewpager.widget.ViewPager.f) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.t = r15
            r13.u = r4
            int r15 = r13.f246g
            r13.q(r15)
            r13.u = r0
            int r15 = r13.getChildCount()
        L_0x00c8:
            if (r0 >= r15) goto L_0x00f2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r2 = (androidx.viewpager.widget.ViewPager.f) r2
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r2.a
            if (r4 != 0) goto L_0x00ef
        L_0x00e0:
            float r4 = (float) r14
            float r2 = r2.c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.t
            r1.measure(r2, r4)
        L_0x00ef:
            int r0 = r0 + 1
            goto L_0x00c8
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        e h2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (h2 = h(childAt)) != null && h2.b == this.f246g && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        e.s.a.a aVar = this.f245f;
        if (aVar != null) {
            z zVar = (z) aVar;
            w(savedState.b, false, true, 0);
            return;
        }
        this.f247h = savedState.b;
        this.f248i = savedState.c;
        this.f249j = savedState.f253d;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.f246g;
        e.s.a.a aVar = this.f245f;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            savedState.c = null;
        }
        return savedState;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.n;
            r(i2, i4, i6, i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r0 = r10.getEdgeFlags()
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            e.s.a.a r0 = r9.f245f
            if (r0 == 0) goto L_0x019e
            int r0 = r0.c()
            if (r0 != 0) goto L_0x001a
            goto L_0x019e
        L_0x001a:
            android.view.VelocityTracker r0 = r9.V
            if (r0 != 0) goto L_0x0024
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.V = r0
        L_0x0024:
            android.view.VelocityTracker r0 = r9.V
            r0.addMovement(r10)
            int r0 = r10.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L_0x0174
            r3 = -1
            if (r0 == r2) goto L_0x00de
            r4 = 2
            if (r0 == r4) goto L_0x006f
            r3 = 3
            if (r0 == r3) goto L_0x0064
            r3 = 5
            if (r0 == r3) goto L_0x0054
            r3 = 6
            if (r0 == r3) goto L_0x0043
            goto L_0x0196
        L_0x0043:
            r9.l(r10)
            int r0 = r9.U
            int r0 = r10.findPointerIndex(r0)
            float r10 = r10.getX(r0)
            r9.Q = r10
            goto L_0x0196
        L_0x0054:
            int r0 = r10.getActionIndex()
            float r3 = r10.getX(r0)
            r9.Q = r3
            int r10 = r10.getPointerId(r0)
            goto L_0x0194
        L_0x0064:
            boolean r10 = r9.y
            if (r10 == 0) goto L_0x0196
            int r10 = r9.f246g
            r9.u(r10, r2, r1, r1)
            goto L_0x016f
        L_0x006f:
            boolean r0 = r9.y
            if (r0 != 0) goto L_0x00c9
            int r0 = r9.U
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x007d
            goto L_0x016f
        L_0x007d:
            float r3 = r10.getX(r0)
            float r4 = r9.Q
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r10.getY(r0)
            float r5 = r9.R
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r9.C
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c9
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c9
            r9.y = r2
            r9.s(r2)
            float r4 = r9.S
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b2
            int r3 = r9.C
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00b6
        L_0x00b2:
            int r3 = r9.C
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00b6:
            r9.Q = r4
            r9.R = r0
            r9.setScrollState(r2)
            r9.setScrollingCacheEnabled(r2)
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L_0x00c9
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00c9:
            boolean r0 = r9.y
            if (r0 == 0) goto L_0x0196
            int r0 = r9.U
            int r0 = r10.findPointerIndex(r0)
            float r10 = r10.getX(r0)
            boolean r10 = r9.p(r10)
            r1 = r1 | r10
            goto L_0x0196
        L_0x00de:
            boolean r0 = r9.y
            if (r0 == 0) goto L_0x0196
            android.view.VelocityTracker r0 = r9.V
            r4 = 1000(0x3e8, float:1.401E-42)
            int r5 = r9.a0
            float r5 = (float) r5
            r0.computeCurrentVelocity(r4, r5)
            int r4 = r9.U
            float r0 = r0.getXVelocity(r4)
            int r0 = (int) r0
            r9.w = r2
            int r4 = r9.getClientWidth()
            int r5 = r9.getScrollX()
            androidx.viewpager.widget.ViewPager$e r6 = r9.i()
            int r7 = r9.n
            float r7 = (float) r7
            float r4 = (float) r4
            float r7 = r7 / r4
            int r8 = r6.b
            float r5 = (float) r5
            float r5 = r5 / r4
            float r4 = r6.f255e
            float r5 = r5 - r4
            float r4 = r6.f254d
            float r4 = r4 + r7
            float r5 = r5 / r4
            int r4 = r9.U
            int r4 = r10.findPointerIndex(r4)
            float r10 = r10.getX(r4)
            float r4 = r9.S
            float r10 = r10 - r4
            int r10 = (int) r10
            int r10 = java.lang.Math.abs(r10)
            int r4 = r9.b0
            if (r10 <= r4) goto L_0x0135
            int r10 = java.lang.Math.abs(r0)
            int r4 = r9.W
            if (r10 <= r4) goto L_0x0135
            if (r0 <= 0) goto L_0x0132
            goto L_0x0143
        L_0x0132:
            int r8 = r8 + 1
            goto L_0x0143
        L_0x0135:
            int r10 = r9.f246g
            if (r8 < r10) goto L_0x013d
            r10 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x0140
        L_0x013d:
            r10 = 1058642330(0x3f19999a, float:0.6)
        L_0x0140:
            float r5 = r5 + r10
            int r10 = (int) r5
            int r8 = r8 + r10
        L_0x0143:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r9.c
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x016c
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r9.c
            java.lang.Object r10 = r10.get(r1)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r1 = r9.c
            int r4 = r1.size()
            int r4 = r4 + r3
            java.lang.Object r1 = r1.get(r4)
            androidx.viewpager.widget.ViewPager$e r1 = (androidx.viewpager.widget.ViewPager.e) r1
            int r10 = r10.b
            int r1 = r1.b
            int r1 = java.lang.Math.min(r8, r1)
            int r8 = java.lang.Math.max(r10, r1)
        L_0x016c:
            r9.w(r8, r2, r2, r0)
        L_0x016f:
            boolean r1 = r9.t()
            goto L_0x0196
        L_0x0174:
            android.widget.Scroller r0 = r9.f250k
            r0.abortAnimation()
            r9.w = r1
            int r0 = r9.f246g
            r9.q(r0)
            float r0 = r10.getX()
            r9.S = r0
            r9.Q = r0
            float r0 = r10.getY()
            r9.T = r0
            r9.R = r0
            int r10 = r10.getPointerId(r1)
        L_0x0194:
            r9.U = r10
        L_0x0196:
            if (r1 == 0) goto L_0x019d
            java.util.WeakHashMap<android.view.View, java.lang.String> r10 = e.e.j.q.a
            r9.postInvalidateOnAnimation()
        L_0x019d:
            return r2
        L_0x019e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.Q - f2;
        this.Q = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.r * clientWidth;
        float f5 = this.s * clientWidth;
        boolean z4 = false;
        e eVar = this.c.get(0);
        ArrayList<e> arrayList = this.c;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.b != 0) {
            f4 = eVar.f255e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (eVar2.b != this.f245f.c() - 1) {
            f5 = eVar2.f255e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.d0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.e0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.Q = (scrollX - ((float) i2)) + this.Q;
        scrollTo(i2, getScrollY());
        o(i2);
        return z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r8 == r9) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if (r8 >= 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        if (r8 >= 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r8 >= 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e0, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0135, code lost:
        if (r11 < r0.c.size()) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0149, code lost:
        if (r11 < r0.c.size()) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015b, code lost:
        if (r11 < r0.c.size()) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0166, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f246g
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$e r2 = r0.j(r2)
            r0.f246g = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            e.s.a.a r1 = r0.f245f
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            e.s.a.a r1 = r0.f245f
            r1.d(r0)
            int r1 = r0.x
            int r3 = r0.f246g
            int r3 = r3 - r1
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            e.s.a.a r5 = r0.f245f
            int r5 = r5.c()
            int r6 = r5 + -1
            int r7 = r0.f246g
            int r7 = r7 + r1
            int r1 = java.lang.Math.min(r6, r7)
            int r6 = r0.b
            if (r5 != r6) goto L_0x0360
            r6 = 0
        L_0x0044:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r0.c
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0060
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r0.c
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            int r8 = r7.b
            int r9 = r0.f246g
            if (r8 < r9) goto L_0x005d
            if (r8 != r9) goto L_0x0060
            goto L_0x0061
        L_0x005d:
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0060:
            r7 = 0
        L_0x0061:
            if (r7 != 0) goto L_0x006b
            if (r5 <= 0) goto L_0x006b
            int r7 = r0.f246g
            androidx.viewpager.widget.ViewPager$e r7 = r0.a(r7, r6)
        L_0x006b:
            if (r7 == 0) goto L_0x02df
            int r8 = r6 + -1
            if (r8 < 0) goto L_0x007a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.c
            java.lang.Object r9 = r9.get(r8)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            int r10 = r17.getClientWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            if (r10 > 0) goto L_0x0085
            r12 = 0
            goto L_0x0091
        L_0x0085:
            float r12 = r7.f254d
            float r12 = r11 - r12
            int r13 = r17.getPaddingLeft()
            float r13 = (float) r13
            float r14 = (float) r10
            float r13 = r13 / r14
            float r12 = r12 + r13
        L_0x0091:
            int r13 = r0.f246g
            r14 = 1
            int r13 = r13 - r14
            r15 = 0
        L_0x0096:
            if (r13 < 0) goto L_0x00e6
            int r16 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r16 < 0) goto L_0x00bc
            if (r13 >= r3) goto L_0x00bc
            if (r9 != 0) goto L_0x00a1
            goto L_0x00e6
        L_0x00a1:
            int r4 = r9.b
            if (r13 != r4) goto L_0x00e2
            boolean r4 = r9.c
            if (r4 != 0) goto L_0x00e2
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r0.c
            r4.remove(r8)
            e.s.a.a r4 = r0.f245f
            java.lang.Object r9 = r9.a
            r4.a(r0, r13, r9)
            int r8 = r8 + -1
            int r6 = r6 + -1
            if (r8 < 0) goto L_0x00e0
            goto L_0x00d7
        L_0x00bc:
            if (r9 == 0) goto L_0x00ca
            int r4 = r9.b
            if (r13 != r4) goto L_0x00ca
            float r4 = r9.f254d
            float r15 = r15 + r4
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x00e0
            goto L_0x00d7
        L_0x00ca:
            int r4 = r8 + 1
            androidx.viewpager.widget.ViewPager$e r4 = r0.a(r13, r4)
            float r4 = r4.f254d
            float r15 = r15 + r4
            int r6 = r6 + 1
            if (r8 < 0) goto L_0x00e0
        L_0x00d7:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r0.c
            java.lang.Object r4 = r4.get(r8)
            androidx.viewpager.widget.ViewPager$e r4 = (androidx.viewpager.widget.ViewPager.e) r4
            goto L_0x00e1
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            r9 = r4
        L_0x00e2:
            int r13 = r13 + -1
            r4 = 0
            goto L_0x0096
        L_0x00e6:
            float r3 = r7.f254d
            int r4 = r6 + 1
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x016a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            int r8 = r8.size()
            if (r4 >= r8) goto L_0x00ff
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            java.lang.Object r8 = r8.get(r4)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            goto L_0x0100
        L_0x00ff:
            r8 = 0
        L_0x0100:
            if (r10 > 0) goto L_0x0104
            r9 = 0
            goto L_0x010c
        L_0x0104:
            int r9 = r17.getPaddingRight()
            float r9 = (float) r9
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = r9 + r11
        L_0x010c:
            int r10 = r0.f246g
            int r10 = r10 + r14
            r11 = r4
        L_0x0110:
            if (r10 >= r5) goto L_0x016a
            int r12 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x0138
            if (r10 <= r1) goto L_0x0138
            if (r8 != 0) goto L_0x011b
            goto L_0x016a
        L_0x011b:
            int r12 = r8.b
            if (r10 != r12) goto L_0x0167
            boolean r12 = r8.c
            if (r12 != 0) goto L_0x0167
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r12 = r0.c
            r12.remove(r11)
            e.s.a.a r12 = r0.f245f
            java.lang.Object r8 = r8.a
            r12.a(r0, r10, r8)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0166
            goto L_0x015d
        L_0x0138:
            if (r8 == 0) goto L_0x014c
            int r12 = r8.b
            if (r10 != r12) goto L_0x014c
            float r8 = r8.f254d
            float r3 = r3 + r8
            int r11 = r11 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0166
            goto L_0x015d
        L_0x014c:
            androidx.viewpager.widget.ViewPager$e r8 = r0.a(r10, r11)
            int r11 = r11 + 1
            float r8 = r8.f254d
            float r3 = r3 + r8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0166
        L_0x015d:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.c
            java.lang.Object r8 = r8.get(r11)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            goto L_0x0167
        L_0x0166:
            r8 = 0
        L_0x0167:
            int r10 = r10 + 1
            goto L_0x0110
        L_0x016a:
            e.s.a.a r1 = r0.f245f
            int r1 = r1.c()
            int r3 = r17.getClientWidth()
            if (r3 <= 0) goto L_0x017c
            int r5 = r0.n
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            goto L_0x017d
        L_0x017c:
            r5 = 0
        L_0x017d:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0205
            int r8 = r2.b
            int r9 = r7.b
            if (r8 >= r9) goto L_0x01ca
            float r9 = r2.f255e
            float r2 = r2.f254d
            float r9 = r9 + r2
            float r9 = r9 + r5
            r2 = 0
        L_0x018e:
            int r8 = r8 + r14
            int r10 = r7.b
            if (r8 > r10) goto L_0x0205
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.c
            int r10 = r10.size()
            if (r2 >= r10) goto L_0x0205
        L_0x019b:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.c
            java.lang.Object r10 = r10.get(r2)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            int r11 = r10.b
            if (r8 <= r11) goto L_0x01b4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r11 = r0.c
            int r11 = r11.size()
            int r11 = r11 + -1
            if (r2 >= r11) goto L_0x01b4
            int r2 = r2 + 1
            goto L_0x019b
        L_0x01b4:
            int r11 = r10.b
            if (r8 >= r11) goto L_0x01c3
            e.s.a.a r11 = r0.f245f
            java.util.Objects.requireNonNull(r11)
            float r11 = r3 + r5
            float r9 = r9 + r11
            int r8 = r8 + 1
            goto L_0x01b4
        L_0x01c3:
            r10.f255e = r9
            float r10 = r10.f254d
            float r10 = r10 + r5
            float r9 = r9 + r10
            goto L_0x018e
        L_0x01ca:
            if (r8 <= r9) goto L_0x0205
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.c
            int r9 = r9.size()
            int r9 = r9 + -1
            float r2 = r2.f255e
        L_0x01d6:
            int r8 = r8 + -1
            int r10 = r7.b
            if (r8 < r10) goto L_0x0205
            if (r9 < 0) goto L_0x0205
        L_0x01de:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.c
            java.lang.Object r10 = r10.get(r9)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            int r11 = r10.b
            if (r8 >= r11) goto L_0x01ef
            if (r9 <= 0) goto L_0x01ef
            int r9 = r9 + -1
            goto L_0x01de
        L_0x01ef:
            int r11 = r10.b
            if (r8 <= r11) goto L_0x01fe
            e.s.a.a r11 = r0.f245f
            java.util.Objects.requireNonNull(r11)
            float r11 = r3 + r5
            float r2 = r2 - r11
            int r8 = r8 + -1
            goto L_0x01ef
        L_0x01fe:
            float r11 = r10.f254d
            float r11 = r11 + r5
            float r2 = r2 - r11
            r10.f255e = r2
            goto L_0x01d6
        L_0x0205:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r2 = r0.c
            int r2 = r2.size()
            float r8 = r7.f255e
            int r9 = r7.b
            int r10 = r9 + -1
            if (r9 != 0) goto L_0x0215
            r11 = r8
            goto L_0x0218
        L_0x0215:
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0218:
            r0.r = r11
            int r1 = r1 + -1
            if (r9 != r1) goto L_0x0223
            float r9 = r7.f254d
            float r9 = r9 + r8
            float r9 = r9 - r3
            goto L_0x0226
        L_0x0223:
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0226:
            r0.s = r9
            int r6 = r6 + -1
        L_0x022a:
            if (r6 < 0) goto L_0x0252
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.c
            java.lang.Object r9 = r9.get(r6)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
        L_0x0234:
            int r11 = r9.b
            if (r10 <= r11) goto L_0x0243
            e.s.a.a r11 = r0.f245f
            int r10 = r10 + -1
            java.util.Objects.requireNonNull(r11)
            float r11 = r3 + r5
            float r8 = r8 - r11
            goto L_0x0234
        L_0x0243:
            float r12 = r9.f254d
            float r12 = r12 + r5
            float r8 = r8 - r12
            r9.f255e = r8
            if (r11 != 0) goto L_0x024d
            r0.r = r8
        L_0x024d:
            int r6 = r6 + -1
            int r10 = r10 + -1
            goto L_0x022a
        L_0x0252:
            float r6 = r7.f255e
            float r8 = r7.f254d
            float r6 = r6 + r8
            float r6 = r6 + r5
            int r8 = r7.b
            int r8 = r8 + r14
        L_0x025b:
            if (r4 >= r2) goto L_0x0287
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.c
            java.lang.Object r9 = r9.get(r4)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
        L_0x0265:
            int r10 = r9.b
            if (r8 >= r10) goto L_0x0274
            e.s.a.a r10 = r0.f245f
            int r8 = r8 + 1
            java.util.Objects.requireNonNull(r10)
            float r10 = r3 + r5
            float r6 = r6 + r10
            goto L_0x0265
        L_0x0274:
            if (r10 != r1) goto L_0x027c
            float r10 = r9.f254d
            float r10 = r10 + r6
            float r10 = r10 - r3
            r0.s = r10
        L_0x027c:
            r9.f255e = r6
            float r9 = r9.f254d
            float r9 = r9 + r5
            float r6 = r6 + r9
            int r4 = r4 + 1
            int r8 = r8 + 1
            goto L_0x025b
        L_0x0287:
            e.s.a.a r1 = r0.f245f
            java.lang.Object r2 = r7.a
            e.h.b.z r1 = (e.h.b.z) r1
            java.util.Objects.requireNonNull(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.Fragment r3 = r1.f1512d
            r4 = 0
            if (r2 == r3) goto L_0x02df
            if (r3 == 0) goto L_0x02be
            r3.setMenuVisibility(r4)
            int r3 = r1.b
            if (r3 != r14) goto L_0x02b8
            e.h.b.c0 r3 = r1.c
            if (r3 != 0) goto L_0x02ad
            androidx.fragment.app.FragmentManager r3 = r1.a
            e.h.b.a r4 = new e.h.b.a
            r4.<init>(r3)
            r1.c = r4
        L_0x02ad:
            e.h.b.c0 r3 = r1.c
            androidx.fragment.app.Fragment r4 = r1.f1512d
            e.k.e$b r5 = e.k.e.b.STARTED
            r3.e(r4, r5)
            r4 = 0
            goto L_0x02be
        L_0x02b8:
            androidx.fragment.app.Fragment r3 = r1.f1512d
            r4 = 0
            r3.setUserVisibleHint(r4)
        L_0x02be:
            r2.setMenuVisibility(r14)
            int r3 = r1.b
            if (r3 != r14) goto L_0x02da
            e.h.b.c0 r3 = r1.c
            if (r3 != 0) goto L_0x02d2
            androidx.fragment.app.FragmentManager r3 = r1.a
            e.h.b.a r5 = new e.h.b.a
            r5.<init>(r3)
            r1.c = r5
        L_0x02d2:
            e.h.b.c0 r3 = r1.c
            e.k.e$b r5 = e.k.e.b.RESUMED
            r3.e(r2, r5)
            goto L_0x02dd
        L_0x02da:
            r2.setUserVisibleHint(r14)
        L_0x02dd:
            r1.f1512d = r2
        L_0x02df:
            e.s.a.a r1 = r0.f245f
            r1.b(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x02e9:
            if (r2 >= r1) goto L_0x0313
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            r5.f258f = r2
            boolean r6 = r5.a
            if (r6 != 0) goto L_0x0310
            float r6 = r5.c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0310
            androidx.viewpager.widget.ViewPager$e r3 = r0.h(r3)
            if (r3 == 0) goto L_0x0310
            float r6 = r3.f254d
            r5.c = r6
            int r3 = r3.b
            r5.f257e = r3
        L_0x0310:
            int r2 = r2 + 1
            goto L_0x02e9
        L_0x0313:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x035f
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0335
        L_0x031f:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == r0) goto L_0x0330
            if (r2 == 0) goto L_0x0335
            boolean r1 = r2 instanceof android.view.View
            if (r1 != 0) goto L_0x032c
            goto L_0x0335
        L_0x032c:
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L_0x031f
        L_0x0330:
            androidx.viewpager.widget.ViewPager$e r1 = r0.h(r1)
            goto L_0x0336
        L_0x0335:
            r1 = 0
        L_0x0336:
            if (r1 == 0) goto L_0x033e
            int r1 = r1.b
            int r2 = r0.f246g
            if (r1 == r2) goto L_0x035f
        L_0x033e:
            int r1 = r17.getChildCount()
            if (r4 >= r1) goto L_0x035f
            android.view.View r1 = r0.getChildAt(r4)
            androidx.viewpager.widget.ViewPager$e r2 = r0.h(r1)
            if (r2 == 0) goto L_0x035c
            int r2 = r2.b
            int r3 = r0.f246g
            if (r2 != r3) goto L_0x035c
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x035c
            goto L_0x035f
        L_0x035c:
            int r4 = r4 + 1
            goto L_0x033e
        L_0x035f:
            return
        L_0x0360:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x036d }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x036d }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x036d }
            goto L_0x0375
        L_0x036d:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0375:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r3 = g.a.a.a.a.i(r3)
            int r4 = r0.b
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            e.s.a.a r1 = r0.f245f
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x03b5
        L_0x03b4:
            throw r2
        L_0x03b5:
            goto L_0x03b4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.c.isEmpty()) {
            e j2 = j(this.f246g);
            min = (int) ((j2 != null ? Math.min(j2.f255e, this.s) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                d(false);
            } else {
                return;
            }
        } else if (!this.f250k.isFinished()) {
            this.f250k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        }
        scrollTo(min, getScrollY());
    }

    public void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setAdapter(e.s.a.a aVar) {
        g.i.c.a.a.i.b bVar = b.C0166b.a;
        Objects.requireNonNull(bVar);
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onSetViewPagerAdapter, viewPager = ");
            i2.append(n.b(this));
            g.c.b.b.f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            g.i.c.a.a.i.e.i iVar = (g.i.c.a.a.i.e.i) g.i.c.a.a.b0.g.a(4);
            iVar.a = this;
            bVar.b.a(this, iVar);
        }
        e.s.a.a aVar2 = this.f245f;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f245f.d(this);
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                e eVar2 = this.c.get(i3);
                this.f245f.a(this, eVar2.b, eVar2.a);
            }
            this.f245f.b(this);
            this.c.clear();
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (!((f) getChildAt(i4).getLayoutParams()).a) {
                    removeViewAt(i4);
                    i4--;
                }
                i4++;
            }
            this.f246g = 0;
            scrollTo(0, 0);
        }
        this.f245f = aVar;
        this.b = 0;
        if (aVar != null) {
            if (this.f252m == null) {
                this.f252m = new i();
            }
            synchronized (this.f245f) {
            }
            this.w = false;
            boolean z2 = this.f0;
            this.f0 = true;
            this.b = this.f245f.c();
            if (this.f247h >= 0) {
                Objects.requireNonNull((z) this.f245f);
                w(this.f247h, false, true, 0);
                this.f247h = -1;
                this.f248i = null;
                this.f249j = null;
            } else if (!z2) {
                q(this.f246g);
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.w = false;
        w(i2, !this.f0, false, 0);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.x) {
            this.x = i2;
            q(this.f246g);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.j0 = hVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.n;
        this.n = i2;
        int width = getWidth();
        r(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(e.e.c.a.c(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.l0 != i2) {
            this.l0 = i2;
            h hVar = this.j0;
            if (hVar != null) {
                hVar.b(i2);
            }
            List<h> list = this.i0;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    h hVar2 = this.i0.get(i3);
                    if (hVar2 != null) {
                        hVar2.b(i2);
                    }
                }
            }
        }
    }

    public final boolean t() {
        this.U = -1;
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.V = null;
        }
        this.d0.onRelease();
        this.e0.onRelease();
        if (this.d0.isFinished() || this.e0.isFinished()) {
            return true;
        }
        return false;
    }

    public final void u(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        int i5;
        e j2 = j(i2);
        int max = j2 != null ? (int) (Math.max(this.r, Math.min(j2.f255e, this.s)) * ((float) getClientWidth())) : 0;
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f250k;
                if (scroller != null && !scroller.isFinished()) {
                    i4 = this.f251l ? this.f250k.getCurrX() : this.f250k.getStartX();
                    this.f250k.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i4 = getScrollX();
                }
                int i6 = i4;
                int scrollY = getScrollY();
                int i7 = max - i6;
                int i8 = 0 - scrollY;
                if (i7 == 0 && i8 == 0) {
                    d(false);
                    q(this.f246g);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i9 = clientWidth / 2;
                    float f2 = (float) clientWidth;
                    float f3 = (float) i9;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        Objects.requireNonNull(this.f245f);
                        i5 = (int) (((((float) Math.abs(i7)) / ((f2 * 1.0f) + ((float) this.n))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i5, 600);
                    this.f251l = false;
                    this.f250k.startScroll(i6, scrollY, i7, i8, min);
                    WeakHashMap<View, String> weakHashMap = q.a;
                    postInvalidateOnAnimation();
                }
            }
            if (z3) {
                f(i2);
                return;
            }
            return;
        }
        if (z3) {
            f(i2);
        }
        d(false);
        scrollTo(max, 0);
        o(max);
    }

    public void v(int i2, boolean z2) {
        this.w = false;
        w(i2, z2, false, 0);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    public void w(int i2, boolean z2, boolean z3, int i3) {
        e.s.a.a aVar = this.f245f;
        boolean z4 = false;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f246g != i2 || this.c.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f245f.c()) {
                i2 = this.f245f.c() - 1;
            }
            int i4 = this.x;
            int i5 = this.f246g;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.c.size(); i6++) {
                    this.c.get(i6).c = true;
                }
            }
            if (this.f246g != i2) {
                z4 = true;
            }
            if (this.f0) {
                this.f246g = i2;
                if (z4) {
                    f(i2);
                }
                requestLayout();
                return;
            }
            q(i2);
            u(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }
}
