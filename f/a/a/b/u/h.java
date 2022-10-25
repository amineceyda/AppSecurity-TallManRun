package f.a.a.b.u;

import ch.qos.logback.core.rolling.RolloverFailure;
import f.a.a.b.u.j.a;
import f.a.a.b.u.j.b;
import f.a.a.b.u.j.c;
import f.a.a.b.u.j.i;
import f.a.a.b.u.j.t;
import f.a.a.b.u.j.x;
import f.a.a.b.w.d;
import f.a.a.b.z.k;
import java.io.File;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class h<E> extends c implements i<E> {

    /* renamed from: j  reason: collision with root package name */
    public i f1812j;

    /* renamed from: k  reason: collision with root package name */
    public c f1813k;

    /* renamed from: l  reason: collision with root package name */
    public t f1814l = new t();

    /* renamed from: m  reason: collision with root package name */
    public Future<?> f1815m;
    public Future<?> n;
    public int o = 0;
    public k p = new k(0);
    public a q;
    public f<E> r;

    public boolean j(File file, E e2) {
        return this.r.j(file, e2);
    }

    public String s() {
        String str = this.f1800h.p;
        if (str != null) {
            return str;
        }
        return this.r.f();
    }

    public void start() {
        b bVar;
        b bVar2 = b.ZIP;
        this.f1814l.g(this.c);
        if (this.f1799g != null) {
            this.f1798f = new i(this.f1799g, this.c);
            if (this.f1799g.endsWith(".gz")) {
                n("Will use gz compression");
                bVar = b.GZ;
            } else if (this.f1799g.endsWith(".zip")) {
                n("Will use zip compression");
                bVar = bVar2;
            } else {
                n("No compression will be used");
                bVar = b.b;
            }
            this.f1797e = bVar;
            c cVar = new c(bVar);
            this.f1813k = cVar;
            cVar.g(this.c);
            this.f1812j = new i(c.s(this.f1799g, this.f1797e), this.c);
            StringBuilder i2 = g.a.a.a.a.i("Will use the pattern ");
            i2.append(this.f1812j);
            i2.append(" for the active file");
            n(i2.toString());
            if (this.f1797e == bVar2) {
                new i(e.e.d.l.a.c(this.f1799g.replace('\\', '/')), this.c);
            }
            if (this.r == null) {
                this.r = new a();
            }
            ((d) this.r).g(this.c);
            f<E> fVar = this.r;
            ((g) fVar).f1804e = this;
            fVar.start();
            g gVar = (g) this.r;
            if (!gVar.f1810k) {
                p("Subcomponent did not start. TimeBasedRollingPolicy will not start.");
                return;
            }
            int i3 = this.o;
            if (i3 != 0) {
                a aVar = gVar.f1805f;
                this.q = aVar;
                x xVar = (x) aVar;
                xVar.f1838g = i3;
                xVar.f1839h = this.p.a;
            } else {
                if (!(this.p.a == 0)) {
                    StringBuilder i4 = g.a.a.a.a.i("'maxHistory' is not set, ignoring 'totalSizeCap' option with value [");
                    i4.append(this.p);
                    i4.append("]");
                    p(i4.toString());
                }
            }
            this.f1801i = true;
            return;
        }
        p("The FileNamePattern option must be set before using TimeBasedRollingPolicy. ");
        p("See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
    }

    public void stop() {
        if (this.f1801i) {
            u(this.f1815m, "compression");
            u(this.n, "clean-up");
            this.f1801i = false;
        }
    }

    public void t() throws RolloverFailure {
        Future<?> future;
        String str = ((g) this.r).f1806g;
        String c = e.e.d.l.a.c(str);
        if (this.f1797e == b.b) {
            String str2 = this.f1800h.p;
            if (str2 != null) {
                this.f1814l.s(str2, str);
            }
        } else {
            String str3 = this.f1800h.p;
            if (str3 == null) {
                c cVar = this.f1813k;
                future = cVar.c.d().submit(new c.a(str, str, c));
            } else {
                StringBuilder i2 = g.a.a.a.a.i(str);
                i2.append(System.nanoTime());
                i2.append(".tmp");
                String sb = i2.toString();
                this.f1814l.s(str3, sb);
                c cVar2 = this.f1813k;
                future = cVar2.c.d().submit(new c.a(sb, str, c));
            }
            this.f1815m = future;
        }
        if (this.q != null) {
            Objects.requireNonNull((g) this.r);
            Date date = new Date(System.currentTimeMillis());
            x xVar = (x) this.q;
            this.n = xVar.c.d().submit(new x.a(date));
        }
    }

    public final void u(Future<?> future, String str) {
        String str2;
        StringBuilder sb;
        if (future != null) {
            try {
                future.get(30, TimeUnit.SECONDS);
                return;
            } catch (TimeoutException e2) {
                e = e2;
                sb = new StringBuilder();
                str2 = "Timeout while waiting for ";
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str2 = "Unexpected exception while waiting for ";
            }
        } else {
            return;
        }
        sb.append(str2);
        sb.append(str);
        sb.append(" job to finish");
        c(sb.toString(), e);
    }
}
