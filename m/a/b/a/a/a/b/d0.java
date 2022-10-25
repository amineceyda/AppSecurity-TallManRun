package m.a.b.a.a.a.b;

import g.a.a.a.a;
import java.io.Serializable;
import java.math.BigInteger;

public final class d0 implements Serializable {
    public static final d0 b = new d0(0);
    private static final long serialVersionUID = 1;
    private final BigInteger value;

    public d0(long j2) {
        this.value = BigInteger.valueOf(j2);
    }

    public d0(byte[] bArr, int i2) {
        this.value = c(bArr, i2);
    }

    public static BigInteger c(byte[] bArr, int i2) {
        int i3 = i2 + 7;
        BigInteger valueOf = BigInteger.valueOf(((((long) bArr[i3]) << 56) & 9151314442816847872L) + ((((long) bArr[i2 + 6]) << 48) & 71776119061217280L) + ((((long) bArr[i2 + 5]) << 40) & 280375465082880L) + ((((long) bArr[i2 + 4]) << 32) & 1095216660480L) + ((((long) bArr[i2 + 3]) << 24) & 4278190080L) + ((((long) bArr[i2 + 2]) << 16) & 16711680) + ((((long) bArr[i2 + 1]) << 8) & 65280) + (((long) bArr[i2]) & 255));
        return (bArr[i3] & Byte.MIN_VALUE) == Byte.MIN_VALUE ? valueOf.setBit(63) : valueOf;
    }

    public byte[] a() {
        BigInteger bigInteger = this.value;
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) ((int) (255 & longValue)), (byte) ((int) ((65280 & longValue) >> 8)), (byte) ((int) ((16711680 & longValue) >> 16)), (byte) ((int) ((4278190080L & longValue) >> 24)), (byte) ((int) ((1095216660480L & longValue) >> 32)), (byte) ((int) ((280375465082880L & longValue) >> 40)), (byte) ((int) ((71776119061217280L & longValue) >> 48)), (byte) ((int) ((longValue & 9151314442816847872L) >> 56))};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    public long b() {
        return this.value.longValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        return this.value.equals(((d0) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("ZipEightByteInteger value: ");
        i2.append(this.value);
        return i2.toString();
    }
}
