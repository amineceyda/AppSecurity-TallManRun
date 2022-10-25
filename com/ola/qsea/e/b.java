package com.ola.qsea.e;

import com.ola.qsea.l.a;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

public class b {
    public static String a(HttpURLConnection httpURLConnection) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        InputStream inputStream = httpURLConnection.getInputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                String byteArrayOutputStream2 = byteArrayOutputStream.toString(MeasureConst.CHARSET_UTF8);
                a.a(byteArrayOutputStream);
                a.a(inputStream);
                return byteArrayOutputStream2;
            }
        }
    }

    public static void b(String str, String str2, c cVar) {
        com.ola.qsea.c.a.a().a(new a(str, str2, cVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r6, java.lang.String r7, com.ola.qsea.e.c r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = -1
            java.net.URL r3 = new java.net.URL     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r3.<init>(r6)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.net.URLConnection r6 = r3.openConnection()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r3 = "POST"
            r6.setRequestMethod(r3)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r3 = 30000(0x7530, float:4.2039E-41)
            r6.setConnectTimeout(r3)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r3 = 10000(0x2710, float:1.4013E-41)
            r6.setReadTimeout(r3)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r6.setInstanceFollowRedirects(r1)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r6.setRequestProperty(r3, r4)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r6.setDoInput(r0)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r6.setDoOutput(r0)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r6.setUseCaches(r1)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.io.OutputStream r4 = r6.getOutputStream()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r3.write(r7)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r3.flush()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r6.connect()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            int r2 = r6.getResponseCode()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 != r7) goto L_0x0053
            java.lang.String r6 = a(r6)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r7 = "0"
            goto L_0x00ba
        L_0x0053:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r7.<init>()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r0 = "response status code != 2XX. msg: "
            r7.append(r0)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r6 = r6.getResponseMessage()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            r7.append(r6)     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r6 = r7.toString()     // Catch:{ ConnectException -> 0x00a5, SecurityException -> 0x0080, all -> 0x006b }
            java.lang.String r7 = "452"
            goto L_0x00b9
        L_0x006b:
            r6 = move-exception
            java.lang.String r7 = "https connect error: "
            java.lang.StringBuilder r7 = g.a.a.a.a.i(r7)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "499"
            goto L_0x00b9
        L_0x0080:
            r6 = move-exception
            r6.printStackTrace()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r0 = "NETWORK"
            java.lang.String r1 = "No network permission, please add \"android.permission.INTERNET\" to the AndroidManifest file"
            com.ola.qsea.m.a.a(r0, r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "security error: "
            r7.append(r0)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "199"
            goto L_0x00b9
        L_0x00a5:
            r6 = move-exception
            java.lang.String r7 = "https connect timeout: "
            java.lang.StringBuilder r7 = g.a.a.a.a.i(r7)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "451"
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            if (r0 == 0) goto L_0x00c0
            r8.a(r6)
            goto L_0x00c3
        L_0x00c0:
            r8.a(r7, r2, r6)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.e.b.c(java.lang.String, java.lang.String, com.ola.qsea.e.c):void");
    }
}
