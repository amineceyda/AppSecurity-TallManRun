package g.h.a.c.a.u;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import i.o.c.h;

public class l extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        h.e(context, "context");
    }

    public void onMeasure(int i2, int i3) {
        if (getLayoutParams().height == -2) {
            i3 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) * 9) / 16, 1073741824);
        }
        super.onMeasure(i2, i3);
    }
}
