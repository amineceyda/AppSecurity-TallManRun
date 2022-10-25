package com.tencent.crabshell.common;

import android.util.Log;
import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m.b.a.a.b.f;

public class SHA1 {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String TAG = "SHA1";
    public static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-427172511801575452L, "com/tencent/crabshell/common/SHA1", 53);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[52] = true;
    }

    public SHA1() {
        $jacocoInit()[0] = true;
    }

    public static String bytesToHexString(byte[] bArr) {
        boolean[] $jacocoInit = $jacocoInit();
        if (bArr == null) {
            $jacocoInit[46] = true;
        } else if (bArr.length == 0) {
            $jacocoInit[47] = true;
        } else {
            char[] cArr = new char[(bArr.length * 2)];
            $jacocoInit[48] = true;
            int i2 = 0;
            int i3 = 0;
            while (i2 < bArr.length) {
                byte b = bArr[i2];
                int i4 = i3 + 1;
                char[] cArr2 = hexDigits;
                cArr[i3] = cArr2[(b >>> 4) & 15];
                i3 = i4 + 1;
                cArr[i4] = cArr2[b & 15];
                i2++;
                $jacocoInit[49] = true;
            }
            String str = new String(cArr);
            $jacocoInit[50] = true;
            return str;
        }
        $jacocoInit[51] = true;
        return "";
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileSHA1(java.io.File r8) {
        /*
            boolean[] r0 = $jacocoInit()
            r1 = 21
            r2 = 1
            r0[r1] = r2
            boolean r1 = r8.exists()
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0017
            r8 = 22
            r0[r8] = r2
            goto L_0x00bb
        L_0x0017:
            long r4 = r8.length()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0027
            r8 = 23
            r0[r8] = r2
            goto L_0x00bb
        L_0x0027:
            r1 = 0
            r4 = 24
            r0[r4] = r2     // Catch:{ FileNotFoundException -> 0x0084, OutOfMemoryError -> 0x0063 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0084, OutOfMemoryError -> 0x0063 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0084, OutOfMemoryError -> 0x0063 }
            r5.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0084, OutOfMemoryError -> 0x0063 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0084, OutOfMemoryError -> 0x0063 }
            r8 = 25
            r0[r8] = r2     // Catch:{ FileNotFoundException -> 0x005e, OutOfMemoryError -> 0x005b, all -> 0x0058 }
            java.lang.String r3 = getInputStreamSHA1(r4)     // Catch:{ FileNotFoundException -> 0x005e, OutOfMemoryError -> 0x005b, all -> 0x0058 }
            r8 = 26
            r0[r8] = r2     // Catch:{ OutOfMemoryError -> 0x005b, all -> 0x0058 }
            r4.close()     // Catch:{ Exception -> 0x004b }
            r8 = 27
            r0[r8] = r2
            goto L_0x00bb
        L_0x004b:
            r8 = move-exception
            r1 = 28
            r0[r1] = r2
            r8.printStackTrace()
            r8 = 29
            r0[r8] = r2
            goto L_0x00bb
        L_0x0058:
            r8 = move-exception
            r1 = r4
            goto L_0x00c0
        L_0x005b:
            r8 = move-exception
            r1 = r4
            goto L_0x0064
        L_0x005e:
            r8 = move-exception
            r1 = r4
            goto L_0x0085
        L_0x0061:
            r8 = move-exception
            goto L_0x00c0
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            r4 = 35
            r0[r4] = r2     // Catch:{ all -> 0x0061 }
            r8.printStackTrace()     // Catch:{ all -> 0x0061 }
            r8 = 36
            r0[r8] = r2     // Catch:{ Exception -> 0x0077 }
            r1.close()     // Catch:{  }
            r8 = 37
            r0[r8] = r2
            goto L_0x00bb
        L_0x0077:
            r8 = move-exception
            r1 = 38
            r0[r1] = r2
            r8.printStackTrace()
            r8 = 39
            r0[r8] = r2
            goto L_0x00bb
        L_0x0084:
            r8 = move-exception
        L_0x0085:
            r4 = 30
            r0[r4] = r2     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "SHA1"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "getFileSHA1 FileNotFoundException!"
            r5.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0061 }
            r5.append(r8)     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0061 }
            android.util.Log.e(r4, r8)     // Catch:{ all -> 0x0061 }
            r8 = 31
            r0[r8] = r2     // Catch:{ Exception -> 0x00af }
            r1.close()     // Catch:{  }
            r8 = 32
            r0[r8] = r2
            goto L_0x00bb
        L_0x00af:
            r8 = move-exception
            r1 = 33
            r0[r1] = r2
            r8.printStackTrace()
            r8 = 34
            r0[r8] = r2
        L_0x00bb:
            r8 = 45
            r0[r8] = r2
            return r3
        L_0x00c0:
            r3 = 40
            r0[r3] = r2     // Catch:{ Exception -> 0x00cc }
            r1.close()     // Catch:{  }
            r1 = 41
            r0[r1] = r2
            goto L_0x00d8
        L_0x00cc:
            r1 = move-exception
            r3 = 42
            r0[r3] = r2
            r1.printStackTrace()
            r1 = 43
            r0[r1] = r2
        L_0x00d8:
            r1 = 44
            r0[r1] = r2
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.crabshell.common.SHA1.getFileSHA1(java.io.File):java.lang.String");
    }

    public static String getInputStreamSHA1(InputStream inputStream) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[2048];
            $jacocoInit[8] = true;
            int i2 = 0;
            while (true) {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    break;
                } else if (read <= 0) {
                    $jacocoInit[9] = true;
                } else {
                    $jacocoInit[10] = true;
                    instance.update(bArr, 0, read);
                    i2 += read;
                    $jacocoInit[11] = true;
                }
            }
            if (i2 != 0) {
                $jacocoInit[12] = true;
                byte[] digest = instance.digest();
                $jacocoInit[14] = true;
                String bytesToHexString = bytesToHexString(digest);
                $jacocoInit[15] = true;
                return bytesToHexString;
            }
            $jacocoInit[13] = true;
            return "";
        } catch (NoSuchAlgorithmException e2) {
            $jacocoInit[16] = true;
            StringBuilder i3 = a.i("getInputStreamSHA1 NoSuchAlgorithmException!");
            i3.append(e2.getMessage());
            Log.e(TAG, i3.toString());
            $jacocoInit[17] = true;
            $jacocoInit[20] = true;
            return "";
        } catch (IOException e3) {
            $jacocoInit[18] = true;
            StringBuilder i4 = a.i("getInputStreamSHA1 IOException!");
            i4.append(e3.getMessage());
            Log.e(TAG, i4.toString());
            $jacocoInit[19] = true;
            $jacocoInit[20] = true;
            return "";
        }
    }

    public static String toSHA1(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        String bytesToHexString = bytesToHexString(toSHA1Byte(str));
        $jacocoInit[7] = true;
        return bytesToHexString;
    }

    public static byte[] toSHA1Byte(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            byte[] sHA1Byte = toSHA1Byte(str.getBytes(MeasureConst.CHARSET_UTF8));
            $jacocoInit[3] = true;
            return sHA1Byte;
        } catch (UnsupportedEncodingException unused) {
            $jacocoInit[1] = true;
            Log.e(TAG, "toSHA1Byte, source.getBytes crash!");
            $jacocoInit[2] = true;
            return null;
        }
    }

    public static byte[] toSHA1Byte(byte[] bArr) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(bArr);
            $jacocoInit[6] = true;
            return digest;
        } catch (Exception e2) {
            $jacocoInit[4] = true;
            StringBuilder i2 = a.i("toSHA1Byte exception:");
            i2.append(e2.getMessage());
            Log.e(TAG, i2.toString());
            $jacocoInit[5] = true;
            return null;
        }
    }
}
