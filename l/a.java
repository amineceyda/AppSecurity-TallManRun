package l;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

public class a implements x {
    public final /* synthetic */ x b;
    public final /* synthetic */ c c;

    public a(c cVar, x xVar) {
        this.c = cVar;
        this.b = xVar;
    }

    public void close() throws IOException {
        this.c.i();
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

    public void flush() throws IOException {
        this.c.i();
        try {
            this.b.flush();
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

    public void m(e eVar, long j2) throws IOException {
        a0.b(eVar.c, 0, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                u uVar = eVar.b;
                while (true) {
                    if (j3 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j3 += (long) (uVar.c - uVar.b);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    }
                    uVar = uVar.f4986f;
                }
                this.c.i();
                try {
                    this.b.m(eVar, j3);
                    j2 -= j3;
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
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("AsyncTimeout.sink(");
        i2.append(this.b);
        i2.append(")");
        return i2.toString();
    }
}
