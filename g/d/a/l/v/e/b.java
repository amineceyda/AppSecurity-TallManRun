package g.d.a.l.v.e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g.d.a.l.t.r;
import g.d.a.l.t.v;
import g.d.a.l.v.g.c;
import java.util.Objects;

public abstract class b<T extends Drawable> implements v<T>, r {
    public final T b;

    public b(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.b = t;
    }

    public void a() {
        Bitmap b2;
        T t = this.b;
        if (t instanceof BitmapDrawable) {
            b2 = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof c) {
            b2 = ((c) t).b();
        } else {
            return;
        }
        b2.prepareToDraw();
    }

    public Object get() {
        Drawable.ConstantState constantState = this.b.getConstantState();
        return constantState == null ? this.b : constantState.newDrawable();
    }
}
