package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import e.b.b;
import e.b.d.a.a;
import e.e.j.q;
import e.e.k.h;

public class l {
    public final ImageView a;
    public v0 b;
    public v0 c;

    public l(ImageView imageView) {
        this.a = imageView;
    }

    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 && i2 == 21) {
                if (this.c == null) {
                    this.c = new v0();
                }
                v0 v0Var = this.c;
                PorterDuff.Mode mode = null;
                v0Var.a = null;
                v0Var.f1200d = false;
                v0Var.b = null;
                v0Var.c = false;
                ImageView imageView = this.a;
                ColorStateList imageTintList = i2 >= 21 ? imageView.getImageTintList() : imageView instanceof h ? ((h) imageView).getSupportImageTintList() : null;
                if (imageTintList != null) {
                    v0Var.f1200d = true;
                    v0Var.a = imageTintList;
                }
                ImageView imageView2 = this.a;
                if (i2 >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof h) {
                    mode = ((h) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    v0Var.c = true;
                    v0Var.b = mode;
                }
                if (v0Var.f1200d || v0Var.c) {
                    i.e(drawable, v0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.b;
            if (v0Var2 != null) {
                i.e(drawable, v0Var2, this.a.getDrawableState());
            }
        }
    }

    public boolean b() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void c(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        int j2;
        Context context = this.a.getContext();
        int[] iArr = b.f931f;
        x0 o = x0.o(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        q.m(imageView, imageView.getContext(), iArr, attributeSet, o.b, i2, 0);
        try {
            Drawable drawable3 = this.a.getDrawable();
            if (!(drawable3 != null || (j2 = o.j(1, -1)) == -1 || (drawable3 = a.b(this.a.getContext(), j2)) == null)) {
                this.a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                e0.b(drawable3);
            }
            if (o.m(2)) {
                ImageView imageView2 = this.a;
                ColorStateList b2 = o.b(2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    imageView2.setImageTintList(b2);
                    if (!(i3 != 21 || (drawable2 = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof h) {
                    ((h) imageView2).setSupportImageTintList(b2);
                }
            }
            if (o.m(3)) {
                ImageView imageView3 = this.a;
                PorterDuff.Mode c2 = e0.c(o.h(3, -1), (PorterDuff.Mode) null);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 21) {
                    imageView3.setImageTintMode(c2);
                    if (!(i4 != 21 || (drawable = imageView3.getDrawable()) == null || imageView3.getImageTintList() == null)) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof h) {
                    ((h) imageView3).setSupportImageTintMode(c2);
                }
            }
        } finally {
            o.b.recycle();
        }
    }

    public void d(int i2) {
        if (i2 != 0) {
            Drawable b2 = a.b(this.a.getContext(), i2);
            if (b2 != null) {
                e0.b(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new v0();
        }
        v0 v0Var = this.b;
        v0Var.a = colorStateList;
        v0Var.f1200d = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new v0();
        }
        v0 v0Var = this.b;
        v0Var.b = mode;
        v0Var.c = true;
        a();
    }
}
