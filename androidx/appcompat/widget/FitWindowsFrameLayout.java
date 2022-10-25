package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import e.b.c.n;
import e.b.h.g0;
import e.e.j.x;

public class FitWindowsFrameLayout extends FrameLayout implements g0 {
    public g0.a b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        g0.a aVar = this.b;
        if (aVar != null) {
            rect.top = ((n) aVar).a.X((x) null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(g0.a aVar) {
        this.b = aVar;
    }
}
