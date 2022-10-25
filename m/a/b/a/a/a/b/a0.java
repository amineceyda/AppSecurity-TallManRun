package m.a.b.a.a.a.b;

import java.util.zip.ZipException;

public class a0 implements g0 {

    /* renamed from: g  reason: collision with root package name */
    public static final k0 f5120g = new k0(1);

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f5121h = new byte[0];
    public d0 b;
    public d0 c;

    /* renamed from: d  reason: collision with root package name */
    public d0 f5122d;

    /* renamed from: e  reason: collision with root package name */
    public i0 f5123e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5124f;

    public k0 a() {
        return f5120g;
    }

    public k0 b() {
        return new k0(this.b != null ? 16 : 0);
    }

    public byte[] c() {
        byte[] bArr = new byte[d().c()];
        int f2 = f(bArr);
        d0 d0Var = this.f5122d;
        if (d0Var != null) {
            System.arraycopy(d0Var.a(), 0, bArr, f2, 8);
            f2 += 8;
        }
        i0 i0Var = this.f5123e;
        if (i0Var != null) {
            System.arraycopy(i0Var.a(), 0, bArr, f2, 4);
        }
        return bArr;
    }

    public k0 d() {
        int i2 = 8;
        int i3 = 0;
        int i4 = (this.b != null ? 8 : 0) + (this.c != null ? 8 : 0);
        if (this.f5122d == null) {
            i2 = 0;
        }
        int i5 = i4 + i2;
        if (this.f5123e != null) {
            i3 = 4;
        }
        return new k0(i5 + i3);
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
        byte[] bArr2 = new byte[i3];
        this.f5124f = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        if (i3 >= 28) {
            g(bArr, i2, i3);
        } else if (i3 == 24) {
            this.b = new d0(bArr, i2);
            int i4 = i2 + 8;
            this.c = new d0(bArr, i4);
            this.f5122d = new d0(bArr, i4 + 8);
        } else if (i3 % 8 == 4) {
            this.f5123e = new i0(bArr, (i2 + i3) - 4);
        }
    }

    public final int f(byte[] bArr) {
        int i2;
        d0 d0Var = this.b;
        if (d0Var != null) {
            System.arraycopy(d0Var.a(), 0, bArr, 0, 8);
            i2 = 8;
        } else {
            i2 = 0;
        }
        d0 d0Var2 = this.c;
        if (d0Var2 == null) {
            return i2;
        }
        System.arraycopy(d0Var2.a(), 0, bArr, i2, 8);
        return i2 + 8;
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        if (i3 != 0) {
            if (i3 >= 16) {
                this.b = new d0(bArr, i2);
                int i4 = i2 + 8;
                this.c = new d0(bArr, i4);
                int i5 = i4 + 8;
                int i6 = i3 - 16;
                if (i6 >= 8) {
                    this.f5122d = new d0(bArr, i5);
                    i5 += 8;
                    i6 -= 8;
                }
                if (i6 >= 4) {
                    this.f5123e = new i0(bArr, i5);
                    return;
                }
                return;
            }
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
    }

    public byte[] h() {
        d0 d0Var = this.b;
        if (d0Var == null && this.c == null) {
            return f5121h;
        }
        if (d0Var == null || this.c == null) {
            throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
        }
        byte[] bArr = new byte[16];
        f(bArr);
        return bArr;
    }
}
