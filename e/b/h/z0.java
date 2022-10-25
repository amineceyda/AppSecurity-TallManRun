package e.b.h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import e.b.b;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.m;
import e.e.j.q;
import e.e.j.t;
import e.e.j.v;
import java.util.Objects;

public class z0 implements d0 {
    public Toolbar a;
    public int b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View f1216d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1217e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1218f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1219g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1220h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1221i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1222j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1223k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1224l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1225m;
    public ActionMenuPresenter n;
    public int o = 0;
    public Drawable p;

    public class a extends v {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i2) {
            this.b = i2;
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                z0.this.a.setVisibility(this.b);
            }
        }

        public void c(View view) {
            z0.this.a.setVisibility(0);
        }
    }

    public z0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.a = toolbar;
        this.f1221i = toolbar.getTitle();
        this.f1222j = toolbar.getSubtitle();
        this.f1220h = this.f1221i != null;
        this.f1219g = toolbar.getNavigationIcon();
        String str = null;
        x0 o2 = x0.o(toolbar.getContext(), (AttributeSet) null, b.a, 2130968585, 0);
        int i2 = 15;
        this.p = o2.e(15);
        if (z) {
            CharSequence l2 = o2.l(27);
            if (!TextUtils.isEmpty(l2)) {
                this.f1220h = true;
                this.f1221i = l2;
                if ((this.b & 8) != 0) {
                    this.a.setTitle(l2);
                }
            }
            CharSequence l3 = o2.l(25);
            if (!TextUtils.isEmpty(l3)) {
                this.f1222j = l3;
                if ((this.b & 8) != 0) {
                    this.a.setSubtitle(l3);
                }
            }
            Drawable e2 = o2.e(20);
            if (e2 != null) {
                this.f1218f = e2;
                y();
            }
            Drawable e3 = o2.e(17);
            if (e3 != null) {
                this.f1217e = e3;
                y();
            }
            if (this.f1219g == null && (drawable = this.p) != null) {
                this.f1219g = drawable;
                x();
            }
            o(o2.h(10, 0));
            int j2 = o2.j(9, 0);
            if (j2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(j2, this.a, false);
                View view = this.f1216d;
                if (!(view == null || (this.b & 16) == 0)) {
                    this.a.removeView(view);
                }
                this.f1216d = inflate;
                if (!(inflate == null || (this.b & 16) == 0)) {
                    this.a.addView(inflate);
                }
                o(this.b | 16);
            }
            int i3 = o2.i(13, 0);
            if (i3 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = i3;
                this.a.setLayoutParams(layoutParams);
            }
            int c2 = o2.c(7, -1);
            int c3 = o2.c(3, -1);
            if (c2 >= 0 || c3 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(c2, 0);
                int max2 = Math.max(c3, 0);
                toolbar2.d();
                toolbar2.u.a(max, max2);
            }
            int j3 = o2.j(28, 0);
            if (j3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.f151m = j3;
                TextView textView = toolbar3.c;
                if (textView != null) {
                    textView.setTextAppearance(context, j3);
                }
            }
            int j4 = o2.j(26, 0);
            if (j4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.n = j4;
                TextView textView2 = toolbar4.f142d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, j4);
                }
            }
            int j5 = o2.j(22, 0);
            if (j5 != 0) {
                this.a.setPopupTheme(j5);
            }
        } else {
            if (this.a.getNavigationIcon() != null) {
                this.p = this.a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.b = i2;
        }
        o2.b.recycle();
        if (2131820550 != this.o) {
            this.o = 2131820550;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i4 = this.o;
                this.f1223k = i4 != 0 ? c().getString(i4) : str;
                w();
            }
        }
        this.f1223k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new y0(this));
    }

    public void a(Menu menu, m.a aVar) {
        i iVar;
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            Objects.requireNonNull(actionMenuPresenter);
        }
        ActionMenuPresenter actionMenuPresenter2 = this.n;
        actionMenuPresenter2.f1020f = aVar;
        Toolbar toolbar = this.a;
        g gVar = (g) menu;
        if (gVar != null || toolbar.b != null) {
            toolbar.f();
            g gVar2 = toolbar.b.q;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.u(toolbar.a0);
                    gVar2.u(toolbar.b0);
                }
                if (toolbar.b0 == null) {
                    toolbar.b0 = new Toolbar.d();
                }
                actionMenuPresenter2.r = true;
                if (gVar != null) {
                    gVar.b(actionMenuPresenter2, toolbar.f149k);
                    gVar.b(toolbar.b0, toolbar.f149k);
                } else {
                    actionMenuPresenter2.c(toolbar.f149k, (g) null);
                    Toolbar.d dVar = toolbar.b0;
                    g gVar3 = dVar.b;
                    if (!(gVar3 == null || (iVar = dVar.c) == null)) {
                        gVar3.d(iVar);
                    }
                    dVar.b = null;
                    actionMenuPresenter2.f(true);
                    toolbar.b0.f(true);
                }
                toolbar.b.setPopupTheme(toolbar.f150l);
                toolbar.b.setPresenter(actionMenuPresenter2);
                toolbar.a0 = actionMenuPresenter2;
            }
        }
    }

    public boolean b() {
        return this.a.o();
    }

    public Context c() {
        return this.a.getContext();
    }

    public void collapseActionView() {
        Toolbar.d dVar = this.a.b0;
        i iVar = dVar == null ? null : dVar.c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void d() {
        this.f1225m = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.u
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.ActionMenuPresenter$c r3 = r0.w
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.z0.e():boolean");
    }

    public boolean f() {
        ActionMenuView actionMenuView = this.a.b;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.u;
        if (actionMenuPresenter != null && actionMenuPresenter.g()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.a.u();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.t
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.z0.h():boolean");
    }

    public void i() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.b;
        if (actionMenuView != null && (actionMenuPresenter = actionMenuView.u) != null) {
            actionMenuPresenter.b();
        }
    }

    public void j(int i2) {
        this.a.setVisibility(i2);
    }

    public void k(q0 q0Var) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = null;
    }

    public ViewGroup l() {
        return this.a;
    }

    public void m(boolean z) {
    }

    public boolean n() {
        Toolbar.d dVar = this.a.b0;
        return (dVar == null || dVar.c == null) ? false : true;
    }

    public void o(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i3 & 3) != 0) {
                y();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f1221i);
                    toolbar = this.a;
                    charSequence = this.f1222j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f1216d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.b;
    }

    public void q(int i2) {
        this.f1218f = i2 != 0 ? e.b.d.a.a.b(c(), i2) : null;
        y();
    }

    public int r() {
        return 0;
    }

    public t s(int i2, long j2) {
        t b2 = q.b(this.a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.c(j2);
        a aVar = new a(i2);
        View view = (View) b2.a.get();
        if (view != null) {
            b2.e(view, aVar);
        }
        return b2;
    }

    public void setIcon(int i2) {
        this.f1217e = i2 != 0 ? e.b.d.a.a.b(c(), i2) : null;
        y();
    }

    public void setIcon(Drawable drawable) {
        this.f1217e = drawable;
        y();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1224l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1220h) {
            this.f1221i = charSequence;
            if ((this.b & 8) != 0) {
                this.a.setTitle(charSequence);
            }
        }
    }

    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void v(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void w() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1223k)) {
            this.a.setNavigationContentDescription(this.o);
        } else {
            this.a.setNavigationContentDescription(this.f1223k);
        }
    }

    public final void x() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f1219g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1218f) == null) {
            drawable = this.f1217e;
        }
        this.a.setLogo(drawable);
    }
}
