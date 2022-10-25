package com.tencent.qmsp.sdk.c;

import com.tencent.qmsp.sdk.f.h;

public class m {
    private static final byte[] a = {96, 110, -109, 82, 109, 2, 36, -77, 108, 59, -80, 10, 112, 122, 56, -67};

    public String a(byte[] bArr) {
        return h.a(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b A[SYNTHETIC, Splitter:B:25:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056 A[SYNTHETIC, Splitter:B:31:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r4, byte[] r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L_0x000a
            byte[] r6 = a     // Catch:{ IOException -> 0x0045 }
            java.lang.String r6 = r3.a(r6)     // Catch:{ IOException -> 0x0045 }
        L_0x000a:
            com.tencent.qmsp.sdk.f.b r2 = new com.tencent.qmsp.sdk.f.b     // Catch:{ IOException -> 0x0045 }
            r2.<init>()     // Catch:{ IOException -> 0x0045 }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x0045 }
            byte[] r5 = r2.a(r5, r6)     // Catch:{ IOException -> 0x0045 }
            if (r5 != 0) goto L_0x001a
            return r0
        L_0x001a:
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0045 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0045 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0045 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x0045 }
            r4 = 305419896(0x12345678, float:5.6904566E-28)
            r6.writeInt(r4)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r6.writeInt(r7)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r4 = 1
            r6.writeInt(r4)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r6.write(r5)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r6.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r5 = move-exception
            r5.printStackTrace()
        L_0x003c:
            return r4
        L_0x003d:
            r4 = move-exception
            r1 = r6
            goto L_0x0054
        L_0x0040:
            r4 = move-exception
            r1 = r6
            goto L_0x0046
        L_0x0043:
            r4 = move-exception
            goto L_0x0054
        L_0x0045:
            r4 = move-exception
        L_0x0046:
            r4.printStackTrace()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0053:
            return r0
        L_0x0054:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            r5.printStackTrace()
        L_0x005e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.m.a(java.lang.String, byte[], java.lang.String, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ab A[SYNTHETIC, Splitter:B:73:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00b9 A[SYNTHETIC, Splitter:B:81:0x00b9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.exists()
            r1 = 0
            if (r6 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x00a3, all -> 0x00a1 }
            int r0 = r6.available()     // Catch:{ IOException -> 0x009f }
            r2 = 12
            if (r0 <= r2) goto L_0x0096
            r3 = 102400(0x19000, float:1.43493E-40)
            if (r0 <= r3) goto L_0x0026
            goto L_0x0096
        L_0x0026:
            int r3 = r6.readInt()     // Catch:{ IOException -> 0x009f }
            r4 = 305419896(0x12345678, float:5.6904566E-28)
            if (r3 == r4) goto L_0x0038
            r6.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0037:
            return r1
        L_0x0038:
            int r3 = r6.readInt()     // Catch:{ IOException -> 0x009f }
            if (r3 <= 0) goto L_0x008d
            if (r3 <= r8) goto L_0x0041
            goto L_0x008d
        L_0x0041:
            int r8 = r6.readInt()     // Catch:{ IOException -> 0x009f }
            r3 = 1
            if (r8 == r3) goto L_0x0051
            r6.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0050:
            return r1
        L_0x0051:
            int r0 = r0 - r2
            byte[] r8 = new byte[r0]     // Catch:{ IOException -> 0x009f }
            int r2 = r6.read(r8)     // Catch:{ IOException -> 0x009f }
            if (r0 == r2) goto L_0x0063
            r6.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0062:
            return r1
        L_0x0063:
            if (r7 != 0) goto L_0x006b
            byte[] r7 = a     // Catch:{ IOException -> 0x009f }
            java.lang.String r7 = r5.a(r7)     // Catch:{ IOException -> 0x009f }
        L_0x006b:
            com.tencent.qmsp.sdk.f.b r2 = new com.tencent.qmsp.sdk.f.b     // Catch:{ IOException -> 0x009f }
            r2.<init>()     // Catch:{ IOException -> 0x009f }
            r3 = 0
            byte[] r7 = r7.getBytes()     // Catch:{ IOException -> 0x009f }
            byte[] r7 = r2.a(r8, r3, r0, r7)     // Catch:{ IOException -> 0x009f }
            if (r7 != 0) goto L_0x0084
            r6.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0083:
            return r1
        L_0x0084:
            r6.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008c:
            return r7
        L_0x008d:
            r6.close()     // Catch:{ IOException -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0095:
            return r1
        L_0x0096:
            r6.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x009e:
            return r1
        L_0x009f:
            r7 = move-exception
            goto L_0x00a6
        L_0x00a1:
            r6 = move-exception
            goto L_0x00b7
        L_0x00a3:
            r6 = move-exception
            r7 = r6
            r6 = r1
        L_0x00a6:
            r7.printStackTrace()     // Catch:{ all -> 0x00b4 }
            if (r6 == 0) goto L_0x00b3
            r6.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r6 = move-exception
            r6.printStackTrace()
        L_0x00b3:
            return r1
        L_0x00b4:
            r7 = move-exception
            r1 = r6
            r6 = r7
        L_0x00b7:
            if (r1 == 0) goto L_0x00c1
            r1.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00c1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.m.a(java.lang.String, java.lang.String, int):byte[]");
    }
}
