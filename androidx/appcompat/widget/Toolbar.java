package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import e.b.c.a;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.m;
import e.b.g.i.r;
import e.b.h.d0;
import e.b.h.d1;
import e.b.h.k;
import e.b.h.p0;
import e.b.h.x0;
import e.b.h.z;
import e.b.h.z0;
import e.e.j.q;
import g.i.c.a.a.i.b;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean Q;
    public final ArrayList<View> R = new ArrayList<>();
    public final ArrayList<View> S = new ArrayList<>();
    public final int[] T = new int[2];
    public f U;
    public final ActionMenuView.e V = new a();
    public z0 W;
    public ActionMenuPresenter a0;
    public ActionMenuView b;
    public d b0;
    public TextView c;
    public boolean c0;

    /* renamed from: d  reason: collision with root package name */
    public TextView f142d;
    public final Runnable d0 = new b();

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f143e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f144f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f145g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f146h;

    /* renamed from: i  reason: collision with root package name */
    public ImageButton f147i;

    /* renamed from: j  reason: collision with root package name */
    public View f148j;

    /* renamed from: k  reason: collision with root package name */
    public Context f149k;

    /* renamed from: l  reason: collision with root package name */
    public int f150l;

    /* renamed from: m  reason: collision with root package name */
    public int f151m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public p0 u;
    public int v;
    public int w;
    public int x = 8388627;
    public CharSequence y;
    public CharSequence z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public boolean c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.b = parcel.readInt();
            this.c = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.u();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            d dVar = Toolbar.this.b0;
            i iVar = dVar == null ? null : dVar.c;
            if (iVar != null) {
                iVar.collapseActionView();
            }
            b.C0166b.a.j(view);
        }
    }

    public class d implements m {
        public g b;
        public i c;

        public d() {
        }

        public void a(g gVar, boolean z) {
        }

        public void c(Context context, g gVar) {
            i iVar;
            g gVar2 = this.b;
            if (!(gVar2 == null || (iVar = this.c) == null)) {
                gVar2.d(iVar);
            }
            this.b = gVar;
        }

        public boolean e(r rVar) {
            return false;
        }

        public void f(boolean z) {
            if (this.c != null) {
                g gVar = this.b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.b.getItem(i2) == this.c) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    i(this.b, this.c);
                }
            }
        }

        public boolean h() {
            return false;
        }

        public boolean i(g gVar, i iVar) {
            View view = Toolbar.this.f148j;
            if (view instanceof e.b.g.b) {
                ((e.b.g.b) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f148j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f147i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f148j = null;
            int size = toolbar3.S.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.S.get(size));
                } else {
                    toolbar3.S.clear();
                    this.c = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
            }
        }

        public boolean j(g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f147i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f147i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f147i);
            }
            Toolbar.this.f148j = iVar.getActionView();
            this.c = iVar;
            ViewParent parent2 = Toolbar.this.f148j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f148j);
                }
                e h2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h2.a = 8388611 | (toolbar4.o & 112);
                h2.b = 2;
                toolbar4.f148j.setLayoutParams(h2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f148j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == toolbar6.b)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.S.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            View view = Toolbar.this.f148j;
            if (view instanceof e.b.g.b) {
                ((e.b.g.b) view).c();
            }
            return true;
        }
    }

    public static class e extends a.C0032a {
        public int b = 0;

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0032a) eVar);
            this.b = eVar.b;
        }

        public e(a.C0032a aVar) {
            super(aVar);
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969770);
        Context context2 = getContext();
        int[] iArr = e.b.b.w;
        x0 o2 = x0.o(context2, attributeSet, iArr, 2130969770, 0);
        q.m(this, context, iArr, attributeSet, o2.b, 2130969770, 0);
        this.f151m = o2.j(28, 0);
        this.n = o2.j(19, 0);
        this.x = o2.b.getInteger(0, this.x);
        this.o = o2.b.getInteger(2, 48);
        int c2 = o2.c(22, 0);
        c2 = o2.m(27) ? o2.c(27, c2) : c2;
        this.t = c2;
        this.s = c2;
        this.r = c2;
        this.q = c2;
        int c3 = o2.c(25, -1);
        if (c3 >= 0) {
            this.q = c3;
        }
        int c4 = o2.c(24, -1);
        if (c4 >= 0) {
            this.r = c4;
        }
        int c5 = o2.c(26, -1);
        if (c5 >= 0) {
            this.s = c5;
        }
        int c6 = o2.c(23, -1);
        if (c6 >= 0) {
            this.t = c6;
        }
        this.p = o2.d(13, -1);
        int c7 = o2.c(9, Integer.MIN_VALUE);
        int c8 = o2.c(5, Integer.MIN_VALUE);
        int d2 = o2.d(7, 0);
        int d3 = o2.d(8, 0);
        d();
        p0 p0Var = this.u;
        p0Var.f1180h = false;
        if (d2 != Integer.MIN_VALUE) {
            p0Var.f1177e = d2;
            p0Var.a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            p0Var.f1178f = d3;
            p0Var.b = d3;
        }
        if (!(c7 == Integer.MIN_VALUE && c8 == Integer.MIN_VALUE)) {
            p0Var.a(c7, c8);
        }
        this.v = o2.c(10, Integer.MIN_VALUE);
        this.w = o2.c(6, Integer.MIN_VALUE);
        this.f145g = o2.e(4);
        this.f146h = o2.l(3);
        CharSequence l2 = o2.l(21);
        if (!TextUtils.isEmpty(l2)) {
            setTitle(l2);
        }
        CharSequence l3 = o2.l(18);
        if (!TextUtils.isEmpty(l3)) {
            setSubtitle(l3);
        }
        this.f149k = getContext();
        setPopupTheme(o2.j(17, 0));
        Drawable e2 = o2.e(16);
        if (e2 != null) {
            setNavigationIcon(e2);
        }
        CharSequence l4 = o2.l(15);
        if (!TextUtils.isEmpty(l4)) {
            setNavigationContentDescription(l4);
        }
        Drawable e3 = o2.e(11);
        if (e3 != null) {
            setLogo(e3);
        }
        CharSequence l5 = o2.l(12);
        if (!TextUtils.isEmpty(l5)) {
            setLogoDescription(l5);
        }
        if (o2.m(29)) {
            setTitleTextColor(o2.b(29));
        }
        if (o2.m(20)) {
            setSubtitleTextColor(o2.b(20));
        }
        if (o2.m(14)) {
            getMenuInflater().inflate(o2.j(14, 0), getMenu());
        }
        o2.b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new e.b.g.f(getContext());
    }

    public final void a(List<View> list, int i2) {
        WeakHashMap<View, String> weakHashMap = q.a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && t(childAt) && j(eVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && t(childAt2) && j(eVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e h2 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        h2.b = 1;
        if (!z2 || this.f148j == null) {
            addView(view, h2);
            return;
        }
        view.setLayoutParams(h2);
        this.S.add(view);
    }

    public void c() {
        if (this.f147i == null) {
            k kVar = new k(getContext(), (AttributeSet) null, 2130969769);
            this.f147i = kVar;
            kVar.setImageDrawable(this.f145g);
            this.f147i.setContentDescription(this.f146h);
            e h2 = generateDefaultLayoutParams();
            h2.a = 8388611 | (this.o & 112);
            h2.b = 2;
            this.f147i.setLayoutParams(h2);
            this.f147i.setOnClickListener(new c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.u == null) {
            this.u = new p0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView.q == null) {
            g gVar = (g) actionMenuView.getMenu();
            if (this.b0 == null) {
                this.b0 = new d();
            }
            this.b.setExpandedActionViewsExclusive(true);
            gVar.b(this.b0, this.f149k);
        }
    }

    public final void f() {
        if (this.b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.b = actionMenuView;
            actionMenuView.setPopupTheme(this.f150l);
            this.b.setOnMenuItemClickListener(this.V);
            ActionMenuView actionMenuView2 = this.b;
            actionMenuView2.v = null;
            actionMenuView2.w = null;
            e h2 = generateDefaultLayoutParams();
            h2.a = 8388613 | (this.o & 112);
            this.b.setLayoutParams(h2);
            b(this.b, false);
        }
    }

    public final void g() {
        if (this.f143e == null) {
            this.f143e = new k(getContext(), (AttributeSet) null, 2130969769);
            e h2 = generateDefaultLayoutParams();
            h2.a = 8388611 | (this.o & 112);
            this.f143e.setLayoutParams(h2);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f147i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f147i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f1179g ? p0Var.a : p0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f1179g ? p0Var.b : p0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.b
            r1 = 0
            if (r0 == 0) goto L_0x0011
            e.b.g.i.g r0 = r0.q
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, String> weakHashMap = q.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, String> weakHashMap = q.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f144f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f144f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f143e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f143e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.a0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f149k;
    }

    public int getPopupTheme() {
        return this.f150l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.f142d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.c;
    }

    public d0 getWrapper() {
        if (this.W == null) {
            this.W = new z0(this, true);
        }
        return this.W;
    }

    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0032a ? new e((a.C0032a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i2) {
        WeakHashMap<View, String> weakHashMap = q.a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.x & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = eVar.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = eVar.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.S.contains(view);
    }

    public boolean o() {
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.u;
            if (actionMenuPresenter != null && actionMenuPresenter.m()) {
                return true;
            }
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.d0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.Q = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0297 A[LOOP:0: B:106:0x0295->B:107:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9 A[LOOP:1: B:109:0x02b7->B:110:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02de A[LOOP:2: B:112:0x02dc->B:113:0x02de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0330 A[LOOP:3: B:120:0x032e->B:121:0x0330, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = e.e.j.q.a
            int r1 = r19.getLayoutDirection()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.T
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r19.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            android.widget.ImageButton r13 = r0.f143e
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x0055
            android.widget.ImageButton r13 = r0.f143e
            if (r1 == 0) goto L_0x0050
            int r13 = r0.q(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.p(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f147i
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x006c
            android.widget.ImageButton r15 = r0.f147i
            if (r1 == 0) goto L_0x0068
            int r14 = r0.q(r15, r14, r11, r12)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.p(r15, r13, r11, r12)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.b
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.b
            if (r1 == 0) goto L_0x007d
            int r13 = r0.p(r15, r13, r11, r12)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.q(r15, r14, r11, r12)
        L_0x0081:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f148j
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f148j
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.q(r13, r10, r11, r12)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.p(r13, r2, r11, r12)
        L_0x00bc:
            android.widget.ImageView r13 = r0.f144f
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00d1
            android.widget.ImageView r13 = r0.f144f
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.q(r13, r10, r11, r12)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.p(r13, r2, r11, r12)
        L_0x00d1:
            android.widget.TextView r13 = r0.c
            boolean r13 = r0.t(r13)
            android.widget.TextView r14 = r0.f142d
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L_0x00f8
            android.widget.TextView r15 = r0.c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.c
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r23 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            android.widget.TextView r3 = r0.f142d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f142d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r22 = r12
            goto L_0x0287
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            android.widget.TextView r3 = r0.c
            goto L_0x0129
        L_0x0127:
            android.widget.TextView r3 = r0.f142d
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            android.widget.TextView r4 = r0.f142d
            goto L_0x0130
        L_0x012e:
            android.widget.TextView r4 = r0.c
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0146
            android.widget.TextView r15 = r0.c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f142d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019d
            r6 = 80
            if (r15 == r6) goto L_0x018f
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0178
            int r6 = r15 + r12
            goto L_0x018d
        L_0x0178:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018d
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018d:
            int r8 = r8 + r6
            goto L_0x01ac
        L_0x018f:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.t
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01ac
        L_0x019d:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.s
            int r8 = r2 + r3
        L_0x01ac:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b3
            int r1 = r0.q
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01eb
            android.widget.TextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ec
        L_0x01eb:
            r2 = r10
        L_0x01ec:
            if (r14 == 0) goto L_0x0212
            android.widget.TextView r1 = r0.f142d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f142d
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f142d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f142d
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.r
            int r1 = r10 - r1
            goto L_0x0213
        L_0x0212:
            r1 = r10
        L_0x0213:
            if (r17 == 0) goto L_0x021a
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021a:
            r2 = r24
            goto L_0x0287
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.q
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r24
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0259
            android.widget.TextView r1 = r0.c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.c
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.c
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.r
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025a
        L_0x0259:
            r2 = r3
        L_0x025a:
            if (r14 == 0) goto L_0x027e
            android.widget.TextView r1 = r0.f142d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f142d
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f142d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f142d
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.r
            int r1 = r1 + r4
            goto L_0x027f
        L_0x027e:
            r1 = r3
        L_0x027f:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0287
        L_0x0286:
            r2 = r3
        L_0x0287:
            java.util.ArrayList<android.view.View> r1 = r0.R
            r3 = 3
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.R
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0295:
            if (r2 >= r1) goto L_0x02a8
            java.util.ArrayList<android.view.View> r4 = r0.R
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.p(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0295
        L_0x02a8:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.R
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.R
            int r1 = r1.size()
            r2 = 0
        L_0x02b7:
            if (r2 >= r1) goto L_0x02c8
            java.util.ArrayList<android.view.View> r4 = r0.R
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.q(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b7
        L_0x02c8:
            java.util.ArrayList<android.view.View> r1 = r0.R
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.R
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02dc:
            if (r5 >= r4) goto L_0x030f
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02dc
        L_0x030f:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031f
            goto L_0x0326
        L_0x031f:
            if (r6 <= r10) goto L_0x0325
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0326
        L_0x0325:
            r3 = r4
        L_0x0326:
            java.util.ArrayList<android.view.View> r1 = r0.R
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x032e:
            if (r3 >= r1) goto L_0x033f
            java.util.ArrayList<android.view.View> r4 = r0.R
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.p(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x032e
        L_0x033f:
            java.util.ArrayList<android.view.View> r1 = r0.R
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.T;
        boolean z2 = true;
        int i11 = 0;
        if (d1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (t(this.f143e)) {
            s(this.f143e, i2, 0, i3, 0, this.p);
            i6 = l(this.f143e) + this.f143e.getMeasuredWidth();
            i5 = Math.max(0, m(this.f143e) + this.f143e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.f143e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (t(this.f147i)) {
            s(this.f147i, i2, 0, i3, 0, this.p);
            i6 = l(this.f147i) + this.f147i.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f147i) + this.f147i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f147i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (t(this.b)) {
            s(this.b, i2, max, i3, 0, this.p);
            i7 = l(this.b) + this.b.getMeasuredWidth();
            i5 = Math.max(i5, m(this.b) + this.b.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (t(this.f148j)) {
            max2 += r(this.f148j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f148j) + this.f148j.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f148j.getMeasuredState());
        }
        if (t(this.f144f)) {
            max2 += r(this.f144f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f144f) + this.f144f.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f144f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                View view = childAt;
                max2 += r(childAt, i2, max2, i3, 0, iArr);
                View view2 = view;
                i5 = Math.max(i5, m(view2) + view.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (t(this.c)) {
            r(this.c, i2, max2 + i14, i3, i13, iArr);
            int l2 = l(this.c) + this.c.getMeasuredWidth();
            i8 = m(this.c) + this.c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.c.getMeasuredState());
            i9 = l2;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (t(this.f142d)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, r(this.f142d, i2, max2 + i14, i3, i15, iArr));
            i8 = m(this.f142d) + this.f142d.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.f142d.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.c0) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i17++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.b;
        g gVar = actionMenuView != null ? actionMenuView.q : null;
        int i2 = savedState.b;
        if (!(i2 == 0 || this.b0 == null || gVar == null || (findItem = gVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.c) {
            removeCallbacks(this.d0);
            post(this.d0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            e.b.h.p0 r0 = r2.u
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f1179g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f1179g = r1
            boolean r3 = r0.f1180h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f1176d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.f1177e
        L_0x0023:
            r0.a = r1
            int r1 = r0.c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.f1177e
        L_0x0031:
            r0.a = r1
            int r1 = r0.f1176d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.f1177e
            r0.a = r3
        L_0x003c:
            int r1 = r0.f1178f
        L_0x003e:
            r0.b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.b0;
        if (!(dVar == null || (iVar = dVar.c) == null)) {
            savedState.b = iVar.a;
        }
        savedState.c = o();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int q(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f147i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.b.d.a.a.b(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f147i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f147i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f145g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.c0 = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.b.d.a.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f144f == null) {
                this.f144f = new e.b.h.m(getContext(), (AttributeSet) null, 0);
            }
            if (!n(this.f144f)) {
                b(this.f144f, true);
            }
        } else {
            ImageView imageView = this.f144f;
            if (imageView != null && n(imageView)) {
                removeView(this.f144f);
                this.S.remove(this.f144f);
            }
        }
        ImageView imageView2 = this.f144f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f144f == null) {
            this.f144f = new e.b.h.m(getContext(), (AttributeSet) null, 0);
        }
        ImageView imageView = this.f144f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f143e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.b.d.a.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f143e)) {
                b(this.f143e, true);
            }
        } else {
            ImageButton imageButton = this.f143e;
            if (imageButton != null && n(imageButton)) {
                removeView(this.f143e);
                this.S.remove(this.f143e);
            }
        }
        ImageButton imageButton2 = this.f143e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f143e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.U = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f150l != i2) {
            this.f150l = i2;
            if (i2 == 0) {
                this.f149k = getContext();
            } else {
                this.f149k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f142d == null) {
                Context context = getContext();
                z zVar = new z(context, (AttributeSet) null);
                this.f142d = zVar;
                zVar.setSingleLine();
                this.f142d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f142d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f142d.setTextColor(colorStateList);
                }
            }
            if (!n(this.f142d)) {
                b(this.f142d, true);
            }
        } else {
            TextView textView = this.f142d;
            if (textView != null && n(textView)) {
                removeView(this.f142d);
                this.S.remove(this.f142d);
            }
        }
        TextView textView2 = this.f142d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f142d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                z zVar = new z(context, (AttributeSet) null);
                this.c = zVar;
                zVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f151m;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && n(textView)) {
                removeView(this.c);
                this.S.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean u() {
        ActionMenuView actionMenuView = this.b;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.u;
            if (actionMenuPresenter != null && actionMenuPresenter.n()) {
                return true;
            }
        }
        return false;
    }
}
