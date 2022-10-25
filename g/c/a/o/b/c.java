package g.c.a.o.b;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

public class c extends FrameLayout implements Checkable {
    public static final int[] c = {16842912};
    public boolean b;

    public c(Context context) {
        super(context);
    }

    public View getTagView() {
        return getChildAt(0);
    }

    public boolean isChecked() {
        return this.b;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!this.b);
    }
}
