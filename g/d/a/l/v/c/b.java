package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g.d.a.l.c;
import g.d.a.l.n;
import g.d.a.l.q;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.v;
import java.io.File;

public class b implements q<BitmapDrawable> {
    public final d a;
    public final q<Bitmap> b;

    public b(d dVar, q<Bitmap> qVar) {
        this.a = dVar;
        this.b = qVar;
    }

    public boolean a(Object obj, File file, n nVar) {
        return this.b.a(new e(((BitmapDrawable) ((v) obj).get()).getBitmap(), this.a), file, nVar);
    }

    public c b(n nVar) {
        return this.b.b(nVar);
    }
}
