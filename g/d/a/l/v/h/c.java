package g.d.a.l.v.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g.d.a.l.n;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.v;
import g.d.a.l.v.c.e;

public final class c implements e<Drawable, byte[]> {
    public final d a;
    public final e<Bitmap, byte[]> b;
    public final e<g.d.a.l.v.g.c, byte[]> c;

    public c(d dVar, e<Bitmap, byte[]> eVar, e<g.d.a.l.v.g.c, byte[]> eVar2) {
        this.a = dVar;
        this.b = eVar;
        this.c = eVar2;
    }

    public v<byte[]> a(v<Drawable> vVar, n nVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(e.e(((BitmapDrawable) drawable).getBitmap(), this.a), nVar);
        }
        if (drawable instanceof g.d.a.l.v.g.c) {
            return this.c.a(vVar, nVar);
        }
        return null;
    }
}
