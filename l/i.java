package l;

import g.a.a.a.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class i implements x {
    public final f b;
    public final Deflater c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4971d;

    public i(f fVar, Deflater deflater) {
        this.b = fVar;
        this.c = deflater;
    }

    @IgnoreJRERequirement
    public final void a(boolean z) throws IOException {
        u s;
        e h2 = this.b.h();
        while (true) {
            s = h2.s(1);
            Deflater deflater = this.c;
            byte[] bArr = s.a;
            int i2 = s.c;
            int i3 = 8192 - i2;
            int deflate = z ? deflater.deflate(bArr, i2, i3, 2) : deflater.deflate(bArr, i2, i3);
            if (deflate > 0) {
                s.c += deflate;
                h2.c += (long) deflate;
                this.b.K();
            } else if (this.c.needsInput()) {
                break;
            }
        }
        if (s.b == s.c) {
            h2.b = s.a();
            v.a(s);
        }
    }

    public void close() throws IOException {
        if (!this.f4971d) {
            Throwable th = null;
            try {
                this.c.finish();
                a(false);
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
            this.f4971d = true;
            if (th != null) {
                Charset charset = a0.a;
                throw th;
            }
        }
    }

    public void flush() throws IOException {
        a(true);
        this.b.flush();
    }

    public z i() {
        return this.b.i();
    }

    public void m(e eVar, long j2) throws IOException {
        a0.b(eVar.c, 0, j2);
        while (j2 > 0) {
            u uVar = eVar.b;
            int min = (int) Math.min(j2, (long) (uVar.c - uVar.b));
            this.c.setInput(uVar.a, uVar.b, min);
            a(false);
            long j3 = (long) min;
            eVar.c -= j3;
            int i2 = uVar.b + min;
            uVar.b = i2;
            if (i2 == uVar.c) {
                eVar.b = uVar.a();
                v.a(uVar);
            }
            j2 -= j3;
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("DeflaterSink(");
        i2.append(this.b);
        i2.append(")");
        return i2.toString();
    }
}
