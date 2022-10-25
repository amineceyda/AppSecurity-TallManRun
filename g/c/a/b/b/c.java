package g.c.a.b.b;

import android.content.Context;
import android.view.View;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.crabshell.builder.ShellBuilderService;
import g.c.b.b.j.a;
import g.c.c.k;
import i.o.c.h;
import j.a.f;
import java.util.Map;
import java.util.Objects;

public final class c implements g.c.b.b.i.c {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f<Boolean> f1910d;

    public c(Context context, g gVar, f<? super Boolean> fVar) {
        this.b = context;
        this.c = gVar;
        this.f1910d = fVar;
    }

    public void a(a aVar) {
        h.e(aVar, "installTask");
        d dVar = d.a;
        Context context = this.b;
        String str = aVar.f2272e;
        if (str != null) {
            e.e.d.l.a.O(this.b, "PACKAGE_ADDING", aVar.a, d.a(dVar, context, str));
            Map<String, Object> j2 = i.l.c.j(e.e.d.l.a.D(aVar));
            boolean k2 = dVar.k(this.b, this.c);
            d.b.debug("onStart should change pop type to FastDownload, {}", (Object) Boolean.valueOf(k2));
            if (k2) {
                j2.put("pop_type", "fast_download_pop");
            }
            e.e.d.l.a.r0("AppStartInstall", aVar, j2);
            d.f1912e = aVar;
        }
    }

    public boolean b(a aVar) {
        h.e(aVar, "installTask");
        return false;
    }

    public void c() {
        h.e(this, "this");
    }

    public void e() {
        h.e(this, "this");
    }

    public void f(a aVar) {
        h.e(aVar, "installTask");
        if (d.f1912e != null) {
            d dVar = d.a;
            d.f1912e = null;
            d.b(dVar, this.b, this.c, aVar);
        }
        d dVar2 = d.a;
        if (h.a(aVar.a, RealApplicationLike.MAIN_PROCESS_NAME)) {
            d.b.info("安装自己, 清空套壳信息");
            k a2 = k.a();
            Context context = RealApplicationLike.getContext();
            Objects.requireNonNull(a2);
            new ShellBuilderService().cleanLastVersion(context);
            a2.a = true;
        }
        if (!this.a) {
            try {
                this.a = true;
                f<Boolean> fVar = this.f1910d;
                if (fVar != null) {
                    fVar.g(Boolean.TRUE);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void g(a aVar) {
        h.e(aVar, "installTask");
    }

    public void h(View view) {
        g.c.b.b.f.e0(this, view);
    }

    public boolean i(a aVar) {
        h.e(aVar, "installTask");
        return false;
    }

    public void j(a aVar, int i2, String str) {
        h.e(aVar, "installTask");
        h.e(str, "msg");
        d dVar = d.a;
        if (!dVar.j(this.b, str, aVar)) {
            Map<String, Object> j2 = i.l.c.j(e.e.d.l.a.D(aVar));
            boolean k2 = dVar.k(this.b, this.c);
            d.b.debug("onError should change pop type to FastDownload, {}", (Object) Boolean.valueOf(k2));
            if (k2) {
                j2.put("pop_type", "fast_download_pop");
            }
            e.e.d.l.a.j0(j2, "install_fail_code", String.valueOf(i2));
            e.e.d.l.a.r0("AppFailInstall", aVar, j2);
            if (!this.a) {
                try {
                    this.a = true;
                    f<Boolean> fVar = this.f1910d;
                    if (fVar != null) {
                        fVar.g(Boolean.FALSE);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
