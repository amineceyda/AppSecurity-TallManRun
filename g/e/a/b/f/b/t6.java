package g.e.a.b.f.b;

import g.c.b.b.f;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

public final class t6 implements Runnable {
    public final URL b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v6 f3355d;

    /* renamed from: e  reason: collision with root package name */
    public final l4 f3356e;

    public t6(v6 v6Var, String str, URL url, l4 l4Var) {
        this.f3355d = v6Var;
        f.k(str);
        Objects.requireNonNull(url, "null reference");
        this.b = url;
        this.f3356e = l4Var;
        this.c = str;
    }

    public final void a(int i2, Exception exc, byte[] bArr, Map map) {
        this.f3355d.a.b().r(new s6(this, i2, exc, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC, Splitter:B:26:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            g.e.a.b.f.b.v6 r0 = r9.f3355d
            r0.g()
            r0 = 0
            r1 = 0
            g.e.a.b.f.b.v6 r2 = r9.f3355d     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            java.net.URL r3 = r9.b     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            if (r4 == 0) goto L_0x007a
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            g.e.a.b.f.b.n4 r4 = r2.a     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            g.e.a.b.f.b.f r4 = r4.f3258g     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            g.e.a.b.f.b.f r2 = r2.f3258g     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0077, all -> 0x0074 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0062 }
            r5.<init>()     // Catch:{ all -> 0x0062 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x0062 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0060 }
        L_0x0048:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0060 }
            if (r8 <= 0) goto L_0x0052
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x0060 }
            goto L_0x0048
        L_0x0052:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x0060 }
            r6.close()     // Catch:{ IOException -> 0x006c, all -> 0x006a }
            r3.disconnect()
            r9.a(r2, r1, r0, r4)
            return
        L_0x0060:
            r0 = move-exception
            goto L_0x0064
        L_0x0062:
            r0 = move-exception
            r6 = r1
        L_0x0064:
            if (r6 == 0) goto L_0x0069
            r6.close()     // Catch:{ IOException -> 0x006c, all -> 0x006a }
        L_0x0069:
            throw r0     // Catch:{ IOException -> 0x006c, all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            goto L_0x0087
        L_0x006c:
            r0 = move-exception
            goto L_0x0095
        L_0x006e:
            r0 = move-exception
            r4 = r1
            goto L_0x0087
        L_0x0071:
            r0 = move-exception
            r4 = r1
            goto L_0x0095
        L_0x0074:
            r2 = move-exception
            r4 = r1
            goto L_0x0085
        L_0x0077:
            r2 = move-exception
            r4 = r1
            goto L_0x0093
        L_0x007a:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
            throw r2     // Catch:{ IOException -> 0x0090, all -> 0x0082 }
        L_0x0082:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0085:
            r0 = r2
            r2 = 0
        L_0x0087:
            if (r3 == 0) goto L_0x008c
            r3.disconnect()
        L_0x008c:
            r9.a(r2, r1, r1, r4)
            throw r0
        L_0x0090:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x0093:
            r0 = r2
            r2 = 0
        L_0x0095:
            if (r3 == 0) goto L_0x009a
            r3.disconnect()
        L_0x009a:
            r9.a(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.t6.run():void");
    }
}
