package l;

import g.a.a.a.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class o implements y {
    public final g b;
    public final Inflater c;

    /* renamed from: d  reason: collision with root package name */
    public int f4979d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4980e;

    public o(g gVar, Inflater inflater) {
        this.b = gVar;
        this.c = inflater;
    }

    public long M(e eVar, long j2) throws IOException {
        u s;
        if (j2 < 0) {
            throw new IllegalArgumentException(a.s("byteCount < 0: ", j2));
        } else if (this.f4980e) {
            throw new IllegalStateException("closed");
        } else if (j2 == 0) {
            return 0;
        } else {
            while (true) {
                boolean z = false;
                if (this.c.needsInput()) {
                    a();
                    if (this.c.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.b.D()) {
                        z = true;
                    } else {
                        u uVar = this.b.h().b;
                        int i2 = uVar.c;
                        int i3 = uVar.b;
                        int i4 = i2 - i3;
                        this.f4979d = i4;
                        this.c.setInput(uVar.a, i3, i4);
                    }
                }
                try {
                    s = eVar.s(1);
                    int inflate = this.c.inflate(s.a, s.c, (int) Math.min(j2, (long) (8192 - s.c)));
                    if (inflate > 0) {
                        s.c += inflate;
                        long j3 = (long) inflate;
                        eVar.c += j3;
                        return j3;
                    } else if (this.c.finished()) {
                        break;
                    } else if (this.c.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            a();
            if (s.b != s.c) {
                return -1;
            }
            eVar.b = s.a();
            v.a(s);
            return -1;
        }
    }

    public final void a() throws IOException {
        int i2 = this.f4979d;
        if (i2 != 0) {
            int remaining = i2 - this.c.getRemaining();
            this.f4979d -= remaining;
            this.b.c((long) remaining);
        }
    }

    public void close() throws IOException {
        if (!this.f4980e) {
            this.c.end();
            this.f4980e = true;
            this.b.close();
        }
    }

    public z i() {
        return this.b.i();
    }
}
