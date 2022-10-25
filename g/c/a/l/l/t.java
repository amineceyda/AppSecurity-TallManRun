package g.c.a.l.l;

import android.view.View;
import g.c.a.g.a.o.d;
import g.c.b.b.f;
import g.c.b.b.i.b;
import g.c.b.b.j.a;
import i.o.c.h;
import java.util.Map;

public final class t implements b {
    public long a;
    public final /* synthetic */ v b;

    public t(v vVar) {
        this.b = vVar;
    }

    public void a(a aVar) {
        h.e(aVar, "installTask");
        v.o.info("apk getInstallListener onStart task: {}", (Object) aVar.toString());
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
        e.e.d.l.a.r0("AppStartInstall", aVar, D);
    }

    public boolean b(a aVar) {
        h.e(aVar, "installTask");
        v.o.debug("apk getInstallListener onExpansionProgress: {}", (Object) Integer.valueOf(aVar.f2275h));
        return false;
    }

    public void c() {
        f.f0(this);
    }

    public boolean d() {
        v vVar;
        o oVar;
        boolean z = !d.b;
        if (z && (oVar = vVar.f2063f) != null) {
            oVar.f2071e = 2002;
            e0 e0Var = (vVar = this.b).f2064g;
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
        v.o.info("apk getInstallListener onSuccess, task: {}", (Object) aVar.toString());
        v vVar = this.b;
        if (vVar.f2063f.c != 100) {
            d0.e(vVar, 100, 0, 0.0d, 4, (Object) null);
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
        v.o.info("apk getInstallListener onStartInstall task: {}", (Object) aVar.toString());
    }

    public void h(View view) {
        f.d0(this, view);
    }

    public boolean i(a aVar) {
        h.e(aVar, "installTask");
        v.o.debug("apk getInstallListener onApkProgress: {}", (Object) Integer.valueOf(aVar.f2275h));
        v vVar = this.b;
        o oVar = vVar.f2063f;
        oVar.c = 61;
        oVar.a = (double) aVar.f2275h;
        e0 e0Var = vVar.f2064g;
        if (e0Var == null) {
            return false;
        }
        e0Var.a(oVar);
        return false;
    }

    public void j(a aVar, int i2, String str) {
        int i3;
        o oVar;
        String str2;
        h.e(aVar, "installTask");
        h.e(str, "msg");
        v.o.info(g.a.a.a.a.c("apk getInstallListener onError:", str, " task: {}"), (Object) aVar.toString());
        if (i2 == 22) {
            o oVar2 = this.b.f2063f;
            if (oVar2 == null) {
                str2 = null;
            } else {
                str2 = oVar2.g();
            }
            if (h.a(str2, aVar.a)) {
                return;
            }
        }
        if (i2 == 20) {
            oVar = this.b.f2063f;
            i3 = 50;
        } else {
            oVar = this.b.f2063f;
            i3 = 62;
        }
        oVar.c = i3;
        v vVar = this.b;
        o oVar3 = vVar.f2063f;
        oVar3.f2071e = i2;
        e0 e0Var = vVar.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar3);
        }
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
        e.e.d.l.a.j0(D, "fail_desc", str);
        e.e.d.l.a.j0(D, "install_fail_code", String.valueOf(i2));
        e.e.d.l.a.r0("AppFailInstall", aVar, D);
    }
}
