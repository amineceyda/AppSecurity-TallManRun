package g.d.a.l.v;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import g.d.a.l.b;
import g.d.a.l.m;
import g.d.a.l.n;
import g.d.a.l.o;
import g.d.a.l.p;
import g.d.a.l.t.v;
import g.d.a.l.v.c.d;
import g.d.a.l.v.c.e;
import g.d.a.l.v.c.k;
import g.d.a.l.v.c.l;
import g.d.a.l.v.c.q;
import java.io.IOException;

public abstract class a<T> implements p<ImageDecoder.Source, T> {
    public final q a = q.a();

    /* renamed from: g.d.a.l.v.a$a  reason: collision with other inner class name */
    public class C0093a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f2572d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k f2573e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ o f2574f;

        /* renamed from: g.d.a.l.v.a$a$a  reason: collision with other inner class name */
        public class C0094a implements ImageDecoder.OnPartialImageListener {
            public C0094a(C0093a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0093a(int i2, int i3, boolean z, b bVar, k kVar, o oVar) {
            this.a = i2;
            this.b = i3;
            this.c = z;
            this.f2572d = bVar;
            this.f2573e = kVar;
            this.f2574f = oVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (a.this.a.b(this.a, this.b, this.c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f2572d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0094a(this));
            Size size = imageInfo.getSize();
            int i2 = this.a;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getWidth();
            }
            int i3 = this.b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = size.getHeight();
            }
            float b2 = this.f2573e.b(size.getWidth(), size.getHeight(), i2, i3);
            int round = Math.round(((float) size.getWidth()) * b2);
            int round2 = Math.round(((float) size.getHeight()) * b2);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder i4 = g.a.a.a.a.i("Resizing from [");
                i4.append(size.getWidth());
                i4.append("x");
                i4.append(size.getHeight());
                i4.append("] to [");
                i4.append(round);
                i4.append("x");
                i4.append(round2);
                i4.append("] scaleFactor: ");
                i4.append(b2);
                Log.v("ImageDecoder", i4.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                if (this.f2574f == o.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i5 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, n nVar) throws IOException {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final v<T> a(ImageDecoder.Source source, int i2, int i3, n nVar) throws IOException {
        b bVar = (b) nVar.c(l.f2584f);
        k kVar = (k) nVar.c(k.f2581f);
        m mVar = l.f2587i;
        boolean z = nVar.c(mVar) != null && ((Boolean) nVar.c(mVar)).booleanValue();
        d dVar = (d) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C0093a(i2, i3, z, bVar, kVar, (o) nVar.c(l.f2585g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder i4 = g.a.a.a.a.i("Decoded [");
            i4.append(decodeBitmap.getWidth());
            i4.append("x");
            i4.append(decodeBitmap.getHeight());
            i4.append("] for [");
            i4.append(i2);
            i4.append("x");
            i4.append(i3);
            i4.append("]");
            Log.v("BitmapImageDecoder", i4.toString());
        }
        return new e(decodeBitmap, dVar.b);
    }
}
