package com.apkpure.aegon.widgets.textview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import g.c.a.o.f.a;

public class RoundLinearLayout extends LinearLayout {
    public a b;

    public RoundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new a(this, context, attributeSet);
    }

    public a getDelegate() {
        return this.b;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        a aVar = this.b;
        if (aVar.p) {
            aVar.b(getHeight() / 2);
        } else {
            aVar.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        if (!this.b.q || getWidth() <= 0 || getHeight() <= 0) {
            super.onMeasure(i2, i3);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
