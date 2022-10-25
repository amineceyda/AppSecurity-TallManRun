package g.e.a.b.e.c;

public final class p6 extends r6 {
    private final int zzc;

    public p6(byte[] bArr, int i2) {
        super(bArr);
        s6.w(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte c(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.zza[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final byte e(int i2) {
        return this.zza[i2];
    }

    public final int h() {
        return this.zzc;
    }

    public final int z() {
        return 0;
    }
}
