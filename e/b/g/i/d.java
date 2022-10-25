package e.b.g.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.b.g.i.m;
import e.b.h.l0;
import e.b.h.m0;
import e.e.j.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1024d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1025e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1026f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1027g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f1028h;

    /* renamed from: i  reason: collision with root package name */
    public final List<g> f1029i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List<C0037d> f1030j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1031k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f1032l = new b();

    /* renamed from: m  reason: collision with root package name */
    public final l0 f1033m = new c();
    public int n;
    public int o;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public m.a y;
    public ViewTreeObserver z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.f1030j.size() > 0 && !d.this.f1030j.get(0).a.z) {
                View view = d.this.q;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0037d dVar : d.this.f1030j) {
                    dVar.a.d();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.f1031k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements l0 {

        public class a implements Runnable {
            public final /* synthetic */ C0037d b;
            public final /* synthetic */ MenuItem c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ g f1034d;

            public a(C0037d dVar, MenuItem menuItem, g gVar) {
                this.b = dVar;
                this.c = menuItem;
                this.f1034d = gVar;
            }

            public void run() {
                C0037d dVar = this.b;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.b.c(false);
                    d.this.B = false;
                }
                if (this.c.isEnabled() && this.c.hasSubMenu()) {
                    this.f1034d.r(this.c, 4);
                }
            }
        }

        public c() {
        }

        public void c(g gVar, MenuItem menuItem) {
            C0037d dVar = null;
            d.this.f1028h.removeCallbacksAndMessages((Object) null);
            int size = d.this.f1030j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f1030j.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.f1030j.size()) {
                    dVar = d.this.f1030j.get(i3);
                }
                d.this.f1028h.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void e(g gVar, MenuItem menuItem) {
            d.this.f1028h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: e.b.g.i.d$d  reason: collision with other inner class name */
    public static class C0037d {
        public final m0 a;
        public final g b;
        public final int c;

        public C0037d(m0 m0Var, g gVar, int i2) {
            this.a = m0Var;
            this.b = gVar;
            this.c = i2;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.n = 0;
        this.o = 0;
        this.c = context;
        this.p = view;
        this.f1025e = i2;
        this.f1026f = i3;
        this.f1027g = z2;
        this.w = false;
        WeakHashMap<View, String> weakHashMap = q.a;
        this.r = view.getLayoutDirection() != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.f1024d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f1028h = new Handler();
    }

    public void a(g gVar, boolean z2) {
        int i2;
        int size = this.f1030j.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (gVar == this.f1030j.get(i3).b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < this.f1030j.size()) {
                this.f1030j.get(i4).b.c(false);
            }
            C0037d remove = this.f1030j.remove(i3);
            remove.b.u(this);
            if (this.B) {
                m0 m0Var = remove.a;
                Objects.requireNonNull(m0Var);
                if (Build.VERSION.SDK_INT >= 23) {
                    m0Var.A.setExitTransition((Transition) null);
                }
                remove.a.A.setAnimationStyle(0);
            }
            remove.a.dismiss();
            int size2 = this.f1030j.size();
            if (size2 > 0) {
                i2 = this.f1030j.get(size2 - 1).c;
            } else {
                View view = this.p;
                WeakHashMap<View, String> weakHashMap = q.a;
                i2 = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            this.r = i2;
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.f1031k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.f1032l);
                this.A.onDismiss();
            } else if (z2) {
                this.f1030j.get(0).b.c(false);
            }
        }
    }

    public boolean b() {
        return this.f1030j.size() > 0 && this.f1030j.get(0).a.b();
    }

    public void d() {
        if (!b()) {
            for (g w2 : this.f1029i) {
                w(w2);
            }
            this.f1029i.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                boolean z2 = this.z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1031k);
                }
                this.q.addOnAttachStateChangeListener(this.f1032l);
            }
        }
    }

    public void dismiss() {
        int size = this.f1030j.size();
        if (size > 0) {
            C0037d[] dVarArr = (C0037d[]) this.f1030j.toArray(new C0037d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0037d dVar = dVarArr[i2];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    public boolean e(r rVar) {
        for (C0037d next : this.f1030j) {
            if (rVar == next.b) {
                next.a.f1158d.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.b(this, this.c);
        if (b()) {
            w(rVar);
        } else {
            this.f1029i.add(rVar);
        }
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    public void f(boolean z2) {
        for (C0037d dVar : this.f1030j) {
            ListAdapter adapter = dVar.a.f1158d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    public ListView g() {
        if (this.f1030j.isEmpty()) {
            return null;
        }
        List<C0037d> list = this.f1030j;
        return list.get(list.size() - 1).a.f1158d;
    }

    public boolean h() {
        return false;
    }

    public void k(m.a aVar) {
        this.y = aVar;
    }

    public void l(g gVar) {
        gVar.b(this, this.c);
        if (b()) {
            w(gVar);
        } else {
            this.f1029i.add(gVar);
        }
    }

    public boolean m() {
        return false;
    }

    public void o(View view) {
        if (this.p != view) {
            this.p = view;
            int i2 = this.n;
            WeakHashMap<View, String> weakHashMap = q.a;
            this.o = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    public void onDismiss() {
        C0037d dVar;
        int size = this.f1030j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1030j.get(i2);
            if (!dVar.a.b()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.c(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(boolean z2) {
        this.w = z2;
    }

    public void q(int i2) {
        if (this.n != i2) {
            this.n = i2;
            View view = this.p;
            WeakHashMap<View, String> weakHashMap = q.a;
            this.o = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    public void r(int i2) {
        this.s = true;
        this.u = i2;
    }

    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public void t(boolean z2) {
        this.x = z2;
    }

    public void u(int i2) {
        this.t = true;
        this.v = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012b, code lost:
        if (((r10.getWidth() + r12[0]) + r4) > r11.right) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        if ((r12[0] - r4) < 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        r10 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(e.b.g.i.g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            e.b.g.i.f r3 = new e.b.g.i.f
            boolean r4 = r0.f1027g
            r5 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.b()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.w
            if (r4 == 0) goto L_0x0022
            r3.f1040d = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.b()
            if (r4 == 0) goto L_0x002e
            boolean r4 = e.b.g.i.k.v(r17)
            r3.f1040d = r4
        L_0x002e:
            android.content.Context r4 = r0.c
            int r6 = r0.f1024d
            r7 = 0
            int r4 = e.b.g.i.k.n(r3, r7, r4, r6)
            e.b.h.m0 r6 = new e.b.h.m0
            android.content.Context r8 = r0.c
            int r9 = r0.f1025e
            int r10 = r0.f1026f
            r6.<init>(r8, r7, r9, r10)
            e.b.h.l0 r8 = r0.f1033m
            r6.R = r8
            r6.r = r0
            android.widget.PopupWindow r8 = r6.A
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.p
            r6.q = r8
            int r8 = r0.o
            r6.f1167m = r8
            r6.s(r5)
            android.widget.PopupWindow r8 = r6.A
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.p(r3)
            r6.r(r4)
            int r3 = r0.o
            r6.f1167m = r3
            java.util.List<e.b.g.i.d$d> r3 = r0.f1030j
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e8
            java.util.List<e.b.g.i.d$d> r3 = r0.f1030j
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            e.b.g.i.d$d r3 = (e.b.g.i.d.C0037d) r3
            e.b.g.i.g r10 = r3.b
            int r11 = r10.size()
            r12 = 0
        L_0x0085:
            if (r12 >= r11) goto L_0x009b
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0098
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            goto L_0x0085
        L_0x009b:
            r13 = r7
        L_0x009c:
            if (r13 != 0) goto L_0x009f
            goto L_0x00e6
        L_0x009f:
            e.b.h.m0 r10 = r3.a
            e.b.h.f0 r10 = r10.f1158d
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b8
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            e.b.g.i.f r11 = (e.b.g.i.f) r11
            goto L_0x00bb
        L_0x00b8:
            e.b.g.i.f r11 = (e.b.g.i.f) r11
            r12 = 0
        L_0x00bb:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00c0:
            r9 = -1
            if (r15 >= r14) goto L_0x00ce
            e.b.g.i.i r5 = r11.getItem(r15)
            if (r13 != r5) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r15 = r15 + 1
            r5 = 1
            goto L_0x00c0
        L_0x00ce:
            r15 = -1
        L_0x00cf:
            if (r15 != r9) goto L_0x00d2
            goto L_0x00e6
        L_0x00d2:
            int r15 = r15 + r12
            int r5 = r10.getFirstVisiblePosition()
            int r15 = r15 - r5
            if (r15 < 0) goto L_0x00e6
            int r5 = r10.getChildCount()
            if (r15 < r5) goto L_0x00e1
            goto L_0x00e6
        L_0x00e1:
            android.view.View r5 = r10.getChildAt(r15)
            goto L_0x00ea
        L_0x00e6:
            r5 = r7
            goto L_0x00ea
        L_0x00e8:
            r3 = r7
            r5 = r3
        L_0x00ea:
            if (r5 == 0) goto L_0x019c
            r6.u(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x00fa
            android.widget.PopupWindow r10 = r6.A
            r10.setEnterTransition(r7)
        L_0x00fa:
            java.util.List<e.b.g.i.d$d> r10 = r0.f1030j
            int r11 = r10.size()
            r12 = 1
            int r11 = r11 - r12
            java.lang.Object r10 = r10.get(r11)
            e.b.g.i.d$d r10 = (e.b.g.i.d.C0037d) r10
            e.b.h.m0 r10 = r10.a
            e.b.h.f0 r10 = r10.f1158d
            r11 = 2
            int[] r12 = new int[r11]
            r10.getLocationOnScreen(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r13 = r0.q
            r13.getWindowVisibleDisplayFrame(r11)
            int r13 = r0.r
            r14 = 1
            if (r13 != r14) goto L_0x012e
            r12 = r12[r8]
            int r10 = r10.getWidth()
            int r10 = r10 + r12
            int r10 = r10 + r4
            int r11 = r11.right
            if (r10 <= r11) goto L_0x0133
            goto L_0x0136
        L_0x012e:
            r10 = r12[r8]
            int r10 = r10 - r4
            if (r10 >= 0) goto L_0x0136
        L_0x0133:
            r10 = 1
        L_0x0134:
            r11 = 1
            goto L_0x0138
        L_0x0136:
            r10 = 0
            goto L_0x0134
        L_0x0138:
            if (r10 != r11) goto L_0x013c
            r12 = 1
            goto L_0x013d
        L_0x013c:
            r12 = 0
        L_0x013d:
            r0.r = r10
            r10 = 26
            r11 = 5
            if (r9 < r10) goto L_0x0149
            r6.q = r5
            r9 = 0
            r13 = 0
            goto L_0x017b
        L_0x0149:
            r9 = 2
            int[] r10 = new int[r9]
            android.view.View r13 = r0.p
            r13.getLocationOnScreen(r10)
            int[] r9 = new int[r9]
            r5.getLocationOnScreen(r9)
            int r13 = r0.o
            r13 = r13 & 7
            if (r13 != r11) goto L_0x0170
            r13 = r10[r8]
            android.view.View r14 = r0.p
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r10[r8] = r14
            r13 = r9[r8]
            int r14 = r5.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x0170:
            r13 = r9[r8]
            r14 = r10[r8]
            int r13 = r13 - r14
            r14 = 1
            r9 = r9[r14]
            r10 = r10[r14]
            int r9 = r9 - r10
        L_0x017b:
            int r10 = r0.o
            r10 = r10 & r11
            if (r10 != r11) goto L_0x0188
            if (r12 == 0) goto L_0x0183
            goto L_0x018e
        L_0x0183:
            int r4 = r5.getWidth()
            goto L_0x0190
        L_0x0188:
            if (r12 == 0) goto L_0x0190
            int r4 = r5.getWidth()
        L_0x018e:
            int r13 = r13 + r4
            goto L_0x0191
        L_0x0190:
            int r13 = r13 - r4
        L_0x0191:
            r6.f1161g = r13
            r4 = 1
            r6.f1166l = r4
            r6.f1165k = r4
            r6.j(r9)
            goto L_0x01ba
        L_0x019c:
            boolean r4 = r0.s
            if (r4 == 0) goto L_0x01a4
            int r4 = r0.u
            r6.f1161g = r4
        L_0x01a4:
            boolean r4 = r0.t
            if (r4 == 0) goto L_0x01ad
            int r4 = r0.v
            r6.j(r4)
        L_0x01ad:
            android.graphics.Rect r4 = r0.b
            if (r4 == 0) goto L_0x01b7
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x01b8
        L_0x01b7:
            r5 = r7
        L_0x01b8:
            r6.y = r5
        L_0x01ba:
            e.b.g.i.d$d r4 = new e.b.g.i.d$d
            int r5 = r0.r
            r4.<init>(r6, r1, r5)
            java.util.List<e.b.g.i.d$d> r5 = r0.f1030j
            r5.add(r4)
            r6.d()
            e.b.h.f0 r4 = r6.f1158d
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x01f8
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x01f8
            java.lang.CharSequence r3 = r1.f1053m
            if (r3 == 0) goto L_0x01f8
            r3 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f1053m
            r3.setText(r1)
            r4.addHeaderView(r2, r7, r8)
            r6.d()
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.d.w(e.b.g.i.g):void");
    }
}
