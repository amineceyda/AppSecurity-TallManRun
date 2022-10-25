package e.b.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class r extends RatingBar {
    public final p b;

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969469);
        s0.a(this, getContext());
        p pVar = new p(this);
        this.b = pVar;
        pVar.a(attributeSet, 2130969469);
    }

    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.b.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
