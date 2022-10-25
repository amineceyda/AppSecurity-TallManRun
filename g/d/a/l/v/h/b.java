package g.d.a.l.v.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g.d.a.l.n;
import g.d.a.l.t.v;
import g.d.a.l.v.c.t;

public class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(Resources resources) {
        this.a = resources;
    }

    public v<BitmapDrawable> a(v<Bitmap> vVar, n nVar) {
        return t.e(this.a, vVar);
    }
}
