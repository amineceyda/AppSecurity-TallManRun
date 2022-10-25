package g.d.a.l.v.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import g.d.a.j.c;
import g.d.a.j.d;
import g.d.a.j.e;
import g.d.a.l.f;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import g.d.a.r.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class a implements p<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0096a f2603f = new C0096a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f2604g = new b();
    public final Context a;
    public final List<ImageHeaderParser> b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final C0096a f2605d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2606e;

    /* renamed from: g.d.a.l.v.g.a$a  reason: collision with other inner class name */
    public static class C0096a {
    }

    public static class b {
        public final Queue<d> a = new ArrayDeque(0);

        public b() {
            char[] cArr = j.a;
        }

        public synchronized void a(d dVar) {
            dVar.b = null;
            dVar.c = null;
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, g.d.a.l.t.b0.d dVar, g.d.a.l.t.b0.b bVar) {
        b bVar2 = f2604g;
        C0096a aVar = f2603f;
        this.a = context.getApplicationContext();
        this.b = list;
        this.f2605d = aVar;
        this.f2606e = new b(dVar, bVar);
        this.c = bVar2;
    }

    public static int d(c cVar, int i2, int i3) {
        int min = Math.min(cVar.f2384g / i3, cVar.f2383f / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder k2 = g.a.a.a.a.k("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i2, "x");
            k2.append(i3);
            k2.append("], actual dimens: [");
            k2.append(cVar.f2383f);
            k2.append("x");
            k2.append(cVar.f2384g);
            k2.append("]");
            Log.v("BufferGifDecoder", k2.toString());
        }
        return max;
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.c;
        synchronized (bVar) {
            d poll = bVar.a.poll();
            if (poll == null) {
                poll = new d();
            }
            dVar = poll;
            dVar.b = null;
            Arrays.fill(dVar.a, (byte) 0);
            dVar.c = new c();
            dVar.f2389d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer, i2, i3, dVar, nVar);
        } finally {
            this.c.a(dVar);
        }
    }

    public boolean b(Object obj, n nVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) nVar.c(i.b)).booleanValue()) {
            if ((byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : e.e.d.l.a.N(this.b, new f(byteBuffer))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    public final e c(ByteBuffer byteBuffer, int i2, int i3, d dVar, n nVar) {
        int i4 = g.d.a.r.f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            c b2 = dVar.b();
            if (b2.c > 0) {
                if (b2.b == 0) {
                    Bitmap.Config config = nVar.c(i.a) == g.d.a.l.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int d2 = d(b2, i2, i3);
                    C0096a aVar = this.f2605d;
                    b bVar = this.f2606e;
                    Objects.requireNonNull(aVar);
                    e eVar = new e(bVar, b2, byteBuffer, d2);
                    eVar.i(config);
                    eVar.f2397k = (eVar.f2397k + 1) % eVar.f2398l.c;
                    Bitmap b3 = eVar.b();
                    if (b3 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder i5 = g.a.a.a.a.i("Decoded GIF from stream in ");
                            i5.append(g.d.a.r.f.a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", i5.toString());
                        }
                        return null;
                    }
                    e eVar2 = new e(new c(this.a, eVar, (g.d.a.l.v.b) g.d.a.l.v.b.b, i2, i3, b3));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder i6 = g.a.a.a.a.i("Decoded GIF from stream in ");
                        i6.append(g.d.a.r.f.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", i6.toString());
                    }
                    return eVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder i7 = g.a.a.a.a.i("Decoded GIF from stream in ");
                i7.append(g.d.a.r.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", i7.toString());
            }
        }
    }
}
