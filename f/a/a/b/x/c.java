package f.a.a.b.x;

import f.a.a.b.w.d;
import f.a.a.b.w.i;
import f.a.a.b.z.n;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends d implements f, i {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1847e = false;

    /* renamed from: f  reason: collision with root package name */
    public long f1848f = 300;

    public void i(d dVar) {
        if (this.f1847e) {
            t(dVar);
        }
    }

    public boolean k() {
        return this.f1847e;
    }

    public final boolean s(long j2, long j3) {
        return j2 - j3 < this.f1848f;
    }

    public void start() {
        this.f1847e = true;
        if (this.f1848f > 0) {
            u();
        }
    }

    public void stop() {
        this.f1847e = false;
    }

    public final void t(d dVar) {
        StringBuilder sb = new StringBuilder();
        n.a(sb, "", dVar);
        System.out.print(sb);
    }

    public final void u() {
        if (this.c != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = ((ArrayList) this.c.f1685d.c()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (s(currentTimeMillis, dVar.b().longValue())) {
                    t(dVar);
                }
            }
        }
    }
}
