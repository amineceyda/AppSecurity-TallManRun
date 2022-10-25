package l;

import java.util.Arrays;

public final class w extends h {

    /* renamed from: f  reason: collision with root package name */
    public final transient byte[][] f4988f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int[] f4989g;

    public w(e eVar, int i2) {
        super((byte[]) null);
        a0.b(eVar.c, 0, (long) i2);
        u uVar = eVar.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = uVar.c;
            int i7 = uVar.b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                uVar = uVar.f4986f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f4988f = new byte[i5][];
        this.f4989g = new int[(i5 * 2)];
        u uVar2 = eVar.b;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.f4988f;
            bArr[i8] = uVar2.a;
            int i9 = uVar2.c;
            int i10 = uVar2.b;
            int i11 = (i9 - i10) + i3;
            i3 = i11 > i2 ? i2 : i11;
            int[] iArr = this.f4989g;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            uVar2.f4984d = true;
            i8++;
            uVar2 = uVar2.f4986f;
        }
    }

    private Object writeReplace() {
        return x();
    }

    public String a() {
        return x().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return hVar.p() == p() && n(0, hVar, 0, p());
        }
    }

    public byte h(int i2) {
        a0.b((long) this.f4989g[this.f4988f.length - 1], (long) i2, 1);
        int w = w(i2);
        int i3 = w == 0 ? 0 : this.f4989g[w - 1];
        int[] iArr = this.f4989g;
        byte[][] bArr = this.f4988f;
        return bArr[w][(i2 - i3) + iArr[bArr.length + w]];
    }

    public int hashCode() {
        int i2 = this.b;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f4988f.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr = this.f4988f[i3];
            int[] iArr = this.f4989g;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.b = i5;
        return i5;
    }

    public String i() {
        return x().i();
    }

    public h l() {
        return x().e("MD5");
    }

    public boolean n(int i2, h hVar, int i3, int i4) {
        if (i2 < 0 || i2 > p() - i4) {
            return false;
        }
        int w = w(i2);
        while (i4 > 0) {
            int i5 = w == 0 ? 0 : this.f4989g[w - 1];
            int min = Math.min(i4, ((this.f4989g[w] - i5) + i5) - i2);
            int[] iArr = this.f4989g;
            byte[][] bArr = this.f4988f;
            if (!hVar.o(i3, bArr[w], (i2 - i5) + iArr[bArr.length + w], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            w++;
        }
        return true;
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > p() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int w = w(i2);
        while (i4 > 0) {
            int i5 = w == 0 ? 0 : this.f4989g[w - 1];
            int min = Math.min(i4, ((this.f4989g[w] - i5) + i5) - i2);
            int[] iArr = this.f4989g;
            byte[][] bArr2 = this.f4988f;
            if (!a0.a(bArr2[w], (i2 - i5) + iArr[bArr2.length + w], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            w++;
        }
        return true;
    }

    public int p() {
        return this.f4989g[this.f4988f.length - 1];
    }

    public h q(int i2, int i3) {
        return x().q(i2, i3);
    }

    public h r() {
        return x().r();
    }

    public byte[] s() {
        int[] iArr = this.f4989g;
        byte[][] bArr = this.f4988f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f4989g;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f4988f[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    public String t() {
        return x().t();
    }

    public String toString() {
        return x().toString();
    }

    public void u(e eVar) {
        int length = this.f4988f.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f4989g;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            u uVar = new u(this.f4988f[i2], i4, (i4 + i5) - i3, true, false);
            u uVar2 = eVar.b;
            if (uVar2 == null) {
                uVar.f4987g = uVar;
                uVar.f4986f = uVar;
                eVar.b = uVar;
            } else {
                uVar2.f4987g.b(uVar);
            }
            i2++;
            i3 = i5;
        }
        eVar.c += (long) i3;
    }

    public final int w(int i2) {
        int binarySearch = Arrays.binarySearch(this.f4989g, 0, this.f4988f.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    public final h x() {
        return new h(s());
    }
}
