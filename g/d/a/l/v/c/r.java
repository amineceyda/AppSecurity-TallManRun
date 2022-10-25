package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import g.d.a.l.g;
import g.d.a.l.i;
import g.d.a.l.s.k;
import g.d.a.l.s.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public interface r {

    public static final class a implements r {
        public final k a;
        public final g.d.a.l.t.b0.b b;
        public final List<ImageHeaderParser> c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, g.d.a.l.t.b0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.c = list;
            this.a = new k(inputStream, bVar);
        }

        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), (Rect) null, options);
        }

        public void b() {
            v vVar = this.a.a;
            synchronized (vVar) {
                vVar.f2598d = vVar.b.length;
            }
        }

        public int c() throws IOException {
            return e.e.d.l.a.F(this.c, this.a.a(), this.b);
        }

        public ImageHeaderParser.ImageType d() throws IOException {
            return e.e.d.l.a.M(this.c, this.a.a(), this.b);
        }
    }

    public static final class b implements r {
        public final g.d.a.l.t.b0.b a;
        public final List<ImageHeaderParser> b;
        public final m c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, g.d.a.l.t.b0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.b = list;
            this.c = new m(parcelFileDescriptor);
        }

        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void b() {
        }

        public int c() throws IOException {
            return e.e.d.l.a.G(this.b, new i(this.c, this.a));
        }

        public ImageHeaderParser.ImageType d() throws IOException {
            return e.e.d.l.a.N(this.b, new g(this.c, this.a));
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
