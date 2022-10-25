package l;

import g.a.a.a.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class m implements x {
    public final f b;
    public final Deflater c;

    /* renamed from: d  reason: collision with root package name */
    public final i f4973d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4974e;

    /* renamed from: f  reason: collision with root package name */
    public final CRC32 f4975f = new CRC32();

    public m(x xVar) {
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        Logger logger = q.a;
        s sVar = new s(xVar);
        this.b = sVar;
        this.f4973d = new i(sVar, deflater);
        e eVar = sVar.b;
        eVar.S(8075);
        eVar.O(8);
        eVar.O(0);
        eVar.Q(0);
        eVar.O(0);
        eVar.O(0);
    }

    public void close() throws IOException {
        if (!this.f4974e) {
            Throwable th = null;
            try {
                i iVar = this.f4973d;
                iVar.c.finish();
                iVar.a(false);
                this.b.C((int) this.f4975f.getValue());
                this.b.C((int) this.c.getBytesRead());
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.c.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.b.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f4974e = true;
            if (th != null) {
                Charset charset = a0.a;
                throw th;
            }
        }
    }

    public void flush() throws IOException {
        this.f4973d.flush();
    }

    public z i() {
        return this.b.i();
    }

    public void m(e eVar, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException(a.s("byteCount < 0: ", j2));
        } else if (j2 != 0) {
            u uVar = eVar.b;
            long j3 = j2;
            while (j3 > 0) {
                int min = (int) Math.min(j3, (long) (uVar.c - uVar.b));
                this.f4975f.update(uVar.a, uVar.b, min);
                j3 -= (long) min;
                uVar = uVar.f4986f;
            }
            this.f4973d.m(eVar, j2);
        }
    }
}
