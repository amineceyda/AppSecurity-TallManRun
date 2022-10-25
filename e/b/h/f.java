package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import e.b.d.a.a;
import e.e.j.p;

public class f extends CheckBox implements e.e.k.f, p {
    public final h b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final x f1122d;

    public f(Context context, AttributeSet attributeSet) {
        super(u0.a(context), attributeSet, 2130968756);
        s0.a(this, getContext());
        h hVar = new h(this);
        this.b = hVar;
        hVar.b(attributeSet, 2130968756);
        d dVar = new d(this);
        this.c = dVar;
        dVar.d(attributeSet, 2130968756);
        x xVar = new x(this);
        this.f1122d = xVar;
        xVar.e(attributeSet, 2130968756);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.c;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.f1122d;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.b;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.b;
        if (hVar != null) {
            return hVar.c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.c;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.c;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.b(getContext(), i2));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        if (hVar.f1135f) {
            hVar.f1135f = false;
            return;
        }
        hVar.f1135f = true;
        hVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.c;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.b = colorStateList;
            hVar.f1133d = true;
            hVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.c = mode;
            hVar.f1134e = true;
            hVar.a();
        }
    }
}
