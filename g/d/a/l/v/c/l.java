package g.d.a.l.v.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import g.d.a.l.m;
import g.d.a.l.n;
import g.d.a.l.o;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.v;
import g.d.a.l.v.c.r;
import g.d.a.r.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public final class l {

    /* renamed from: f  reason: collision with root package name */
    public static final m<g.d.a.l.b> f2584f = m.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", g.d.a.l.b.PREFER_ARGB_8888);

    /* renamed from: g  reason: collision with root package name */
    public static final m<o> f2585g = m.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", o.SRGB);

    /* renamed from: h  reason: collision with root package name */
    public static final m<Boolean> f2586h;

    /* renamed from: i  reason: collision with root package name */
    public static final m<Boolean> f2587i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f2588j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final b f2589k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f2590l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f2591m = new ArrayDeque(0);
    public final d a;
    public final DisplayMetrics b;
    public final g.d.a.l.t.b0.b c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f2592d;

    /* renamed from: e  reason: collision with root package name */
    public final q f2593e = q.a();

    public class a implements b {
        public void a(d dVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    public interface b {
        void a(d dVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        m<k> mVar = k.f2581f;
        Boolean bool = Boolean.FALSE;
        f2586h = m.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f2587i = m.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        char[] cArr = j.a;
    }

    public l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, d dVar, g.d.a.l.t.b0.b bVar) {
        this.f2592d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.a = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap d(g.d.a.l.v.c.r r5, android.graphics.BitmapFactory.Options r6, g.d.a.l.v.c.l.b r7, g.d.a.l.t.b0.d r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = g.d.a.l.v.c.y.f2602d
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = i(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.e(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = d(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = g.d.a.l.v.c.y.f2602d
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = g.d.a.l.v.c.y.f2602d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.v.c.l.d(g.d.a.l.v.c.r, android.graphics.BitmapFactory$Options, g.d.a.l.v.c.l$b, g.d.a.l.t.b0.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder i2 = g.a.a.a.a.i(" (");
        i2.append(bitmap.getAllocationByteCount());
        i2.append(")");
        String sb = i2.toString();
        StringBuilder i3 = g.a.a.a.a.i("[");
        i3.append(bitmap.getWidth());
        i3.append("x");
        i3.append(bitmap.getHeight());
        i3.append("] ");
        i3.append(bitmap.getConfig());
        i3.append(sb);
        return i3.toString();
    }

    public static int f(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    public static int[] g(r rVar, BitmapFactory.Options options, b bVar, d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        d(rVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static IOException i(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder k2 = g.a.a.a.a.k("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        k2.append(str);
        k2.append(", inBitmap: ");
        k2.append(e(options.inBitmap));
        return new IOException(k2.toString(), illegalArgumentException);
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int k(double d2) {
        return (int) (d2 + 0.5d);
    }

    public final v<Bitmap> a(r rVar, int i2, int i3, n nVar, b bVar) throws IOException {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        n nVar2 = nVar;
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (l.class) {
            queue = f2591m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                j(poll);
            }
            options = poll;
        }
        options.inTempStorage = bArr;
        g.d.a.l.b bVar2 = (g.d.a.l.b) nVar2.c(f2584f);
        o oVar = (o) nVar2.c(f2585g);
        k kVar = (k) nVar2.c(k.f2581f);
        boolean booleanValue = ((Boolean) nVar2.c(f2586h)).booleanValue();
        m mVar = f2587i;
        try {
            e e2 = e.e(c(rVar, options, kVar, bVar2, oVar, nVar2.c(mVar) != null && ((Boolean) nVar2.c(mVar)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
            j(options);
            synchronized (queue) {
                queue.offer(options);
            }
            this.c.put(bArr);
            return e2;
        } catch (Throwable th) {
            j(options);
            Queue<BitmapFactory.Options> queue2 = f2591m;
            synchronized (queue2) {
                queue2.offer(options);
                this.c.put(bArr);
                throw th;
            }
        }
    }

    public v<Bitmap> b(InputStream inputStream, int i2, int i3, n nVar, b bVar) throws IOException {
        return a(new r.a(inputStream, this.f2592d, this.c), i2, i3, nVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0413, code lost:
        if (r0 >= 26) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04ed, code lost:
        r2.postScale(-1.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04fc, code lost:
        r3 = new android.graphics.RectF(0.0f, 0.0f, (float) r0.getWidth(), (float) r0.getHeight());
        r2.mapRect(r3);
        r1 = r1.d(java.lang.Math.round(r3.width()), java.lang.Math.round(r3.height()), g.d.a.l.v.c.y.c(r0));
        r2.postTranslate(-r3.left, -r3.top);
        r1.setHasAlpha(r0.hasAlpha());
        g.d.a.l.v.c.y.a(r0, r1, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0546 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c(g.d.a.l.v.c.r r32, android.graphics.BitmapFactory.Options r33, g.d.a.l.v.c.k r34, g.d.a.l.b r35, g.d.a.l.o r36, boolean r37, int r38, int r39, boolean r40, g.d.a.l.v.c.l.b r41) throws java.io.IOException {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            r3 = r33
            r0 = r34
            r4 = r35
            r5 = r38
            r6 = r39
            r7 = r41
            int r8 = g.d.a.r.f.b
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            g.d.a.l.t.b0.d r10 = r1.a
            int[] r10 = g(r2, r3, r7, r10)
            r11 = 0
            r11 = r10[r11]
            r12 = 1
            r10 = r10[r12]
            java.lang.String r12 = r3.outMimeType
            r13 = -1
            if (r11 == r13) goto L_0x002d
            if (r10 != r13) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r13 = r37
            goto L_0x002e
        L_0x002d:
            r13 = 0
        L_0x002e:
            int r14 = r32.c()
            switch(r14) {
                case 3: goto L_0x003d;
                case 4: goto L_0x003d;
                case 5: goto L_0x003a;
                case 6: goto L_0x003a;
                case 7: goto L_0x0037;
                case 8: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            r15 = 0
            goto L_0x003f
        L_0x0037:
            r15 = 270(0x10e, float:3.78E-43)
            goto L_0x003f
        L_0x003a:
            r15 = 90
            goto L_0x003f
        L_0x003d:
            r15 = 180(0xb4, float:2.52E-43)
        L_0x003f:
            switch(r14) {
                case 2: goto L_0x004a;
                case 3: goto L_0x004a;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x004a;
                case 7: goto L_0x004a;
                case 8: goto L_0x004a;
                default: goto L_0x0042;
            }
        L_0x0042:
            r16 = 0
            r16 = r8
            r37 = r14
            r14 = 0
            goto L_0x0051
        L_0x004a:
            r16 = 1
            r16 = r8
            r37 = r14
            r14 = 1
        L_0x0051:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r8) goto L_0x005f
            boolean r9 = h(r15)
            if (r9 == 0) goto L_0x005d
            r9 = r10
            goto L_0x0060
        L_0x005d:
            r9 = r11
            goto L_0x0060
        L_0x005f:
            r9 = r5
        L_0x0060:
            if (r6 != r8) goto L_0x006c
            boolean r8 = h(r15)
            if (r8 == 0) goto L_0x006a
            r8 = r11
            goto L_0x006d
        L_0x006a:
            r8 = r10
            goto L_0x006d
        L_0x006c:
            r8 = r6
        L_0x006d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r32.d()
            g.d.a.l.t.b0.d r5 = r1.a
            r18 = r12
            java.lang.String r12 = "]"
            java.lang.String r4 = ", target density: "
            r19 = r13
            java.lang.String r13 = ", density: "
            r20 = r14
            java.lang.String r14 = "x"
            java.lang.String r1 = "Downsampler"
            if (r11 <= 0) goto L_0x02c1
            if (r10 > 0) goto L_0x0093
            r0 = 3
            r7 = r1
            r1 = r4
            r5 = r12
            r4 = r13
            r15 = r14
            r14 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            goto L_0x02cb
        L_0x0093:
            boolean r21 = h(r15)
            r23 = r4
            if (r21 == 0) goto L_0x00a2
            r21 = r12
            r22 = r13
            r12 = r10
            r13 = r11
            goto L_0x00a8
        L_0x00a2:
            r21 = r12
            r22 = r13
            r13 = r10
            r12 = r11
        L_0x00a8:
            float r4 = r0.b(r12, r13, r9, r8)
            r24 = 0
            int r24 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x027b
            r24 = r15
            g.d.a.l.v.c.k$e r15 = r0.a(r12, r13, r9, r8)
            if (r15 == 0) goto L_0x0273
            r25 = r10
            float r10 = (float) r12
            r26 = r11
            float r11 = r4 * r10
            r27 = r1
            double r0 = (double) r11
            int r0 = k(r0)
            float r1 = (float) r13
            float r11 = r4 * r1
            r29 = r8
            r28 = r9
            double r8 = (double) r11
            int r8 = k(r8)
            int r0 = r12 / r0
            int r8 = r13 / r8
            g.d.a.l.v.c.k$e r9 = g.d.a.l.v.c.k.e.MEMORY
            if (r15 != r9) goto L_0x00e1
            int r0 = java.lang.Math.max(r0, r8)
            goto L_0x00e5
        L_0x00e1:
            int r0 = java.lang.Math.min(r0, r8)
        L_0x00e5:
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r8 > r11) goto L_0x00f9
            java.util.Set<java.lang.String> r11 = f2588j
            r30 = r14
            java.lang.String r14 = r3.outMimeType
            boolean r11 = r11.contains(r14)
            if (r11 == 0) goto L_0x00fb
            r0 = 1
            goto L_0x0110
        L_0x00f9:
            r30 = r14
        L_0x00fb:
            int r0 = java.lang.Integer.highestOneBit(r0)
            r11 = 1
            int r0 = java.lang.Math.max(r11, r0)
            if (r15 != r9) goto L_0x0110
            float r9 = (float) r0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 / r4
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0110
            int r0 = r0 << 1
        L_0x0110:
            r3.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r9) goto L_0x0132
            r5 = 8
            int r5 = java.lang.Math.min(r0, r5)
            float r5 = (float) r5
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.ceil(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.ceil(r8)
            int r1 = (int) r8
            int r5 = r0 / 8
            if (r5 <= 0) goto L_0x0182
            int r6 = r6 / r5
            int r1 = r1 / r5
            goto L_0x0182
        L_0x0132:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r9) goto L_0x0173
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r9) goto L_0x013b
            goto L_0x0173
        L_0x013b:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r9) goto L_0x0163
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 != r9) goto L_0x0144
            goto L_0x0163
        L_0x0144:
            int r1 = r12 % r0
            if (r1 != 0) goto L_0x0152
            int r1 = r13 % r0
            if (r1 == 0) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            int r6 = r12 / r0
            int r1 = r13 / r0
            goto L_0x0182
        L_0x0152:
            int[] r1 = g(r2, r3, r7, r5)
            r5 = 0
            r5 = r1[r5]
            r6 = 1
            r1 = r1[r6]
            r6 = r34
            r11 = r28
            r10 = r29
            goto L_0x0189
        L_0x0163:
            r5 = 24
            if (r8 < r5) goto L_0x0173
            float r5 = (float) r0
            float r10 = r10 / r5
            int r6 = java.lang.Math.round(r10)
            float r1 = r1 / r5
            int r1 = java.lang.Math.round(r1)
            goto L_0x0182
        L_0x0173:
            float r5 = (float) r0
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.floor(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.floor(r8)
            int r1 = (int) r8
        L_0x0182:
            r5 = r6
            r11 = r28
            r10 = r29
            r6 = r34
        L_0x0189:
            float r6 = r6.b(r5, r1, r11, r10)
            double r8 = (double) r6
            int r6 = f(r8)
            double r12 = (double) r6
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r8)
            double r12 = r12 * r8
            int r12 = k(r12)
            float r13 = (float) r12
            float r6 = (float) r6
            float r13 = r13 / r6
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r13)
            double r13 = r8 / r13
            double r6 = (double) r12
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r13 = r13 * r6
            int r6 = k(r13)
            r3.inTargetDensity = r6
            int r6 = f(r8)
            r3.inDensity = r6
            int r7 = r3.inTargetDensity
            if (r7 <= 0) goto L_0x01ee
            if (r6 <= 0) goto L_0x01ee
            if (r7 == r6) goto L_0x01ee
            r6 = 1
            goto L_0x01ef
        L_0x01ee:
            r6 = 0
        L_0x01ef:
            if (r6 == 0) goto L_0x01f5
            r6 = 1
            r3.inScaled = r6
            goto L_0x01fa
        L_0x01f5:
            r6 = 0
            r3.inTargetDensity = r6
            r3.inDensity = r6
        L_0x01fa:
            r6 = 2
            r7 = r27
            boolean r6 = android.util.Log.isLoggable(r7, r6)
            if (r6 == 0) goto L_0x0267
            java.lang.String r6 = "Calculate scaling, source: ["
            java.lang.String r12 = "], degreesToRotate: "
            r14 = r25
            r13 = r26
            r15 = r30
            java.lang.StringBuilder r6 = g.a.a.a.a.k(r6, r13, r15, r14, r12)
            r12 = r24
            r6.append(r12)
            java.lang.String r12 = ", target: ["
            r6.append(r12)
            r6.append(r11)
            r6.append(r15)
            r6.append(r10)
            java.lang.String r12 = "], power of two scaled: ["
            r6.append(r12)
            r6.append(r5)
            r6.append(r15)
            r6.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = ", power of 2 sample size: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ", adjusted scale factor: "
            r6.append(r0)
            r6.append(r8)
            r1 = r23
            r6.append(r1)
            int r0 = r3.inTargetDensity
            r6.append(r0)
            r4 = r22
            r6.append(r4)
            int r0 = r3.inDensity
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r7, r0)
            goto L_0x02f6
        L_0x0267:
            r4 = r22
            r1 = r23
            r14 = r25
            r13 = r26
            r15 = r30
            goto L_0x02f6
        L_0x0273:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x027b:
            r6 = r0
            r13 = r11
            r15 = r14
            r11 = r9
            r14 = r10
            r10 = r8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot scale with factor: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " from: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            r1.append(r13)
            r1.append(r15)
            r1.append(r14)
            java.lang.String r2 = "], target: ["
            r1.append(r2)
            r1.append(r11)
            r1.append(r15)
            r1.append(r10)
            r5 = r21
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02c1:
            r7 = r1
            r1 = r4
            r5 = r12
            r4 = r13
            r15 = r14
            r14 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r0 = 3
        L_0x02cb:
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L_0x02f6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "Unable to determine dimensions for: "
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = " with target ["
            r0.append(r6)
            r0.append(r11)
            r0.append(r15)
            r0.append(r10)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r7, r0)
        L_0x02f6:
            r5 = r31
            r6 = r7
            g.d.a.l.v.c.q r0 = r5.f2593e
            r7 = r19
            r8 = r20
            boolean r0 = r0.b(r11, r10, r7, r8)
            if (r0 == 0) goto L_0x030c
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r7
            r7 = 0
            r3.inMutable = r7
        L_0x030c:
            if (r0 == 0) goto L_0x0310
            r7 = r1
            goto L_0x0352
        L_0x0310:
            g.d.a.l.b r0 = g.d.a.l.b.PREFER_ARGB_8888
            r7 = r1
            r1 = r35
            if (r1 == r0) goto L_0x034e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r32.d()     // Catch:{ IOException -> 0x0320 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x0320 }
            goto L_0x033d
        L_0x0320:
            r0 = move-exception
            r8 = 3
            boolean r8 = android.util.Log.isLoggable(r6, r8)
            if (r8 == 0) goto L_0x033c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Cannot determine whether the image has alpha or not from header, format "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            android.util.Log.d(r6, r1, r0)
        L_0x033c:
            r0 = 0
        L_0x033d:
            if (r0 == 0) goto L_0x0342
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0344
        L_0x0342:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x0344:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r1) goto L_0x0352
            r0 = 1
            r3.inDither = r0
            goto L_0x0352
        L_0x034e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x0352:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r3.inSampleSize
            if (r13 < 0) goto L_0x0360
            if (r14 < 0) goto L_0x0360
            if (r40 == 0) goto L_0x0360
            r8 = r10
            r9 = r11
            goto L_0x03d8
        L_0x0360:
            int r8 = r3.inTargetDensity
            if (r8 <= 0) goto L_0x036c
            int r9 = r3.inDensity
            if (r9 <= 0) goto L_0x036c
            if (r8 == r9) goto L_0x036c
            r9 = 1
            goto L_0x036d
        L_0x036c:
            r9 = 0
        L_0x036d:
            if (r9 == 0) goto L_0x0375
            float r8 = (float) r8
            int r9 = r3.inDensity
            float r9 = (float) r9
            float r8 = r8 / r9
            goto L_0x0377
        L_0x0375:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0377:
            float r9 = (float) r13
            float r10 = (float) r1
            float r9 = r9 / r10
            double r11 = (double) r9
            double r11 = java.lang.Math.ceil(r11)
            int r9 = (int) r11
            float r11 = (float) r14
            float r11 = r11 / r10
            double r10 = (double) r11
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r9 = (float) r9
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            float r10 = (float) r10
            float r10 = r10 * r8
            int r10 = java.lang.Math.round(r10)
            r11 = 2
            boolean r11 = android.util.Log.isLoggable(r6, r11)
            if (r11 == 0) goto L_0x03d7
            java.lang.String r11 = "Calculated target ["
            java.lang.String r12 = "] for source ["
            java.lang.StringBuilder r11 = g.a.a.a.a.k(r11, r9, r15, r10, r12)
            r11.append(r13)
            r11.append(r15)
            r11.append(r14)
            java.lang.String r12 = "], sampleSize: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r1 = ", targetDensity: "
            r11.append(r1)
            int r1 = r3.inTargetDensity
            r11.append(r1)
            r11.append(r4)
            int r1 = r3.inDensity
            r11.append(r1)
            java.lang.String r1 = ", density multiplier: "
            r11.append(r1)
            r11.append(r8)
            java.lang.String r1 = r11.toString()
            android.util.Log.v(r6, r1)
        L_0x03d7:
            r8 = r10
        L_0x03d8:
            r1 = 26
            if (r9 <= 0) goto L_0x03f7
            if (r8 <= 0) goto L_0x03f7
            g.d.a.l.t.b0.d r10 = r5.a
            if (r0 < r1) goto L_0x03ec
            android.graphics.Bitmap$Config r11 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.HARDWARE
            if (r11 != r12) goto L_0x03e9
            goto L_0x03f7
        L_0x03e9:
            android.graphics.Bitmap$Config r11 = r3.outConfig
            goto L_0x03ed
        L_0x03ec:
            r11 = 0
        L_0x03ed:
            if (r11 != 0) goto L_0x03f1
            android.graphics.Bitmap$Config r11 = r3.inPreferredConfig
        L_0x03f1:
            android.graphics.Bitmap r8 = r10.c(r9, r8, r11)
            r3.inBitmap = r8
        L_0x03f7:
            r8 = 28
            if (r0 < r8) goto L_0x0413
            g.d.a.l.o r0 = g.d.a.l.o.DISPLAY_P3
            r1 = r36
            if (r1 != r0) goto L_0x040d
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x040d
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x040d
            r0 = 1
            goto L_0x040e
        L_0x040d:
            r0 = 0
        L_0x040e:
            if (r0 == 0) goto L_0x0415
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0417
        L_0x0413:
            if (r0 < r1) goto L_0x041d
        L_0x0415:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0417:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x041d:
            g.d.a.l.t.b0.d r0 = r5.a
            r1 = r41
            android.graphics.Bitmap r0 = d(r2, r3, r1, r0)
            g.d.a.l.t.b0.d r2 = r5.a
            r1.a(r2, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r6, r1)
            if (r1 == 0) goto L_0x04b3
            java.lang.String r1 = "Decoded "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            java.lang.String r2 = e(r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r13)
            r1.append(r15)
            r1.append(r14)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r18
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r3.inBitmap
            java.lang.String r2 = e(r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r38
            r1.append(r2)
            r1.append(r15)
            r2 = r39
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r3.inSampleSize
            r1.append(r2)
            r1.append(r4)
            int r2 = r3.inDensity
            r1.append(r2)
            r1.append(r7)
            int r2 = r3.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = g.d.a.r.f.a(r16)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r6, r1)
        L_0x04b3:
            if (r0 == 0) goto L_0x0546
            android.util.DisplayMetrics r1 = r5.b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            g.d.a.l.t.b0.d r1 = r5.a
            switch(r37) {
                case 2: goto L_0x04c3;
                case 3: goto L_0x04c3;
                case 4: goto L_0x04c3;
                case 5: goto L_0x04c3;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04c3;
                case 8: goto L_0x04c3;
                default: goto L_0x04c1;
            }
        L_0x04c1:
            r2 = 0
            goto L_0x04c4
        L_0x04c3:
            r2 = 1
        L_0x04c4:
            if (r2 != 0) goto L_0x04c9
            r1 = r0
            goto L_0x053a
        L_0x04c9:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r6 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r37) {
                case 2: goto L_0x04f7;
                case 3: goto L_0x04f3;
                case 4: goto L_0x04ea;
                case 5: goto L_0x04e6;
                case 6: goto L_0x04e2;
                case 7: goto L_0x04de;
                case 8: goto L_0x04da;
                default: goto L_0x04d9;
            }
        L_0x04d9:
            goto L_0x04fc
        L_0x04da:
            r2.setRotate(r3)
            goto L_0x04fc
        L_0x04de:
            r2.setRotate(r3)
            goto L_0x04ed
        L_0x04e2:
            r2.setRotate(r4)
            goto L_0x04fc
        L_0x04e6:
            r2.setRotate(r4)
            goto L_0x04ed
        L_0x04ea:
            r2.setRotate(r6)
        L_0x04ed:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)
            goto L_0x04fc
        L_0x04f3:
            r2.setRotate(r6)
            goto L_0x04fc
        L_0x04f7:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r7, r3)
        L_0x04fc:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r6 = r0.getHeight()
            float r6 = (float) r6
            r7 = 0
            r3.<init>(r7, r7, r4, r6)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r6 = r3.height()
            int r6 = java.lang.Math.round(r6)
            android.graphics.Bitmap$Config r7 = g.d.a.l.v.c.y.c(r0)
            android.graphics.Bitmap r1 = r1.d(r4, r6, r7)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r0.hasAlpha()
            r1.setHasAlpha(r3)
            g.d.a.l.v.c.y.a(r0, r1, r2)
        L_0x053a:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L_0x0547
            g.d.a.l.t.b0.d r2 = r5.a
            r2.e(r0)
            goto L_0x0547
        L_0x0546:
            r1 = 0
        L_0x0547:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.v.c.l.c(g.d.a.l.v.c.r, android.graphics.BitmapFactory$Options, g.d.a.l.v.c.k, g.d.a.l.b, g.d.a.l.o, boolean, int, int, boolean, g.d.a.l.v.c.l$b):android.graphics.Bitmap");
    }
}
