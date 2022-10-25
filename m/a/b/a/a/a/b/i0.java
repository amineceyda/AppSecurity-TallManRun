package m.a.b.a.a.a.b;

import g.a.a.a.a;
import java.io.Serializable;

public final class i0 implements Cloneable, Serializable {
    public static final i0 b = new i0(33639248);
    public static final i0 c = new i0(67324752);

    /* renamed from: d  reason: collision with root package name */
    public static final i0 f5167d = new i0(134695760);
    private static final long serialVersionUID = 1;
    private final long value;

    public i0(long j2) {
        this.value = j2;
    }

    public i0(byte[] bArr, int i2) {
        this.value = e(bArr, i2);
    }

    public static byte[] b(long j2) {
        return new byte[]{(byte) ((int) (255 & j2)), (byte) ((int) ((65280 & j2) >> 8)), (byte) ((int) ((16711680 & j2) >> 16)), (byte) ((int) ((j2 & 4278190080L) >> 24))};
    }

    public static long d(byte[] bArr) {
        return e(bArr, 0);
    }

    public static long e(byte[] bArr, int i2) {
        return (((long) (bArr[i2 + 3] << 24)) & 4278190080L) + ((long) ((bArr[i2 + 2] << 16) & 16711680)) + ((long) ((bArr[i2 + 1] << 8) & 65280)) + ((long) (bArr[i2] & 255));
    }

    public byte[] a() {
        return b(this.value);
    }

    public long c() {
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
        return obj != null && (obj instanceof i0) && this.value == ((i0) obj).value;
    }

    public int hashCode() {
        return (int) this.value;
    }

    public String toString() {
        StringBuilder i2 = a.i("ZipLong value: ");
        i2.append(this.value);
        return i2.toString();
    }
}
