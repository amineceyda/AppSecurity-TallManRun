package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.k;
import e.b.g.i.l;
import e.b.g.i.m;
import e.b.g.i.n;
import e.b.g.i.p;
import e.b.g.i.r;
import e.b.h.h0;
import e.b.h.m;
import java.util.ArrayList;
import java.util.Objects;

public class ActionMenuPresenter extends e.b.g.i.b {

    /* renamed from: j  reason: collision with root package name */
    public d f109j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f110k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f111l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f112m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public final SparseBooleanArray t = new SparseBooleanArray();
    public e u;
    public a v;
    public c w;
    public b x;
    public final f y = new f();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int openSubMenuId;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, 2130968612, 0);
            if (!rVar.A.g()) {
                View view2 = ActionMenuPresenter.this.f109j;
                this.f1070f = view2 == null ? (View) ActionMenuPresenter.this.f1023i : view2;
            }
            d(ActionMenuPresenter.this.y);
        }

        public void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.v = null;
            Objects.requireNonNull(actionMenuPresenter);
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {
        public e b;

        public c(e eVar) {
            this.b = eVar;
        }

        public void run() {
            g.a aVar;
            g gVar = ActionMenuPresenter.this.f1018d;
            if (!(gVar == null || (aVar = gVar.f1045e) == null)) {
                aVar.b(gVar);
            }
            View view = (View) ActionMenuPresenter.this.f1023i;
            if (!(view == null || view.getWindowToken() == null || !this.b.f())) {
                ActionMenuPresenter.this.u = this.b;
            }
            ActionMenuPresenter.this.w = null;
        }
    }

    public class d extends m implements ActionMenuView.a {

        public class a extends h0 {
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            public p b() {
                e eVar = ActionMenuPresenter.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public boolean c() {
                ActionMenuPresenter.this.n();
                return true;
            }

            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.w != null) {
                    return false;
                }
                actionMenuPresenter.g();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, 2130968611);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e.b.a.u(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.n();
            return true;
        }

        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                e.e.d.l.a.x0(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, 2130968612, 0);
            this.f1071g = 8388613;
            d(ActionMenuPresenter.this.y);
        }

        public void c() {
            g gVar = ActionMenuPresenter.this.f1018d;
            if (gVar != null) {
                gVar.c(true);
            }
            ActionMenuPresenter.this.u = null;
            super.c();
        }
    }

    public class f implements m.a {
        public f() {
        }

        public void a(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.k().c(false);
            }
            m.a aVar = ActionMenuPresenter.this.f1020f;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }

        public boolean b(g gVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (gVar == actionMenuPresenter.f1018d) {
                return false;
            }
            int i2 = ((r) gVar).A.a;
            m.a aVar = actionMenuPresenter.f1020f;
            if (aVar != null) {
                return aVar.b(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, 2131492867, 2131492866);
    }

    public void a(g gVar, boolean z) {
        b();
        m.a aVar = this.f1020f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public boolean b() {
        return g() | l();
    }

    public void c(Context context, g gVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.f1018d = gVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.f112m = true;
        }
        int i2 = 2;
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.q = i2;
        int i5 = this.o;
        if (this.f112m) {
            if (this.f109j == null) {
                d dVar = new d(this.b);
                this.f109j = dVar;
                if (this.f111l) {
                    dVar.setImageDrawable(this.f110k);
                    this.f110k = null;
                    this.f111l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f109j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f109j.getMeasuredWidth();
        } else {
            this.f109j = null;
        }
        this.p = i5;
        this.s = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public View d(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        View actionView = iVar.getActionView();
        int i2 = 0;
        if (actionView == null || iVar.f()) {
            if (view instanceof n.a) {
                aVar = (n.a) view;
            } else {
                aVar = (n.a) this.f1019e.inflate(this.f1022h, viewGroup, false);
            }
            aVar.c(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1023i);
            if (this.x == null) {
                this.x = new b();
            }
            actionMenuItemView.setPopupCallback(this.x);
            actionView = (View) aVar;
        }
        if (iVar.C) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.i(layoutParams));
        }
        return actionView;
    }

    public boolean e(r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (true) {
            g gVar = rVar2.z;
            if (gVar == this.f1018d) {
                break;
            }
            rVar2 = gVar;
        }
        i iVar = rVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.f1023i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        int i3 = rVar.A.a;
        int size = rVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.c, rVar, view);
        this.v = aVar;
        aVar.f1072h = z;
        k kVar = aVar.f1074j;
        if (kVar != null) {
            kVar.p(z);
        }
        if (this.v.f()) {
            m.a aVar2 = this.f1020f;
            if (aVar2 != null) {
                aVar2.b(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public void f(boolean z) {
        n nVar;
        int i2;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f1023i;
        ArrayList<i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            g gVar = this.f1018d;
            if (gVar != null) {
                gVar.i();
                ArrayList<i> l2 = this.f1018d.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = l2.get(i3);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View d2 = d(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            d2.setPressed(false);
                            d2.jumpDrawablesToCurrentState();
                        }
                        if (d2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) d2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(d2);
                            }
                            ((ViewGroup) this.f1023i).addView(d2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f109j) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
        ((View) this.f1023i).requestLayout();
        g gVar2 = this.f1018d;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<i> arrayList2 = gVar2.f1049i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                e.e.j.b bVar = arrayList2.get(i4).A;
            }
        }
        g gVar3 = this.f1018d;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.f1050j;
        }
        if (this.f112m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f109j;
        if (z3) {
            if (dVar == null) {
                this.f109j = new d(this.b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f109j.getParent();
            if (viewGroup3 != this.f1023i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f109j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1023i;
                d dVar2 = this.f109j;
                ActionMenuView.c p2 = actionMenuView.generateDefaultLayoutParams();
                p2.a = true;
                actionMenuView.addView(dVar2, p2);
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f1023i)) {
            ((ViewGroup) nVar).removeView(this.f109j);
        }
        ((ActionMenuView) this.f1023i).setOverflowReserved(this.f112m);
    }

    public boolean g() {
        n nVar;
        c cVar = this.w;
        if (cVar == null || (nVar = this.f1023i) == null) {
            e eVar = this.u;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f1074j.dismiss();
            }
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.w = null;
        return true;
    }

    public boolean h() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        boolean z;
        g gVar = this.f1018d;
        if (gVar != null) {
            arrayList = gVar.l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.q;
        int i5 = this.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1023i;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z = true;
            if (i6 >= i2) {
                break;
            }
            i iVar = arrayList.get(i6);
            int i9 = iVar.y;
            if ((i9 & 2) == 2) {
                i8++;
            } else {
                if ((i9 & 1) == 1) {
                    i7++;
                } else {
                    z2 = true;
                }
            }
            if (this.r && iVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f112m && (z2 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            i iVar2 = arrayList.get(i11);
            int i13 = iVar2.y;
            if ((i13 & 2) == i3) {
                View d2 = d(iVar2, (View) null, viewGroup);
                d2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = iVar2.b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z);
                }
                iVar2.k(z);
            } else {
                if ((i13 & true) == z) {
                    int i15 = iVar2.b;
                    boolean z3 = sparseBooleanArray.get(i15);
                    boolean z4 = (i10 > 0 || z3) && i5 > 0;
                    if (z4) {
                        View d3 = d(iVar2, (View) null, viewGroup);
                        d3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = d3.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z4 &= i5 + i12 > 0;
                    }
                    if (z4 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i15, false);
                        for (int i16 = 0; i16 < i11; i16++) {
                            i iVar3 = arrayList.get(i16);
                            if (iVar3.b == i15) {
                                if (iVar3.g()) {
                                    i10++;
                                }
                                iVar3.k(false);
                            }
                        }
                    }
                    if (z4) {
                        i10--;
                    }
                    iVar2.k(z4);
                } else {
                    iVar2.k(false);
                    i11++;
                    i3 = 2;
                    z = true;
                }
            }
            i11++;
            i3 = 2;
            z = true;
        }
        return true;
    }

    public boolean l() {
        a aVar = this.v;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.f1074j.dismiss();
        return true;
    }

    public boolean m() {
        e eVar = this.u;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        g gVar;
        if (!this.f112m || m() || (gVar = this.f1018d) == null || this.f1023i == null || this.w != null) {
            return false;
        }
        gVar.i();
        if (gVar.f1050j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.c, this.f1018d, this.f109j, true));
        this.w = cVar;
        ((View) this.f1023i).post(cVar);
        return true;
    }
}
