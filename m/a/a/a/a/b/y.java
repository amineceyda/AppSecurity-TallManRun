package m.a.a.a.a.b;

import g.a.a.a.a;
import java.io.Serializable;
import java.util.Date;
import java.util.zip.ZipException;

public class y implements g0, Cloneable, Serializable {
    public static final k0 b = new k0(21589);
    private static final long serialVersionUID = 1;
    private i0 accessTime;
    private boolean bit0_modifyTimePresent;
    private boolean bit1_accessTimePresent;
    private boolean bit2_createTimePresent;
    private i0 createTime;
    private byte flags;
    private i0 modifyTime;

    public k0 a() {
        return b;
    }

    public k0 b() {
        int i2 = 4;
        int i3 = (this.bit0_modifyTimePresent ? 4 : 0) + 1 + ((!this.bit1_accessTimePresent || this.accessTime == null) ? 0 : 4);
        if (!this.bit2_createTimePresent || this.createTime == null) {
            i2 = 0;
        }
        return new k0(i3 + i2);
    }

    public byte[] c() {
        int c = d().c();
        byte[] bArr = new byte[c];
        System.arraycopy(h(), 0, bArr, 0, c);
        return bArr;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public k0 d() {
        return new k0((this.bit0_modifyTimePresent ? 4 : 0) + 1);
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
        i((byte) 0);
        this.modifyTime = null;
        this.accessTime = null;
        this.createTime = null;
        g(bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if ((this.flags & 7) != (yVar.flags & 7)) {
            return false;
        }
        i0 i0Var = this.modifyTime;
        i0 i0Var2 = yVar.modifyTime;
        if (i0Var != i0Var2 && (i0Var == null || !i0Var.equals(i0Var2))) {
            return false;
        }
        i0 i0Var3 = this.accessTime;
        i0 i0Var4 = yVar.accessTime;
        if (i0Var3 != i0Var4 && (i0Var3 == null || !i0Var3.equals(i0Var4))) {
            return false;
        }
        i0 i0Var5 = this.createTime;
        i0 i0Var6 = yVar.createTime;
        return i0Var5 == i0Var6 || (i0Var5 != null && i0Var5.equals(i0Var6));
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        int i4;
        i((byte) 0);
        this.modifyTime = null;
        this.accessTime = null;
        this.createTime = null;
        int i5 = i3 + i2;
        int i6 = i2 + 1;
        i(bArr[i2]);
        if (this.bit0_modifyTimePresent) {
            this.modifyTime = new i0(bArr, i6);
            i6 += 4;
        }
        if (this.bit1_accessTimePresent && (i4 = i6 + 4) <= i5) {
            this.accessTime = new i0(bArr, i6);
            i6 = i4;
        }
        if (this.bit2_createTimePresent && i6 + 4 <= i5) {
            this.createTime = new i0(bArr, i6);
        }
    }

    public byte[] h() {
        i0 i0Var;
        i0 i0Var2;
        byte[] bArr = new byte[b().c()];
        bArr[0] = 0;
        int i2 = 1;
        if (this.bit0_modifyTimePresent) {
            bArr[0] = (byte) (bArr[0] | 1);
            System.arraycopy(this.modifyTime.a(), 0, bArr, 1, 4);
            i2 = 5;
        }
        if (this.bit1_accessTimePresent && (i0Var2 = this.accessTime) != null) {
            bArr[0] = (byte) (bArr[0] | 2);
            System.arraycopy(i0Var2.a(), 0, bArr, i2, 4);
            i2 += 4;
        }
        if (this.bit2_createTimePresent && (i0Var = this.createTime) != null) {
            bArr[0] = (byte) (bArr[0] | 4);
            System.arraycopy(i0Var.a(), 0, bArr, i2, 4);
        }
        return bArr;
    }

    public int hashCode() {
        int i2 = (this.flags & 7) * -123;
        i0 i0Var = this.modifyTime;
        if (i0Var != null) {
            i2 ^= i0Var.hashCode();
        }
        i0 i0Var2 = this.accessTime;
        if (i0Var2 != null) {
            i2 ^= Integer.rotateLeft(i0Var2.hashCode(), 11);
        }
        i0 i0Var3 = this.createTime;
        return i0Var3 != null ? i2 ^ Integer.rotateLeft(i0Var3.hashCode(), 22) : i2;
    }

    public void i(byte b2) {
        this.flags = b2;
        boolean z = false;
        this.bit0_modifyTimePresent = (b2 & 1) == 1;
        this.bit1_accessTimePresent = (b2 & 2) == 2;
        if ((b2 & 4) == 4) {
            z = true;
        }
        this.bit2_createTimePresent = z;
    }

    public String toString() {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        StringBuilder i2 = a.i("0x5455 Zip Extra Field: Flags=");
        i2.append(Integer.toBinaryString(l0.e(this.flags)));
        i2.append(" ");
        Date date = null;
        if (this.bit0_modifyTimePresent && (i0Var3 = this.modifyTime) != null) {
            Date date2 = i0Var3 != null ? new Date(this.modifyTime.c() * 1000) : null;
            i2.append(" Modify:[");
            i2.append(date2);
            i2.append("] ");
        }
        if (this.bit1_accessTimePresent && (i0Var2 = this.accessTime) != null) {
            Date date3 = i0Var2 != null ? new Date(this.accessTime.c() * 1000) : null;
            i2.append(" Access:[");
            i2.append(date3);
            i2.append("] ");
        }
        if (this.bit2_createTimePresent && (i0Var = this.createTime) != null) {
            if (i0Var != null) {
                date = new Date(this.createTime.c() * 1000);
            }
            i2.append(" Create:[");
            i2.append(date);
            i2.append("] ");
        }
        return i2.toString();
    }
}
