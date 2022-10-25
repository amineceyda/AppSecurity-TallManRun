package g.i.b.e.h;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f4219e = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f4220f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g  reason: collision with root package name */
    public static final char[] f4221g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public long[] a = new long[4];
    public long[] b = new long[2];
    public byte[] c = new byte[64];

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4222d = new byte[16];

    public c() {
        e();
    }

    public static long a(byte b2) {
        return b2 < 0 ? (long) (b2 & 255) : (long) b2;
    }

    public static long b(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i2 = (int) (((j4 & j3) | (j5 & (-1 ^ j3))) + j6 + j8 + j2);
        return ((long) ((i2 >>> ((int) (32 - j7))) | (i2 << ((int) j7)))) + j3;
    }

    public static String c(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("ISO8859_1");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        byte[] k2 = new c().k(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 16; i2++) {
            sb.append(j(k2[i2]));
        }
        return sb.toString();
    }

    public static String d(byte[] bArr) {
        byte[] k2 = new c().k(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 16; i2++) {
            sb.append(j(k2[i2]));
        }
        return sb.toString();
    }

    public static void g(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i2 + i5] = bArr2[i3 + i5];
        }
    }

    public static void h(byte[] bArr, long[] jArr, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4 += 4) {
            bArr[i4] = (byte) ((int) (jArr[i3] & 255));
            bArr[i4 + 1] = (byte) ((int) ((jArr[i3] >>> 8) & 255));
            bArr[i4 + 2] = (byte) ((int) ((jArr[i3] >>> 16) & 255));
            bArr[i4 + 3] = (byte) ((int) (255 & (jArr[i3] >>> 24)));
            i3++;
        }
    }

    public static long i(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        long j9 = j7;
        int i2 = (int) (((j3 & j5) | ((-1 ^ j5) & j4)) + j6 + j8 + j2);
        return ((long) ((i2 >>> ((int) (32 - j9))) | (i2 << ((int) j9)))) + j3;
    }

    public static String j(byte b2) {
        char[] cArr = f4221g;
        return new String(new char[]{cArr[(b2 >>> 4) & 15], cArr[b2 & 15]});
    }

    public static long l(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i2 = (int) (((j4 ^ j3) ^ j5) + j6 + j8 + j2);
        return ((long) ((i2 >>> ((int) (32 - j7))) | (i2 << ((int) j7)))) + j3;
    }

    public static long n(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i2 = (int) ((j4 ^ ((j5 ^ -1) | j3)) + j6 + j8 + j2);
        return ((long) ((i2 >>> ((int) (32 - j7))) | (i2 << ((int) j7)))) + j3;
    }

    public final void e() {
        long[] jArr = this.b;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.a;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    public final void f(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[64];
        long[] jArr = this.b;
        int i3 = 0;
        int i4 = ((int) (jArr[0] >>> 3)) & 63;
        long j2 = (long) (i2 << 3);
        long j3 = jArr[0] + j2;
        jArr[0] = j3;
        if (j3 < j2) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + ((long) (i2 >>> 29));
        int i5 = 64 - i4;
        if (i2 >= i5) {
            g(this.c, bArr, i4, 0, i5);
            m(this.c);
            while (i5 + 63 < i2) {
                g(bArr2, bArr, 0, i5, 64);
                m(bArr2);
                i5 += 64;
            }
            i3 = i5;
            i4 = 0;
        }
        g(this.c, bArr, i4, i3, i2 - i3);
    }

    public final byte[] k(byte[] bArr) {
        e();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        long length = (long) bArr.length;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.b;
        int i2 = ((int) (jArr[0] >>> 3)) & 63;
        long j2 = length << 3;
        long j3 = jArr[0] + j2;
        jArr[0] = j3;
        if (j3 < j2) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (length >>> 29);
        int i3 = 64 - i2;
        if (length >= ((long) i3)) {
            byte[] bArr3 = new byte[i3];
            try {
                byteArrayInputStream.read(bArr3, 0, i3);
                g(this.c, bArr3, i2, 0, i3);
                m(this.c);
                while (((long) (i3 + 63)) < length) {
                    byteArrayInputStream.read(bArr2);
                    m(bArr2);
                    i3 += 64;
                }
                i2 = 0;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            i3 = 0;
        }
        int i4 = (int) (length - ((long) i3));
        byte[] bArr4 = new byte[i4];
        byteArrayInputStream.read(bArr4);
        g(this.c, bArr4, i2, 0, i4);
        byte[] bArr5 = new byte[8];
        h(bArr5, this.b, 8);
        int i5 = ((int) (this.b[0] >>> 3)) & 63;
        f(f4219e, i5 < 56 ? 56 - i5 : 120 - i5);
        f(bArr5, 8);
        h(this.f4222d, this.a, 16);
        return this.f4222d;
    }

    public final void m(byte[] bArr) {
        long[] jArr = this.a;
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long[] jArr2 = new long[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 64; i3 += 4) {
            jArr2[i2] = a(bArr[i3]) | (a(bArr[i3 + 1]) << 8) | (a(bArr[i3 + 2]) << 16) | (a(bArr[i3 + 3]) << 24);
            i2++;
        }
        long[] jArr3 = jArr2;
        long b2 = b(j2, j3, j4, j5, jArr2[0], 7, 3614090360L);
        long b3 = b(j5, b2, j3, j4, jArr3[1], 12, 3905402710L);
        long b4 = b(j4, b3, b2, j3, jArr3[2], 17, 606105819);
        long b5 = b(j3, b4, b3, b2, jArr3[3], 22, 3250441966L);
        long b6 = b(b2, b5, b4, b3, jArr3[4], 7, 4118548399L);
        long b7 = b(b3, b6, b5, b4, jArr3[5], 12, 1200080426);
        long b8 = b(b4, b7, b6, b5, jArr3[6], 17, 2821735955L);
        long b9 = b(b5, b8, b7, b6, jArr3[7], 22, 4249261313L);
        long b10 = b(b6, b9, b8, b7, jArr3[8], 7, 1770035416);
        long j6 = b10;
        long b11 = b(b7, j6, b9, b8, jArr3[9], 12, 2336552879L);
        long b12 = b(b8, b11, b10, b9, jArr3[10], 17, 4294925233L);
        long b13 = b(b9, b12, b11, b10, jArr3[11], 22, 2304563134L);
        long b14 = b(j6, b13, b12, b11, jArr3[12], 7, 1804603682);
        long j7 = b14;
        long b15 = b(b11, j7, b13, b12, jArr3[13], 12, 4254626195L);
        long b16 = b(b12, b15, b14, b13, jArr3[14], 17, 2792965006L);
        long b17 = b(b13, b16, b15, b14, jArr3[15], 22, 1236535329);
        long i4 = i(j7, b17, b16, b15, jArr3[1], 5, 4129170786L);
        long i5 = i(b15, i4, b17, b16, jArr3[6], 9, 3225465664L);
        long i6 = i(b16, i5, i4, b17, jArr3[11], 14, 643717713);
        long i7 = i(b17, i6, i5, i4, jArr3[0], 20, 3921069994L);
        long i8 = i(i4, i7, i6, i5, jArr3[5], 5, 3593408605L);
        long i9 = i(i5, i8, i7, i6, jArr3[10], 9, 38016083);
        long i10 = i(i6, i9, i8, i7, jArr3[15], 14, 3634488961L);
        long i11 = i(i7, i10, i9, i8, jArr3[4], 20, 3889429448L);
        long i12 = i(i8, i11, i10, i9, jArr3[9], 5, 568446438);
        long j8 = i12;
        long i13 = i(i9, j8, i11, i10, jArr3[14], 9, 3275163606L);
        long i14 = i(i10, i13, i12, i11, jArr3[3], 14, 4107603335L);
        long i15 = i(i11, i14, i13, i12, jArr3[8], 20, 1163531501);
        long i16 = i(j8, i15, i14, i13, jArr3[13], 5, 2850285829L);
        long j9 = i16;
        long i17 = i(i13, j9, i15, i14, jArr3[2], 9, 4243563512L);
        long i18 = i(i14, i17, i16, i15, jArr3[7], 14, 1735328473);
        long i19 = i(i15, i18, i17, i16, jArr3[12], 20, 2368359562L);
        long l2 = l(j9, i19, i18, i17, jArr3[5], 4, 4294588738L);
        long l3 = l(i17, l2, i19, i18, jArr3[8], 11, 2272392833L);
        long l4 = l(i18, l3, l2, i19, jArr3[11], 16, 1839030562);
        long l5 = l(i19, l4, l3, l2, jArr3[14], 23, 4259657740L);
        long l6 = l(l2, l5, l4, l3, jArr3[1], 4, 2763975236L);
        long l7 = l(l3, l6, l5, l4, jArr3[4], 11, 1272893353);
        long l8 = l(l4, l7, l6, l5, jArr3[7], 16, 4139469664L);
        long l9 = l(l5, l8, l7, l6, jArr3[10], 23, 3200236656L);
        long l10 = l(l6, l9, l8, l7, jArr3[13], 4, 681279174);
        long j10 = l10;
        long l11 = l(l7, j10, l9, l8, jArr3[0], 11, 3936430074L);
        long l12 = l(l8, l11, l10, l9, jArr3[3], 16, 3572445317L);
        long l13 = l(l9, l12, l11, l10, jArr3[6], 23, 76029189);
        long l14 = l(j10, l13, l12, l11, jArr3[9], 4, 3654602809L);
        long j11 = l14;
        long l15 = l(l11, j11, l13, l12, jArr3[12], 11, 3873151461L);
        long l16 = l(l12, l15, l14, l13, jArr3[15], 16, 530742520);
        long l17 = l(l13, l16, l15, l14, jArr3[2], 23, 3299628645L);
        long n = n(j11, l17, l16, l15, jArr3[0], 6, 4096336452L);
        long n2 = n(l15, n, l17, l16, jArr3[7], 10, 1126891415);
        long n3 = n(l16, n2, n, l17, jArr3[14], 15, 2878612391L);
        long n4 = n(l17, n3, n2, n, jArr3[5], 21, 4237533241L);
        long n5 = n(n, n4, n3, n2, jArr3[12], 6, 1700485571);
        long n6 = n(n2, n5, n4, n3, jArr3[3], 10, 2399980690L);
        long n7 = n(n3, n6, n5, n4, jArr3[10], 15, 4293915773L);
        long n8 = n(n4, n7, n6, n5, jArr3[1], 21, 2240044497L);
        long n9 = n(n5, n8, n7, n6, jArr3[8], 6, 1873313359);
        long j12 = n9;
        long n10 = n(n6, j12, n8, n7, jArr3[15], 10, 4264355552L);
        long n11 = n(n7, n10, n9, n8, jArr3[6], 15, 2734768916L);
        long n12 = n(n8, n11, n10, n9, jArr3[13], 21, 1309151649);
        long n13 = n(j12, n12, n11, n10, jArr3[4], 6, 4149444226L);
        long n14 = n(n10, n13, n12, n11, jArr3[11], 10, 3174756917L);
        long n15 = n(n11, n14, n13, n12, jArr3[2], 15, 718787259);
        long n16 = n(n12, n15, n14, n13, jArr3[9], 21, 3951481745L);
        long[] jArr4 = this.a;
        jArr4[0] = jArr4[0] + n13;
        jArr4[1] = jArr4[1] + n16;
        jArr4[2] = jArr4[2] + n15;
        jArr4[3] = jArr4[3] + n14;
    }
}
