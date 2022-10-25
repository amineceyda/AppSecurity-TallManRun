package e.b.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class t extends SeekBar {
    public final u b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969530);
        s0.a(this, getContext());
        u uVar = new u(this);
        this.b = uVar;
        uVar.a(attributeSet, 2130969530);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.b;
        Drawable drawable = uVar.f1192e;
        if (drawable != null && drawable.isStateful() && drawable.setState(uVar.f1191d.getDrawableState())) {
            uVar.f1191d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b.f1192e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.d(canvas);
    }
}
