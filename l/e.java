package l;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;

public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f4968d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable
    public u b;
    public long c;

    public class a extends InputStream {
        public a() {
        }

        public int available() {
            return (int) Math.min(e.this.c, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            e eVar = e.this;
            if (eVar.c > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i2, int i3) {
            return e.this.g(bArr, i2, i3);
        }

        public String toString() {
            return e.this + ".inputStream()";
        }
    }

    public int A() {
        return a0.c(readInt());
    }

    public f C(int i2) throws IOException {
        Q(a0.c(i2));
        return this;
    }

    public boolean D() {
        return this.c == 0;
    }

    public byte[] E(long j2) throws EOFException {
        a0.b(this.c, 0, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[((int) j2)];
            k(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(g.a.a.a.a.s("byteCount > Integer.MAX_VALUE: ", j2));
    }

    public long F(y yVar) throws IOException {
        if (yVar != null) {
            long j2 = 0;
            while (true) {
                long M = yVar.M(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (M == -1) {
                    return j2;
                }
                j2 += M;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public short J() {
        short readShort = readShort();
        Charset charset = a0.a;
        short s = readShort & 65535;
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public f K() throws IOException {
        return this;
    }

    public long M(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.c;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            eVar.m(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
        }
    }

    public String N(long j2) throws EOFException {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            long f2 = f((byte) 10, 0, j3);
            if (f2 != -1) {
                return q(f2);
            }
            if (j3 < this.c && d(j3 - 1) == 13 && d(j3) == 10) {
                return q(j3);
            }
            e eVar = new e();
            b(eVar, 0, Math.min(32, this.c));
            StringBuilder i2 = g.a.a.a.a.i("\\n not found: limit=");
            i2.append(Math.min(this.c, j2));
            i2.append(" content=");
            i2.append(eVar.j().i());
            i2.append(8230);
            throw new EOFException(i2.toString());
        }
        throw new IllegalArgumentException(g.a.a.a.a.s("limit < 0: ", j2));
    }

    public e O(int i2) {
        u s = s(1);
        byte[] bArr = s.a;
        int i3 = s.c;
        s.c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.c++;
        return this;
    }

    /* renamed from: P */
    public e r(long j2) {
        if (j2 == 0) {
            O(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        u s = s(numberOfTrailingZeros);
        byte[] bArr = s.a;
        int i2 = s.c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f4968d[(int) (15 & j2)];
            j2 >>>= 4;
        }
        s.c += numberOfTrailingZeros;
        this.c += (long) numberOfTrailingZeros;
        return this;
    }

    public e Q(int i2) {
        u s = s(4);
        byte[] bArr = s.a;
        int i3 = s.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        s.c = i6 + 1;
        this.c += 4;
        return this;
    }

    public e S(int i2) {
        u s = s(2);
        byte[] bArr = s.a;
        int i3 = s.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        s.c = i4 + 1;
        this.c += 2;
        return this;
    }

    public void U(long j2) throws EOFException {
        if (this.c < j2) {
            throw new EOFException();
        }
    }

    public e V(String str) {
        X(str, 0, str.length());
        return this;
    }

    public /* bridge */ /* synthetic */ f W(String str) throws IOException {
        V(str);
        return this;
    }

    public e X(String str, int i2, int i3) {
        int i4;
        char charAt;
        if (i2 < 0) {
            throw new IllegalArgumentException(g.a.a.a.a.q("beginIndex < 0: ", i2));
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    u s = s(1);
                    byte[] bArr = s.a;
                    int i5 = s.c - i2;
                    int min = Math.min(i3, 8192 - i5);
                    int i6 = i2 + 1;
                    bArr[i2 + i5] = (byte) charAt2;
                    while (true) {
                        i2 = i6;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            int i7 = s.c;
                            int i8 = (i5 + i2) - i7;
                            s.c = i7 + i8;
                            this.c += (long) i8;
                        } else {
                            i6 = i2 + 1;
                            bArr[i2 + i5] = (byte) charAt;
                        }
                    }
                    int i72 = s.c;
                    int i82 = (i5 + i2) - i72;
                    s.c = i72 + i82;
                    this.c += (long) i82;
                } else {
                    if (charAt2 < 2048) {
                        i4 = (charAt2 >> 6) | 192;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        O((charAt2 >> 12) | 224);
                        i4 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            O(63);
                            i2 = i9;
                        } else {
                            int i10 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 0;
                            O((i10 >> 18) | 240);
                            O(((i10 >> 12) & 63) | 128);
                            O(((i10 >> 6) & 63) | 128);
                            O((i10 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    O(i4);
                    O((charAt2 & '?') | 128);
                    i2++;
                }
            }
            return this;
        } else {
            StringBuilder j2 = g.a.a.a.a.j("endIndex > string.length: ", i3, " > ");
            j2.append(str.length());
            throw new IllegalArgumentException(j2.toString());
        }
    }

    public e Y(int i2) {
        int i3;
        int i4;
        if (i2 >= 128) {
            if (i2 < 2048) {
                i3 = (i2 >> 6) | 192;
            } else {
                if (i2 < 65536) {
                    if (i2 < 55296 || i2 > 57343) {
                        i4 = (i2 >> 12) | 224;
                    } else {
                        O(63);
                        return this;
                    }
                } else if (i2 <= 1114111) {
                    O((i2 >> 18) | 240);
                    i4 = ((i2 >> 12) & 63) | 128;
                } else {
                    StringBuilder i5 = g.a.a.a.a.i("Unexpected code point: ");
                    i5.append(Integer.toHexString(i2));
                    throw new IllegalArgumentException(i5.toString());
                }
                O(i4);
                i3 = ((i2 >> 6) & 63) | 128;
            }
            O(i3);
            i2 = (i2 & 63) | 128;
        }
        O(i2);
        return this;
    }

    public long Z(byte b2) {
        return f(b2, 0, Long.MAX_VALUE);
    }

    public final void a() {
        try {
            c(this.c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean a0(long j2, h hVar) {
        int p = hVar.p();
        if (j2 < 0 || p < 0 || this.c - j2 < ((long) p) || hVar.p() - 0 < p) {
            return false;
        }
        for (int i2 = 0; i2 < p; i2++) {
            if (d(((long) i2) + j2) != hVar.h(0 + i2)) {
                return false;
            }
        }
        return true;
    }

    public final e b(e eVar, long j2, long j3) {
        if (eVar != null) {
            a0.b(this.c, j2, j3);
            if (j3 == 0) {
                return this;
            }
            eVar.c += j3;
            u uVar = this.b;
            while (true) {
                int i2 = uVar.c;
                int i3 = uVar.b;
                if (j2 < ((long) (i2 - i3))) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                uVar = uVar.f4986f;
            }
            while (j3 > 0) {
                u c2 = uVar.c();
                int i4 = (int) (((long) c2.b) + j2);
                c2.b = i4;
                c2.c = Math.min(i4 + ((int) j3), c2.c);
                u uVar2 = eVar.b;
                if (uVar2 == null) {
                    c2.f4987g = c2;
                    c2.f4986f = c2;
                    eVar.b = c2;
                } else {
                    uVar2.f4987g.b(c2);
                }
                j3 -= (long) (c2.c - c2.b);
                uVar = uVar.f4986f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r8 != r9) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        r15.b = r6.a();
        l.v.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r1 != false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b0() {
        /*
            r15 = this;
            long r0 = r15.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a2
            r0 = 0
            r1 = 0
            r4 = r2
        L_0x000b:
            l.u r6 = r15.b
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L_0x0013:
            if (r8 >= r9) goto L_0x0087
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0039
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -97
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x006c
            r11 = 70
            if (r10 > r11) goto L_0x006c
            int r11 = r10 + -65
        L_0x0037:
            int r11 = r11 + 10
        L_0x0039:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0049
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0049:
            l.e r0 = new l.e
            r0.<init>()
            l.e r0 = r0.r(r4)
            r0.O(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = g.a.a.a.a.i(r2)
            java.lang.String r0 = r0.o()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006c:
            if (r0 == 0) goto L_0x0070
            r1 = 1
            goto L_0x0087
        L_0x0070:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0087:
            if (r8 != r9) goto L_0x0093
            l.u r7 = r6.a()
            r15.b = r7
            l.v.a(r6)
            goto L_0x0095
        L_0x0093:
            r6.b = r8
        L_0x0095:
            if (r1 != 0) goto L_0x009b
            l.u r6 = r15.b
            if (r6 != 0) goto L_0x000b
        L_0x009b:
            long r1 = r15.c
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.c = r1
            return r4
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00ab
        L_0x00aa:
            throw r0
        L_0x00ab:
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.b0():long");
    }

    public void c(long j2) throws EOFException {
        while (j2 > 0) {
            u uVar = this.b;
            if (uVar != null) {
                int min = (int) Math.min(j2, (long) (uVar.c - uVar.b));
                long j3 = (long) min;
                this.c -= j3;
                j2 -= j3;
                u uVar2 = this.b;
                int i2 = uVar2.b + min;
                uVar2.b = i2;
                if (i2 == uVar2.c) {
                    this.b = uVar2.a();
                    v.a(uVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String c0(Charset charset) {
        try {
            return n(this.c, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        e eVar = new e();
        if (this.c != 0) {
            u c2 = this.b.c();
            eVar.b = c2;
            c2.f4987g = c2;
            c2.f4986f = c2;
            u uVar = this.b;
            while (true) {
                uVar = uVar.f4986f;
                if (uVar == this.b) {
                    break;
                }
                eVar.b.f4987g.b(uVar.c());
            }
            eVar.c = this.c;
        }
        return eVar;
    }

    public void close() {
    }

    public final byte d(long j2) {
        int i2;
        a0.b(this.c, j2, 1);
        long j3 = this.c;
        if (j3 - j2 > j2) {
            u uVar = this.b;
            while (true) {
                int i3 = uVar.c;
                int i4 = uVar.b;
                long j4 = (long) (i3 - i4);
                if (j2 < j4) {
                    return uVar.a[i4 + ((int) j2)];
                }
                j2 -= j4;
                uVar = uVar.f4986f;
            }
        } else {
            long j5 = j2 - j3;
            u uVar2 = this.b;
            do {
                uVar2 = uVar2.f4987g;
                int i5 = uVar2.c;
                i2 = uVar2.b;
                j5 += (long) (i5 - i2);
            } while (j5 < 0);
            return uVar2.a[i2 + ((int) j5)];
        }
    }

    public InputStream d0() {
        return new a();
    }

    public h e(long j2) throws EOFException {
        return new h(E(j2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j2 = this.c;
        if (j2 != eVar.c) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        u uVar = this.b;
        u uVar2 = eVar.b;
        int i2 = uVar.b;
        int i3 = uVar2.b;
        while (j3 < this.c) {
            long min = (long) Math.min(uVar.c - i2, uVar2.c - i3);
            int i4 = 0;
            while (((long) i4) < min) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (uVar.a[i2] != uVar2.a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == uVar.c) {
                uVar = uVar.f4986f;
                i2 = uVar.b;
            }
            if (i3 == uVar2.c) {
                uVar2 = uVar2.f4986f;
                i3 = uVar2.b;
            }
            j3 += min;
        }
        return true;
    }

    public long f(byte b2, long j2, long j3) {
        u uVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.c), Long.valueOf(j2), Long.valueOf(j3)}));
        }
        long j5 = this.c;
        long j6 = j3 > j5 ? j5 : j3;
        if (j2 == j6 || (uVar = this.b) == null) {
            return -1;
        }
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                uVar = uVar.f4987g;
                j5 -= (long) (uVar.c - uVar.b);
            }
        } else {
            while (true) {
                long j7 = ((long) (uVar.c - uVar.b)) + j4;
                if (j7 >= j2) {
                    break;
                }
                uVar = uVar.f4986f;
                j4 = j7;
            }
            j5 = j4;
        }
        long j8 = j2;
        while (j5 < j6) {
            byte[] bArr = uVar.a;
            int min = (int) Math.min((long) uVar.c, (((long) uVar.b) + j6) - j5);
            for (int i2 = (int) ((((long) uVar.b) + j8) - j5); i2 < min; i2++) {
                if (bArr[i2] == b2) {
                    return ((long) (i2 - uVar.b)) + j5;
                }
            }
            byte b3 = b2;
            j5 += (long) (uVar.c - uVar.b);
            uVar = uVar.f4986f;
            j8 = j5;
        }
        return -1;
    }

    public void flush() {
    }

    public int g(byte[] bArr, int i2, int i3) {
        a0.b((long) bArr.length, (long) i2, (long) i3);
        u uVar = this.b;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i3, uVar.c - uVar.b);
        System.arraycopy(uVar.a, uVar.b, bArr, i2, min);
        int i4 = uVar.b + min;
        uVar.b = i4;
        this.c -= (long) min;
        if (i4 == uVar.c) {
            this.b = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public e h() {
        return this;
    }

    public int hashCode() {
        u uVar = this.b;
        if (uVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = uVar.c;
            for (int i4 = uVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + uVar.a[i4];
            }
            uVar = uVar.f4986f;
        } while (uVar != this.b);
        return i2;
    }

    public z i() {
        return z.f4990d;
    }

    public boolean isOpen() {
        return true;
    }

    public h j() {
        return new h(z());
    }

    public void k(byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int g2 = g(bArr, i2, bArr.length - i2);
            if (g2 != -1) {
                i2 += g2;
            } else {
                throw new EOFException();
            }
        }
    }

    public void m(e eVar, long j2) {
        u uVar;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            a0.b(eVar.c, 0, j2);
            while (j2 > 0) {
                u uVar2 = eVar.b;
                int i2 = 0;
                if (j2 < ((long) (uVar2.c - uVar2.b))) {
                    u uVar3 = this.b;
                    u uVar4 = uVar3 != null ? uVar3.f4987g : null;
                    if (uVar4 != null && uVar4.f4985e) {
                        if ((((long) uVar4.c) + j2) - ((long) (uVar4.f4984d ? 0 : uVar4.b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            uVar2.d(uVar4, (int) j2);
                            eVar.c -= j2;
                            this.c += j2;
                            return;
                        }
                    }
                    int i3 = (int) j2;
                    Objects.requireNonNull(uVar2);
                    if (i3 <= 0 || i3 > uVar2.c - uVar2.b) {
                        throw new IllegalArgumentException();
                    }
                    if (i3 >= 1024) {
                        uVar = uVar2.c();
                    } else {
                        uVar = v.b();
                        System.arraycopy(uVar2.a, uVar2.b, uVar.a, 0, i3);
                    }
                    uVar.c = uVar.b + i3;
                    uVar2.b += i3;
                    uVar2.f4987g.b(uVar);
                    eVar.b = uVar;
                }
                u uVar5 = eVar.b;
                long j3 = (long) (uVar5.c - uVar5.b);
                eVar.b = uVar5.a();
                u uVar6 = this.b;
                if (uVar6 == null) {
                    this.b = uVar5;
                    uVar5.f4987g = uVar5;
                    uVar5.f4986f = uVar5;
                } else {
                    uVar6.f4987g.b(uVar5);
                    u uVar7 = uVar5.f4987g;
                    if (uVar7 == uVar5) {
                        throw new IllegalStateException();
                    } else if (uVar7.f4985e) {
                        int i4 = uVar5.c - uVar5.b;
                        int i5 = 8192 - uVar7.c;
                        if (!uVar7.f4984d) {
                            i2 = uVar7.b;
                        }
                        if (i4 <= i5 + i2) {
                            uVar5.d(uVar7, i4);
                            uVar5.a();
                            v.a(uVar5);
                        }
                    }
                }
                eVar.c -= j3;
                this.c += j3;
                j2 -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public String n(long j2, Charset charset) throws EOFException {
        a0.b(this.c, 0, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j2 > 2147483647L) {
            throw new IllegalArgumentException(g.a.a.a.a.s("byteCount > Integer.MAX_VALUE: ", j2));
        } else if (j2 == 0) {
            return "";
        } else {
            u uVar = this.b;
            if (((long) uVar.b) + j2 > ((long) uVar.c)) {
                return new String(E(j2), charset);
            }
            String str = new String(uVar.a, uVar.b, (int) j2, charset);
            int i2 = (int) (((long) uVar.b) + j2);
            uVar.b = i2;
            this.c -= j2;
            if (i2 == uVar.c) {
                this.b = uVar.a();
                v.a(uVar);
            }
            return str;
        }
    }

    public String o() {
        try {
            return n(this.c, a0.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String q(long j2) throws EOFException {
        String n;
        long j3 = 1;
        if (j2 > 0) {
            long j4 = j2 - 1;
            if (d(j4) == 13) {
                n = n(j4, a0.a);
                j3 = 2;
                c(j3);
                return n;
            }
        }
        n = n(j2, a0.a);
        c(j3);
        return n;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        u uVar = this.b;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.c - uVar.b);
        byteBuffer.put(uVar.a, uVar.b, min);
        int i2 = uVar.b + min;
        uVar.b = i2;
        this.c -= (long) min;
        if (i2 == uVar.c) {
            this.b = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public byte readByte() {
        long j2 = this.c;
        if (j2 != 0) {
            u uVar = this.b;
            int i2 = uVar.b;
            int i3 = uVar.c;
            int i4 = i2 + 1;
            byte b2 = uVar.a[i2];
            this.c = j2 - 1;
            if (i4 == i3) {
                this.b = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i4;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public int readInt() {
        long j2 = this.c;
        if (j2 >= 4) {
            u uVar = this.b;
            int i2 = uVar.b;
            int i3 = uVar.c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i6 = i5 + 1;
            byte b3 = b2 | ((bArr[i5] & 255) << 8);
            int i7 = i6 + 1;
            byte b4 = b3 | (bArr[i6] & 255);
            this.c = j2 - 4;
            if (i7 == i3) {
                this.b = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i7;
            }
            return b4;
        }
        StringBuilder i8 = g.a.a.a.a.i("size < 4: ");
        i8.append(this.c);
        throw new IllegalStateException(i8.toString());
    }

    public short readShort() {
        long j2 = this.c;
        if (j2 >= 2) {
            u uVar = this.b;
            int i2 = uVar.b;
            int i3 = uVar.c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.c = j2 - 2;
            if (i5 == i3) {
                this.b = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i5;
            }
            return (short) b2;
        }
        StringBuilder i6 = g.a.a.a.a.i("size < 2: ");
        i6.append(this.c);
        throw new IllegalStateException(i6.toString());
    }

    public u s(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        u uVar = this.b;
        if (uVar == null) {
            u b2 = v.b();
            this.b = b2;
            b2.f4987g = b2;
            b2.f4986f = b2;
            return b2;
        }
        u uVar2 = uVar.f4987g;
        if (uVar2.c + i2 <= 8192 && uVar2.f4985e) {
            return uVar2;
        }
        u b3 = v.b();
        uVar2.b(b3);
        return b3;
    }

    public e t(h hVar) {
        if (hVar != null) {
            hVar.u(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public String toString() {
        long j2 = this.c;
        if (j2 <= 2147483647L) {
            int i2 = (int) j2;
            return (i2 == 0 ? h.f4970e : new w(this, i2)).toString();
        }
        StringBuilder i3 = g.a.a.a.a.i("size > Integer.MAX_VALUE: ");
        i3.append(this.c);
        throw new IllegalArgumentException(i3.toString());
    }

    public e u(byte[] bArr) {
        if (bArr != null) {
            v(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public e v(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j2 = (long) i3;
            a0.b((long) bArr.length, (long) i2, j2);
            int i4 = i3 + i2;
            while (i2 < i4) {
                u s = s(1);
                int min = Math.min(i4 - i2, 8192 - s.c);
                System.arraycopy(bArr, i2, s.a, s.c, min);
                i2 += min;
                s.c += min;
            }
            this.c += j2;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                u s = s(1);
                int min = Math.min(i2, 8192 - s.c);
                byteBuffer.get(s.a, s.c, min);
                i2 -= min;
                s.c += min;
            }
            this.c += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public /* bridge */ /* synthetic */ f write(byte[] bArr) throws IOException {
        u(bArr);
        return this;
    }

    public /* bridge */ /* synthetic */ f writeByte(int i2) throws IOException {
        O(i2);
        return this;
    }

    public /* bridge */ /* synthetic */ f writeInt(int i2) throws IOException {
        Q(i2);
        return this;
    }

    public /* bridge */ /* synthetic */ f writeShort(int i2) throws IOException {
        S(i2);
        return this;
    }

    public String y() throws EOFException {
        return N(Long.MAX_VALUE);
    }

    public byte[] z() {
        try {
            return E(this.c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }
}
