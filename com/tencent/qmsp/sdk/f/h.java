package com.tencent.qmsp.sdk.f;

import java.util.HashMap;

public class h {
    public static byte[] a = {6, 120, -74, 67, 37, 123, 99, -11, 32, 48, -93, 65, 60, 58, 122, -8, 49, 117, -95, 83, 111};

    static {
        new HashMap();
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = {69, 16, -45, 32, 78, 91, 23, -99, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 8]);
        }
        return new String(bArr3);
    }
}
