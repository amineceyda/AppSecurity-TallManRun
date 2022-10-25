package g.d.a.l.v.c;

import g.d.a.l.t.b0.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class v extends FilterInputStream {
    public volatile byte[] b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f2598d;

    /* renamed from: e  reason: collision with root package name */
    public int f2599e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f2600f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2601g;

    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public v(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f2601g = bVar;
        this.b = (byte[]) bVar.d(65536, byte[].class);
    }

    public static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i2;
        int i3 = this.f2599e;
        if (i3 == -1 || this.f2600f - i3 >= (i2 = this.f2598d)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f2599e = -1;
                this.f2600f = 0;
                this.c = read;
            }
            return read;
        }
        if (i3 == 0 && i2 > bArr.length && this.c == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i2) {
                i2 = length;
            }
            byte[] bArr2 = (byte[]) this.f2601g.d(i2, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.b = bArr2;
            this.f2601g.put(bArr);
            bArr = bArr2;
        } else if (i3 > 0) {
            System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
        }
        int i4 = this.f2600f - this.f2599e;
        this.f2600f = i4;
        this.f2599e = 0;
        this.c = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.f2600f;
        if (read2 > 0) {
            i5 += read2;
        }
        this.c = i5;
        return read2;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.b == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.c - this.f2600f) + inputStream.available();
    }

    public synchronized void b() {
        if (this.b != null) {
            this.f2601g.put(this.b);
            this.b = null;
        }
    }

    public void close() throws IOException {
        if (this.b != null) {
            this.f2601g.put(this.b);
            this.b = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i2) {
        this.f2598d = Math.max(this.f2598d, i2);
        this.f2599e = this.f2600f;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x0039=Splitter:B:28:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.b     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f2600f     // Catch:{ all -> 0x003d }
            int r4 = r6.c     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.b     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.b     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            d()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x0026:
            int r1 = r6.c     // Catch:{ all -> 0x003d }
            int r2 = r6.f2600f     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f2600f = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            d()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.v.c.v.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.b     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x000b
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x000b:
            java.io.InputStream r2 = r7.in     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0086
            int r3 = r7.f2600f     // Catch:{ all -> 0x008e }
            int r4 = r7.c     // Catch:{ all -> 0x008e }
            if (r3 >= r4) goto L_0x0033
            int r5 = r4 - r3
            if (r5 < r10) goto L_0x001b
            r4 = r10
            goto L_0x001c
        L_0x001b:
            int r4 = r4 - r3
        L_0x001c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r3 = r7.f2600f     // Catch:{ all -> 0x008e }
            int r3 = r3 + r4
            r7.f2600f = r3     // Catch:{ all -> 0x008e }
            if (r4 == r10) goto L_0x0031
            int r3 = r2.available()     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L_0x0034
        L_0x0031:
            monitor-exit(r7)
            return r4
        L_0x0033:
            r3 = r10
        L_0x0034:
            int r4 = r7.f2599e     // Catch:{ all -> 0x008e }
            r5 = -1
            if (r4 != r5) goto L_0x0049
            int r4 = r0.length     // Catch:{ all -> 0x008e }
            if (r3 < r4) goto L_0x0049
            int r4 = r2.read(r8, r9, r3)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0076
            if (r3 != r10) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            int r5 = r10 - r3
        L_0x0047:
            monitor-exit(r7)
            return r5
        L_0x0049:
            int r4 = r7.a(r2, r0)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0056
            if (r3 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r5 = r10 - r3
        L_0x0054:
            monitor-exit(r7)
            return r5
        L_0x0056:
            byte[] r4 = r7.b     // Catch:{ all -> 0x008e }
            if (r0 == r4) goto L_0x0063
            byte[] r0 = r7.b     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            d()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x0063:
            int r4 = r7.c     // Catch:{ all -> 0x008e }
            int r5 = r7.f2600f     // Catch:{ all -> 0x008e }
            int r6 = r4 - r5
            if (r6 < r3) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            int r4 = r4 - r5
        L_0x006e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r5 = r7.f2600f     // Catch:{ all -> 0x008e }
            int r5 = r5 + r4
            r7.f2600f = r5     // Catch:{ all -> 0x008e }
        L_0x0076:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x007b
            monitor-exit(r7)
            return r10
        L_0x007b:
            int r5 = r2.available()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0084
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L_0x0084:
            int r9 = r9 + r4
            goto L_0x0034
        L_0x0086:
            d()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008a:
            d()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0092
        L_0x0091:
            throw r8
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.v.c.v.read(byte[], int, int):int");
    }

    public synchronized void reset() throws IOException {
        if (this.b != null) {
            int i2 = this.f2599e;
            if (-1 != i2) {
                this.f2600f = i2;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f2600f + " markLimit: " + this.f2598d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0;
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i2 = this.c;
                int i3 = this.f2600f;
                if (((long) (i2 - i3)) >= j2) {
                    this.f2600f = (int) (((long) i3) + j2);
                    return j2;
                }
                long j3 = ((long) i2) - ((long) i3);
                this.f2600f = i2;
                if (this.f2599e == -1 || j2 > ((long) this.f2598d)) {
                    return j3 + inputStream.skip(j2 - j3);
                } else if (a(inputStream, bArr) == -1) {
                    return j3;
                } else {
                    int i4 = this.c;
                    int i5 = this.f2600f;
                    if (((long) (i4 - i5)) >= j2 - j3) {
                        this.f2600f = (int) ((((long) i5) + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + ((long) i4)) - ((long) i5);
                    this.f2600f = i4;
                    return j4;
                }
            } else {
                d();
                throw null;
            }
        } else {
            d();
            throw null;
        }
    }
}
