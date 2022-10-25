package g.d.a.l.v.c;

import android.graphics.Bitmap;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import g.d.a.r.j;
import java.io.IOException;

public final class z implements p<Bitmap, Bitmap> {

    public static final class a implements v<Bitmap> {
        public final Bitmap b;

        public a(Bitmap bitmap) {
            this.b = bitmap;
        }

        public int b() {
            return j.d(this.b);
        }

        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        public void d() {
        }

        public Object get() {
            return this.b;
        }
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        return new a((Bitmap) obj);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, n nVar) throws IOException {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
