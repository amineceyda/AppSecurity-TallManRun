package l;

import g.a.a.a.a;
import java.io.IOException;
import java.io.OutputStream;

public final class p implements x {
    public final /* synthetic */ z b;
    public final /* synthetic */ OutputStream c;

    public p(z zVar, OutputStream outputStream) {
        this.b = zVar;
        this.c = outputStream;
    }

    public void close() throws IOException {
        this.c.close();
    }

    public void flush() throws IOException {
        this.c.flush();
    }

    public z i() {
        return this.b;
    }

    public void m(e eVar, long j2) throws IOException {
        a0.b(eVar.c, 0, j2);
        while (j2 > 0) {
            this.b.f();
            u uVar = eVar.b;
            int min = (int) Math.min(j2, (long) (uVar.c - uVar.b));
            this.c.write(uVar.a, uVar.b, min);
            int i2 = uVar.b + min;
            uVar.b = i2;
            long j3 = (long) min;
            j2 -= j3;
            eVar.c -= j3;
            if (i2 == uVar.c) {
                eVar.b = uVar.a();
                v.a(uVar);
            }
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("sink(");
        i2.append(this.c);
        i2.append(")");
        return i2.toString();
    }
}
