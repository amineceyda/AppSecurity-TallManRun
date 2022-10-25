package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.n;
import e.b.g.i.p;
import e.b.h.h0;
import e.b.h.z;
import g.i.c.a.a.i.b;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g  reason: collision with root package name */
    public i f69g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f70h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f71i;

    /* renamed from: j  reason: collision with root package name */
    public g.b f72j;

    /* renamed from: k  reason: collision with root package name */
    public h0 f73k;

    /* renamed from: l  reason: collision with root package name */
    public b f74l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f75m = e();
    public boolean n;
    public int o;
    public int p;
    public int q;

    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            ActionMenuPresenter.a aVar;
            b bVar = ActionMenuItemView.this.f74l;
            if (bVar == null || (aVar = ActionMenuPresenter.this.v) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                e.b.g.i.g$b r1 = r0.f72j
                r2 = 0
                if (r1 == 0) goto L_0x001c
                e.b.g.i.i r0 = r0.f69g
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                e.b.g.i.p r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.c, 0, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return d();
    }

    public boolean b() {
        return d() && this.f69g.getIcon() == null;
    }

    public void c(i iVar, int i2) {
        this.f69g = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f73k == null) {
            this.f73k = new a();
        }
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f70h);
        if (this.f71i != null) {
            if (!((this.f69g.y & 4) == 4) || (!this.f75m && !this.n)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f70h : null);
        CharSequence charSequence2 = this.f69g.q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f69g.f1056e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f69g.r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f69g.f1056e;
            }
            e.b.a.u(this, charSequence);
            return;
        }
        e.b.a.u(this, charSequence3);
    }

    public i getItemData() {
        return this.f69g;
    }

    public void onClick(View view) {
        g.b bVar = this.f72j;
        if (bVar != null) {
            bVar.a(this.f69g);
        }
        b.C0166b.a.j(view);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f75m = e();
        f();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean d2 = d();
        if (d2 && (i4 = this.p) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.o) : this.o;
        if (mode != 1073741824 && this.o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!d2 && this.f71i != null) {
            super.setPadding((getMeasuredWidth() - this.f71i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f69g.hasSubMenu() || (h0Var = this.f73k) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.n != z) {
            this.n = z;
            i iVar = this.f69g;
            if (iVar != null) {
                iVar.n.p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f71i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.q;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.f72j = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.p = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f74l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f70h = charSequence;
        f();
    }
}
