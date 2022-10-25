package g.d.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;

public class f implements k {
    public final /* synthetic */ ByteBuffer a;

    public f(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        return imageHeaderParser.a(this.a);
    }
}
