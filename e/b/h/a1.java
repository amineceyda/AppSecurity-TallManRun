package e.b.h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import e.e.j.q;
import e.e.j.s;
import java.util.WeakHashMap;

public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public static a1 f1105k;

    /* renamed from: l  reason: collision with root package name */
    public static a1 f1106l;
    public final View b;
    public final CharSequence c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1107d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f1108e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f1109f = new b();

    /* renamed from: g  reason: collision with root package name */
    public int f1110g;

    /* renamed from: h  reason: collision with root package name */
    public int f1111h;

    /* renamed from: i  reason: collision with root package name */
    public b1 f1112i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1113j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a1.this.d(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a1.this.b();
        }
    }

    public a1(View view, CharSequence charSequence) {
        this.b = view;
        this.c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i2 = s.a;
        this.f1107d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(a1 a1Var) {
        a1 a1Var2 = f1105k;
        if (a1Var2 != null) {
            a1Var2.b.removeCallbacks(a1Var2.f1108e);
        }
        f1105k = a1Var;
        if (a1Var != null) {
            a1Var.b.postDelayed(a1Var.f1108e, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f1110g = Integer.MAX_VALUE;
        this.f1111h = Integer.MAX_VALUE;
    }

    public void b() {
        if (f1106l == this) {
            f1106l = null;
            b1 b1Var = this.f1112i;
            if (b1Var != null) {
                b1Var.a();
                this.f1112i = null;
                a();
                this.b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1105k == this) {
            c((a1) null);
        }
        this.b.removeCallbacks(this.f1109f);
    }

    public void d(boolean z) {
        int i2;
        int i3;
        long j2;
        View view = this.b;
        WeakHashMap<View, String> weakHashMap = q.a;
        if (view.isAttachedToWindow()) {
            c((a1) null);
            a1 a1Var = f1106l;
            if (a1Var != null) {
                a1Var.b();
            }
            f1106l = this;
            this.f1113j = z;
            b1 b1Var = new b1(this.b.getContext());
            this.f1112i = b1Var;
            View view2 = this.b;
            int i4 = this.f1110g;
            int i5 = this.f1111h;
            boolean z2 = this.f1113j;
            CharSequence charSequence = this.c;
            if (b1Var.b.getParent() != null) {
                b1Var.a();
            }
            b1Var.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = b1Var.f1114d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = b1Var.a.getResources().getDimensionPixelOffset(2131165842);
            if (view2.getWidth() < dimensionPixelOffset) {
                i4 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = b1Var.a.getResources().getDimensionPixelOffset(2131165841);
                i2 = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                i2 = view2.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = b1Var.a.getResources().getDimensionPixelOffset(z2 ? 2131165845 : 2131165844);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(b1Var.f1115e);
                Rect rect = b1Var.f1115e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = b1Var.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    b1Var.f1115e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(b1Var.f1117g);
                view2.getLocationOnScreen(b1Var.f1116f);
                int[] iArr = b1Var.f1116f;
                int i6 = iArr[0];
                int[] iArr2 = b1Var.f1117g;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                b1Var.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = b1Var.b.getMeasuredHeight();
                int[] iArr3 = b1Var.f1116f;
                int i7 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i2 + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i8 > b1Var.f1115e.height() : i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) b1Var.a.getSystemService("window")).addView(b1Var.b, b1Var.f1114d);
            this.b.addOnAttachStateChangeListener(this);
            if (this.f1113j) {
                j2 = 2500;
            } else {
                j2 = ((this.b.getWindowSystemUiVisibility() & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.b.removeCallbacks(this.f1109f);
            this.b.postDelayed(this.f1109f, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1112i != null && this.f1113j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.b.isEnabled() && this.f1112i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1110g) > this.f1107d || Math.abs(y - this.f1111h) > this.f1107d) {
                this.f1110g = x;
                this.f1111h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1110g = view.getWidth() / 2;
        this.f1111h = view.getHeight() / 2;
        d(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
