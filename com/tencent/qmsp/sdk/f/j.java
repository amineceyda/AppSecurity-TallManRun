package com.tencent.qmsp.sdk.f;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

public class j {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0 A[SYNTHETIC, Splitter:B:46:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r7, java.io.File r8) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = -1
            r2 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0099 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0099 }
            r4.<init>(r7)     // Catch:{ all -> 0x0099 }
            r3.<init>(r4)     // Catch:{ all -> 0x0099 }
        L_0x0010:
            java.util.zip.ZipEntry r7 = r3.getNextEntry()     // Catch:{ all -> 0x0097 }
        L_0x0014:
            if (r7 == 0) goto L_0x008c
            java.lang.String r4 = r7.getName()     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0014
            java.lang.String r5 = "../"
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0025
            goto L_0x0014
        L_0x0025:
            java.io.File r4 = a((java.io.File) r8, (java.util.zip.ZipEntry) r7)     // Catch:{ all -> 0x0097 }
            boolean r7 = r7.isDirectory()     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "Failed to create directory "
            if (r7 == 0) goto L_0x0053
            boolean r7 = r4.isDirectory()     // Catch:{ all -> 0x0097 }
            if (r7 != 0) goto L_0x0010
            boolean r7 = r4.mkdirs()     // Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x003e
            goto L_0x0010
        L_0x003e:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r8.<init>()     // Catch:{ all -> 0x0097 }
            r8.append(r5)     // Catch:{ all -> 0x0097 }
            r8.append(r4)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0097 }
            r7.<init>(r8)     // Catch:{ all -> 0x0097 }
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x0053:
            java.io.File r7 = r4.getParentFile()     // Catch:{ all -> 0x0097 }
            boolean r6 = r7.isDirectory()     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0079
            boolean r6 = r7.mkdirs()     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0079
        L_0x0064:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            r0.append(r5)     // Catch:{ all -> 0x0097 }
            r0.append(r7)     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0097 }
            r8.<init>(r7)     // Catch:{ all -> 0x0097 }
            throw r8     // Catch:{ all -> 0x0097 }
        L_0x0079:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0097 }
            r7.<init>(r4)     // Catch:{ all -> 0x0097 }
        L_0x007e:
            int r4 = r3.read(r0)     // Catch:{ all -> 0x0097 }
            if (r4 <= 0) goto L_0x0088
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0097 }
            goto L_0x007e
        L_0x0088:
            r7.close()     // Catch:{ all -> 0x0097 }
            goto L_0x0010
        L_0x008c:
            r3.closeEntry()     // Catch:{ all -> 0x0097 }
            r3.close()     // Catch:{ all -> 0x0097 }
            r3.close()     // Catch:{ IOException -> 0x00a4 }
            r1 = 0
            goto L_0x00a8
        L_0x0097:
            r7 = move-exception
            goto L_0x009b
        L_0x0099:
            r7 = move-exception
            r3 = 0
        L_0x009b:
            r7.printStackTrace()     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x00a8
            r3.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00a8:
            return r1
        L_0x00a9:
            r7 = move-exception
            if (r3 == 0) goto L_0x00b4
            r3.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00b4:
            goto L_0x00b6
        L_0x00b5:
            throw r7
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.f.j.a(java.lang.String, java.io.File):int");
    }

    public static File a(File file, ZipEntry zipEntry) {
        File file2;
        try {
            file2 = new File(file, zipEntry.getName());
            try {
                String canonicalPath = file.getCanonicalPath();
                if (file2.getCanonicalPath().startsWith(canonicalPath + File.separator)) {
                    return file2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Entry is outside of the target dir: ");
                sb.append(zipEntry.getName());
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
                return file2;
            }
        } catch (Throwable th2) {
            th = th2;
            file2 = null;
            th.printStackTrace();
            return file2;
        }
    }
}
