package e.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import e.b.c.a;
import e.b.g.a;
import e.b.g.f;
import e.b.g.g;
import e.b.g.i.g;
import e.b.h.d0;
import e.b.h.q0;
import e.e.j.q;
import e.e.j.t;
import e.e.j.u;
import e.e.j.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class w extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new DecelerateInterpolator();
    public static final Interpolator z = new AccelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f948d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f949e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f950f;

    /* renamed from: g  reason: collision with root package name */
    public View f951g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f952h;

    /* renamed from: i  reason: collision with root package name */
    public d f953i;

    /* renamed from: j  reason: collision with root package name */
    public e.b.g.a f954j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0036a f955k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f956l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f957m = new ArrayList<>();
    public boolean n;
    public int o = 0;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public boolean s = true;
    public g t;
    public boolean u;
    public boolean v;
    public final u w = new a();
    public final u x = new b();
    public final e.e.j.w y = new c();

    public class a extends v {
        public a() {
        }

        public void b(View view) {
            View view2;
            w wVar = w.this;
            if (wVar.p && (view2 = wVar.f951g) != null) {
                view2.setTranslationY(0.0f);
                w.this.f948d.setTranslationY(0.0f);
            }
            w.this.f948d.setVisibility(8);
            w.this.f948d.setTransitioning(false);
            w wVar2 = w.this;
            wVar2.t = null;
            a.C0036a aVar = wVar2.f955k;
            if (aVar != null) {
                aVar.b(wVar2.f954j);
                wVar2.f954j = null;
                wVar2.f955k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = w.this.c;
            if (actionBarOverlayLayout != null) {
                q.l(actionBarOverlayLayout);
            }
        }
    }

    public class b extends v {
        public b() {
        }

        public void b(View view) {
            w wVar = w.this;
            wVar.t = null;
            wVar.f948d.requestLayout();
        }
    }

    public class c implements e.e.j.w {
        public c() {
        }
    }

    public class d extends e.b.g.a implements g.a {

        /* renamed from: d  reason: collision with root package name */
        public final Context f958d;

        /* renamed from: e  reason: collision with root package name */
        public final e.b.g.i.g f959e;

        /* renamed from: f  reason: collision with root package name */
        public a.C0036a f960f;

        /* renamed from: g  reason: collision with root package name */
        public WeakReference<View> f961g;

        public d(Context context, a.C0036a aVar) {
            this.f958d = context;
            this.f960f = aVar;
            e.b.g.i.g gVar = new e.b.g.i.g(context);
            gVar.f1052l = 1;
            this.f959e = gVar;
            gVar.f1045e = this;
        }

        public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
            a.C0036a aVar = this.f960f;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(e.b.g.i.g gVar) {
            if (this.f960f != null) {
                i();
                ActionMenuPresenter actionMenuPresenter = w.this.f950f.f1090e;
                if (actionMenuPresenter != null) {
                    actionMenuPresenter.n();
                }
            }
        }

        public void c() {
            w wVar = w.this;
            if (wVar.f953i == this) {
                if (!(!wVar.q)) {
                    wVar.f954j = this;
                    wVar.f955k = this.f960f;
                } else {
                    this.f960f.b(this);
                }
                this.f960f = null;
                w.this.d(false);
                ActionBarContextView actionBarContextView = w.this.f950f;
                if (actionBarContextView.f97l == null) {
                    actionBarContextView.h();
                }
                w.this.f949e.l().sendAccessibilityEvent(32);
                w wVar2 = w.this;
                wVar2.c.setHideOnContentScrollEnabled(wVar2.v);
                w.this.f953i = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f961g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f959e;
        }

        public MenuInflater f() {
            return new f(this.f958d);
        }

        public CharSequence g() {
            return w.this.f950f.getSubtitle();
        }

        public CharSequence h() {
            return w.this.f950f.getTitle();
        }

        public void i() {
            if (w.this.f953i == this) {
                this.f959e.z();
                try {
                    this.f960f.a(this, this.f959e);
                } finally {
                    this.f959e.y();
                }
            }
        }

        public boolean j() {
            return w.this.f950f.t;
        }

        public void k(View view) {
            w.this.f950f.setCustomView(view);
            this.f961g = new WeakReference<>(view);
        }

        public void l(int i2) {
            w.this.f950f.setSubtitle(w.this.a.getResources().getString(i2));
        }

        public void m(CharSequence charSequence) {
            w.this.f950f.setSubtitle(charSequence);
        }

        public void n(int i2) {
            w.this.f950f.setTitle(w.this.a.getResources().getString(i2));
        }

        public void o(CharSequence charSequence) {
            w.this.f950f.setTitle(charSequence);
        }

        public void p(boolean z) {
            this.c = z;
            w.this.f950f.setTitleOptional(z);
        }
    }

    public w(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (!z2) {
            this.f951g = decorView.findViewById(16908290);
        }
    }

    public w(Dialog dialog) {
        new ArrayList();
        e(dialog.getWindow().getDecorView());
    }

    public void a(boolean z2) {
        if (z2 != this.f956l) {
            this.f956l = z2;
            int size = this.f957m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f957m.get(i2).a(z2);
            }
        }
    }

    public Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968590, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public void c(boolean z2) {
        if (!this.f952h) {
            int i2 = z2 ? 4 : 0;
            int p2 = this.f949e.p();
            this.f952h = true;
            this.f949e.o((i2 & 4) | (p2 & -5));
        }
    }

    public void d(boolean z2) {
        t tVar;
        t tVar2;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f948d;
        WeakHashMap<View, String> weakHashMap = q.a;
        if (actionBarContainer.isLaidOut()) {
            if (z2) {
                tVar = this.f949e.s(4, 100);
                tVar2 = this.f950f.e(0, 200);
            } else {
                tVar2 = this.f949e.s(0, 200);
                tVar = this.f950f.e(8, 100);
            }
            e.b.g.g gVar = new e.b.g.g();
            gVar.a.add(tVar);
            View view = (View) tVar.a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) tVar2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.a.add(tVar2);
            gVar.b();
        } else if (z2) {
            this.f949e.j(4);
            this.f950f.setVisibility(0);
        } else {
            this.f949e.j(0);
            this.f950f.setVisibility(8);
        }
    }

    public final void e(View view) {
        d0 d0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296717);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131296322);
        if (findViewById instanceof d0) {
            d0Var = (d0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            d0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder i2 = g.a.a.a.a.i("Can't make a decor toolbar out of ");
            i2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(i2.toString());
        }
        this.f949e = d0Var;
        this.f950f = (ActionBarContextView) view.findViewById(2131296337);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296324);
        this.f948d = actionBarContainer;
        d0 d0Var2 = this.f949e;
        if (d0Var2 == null || this.f950f == null || actionBarContainer == null) {
            throw new IllegalStateException(w.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = d0Var2.c();
        boolean z2 = (this.f949e.p() & 4) != 0;
        if (z2) {
            this.f952h = true;
        }
        Context context = this.a;
        this.f949e.m((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        f(context.getResources().getBoolean(2131034112));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, e.b.b.a, 2130968585, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2.f104i) {
                this.v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            float f2 = (float) dimensionPixelSize;
            ActionBarContainer actionBarContainer2 = this.f948d;
            WeakHashMap<View, String> weakHashMap = q.a;
            if (Build.VERSION.SDK_INT >= 21) {
                actionBarContainer2.setElevation(f2);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void f(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.f949e.k((q0) null);
            this.f948d.setTabContainer((q0) null);
        } else {
            this.f948d.setTabContainer((q0) null);
            this.f949e.k((q0) null);
        }
        boolean z3 = true;
        boolean z4 = this.f949e.r() == 2;
        this.f949e.v(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (this.n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void g(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.r || !this.q) {
            if (!this.s) {
                this.s = true;
                e.b.g.g gVar = this.t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f948d.setVisibility(0);
                if (this.o != 0 || (!this.u && !z2)) {
                    this.f948d.setAlpha(1.0f);
                    this.f948d.setTranslationY(0.0f);
                    if (this.p && (view2 = this.f951g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.x.b((View) null);
                } else {
                    this.f948d.setTranslationY(0.0f);
                    float f2 = (float) (-this.f948d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f948d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.f948d.setTranslationY(f2);
                    e.b.g.g gVar2 = new e.b.g.g();
                    t b2 = q.b(this.f948d);
                    b2.g(0.0f);
                    b2.f(this.y);
                    if (!gVar2.f1006e) {
                        gVar2.a.add(b2);
                    }
                    if (this.p && (view3 = this.f951g) != null) {
                        view3.setTranslationY(f2);
                        t b3 = q.b(this.f951g);
                        b3.g(0.0f);
                        if (!gVar2.f1006e) {
                            gVar2.a.add(b3);
                        }
                    }
                    Interpolator interpolator = A;
                    boolean z3 = gVar2.f1006e;
                    if (!z3) {
                        gVar2.c = interpolator;
                    }
                    if (!z3) {
                        gVar2.b = 250;
                    }
                    u uVar = this.x;
                    if (!z3) {
                        gVar2.f1005d = uVar;
                    }
                    this.t = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, String> weakHashMap = q.a;
                    if (Build.VERSION.SDK_INT >= 20) {
                        actionBarOverlayLayout.requestApplyInsets();
                    } else {
                        actionBarOverlayLayout.requestFitSystemWindows();
                    }
                }
            }
        } else if (this.s) {
            this.s = false;
            e.b.g.g gVar3 = this.t;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.o != 0 || (!this.u && !z2)) {
                this.w.b((View) null);
                return;
            }
            this.f948d.setAlpha(1.0f);
            this.f948d.setTransitioning(true);
            e.b.g.g gVar4 = new e.b.g.g();
            float f3 = (float) (-this.f948d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f948d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            t b4 = q.b(this.f948d);
            b4.g(f3);
            b4.f(this.y);
            if (!gVar4.f1006e) {
                gVar4.a.add(b4);
            }
            if (this.p && (view = this.f951g) != null) {
                t b5 = q.b(view);
                b5.g(f3);
                if (!gVar4.f1006e) {
                    gVar4.a.add(b5);
                }
            }
            Interpolator interpolator2 = z;
            boolean z4 = gVar4.f1006e;
            if (!z4) {
                gVar4.c = interpolator2;
            }
            if (!z4) {
                gVar4.b = 250;
            }
            u uVar2 = this.w;
            if (!z4) {
                gVar4.f1005d = uVar2;
            }
            this.t = gVar4;
            gVar4.b();
        }
    }
}
