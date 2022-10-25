package g.c.a.l;

import com.google.gson.Gson;
import e.e.d.l.a;
import g.c.a.l.l.o;
import g.c.a.l.o.b;
import g.c.a.l.o.i;
import g.d.a.j.e;
import i.j;
import i.o.b.l;
import i.o.c.h;
import java.io.File;

public final class f implements b {
    public final /* synthetic */ l<o, j> a;

    public f(l<? super o, j> lVar) {
        this.a = lVar;
    }

    public void a() {
        h.e(this, "this");
    }

    public void b(File file) {
        a.h0(this, file);
    }

    public void c(double d2) {
        h.e(this, "this");
    }

    public void d(Throwable th) {
        h.e(th, e.u);
        h.e(this, "this");
        h.e(th, e.u);
        d.b.info(h.j("Get XApk Info From Config exception ", th.getMessage()));
        i.b(i.a, 10, 206, (String) null, "", "", 4);
        this.a.g(null);
    }

    public void e(String str) {
        Throwable th;
        o oVar;
        h.e(str, "str");
        a.i0(this, str);
        if (str.length() == 0) {
            th = new Throwable("parser success,but str is null or empty");
        } else {
            d.b.info(h.j("Get XApk Info From Config json = ", str));
            try {
                d dVar = d.a;
                Class cls = o.class;
                oVar = (o) g.c.b.b.f.y0(cls).cast(((Gson) d.f2049l.getValue()).e(str, cls));
            } catch (Exception e2) {
                d.b.warn(h.j("Get XApk Info From Config parse data exception.", e2.getMessage()));
                oVar = null;
            }
            if (oVar == null) {
                d.b.info("Get XApk Info From Config data is null");
                th = new Throwable("parser success,but str to json data is null.");
            } else {
                j jVar = j.FILE;
                h.e(jVar, "<set-?>");
                oVar.b = jVar;
                oVar.c = 10;
                oVar.f2074h = false;
                i.b(i.a, 10, 205, (String) null, oVar.g(), oVar.b(), 4);
                this.a.g(d.a.l(oVar));
                return;
            }
        }
        d(th);
    }

    public void f(i iVar) {
        a.g0(this, iVar);
    }

    public void g() {
        h.e(this, "this");
    }
}
