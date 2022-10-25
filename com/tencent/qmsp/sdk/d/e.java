package com.tencent.qmsp.sdk.d;

import android.util.Base64;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.qmsp.sdk.f.h;
import java.io.DataInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

public class e {
    private static final byte[] a = {8, 89, -108, 70, 3, 26, 39, -38, 6, 67, -94, 103, 29, 18, 117, -82, 1, 65, -106, 98, 15, 10, 66, -36, 4, 36, -108, 110, 15, 31, 84, -33, 44, 65, -104, 98, 41, 10, 83, -48, 63, 32, -108, 73, 5, 42, 66, -52, 43, 96, -67, 83, AbstractJceStruct.SIMPLE_LIST, 51, 34, -18, 52, 73, -65, 118, 10, 54, 92, -12, 116, 105, -71, 105, AbstractJceStruct.SIMPLE_LIST, 21, 124, -10, 3, 114, -87, 97, 43, 15, 118, -54, 35, 63, -93, 101, 0, 48, 66, -55, 17, 33, -22, 108, AbstractJceStruct.STRUCT_END, 99, 81, -54, 43, 36, -21, 99, 120, 104, 66, -46, 6, 88, -126, 85, 27, 61, 33, -86, 52, 105, -76, 99, 8, 14, 86, -19, 18, 37, -8, 18, 126, AbstractJceStruct.ZERO_TAG, 83, -88, 22, 113, -80, 98, 40, 63, 109, -16, 48, 118, -68, 72, 45, 24, 86, -25, 35, 88, -28, 106, 123, 33, 114, -45, 117, 81, -94, 111, 3, 60, 120, -86, 110, 123, -28, 105, 101, 52, 94, -19, 31, 97, -67, 104, 3, 41, 117, -84, 51, 82, -65, 86, 6, 57, 60, -86, 124, 115, -89, 23, 30, AbstractJceStruct.STRUCT_END, 60, -39, 52, 67, -125, 66, 36, 41, 60, -7, 20, 69, -80, 111, 120, 41, 89, -10, 47, 103, -102, 100, 15, 10, 86, -33};
    private static final byte[] b = {8, 84, -26, 87, 39, 47, Byte.MAX_VALUE, -49, 22, 81};
    private static final byte[] c = {23, 67, -110};

    public static class b {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f876d;

        private b() {
        }
    }

    public static b a(DataInputStream dataInputStream) {
        b bVar = new b();
        try {
            bVar.a = dataInputStream.readInt();
            bVar.b = dataInputStream.readInt();
            int readInt = dataInputStream.readInt();
            bVar.c = readInt;
            if (readInt > 0) {
                if (readInt <= 256) {
                    byte[] bArr = new byte[readInt];
                    bVar.f876d = bArr;
                    dataInputStream.read(bArr);
                    return bVar;
                }
            }
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static PublicKey a(String str) {
        if (str == null) {
            str = h.a(a);
        }
        try {
            return KeyFactory.getInstance(h.a(c)).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static boolean a(DataInputStream dataInputStream, int i2, byte[] bArr, PublicKey publicKey) {
        try {
            Signature instance = Signature.getInstance(h.a(b));
            instance.initVerify(publicKey);
            byte[] bArr2 = new byte[8192];
            while (true) {
                int read = i2 < 8192 ? dataInputStream.read(bArr2, 0, i2) : dataInputStream.read(bArr2);
                if (read == 0) {
                    break;
                } else if (read == -1) {
                    break;
                } else {
                    instance.update(bArr2, 0, read);
                    i2 -= read;
                }
            }
            return instance.verify(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) {
        try {
            Signature instance = Signature.getInstance(h.a(b));
            instance.initVerify(publicKey);
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0083, code lost:
        if (r0 != null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0092 A[SYNTHETIC, Splitter:B:67:0x0092] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.io.File r5, java.lang.String r6) {
        /*
            boolean r0 = r5.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r2.<init>(r5)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r5 = r0.available()     // Catch:{ IOException -> 0x007a }
            r2 = 8
            if (r5 < r2) goto L_0x0071
            r3 = 5242880(0x500000, float:7.34684E-39)
            if (r5 <= r3) goto L_0x001f
            goto L_0x0071
        L_0x001f:
            int r3 = r0.readInt()     // Catch:{ IOException -> 0x007a }
            r4 = 1364419939(0x51536563, float:5.6746193E10)
            if (r3 == r4) goto L_0x0031
            r0.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0030:
            return r1
        L_0x0031:
            int r3 = r0.readInt()     // Catch:{ IOException -> 0x007a }
            if (r3 <= 0) goto L_0x0068
            r4 = 256(0x100, float:3.59E-43)
            if (r3 > r4) goto L_0x0068
            int r5 = r5 - r2
            if (r3 < r5) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            java.security.PublicKey r6 = a((java.lang.String) r6)     // Catch:{ IOException -> 0x007a }
            if (r6 != 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r5 = move-exception
            r5.printStackTrace()
        L_0x004d:
            return r1
        L_0x004e:
            byte[] r2 = new byte[r3]     // Catch:{ IOException -> 0x007a }
            int r5 = r5 - r3
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x007a }
            r0.read(r2)     // Catch:{ IOException -> 0x007a }
            r0.read(r5)     // Catch:{ IOException -> 0x007a }
            boolean r6 = a(r5, r2, r6)     // Catch:{ IOException -> 0x007a }
            if (r6 == 0) goto L_0x0085
            r0.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0067:
            return r5
        L_0x0068:
            r0.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0070:
            return r1
        L_0x0071:
            r0.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0079:
            return r1
        L_0x007a:
            r5 = move-exception
            goto L_0x0080
        L_0x007c:
            r5 = move-exception
            goto L_0x0090
        L_0x007e:
            r5 = move-exception
            r0 = r1
        L_0x0080:
            r5.printStackTrace()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008d
        L_0x0085:
            r0.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r5 = move-exception
            r5.printStackTrace()
        L_0x008d:
            return r1
        L_0x008e:
            r5 = move-exception
            r1 = r0
        L_0x0090:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r6 = move-exception
            r6.printStackTrace()
        L_0x009a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.e.a(java.io.File, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x00ce A[SYNTHETIC, Splitter:B:103:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00aa A[SYNTHETIC, Splitter:B:83:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00b4 A[SYNTHETIC, Splitter:B:88:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00c4 A[SYNTHETIC, Splitter:B:98:0x00c4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.io.File r7, java.lang.String r8) {
        /*
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            r3.<init>(r7)     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00a3, all -> 0x00a0 }
            int r3 = r2.available()     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r4 = 140(0x8c, float:1.96E-43)
            if (r3 > r4) goto L_0x0024
            r2.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0023:
            return r1
        L_0x0024:
            int r3 = r3 - r4
            r2.skipBytes(r3)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            com.tencent.qmsp.sdk.d.e$b r4 = a((java.io.DataInputStream) r2)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            if (r4 != 0) goto L_0x0037
            r2.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0036:
            return r1
        L_0x0037:
            int r5 = r4.a     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r6 = 1364419939(0x51536563, float:5.6746193E10)
            if (r5 == r6) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0046:
            return r1
        L_0x0047:
            int r5 = r4.b     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            if (r5 <= 0) goto L_0x0091
            r6 = 5242880(0x500000, float:7.34684E-39)
            if (r5 <= r6) goto L_0x0050
            goto L_0x0091
        L_0x0050:
            if (r3 == r5) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005a:
            return r1
        L_0x005b:
            java.security.PublicKey r8 = a((java.lang.String) r8)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            if (r8 != 0) goto L_0x006a
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0069:
            return r1
        L_0x006a:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r5.<init>(r7)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            r3.<init>(r5)     // Catch:{ IOException -> 0x009c, all -> 0x009a }
            int r7 = r4.b     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            byte[] r0 = r4.f876d     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            boolean r7 = a(r3, r7, r0, r8)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            r2.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0084:
            r3.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r8 = move-exception
            r8.printStackTrace()
        L_0x008c:
            return r7
        L_0x008d:
            r7 = move-exception
            goto L_0x00bf
        L_0x008f:
            r7 = move-exception
            goto L_0x009e
        L_0x0091:
            r2.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0099:
            return r1
        L_0x009a:
            r7 = move-exception
            goto L_0x00c0
        L_0x009c:
            r7 = move-exception
            r3 = r0
        L_0x009e:
            r0 = r2
            goto L_0x00a5
        L_0x00a0:
            r7 = move-exception
            r8 = r0
            goto L_0x00c2
        L_0x00a3:
            r7 = move-exception
            r3 = r0
        L_0x00a5:
            r7.printStackTrace()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b2
            r0.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00b2:
            if (r3 == 0) goto L_0x00bc
            r3.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00bc:
            return r1
        L_0x00bd:
            r7 = move-exception
            r2 = r0
        L_0x00bf:
            r0 = r3
        L_0x00c0:
            r8 = r0
            r0 = r2
        L_0x00c2:
            if (r0 == 0) goto L_0x00cc
            r0.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00cc
        L_0x00c8:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00cc:
            if (r8 == 0) goto L_0x00d6
            r8.close()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00d6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.e.b(java.io.File, java.lang.String):boolean");
    }
}
