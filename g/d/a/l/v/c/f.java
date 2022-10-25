package g.d.a.l.v.c;

import android.content.Context;
import android.graphics.Bitmap;
import g.d.a.b;
import g.d.a.l.r;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.v;
import g.d.a.r.j;

public abstract class f implements r<Bitmap> {
    public final v<Bitmap> a(Context context, v<Bitmap> vVar, int i2, int i3) {
        if (j.i(i2, i3)) {
            d dVar = b.b(context).b;
            Bitmap bitmap = vVar.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getHeight();
            }
            Bitmap c = c(dVar, bitmap, i2, i3);
            return bitmap.equals(c) ? vVar : e.e(c, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(d dVar, Bitmap bitmap, int i2, int i3);
}
