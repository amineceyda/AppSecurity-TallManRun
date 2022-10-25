package m.a.b.a.a.a.b;

import g.a.a.a.a;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.zip.ZipException;

public class z implements g0, Cloneable, Serializable {
    public static final k0 b = new k0(30837);
    public static final k0 c = new k0(0);

    /* renamed from: d  reason: collision with root package name */
    public static final BigInteger f5224d = BigInteger.valueOf(1000);
    private static final long serialVersionUID = 1;
    private BigInteger gid;
    private BigInteger uid;
    private int version = 1;

    public z() {
        BigInteger bigInteger = f5224d;
        this.uid = bigInteger;
        this.gid = bigInteger;
    }

    public static byte[] i(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length && bArr[i2] == 0) {
            i3++;
            i2++;
        }
        int max = Math.max(1, bArr.length - i3);
        byte[] bArr2 = new byte[max];
        int length2 = max - (bArr.length - i3);
        System.arraycopy(bArr, i3, bArr2, length2, max - length2);
        return bArr2;
    }

    public k0 a() {
        return b;
    }

    public k0 b() {
        return new k0(i(this.uid.toByteArray()).length + 3 + i(this.gid.toByteArray()).length);
    }

    public byte[] c() {
        return new byte[0];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public k0 d() {
        return c;
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.version == zVar.version && this.uid.equals(zVar.uid) && this.gid.equals(zVar.gid);
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        BigInteger bigInteger = f5224d;
        this.uid = bigInteger;
        this.gid = bigInteger;
        int i4 = i2 + 1;
        this.version = l0.d(bArr[i2]);
        int i5 = i4 + 1;
        int d2 = l0.d(bArr[i4]);
        byte[] bArr2 = new byte[d2];
        System.arraycopy(bArr, i5, bArr2, 0, d2);
        int i6 = i5 + d2;
        l0.c(bArr2);
        this.uid = new BigInteger(1, bArr2);
        int i7 = i6 + 1;
        int d3 = l0.d(bArr[i6]);
        byte[] bArr3 = new byte[d3];
        System.arraycopy(bArr, i7, bArr3, 0, d3);
        l0.c(bArr3);
        this.gid = new BigInteger(1, bArr3);
    }

    public byte[] h() {
        byte[] byteArray = this.uid.toByteArray();
        byte[] byteArray2 = this.gid.toByteArray();
        byte[] i2 = i(byteArray);
        byte[] i3 = i(byteArray2);
        byte[] bArr = new byte[(i2.length + 3 + i3.length)];
        l0.c(i2);
        l0.c(i3);
        bArr[0] = l0.e(this.version);
        bArr[1] = l0.e(i2.length);
        System.arraycopy(i2, 0, bArr, 2, i2.length);
        int length = 2 + i2.length;
        bArr[length] = l0.e(i3.length);
        System.arraycopy(i3, 0, bArr, length + 1, i3.length);
        return bArr;
    }

    public int hashCode() {
        return ((this.version * -1234567) ^ Integer.rotateLeft(this.uid.hashCode(), 16)) ^ this.gid.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("0x7875 Zip Extra Field: UID=");
        i2.append(this.uid);
        i2.append(" GID=");
        i2.append(this.gid);
        return i2.toString();
    }
}
