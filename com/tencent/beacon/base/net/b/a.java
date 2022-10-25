package com.tencent.beacon.base.net.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class a {
    public static byte[] a(int i2, byte[] bArr) throws Exception {
        if (i2 == 1) {
            return d(bArr);
        }
        if (i2 == 2) {
            return a(bArr);
        }
        return null;
    }

    private static byte[] a(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.finish();
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static byte[] b(int i2, byte[] bArr) throws Exception {
        if (i2 == 1) {
            return c(bArr);
        }
        if (i2 == 2) {
            return b(bArr);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(byte[] r10) throws java.lang.Exception {
        /*
            r0 = 0
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x004d, all -> 0x0049 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x004d, all -> 0x0049 }
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0045, all -> 0x0042 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x003e }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x003e }
            r6.<init>()     // Catch:{ Exception -> 0x003e }
        L_0x0015:
            int r7 = r3.read(r5, r0, r4)     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r8 = -1
            if (r7 == r8) goto L_0x0020
            r6.write(r5, r0, r7)     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            goto L_0x0015
        L_0x0020:
            byte[] r1 = r6.toByteArray()     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r6.flush()     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r6.close()
            r3.close()
            r2.close()
            goto L_0x009b
        L_0x0032:
            r10 = move-exception
            r1 = r6
            goto L_0x009c
        L_0x0036:
            r4 = move-exception
            r5 = r4
            r4 = r1
            r1 = r6
            goto L_0x0053
        L_0x003b:
            r10 = move-exception
            goto L_0x009c
        L_0x003e:
            r4 = move-exception
            r5 = r4
            r4 = r1
            goto L_0x0053
        L_0x0042:
            r10 = move-exception
            r3 = r1
            goto L_0x009c
        L_0x0045:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L_0x0051
        L_0x0049:
            r10 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x009c
        L_0x004d:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r3 = r2
        L_0x0051:
            r5 = r4
            r4 = r3
        L_0x0053:
            com.tencent.beacon.a.b.g r6 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x003b }
            java.lang.String r7 = "509"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r8.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r9 = "unzipData length: "
            r8.append(r9)     // Catch:{ all -> 0x003b }
            int r10 = r10.length     // Catch:{ all -> 0x003b }
            r8.append(r10)     // Catch:{ all -> 0x003b }
            java.lang.String r10 = r8.toString()     // Catch:{ all -> 0x003b }
            r6.a(r7, r10, r5)     // Catch:{ all -> 0x003b }
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r10.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r6 = "unGzip error "
            r10.append(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x003b }
            r10.append(r5)     // Catch:{ all -> 0x003b }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x003b }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x003b }
            com.tencent.beacon.base.util.c.b(r10, r0)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0090
            r1.close()
        L_0x0090:
            if (r3 == 0) goto L_0x0095
            r3.close()
        L_0x0095:
            if (r2 == 0) goto L_0x009a
            r2.close()
        L_0x009a:
            r1 = r4
        L_0x009b:
            return r1
        L_0x009c:
            if (r1 == 0) goto L_0x00a1
            r1.close()
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()
        L_0x00ab:
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.b.a.b(byte[]):byte[]");
    }

    private static byte[] c(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
        byte[] bArr2 = null;
        while (zipInputStream.getNextEntry() != null) {
            byte[] bArr3 = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = zipInputStream.read(bArr3, 0, 1024);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr3, 0, read);
            }
            bArr2 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        }
        zipInputStream.close();
        byteArrayInputStream.close();
        return bArr2;
    }

    private static byte[] d(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        ZipEntry zipEntry = new ZipEntry("zip");
        zipEntry.setSize((long) bArr.length);
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
