package g.d.a.l.s.p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import g.d.a.e;
import g.d.a.l.s.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class b implements d<InputStream> {
    public final Uri b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f2426d;

    public static class a implements c {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: g.d.a.l.s.p.b$b  reason: collision with other inner class name */
    public static class C0080b implements c {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public C0080b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public b(Uri uri, d dVar) {
        this.b = uri;
        this.c = dVar;
    }

    public static b c(Context context, Uri uri, c cVar) {
        return new b(uri, new d(g.d.a.b.b(context).f2318e.e(), cVar, g.d.a.b.b(context).f2319f, context.getContentResolver()));
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f2426d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r6 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream d() throws java.io.FileNotFoundException {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            g.d.a.l.s.p.d r1 = r12.c
            android.net.Uri r2 = r12.b
            java.util.Objects.requireNonNull(r1)
            r3 = 0
            r4 = 3
            r5 = 0
            g.d.a.l.s.p.c r6 = r1.a     // Catch:{ SecurityException -> 0x002e, all -> 0x002b }
            android.database.Cursor r6 = r6.a(r2)     // Catch:{ SecurityException -> 0x002e, all -> 0x002b }
            if (r6 == 0) goto L_0x0028
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0026 }
            if (r7 == 0) goto L_0x0028
            java.lang.String r7 = r6.getString(r3)     // Catch:{ SecurityException -> 0x0026 }
            r6.close()
            goto L_0x0051
        L_0x0022:
            r0 = move-exception
            r5 = r6
            goto L_0x00f7
        L_0x0026:
            r7 = move-exception
            goto L_0x0031
        L_0x0028:
            if (r6 == 0) goto L_0x0050
            goto L_0x004d
        L_0x002b:
            r0 = move-exception
            goto L_0x00f7
        L_0x002e:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L_0x0031:
            boolean r8 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0022 }
            if (r8 == 0) goto L_0x004b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r8.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r9 = "Failed to query for thumbnail for Uri: "
            r8.append(r9)     // Catch:{ all -> 0x0022 }
            r8.append(r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0022 }
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x0022 }
        L_0x004b:
            if (r6 == 0) goto L_0x0050
        L_0x004d:
            r6.close()
        L_0x0050:
            r7 = r5
        L_0x0051:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x0059
        L_0x0057:
            r1 = r5
            goto L_0x007c
        L_0x0059:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x006f
            r7 = 0
            long r9 = r6.length()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x006f
            r3 = 1
        L_0x006f:
            if (r3 != 0) goto L_0x0072
            goto L_0x0057
        L_0x0072:
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.c     // Catch:{ NullPointerException -> 0x00d1 }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00d1 }
        L_0x007c:
            r2 = -1
            if (r1 == 0) goto L_0x00c7
            g.d.a.l.s.p.d r3 = r12.c
            android.net.Uri r6 = r12.b
            java.util.Objects.requireNonNull(r3)
            android.content.ContentResolver r7 = r3.c     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009e }
            java.io.InputStream r5 = r7.openInputStream(r6)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009e }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r3.f2428d     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009e }
            g.d.a.l.t.b0.b r3 = r3.b     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009e }
            int r0 = e.e.d.l.a.F(r7, r5, r3)     // Catch:{ IOException -> 0x00a0, NullPointerException -> 0x009e }
            if (r5 == 0) goto L_0x00c8
            r5.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x00c8
        L_0x009a:
            goto L_0x00c8
        L_0x009c:
            r0 = move-exception
            goto L_0x00c1
        L_0x009e:
            r3 = move-exception
            goto L_0x00a1
        L_0x00a0:
            r3 = move-exception
        L_0x00a1:
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x00bb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r4.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "Failed to open uri: "
            r4.append(r7)     // Catch:{ all -> 0x009c }
            r4.append(r6)     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x009c }
            android.util.Log.d(r0, r4, r3)     // Catch:{ all -> 0x009c }
        L_0x00bb:
            if (r5 == 0) goto L_0x00c7
            r5.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00c7
        L_0x00c1:
            if (r5 == 0) goto L_0x00c6
            r5.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            throw r0
        L_0x00c7:
            r0 = -1
        L_0x00c8:
            if (r0 == r2) goto L_0x00d0
            g.d.a.l.s.g r2 = new g.d.a.l.s.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00d0:
            return r1
        L_0x00d1:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
            r5.close()
        L_0x00fc:
            goto L_0x00fe
        L_0x00fd:
            throw r0
        L_0x00fe:
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.s.p.b.d():java.io.InputStream");
    }

    public g.d.a.l.a e() {
        return g.d.a.l.a.LOCAL;
    }

    public void f(e eVar, d.a<? super InputStream> aVar) {
        try {
            InputStream d2 = d();
            this.f2426d = d2;
            aVar.d(d2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.c(e2);
        }
    }
}
