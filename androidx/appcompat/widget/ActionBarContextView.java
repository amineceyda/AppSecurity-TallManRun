package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.b.h.d1;
import g.i.c.a.a.i.b;

public class ActionBarContextView extends e.b.h.a {

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f95j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f96k;

    /* renamed from: l  reason: collision with root package name */
    public View f97l;

    /* renamed from: m  reason: collision with root package name */
    public View f98m;
    public View n;
    public LinearLayout o;
    public TextView p;
    public TextView q;
    public int r;
    public int s;
    public boolean t;
    public int u;

    public class a implements View.OnClickListener {
        public final /* synthetic */ e.b.g.a b;

        public a(ActionBarContextView actionBarContextView, e.b.g.a aVar) {
            this.b = aVar;
        }

        public void onClick(View view) {
            this.b.c();
            b.C0166b.a.j(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968608(0x7f040020, float:1.7545874E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = e.b.b.f929d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = e.b.d.a.a.b(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = e.e.j.q.a
            r3.setBackground(r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.r = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.s = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f1091f = r4
            r4 = 2
            r0 = 2131492869(0x7f0c0005, float:1.8609202E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.u = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(e.b.g.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f97l
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.u
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f97l = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.f97l
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.f97l
            r2 = 2131296357(0x7f090065, float:1.8210628E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f98m = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.e()
            e.b.g.i.g r7 = (e.b.g.i.g) r7
            androidx.appcompat.widget.ActionMenuPresenter r0 = r6.f1090e
            if (r0 == 0) goto L_0x0041
            r0.b()
        L_0x0041:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f1090e = r0
            r2 = 1
            r0.f112m = r2
            r0.n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.ActionMenuPresenter r3 = r6.f1090e
            android.content.Context r4 = r6.c
            r7.b(r3, r4)
            androidx.appcompat.widget.ActionMenuPresenter r7 = r6.f1090e
            e.b.g.i.n r3 = r7.f1023i
            if (r3 != 0) goto L_0x0079
            android.view.LayoutInflater r4 = r7.f1019e
            int r5 = r7.f1021g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            e.b.g.i.n r1 = (e.b.g.i.n) r1
            r7.f1023i = r1
            e.b.g.i.g r4 = r7.f1018d
            r1.b(r4)
            r7.f(r2)
        L_0x0079:
            e.b.g.i.n r1 = r7.f1023i
            if (r3 == r1) goto L_0x0083
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0083:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f1089d = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, java.lang.String> r2 = e.e.j.q.a
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f1089d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(e.b.g.a):void");
    }

    public final void g() {
        if (this.o == null) {
            LayoutInflater.from(getContext()).inflate(2131492864, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.o = linearLayout;
            this.p = (TextView) linearLayout.findViewById(2131296328);
            this.q = (TextView) this.o.findViewById(2131296327);
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
        }
        this.p.setText(this.f95j);
        this.q.setText(this.f96k);
        boolean z = !TextUtils.isEmpty(this.f95j);
        boolean z2 = !TextUtils.isEmpty(this.f96k);
        int i2 = 0;
        this.q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.o;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.o.getParent() == null) {
            addView(this.o);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f96k;
    }

    public CharSequence getTitle() {
        return this.f95j;
    }

    public void h() {
        removeAllViews();
        this.n = null;
        this.f1089d = null;
        this.f1090e = null;
        View view = this.f98m;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1090e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.g();
            this.f1090e.l();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f95j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b = d1.b(this);
        int paddingRight = b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f97l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97l.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = b ? paddingRight - i6 : paddingRight + i6;
            int d2 = i8 + d(this.f97l, i8, paddingTop, paddingTop2, b);
            paddingRight = b ? d2 - i7 : d2 + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.o;
        if (!(linearLayout == null || this.n != null || linearLayout.getVisibility() == 8)) {
            i9 += d(this.o, i9, paddingTop, paddingTop2, b);
        }
        int i10 = i9;
        View view2 = this.n;
        if (view2 != null) {
            d(view2, i10, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1089d;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f1091f;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.f97l;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97l.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1089d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1089d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.o;
            if (linearLayout != null && this.n == null) {
                if (this.t) {
                    this.o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.o.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.o.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f1091f <= 0) {
                int childCount = getChildCount();
                i5 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i5) {
                        i5 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i2) {
        this.f1091f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (!(view == null || (linearLayout = this.o) == null)) {
            removeView(linearLayout);
            this.o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f96k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f95j = charSequence;
        g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
