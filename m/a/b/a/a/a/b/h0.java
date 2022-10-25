package m.a.b.a.a.a.b;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
import m.a.b.a.a.a.b.f0;
import m.a.b.a.a.a.b.g;

public class h0 implements Closeable {
    public static final long p = i0.d(c0.c);
    public final List<b0> b = new LinkedList();
    public final Map<String, LinkedList<b0>> c = new HashMap(509);

    /* renamed from: d  reason: collision with root package name */
    public final e0 f5149d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5150e;

    /* renamed from: f  reason: collision with root package name */
    public final SeekableByteChannel f5151f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5152g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f5153h = true;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f5154i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f5155j;

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f5156k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f5157l;

    /* renamed from: m  reason: collision with root package name */
    public final ByteBuffer f5158m;
    public final ByteBuffer n;
    public final ByteBuffer o;

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
        public final e f5162m;

        public c(e eVar) {
            this.f5162m = eVar;
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            e eVar = this.f5162m;
            long j2 = eVar.a;
            e eVar2 = ((c) obj).f5162m;
            if (j2 == eVar2.a && eVar.b == eVar2.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (super.hashCode() * 3) + ((int) (this.f5162m.a % 2147483647L));
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

    public h0(SeekableByteChannel seekableByteChannel, String str, String str2, boolean z, boolean z2) throws IOException {
        boolean z3;
        e0 e0Var;
        SeekableByteChannel seekableByteChannel2;
        m mVar;
        byte[] bArr = new byte[8];
        this.f5154i = bArr;
        byte[] bArr2 = new byte[4];
        this.f5155j = bArr2;
        byte[] bArr3 = new byte[42];
        this.f5156k = bArr3;
        this.f5157l = new byte[2];
        this.f5158m = ByteBuffer.wrap(bArr);
        this.n = ByteBuffer.wrap(bArr2);
        this.o = ByteBuffer.wrap(bArr3);
        this.f5150e = str;
        Map<String, f0.a> map = f0.a;
        String name = str2 == null ? Charset.defaultCharset().name() : str2;
        Charset charset = m.a.b.a.a.c.b.a;
        if (!charset.name().equalsIgnoreCase(name)) {
            Iterator<String> it = charset.aliases().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equalsIgnoreCase(name)) {
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
        } else {
            z3 = true;
        }
        if (z3) {
            e0Var = f0.b;
        } else if (str2 == null) {
            e0Var = new h();
        } else {
            f0.a aVar = f0.a.get(str2);
            if (aVar != null) {
                synchronized (aVar) {
                    if (aVar.b == null) {
                        aVar.b = new m(aVar.a);
                    }
                    mVar = aVar.b;
                }
                e0Var = mVar;
            } else {
                try {
                    e0Var = new k(Charset.forName(str2));
                } catch (UnsupportedCharsetException unused) {
                    e0Var = new h(str2);
                }
            }
        }
        this.f5149d = e0Var;
        this.f5152g = z;
        this.f5151f = seekableByteChannel;
        try {
            f(d());
            this.f5153h = false;
        } catch (Throwable th) {
            this.f5153h = true;
            if (z2 && (seekableByteChannel2 = this.f5151f) != null) {
                try {
                    seekableByteChannel2.close();
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
    public java.io.InputStream b(m.a.b.a.a.a.b.b0 r11) throws java.io.IOException, java.util.zip.ZipException {
        /*
            r10 = this;
            boolean r0 = r11 instanceof m.a.b.a.a.a.b.h0.c
            if (r0 != 0) goto L_0x0006
            r11 = 0
            return r11
        L_0x0006:
            r0 = r11
            m.a.b.a.a.a.b.h0$c r0 = (m.a.b.a.a.a.b.h0.c) r0
            m.a.b.a.a.a.b.h0$e r0 = r0.f5162m
            int r1 = m.a.b.a.a.a.b.l0.a
            m.a.b.a.a.a.b.i r1 = r11.f5138j
            boolean r1 = r1.f5163d
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00c9
            int r1 = r11.b
            r3 = 8
            if (r1 == 0) goto L_0x003c
            m.a.b.a.a.a.b.j0 r4 = m.a.b.a.a.a.b.j0.UNSHRINKING
            int r4 = r4.a()
            if (r1 == r4) goto L_0x003c
            int r1 = r11.b
            m.a.b.a.a.a.b.j0 r4 = m.a.b.a.a.a.b.j0.IMPLODING
            int r4 = r4.a()
            if (r1 == r4) goto L_0x003c
            int r1 = r11.b
            if (r1 == r3) goto L_0x003c
            m.a.b.a.a.a.b.j0 r4 = m.a.b.a.a.a.b.j0.BZIP2
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
            java.util.Map<java.lang.Integer, m.a.b.a.a.a.b.j0> r1 = m.a.b.a.a.a.b.j0.t
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            m.a.b.a.a.a.b.j0 r0 = (m.a.b.a.a.a.b.j0) r0
            if (r0 != 0) goto L_0x0057
            org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException$a r1 = org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException.a.c
            r0.<init>((org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException.a) r1, (m.a.b.a.a.a.b.b0) r11)
            throw r0
        L_0x0057:
            org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException r1 = new org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException
            r1.<init>((m.a.b.a.a.a.b.j0) r0, (m.a.b.a.a.a.b.b0) r11)
            throw r1
        L_0x005d:
            long r6 = r0.b
            m.a.b.a.a.a.b.h0$b r0 = new m.a.b.a.a.a.b.h0$b
            long r8 = r11.getCompressedSize()
            r4 = r0
            r5 = r10
            r4.<init>(r6, r8)
            int r1 = r11.b
            java.util.Map<java.lang.Integer, m.a.b.a.a.a.b.j0> r4 = m.a.b.a.a.a.b.j0.t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            m.a.b.a.a.a.b.j0 r1 = (m.a.b.a.a.a.b.j0) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x00c8
            if (r1 == r2) goto L_0x00c2
            r4 = 6
            if (r1 == r4) goto L_0x00b1
            if (r1 == r3) goto L_0x00a4
            r2 = 11
            if (r1 != r2) goto L_0x008f
            m.a.b.a.a.b.b.a r11 = new m.a.b.a.a.b.b.a
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
            r0.f5160e = r2
            java.util.zip.Inflater r11 = new java.util.zip.Inflater
            r11.<init>(r2)
            m.a.b.a.a.a.b.h0$a r1 = new m.a.b.a.a.a.b.h0$a
            r1.<init>(r0, r11, r11)
            return r1
        L_0x00b1:
            m.a.b.a.a.a.b.f r1 = new m.a.b.a.a.a.b.f
            m.a.b.a.a.a.b.i r11 = r11.f5138j
            int r2 = r11.f5165f
            int r11 = r11.f5166g
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            r3.<init>(r0)
            r1.<init>(r2, r11, r3)
            return r1
        L_0x00c2:
            m.a.b.a.a.a.b.r r11 = new m.a.b.a.a.a.b.r
            r11.<init>(r0)
            return r11
        L_0x00c8:
            return r0
        L_0x00c9:
            org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException$a r1 = org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException.a.b
            r0.<init>((org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException.a) r1, (m.a.b.a.a.a.b.b0) r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.b.a.a.a.b.h0.b(m.a.b.a.a.a.b.b0):java.io.InputStream");
    }

    public void close() throws IOException {
        this.f5153h = true;
        this.f5151f.close();
    }

    public final Map<b0, d> d() throws IOException {
        boolean z;
        boolean z2;
        HashMap hashMap;
        int i2;
        h0 h0Var = this;
        HashMap hashMap2 = new HashMap();
        byte[] bArr = c0.f5139d;
        long size = h0Var.f5151f.size() - 22;
        long max = Math.max(0, h0Var.f5151f.size() - 65557);
        int i3 = 2;
        boolean z3 = true;
        boolean z4 = false;
        if (size >= 0) {
            while (true) {
                if (size < max) {
                    break;
                }
                h0Var.f5151f.position(size);
                try {
                    h0Var.n.rewind();
                    m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
                    h0Var.n.flip();
                    if (h0Var.n.get() == bArr[0] && h0Var.n.get() == bArr[1] && h0Var.n.get() == bArr[2] && h0Var.n.get() == bArr[3]) {
                        z = true;
                        break;
                    }
                    size--;
                } catch (EOFException unused) {
                }
            }
        }
        z = false;
        if (z) {
            h0Var.f5151f.position(size);
        }
        if (z) {
            boolean z5 = h0Var.f5151f.position() > 20;
            if (z5) {
                SeekableByteChannel seekableByteChannel = h0Var.f5151f;
                seekableByteChannel.position(seekableByteChannel.position() - 20);
                h0Var.n.rewind();
                m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
                z2 = Arrays.equals(c0.f5141f, h0Var.f5155j);
            } else {
                z2 = false;
            }
            char c2 = 16;
            int i4 = 4;
            if (!z2) {
                if (z5) {
                    h0Var.g(16);
                }
                h0Var.g(16);
                h0Var.n.rewind();
                m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
                h0Var.f5151f.position(i0.d(h0Var.f5155j));
            } else {
                h0Var.g(4);
                h0Var.f5158m.rewind();
                m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.f5158m);
                h0Var.f5151f.position(d0.c(h0Var.f5154i, 0).longValue());
                h0Var.n.rewind();
                m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
                if (Arrays.equals(h0Var.f5155j, c0.f5140e)) {
                    h0Var.g(44);
                    h0Var.f5158m.rewind();
                    m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.f5158m);
                    h0Var.f5151f.position(d0.c(h0Var.f5154i, 0).longValue());
                } else {
                    throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
                }
            }
            h0Var.n.rewind();
            m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
            long d2 = i0.d(h0Var.f5155j);
            if (d2 != p) {
                h0Var.f5151f.position(0);
                h0Var.n.rewind();
                m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
                if (Arrays.equals(h0Var.f5155j, c0.b)) {
                    throw new IOException("central directory is empty, can't expand corrupt archive.");
                }
            }
            while (d2 == p) {
                h0Var.o.rewind();
                m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.o);
                e eVar = new e((a) null);
                c cVar = new c(eVar);
                cVar.f5133e = (k0.d(h0Var.f5156k, z4 ? 1 : 0) >> 8) & 15;
                k0.d(h0Var.f5156k, i3);
                int d3 = k0.d(h0Var.f5156k, i4);
                i iVar = new i();
                iVar.c = (d3 & 8) != 0;
                boolean z6 = (d3 & 2048) != 0;
                iVar.b = z6;
                boolean z7 = (d3 & 64) != 0;
                iVar.f5164e = z7;
                if (z7) {
                    iVar.f5163d = z3;
                }
                iVar.f5163d = (d3 & 1) != 0;
                iVar.f5165f = (d3 & 2) != 0 ? 8192 : 4096;
                iVar.f5166g = (d3 & 4) != 0 ? 3 : 2;
                e0 e0Var = z6 ? f0.b : h0Var.f5149d;
                cVar.f5138j = iVar;
                k0.d(h0Var.f5156k, i4);
                cVar.setMethod(k0.d(h0Var.f5156k, 6));
                long e2 = i0.e(h0Var.f5156k, 8);
                int i5 = l0.a;
                Calendar instance = Calendar.getInstance();
                instance.set(z3 ? 1 : 0, ((int) ((e2 >> 25) & 127)) + 1980);
                instance.set(i3, ((int) ((e2 >> 21) & 15)) - z3);
                instance.set(5, ((int) (e2 >> c2)) & 31);
                instance.set(11, ((int) (e2 >> 11)) & 31);
                instance.set(12, ((int) (e2 >> 5)) & 63);
                instance.set(13, ((int) (e2 << (z3 ? 1 : 0))) & 62);
                instance.set(14, z4);
                cVar.setTime(instance.getTime().getTime());
                cVar.setCrc(i0.e(h0Var.f5156k, 12));
                cVar.setCompressedSize(i0.e(h0Var.f5156k, 16));
                cVar.setSize(i0.e(h0Var.f5156k, 20));
                int d4 = k0.d(h0Var.f5156k, 24);
                int d5 = k0.d(h0Var.f5156k, 26);
                int d6 = k0.d(h0Var.f5156k, 28);
                int d7 = k0.d(h0Var.f5156k, 30);
                cVar.f5132d = k0.d(h0Var.f5156k, 32);
                cVar.f5134f = i0.e(h0Var.f5156k, 34);
                byte[] bArr2 = new byte[d4];
                m.a.b.a.a.c.c.a(h0Var.f5151f, ByteBuffer.wrap(bArr2));
                cVar.g(e0Var.a(bArr2));
                eVar.a = i0.e(h0Var.f5156k, 38);
                h0Var.b.add(cVar);
                byte[] bArr3 = new byte[d5];
                m.a.b.a.a.c.c.a(h0Var.f5151f, ByteBuffer.wrap(bArr3));
                try {
                    cVar.d(g.b(bArr3, z4, g.a.a), z4);
                    a0 a0Var = (a0) cVar.c(a0.f5120g);
                    if (a0Var != null) {
                        boolean z8 = cVar.c == 4294967295L;
                        boolean z9 = cVar.getCompressedSize() == 4294967295L;
                        hashMap = hashMap2;
                        boolean z10 = eVar.a == 4294967295L;
                        boolean z11 = d7 == 65535;
                        byte[] bArr4 = a0Var.f5124f;
                        if (bArr4 != null) {
                            int i6 = (z8 ? 8 : 0) + (z9 ? 8 : 0) + (z10 ? 8 : 0) + (z11 ? 4 : 0);
                            if (bArr4.length >= i6) {
                                if (z8) {
                                    a0Var.b = new d0(a0Var.f5124f, z4);
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                if (z9) {
                                    a0Var.c = new d0(a0Var.f5124f, i2);
                                    i2 += 8;
                                }
                                if (z10) {
                                    a0Var.f5122d = new d0(a0Var.f5124f, i2);
                                    i2 += 8;
                                }
                                if (z11) {
                                    a0Var.f5123e = new i0(a0Var.f5124f, i2);
                                }
                            } else {
                                StringBuilder j2 = g.a.a.a.a.j("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length ", i6, " but is ");
                                j2.append(a0Var.f5124f.length);
                                throw new ZipException(j2.toString());
                            }
                        }
                        if (z8) {
                            cVar.setSize(a0Var.b.b());
                        } else if (z9) {
                            a0Var.b = new d0(cVar.c);
                        }
                        if (z9) {
                            cVar.setCompressedSize(a0Var.c.b());
                        } else if (z8) {
                            a0Var.c = new d0(cVar.getCompressedSize());
                        }
                        if (z10) {
                            eVar.a = a0Var.f5122d.b();
                        }
                    } else {
                        hashMap = hashMap2;
                    }
                    byte[] bArr5 = new byte[d6];
                    h0Var = this;
                    m.a.b.a.a.c.c.a(h0Var.f5151f, ByteBuffer.wrap(bArr5));
                    cVar.setComment(e0Var.a(bArr5));
                    if (z6 || !h0Var.f5152g) {
                        hashMap2 = hashMap;
                    } else {
                        d dVar = new d(bArr2, bArr5, (a) null);
                        hashMap2 = hashMap;
                        hashMap2.put(cVar, dVar);
                    }
                    h0Var.n.rewind();
                    m.a.b.a.a.c.c.a(h0Var.f5151f, h0Var.n);
                    d2 = i0.d(h0Var.f5155j);
                    c2 = 16;
                    i4 = 4;
                    i3 = 2;
                    z3 = true;
                    z4 = false;
                } catch (ZipException e3) {
                    throw new RuntimeException(e3.getMessage(), e3);
                }
            }
            return hashMap2;
        }
        throw new ZipException("archive is not a ZIP archive");
    }

    public final void f(Map<b0, d> map) throws IOException {
        String b2;
        Iterator<b0> it = this.b.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            e eVar = cVar.f5162m;
            long j2 = eVar.a + 26;
            this.f5151f.position(j2);
            this.n.rewind();
            m.a.b.a.a.c.c.a(this.f5151f, this.n);
            this.n.flip();
            this.n.get(this.f5157l);
            int d2 = k0.d(this.f5157l, 0);
            this.n.get(this.f5157l);
            int d3 = k0.d(this.f5157l, 0);
            g(d2);
            byte[] bArr = new byte[d3];
            m.a.b.a.a.c.c.a(this.f5151f, ByteBuffer.wrap(bArr));
            cVar.setExtra(bArr);
            eVar.b = j2 + 2 + 2 + ((long) d2) + ((long) d3);
            if (map.containsKey(cVar)) {
                d dVar = map.get(cVar);
                byte[] bArr2 = dVar.a;
                byte[] bArr3 = dVar.b;
                int i2 = l0.a;
                String name = cVar.getName();
                String b3 = l0.b((o) cVar.c(o.f5199e), bArr2);
                if (b3 != null && !name.equals(b3)) {
                    cVar.g(b3);
                }
                if (!(bArr3 == null || bArr3.length <= 0 || (b2 = l0.b((n) cVar.c(n.f5198e), bArr3)) == null)) {
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
            if (!this.f5153h) {
                PrintStream printStream = System.err;
                printStream.println("Cleaning up unclosed ZipFile for archive " + this.f5150e);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(int i2) throws IOException {
        long position = this.f5151f.position() + ((long) i2);
        if (position <= this.f5151f.size()) {
            this.f5151f.position(position);
            return;
        }
        throw new EOFException();
    }

    public class b extends InputStream {
        public final ByteBuffer b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public long f5159d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5160e = false;

        public b(long j2, long j3) {
            this.c = j3;
            this.f5159d = j2;
            this.b = ByteBuffer.allocate((j3 >= PlaybackStateCompat.ACTION_PLAY_FROM_URI || j3 <= 0) ? 8192 : (int) j3);
        }

        public final int a(int i2) throws IOException {
            this.b.rewind().limit(i2);
            int read = h0.this.f5151f.read(this.b);
            this.b.flip();
            return read;
        }

        public int read() throws IOException {
            long j2 = this.c;
            this.c = j2 - 1;
            if (j2 > 0) {
                synchronized (h0.this.f5151f) {
                    SeekableByteChannel seekableByteChannel = h0.this.f5151f;
                    long j3 = this.f5159d;
                    this.f5159d = 1 + j3;
                    seekableByteChannel.position(j3);
                    int a = a(1);
                    if (a < 0) {
                        return a;
                    }
                    byte b2 = this.b.get() & 255;
                    return b2;
                }
            } else if (!this.f5160e) {
                return -1;
            } else {
                this.f5160e = false;
                return 0;
            }
        }

        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4;
            ByteBuffer byteBuffer;
            long j2 = this.c;
            if (j2 <= 0) {
                if (!this.f5160e) {
                    return -1;
                }
                this.f5160e = false;
                bArr[i2] = 0;
                return 1;
            } else if (i3 <= 0) {
                return 0;
            } else {
                if (((long) i3) > j2) {
                    i3 = (int) j2;
                }
                synchronized (h0.this.f5151f) {
                    h0.this.f5151f.position(this.f5159d);
                    if (i3 <= this.b.capacity()) {
                        byteBuffer = this.b;
                        i4 = a(i3);
                    } else {
                        byteBuffer = ByteBuffer.allocate(i3);
                        i4 = h0.this.f5151f.read(byteBuffer);
                        byteBuffer.flip();
                    }
                }
                if (i4 > 0) {
                    byteBuffer.get(bArr, i2, i4);
                    long j3 = (long) i4;
                    this.f5159d += j3;
                    this.c -= j3;
                }
                return i4;
            }
        }
    }
}
