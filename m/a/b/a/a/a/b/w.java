package m.a.b.a.a.a.b;

import g.a.a.a.a;
import java.io.PrintStream;
import m.a.b.a.a.a.b.l;

public class w extends l {

    /* renamed from: e  reason: collision with root package name */
    public long f5216e;

    /* renamed from: f  reason: collision with root package name */
    public int f5217f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5218g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5219h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f5220i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f5221j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f5222k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f5223l;

    public w() {
        super(new k0(23));
    }

    public void e(byte[] bArr, int i2, int i3) {
        super.e(bArr, i2, i3);
        k0.d(bArr, i2);
        l.a aVar = l.a.f5188l.get(Integer.valueOf(k0.d(bArr, i2 + 2)));
        k0.d(bArr, i2 + 4);
        k0.d(bArr, i2 + 6);
        long e2 = i0.e(bArr, i2 + 8);
        this.f5216e = e2;
        if (e2 > 0) {
            l.b.a(k0.d(bArr, i2 + 12));
            this.f5217f = k0.d(bArr, i2 + 14);
            for (int i4 = 0; ((long) i4) < this.f5216e; i4++) {
                for (int i5 = 0; i5 < this.f5217f; i5++) {
                }
            }
        }
    }

    public void g(byte[] bArr, int i2, int i3) {
        super.g(bArr, i2, i3);
        int d2 = k0.d(bArr, i2);
        byte[] bArr2 = new byte[d2];
        this.f5218g = bArr2;
        System.arraycopy(bArr, i2 + 4, bArr2, 0, d2);
        int i4 = i2 + d2;
        k0.d(bArr, i4 + 6);
        l.a aVar = l.a.f5188l.get(Integer.valueOf(k0.d(bArr, i4 + 8)));
        k0.d(bArr, i4 + 10);
        k0.d(bArr, i4 + 12);
        int d3 = k0.d(bArr, i4 + 14);
        byte[] bArr3 = new byte[d3];
        this.f5219h = bArr3;
        int i5 = i4 + 16;
        System.arraycopy(bArr, i5, bArr3, 0, d3);
        this.f5216e = i0.e(bArr, i5 + d3);
        PrintStream printStream = System.out;
        StringBuilder i6 = a.i("rcount: ");
        i6.append(this.f5216e);
        printStream.println(i6.toString());
        int i7 = (this.f5216e > 0 ? 1 : (this.f5216e == 0 ? 0 : -1));
        int d4 = k0.d(bArr, i4 + 20 + d3);
        if (i7 == 0) {
            int i8 = d4 - 4;
            byte[] bArr4 = new byte[i8];
            this.f5222k = bArr4;
            this.f5223l = new byte[4];
            int i9 = i4 + 22 + d3;
            System.arraycopy(bArr, i9, bArr4, 0, i8);
            System.arraycopy(bArr, (i9 + d4) - 4, this.f5223l, 0, 4);
            return;
        }
        l.b.a(d4);
        int i10 = i4 + 22 + d3;
        this.f5217f = k0.d(bArr, i10);
        int i11 = i4 + 24 + d3;
        int d5 = k0.d(bArr, i11);
        int i12 = this.f5217f;
        byte[] bArr5 = new byte[i12];
        this.f5220i = bArr5;
        this.f5221j = new byte[(d5 - i12)];
        System.arraycopy(bArr, i11, bArr5, 0, i12);
        int i13 = this.f5217f;
        System.arraycopy(bArr, i11 + i13, this.f5221j, 0, d5 - i13);
        int d6 = k0.d(bArr, i4 + 26 + d3 + d5);
        int i14 = d6 - 4;
        byte[] bArr6 = new byte[i14];
        this.f5222k = bArr6;
        this.f5223l = new byte[4];
        int i15 = i10 + d5;
        System.arraycopy(bArr, i15, bArr6, 0, i14);
        System.arraycopy(bArr, (i15 + d6) - 4, this.f5223l, 0, 4);
    }
}
