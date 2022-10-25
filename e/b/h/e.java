package e.b.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import e.e.d.l.a;
import e.e.j.p;
import e.e.k.b;
import e.e.k.g;

public class e extends Button implements p, b, g {
    public final d b;
    public final x c;

    public e(Context context, AttributeSet attributeSet) {
        super(u0.a(context), attributeSet, 2130968722);
        s0.a(this, getContext());
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, 2130968722);
        x xVar = new x(this);
        this.c = xVar;
        xVar.e(attributeSet, 2130968722);
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

    public int getAutoSizeMaxTextSize() {
        if (b.D) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.c;
        if (xVar != null) {
            return Math.round(xVar.f1206i.f1098e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.D) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.c;
        if (xVar != null) {
            return Math.round(xVar.f1206i.f1097d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.D) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.c;
        if (xVar != null) {
            return Math.round(xVar.f1206i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.D) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.c;
        return xVar != null ? xVar.f1206i.f1099f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.D) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.c;
        if (xVar != null) {
            return xVar.f1206i.a;
        }
        return 0;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.c.f1205h;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.c.f1205h;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        x xVar = this.c;
        if (xVar != null && !b.D) {
            xVar.f1206i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.c;
        if (xVar != null && !b.D && xVar.d()) {
            this.c.f1206i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (b.D) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.h(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws IllegalArgumentException {
        if (b.D) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.i(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.D) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.j(i2);
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.M0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        x xVar = this.c;
        if (xVar != null) {
            xVar.a.setAllCaps(z);
        }
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.k(colorStateList);
        this.c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.l(mode);
        this.c.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        boolean z = b.D;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.c;
        if (xVar != null && !z && !xVar.d()) {
            xVar.f1206i.f(i2, f2);
        }
    }
}
