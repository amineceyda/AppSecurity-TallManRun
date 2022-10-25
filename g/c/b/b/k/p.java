package g.c.b.b.k;

import android.view.View;
import g.c.b.b.c;
import g.c.b.b.i.b;
import g.c.b.b.i.e.e;
import g.c.b.b.i.e.j;
import g.c.b.b.i.e.k;
import g.c.b.b.j.a;
import i.o.c.h;
import java.util.Objects;

public final class p implements b {
    public void a(a aVar) {
        q.c = aVar;
        if (c.d().f2227d != null) {
            k kVar = c.d().f2227d;
            Objects.requireNonNull(kVar);
            h.e(aVar, "installTask");
            kVar.a().post(new j(kVar, aVar));
        }
    }

    public boolean b(a aVar) {
        q.c = aVar;
        if (c.d().f2227d == null) {
            return false;
        }
        c.d().f2227d.d(aVar);
        return false;
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public void e() {
    }

    public void f(a aVar) {
        q.a.info("NoActivityInstaller onSuccess: {}", (Object) aVar.toString());
        q.c = aVar;
        if (c.d().f2227d != null) {
            c.d().f2227d.e(aVar);
        }
    }

    public void g(a aVar) {
        q.c = aVar;
        if (c.d().f2227d != null) {
            k kVar = c.d().f2227d;
            Objects.requireNonNull(kVar);
            h.e(aVar, "installTask");
            kVar.a().post(new e(kVar, aVar));
        }
    }

    public void h(View view) {
    }

    public boolean i(a aVar) {
        q.c = aVar;
        if (c.d().f2227d == null) {
            return false;
        }
        c.d().f2227d.b(aVar);
        return false;
    }

    public void j(a aVar, int i2, String str) {
        q.a.info("NoActivityInstaller onError: {}", (Object) aVar.toString());
        q.c = aVar;
        if (c.d().f2227d != null) {
            c.d().f2227d.c(aVar, i2, str);
        }
        c.d().s();
    }
}
