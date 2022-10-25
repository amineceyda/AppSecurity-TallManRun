package com.tencent.qmsp.sdk.f;

import g.a.a.a.a;

public class e {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            char[] cArr = new char[(bArr.length * 2)];
            int i2 = 0;
            while (i2 < bArr.length) {
                try {
                    byte b = bArr[i2];
                    int i3 = i2 * 2;
                    char[] cArr2 = a;
                    cArr[i3 + 1] = cArr2[b & 15];
                    cArr[i3 + 0] = cArr2[((byte) (b >>> 4)) & 15];
                    i2++;
                } catch (Exception e2) {
                    StringBuilder i4 = a.i(" === bytes2HexStr error === ");
                    i4.append(e2.toString());
                    g.a("Qp.b2h", 1, i4.toString());
                }
            }
            return new String(cArr);
        }
        return null;
    }
}
