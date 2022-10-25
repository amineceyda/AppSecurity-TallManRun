package e.b.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.b.g.i.p;
import e.e.j.q;
import g.i.c.a.a.i.b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class k0 implements p {
    public static Method B;
    public static Method C;
    public static Method Q;
    public PopupWindow A;
    public Context b;
    public ListAdapter c;

    /* renamed from: d  reason: collision with root package name */
    public f0 f1158d;

    /* renamed from: e  reason: collision with root package name */
    public int f1159e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f1160f = -2;

    /* renamed from: g  reason: collision with root package name */
    public int f1161g;

    /* renamed from: h  reason: collision with root package name */
    public int f1162h;

    /* renamed from: i  reason: collision with root package name */
    public int f1163i = 1002;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1164j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1165k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1166l;

    /* renamed from: m  reason: collision with root package name */
    public int f1167m = 0;
    public int n = Integer.MAX_VALUE;
    public int o = 0;
    public DataSetObserver p;
    public View q;
    public AdapterView.OnItemClickListener r;
    public final e s = new e();
    public final d t = new d();
    public final c u = new c();
    public final a v = new a();
    public final Handler w;
    public final Rect x = new Rect();
    public Rect y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f0 f0Var = k0.this.f1158d;
            if (f0Var != null) {
                f0Var.setListSelectionHidden(true);
                f0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (k0.this.b()) {
                k0.this.d();
            }
        }

        public void onInvalidated() {
            k0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            b.C0166b.a.i(absListView, i2);
            boolean z = true;
            if (i2 == 1) {
                if (k0.this.A.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && k0.this.A.getContentView() != null) {
                    k0 k0Var = k0.this;
                    k0Var.w.removeCallbacks(k0Var.s);
                    k0.this.s.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k0.this.A) != null && popupWindow.isShowing() && x >= 0 && x < k0.this.A.getWidth() && y >= 0 && y < k0.this.A.getHeight()) {
                k0 k0Var = k0.this;
                k0Var.w.postDelayed(k0Var.s, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                k0 k0Var2 = k0.this;
                k0Var2.w.removeCallbacks(k0Var2.s);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            f0 f0Var = k0.this.f1158d;
            if (f0Var != null) {
                WeakHashMap<View, String> weakHashMap = q.a;
                if (f0Var.isAttachedToWindow() && k0.this.f1158d.getCount() > k0.this.f1158d.getChildCount()) {
                    int childCount = k0.this.f1158d.getChildCount();
                    k0 k0Var = k0.this;
                    if (childCount <= k0Var.n) {
                        k0Var.A.setInputMethodMode(2);
                        k0.this.d();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                B = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                C = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.b = context;
        this.w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.n, i2, i3);
        this.f1161g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1162h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1164j = true;
        }
        obtainStyledAttributes.recycle();
        o oVar = new o(context, attributeSet, i2, i3);
        this.A = oVar;
        oVar.setInputMethodMode(1);
    }

    public int a() {
        return this.f1161g;
    }

    public boolean b() {
        return this.A.isShowing();
    }

    public void d() {
        int i2;
        int i3;
        int i4;
        f0 f0Var;
        int i5;
        if (this.f1158d == null) {
            f0 q2 = q(this.b, !this.z);
            this.f1158d = q2;
            q2.setAdapter(this.c);
            this.f1158d.setOnItemClickListener(this.r);
            this.f1158d.setFocusable(true);
            this.f1158d.setFocusableInTouchMode(true);
            this.f1158d.setOnItemSelectedListener(new j0(this));
            this.f1158d.setOnScrollListener(this.u);
            this.A.setContentView(this.f1158d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.A.getContentView();
        }
        Drawable background = this.A.getBackground();
        int i6 = 0;
        if (background != null) {
            background.getPadding(this.x);
            Rect rect = this.x;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f1164j) {
                this.f1162h = -i7;
            }
        } else {
            this.x.setEmpty();
            i2 = 0;
        }
        boolean z2 = this.A.getInputMethodMode() == 2;
        View view = this.q;
        int i8 = this.f1162h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = C;
            if (method != null) {
                try {
                    i3 = ((Integer) method.invoke(this.A, new Object[]{view, Integer.valueOf(i8), Boolean.valueOf(z2)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i3 = this.A.getMaxAvailableHeight(view, i8);
        } else {
            i3 = this.A.getMaxAvailableHeight(view, i8, z2);
        }
        if (this.f1159e == -1) {
            i4 = i3 + i2;
        } else {
            int i9 = this.f1160f;
            if (i9 != -2) {
                i5 = 1073741824;
                if (i9 == -1) {
                    int i10 = this.b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.x;
                    i9 = i10 - (rect2.left + rect2.right);
                }
            } else {
                int i11 = this.b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.x;
                i9 = i11 - (rect3.left + rect3.right);
                i5 = Integer.MIN_VALUE;
            }
            int a2 = this.f1158d.a(View.MeasureSpec.makeMeasureSpec(i9, i5), i3 - 0, -1);
            i4 = a2 + (a2 > 0 ? this.f1158d.getPaddingBottom() + this.f1158d.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z3 = this.A.getInputMethodMode() == 2;
        e.e.d.l.a.H0(this.A, this.f1163i);
        if (this.A.isShowing()) {
            View view2 = this.q;
            WeakHashMap<View, String> weakHashMap = q.a;
            if (view2.isAttachedToWindow()) {
                int i12 = this.f1160f;
                if (i12 == -1) {
                    i12 = -1;
                } else if (i12 == -2) {
                    i12 = this.q.getWidth();
                }
                int i13 = this.f1159e;
                if (i13 == -1) {
                    if (!z3) {
                        i4 = -1;
                    }
                    if (z3) {
                        this.A.setWidth(this.f1160f == -1 ? -1 : 0);
                        this.A.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.A;
                        if (this.f1160f == -1) {
                            i6 = -1;
                        }
                        popupWindow.setWidth(i6);
                        this.A.setHeight(-1);
                    }
                } else if (i13 != -2) {
                    i4 = i13;
                }
                this.A.setOutsideTouchable(true);
                this.A.update(this.q, this.f1161g, this.f1162h, i12 < 0 ? -1 : i12, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i14 = this.f1160f;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.q.getWidth();
        }
        int i15 = this.f1159e;
        if (i15 == -1) {
            i4 = -1;
        } else if (i15 != -2) {
            i4 = i15;
        }
        this.A.setWidth(i14);
        this.A.setHeight(i4);
        t(true);
        this.A.setOutsideTouchable(true);
        this.A.setTouchInterceptor(this.t);
        if (this.f1166l) {
            e.e.d.l.a.C0(this.A, this.f1165k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(this.A, new Object[]{this.y});
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.A.setEpicenterBounds(this.y);
        }
        this.A.showAsDropDown(this.q, this.f1161g, this.f1162h, this.f1167m);
        this.f1158d.setSelection(-1);
        if ((!this.z || this.f1158d.isInTouchMode()) && (f0Var = this.f1158d) != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
        if (!this.z) {
            this.w.post(this.v);
        }
    }

    public void dismiss() {
        this.A.dismiss();
        this.A.setContentView((View) null);
        this.f1158d = null;
        this.w.removeCallbacks(this.s);
    }

    public Drawable f() {
        return this.A.getBackground();
    }

    public ListView g() {
        return this.f1158d;
    }

    public void i(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    public void j(int i2) {
        this.f1162h = i2;
        this.f1164j = true;
    }

    public void l(int i2) {
        this.f1161g = i2;
    }

    public int n() {
        if (!this.f1164j) {
            return 0;
        }
        return this.f1162h;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.p;
        if (dataSetObserver == null) {
            this.p = new b();
        } else {
            ListAdapter listAdapter2 = this.c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        f0 f0Var = this.f1158d;
        if (f0Var != null) {
            f0Var.setAdapter(this.c);
        }
    }

    public f0 q(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public void r(int i2) {
        Drawable background = this.A.getBackground();
        if (background != null) {
            background.getPadding(this.x);
            Rect rect = this.x;
            this.f1160f = rect.left + rect.right + i2;
            return;
        }
        this.f1160f = i2;
    }

    public void s(boolean z2) {
        this.z = z2;
        this.A.setFocusable(z2);
    }

    public final void t(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(this.A, new Object[]{Boolean.valueOf(z2)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A.setIsClippedToScreen(z2);
        }
    }
}
