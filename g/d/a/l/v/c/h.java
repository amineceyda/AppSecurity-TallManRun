package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class h implements p<ByteBuffer, Bitmap> {
    public final d a = new d();

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i2, i3, nVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, n nVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
