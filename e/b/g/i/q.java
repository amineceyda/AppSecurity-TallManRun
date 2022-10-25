package e.b.g.i;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.b.g.i.m;
import e.b.h.m0;

public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final g f1078d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1079e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1080f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1081g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1082h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1083i;

    /* renamed from: j  reason: collision with root package name */
    public final m0 f1084j;

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1085k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1086l = new b();

    /* renamed from: m  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1087m;
    public View n;
    public View o;
    public m.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public int u = 0;
    public boolean v;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.b()) {
                q qVar = q.this;
                if (!qVar.f1084j.z) {
                    View view = qVar.o;
                    if (view == null || !view.isShown()) {
                        q.this.dismiss();
                    } else {
                        q.this.f1084j.d();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.f1085k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.c = context;
        this.f1078d = gVar;
        this.f1080f = z;
        this.f1079e = new f(gVar, LayoutInflater.from(context), z, 2131492883);
        this.f1082h = i2;
        this.f1083i = i3;
        Resources resources = context.getResources();
        this.f1081g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.n = view;
        this.f1084j = new m0(context, (AttributeSet) null, i2, i3);
        gVar.b(this, context);
    }

    public void a(g gVar, boolean z) {
        if (gVar == this.f1078d) {
            dismiss();
            m.a aVar = this.p;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }
    }

    public boolean b() {
        return !this.r && this.f1084j.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r7 = this;
            boolean r0 = r7.b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = 1
            goto L_0x00c7
        L_0x000b:
            boolean r0 = r7.r
            if (r0 != 0) goto L_0x00c7
            android.view.View r0 = r7.n
            if (r0 != 0) goto L_0x0015
            goto L_0x00c7
        L_0x0015:
            r7.o = r0
            e.b.h.m0 r0 = r7.f1084j
            android.widget.PopupWindow r0 = r0.A
            r0.setOnDismissListener(r7)
            e.b.h.m0 r0 = r7.f1084j
            r0.r = r7
            r0.s(r2)
            android.view.View r0 = r7.o
            android.view.ViewTreeObserver r3 = r7.q
            if (r3 != 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.q = r4
            if (r3 == 0) goto L_0x003b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f1085k
            r4.addOnGlobalLayoutListener(r3)
        L_0x003b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f1086l
            r0.addOnAttachStateChangeListener(r3)
            e.b.h.m0 r3 = r7.f1084j
            r3.q = r0
            int r0 = r7.u
            r3.f1167m = r0
            boolean r0 = r7.s
            r3 = 0
            if (r0 != 0) goto L_0x005b
            e.b.g.i.f r0 = r7.f1079e
            android.content.Context r4 = r7.c
            int r5 = r7.f1081g
            int r0 = e.b.g.i.k.n(r0, r3, r4, r5)
            r7.t = r0
            r7.s = r2
        L_0x005b:
            e.b.h.m0 r0 = r7.f1084j
            int r4 = r7.t
            r0.r(r4)
            e.b.h.m0 r0 = r7.f1084j
            r4 = 2
            android.widget.PopupWindow r0 = r0.A
            r0.setInputMethodMode(r4)
            e.b.h.m0 r0 = r7.f1084j
            android.graphics.Rect r4 = r7.b
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L_0x0079
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x007a
        L_0x0079:
            r5 = r3
        L_0x007a:
            r0.y = r5
            e.b.h.m0 r0 = r7.f1084j
            r0.d()
            e.b.h.m0 r0 = r7.f1084j
            e.b.h.f0 r0 = r0.f1158d
            r0.setOnKeyListener(r7)
            boolean r4 = r7.v
            if (r4 == 0) goto L_0x00b9
            e.b.g.i.g r4 = r7.f1078d
            java.lang.CharSequence r4 = r4.f1053m
            if (r4 == 0) goto L_0x00b9
            android.content.Context r4 = r7.c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b3
            e.b.g.i.g r6 = r7.f1078d
            java.lang.CharSequence r6 = r6.f1053m
            r5.setText(r6)
        L_0x00b3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00b9:
            e.b.h.m0 r0 = r7.f1084j
            e.b.g.i.f r1 = r7.f1079e
            r0.p(r1)
            e.b.h.m0 r0 = r7.f1084j
            r0.d()
            goto L_0x0008
        L_0x00c7:
            if (r1 == 0) goto L_0x00ca
            return
        L_0x00ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto L_0x00d3
        L_0x00d2:
            throw r0
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.q.d():void");
    }

    public void dismiss() {
        if (b()) {
            this.f1084j.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(e.b.g.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            e.b.g.i.l r0 = new e.b.g.i.l
            android.content.Context r3 = r9.c
            android.view.View r5 = r9.o
            boolean r6 = r9.f1080f
            int r7 = r9.f1082h
            int r8 = r9.f1083i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            e.b.g.i.m$a r2 = r9.p
            r0.d(r2)
            boolean r2 = e.b.g.i.k.v(r10)
            r0.f1072h = r2
            e.b.g.i.k r3 = r0.f1074j
            if (r3 == 0) goto L_0x002a
            r3.p(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1087m
            r0.f1075k = r2
            r2 = 0
            r9.f1087m = r2
            e.b.g.i.g r2 = r9.f1078d
            r2.c(r1)
            e.b.h.m0 r2 = r9.f1084j
            int r3 = r2.f1161g
            boolean r4 = r2.f1164j
            if (r4 != 0) goto L_0x0040
            r2 = 0
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f1162h
        L_0x0042:
            int r4 = r9.u
            android.view.View r5 = r9.n
            java.util.WeakHashMap<android.view.View, java.lang.String> r6 = e.e.j.q.a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            android.view.View r4 = r0.f1070f
            if (r4 != 0) goto L_0x006a
            r0 = 0
            goto L_0x006e
        L_0x006a:
            r0.e(r3, r2, r5, r5)
        L_0x006d:
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x0078
            e.b.g.i.m$a r0 = r9.p
            if (r0 == 0) goto L_0x0077
            r0.b(r10)
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.q.e(e.b.g.i.r):boolean");
    }

    public void f(boolean z) {
        this.s = false;
        f fVar = this.f1079e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public ListView g() {
        return this.f1084j.f1158d;
    }

    public boolean h() {
        return false;
    }

    public void k(m.a aVar) {
        this.p = aVar;
    }

    public void l(g gVar) {
    }

    public void o(View view) {
        this.n = view;
    }

    public void onDismiss() {
        this.r = true;
        this.f1078d.c(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.f1085k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.f1086l);
        PopupWindow.OnDismissListener onDismissListener = this.f1087m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(boolean z) {
        this.f1079e.f1040d = z;
    }

    public void q(int i2) {
        this.u = i2;
    }

    public void r(int i2) {
        this.f1084j.f1161g = i2;
    }

    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1087m = onDismissListener;
    }

    public void t(boolean z) {
        this.v = z;
    }

    public void u(int i2) {
        m0 m0Var = this.f1084j;
        m0Var.f1162h = i2;
        m0Var.f1164j = true;
    }
}
