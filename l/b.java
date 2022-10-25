package l;

import g.a.a.a.a;
import java.io.IOException;

public class b implements y {
    public final /* synthetic */ y b;
    public final /* synthetic */ c c;

    public b(c cVar, y yVar) {
        this.c = cVar;
        this.b = yVar;
    }

    public long M(e eVar, long j2) throws IOException {
        this.c.i();
        try {
            long M = this.b.M(eVar, j2);
            this.c.j(true);
            return M;
        } catch (IOException e2) {
            e = e2;
            c cVar = this.c;
            if (cVar.k()) {
                e = cVar.l(e);
            }
            throw e;
        } catch (Throwable th) {
            this.c.j(false);
            throw th;
        }
    }

    public void close() throws IOException {
        try {
            this.b.close();
            this.c.j(true);
        } catch (IOException e2) {
            e = e2;
            c cVar = this.c;
            if (cVar.k()) {
                e = cVar.l(e);
            }
            throw e;
        } catch (Throwable th) {
            this.c.j(false);
            throw th;
        }
    }

    public z i() {
        return this.c;
    }

    public String toString() {
        StringBuilder i2 = a.i("AsyncTimeout.source(");
        i2.append(this.b);
        i2.append(")");
        return i2.toString();
    }
}
