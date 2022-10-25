package m.a.a.a.a.b;

import com.tencent.beacon.pack.AbstractJceStruct;
import g.a.a.a.a;
import java.io.Serializable;

public final class k0 implements Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private final int value;

    public k0(int i2) {
        this.value = i2;
    }

    public k0(byte[] bArr, int i2) {
        this.value = d(bArr, i2);
    }

    public static byte[] b(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 & 65280) >> 8)};
    }

    public static int d(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] << 8) & AbstractJceStruct.BYTE) + (bArr[i2] & 255);
    }

    public byte[] a() {
        int i2 = this.value;
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 & 65280) >> 8)};
    }

    public int c() {
        return this.value;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof k0) && this.value == ((k0) obj).value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        StringBuilder i2 = a.i("ZipShort value: ");
        i2.append(this.value);
        return i2.toString();
    }
}
