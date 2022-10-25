package e.b.g.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import e.b.g.i.m;
import e.e.j.q;
import java.util.WeakHashMap;

public class l {
    public final Context a;
    public final g b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1068d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1069e;

    /* renamed from: f  reason: collision with root package name */
    public View f1070f;

    /* renamed from: g  reason: collision with root package name */
    public int f1071g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1072h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1073i;

    /* renamed from: j  reason: collision with root package name */
    public k f1074j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1075k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f1076l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.b = gVar;
        this.f1070f = view;
        this.c = z;
        this.f1068d = i2;
        this.f1069e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [e.b.g.i.k, e.b.g.i.m] */
    /* JADX WARNING: type inference failed for: r7v1, types: [e.b.g.i.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [e.b.g.i.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.b.g.i.k a() {
        /*
            r14 = this;
            e.b.g.i.k r0 = r14.f1074j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            e.b.g.i.d r0 = new e.b.g.i.d
            android.content.Context r2 = r14.a
            android.view.View r3 = r14.f1070f
            int r4 = r14.f1068d
            int r5 = r14.f1069e
            boolean r6 = r14.c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            e.b.g.i.q r0 = new e.b.g.i.q
            android.content.Context r8 = r14.a
            e.b.g.i.g r9 = r14.b
            android.view.View r10 = r14.f1070f
            int r11 = r14.f1068d
            int r12 = r14.f1069e
            boolean r13 = r14.c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            e.b.g.i.g r1 = r14.b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1076l
            r0.s(r1)
            android.view.View r1 = r14.f1070f
            r0.o(r1)
            e.b.g.i.m$a r1 = r14.f1073i
            r0.k(r1)
            boolean r1 = r14.f1072h
            r0.p(r1)
            int r1 = r14.f1071g
            r0.q(r1)
            r14.f1074j = r0
        L_0x0079:
            e.b.g.i.k r0 = r14.f1074j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.l.a():e.b.g.i.k");
    }

    public boolean b() {
        k kVar = this.f1074j;
        return kVar != null && kVar.b();
    }

    public void c() {
        this.f1074j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1075k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.f1073i = aVar;
        k kVar = this.f1074j;
        if (kVar != null) {
            kVar.k(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.t(z2);
        if (z) {
            int i4 = this.f1071g;
            View view = this.f1070f;
            WeakHashMap<View, String> weakHashMap = q.a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f1070f.getWidth();
            }
            a2.r(i2);
            a2.u(i3);
            int i5 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.b = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.d();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f1070f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
