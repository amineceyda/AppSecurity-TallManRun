package l;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class t implements g {
    public final e b = new e();
    public final y c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4983d;

    public class a extends InputStream {
        public a() {
        }

        public int available() throws IOException {
            t tVar = t.this;
            if (!tVar.f4983d) {
                return (int) Math.min(tVar.b.c, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            t.this.close();
        }

        public int read() throws IOException {
            t tVar = t.this;
            if (!tVar.f4983d) {
                e eVar = tVar.b;
                if (eVar.c == 0 && tVar.c.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return t.this.b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (!t.this.f4983d) {
                a0.b((long) bArr.length, (long) i2, (long) i3);
                t tVar = t.this;
                e eVar = tVar.b;
                if (eVar.c == 0 && tVar.c.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return t.this.b.g(bArr, i2, i3);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return t.this + ".inputStream()";
        }
    }

    public t(y yVar) {
        Objects.requireNonNull(yVar, "source == null");
        this.c = yVar;
    }

    public int A() throws IOException {
        U(4);
        return this.b.A();
    }

    public boolean D() throws IOException {
        if (!this.f4983d) {
            return this.b.D() && this.c.M(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public byte[] E(long j2) throws IOException {
        if (d(j2)) {
            return this.b.E(j2);
        }
        throw new EOFException();
    }

    public short J() throws IOException {
        U(2);
        return this.b.J();
    }

    public long M(e eVar, long j2) throws IOException {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
        } else if (!this.f4983d) {
            e eVar2 = this.b;
            if (eVar2.c == 0 && this.c.M(eVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.b.M(eVar, Math.min(j2, this.b.c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String N(long j2) throws IOException {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            long a2 = a((byte) 10, 0, j3);
            if (a2 != -1) {
                return this.b.q(a2);
            }
            if (j3 < Long.MAX_VALUE && d(j3) && this.b.d(j3 - 1) == 13 && d(1 + j3) && this.b.d(j3) == 10) {
                return this.b.q(j3);
            }
            e eVar = new e();
            e eVar2 = this.b;
            eVar2.b(eVar, 0, Math.min(32, eVar2.c));
            StringBuilder i2 = g.a.a.a.a.i("\\n not found: limit=");
            i2.append(Math.min(this.b.c, j2));
            i2.append(" content=");
            i2.append(eVar.j().i());
            i2.append(8230);
            throw new EOFException(i2.toString());
        }
        throw new IllegalArgumentException(g.a.a.a.a.s("limit < 0: ", j2));
    }

    public void U(long j2) throws IOException {
        if (!d(j2)) {
            throw new EOFException();
        }
    }

    public long Z(byte b2) throws IOException {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j2, long j3) throws IOException {
        if (this.f4983d) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
        } else {
            while (j2 < j3) {
                long f2 = this.b.f(b2, j2, j3);
                if (f2 == -1) {
                    e eVar = this.b;
                    long j4 = eVar.c;
                    if (j4 >= j3 || this.c.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j4);
                } else {
                    return f2;
                }
            }
            return -1;
        }
    }

    public boolean a0(long j2, h hVar) throws IOException {
        int p = hVar.p();
        if (this.f4983d) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || p < 0 || hVar.p() - 0 < p) {
            return false;
        } else {
            for (int i2 = 0; i2 < p; i2++) {
                long j3 = ((long) i2) + j2;
                if (!d(1 + j3) || this.b.d(j3) != hVar.h(0 + i2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public void b(byte[] bArr) throws IOException {
        try {
            U((long) bArr.length);
            this.b.k(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                e eVar = this.b;
                long j2 = eVar.c;
                if (j2 > 0) {
                    int g2 = eVar.g(bArr, i2, (int) j2);
                    if (g2 != -1) {
                        i2 += g2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public long b0() throws IOException {
        U(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!d((long) i3)) {
                break;
            }
            byte d2 = this.b.d((long) i2);
            if ((d2 >= 48 && d2 <= 57) || ((d2 >= 97 && d2 <= 102) || (d2 >= 65 && d2 <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(d2)}));
            }
        }
        return this.b.b0();
    }

    public void c(long j2) throws IOException {
        if (!this.f4983d) {
            while (j2 > 0) {
                e eVar = this.b;
                if (eVar.c == 0 && this.c.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.b.c);
                this.b.c(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String c0(Charset charset) throws IOException {
        if (charset != null) {
            this.b.F(this.c);
            e eVar = this.b;
            Objects.requireNonNull(eVar);
            try {
                return eVar.n(eVar.c, charset);
            } catch (EOFException e2) {
                throw new AssertionError(e2);
            }
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public void close() throws IOException {
        if (!this.f4983d) {
            this.f4983d = true;
            this.c.close();
            this.b.a();
        }
    }

    public boolean d(long j2) throws IOException {
        e eVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(g.a.a.a.a.s("byteCount < 0: ", j2));
        } else if (!this.f4983d) {
            do {
                eVar = this.b;
                if (eVar.c >= j2) {
                    return true;
                }
            } while (this.c.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public InputStream d0() {
        return new a();
    }

    public h e(long j2) throws IOException {
        if (d(j2)) {
            return this.b.e(j2);
        }
        throw new EOFException();
    }

    public e h() {
        return this.b;
    }

    public z i() {
        return this.c.i();
    }

    public boolean isOpen() {
        return !this.f4983d;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        e eVar = this.b;
        if (eVar.c == 0 && this.c.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        U(1);
        return this.b.readByte();
    }

    public int readInt() throws IOException {
        U(4);
        return this.b.readInt();
    }

    public short readShort() throws IOException {
        U(2);
        return this.b.readShort();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("buffer(");
        i2.append(this.c);
        i2.append(")");
        return i2.toString();
    }

    public String y() throws IOException {
        return N(Long.MAX_VALUE);
    }

    public byte[] z() throws IOException {
        this.b.F(this.c);
        return this.b.z();
    }
}
