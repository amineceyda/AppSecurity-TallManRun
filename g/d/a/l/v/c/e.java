package g.d.a.l.v.c;

import android.graphics.Bitmap;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.r;
import g.d.a.l.t.v;
import g.d.a.r.j;
import java.util.Objects;

public class e implements v<Bitmap>, r {
    public final Bitmap b;
    public final d c;

    public e(Bitmap bitmap, d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.c = dVar;
    }

    public static e e(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    public void a() {
        this.b.prepareToDraw();
    }

    public int b() {
        return j.d(this.b);
    }

    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    public void d() {
        this.c.e(this.b);
    }

    public Object get() {
        return this.b;
    }
}
