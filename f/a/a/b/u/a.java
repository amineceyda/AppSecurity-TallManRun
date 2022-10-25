package f.a.a.b.u;

import f.a.a.b.q.d.k;
import f.a.a.b.s.b;
import f.a.a.b.u.j.f;
import f.a.a.b.u.j.n;
import f.a.a.b.u.j.x;
import java.io.File;
import java.util.Date;

@k
public class a<E> extends g<E> {
    public boolean j(File file, E e2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f1809j) {
            return false;
        }
        Date date = this.f1808i;
        n("Elapsed period: " + date);
        this.f1806g = this.f1804e.f1812j.s(date);
        this.f1808i.setTime(currentTimeMillis);
        s();
        return true;
    }

    public void start() {
        n nVar;
        super.start();
        if (this.f1811l) {
            b bVar = this.f1804e.f1798f.f1827f;
            while (true) {
                if (bVar == null) {
                    nVar = null;
                    break;
                } else if (bVar instanceof n) {
                    nVar = (n) bVar;
                    break;
                } else {
                    bVar = bVar.b;
                }
            }
            if (nVar != null) {
                StringBuilder i2 = g.a.a.a.a.i("Filename pattern [");
                i2.append(this.f1804e.f1798f);
                i2.append("] contains an integer token converter, i.e. %i, INCOMPATIBLE with this configuration. Remove it.");
                m(i2.toString());
                return;
            }
            x xVar = new x(this.f1804e.f1798f, this.f1807h, new f());
            this.f1805f = xVar;
            xVar.g(this.c);
            this.f1810k = true;
        }
    }

    public String toString() {
        return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
    }
}
