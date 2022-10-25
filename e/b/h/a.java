package e.b.h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import e.b.b;
import e.b.g.i.g;
import e.e.j.q;
import e.e.j.t;
import e.e.j.u;

public abstract class a extends ViewGroup {
    public final C0038a b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f1089d;

    /* renamed from: e  reason: collision with root package name */
    public ActionMenuPresenter f1090e;

    /* renamed from: f  reason: collision with root package name */
    public int f1091f;

    /* renamed from: g  reason: collision with root package name */
    public t f1092g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1093h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1094i;

    /* renamed from: e.b.h.a$a  reason: collision with other inner class name */
    public class C0038a implements u {
        public boolean a = false;
        public int b;

        public C0038a() {
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f1092g = null;
                a.super.setVisibility(this.b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new C0038a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968582, typedValue, true) || typedValue.resourceId == 0) {
            this.c = context;
        } else {
            this.c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int d(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public t e(int i2, long j2) {
        t tVar = this.f1092g;
        if (tVar != null) {
            tVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            t b2 = q.b(this);
            b2.a(1.0f);
            b2.c(j2);
            C0038a aVar = this.b;
            a.this.f1092g = b2;
            aVar.b = i2;
            View view = (View) b2.a.get();
            if (view != null) {
                b2.e(view, aVar);
            }
            return b2;
        }
        t b3 = q.b(this);
        b3.a(0.0f);
        b3.c(j2);
        C0038a aVar2 = this.b;
        a.this.f1092g = b3;
        aVar2.b = i2;
        View view2 = (View) b3.a.get();
        if (view2 != null) {
            b3.e(view2, aVar2);
        }
        return b3;
    }

    public int getAnimatedVisibility() {
        return this.f1092g != null ? this.b.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1091f;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, b.a, 2130968585, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1090e;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            actionMenuPresenter.q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            g gVar = actionMenuPresenter.f1018d;
            if (gVar != null) {
                gVar.q(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1094i = false;
        }
        if (!this.f1094i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1094i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1094i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1093h = false;
        }
        if (!this.f1093h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1093h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1093h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            t tVar = this.f1092g;
            if (tVar != null) {
                tVar.b();
            }
            super.setVisibility(i2);
        }
    }
}
