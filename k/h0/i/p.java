package k.h0.i;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.h0.i.c;
import l.e;
import l.f;

public final class p implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f4876h = Logger.getLogger(d.class.getName());
    public final f b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final e f4877d;

    /* renamed from: e  reason: collision with root package name */
    public int f4878e = 16384;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4879f;

    /* renamed from: g  reason: collision with root package name */
    public final c.b f4880g;

    public p(f fVar, boolean z) {
        this.b = fVar;
        this.c = z;
        e eVar = new e();
        this.f4877d = eVar;
        this.f4880g = new c.b(eVar);
    }

    public synchronized void a(s sVar) throws IOException {
        if (!this.f4879f) {
            int i2 = this.f4878e;
            int i3 = sVar.a;
            if ((i3 & 32) != 0) {
                i2 = sVar.b[5];
            }
            this.f4878e = i2;
            int i4 = i3 & 2;
            int i5 = -1;
            if ((i4 != 0 ? sVar.b[1] : -1) != -1) {
                c.b bVar = this.f4880g;
                if (i4 != 0) {
                    i5 = sVar.b[1];
                }
                Objects.requireNonNull(bVar);
                int min = Math.min(i5, 16384);
                int i6 = bVar.f4808d;
                if (i6 != min) {
                    if (min < i6) {
                        bVar.b = Math.min(bVar.b, min);
                    }
                    bVar.c = true;
                    bVar.f4808d = min;
                    int i7 = bVar.f4812h;
                    if (min < i7) {
                        if (min == 0) {
                            bVar.a();
                        } else {
                            bVar.b(i7 - min);
                        }
                    }
                }
            }
            d(0, 0, (byte) 4, (byte) 1);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b(boolean z, int i2, e eVar, int i3) throws IOException {
        if (!this.f4879f) {
            d(i2, i3, (byte) 0, z ? (byte) 1 : 0);
            if (i3 > 0) {
                this.b.m(eVar, (long) i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.f4879f = true;
        this.b.close();
    }

    public void d(int i2, int i3, byte b2, byte b3) throws IOException {
        Logger logger = f4876h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f4878e;
        if (i3 > i4) {
            d.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            f fVar = this.b;
            fVar.writeByte((i3 >>> 16) & 255);
            fVar.writeByte((i3 >>> 8) & 255);
            fVar.writeByte(i3 & 255);
            this.b.writeByte(b2 & 255);
            this.b.writeByte(b3 & 255);
            this.b.writeInt(i2 & Integer.MAX_VALUE);
        } else {
            d.b("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public synchronized void f(int i2, a aVar, byte[] bArr) throws IOException {
        if (this.f4879f) {
            throw new IOException("closed");
        } else if (aVar.httpCode != -1) {
            d(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.b.writeInt(i2);
            this.b.writeInt(aVar.httpCode);
            if (bArr.length > 0) {
                this.b.write(bArr);
            }
            this.b.flush();
        } else {
            d.b("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.f4879f) {
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void g(boolean z, int i2, List<b> list) throws IOException {
        if (!this.f4879f) {
            this.f4880g.e(list);
            long j2 = this.f4877d.c;
            int min = (int) Math.min((long) this.f4878e, j2);
            long j3 = (long) min;
            byte b2 = j2 == j3 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            d(i2, min, (byte) 1, b2);
            this.b.m(this.f4877d, j3);
            if (j2 > j3) {
                o(i2, j2 - j3);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void j(boolean z, int i2, int i3) throws IOException {
        if (!this.f4879f) {
            d(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.b.writeInt(i2);
            this.b.writeInt(i3);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void k(int i2, a aVar) throws IOException {
        if (this.f4879f) {
            throw new IOException("closed");
        } else if (aVar.httpCode != -1) {
            d(i2, 4, (byte) 3, (byte) 0);
            this.b.writeInt(aVar.httpCode);
            this.b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void n(int i2, long j2) throws IOException {
        if (this.f4879f) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            d.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            d(i2, 4, (byte) 8, (byte) 0);
            this.b.writeInt((int) j2);
            this.b.flush();
        }
    }

    public final void o(int i2, long j2) throws IOException {
        while (j2 > 0) {
            int min = (int) Math.min((long) this.f4878e, j2);
            long j3 = (long) min;
            j2 -= j3;
            d(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
            this.b.m(this.f4877d, j3);
        }
    }
}
