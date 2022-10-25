package m.a.b.a.a.a.b;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import m.a.b.a.a.b.a;

public class r extends a {
    public final byte[] c = new byte[1];

    /* renamed from: d  reason: collision with root package name */
    public final m.a.b.a.a.c.a f5202d;

    /* renamed from: e  reason: collision with root package name */
    public int f5203e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f5204f = 9;

    /* renamed from: g  reason: collision with root package name */
    public byte f5205g;

    /* renamed from: h  reason: collision with root package name */
    public int f5206h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f5207i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5208j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f5209k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f5210l;

    /* renamed from: m  reason: collision with root package name */
    public int f5211m;
    public final boolean[] n;

    public r(InputStream inputStream) throws IOException {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f5202d = new m.a.b.a.a.c.a(inputStream, byteOrder);
        this.f5203e = 256;
        this.f5208j = new int[8192];
        this.f5209k = new byte[8192];
        this.f5210l = new byte[8192];
        this.f5211m = 8192;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f5208j[i2] = -1;
            this.f5209k[i2] = (byte) i2;
        }
        this.n = new boolean[this.f5208j.length];
        for (int i3 = 0; i3 < 256; i3++) {
            this.n[i3] = true;
        }
        this.f5207i = this.f5203e + 1;
    }

    public int b(int i2, byte b) throws IOException {
        int i3 = this.f5207i;
        while (i3 < 8192 && this.n[i3]) {
            i3++;
        }
        this.f5207i = i3;
        if (i3 < 8192) {
            this.f5208j[i3] = i2;
            this.f5209k[i3] = b;
            this.f5207i = i3 + 1;
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            this.n[i3] = true;
        }
        return i3;
    }

    public void close() {
        this.f5202d.b.close();
    }

    public final int d(byte[] bArr, int i2, int i3) {
        int length = this.f5210l.length - this.f5211m;
        if (length <= 0) {
            return 0;
        }
        int min = Math.min(length, i3);
        System.arraycopy(this.f5210l, this.f5211m, bArr, i2, min);
        this.f5211m += min;
        return min;
    }

    public int f() {
        int i2 = this.f5204f;
        if (i2 <= 31) {
            return (int) this.f5202d.a(i2);
        }
        throw new IllegalArgumentException("code size must not be bigger than 31");
    }

    public int read() {
        int read = read(this.c);
        return read < 0 ? read : this.c[0] & 255;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int d2 = d(bArr, i2, i3);
        while (true) {
            int i4 = i3 - d2;
            if (i4 <= 0) {
                break;
            }
            int f2 = f();
            int i5 = -1;
            boolean z = false;
            if (f2 >= 0) {
                if (f2 == this.f5203e) {
                    int f3 = f();
                    if (f3 >= 0) {
                        if (f3 == 1) {
                            int i6 = this.f5204f;
                            if (i6 < 13) {
                                this.f5204f = i6 + 1;
                            } else {
                                throw new IOException("Attempt to increase code size beyond maximum");
                            }
                        } else if (f3 == 2) {
                            boolean[] zArr = new boolean[8192];
                            int i7 = 0;
                            while (true) {
                                boolean[] zArr2 = this.n;
                                if (i7 >= zArr2.length) {
                                    break;
                                }
                                if (zArr2[i7]) {
                                    int[] iArr = this.f5208j;
                                    if (iArr[i7] != -1) {
                                        zArr[iArr[i7]] = true;
                                    }
                                }
                                i7++;
                            }
                            for (int i8 = this.f5203e + 1; i8 < 8192; i8++) {
                                if (!zArr[i8]) {
                                    this.n[i8] = false;
                                    this.f5208j[i8] = -1;
                                }
                            }
                            this.f5207i = this.f5203e + 1;
                        } else {
                            throw new IOException(g.a.a.a.a.q("Invalid clear code subcode ", f3));
                        }
                        i5 = 0;
                    } else {
                        throw new IOException("Unexpected EOF;");
                    }
                } else {
                    if (!this.n[f2]) {
                        int i9 = this.f5206h;
                        if (i9 != -1) {
                            f2 = b(i9, this.f5205g);
                            z = true;
                        } else {
                            throw new IOException("The first code can't be a reference to its preceding code");
                        }
                    }
                    int i10 = f2;
                    while (i10 >= 0) {
                        byte[] bArr2 = this.f5210l;
                        int i11 = this.f5211m - 1;
                        this.f5211m = i11;
                        bArr2[i11] = this.f5209k[i10];
                        i10 = this.f5208j[i10];
                    }
                    int i12 = this.f5206h;
                    if (i12 != -1 && !z) {
                        b(i12, this.f5210l[this.f5211m]);
                    }
                    this.f5206h = f2;
                    byte[] bArr3 = this.f5210l;
                    i5 = this.f5211m;
                    this.f5205g = bArr3[i5];
                }
            }
            if (i5 >= 0) {
                d2 += d(bArr, i2 + d2, i4);
            } else if (d2 <= 0) {
                return i5;
            }
        }
        a(d2);
        return d2;
    }
}
