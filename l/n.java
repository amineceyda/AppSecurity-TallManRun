package l;

import g.a.a.a.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class n implements y {
    public int b = 0;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final Inflater f4976d;

    /* renamed from: e  reason: collision with root package name */
    public final o f4977e;

    /* renamed from: f  reason: collision with root package name */
    public final CRC32 f4978f = new CRC32();

    public n(y yVar) {
        if (yVar != null) {
            Inflater inflater = new Inflater(true);
            this.f4976d = inflater;
            Logger logger = q.a;
            t tVar = new t(yVar);
            this.c = tVar;
            this.f4977e = new o(tVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long M(e eVar, long j2) throws IOException {
        long j3;
        e eVar2 = eVar;
        long j4 = j2;
        if (j4 < 0) {
            throw new IllegalArgumentException(a.s("byteCount < 0: ", j4));
        } else if (j4 == 0) {
            return 0;
        } else {
            if (this.b == 0) {
                this.c.U(10);
                byte d2 = this.c.h().d(3);
                boolean z = ((d2 >> 1) & 1) == 1;
                if (z) {
                    b(this.c.h(), 0, 10);
                }
                a("ID1ID2", 8075, this.c.readShort());
                this.c.c(8);
                if (((d2 >> 2) & 1) == 1) {
                    this.c.U(2);
                    if (z) {
                        b(this.c.h(), 0, 2);
                    }
                    long J = (long) this.c.h().J();
                    this.c.U(J);
                    if (z) {
                        j3 = J;
                        b(this.c.h(), 0, J);
                    } else {
                        j3 = J;
                    }
                    this.c.c(j3);
                }
                if (((d2 >> 3) & 1) == 1) {
                    long Z = this.c.Z((byte) 0);
                    if (Z != -1) {
                        if (z) {
                            b(this.c.h(), 0, Z + 1);
                        }
                        this.c.c(Z + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((d2 >> 4) & 1) == 1) {
                    long Z2 = this.c.Z((byte) 0);
                    if (Z2 != -1) {
                        if (z) {
                            b(this.c.h(), 0, Z2 + 1);
                        }
                        this.c.c(Z2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    a("FHCRC", this.c.J(), (short) ((int) this.f4978f.getValue()));
                    this.f4978f.reset();
                }
                this.b = 1;
            }
            if (this.b == 1) {
                long j5 = eVar2.c;
                long M = this.f4977e.M(eVar2, j4);
                if (M != -1) {
                    b(eVar, j5, M);
                    return M;
                }
                this.b = 2;
            }
            if (this.b == 2) {
                a("CRC", this.c.A(), (int) this.f4978f.getValue());
                a("ISIZE", this.c.A(), (int) this.f4976d.getBytesWritten());
                this.b = 3;
                if (!this.c.D()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final void a(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
    }

    public final void b(e eVar, long j2, long j3) {
        u uVar = eVar.b;
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
            int i4 = (int) (((long) uVar.b) + j2);
            int min = (int) Math.min((long) (uVar.c - i4), j3);
            this.f4978f.update(uVar.a, i4, min);
            j3 -= (long) min;
            uVar = uVar.f4986f;
            j2 = 0;
        }
    }

    public void close() throws IOException {
        this.f4977e.close();
    }

    public z i() {
        return this.c.i();
    }
}
