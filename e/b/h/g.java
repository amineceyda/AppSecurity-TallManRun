package e.b.h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import e.b.a;

public class g extends CheckedTextView {
    public static final int[] c = {16843016};
    public final x b;

    public g(Context context, AttributeSet attributeSet) {
        super(u0.a(context), attributeSet, 16843720);
        s0.a(this, getContext());
        x xVar = new x(this);
        this.b = xVar;
        xVar.e(attributeSet, 16843720);
        xVar.b();
        x0 o = x0.o(getContext(), attributeSet, c, 16843720, 0);
        setCheckMarkDrawable(o.e(0));
        o.b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.b;
        if (xVar != null) {
            xVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.q(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(e.b.d.a.a.b(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e.e.d.l.a.M0(this, callback));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.b;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }
}
