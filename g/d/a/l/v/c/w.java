package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import g.d.a.l.v.e.b;
import g.d.a.l.v.e.d;
import java.io.IOException;

public class w implements p<Uri, Bitmap> {
    public final d a;
    public final g.d.a.l.t.b0.d b;

    public w(d dVar, g.d.a.l.t.b0.d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        v c = this.a.c((Uri) obj);
        if (c == null) {
            return null;
        }
        return m.a(this.b, (Drawable) ((b) c).get(), i2, i3);
    }

    public boolean b(Object obj, n nVar) throws IOException {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
