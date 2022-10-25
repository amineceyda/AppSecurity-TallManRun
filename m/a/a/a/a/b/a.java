package m.a.a.a.a.b;

import java.util.zip.ZipException;

public abstract class a implements g0 {
    public long b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4991d;

    public k0 b() {
        return d();
    }

    public byte[] c() {
        if (this.f4991d == null) {
            f();
        }
        byte[] bArr = this.f4991d;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public k0 d() {
        if (this.f4991d == null) {
            f();
        }
        byte[] bArr = this.f4991d;
        return new k0(bArr != null ? bArr.length : 0);
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
        g(bArr, i2, i3);
    }

    public final void f() {
        byte[] bArr = this.c;
        if (bArr != null) {
            byte[] bArr2 = new byte[(bArr.length + 5)];
            this.f4991d = bArr2;
            bArr2[0] = 1;
            System.arraycopy(i0.b(this.b), 0, this.f4991d, 1, 4);
            byte[] bArr3 = this.c;
            System.arraycopy(bArr3, 0, this.f4991d, 5, bArr3.length);
        }
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        if (i3 >= 5) {
            byte b2 = bArr[i2];
            if (b2 == 1) {
                this.b = i0.e(bArr, i2 + 1);
                int i4 = i3 - 5;
                byte[] bArr2 = new byte[i4];
                this.c = bArr2;
                System.arraycopy(bArr, i2 + 5, bArr2, 0, i4);
                this.f4991d = null;
                return;
            }
            throw new ZipException(g.a.a.a.a.r("Unsupported version [", b2, "] for UniCode path extra data."));
        }
        throw new ZipException("UniCode path extra data must have at least 5 bytes.");
    }

    public byte[] h() {
        return c();
    }
}
