package l;

import android.support.v4.media.session.PlaybackStateCompat;
import g.a.a.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class s implements f {
    public final e b = new e();
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4982d;

    public s(x xVar) {
        Objects.requireNonNull(xVar, "sink == null");
        this.c = xVar;
    }

    public f C(int i2) throws IOException {
        if (!this.f4982d) {
            e eVar = this.b;
            Objects.requireNonNull(eVar);
            eVar.Q(a0.c(i2));
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f K() throws IOException {
        if (!this.f4982d) {
            e eVar = this.b;
            long j2 = eVar.c;
            if (j2 == 0) {
                j2 = 0;
            } else {
                u uVar = eVar.b.f4987g;
                int i2 = uVar.c;
                if (i2 < 8192 && uVar.f4985e) {
                    j2 -= (long) (i2 - uVar.b);
                }
            }
            if (j2 > 0) {
                this.c.m(eVar, j2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f W(String str) throws IOException {
        if (!this.f4982d) {
            this.b.V(str);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f a(h hVar) throws IOException {
        if (!this.f4982d) {
            this.b.t(hVar);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f b(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f4982d) {
            this.b.v(bArr, i2, i3);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void close() throws IOException {
        if (!this.f4982d) {
            Throwable th = null;
            try {
                e eVar = this.b;
                long j2 = eVar.c;
                if (j2 > 0) {
                    this.c.m(eVar, j2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.c.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f4982d = true;
            if (th != null) {
                Charset charset = a0.a;
                throw th;
            }
        }
    }

    public long d(y yVar) throws IOException {
        long j2 = 0;
        while (true) {
            long M = yVar.M(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (M == -1) {
                return j2;
            }
            j2 += M;
            K();
        }
    }

    public void flush() throws IOException {
        if (!this.f4982d) {
            e eVar = this.b;
            long j2 = eVar.c;
            if (j2 > 0) {
                this.c.m(eVar, j2);
            }
            this.c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public e h() {
        return this.b;
    }

    public z i() {
        return this.c.i();
    }

    public boolean isOpen() {
        return !this.f4982d;
    }

    public void m(e eVar, long j2) throws IOException {
        if (!this.f4982d) {
            this.b.m(eVar, j2);
            K();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public f r(long j2) throws IOException {
        if (!this.f4982d) {
            this.b.r(j2);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder i2 = a.i("buffer(");
        i2.append(this.c);
        i2.append(")");
        return i2.toString();
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f4982d) {
            int write = this.b.write(byteBuffer);
            K();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public f write(byte[] bArr) throws IOException {
        if (!this.f4982d) {
            this.b.u(bArr);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f writeByte(int i2) throws IOException {
        if (!this.f4982d) {
            this.b.O(i2);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f writeInt(int i2) throws IOException {
        if (!this.f4982d) {
            this.b.Q(i2);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f writeShort(int i2) throws IOException {
        if (!this.f4982d) {
            this.b.S(i2);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
