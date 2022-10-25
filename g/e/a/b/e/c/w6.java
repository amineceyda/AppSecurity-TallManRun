package g.e.a.b.e.c;

import com.google.android.gms.internal.measurement.zzjd;
import java.io.IOException;
import java.util.logging.Level;

public final class w6 extends x6 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f3066d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3067e;

    /* renamed from: f  reason: collision with root package name */
    public int f3068f;

    public w6(byte[] bArr, int i2, int i3) {
        super((v6) null);
        int length = bArr.length;
        if (((length - i3) | i3) >= 0) {
            this.f3066d = bArr;
            this.f3068f = 0;
            this.f3067e = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i3)}));
    }

    public final void c(byte b) throws IOException {
        try {
            byte[] bArr = this.f3066d;
            int i2 = this.f3068f;
            this.f3068f = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3068f), Integer.valueOf(this.f3067e), 1}), e2);
        }
    }

    public final void d(int i2, boolean z) throws IOException {
        o(i2 << 3);
        c(z ? (byte) 1 : 0);
    }

    public final void e(int i2, s6 s6Var) throws IOException {
        o((i2 << 3) | 2);
        o(s6Var.h());
        s6Var.p(this);
    }

    public final void f(int i2, int i3) throws IOException {
        o((i2 << 3) | 5);
        g(i3);
    }

    public final void g(int i2) throws IOException {
        try {
            byte[] bArr = this.f3066d;
            int i3 = this.f3068f;
            int i4 = i3 + 1;
            this.f3068f = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.f3068f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.f3068f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f3068f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3068f), Integer.valueOf(this.f3067e), 1}), e2);
        }
    }

    public final void h(int i2, long j2) throws IOException {
        o((i2 << 3) | 1);
        i(j2);
    }

    public final void i(long j2) throws IOException {
        try {
            byte[] bArr = this.f3066d;
            int i2 = this.f3068f;
            int i3 = i2 + 1;
            this.f3068f = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.f3068f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.f3068f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.f3068f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            this.f3068f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.f3068f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.f3068f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f3068f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3068f), Integer.valueOf(this.f3067e), 1}), e2);
        }
    }

    public final void j(int i2, int i3) throws IOException {
        o(i2 << 3);
        if (i3 >= 0) {
            o(i3);
        } else {
            q((long) i3);
        }
    }

    public final void k(int i2) throws IOException {
        if (i2 >= 0) {
            o(i2);
        } else {
            q((long) i2);
        }
    }

    public final void l(int i2, String str) throws IOException {
        int b;
        o((i2 << 3) | 2);
        int i3 = this.f3068f;
        try {
            int a = x6.a(str.length() * 3);
            int a2 = x6.a(str.length());
            if (a2 == a) {
                int i4 = i3 + a2;
                this.f3068f = i4;
                b = y9.b(str, this.f3066d, i4, this.f3067e - i4);
                this.f3068f = i3;
                o((b - i3) - a2);
            } else {
                o(y9.c(str));
                byte[] bArr = this.f3066d;
                int i5 = this.f3068f;
                b = y9.b(str, bArr, i5, this.f3067e - i5);
            }
            this.f3068f = b;
        } catch (x9 e2) {
            this.f3068f = i3;
            x6.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
            byte[] bytes = str.getBytes(v7.a);
            try {
                int length = bytes.length;
                o(length);
                z(bytes, 0, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzjd(e3);
            } catch (zzjd e4) {
                throw e4;
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new zzjd(e5);
        }
    }

    public final void m(int i2, int i3) throws IOException {
        o((i2 << 3) | i3);
    }

    public final void n(int i2, int i3) throws IOException {
        o(i2 << 3);
        o(i3);
    }

    public final void o(int i2) throws IOException {
        if (x6.c) {
            int i3 = j6.a;
        }
        while ((i2 & -128) != 0) {
            byte[] bArr = this.f3066d;
            int i4 = this.f3068f;
            this.f3068f = i4 + 1;
            bArr[i4] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
        }
        try {
            byte[] bArr2 = this.f3066d;
            int i5 = this.f3068f;
            this.f3068f = i5 + 1;
            bArr2[i5] = (byte) i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3068f), Integer.valueOf(this.f3067e), 1}), e2);
        }
    }

    public final void p(int i2, long j2) throws IOException {
        o(i2 << 3);
        q(j2);
    }

    public final void q(long j2) throws IOException {
        if (!x6.c || this.f3067e - this.f3068f < 10) {
            while ((j2 & -128) != 0) {
                byte[] bArr = this.f3066d;
                int i2 = this.f3068f;
                this.f3068f = i2 + 1;
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f3066d;
                int i3 = this.f3068f;
                this.f3068f = i3 + 1;
                bArr2[i3] = (byte) ((int) j2);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3068f), Integer.valueOf(this.f3067e), 1}), e2);
            }
        } else {
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.f3066d;
                int i4 = this.f3068f;
                this.f3068f = i4 + 1;
                v9.f3057d.d(bArr3, v9.f3060g + ((long) i4), (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f3066d;
            int i5 = this.f3068f;
            this.f3068f = i5 + 1;
            u9 u9Var = v9.f3057d;
            u9Var.d(bArr4, v9.f3060g + ((long) i5), (byte) ((int) j2));
        }
    }

    public final int x() {
        return this.f3067e - this.f3068f;
    }

    public final void y(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f3066d, this.f3068f, i3);
            this.f3068f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3068f), Integer.valueOf(this.f3067e), Integer.valueOf(i3)}), e2);
        }
    }

    public final void z(byte[] bArr, int i2, int i3) throws IOException {
        y(bArr, 0, i3);
    }
}
