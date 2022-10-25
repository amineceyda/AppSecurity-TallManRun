package e.b.h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import e.b.b;
import e.b.c.a;
import java.util.Objects;

public class q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public boolean b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f1182d;

    /* renamed from: e  reason: collision with root package name */
    public int f1183e;

    public class a extends LinearLayout {
        public a.c b;
        public final /* synthetic */ q0 c;

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            Objects.requireNonNull(this.c);
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, b.a, 2130968585, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(2131034112)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(2131165193));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.c = context.getResources().getDimensionPixelSize(2131165194);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((a) view).b.a();
    }

    public void onMeasure(int i2, int i3) {
        setFillViewport(View.MeasureSpec.getMode(i2) == 1073741824);
        throw null;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.b = z;
    }

    public void setContentHeight(int i2) {
        this.f1182d = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1183e = i2;
        throw null;
    }
}
