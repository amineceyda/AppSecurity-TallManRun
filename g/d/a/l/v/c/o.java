package g.d.a.l.v.c;

import com.bumptech.glide.load.ImageHeaderParser;
import e.g.a.a;
import g.d.a.l.t.b0.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class o implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int b(InputStream inputStream, b bVar) throws IOException {
        a aVar = new a(inputStream);
        a.b d2 = aVar.d("Orientation");
        int i2 = 1;
        if (d2 != null) {
            try {
                i2 = d2.f(aVar.f1395e);
            } catch (NumberFormatException unused) {
            }
        }
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }

    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
