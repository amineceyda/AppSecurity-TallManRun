package m.a.a.a.a.b;

public final class p implements g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f5071d = new k0(44225);
    public byte[] b;
    public byte[] c;

    public k0 a() {
        return f5071d;
    }

    public k0 b() {
        byte[] bArr = this.b;
        return new k0(bArr == null ? 0 : bArr.length);
    }

    public byte[] c() {
        byte[] bArr = this.c;
        return bArr == null ? h() : l0.a(bArr);
    }

    public k0 d() {
        byte[] bArr = this.c;
        return bArr == null ? b() : new k0(bArr.length);
    }

    public void e(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.c = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        if (this.b == null) {
            g(bArr, i2, i3);
        }
    }

    public void g(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.b = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
    }

    public byte[] h() {
        return l0.a(this.b);
    }
}
