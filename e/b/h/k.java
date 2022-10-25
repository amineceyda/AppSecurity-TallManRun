package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import e.e.j.p;
import e.e.k.h;

public class k extends ImageButton implements p, h {
    public final d b;
    public final l c;

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(u0.a(context), attributeSet, i2);
        s0.a(this, getContext());
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, i2);
        l lVar = new l(this);
        this.c = lVar;
        lVar.c(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
        l lVar = this.c;
        if (lVar != null) {
            lVar.a();
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

    public ColorStateList getSupportImageTintList() {
        v0 v0Var;
        l lVar = this.c;
        if (lVar == null || (v0Var = lVar.b) == null) {
            return null;
        }
        return v0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        v0 v0Var;
        l lVar = this.c;
        if (lVar == null || (v0Var = lVar.b) == null) {
            return null;
        }
        return v0Var.b;
    }

    public boolean hasOverlappingRendering() {
        return this.c.b() && super.hasOverlappingRendering();
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

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageResource(int i2) {
        this.c.d(i2);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.c;
        if (lVar != null) {
            lVar.a();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.f(mode);
        }
    }
}
