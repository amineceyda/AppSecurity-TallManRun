package com.tencent.qmsp.sdk.d;

public class a {
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006f, code lost:
        if (r2 != null) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059 A[Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x0062, IOException -> 0x005a, all -> 0x0052, all -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061 A[Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x0062, IOException -> 0x005a, all -> 0x0052, all -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0069 A[Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x0062, IOException -> 0x005a, all -> 0x0052, all -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r9) {
        /*
            java.lang.String r0 = "MD5"
            r1 = 0
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x0062, IOException -> 0x005a, all -> 0x0052 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x0062, IOException -> 0x005a, all -> 0x0052 }
            r2.<init>(r9)     // Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x0062, IOException -> 0x005a, all -> 0x0052 }
            java.io.File r3 = new java.io.File     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            r3.<init>(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            long r3 = r3.length()     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            r5 = 10002432(0x98a000, double:4.941858E-317)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x001d
            r3 = r5
        L_0x001d:
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
        L_0x0021:
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
            int r5 = r2.read(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            r6 = -1
            if (r5 == r6) goto L_0x003b
            long r6 = (long) r5     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0034
            int r5 = (int) r3     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
        L_0x0034:
            long r6 = (long) r5     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            long r3 = r3 - r6
            r6 = 0
            r0.update(r9, r6, r5)     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            goto L_0x0021
        L_0x003b:
            r2.close()     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            byte[] r9 = r0.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            java.lang.String r9 = com.tencent.qmsp.sdk.f.e.a(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0050, FileNotFoundException -> 0x004e, IOException -> 0x004c, all -> 0x004a }
            r2.close()     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            return r9
        L_0x004a:
            r9 = move-exception
            goto L_0x0054
        L_0x004c:
            r9 = move-exception
            goto L_0x005c
        L_0x004e:
            r9 = move-exception
            goto L_0x0064
        L_0x0050:
            r9 = move-exception
            goto L_0x006c
        L_0x0052:
            r9 = move-exception
            r2 = r1
        L_0x0054:
            r9.printStackTrace()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0074
            goto L_0x0071
        L_0x005a:
            r9 = move-exception
            r2 = r1
        L_0x005c:
            r9.printStackTrace()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0074
            goto L_0x0071
        L_0x0062:
            r9 = move-exception
            r2 = r1
        L_0x0064:
            r9.printStackTrace()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0074
            goto L_0x0071
        L_0x006a:
            r9 = move-exception
            r2 = r1
        L_0x006c:
            r9.printStackTrace()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0074
        L_0x0071:
            r2.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            return r1
        L_0x0075:
            r9 = move-exception
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            goto L_0x007d
        L_0x007c:
            throw r9
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.a.a(java.lang.String):java.lang.String");
    }
}
