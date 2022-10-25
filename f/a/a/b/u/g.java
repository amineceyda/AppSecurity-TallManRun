package f.a.a.b.u;

import f.a.a.b.u.j.a;
import f.a.a.b.u.j.e;
import f.a.a.b.u.j.u;
import f.a.a.b.w.d;
import java.io.File;
import java.util.Date;
import java.util.Locale;

public abstract class g<E> extends d implements f<E> {

    /* renamed from: e  reason: collision with root package name */
    public h<E> f1804e;

    /* renamed from: f  reason: collision with root package name */
    public a f1805f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f1806g;

    /* renamed from: h  reason: collision with root package name */
    public u f1807h;

    /* renamed from: i  reason: collision with root package name */
    public Date f1808i = null;

    /* renamed from: j  reason: collision with root package name */
    public long f1809j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1810k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1811l = true;

    public String f() {
        return this.f1804e.f1812j.s(this.f1808i);
    }

    public boolean k() {
        return this.f1810k;
    }

    public void s() {
        this.f1809j = this.f1807h.b(this.f1808i, 1).getTime();
    }

    public void start() {
        u uVar;
        e<Object> u = this.f1804e.f1798f.u();
        if (u != null) {
            if (u.f1822h != null) {
                uVar = new u(u.f1821g, u.f1822h, Locale.US);
            } else {
                uVar = new u(u.f1821g, u.b, Locale.US);
            }
            this.f1807h = uVar;
            StringBuilder i2 = g.a.a.a.a.i("The date pattern is '");
            i2.append(u.f1821g);
            i2.append("' from file name pattern '");
            i2.append(this.f1804e.f1798f.f1826e);
            i2.append("'.");
            n(i2.toString());
            this.f1807h.g(this);
            if (!this.f1807h.d()) {
                m("The date format in FileNamePattern will result in collisions in the names of archived log files.");
                m("http://logback.qos.ch/codes.html#rfa_collision_in_dateFormat");
                this.f1811l = false;
                return;
            }
            this.f1808i = new Date(System.currentTimeMillis());
            if (this.f1804e.f1800h.p != null) {
                File file = new File(this.f1804e.f1800h.p);
                if (file.exists() && file.canRead()) {
                    this.f1808i = new Date(file.lastModified());
                }
            }
            StringBuilder i3 = g.a.a.a.a.i("Setting initial period to ");
            i3.append(this.f1808i);
            n(i3.toString());
            s();
            return;
        }
        throw new IllegalStateException(g.a.a.a.a.f(g.a.a.a.a.i("FileNamePattern ["), this.f1804e.f1798f.f1826e, "] does not contain a valid DateToken"));
    }

    public void stop() {
        this.f1810k = false;
    }
}
