package g.d.a.p.i;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import g.d.a.p.j.b;

public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: d  reason: collision with root package name */
    public Animatable f2676d;

    public e(ImageView imageView) {
        super(imageView);
    }

    public void a() {
        Animatable animatable = this.f2676d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void c(Z z, b<? super Z> bVar) {
        m(z);
    }

    public void d(Drawable drawable) {
        m((Object) null);
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    public void e() {
        Animatable animatable = this.f2676d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void f(Drawable drawable) {
        m((Object) null);
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    public void h(Drawable drawable) {
        this.c.a();
        Animatable animatable = this.f2676d;
        if (animatable != null) {
            animatable.stop();
        }
        m((Object) null);
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    public abstract void l(Z z);

    public final void m(Z z) {
        l(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f2676d = animatable;
            animatable.start();
            return;
        }
        this.f2676d = null;
    }
}
