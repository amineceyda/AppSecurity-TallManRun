package m.a.a.a.a.b;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import m.a.a.a.a.b.f0;

public class h0 implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final long f5021m = i0.d(c0.c);
    public final List<b0> b = new LinkedList();
    public final Map<String, LinkedList<b0>> c = new HashMap(509);

    /* renamed from: d  reason: collision with root package name */
    public final e0 f5022d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5023e;

    /* renamed from: f  reason: collision with root package name */
    public final RandomAccessFile f5024f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5025g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f5026h = true;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f5027i = new byte[8];

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f5028j = new byte[4];

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f5029k = new byte[42];

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f5030l = new byte[2];

    public class a extends InflaterInputStream {
        public final /* synthetic */ Inflater b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, Inflater inflater, Inflater inflater2) {
            super(inputStream, inflater);
            this.b = inflater2;
        }

        public void close() throws IOException {
            try {
                super.close();
            } finally {
                this.b.end();
            }
        }
    }

    public static class c extends b0 {

        /* renamed from: m  reason: collision with root package name */
        public final e f5033m;

        public c(e eVar) {
            this.f5033m = eVar;
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            e eVar = this.f5033m;
            long j2 = eVar.a;
            e eVar2 = ((c) obj).f5033m;
            if (j2 == eVar2.a && eVar.b == eVar2.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (super.hashCode() * 3) + ((int) (this.f5033m.a % 2147483647L));
        }
    }

    public static final class d {
        public final byte[] a;
        public final byte[] b;

        public d(byte[] bArr, byte[] bArr2, a aVar) {
            this.a = bArr;
            this.b = bArr2;
        }
    }

    public static final class e {
        public long a = -1;
        public long b = -1;

        public e(a aVar) {
        }
    }

    public h0(File file) throws IOException {
        boolean z;
        e0 e0Var;
        this.f5023e = file.getAbsolutePath();
        Map<String, f0.a> map = f0.a;
        Charset charset = m.a.a.a.c.b.a;
        if (charset.name().equalsIgnoreCase("UTF8")) {
            z = true;
        } else {
            Iterator<String> it = charset.aliases().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equalsIgnoreCase("UTF8")) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (z) {
            e0Var = f0.b;
        } else {
            f0.a aVar = f0.a.get("UTF8");
            if (aVar != null) {
                synchronized (aVar) {
                    if (aVar.b == null) {
                        aVar.b = new m(aVar.a);
                    }
                    e0Var = aVar.b;
                }
            } else {
                try {
                    e0Var = new k(Charset.forName("UTF8"));
                } catch (UnsupportedCharsetException unused) {
                    e0Var = new h("UTF8");
                }
            }
        }
        this.f5022d = e0Var;
        this.f5025g = true;
        this.f5024f = new RandomAccessFile(file, "r");
        try {
            f(d());
            this.f5026h = false;
        } catch (Throwable th) {
            this.f5026h = true;
            RandomAccessFile randomAccessFile = this.f5024f;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public b0 a(String str) {
        LinkedList linkedList = this.c.get(str);
        if (linkedList != null) {
            return (b0) linkedList.getFirst();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream b(m.a.a.a.a.b.b0 r11) throws java.io.IOException, java.util.zip.ZipException {
        /*
            r10 = this;
            boolean r0 = r11 instanceof m.a.a.a.a.b.h0.c
            if (r0 != 0) goto L_0x0006
            r11 = 0
            return r11
        L_0x0006:
            r0 = r11
            m.a.a.a.a.b.h0$c r0 = (m.a.a.a.a.b.h0.c) r0
            m.a.a.a.a.b.h0$e r0 = r0.f5033m
            int r1 = m.a.a.a.a.b.l0.a
            m.a.a.a.a.b.i r1 = r11.f5010j
            boolean r1 = r1.f5034d
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00c9
            int r1 = r11.b
            r3 = 8
            if (r1 == 0) goto L_0x003c
            m.a.a.a.a.b.j0 r4 = m.a.a.a.a.b.j0.UNSHRINKING
            int r4 = r4.a()
            if (r1 == r4) goto L_0x003c
            int r1 = r11.b
            m.a.a.a.a.b.j0 r4 = m.a.a.a.a.b.j0.IMPLODING
            int r4 = r4.a()
            if (r1 == r4) goto L_0x003c
            int r1 = r11.b
            if (r1 == r3) goto L_0x003c
            m.a.a.a.a.b.j0 r4 = m.a.a.a.a.b.j0.BZIP2
            int r4 = r4.a()
            if (r1 != r4) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r1 = 0
            goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            if (r1 != 0) goto L_0x005d
            int r0 = r11.b
            java.util.Map<java.lang.Integer, m.a.a.a.a.b.j0> r1 = m.a.a.a.a.b.j0.t
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            m.a.a.a.a.b.j0 r0 = (m.a.a.a.a.b.j0) r0
            if (r0 != 0) goto L_0x0057
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$a r1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.a.c
            r0.<init>((org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.a) r1, (m.a.a.a.a.b.b0) r11)
            throw r0
        L_0x0057:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r1 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            r1.<init>((m.a.a.a.a.b.j0) r0, (m.a.a.a.a.b.b0) r11)
            throw r1
        L_0x005d:
            long r6 = r0.b
            m.a.a.a.a.b.h0$b r0 = new m.a.a.a.a.b.h0$b
            long r8 = r11.getCompressedSize()
            r4 = r0
            r5 = r10
            r4.<init>(r6, r8)
            int r1 = r11.b
            java.util.Map<java.lang.Integer, m.a.a.a.a.b.j0> r4 = m.a.a.a.a.b.j0.t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            m.a.a.a.a.b.j0 r1 = (m.a.a.a.a.b.j0) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x00c8
            if (r1 == r2) goto L_0x00c2
            r4 = 6
            if (r1 == r4) goto L_0x00b1
            if (r1 == r3) goto L_0x00a4
            r2 = 11
            if (r1 != r2) goto L_0x008f
            m.a.a.a.b.b.a r11 = new m.a.a.a.b.b.a
            r11.<init>(r0)
            return r11
        L_0x008f:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "Found unsupported compression method "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            int r11 = r11.b
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x00a4:
            r0.f5031d = r2
            java.util.zip.Inflater r11 = new java.util.zip.Inflater
            r11.<init>(r2)
            m.a.a.a.a.b.h0$a r1 = new m.a.a.a.a.b.h0$a
            r1.<init>(r0, r11, r11)
            return r1
        L_0x00b1:
            m.a.a.a.a.b.f r1 = new m.a.a.a.a.b.f
            m.a.a.a.a.b.i r11 = r11.f5010j
            int r2 = r11.f5036f
            int r11 = r11.f5037g
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            r3.<init>(r0)
            r1.<init>(r2, r11, r3)
            return r1
        L_0x00c2:
            m.a.a.a.a.b.r r11 = new m.a.a.a.a.b.r
            r11.<init>(r0)
            return r11
        L_0x00c8:
            return r0
        L_0x00c9:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$a r1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.a.b
            r0.<init>((org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.a) r1, (m.a.a.a.a.b.b0) r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.a.a.a.b.h0.b(m.a.a.a.a.b.b0):java.io.InputStream");
    }

    public void close() throws IOException {
        this.f5026h = true;
        this.f5024f.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<m.a.a.a.a.b.b0, m.a.a.a.a.b.h0.d> d() throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            byte[] r2 = m.a.a.a.a.b.c0.f5011d
            java.io.RandomAccessFile r3 = r1.f5024f
            long r3 = r3.length()
            r5 = 22
            long r3 = r3 - r5
            java.io.RandomAccessFile r5 = r1.f5024f
            long r5 = r5.length()
            r7 = 65557(0x10015, double:3.23895E-319)
            long r5 = r5 - r7
            r7 = 0
            long r5 = java.lang.Math.max(r7, r5)
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            int r13 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r13 < 0) goto L_0x0065
        L_0x002a:
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0065
            java.io.RandomAccessFile r13 = r1.f5024f
            r13.seek(r3)
            java.io.RandomAccessFile r13 = r1.f5024f
            int r13 = r13.read()
            r14 = -1
            if (r13 != r14) goto L_0x003d
            goto L_0x0065
        L_0x003d:
            byte r14 = r2[r12]
            if (r13 != r14) goto L_0x0061
            java.io.RandomAccessFile r13 = r1.f5024f
            int r13 = r13.read()
            byte r14 = r2[r11]
            if (r13 != r14) goto L_0x0061
            java.io.RandomAccessFile r13 = r1.f5024f
            int r13 = r13.read()
            byte r14 = r2[r10]
            if (r13 != r14) goto L_0x0061
            java.io.RandomAccessFile r13 = r1.f5024f
            int r13 = r13.read()
            byte r14 = r2[r9]
            if (r13 != r14) goto L_0x0061
            r2 = 1
            goto L_0x0066
        L_0x0061:
            r13 = 1
            long r3 = r3 - r13
            goto L_0x002a
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 == 0) goto L_0x006d
            java.io.RandomAccessFile r5 = r1.f5024f
            r5.seek(r3)
        L_0x006d:
            if (r2 == 0) goto L_0x03c0
            java.io.RandomAccessFile r2 = r1.f5024f
            long r2 = r2.getFilePointer()
            r4 = 20
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x007d
            r2 = 1
            goto L_0x007e
        L_0x007d:
            r2 = 0
        L_0x007e:
            if (r2 == 0) goto L_0x009a
            java.io.RandomAccessFile r3 = r1.f5024f
            long r13 = r3.getFilePointer()
            long r13 = r13 - r4
            r3.seek(r13)
            java.io.RandomAccessFile r3 = r1.f5024f
            byte[] r4 = r1.f5028j
            r3.readFully(r4)
            byte[] r3 = m.a.a.a.a.b.c0.f5013f
            byte[] r4 = r1.f5028j
            boolean r3 = java.util.Arrays.equals(r3, r4)
            goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            r4 = 16
            r5 = 4
            if (r3 != 0) goto L_0x00bb
            if (r2 == 0) goto L_0x00a5
            r1.g(r4)
        L_0x00a5:
            r1.g(r4)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5028j
            r2.readFully(r3)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5028j
            long r13 = m.a.a.a.a.b.i0.d(r3)
            r2.seek(r13)
            goto L_0x0100
        L_0x00bb:
            r1.g(r5)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5027i
            r2.readFully(r3)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5027i
            java.math.BigInteger r3 = m.a.a.a.a.b.d0.c(r3, r12)
            long r13 = r3.longValue()
            r2.seek(r13)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5028j
            r2.readFully(r3)
            byte[] r2 = r1.f5028j
            byte[] r3 = m.a.a.a.a.b.c0.f5012e
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L_0x03b8
            r2 = 44
            r1.g(r2)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5027i
            r2.readFully(r3)
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5027i
            java.math.BigInteger r3 = m.a.a.a.a.b.d0.c(r3, r12)
            long r13 = r3.longValue()
            r2.seek(r13)
        L_0x0100:
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5028j
            r2.readFully(r3)
            byte[] r2 = r1.f5028j
            long r2 = m.a.a.a.a.b.i0.d(r2)
            long r13 = f5021m
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0132
            java.io.RandomAccessFile r6 = r1.f5024f
            r6.seek(r7)
            java.io.RandomAccessFile r6 = r1.f5024f
            byte[] r7 = r1.f5028j
            r6.readFully(r7)
            byte[] r6 = r1.f5028j
            byte[] r7 = m.a.a.a.a.b.c0.b
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L_0x012a
            goto L_0x0132
        L_0x012a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "central directory is empty, can't expand corrupt archive."
            r0.<init>(r2)
            throw r0
        L_0x0132:
            long r6 = f5021m
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x03b7
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5029k
            r2.readFully(r3)
            m.a.a.a.a.b.h0$e r2 = new m.a.a.a.a.b.h0$e
            r3 = 0
            r2.<init>(r3)
            m.a.a.a.a.b.h0$c r3 = new m.a.a.a.a.b.h0$c
            r3.<init>(r2)
            byte[] r6 = r1.f5029k
            int r6 = m.a.a.a.a.b.k0.d(r6, r12)
            r7 = 8
            int r6 = r6 >> r7
            r6 = r6 & 15
            r3.f5005e = r6
            byte[] r6 = r1.f5029k
            m.a.a.a.a.b.k0.d(r6, r10)
            byte[] r6 = r1.f5029k
            int r6 = m.a.a.a.a.b.k0.d(r6, r5)
            m.a.a.a.a.b.i r8 = new m.a.a.a.a.b.i
            r8.<init>()
            r9 = r6 & 8
            if (r9 == 0) goto L_0x016d
            r9 = 1
            goto L_0x016e
        L_0x016d:
            r9 = 0
        L_0x016e:
            r8.c = r9
            r9 = r6 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0176
            r9 = 1
            goto L_0x0177
        L_0x0176:
            r9 = 0
        L_0x0177:
            r8.b = r9
            r13 = r6 & 64
            if (r13 == 0) goto L_0x017f
            r13 = 1
            goto L_0x0180
        L_0x017f:
            r13 = 0
        L_0x0180:
            r8.f5035e = r13
            if (r13 == 0) goto L_0x0186
            r8.f5034d = r11
        L_0x0186:
            r13 = r6 & 1
            if (r13 == 0) goto L_0x018c
            r13 = 1
            goto L_0x018d
        L_0x018c:
            r13 = 0
        L_0x018d:
            r8.f5034d = r13
            r13 = r6 & 2
            if (r13 == 0) goto L_0x0196
            r13 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0198
        L_0x0196:
            r13 = 4096(0x1000, float:5.74E-42)
        L_0x0198:
            r8.f5036f = r13
            r6 = r6 & 4
            if (r6 == 0) goto L_0x01a0
            r6 = 3
            goto L_0x01a1
        L_0x01a0:
            r6 = 2
        L_0x01a1:
            r8.f5037g = r6
            if (r9 == 0) goto L_0x01a8
            m.a.a.a.a.b.e0 r6 = m.a.a.a.a.b.f0.b
            goto L_0x01aa
        L_0x01a8:
            m.a.a.a.a.b.e0 r6 = r1.f5022d
        L_0x01aa:
            r3.f5010j = r8
            byte[] r8 = r1.f5029k
            m.a.a.a.a.b.k0.d(r8, r5)
            r5 = 6
            byte[] r8 = r1.f5029k
            int r5 = m.a.a.a.a.b.k0.d(r8, r5)
            r3.setMethod(r5)
            byte[] r5 = r1.f5029k
            long r7 = m.a.a.a.a.b.i0.e(r5, r7)
            int r5 = m.a.a.a.a.b.l0.a
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            r13 = 25
            long r13 = r7 >> r13
            r15 = 127(0x7f, double:6.27E-322)
            long r13 = r13 & r15
            int r14 = (int) r13
            int r14 = r14 + 1980
            r5.set(r11, r14)
            r13 = 21
            long r13 = r7 >> r13
            r15 = 15
            long r13 = r13 & r15
            int r14 = (int) r13
            int r14 = r14 - r11
            r5.set(r10, r14)
            long r13 = r7 >> r4
            int r4 = (int) r13
            r4 = r4 & 31
            r10 = 5
            r5.set(r10, r4)
            r4 = 11
            long r13 = r7 >> r4
            int r14 = (int) r13
            r13 = r14 & 31
            r5.set(r4, r13)
            long r13 = r7 >> r10
            int r4 = (int) r13
            r4 = r4 & 63
            r10 = 12
            r5.set(r10, r4)
            long r7 = r7 << r11
            int r4 = (int) r7
            r4 = r4 & 62
            r7 = 13
            r5.set(r7, r4)
            r4 = 14
            r5.set(r4, r12)
            java.util.Date r4 = r5.getTime()
            long r4 = r4.getTime()
            r3.setTime(r4)
            byte[] r4 = r1.f5029k
            long r4 = m.a.a.a.a.b.i0.e(r4, r10)
            r3.setCrc(r4)
            byte[] r4 = r1.f5029k
            r5 = 16
            long r4 = m.a.a.a.a.b.i0.e(r4, r5)
            r3.setCompressedSize(r4)
            r4 = 20
            byte[] r5 = r1.f5029k
            long r4 = m.a.a.a.a.b.i0.e(r5, r4)
            r3.setSize(r4)
            r4 = 24
            byte[] r5 = r1.f5029k
            int r4 = m.a.a.a.a.b.k0.d(r5, r4)
            r5 = 26
            byte[] r7 = r1.f5029k
            int r5 = m.a.a.a.a.b.k0.d(r7, r5)
            r7 = 28
            byte[] r8 = r1.f5029k
            int r7 = m.a.a.a.a.b.k0.d(r8, r7)
            r8 = 30
            byte[] r10 = r1.f5029k
            int r8 = m.a.a.a.a.b.k0.d(r10, r8)
            r10 = 32
            byte[] r11 = r1.f5029k
            int r10 = m.a.a.a.a.b.k0.d(r11, r10)
            r3.f5004d = r10
            r10 = 34
            byte[] r11 = r1.f5029k
            long r10 = m.a.a.a.a.b.i0.e(r11, r10)
            r3.f5006f = r10
            r10 = 38
            byte[] r4 = new byte[r4]
            java.io.RandomAccessFile r11 = r1.f5024f
            r11.readFully(r4)
            java.lang.String r11 = r6.a(r4)
            r3.g(r11)
            byte[] r11 = r1.f5029k
            long r10 = m.a.a.a.a.b.i0.e(r11, r10)
            r2.a = r10
            java.util.List<m.a.a.a.a.b.b0> r10 = r1.b
            r10.add(r3)
            byte[] r5 = new byte[r5]
            java.io.RandomAccessFile r10 = r1.f5024f
            r10.readFully(r5)
            m.a.a.a.a.b.g$a r10 = m.a.a.a.a.b.g.a.a     // Catch:{ ZipException -> 0x03ac }
            m.a.a.a.a.b.g0[] r5 = m.a.a.a.a.b.g.b(r5, r12, r10)     // Catch:{ ZipException -> 0x03ac }
            r3.d(r5, r12)     // Catch:{ ZipException -> 0x03ac }
            m.a.a.a.a.b.k0 r5 = m.a.a.a.a.b.a0.f4992g
            m.a.a.a.a.b.g0 r5 = r3.c(r5)
            m.a.a.a.a.b.a0 r5 = (m.a.a.a.a.b.a0) r5
            if (r5 == 0) goto L_0x0374
            long r10 = r3.c
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x02ad
            r10 = 1
            goto L_0x02ae
        L_0x02ad:
            r10 = 0
        L_0x02ae:
            long r15 = r3.getCompressedSize()
            int r11 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x02b8
            r11 = 1
            goto L_0x02b9
        L_0x02b8:
            r11 = 0
        L_0x02b9:
            r15 = r0
            long r0 = r2.a
            int r16 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x02c2
            r0 = 1
            goto L_0x02c3
        L_0x02c2:
            r0 = 0
        L_0x02c3:
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r8 != r1) goto L_0x02ca
            r1 = 1
            goto L_0x02cb
        L_0x02ca:
            r1 = 0
        L_0x02cb:
            byte[] r8 = r5.f4996f
            if (r8 == 0) goto L_0x0339
            if (r10 == 0) goto L_0x02d4
            r13 = 8
            goto L_0x02d5
        L_0x02d4:
            r13 = 0
        L_0x02d5:
            if (r11 == 0) goto L_0x02da
            r14 = 8
            goto L_0x02db
        L_0x02da:
            r14 = 0
        L_0x02db:
            int r13 = r13 + r14
            if (r0 == 0) goto L_0x02e1
            r14 = 8
            goto L_0x02e2
        L_0x02e1:
            r14 = 0
        L_0x02e2:
            int r13 = r13 + r14
            if (r1 == 0) goto L_0x02e7
            r14 = 4
            goto L_0x02e8
        L_0x02e7:
            r14 = 0
        L_0x02e8:
            int r13 = r13 + r14
            int r8 = r8.length
            if (r8 < r13) goto L_0x0321
            if (r10 == 0) goto L_0x02fa
            m.a.a.a.a.b.d0 r8 = new m.a.a.a.a.b.d0
            byte[] r13 = r5.f4996f
            r8.<init>(r13, r12)
            r5.b = r8
            r8 = 8
            goto L_0x02fb
        L_0x02fa:
            r8 = 0
        L_0x02fb:
            if (r11 == 0) goto L_0x0308
            m.a.a.a.a.b.d0 r12 = new m.a.a.a.a.b.d0
            byte[] r13 = r5.f4996f
            r12.<init>(r13, r8)
            r5.c = r12
            int r8 = r8 + 8
        L_0x0308:
            if (r0 == 0) goto L_0x0315
            m.a.a.a.a.b.d0 r12 = new m.a.a.a.a.b.d0
            byte[] r13 = r5.f4996f
            r12.<init>(r13, r8)
            r5.f4994d = r12
            int r8 = r8 + 8
        L_0x0315:
            if (r1 == 0) goto L_0x0339
            m.a.a.a.a.b.i0 r1 = new m.a.a.a.a.b.i0
            byte[] r12 = r5.f4996f
            r1.<init>(r12, r8)
            r5.f4995e = r1
            goto L_0x0339
        L_0x0321:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length "
            java.lang.String r2 = " but is "
            java.lang.StringBuilder r1 = g.a.a.a.a.j(r1, r13, r2)
            byte[] r2 = r5.f4996f
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0339:
            if (r10 == 0) goto L_0x0345
            m.a.a.a.a.b.d0 r1 = r5.b
            long r12 = r1.b()
            r3.setSize(r12)
            goto L_0x0350
        L_0x0345:
            if (r11 == 0) goto L_0x0350
            m.a.a.a.a.b.d0 r1 = new m.a.a.a.a.b.d0
            long r12 = r3.c
            r1.<init>(r12)
            r5.b = r1
        L_0x0350:
            if (r11 == 0) goto L_0x035c
            m.a.a.a.a.b.d0 r1 = r5.c
            long r10 = r1.b()
            r3.setCompressedSize(r10)
            goto L_0x0369
        L_0x035c:
            if (r10 == 0) goto L_0x0369
            m.a.a.a.a.b.d0 r1 = new m.a.a.a.a.b.d0
            long r10 = r3.getCompressedSize()
            r1.<init>(r10)
            r5.c = r1
        L_0x0369:
            if (r0 == 0) goto L_0x0375
            m.a.a.a.a.b.d0 r0 = r5.f4994d
            long r0 = r0.b()
            r2.a = r0
            goto L_0x0375
        L_0x0374:
            r15 = r0
        L_0x0375:
            byte[] r0 = new byte[r7]
            r1 = r17
            java.io.RandomAccessFile r2 = r1.f5024f
            r2.readFully(r0)
            java.lang.String r2 = r6.a(r0)
            r3.setComment(r2)
            if (r9 != 0) goto L_0x0396
            boolean r2 = r1.f5025g
            if (r2 == 0) goto L_0x0396
            m.a.a.a.a.b.h0$d r2 = new m.a.a.a.a.b.h0$d
            r5 = 0
            r2.<init>(r4, r0, r5)
            r0 = r15
            r0.put(r3, r2)
            goto L_0x0397
        L_0x0396:
            r0 = r15
        L_0x0397:
            java.io.RandomAccessFile r2 = r1.f5024f
            byte[] r3 = r1.f5028j
            r2.readFully(r3)
            byte[] r2 = r1.f5028j
            long r2 = m.a.a.a.a.b.i0.d(r2)
            r4 = 16
            r5 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            goto L_0x0132
        L_0x03ac:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x03b7:
            return r0
        L_0x03b8:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r2 = "archive's ZIP64 end of central directory locator is corrupt."
            r0.<init>(r2)
            throw r0
        L_0x03c0:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r2 = "archive is not a ZIP archive"
            r0.<init>(r2)
            goto L_0x03c9
        L_0x03c8:
            throw r0
        L_0x03c9:
            goto L_0x03c8
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.a.a.a.b.h0.d():java.util.Map");
    }

    public final void f(Map<b0, d> map) throws IOException {
        String b2;
        Iterator<b0> it = this.b.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            e eVar = cVar.f5033m;
            long j2 = eVar.a + 26;
            this.f5024f.seek(j2);
            this.f5024f.readFully(this.f5030l);
            int d2 = k0.d(this.f5030l, 0);
            this.f5024f.readFully(this.f5030l);
            int d3 = k0.d(this.f5030l, 0);
            int i2 = d2;
            while (i2 > 0) {
                int skipBytes = this.f5024f.skipBytes(i2);
                if (skipBytes > 0) {
                    i2 -= skipBytes;
                } else {
                    throw new IOException("failed to skip file name in local file header");
                }
            }
            byte[] bArr = new byte[d3];
            this.f5024f.readFully(bArr);
            cVar.setExtra(bArr);
            eVar.b = j2 + 2 + 2 + ((long) d2) + ((long) d3);
            if (map.containsKey(cVar)) {
                d dVar = map.get(cVar);
                byte[] bArr2 = dVar.a;
                byte[] bArr3 = dVar.b;
                int i3 = l0.a;
                String name = cVar.getName();
                String b3 = l0.b((o) cVar.c(o.f5070e), bArr2);
                if (b3 != null && !name.equals(b3)) {
                    cVar.g(b3);
                }
                if (!(bArr3 == null || bArr3.length <= 0 || (b2 = l0.b((n) cVar.c(n.f5069e), bArr3)) == null)) {
                    cVar.setComment(b2);
                }
            }
            String name2 = cVar.getName();
            LinkedList linkedList = this.c.get(name2);
            if (linkedList == null) {
                linkedList = new LinkedList();
                this.c.put(name2, linkedList);
            }
            linkedList.addLast(cVar);
        }
    }

    public void finalize() throws Throwable {
        try {
            if (!this.f5026h) {
                PrintStream printStream = System.err;
                printStream.println("Cleaning up unclosed ZipFile for archive " + this.f5023e);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int skipBytes = this.f5024f.skipBytes(i2 - i3);
            if (skipBytes > 0) {
                i3 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    public class b extends InputStream {
        public long b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5031d = false;

        public b(long j2, long j3) {
            this.b = j3;
            this.c = j2;
        }

        public int read() throws IOException {
            int read;
            long j2 = this.b;
            this.b = j2 - 1;
            if (j2 > 0) {
                synchronized (h0.this.f5024f) {
                    RandomAccessFile randomAccessFile = h0.this.f5024f;
                    long j3 = this.c;
                    this.c = 1 + j3;
                    randomAccessFile.seek(j3);
                    read = h0.this.f5024f.read();
                }
                return read;
            } else if (!this.f5031d) {
                return -1;
            } else {
                this.f5031d = false;
                return 0;
            }
        }

        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int read;
            long j2 = this.b;
            if (j2 <= 0) {
                if (!this.f5031d) {
                    return -1;
                }
                this.f5031d = false;
                bArr[i2] = 0;
                return 1;
            } else if (i3 <= 0) {
                return 0;
            } else {
                if (((long) i3) > j2) {
                    i3 = (int) j2;
                }
                synchronized (h0.this.f5024f) {
                    h0.this.f5024f.seek(this.c);
                    read = h0.this.f5024f.read(bArr, i2, i3);
                }
                if (read > 0) {
                    long j3 = (long) read;
                    this.c += j3;
                    this.b -= j3;
                }
                return read;
            }
        }
    }
}
