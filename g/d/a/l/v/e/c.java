package g.d.a.l.v.e;

import android.graphics.drawable.Drawable;

public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    public int b() {
        return Math.max(1, this.b.getIntrinsicHeight() * this.b.getIntrinsicWidth() * 4);
    }

    public Class<Drawable> c() {
        return this.b.getClass();
    }

    public void d() {
    }
}
