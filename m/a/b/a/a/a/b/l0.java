package m.a.b.a.a.a.b;

import com.tencent.beacon.pack.AbstractJceStruct;
import g.a.a.a.a;
import java.io.IOException;
import java.util.zip.CRC32;

public abstract class l0 {
    public static final /* synthetic */ int a = 0;

    static {
        i0.b(8448);
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static String b(a aVar, byte[] bArr) {
        byte[] bArr2;
        if (aVar != null) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (crc32.getValue() == aVar.b) {
                try {
                    e0 e0Var = f0.b;
                    byte[] bArr3 = aVar.c;
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        bArr2 = new byte[length];
                        System.arraycopy(bArr3, 0, bArr2, 0, length);
                    } else {
                        bArr2 = null;
                    }
                    return e0Var.a(bArr2);
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    public static byte[] c(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i2 = 0; i2 < bArr.length / 2; i2++) {
            byte b = bArr[i2];
            int i3 = length - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b;
        }
        return bArr;
    }

    public static int d(byte b) {
        return b >= 0 ? b : b + AbstractJceStruct.BYTE;
    }

    public static byte e(int i2) {
        if (i2 <= 255 && i2 >= 0) {
            return i2 < 128 ? (byte) i2 : (byte) (i2 - 256);
        }
        throw new IllegalArgumentException(a.r("Can only convert non-negative integers between [0,255] to byte: [", i2, "]"));
    }
}
