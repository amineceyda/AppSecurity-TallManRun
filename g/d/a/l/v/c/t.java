package g.d.a.l.v.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g.d.a.l.t.r;
import g.d.a.l.t.v;
import java.util.Objects;

public final class t implements v<BitmapDrawable>, r {
    public final Resources b;
    public final v<Bitmap> c;

    public t(Resources resources, v<Bitmap> vVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.b = resources;
        this.c = vVar;
    }

    public static v<BitmapDrawable> e(Resources resources, v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new t(resources, vVar);
    }

    public void a() {
        v<Bitmap> vVar = this.c;
        if (vVar instanceof r) {
            ((r) vVar).a();
        }
    }

    public int b() {
        return this.c.b();
    }

    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    public void d() {
        this.c.d();
    }

    public Object get() {
        return new BitmapDrawable(this.b, this.c.get());
    }
}
