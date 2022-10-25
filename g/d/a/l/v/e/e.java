package g.d.a.l.v.e;

import android.graphics.drawable.Drawable;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import java.io.IOException;

public class e implements p<Drawable, Drawable> {
    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, n nVar) throws IOException {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
