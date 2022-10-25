package m.a.b.a.a.a.b;

import java.util.zip.ZipException;

public final class j implements g0 {
    public static final k0 b = new k0(51966);
    public static final k0 c = new k0(0);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5168d = new byte[0];

    public k0 a() {
        return b;
    }

    public k0 b() {
        return c;
    }

    public byte[] c() {
        return f5168d;
    }

    public k0 d() {
        return c;
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
        g(bArr, i2, i3);
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        if (i3 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }

    public byte[] h() {
        return f5168d;
    }
}
