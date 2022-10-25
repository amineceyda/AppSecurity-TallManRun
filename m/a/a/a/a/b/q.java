package m.a.a.a.a.b;

public class q implements g0 {
    public k0 b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5072d;

    public k0 a() {
        return this.b;
    }

    public k0 b() {
        byte[] bArr = this.c;
        return new k0(bArr != null ? bArr.length : 0);
    }

    public byte[] c() {
        byte[] bArr = this.f5072d;
        return bArr != null ? l0.a(bArr) : h();
    }

    public k0 d() {
        byte[] bArr = this.f5072d;
        return bArr != null ? new k0(bArr.length) : b();
    }

    public void e(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f5072d = l0.a(bArr2);
        if (this.c == null) {
            this.c = l0.a(bArr2);
        }
    }

    public void g(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.c = l0.a(bArr2);
    }

    public byte[] h() {
        return l0.a(this.c);
    }
}
