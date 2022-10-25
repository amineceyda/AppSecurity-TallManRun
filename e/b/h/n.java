package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import e.b.a;
import e.e.j.p;

public class n extends MultiAutoCompleteTextView implements p {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1168d = {16843126};
    public final d b;
    public final x c;

    public n(Context context, AttributeSet attributeSet) {
        super(u0.a(context), attributeSet, 2130968647);
        s0.a(this, getContext());
        x0 o = x0.o(getContext(), attributeSet, f1168d, 2130968647, 0);
        if (o.m(0)) {
            setDropDownBackgroundDrawable(o.e(0));
        }
        o.b.recycle();
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, 2130968647);
        x xVar = new x(this);
        this.c = xVar;
        xVar.e(attributeSet, 2130968647);
        xVar.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.q(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(e.b.d.a.a.b(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }
}
