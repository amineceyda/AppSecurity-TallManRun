package g.c.a.l.l;

import android.view.View;
import g.c.a.g.a.o.d;
import g.c.b.b.f;
import g.c.b.b.i.b;
import g.c.b.b.j.a;
import i.o.c.h;
import java.util.Map;

public final class y implements b {
    public long a;
    public final /* synthetic */ b0 b;

    public y(b0 b0Var) {
        this.b = b0Var;
    }

    public void a(a aVar) {
        h.e(aVar, "installTask");
        b0.p.info("xpk getInstallListener onStart task: {}", (Object) aVar.toString());
        b0 b0Var = this.b;
        o oVar = b0Var.f2063f;
        oVar.c = 60;
        oVar.f2071e = 0;
        oVar.a = (double) aVar.f2275h;
        e0 e0Var = b0Var.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
        e.e.d.l.a.r0("AppStartInstall", aVar, D);
    }

    public boolean b(a aVar) {
        h.e(aVar, "installTask");
        b0.p.info("xpk getInstallListener onExpansionProgress{}", (Object) Integer.valueOf(aVar.f2275h));
        return false;
    }

    public void c() {
        f.f0(this);
    }

    public boolean d() {
        b0 b0Var;
        o oVar;
        boolean z = !d.b;
        if (z && (oVar = b0Var.f2063f) != null) {
            oVar.f2071e = 2002;
            e0 e0Var = (b0Var = this.b).f2064g;
            if (e0Var != null) {
                e0Var.a(oVar);
            }
        }
        return !z;
    }

    public void e() {
        f.c0(this);
    }

    public void f(a aVar) {
        h.e(aVar, "installTask");
        b0.p.info("xpk getInstallListener onSuccess task: {}", (Object) aVar.toString());
        b0 b0Var = this.b;
        if (b0Var.f2063f.c != 100) {
            d0.e(b0Var, 100, 0, 0.0d, 4, (Object) null);
        }
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        if (System.currentTimeMillis() - this.a > 200) {
            e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
            e.e.d.l.a.r0("AppSuccInstall", aVar, D);
            this.a = System.currentTimeMillis();
        }
    }

    public void g(a aVar) {
        h.e(aVar, "installTask");
        b0.p.info("xpk getInstallListener onStartInstall task: {}", (Object) aVar.toString());
        b0 b0Var = this.b;
        o oVar = b0Var.f2063f;
        oVar.c = 61;
        oVar.a = (double) aVar.f2275h;
        e0 e0Var = b0Var.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
    }

    public void h(View view) {
        f.d0(this, view);
    }

    public boolean i(a aVar) {
        h.e(aVar, "installTask");
        b0.p.info("xpk getInstallListener onApkProgress{}", (Object) Integer.valueOf(aVar.f2275h));
        b0 b0Var = this.b;
        o oVar = b0Var.f2063f;
        oVar.c = 61;
        oVar.a = (double) aVar.f2275h;
        e0 e0Var = b0Var.f2064g;
        if (e0Var == null) {
            return false;
        }
        e0Var.a(oVar);
        return false;
    }

    public void j(a aVar, int i2, String str) {
        String str2;
        h.e(aVar, "installTask");
        h.e(str, "msg");
        b0.p.info("xpk getInstallListener onError status: {}, msg: {} task: {}", Integer.valueOf(i2), str, aVar.toString());
        if (i2 == 22) {
            o oVar = this.b.f2063f;
            if (oVar == null) {
                str2 = null;
            } else {
                str2 = oVar.g();
            }
            if (h.a(str2, aVar.a)) {
                return;
            }
        }
        b0 b0Var = this.b;
        o oVar2 = b0Var.f2063f;
        oVar2.c = 62;
        oVar2.f2071e = i2;
        e0 e0Var = b0Var.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar2);
        }
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
        e.e.d.l.a.j0(D, "fail_desc", str);
        e.e.d.l.a.j0(D, "install_fail_code", String.valueOf(i2));
        e.e.d.l.a.r0("AppFailInstall", aVar, D);
    }
}
