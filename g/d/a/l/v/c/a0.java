package g.d.a.l.v.c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import g.d.a.l.m;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;

public class a0<T> implements p<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final m<Long> f2576d = new m<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final m<Integer> f2577e = new m<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f2578f = new e();
    public final f<T> a;
    public final g.d.a.l.t.b0.d b;
    public final e c;

    public class a implements m.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l2 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    public class b implements m.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public c(a aVar) {
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    public static final class d implements f<ByteBuffer> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new b0(this, (ByteBuffer) obj));
        }
    }

    public static class e {
    }

    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public a0(g.d.a.l.t.b0.d dVar, f<T> fVar) {
        e eVar = f2578f;
        this.b = dVar;
        this.a = fVar;
        this.c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, g.d.a.l.v.c.k r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0062
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0062
            if (r14 == r0) goto L_0x0062
            g.d.a.l.v.c.k r0 = g.d.a.l.v.c.k.f2579d
            if (r15 == r0) goto L_0x0062
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0053 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0053 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0053 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0053 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0053 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0053 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0053 }
            float r14 = (float) r0     // Catch:{ all -> 0x0053 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0053 }
            float r14 = (float) r1     // Catch:{ all -> 0x0053 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0053 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0062
            java.lang.String r14 = "Exception trying to decode frame on oreo+"
            android.util.Log.d(r15, r14, r13)
        L_0x0062:
            r13 = 0
        L_0x0063:
            if (r13 != 0) goto L_0x0069
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0069:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.v.c.a0.c(android.media.MediaMetadataRetriever, long, int, int, int, g.d.a.l.v.c.k):android.graphics.Bitmap");
    }

    public v<Bitmap> a(T t, int i2, int i3, n nVar) throws IOException {
        long longValue = ((Long) nVar.c(f2576d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) nVar.c(f2577e);
            if (num == null) {
                num = 2;
            }
            k kVar = (k) nVar.c(k.f2581f);
            if (kVar == null) {
                kVar = k.f2580e;
            }
            k kVar2 = kVar;
            Objects.requireNonNull(this.c);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.a.a(mediaMetadataRetriever, t);
                Bitmap c2 = c(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, kVar2);
                mediaMetadataRetriever.release();
                return e.e(c2, this.b);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.s("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    public boolean b(T t, n nVar) {
        return true;
    }
}
