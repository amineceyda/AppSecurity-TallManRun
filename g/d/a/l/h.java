package g.d.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import g.d.a.l.t.b0.b;
import java.io.IOException;
import java.io.InputStream;

public class h implements j {
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ b b;

    public h(InputStream inputStream, b bVar) {
        this.a = inputStream;
        this.b = bVar;
    }

    public int a(ImageHeaderParser imageHeaderParser) throws IOException {
        try {
            return imageHeaderParser.b(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
