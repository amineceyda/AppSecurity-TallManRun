package g.d.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

public class e implements k {
    public final /* synthetic */ InputStream a;

    public e(InputStream inputStream) {
        this.a = inputStream;
    }

    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
