package m.a.a.a.b.b;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

public class a extends m.a.a.a.b.a {
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5096d;

    /* renamed from: e  reason: collision with root package name */
    public int f5097e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5098f;

    /* renamed from: g  reason: collision with root package name */
    public int f5099g;

    /* renamed from: h  reason: collision with root package name */
    public int f5100h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5101i = new b();

    /* renamed from: j  reason: collision with root package name */
    public int f5102j;

    /* renamed from: k  reason: collision with root package name */
    public InputStream f5103k;

    /* renamed from: l  reason: collision with root package name */
    public int f5104l = 1;

    /* renamed from: m  reason: collision with root package name */
    public int f5105m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public char y;
    public C0199a z;

    /* renamed from: m.a.a.a.b.b.a$a  reason: collision with other inner class name */
    public static final class C0199a {
        public final boolean[] a = new boolean[256];
        public final byte[] b = new byte[256];
        public final byte[] c = new byte[18002];

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f5106d = new byte[18002];

        /* renamed from: e  reason: collision with root package name */
        public final int[] f5107e = new int[256];

        /* renamed from: f  reason: collision with root package name */
        public final int[][] f5108f;

        /* renamed from: g  reason: collision with root package name */
        public final int[][] f5109g;

        /* renamed from: h  reason: collision with root package name */
        public final int[][] f5110h;

        /* renamed from: i  reason: collision with root package name */
        public final int[] f5111i;

        /* renamed from: j  reason: collision with root package name */
        public final int[] f5112j;

        /* renamed from: k  reason: collision with root package name */
        public final char[] f5113k;

        /* renamed from: l  reason: collision with root package name */
        public final char[][] f5114l;

        /* renamed from: m  reason: collision with root package name */
        public final byte[] f5115m;
        public int[] n;
        public byte[] o;

        public C0199a(int i2) {
            Class<int> cls = int.class;
            this.f5108f = (int[][]) Array.newInstance(cls, new int[]{6, 258});
            this.f5109g = (int[][]) Array.newInstance(cls, new int[]{6, 258});
            this.f5110h = (int[][]) Array.newInstance(cls, new int[]{6, 258});
            this.f5111i = new int[6];
            this.f5112j = new int[257];
            this.f5113k = new char[256];
            this.f5114l = (char[][]) Array.newInstance(char.class, new int[]{6, 258});
            this.f5115m = new byte[6];
            this.o = new byte[(i2 * 100000)];
        }
    }

    public a(InputStream inputStream) throws IOException {
        this.f5103k = inputStream;
        k(true);
        n();
    }

    public final boolean b() throws IOException {
        return g(1) != 0;
    }

    public void close() throws IOException {
        InputStream inputStream = this.f5103k;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            } finally {
                this.z = null;
                this.f5103k = null;
            }
        }
    }

    public final int d() throws IOException {
        return g(8) | (((((g(8) << 8) | g(8)) << 8) | g(8)) << 8);
    }

    public final char f() throws IOException {
        return (char) g(8);
    }

    public final int g(int i2) throws IOException {
        int i3 = this.f5100h;
        int i4 = this.f5099g;
        if (i3 < i2) {
            InputStream inputStream = this.f5103k;
            do {
                int read = inputStream.read();
                if (read >= 0) {
                    i4 = (i4 << 8) | read;
                    i3 += 8;
                } else {
                    throw new IOException("unexpected end of stream");
                }
            } while (i3 < i2);
            this.f5099g = i4;
        }
        int i5 = i3 - i2;
        this.f5100h = i5;
        return ((1 << i2) - 1) & (i4 >> i5);
    }

    public final void j() throws IOException {
        int i2 = this.f5101i.a ^ -1;
        this.o = i2;
        int i3 = this.f5105m;
        if (i3 == i2) {
            int i4 = this.p;
            int i5 = (i4 >>> 31) | (i4 << 1);
            this.p = i5;
            this.p = i2 ^ i5;
            return;
        }
        int i6 = this.n;
        int i7 = (i6 >>> 31) | (i6 << 1);
        this.p = i7;
        this.p = i7 ^ i3;
        throw new IOException("BZip2 CRC error");
    }

    public final boolean k(boolean z2) throws IOException {
        InputStream inputStream = this.f5103k;
        if (inputStream != null) {
            int read = inputStream.read();
            if (read == -1 && !z2) {
                return false;
            }
            int read2 = this.f5103k.read();
            int read3 = this.f5103k.read();
            if (read == 66 && read2 == 90 && read3 == 104) {
                int read4 = this.f5103k.read();
                if (read4 < 49 || read4 > 57) {
                    throw new IOException("BZip2 block size is invalid");
                }
                this.f5097e = read4 - 48;
                this.f5100h = 0;
                this.p = 0;
                return true;
            }
            throw new IOException(z2 ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        throw new IOException("No InputStream");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() throws java.io.IOException {
        /*
            r35 = this;
            r0 = r35
            char r1 = r35.f()
            char r2 = r35.f()
            char r3 = r35.f()
            char r4 = r35.f()
            char r5 = r35.f()
            char r6 = r35.f()
            r7 = 23
            r8 = 0
            if (r1 != r7) goto L_0x004c
            r9 = 114(0x72, float:1.6E-43)
            if (r2 != r9) goto L_0x004c
            r9 = 69
            if (r3 != r9) goto L_0x004c
            r9 = 56
            if (r4 != r9) goto L_0x004c
            r9 = 80
            if (r5 != r9) goto L_0x004c
            r9 = 144(0x90, float:2.02E-43)
            if (r6 == r9) goto L_0x0034
            goto L_0x004c
        L_0x0034:
            int r1 = r35.d()
            r0.n = r1
            r0.f5104l = r8
            r2 = 0
            r0.z = r2
            int r2 = r0.p
            if (r1 != r2) goto L_0x0044
            return
        L_0x0044:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "BZip2 CRC error"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            r9 = 49
            if (r1 != r9) goto L_0x045c
            r1 = 65
            if (r2 != r1) goto L_0x045c
            r1 = 89
            if (r3 != r1) goto L_0x045c
            r2 = 38
            if (r4 != r2) goto L_0x045c
            r2 = 83
            if (r5 != r2) goto L_0x045c
            if (r6 != r1) goto L_0x045c
            int r1 = r35.d()
            r0.f5105m = r1
            r1 = 1
            int r2 = r0.g(r1)
            if (r2 != r1) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r0.f5098f = r2
            m.a.a.a.b.b.a$a r2 = r0.z
            if (r2 != 0) goto L_0x0081
            m.a.a.a.b.b.a$a r2 = new m.a.a.a.b.b.a$a
            int r3 = r0.f5097e
            r2.<init>(r3)
            r0.z = r2
        L_0x0081:
            r2 = 24
            int r2 = r0.g(r2)
            r0.f5096d = r2
            m.a.a.a.b.b.a$a r2 = r0.z
            boolean[] r3 = r2.a
            byte[] r4 = r2.f5115m
            byte[] r5 = r2.c
            byte[] r6 = r2.f5106d
            r10 = 0
            r11 = 0
        L_0x0095:
            r12 = 16
            if (r10 >= r12) goto L_0x00a5
            boolean r12 = r35.b()
            if (r12 == 0) goto L_0x00a2
            int r12 = r1 << r10
            r11 = r11 | r12
        L_0x00a2:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00a5:
            r10 = 256(0x100, float:3.59E-43)
            r13 = 256(0x100, float:3.59E-43)
        L_0x00a9:
            r14 = -1
            int r13 = r13 + r14
            if (r13 < 0) goto L_0x00b0
            r3[r13] = r8
            goto L_0x00a9
        L_0x00b0:
            r13 = 0
        L_0x00b1:
            if (r13 >= r12) goto L_0x00cf
            int r15 = r1 << r13
            r15 = r15 & r11
            if (r15 == 0) goto L_0x00ca
            int r15 = r13 << 4
            r9 = 0
        L_0x00bb:
            if (r9 >= r12) goto L_0x00ca
            boolean r16 = r35.b()
            if (r16 == 0) goto L_0x00c7
            int r16 = r15 + r9
            r3[r16] = r1
        L_0x00c7:
            int r9 = r9 + 1
            goto L_0x00bb
        L_0x00ca:
            int r13 = r13 + 1
            r9 = 49
            goto L_0x00b1
        L_0x00cf:
            m.a.a.a.b.b.a$a r3 = r0.z
            boolean[] r9 = r3.a
            byte[] r3 = r3.b
            r11 = 0
            r13 = 0
        L_0x00d7:
            if (r11 >= r10) goto L_0x00e8
            boolean r15 = r9[r11]
            if (r15 == 0) goto L_0x00e3
            int r15 = r13 + 1
            byte r10 = (byte) r11
            r3[r13] = r10
            r13 = r15
        L_0x00e3:
            int r11 = r11 + 1
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x00d7
        L_0x00e8:
            r0.f5102j = r13
            int r13 = r13 + 2
            r3 = 3
            int r3 = r0.g(r3)
            r9 = 15
            int r9 = r0.g(r9)
            r10 = 0
        L_0x00f8:
            if (r10 >= r9) goto L_0x010a
            r11 = 0
        L_0x00fb:
            boolean r15 = r35.b()
            if (r15 == 0) goto L_0x0104
            int r11 = r11 + 1
            goto L_0x00fb
        L_0x0104:
            byte r11 = (byte) r11
            r6[r10] = r11
            int r10 = r10 + 1
            goto L_0x00f8
        L_0x010a:
            r10 = r3
        L_0x010b:
            int r10 = r10 + r14
            if (r10 < 0) goto L_0x0112
            byte r11 = (byte) r10
            r4[r10] = r11
            goto L_0x010b
        L_0x0112:
            r10 = 0
        L_0x0113:
            if (r10 >= r9) goto L_0x012d
            byte r11 = r6[r10]
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r15 = r4[r11]
        L_0x011b:
            if (r11 <= 0) goto L_0x0126
            int r17 = r11 + -1
            byte r18 = r4[r17]
            r4[r11] = r18
            r11 = r17
            goto L_0x011b
        L_0x0126:
            r4[r8] = r15
            r5[r10] = r15
            int r10 = r10 + 1
            goto L_0x0113
        L_0x012d:
            char[][] r2 = r2.f5114l
            r4 = 0
        L_0x0130:
            if (r4 >= r3) goto L_0x0156
            r5 = 5
            int r5 = r0.g(r5)
            r6 = r2[r4]
            r9 = 0
        L_0x013a:
            if (r9 >= r13) goto L_0x0153
        L_0x013c:
            boolean r10 = r35.b()
            if (r10 == 0) goto L_0x014d
            boolean r10 = r35.b()
            if (r10 == 0) goto L_0x014a
            r10 = -1
            goto L_0x014b
        L_0x014a:
            r10 = 1
        L_0x014b:
            int r5 = r5 + r10
            goto L_0x013c
        L_0x014d:
            char r10 = (char) r5
            r6[r9] = r10
            int r9 = r9 + 1
            goto L_0x013a
        L_0x0153:
            int r4 = r4 + 1
            goto L_0x0130
        L_0x0156:
            m.a.a.a.b.b.a$a r2 = r0.z
            char[][] r4 = r2.f5114l
            int[] r5 = r2.f5111i
            int[][] r6 = r2.f5108f
            int[][] r9 = r2.f5109g
            int[][] r2 = r2.f5110h
            r10 = 0
        L_0x0163:
            if (r10 >= r3) goto L_0x0204
            r11 = 32
            r15 = r4[r10]
            r17 = r13
            r12 = 0
        L_0x016c:
            int r17 = r17 + -1
            if (r17 < 0) goto L_0x017b
            char r7 = r15[r17]
            if (r7 <= r12) goto L_0x0175
            r12 = r7
        L_0x0175:
            if (r7 >= r11) goto L_0x0178
            r11 = r7
        L_0x0178:
            r7 = 23
            goto L_0x016c
        L_0x017b:
            r7 = r6[r10]
            r15 = r9[r10]
            r17 = r2[r10]
            r20 = r4[r10]
            r1 = r11
            r22 = 0
        L_0x0186:
            if (r1 > r12) goto L_0x019d
        L_0x0188:
            if (r8 >= r13) goto L_0x0198
            char r14 = r20[r8]
            if (r14 != r1) goto L_0x0194
            int r14 = r22 + 1
            r17[r22] = r8
            r22 = r14
        L_0x0194:
            int r8 = r8 + 1
            r14 = -1
            goto L_0x0188
        L_0x0198:
            int r1 = r1 + 1
            r8 = 0
            r14 = -1
            goto L_0x0186
        L_0x019d:
            r1 = 23
        L_0x019f:
            r8 = -1
            int r1 = r1 + r8
            if (r1 <= 0) goto L_0x01a9
            r8 = 0
            r15[r1] = r8
            r7[r1] = r8
            goto L_0x019f
        L_0x01a9:
            r1 = 0
        L_0x01aa:
            if (r1 >= r13) goto L_0x01b9
            char r8 = r20[r1]
            r14 = 1
            int r8 = r8 + r14
            r17 = r15[r8]
            int r17 = r17 + 1
            r15[r8] = r17
            int r1 = r1 + 1
            goto L_0x01aa
        L_0x01b9:
            r1 = 0
            r8 = r15[r1]
            r1 = 1
            r14 = 23
        L_0x01bf:
            if (r1 >= r14) goto L_0x01ca
            r17 = r15[r1]
            int r8 = r8 + r17
            r15[r1] = r8
            int r1 = r1 + 1
            goto L_0x01bf
        L_0x01ca:
            r1 = r15[r11]
            r14 = r11
            r8 = 0
        L_0x01ce:
            if (r14 > r12) goto L_0x01e3
            int r17 = r14 + 1
            r20 = r15[r17]
            int r1 = r20 - r1
            int r1 = r1 + r8
            int r8 = r1 + -1
            r7[r14] = r8
            r8 = 1
            int r1 = r1 << r8
            r8 = r1
            r14 = r17
            r1 = r20
            goto L_0x01ce
        L_0x01e3:
            r8 = 1
            int r1 = r11 + 1
        L_0x01e6:
            if (r1 > r12) goto L_0x01f7
            int r14 = r1 + -1
            r14 = r7[r14]
            int r14 = r14 + r8
            int r14 = r14 << r8
            r8 = r15[r1]
            int r14 = r14 - r8
            r15[r1] = r14
            int r1 = r1 + 1
            r8 = 1
            goto L_0x01e6
        L_0x01f7:
            r5[r10] = r11
            int r10 = r10 + 1
            r1 = 1
            r7 = 23
            r8 = 0
            r12 = 16
            r14 = -1
            goto L_0x0163
        L_0x0204:
            java.io.InputStream r1 = r0.f5103k
            m.a.a.a.b.b.a$a r2 = r0.z
            byte[] r3 = r2.o
            int[] r4 = r2.f5107e
            byte[] r5 = r2.c
            byte[] r6 = r2.b
            char[] r7 = r2.f5113k
            int[] r8 = r2.f5111i
            int[][] r9 = r2.f5108f
            int[][] r10 = r2.f5109g
            int[][] r2 = r2.f5110h
            int r11 = r0.f5097e
            r12 = 100000(0x186a0, float:1.4013E-40)
            int r11 = r11 * r12
            r12 = -1
            r16 = 256(0x100, float:3.59E-43)
        L_0x0224:
            int r13 = r16 + -1
            if (r13 < 0) goto L_0x0232
            char r12 = (char) r13
            r7[r13] = r12
            r12 = 0
            r4[r13] = r12
            r16 = r13
            r12 = -1
            goto L_0x0224
        L_0x0232:
            r12 = 0
            int r13 = r0.f5102j
            r14 = 1
            int r13 = r13 + r14
            java.io.InputStream r14 = r0.f5103k
            m.a.a.a.b.b.a$a r15 = r0.z
            r16 = r1
            byte[] r1 = r15.c
            byte r1 = r1[r12]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[][] r12 = r15.f5108f
            r12 = r12[r1]
            r17 = r3
            int[] r3 = r15.f5111i
            r3 = r3[r1]
            int r19 = r0.g(r3)
            r20 = r3
            int r3 = r0.f5100h
            r22 = r3
            int r3 = r0.f5099g
            r24 = r11
            r33 = r6
            r6 = r3
            r3 = r20
            r20 = r33
            r34 = r19
            r19 = r4
            r4 = r22
            r22 = r7
            r7 = r34
        L_0x026c:
            r11 = r12[r3]
            r25 = r12
            java.lang.String r12 = "unexpected end of stream"
            if (r7 <= r11) goto L_0x0297
            int r3 = r3 + 1
        L_0x0276:
            r11 = 1
            if (r4 >= r11) goto L_0x028b
            int r11 = r14.read()
            if (r11 < 0) goto L_0x0285
            int r6 = r6 << 8
            r6 = r6 | r11
            int r4 = r4 + 8
            goto L_0x0276
        L_0x0285:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x028b:
            int r4 = r4 + -1
            int r7 = r7 << 1
            int r11 = r6 >> r4
            r12 = 1
            r11 = r11 & r12
            r7 = r7 | r11
            r12 = r25
            goto L_0x026c
        L_0x0297:
            r0.f5100h = r4
            r0.f5099g = r6
            int[][] r11 = r15.f5110h
            r11 = r11[r1]
            int[][] r14 = r15.f5109g
            r1 = r14[r1]
            r1 = r1[r3]
            int r7 = r7 - r1
            r1 = r11[r7]
            r3 = 0
            byte r7 = r5[r3]
            r3 = r7 & 255(0xff, float:3.57E-43)
            r7 = r10[r3]
            r11 = r9[r3]
            r14 = r2[r3]
            r3 = r8[r3]
            r15 = r14
            r25 = 0
            r26 = 49
            r14 = r11
            r11 = -1
        L_0x02bc:
            if (r1 == r13) goto L_0x044d
            r27 = r3
            java.lang.String r3 = "block overrun"
            r28 = r7
            if (r1 == 0) goto L_0x0384
            r7 = 1
            if (r1 != r7) goto L_0x02cb
            goto L_0x0384
        L_0x02cb:
            int r11 = r11 + 1
            r7 = r24
            if (r11 >= r7) goto L_0x037e
            int r3 = r1 + -1
            char r24 = r22[r3]
            r29 = r13
            byte r13 = r20[r24]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r30 = r19[r13]
            r21 = 1
            int r30 = r30 + 1
            r19[r13] = r30
            byte r13 = r20[r24]
            r17[r11] = r13
            r13 = 16
            if (r1 > r13) goto L_0x02fb
        L_0x02eb:
            if (r3 <= 0) goto L_0x02f5
            int r1 = r3 + -1
            char r18 = r22[r1]
            r22[r3] = r18
            r3 = r1
            goto L_0x02eb
        L_0x02f5:
            r1 = r22
            r13 = 0
            r22 = r11
            goto L_0x0304
        L_0x02fb:
            r1 = r22
            r13 = 0
            r22 = r11
            r11 = 1
            java.lang.System.arraycopy(r1, r13, r1, r11, r3)
        L_0x0304:
            r1[r13] = r24
            if (r26 != 0) goto L_0x031b
            int r25 = r25 + 1
            byte r3 = r5[r25]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r11 = r10[r3]
            r13 = r9[r3]
            r14 = r2[r3]
            r3 = r8[r3]
            r15 = r14
            r26 = 49
            r14 = r13
            goto L_0x0321
        L_0x031b:
            int r26 = r26 + -1
            r3 = r27
            r11 = r28
        L_0x0321:
            if (r4 >= r3) goto L_0x0335
            int r13 = r16.read()
            if (r13 < 0) goto L_0x032f
            int r6 = r6 << 8
            r6 = r6 | r13
            int r4 = r4 + 8
            goto L_0x0321
        L_0x032f:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0335:
            int r4 = r4 - r3
            int r13 = r6 >> r4
            r24 = r1
            r1 = 1
            int r21 = r1 << r3
            r23 = -1
            int r21 = r21 + -1
            r13 = r13 & r21
            r27 = r3
        L_0x0345:
            r1 = r14[r27]
            if (r13 <= r1) goto L_0x036c
            int r27 = r27 + 1
        L_0x034b:
            r1 = 1
            if (r4 >= r1) goto L_0x0360
            int r1 = r16.read()
            if (r1 < 0) goto L_0x035a
            int r6 = r6 << 8
            r6 = r6 | r1
            int r4 = r4 + 8
            goto L_0x034b
        L_0x035a:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0360:
            int r4 = r4 + -1
            int r1 = r13 << 1
            int r13 = r6 >> r4
            r21 = 1
            r13 = r13 & 1
            r13 = r13 | r1
            goto L_0x0345
        L_0x036c:
            r1 = r11[r27]
            int r13 = r13 - r1
            r1 = r15[r13]
            r13 = r29
            r33 = r24
            r24 = r7
            r7 = r11
            r11 = r22
            r22 = r33
            goto L_0x02bc
        L_0x037e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r3)
            throw r1
        L_0x0384:
            r29 = r13
            r13 = r22
            r7 = r24
            r22 = r14
            r24 = r15
            r14 = -1
            r15 = 1
        L_0x0390:
            if (r1 != 0) goto L_0x0396
            int r14 = r14 + r15
            r30 = r4
            goto L_0x039e
        L_0x0396:
            r30 = r4
            r4 = 1
            if (r1 != r4) goto L_0x0416
            int r1 = r15 << 1
            int r14 = r14 + r1
        L_0x039e:
            if (r26 != 0) goto L_0x03b3
            int r25 = r25 + 1
            byte r1 = r5[r25]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r28 = r10[r1]
            r22 = r9[r1]
            r24 = r2[r1]
            r27 = r8[r1]
            r1 = r27
            r26 = 49
            goto L_0x03b7
        L_0x03b3:
            int r26 = r26 + -1
            r1 = r27
        L_0x03b7:
            r4 = r30
        L_0x03b9:
            if (r4 >= r1) goto L_0x03ce
            int r27 = r16.read()
            if (r27 < 0) goto L_0x03c8
            int r6 = r6 << 8
            r6 = r6 | r27
            int r4 = r4 + 8
            goto L_0x03b9
        L_0x03c8:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x03ce:
            int r4 = r4 - r1
            int r27 = r6 >> r4
            r31 = r2
            r2 = 1
            int r21 = r2 << r1
            r23 = -1
            int r21 = r21 + -1
            r21 = r27 & r21
            r27 = r1
            r32 = r27
            r2 = r21
        L_0x03e2:
            r1 = r22[r27]
            if (r2 <= r1) goto L_0x0409
            int r27 = r27 + 1
        L_0x03e8:
            r1 = 1
            if (r4 >= r1) goto L_0x03fd
            int r1 = r16.read()
            if (r1 < 0) goto L_0x03f7
            int r6 = r6 << 8
            r6 = r6 | r1
            int r4 = r4 + 8
            goto L_0x03e8
        L_0x03f7:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x03fd:
            int r4 = r4 + -1
            int r1 = r2 << 1
            int r2 = r6 >> r4
            r21 = 1
            r2 = r2 & 1
            r2 = r2 | r1
            goto L_0x03e2
        L_0x0409:
            r1 = r28[r27]
            int r2 = r2 - r1
            r1 = r24[r2]
            int r15 = r15 << 1
            r2 = r31
            r27 = r32
            goto L_0x0390
        L_0x0416:
            r31 = r2
            r2 = 0
            char r4 = r13[r2]
            byte r2 = r20[r4]
            r4 = r2 & 255(0xff, float:3.57E-43)
            r15 = r19[r4]
            int r32 = r14 + 1
            int r32 = r32 + r15
            r19[r4] = r32
        L_0x0427:
            int r4 = r14 + -1
            if (r14 < 0) goto L_0x0431
            int r11 = r11 + 1
            r17[r11] = r2
            r14 = r4
            goto L_0x0427
        L_0x0431:
            if (r11 >= r7) goto L_0x0447
            r14 = r22
            r15 = r24
            r3 = r27
            r4 = r30
            r2 = r31
            r24 = r7
            r22 = r13
            r7 = r28
            r13 = r29
            goto L_0x02bc
        L_0x0447:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r3)
            throw r1
        L_0x044d:
            r0.c = r11
            r0.f5100h = r4
            r0.f5099g = r6
            m.a.a.a.b.b.b r1 = r0.f5101i
            r2 = -1
            r1.a = r2
            r1 = 1
            r0.f5104l = r1
            return
        L_0x045c:
            r1 = 0
            r0.f5104l = r1
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad block header"
            r1.<init>(r2)
            goto L_0x0468
        L_0x0467:
            throw r1
        L_0x0468:
            goto L_0x0467
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.a.a.b.b.a.n():void");
    }

    public final int o() throws IOException {
        switch (this.f5104l) {
            case 0:
                return -1;
            case 1:
                return q();
            case 2:
                throw new IllegalStateException();
            case 3:
                return v();
            case 4:
                return x();
            case 5:
                throw new IllegalStateException();
            case 6:
                if (this.r != this.s) {
                    this.q = 1;
                } else {
                    int i2 = this.q + 1;
                    this.q = i2;
                    if (i2 >= 4) {
                        C0199a aVar = this.z;
                        byte[] bArr = aVar.o;
                        int i3 = this.x;
                        this.y = (char) (bArr[i3] & 255);
                        this.x = aVar.n[i3];
                        this.u = 0;
                        return t();
                    }
                }
                return s();
            case 7:
                return t();
            default:
                throw new IllegalStateException();
        }
    }

    public final int q() throws IOException {
        C0199a aVar;
        if (this.f5104l == 0 || (aVar = this.z) == null) {
            return -1;
        }
        int[] iArr = aVar.f5112j;
        int i2 = this.c + 1;
        int[] iArr2 = aVar.n;
        if (iArr2 == null || iArr2.length < i2) {
            iArr2 = new int[i2];
            aVar.n = iArr2;
        }
        byte[] bArr = aVar.o;
        iArr[0] = 0;
        System.arraycopy(aVar.f5107e, 0, iArr, 1, 256);
        int i3 = iArr[0];
        for (int i4 = 1; i4 <= 256; i4++) {
            i3 += iArr[i4];
            iArr[i4] = i3;
        }
        int i5 = this.c;
        for (int i6 = 0; i6 <= i5; i6++) {
            byte b = bArr[i6] & 255;
            int i7 = iArr[b];
            iArr[b] = i7 + 1;
            iArr2[i7] = i6;
        }
        int i8 = this.f5096d;
        if (i8 < 0 || i8 >= iArr2.length) {
            throw new IOException("stream corrupted");
        }
        this.x = iArr2[i8];
        this.q = 0;
        this.t = 0;
        this.r = 256;
        if (!this.f5098f) {
            return s();
        }
        this.v = 0;
        this.w = 0;
        return u();
    }

    public int read() throws IOException {
        if (this.f5103k != null) {
            int o2 = o();
            a(o2 < 0 ? -1 : 1);
            return o2;
        }
        throw new IOException("stream closed");
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(g.a.a.a.a.r("offs(", i2, ") < 0."));
        } else if (i3 >= 0) {
            int i4 = i2 + i3;
            if (i4 > bArr.length) {
                throw new IndexOutOfBoundsException(g.a.a.a.a.e(g.a.a.a.a.k("offs(", i2, ") + len(", i3, ") > dest.length("), bArr.length, ")."));
            } else if (this.f5103k == null) {
                throw new IOException("stream closed");
            } else if (i3 == 0) {
                return 0;
            } else {
                int i5 = i2;
                while (i5 < i4) {
                    int o2 = o();
                    if (o2 < 0) {
                        break;
                    }
                    bArr[i5] = (byte) o2;
                    a(1);
                    i5++;
                }
                if (i5 == i2) {
                    return -1;
                }
                return i5 - i2;
            }
        } else {
            throw new IndexOutOfBoundsException(g.a.a.a.a.r("len(", i3, ") < 0."));
        }
    }

    public final int s() throws IOException {
        int i2 = this.t;
        if (i2 <= this.c) {
            this.s = this.r;
            C0199a aVar = this.z;
            byte[] bArr = aVar.o;
            int i3 = this.x;
            byte b = bArr[i3] & 255;
            this.r = b;
            this.x = aVar.n[i3];
            this.t = i2 + 1;
            this.f5104l = 6;
            this.f5101i.a(b);
            return b;
        }
        this.f5104l = 5;
        j();
        n();
        return q();
    }

    public final int t() throws IOException {
        if (this.u < this.y) {
            int i2 = this.r;
            this.f5101i.a(i2);
            this.u++;
            this.f5104l = 7;
            return i2;
        }
        this.t++;
        this.q = 0;
        return s();
    }

    public final int u() throws IOException {
        if (this.t <= this.c) {
            this.s = this.r;
            C0199a aVar = this.z;
            byte[] bArr = aVar.o;
            int i2 = this.x;
            byte b = bArr[i2] & 255;
            this.x = aVar.n[i2];
            int i3 = this.v;
            byte b2 = 0;
            if (i3 == 0) {
                this.v = c.a(this.w) - 1;
                int i4 = this.w + 1;
                this.w = i4;
                if (i4 == 512) {
                    this.w = 0;
                }
            } else {
                this.v = i3 - 1;
            }
            if (this.v == 1) {
                b2 = 1;
            }
            byte b3 = b ^ b2;
            this.r = b3;
            this.t++;
            this.f5104l = 3;
            this.f5101i.a(b3);
            return b3;
        }
        j();
        n();
        return q();
    }

    public final int v() throws IOException {
        if (this.r != this.s) {
            this.f5104l = 2;
            this.q = 1;
        } else {
            int i2 = this.q + 1;
            this.q = i2;
            if (i2 >= 4) {
                C0199a aVar = this.z;
                byte[] bArr = aVar.o;
                int i3 = this.x;
                this.y = (char) (bArr[i3] & 255);
                this.x = aVar.n[i3];
                int i4 = this.v;
                if (i4 == 0) {
                    this.v = c.a(this.w) - 1;
                    int i5 = this.w + 1;
                    this.w = i5;
                    if (i5 == 512) {
                        this.w = 0;
                    }
                } else {
                    this.v = i4 - 1;
                }
                this.u = 0;
                this.f5104l = 4;
                if (this.v == 1) {
                    this.y = (char) (this.y ^ 1);
                }
                return x();
            }
            this.f5104l = 2;
        }
        return u();
    }

    public final int x() throws IOException {
        if (this.u < this.y) {
            this.f5101i.a(this.r);
            this.u++;
            return this.r;
        }
        this.f5104l = 2;
        this.t++;
        this.q = 0;
        return u();
    }
}
