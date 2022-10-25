package m.a.a.a.a.b;

import g.a.a.a.a;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

public class b implements g0, Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final k0 f4997h = new k0(30062);
    public int b = 0;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4998d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f4999e = "";

    /* renamed from: f  reason: collision with root package name */
    public boolean f5000f = false;

    /* renamed from: g  reason: collision with root package name */
    public CRC32 f5001g = new CRC32();

    public k0 a() {
        return f4997h;
    }

    public k0 b() {
        return new k0(this.f4999e.getBytes().length + 14);
    }

    public byte[] c() {
        return h();
    }

    public Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f5001g = new CRC32();
            return bVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public k0 d() {
        return b();
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
        g(bArr, i2, i3);
    }

    public int f(int i2) {
        int i3;
        boolean z = false;
        if (this.f4999e.length() != 0) {
            i3 = 40960;
        } else {
            if (this.f5000f) {
                if (!(this.f4999e.length() != 0)) {
                    z = true;
                }
            }
            i3 = z ? 16384 : 32768;
        }
        return (i2 & 4095) | i3;
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        long e2 = i0.e(bArr, i2);
        int i4 = i3 - 4;
        byte[] bArr2 = new byte[i4];
        boolean z = false;
        System.arraycopy(bArr, i2 + 4, bArr2, 0, i4);
        this.f5001g.reset();
        this.f5001g.update(bArr2);
        long value = this.f5001g.getValue();
        if (e2 == value) {
            int d2 = k0.d(bArr2, 0);
            int e3 = (int) i0.e(bArr2, 2);
            byte[] bArr3 = new byte[e3];
            this.c = k0.d(bArr2, 6);
            this.f4998d = k0.d(bArr2, 8);
            if (e3 == 0) {
                this.f4999e = "";
            } else {
                System.arraycopy(bArr2, 10, bArr3, 0, e3);
                this.f4999e = new String(bArr3);
            }
            if ((d2 & 16384) != 0) {
                z = true;
            }
            this.f5000f = z;
            this.b = f(this.b);
            this.b = f(d2);
            return;
        }
        StringBuilder i5 = a.i("bad CRC checksum ");
        i5.append(Long.toHexString(e2));
        i5.append(" instead of ");
        i5.append(Long.toHexString(value));
        throw new ZipException(i5.toString());
    }

    public byte[] h() {
        int c2 = b().c() - 4;
        byte[] bArr = new byte[c2];
        System.arraycopy(k0.b(this.b), 0, bArr, 0, 2);
        byte[] bytes = this.f4999e.getBytes();
        System.arraycopy(i0.b((long) bytes.length), 0, bArr, 2, 4);
        System.arraycopy(k0.b(this.c), 0, bArr, 6, 2);
        System.arraycopy(k0.b(this.f4998d), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f5001g.reset();
        this.f5001g.update(bArr);
        byte[] bArr2 = new byte[(c2 + 4)];
        System.arraycopy(i0.b(this.f5001g.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, c2);
        return bArr2;
    }
}
