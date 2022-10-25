package g.e.a.b.f.b;

import g.c.b.b.f;
import java.net.URL;
import java.util.Map;

public final class j3 implements Runnable {
    public final URL b;
    public final byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final h3 f3200d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3201e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f3202f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k3 f3203g;

    public j3(k3 k3Var, String str, URL url, byte[] bArr, Map map, h3 h3Var) {
        this.f3203g = k3Var;
        f.k(str);
        this.b = url;
        this.c = bArr;
        this.f3200d = h3Var;
        this.f3201e = str;
        this.f3202f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef A[SYNTHETIC, Splitter:B:43:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011f A[SYNTHETIC, Splitter:B:65:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015c A[SYNTHETIC, Splitter:B:78:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            g.e.a.b.f.b.k3 r1 = r13.f3203g
            r1.g()
            r1 = 0
            r2 = 0
            g.e.a.b.f.b.k3 r3 = r13.f3203g     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            java.net.URL r4 = r13.b     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            if (r5 == 0) goto L_0x0110
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            g.e.a.b.f.b.n4 r5 = r3.a     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            g.e.a.b.f.b.f r5 = r5.f3258g     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            g.e.a.b.f.b.n4 r3 = r3.a     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            g.e.a.b.f.b.f r3 = r3.f3258g     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            java.util.Map r5 = r13.f3202f     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            if (r5 == 0) goto L_0x005d
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
        L_0x0041:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            if (r6 == 0) goto L_0x005d
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            goto L_0x0041
        L_0x005d:
            byte[] r5 = r13.c     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            if (r5 == 0) goto L_0x00a9
            g.e.a.b.f.b.k3 r5 = r13.f3203g     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.k9 r5 = r5.b     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.m9 r5 = r5.f3233g     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.k9.I(r5)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            byte[] r6 = r13.c     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            byte[] r5 = r5.M(r6)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.k3 r6 = r13.f3203g     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.n4 r6 = r6.a     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.f3 r6 = r6.d()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            g.e.a.b.f.b.d3 r6 = r6.n     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            int r7 = r5.length     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            r6.b(r8, r9)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            r4.connect()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            r3.write(r5)     // Catch:{ IOException -> 0x00a4, all -> 0x009f }
            r3.close()     // Catch:{ IOException -> 0x00a4, all -> 0x009f }
            goto L_0x00a9
        L_0x009f:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x011c
        L_0x00a4:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x0158
        L_0x00a9:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x010c, all -> 0x0108 }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0103, all -> 0x00ff }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00eb }
            r3.<init>()     // Catch:{ all -> 0x00eb }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00eb }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00e9 }
        L_0x00be:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00e9 }
            if (r7 <= 0) goto L_0x00c8
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00e9 }
            goto L_0x00be
        L_0x00c8:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00e9 }
            r5.close()     // Catch:{ IOException -> 0x00f8, all -> 0x00f3 }
            r4.disconnect()
            g.e.a.b.f.b.k3 r0 = r13.f3203g
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.k4 r0 = r0.b()
            g.e.a.b.f.b.i3 r1 = new g.e.a.b.f.b.i3
            java.lang.String r6 = r13.f3201e
            g.e.a.b.f.b.h3 r7 = r13.f3200d
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00e5:
            r0.r(r1)
            return
        L_0x00e9:
            r1 = move-exception
            goto L_0x00ed
        L_0x00eb:
            r1 = move-exception
            r5 = r2
        L_0x00ed:
            if (r5 == 0) goto L_0x00f2
            r5.close()     // Catch:{ IOException -> 0x00f8, all -> 0x00f3 }
        L_0x00f2:
            throw r1     // Catch:{ IOException -> 0x00f8, all -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x011d
        L_0x00f8:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x015a
        L_0x00ff:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x011d
        L_0x0103:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x015a
        L_0x0108:
            r3 = move-exception
            r12 = r2
            r5 = r3
            goto L_0x011c
        L_0x010c:
            r3 = move-exception
            r12 = r2
            r10 = r3
            goto L_0x0159
        L_0x0110:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
            throw r3     // Catch:{ IOException -> 0x0154, all -> 0x0118 }
        L_0x0118:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x011c:
            r9 = 0
        L_0x011d:
            if (r2 == 0) goto L_0x0137
            r2.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0137
        L_0x0123:
            r1 = move-exception
            g.e.a.b.f.b.k3 r2 = r13.f3203g
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3136f
            java.lang.String r3 = r13.f3201e
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)
            r2.c(r0, r3, r1)
        L_0x0137:
            if (r4 == 0) goto L_0x013c
            r4.disconnect()
        L_0x013c:
            g.e.a.b.f.b.k3 r0 = r13.f3203g
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.k4 r0 = r0.b()
            g.e.a.b.f.b.i3 r1 = new g.e.a.b.f.b.i3
            java.lang.String r7 = r13.f3201e
            g.e.a.b.f.b.h3 r8 = r13.f3200d
            r10 = 0
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.r(r1)
            throw r5
        L_0x0154:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x0158:
            r10 = r5
        L_0x0159:
            r9 = 0
        L_0x015a:
            if (r2 == 0) goto L_0x0174
            r2.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0174
        L_0x0160:
            r1 = move-exception
            g.e.a.b.f.b.k3 r2 = r13.f3203g
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3136f
            java.lang.String r3 = r13.f3201e
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)
            r2.c(r0, r3, r1)
        L_0x0174:
            if (r4 == 0) goto L_0x0179
            r4.disconnect()
        L_0x0179:
            g.e.a.b.f.b.k3 r0 = r13.f3203g
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.k4 r0 = r0.b()
            g.e.a.b.f.b.i3 r1 = new g.e.a.b.f.b.i3
            java.lang.String r7 = r13.f3201e
            g.e.a.b.f.b.h3 r8 = r13.f3200d
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.j3.run():void");
    }
}
