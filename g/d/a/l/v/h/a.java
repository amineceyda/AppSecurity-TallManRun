package g.d.a.l.v.h;

import android.graphics.Bitmap;
import g.d.a.l.n;
import g.d.a.l.t.v;
import g.d.a.l.v.d.b;
import java.io.ByteArrayOutputStream;

public class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    public v<byte[]> a(v<Bitmap> vVar, n nVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.a, this.b, byteArrayOutputStream);
        vVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
