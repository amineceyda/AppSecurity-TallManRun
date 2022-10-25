package g.c.a.l.l;

import android.content.Context;
import android.os.Environment;
import android.view.View;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.download.DownloadTask;
import g.c.a.g.a.o.d;
import g.c.a.l.k;
import g.c.b.b.f;
import g.c.b.b.i.b;
import g.c.b.b.j.a;
import i.o.c.h;
import java.util.Map;
import org.slf4j.Logger;

public final class q implements b {
    public long a;
    public final /* synthetic */ r b;

    public q(r rVar) {
        this.b = rVar;
    }

    public void a(a aVar) {
        h.e(aVar, "installTask");
        r.q.info("download getInstallListener onStart");
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
        e.e.d.l.a.r0("AppStartInstall", aVar, D);
        o oVar = this.b.f2063f;
        oVar.f2072f = aVar;
        oVar.f2073g = D;
    }

    public boolean b(a aVar) {
        h.e(aVar, "installTask");
        r.q.debug("download getInstallListener onExpansionProgress");
        return false;
    }

    public void c() {
        f.f0(this);
    }

    public boolean d() {
        boolean z = !d.b;
        Logger logger = r.q;
        StringBuilder i2 = g.a.a.a.a.i("Install listener is AppInForeground[");
        i2.append(!z);
        i2.append("].");
        logger.info(i2.toString());
        if (z) {
            d0.e(this.b, 61, 2002, 0.0d, 4, (Object) null);
        }
        return !z;
    }

    public void e() {
        f.c0(this);
    }

    public void f(a aVar) {
        h.e(aVar, "installTask");
        r.q.info("download getInstallListener onSuccess");
        Map<String, Object> D = e.e.d.l.a.D(aVar);
        if (System.currentTimeMillis() - this.a > 200 && this.b.f2063f.f2072f != null) {
            e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
            e.e.d.l.a.r0("AppSuccInstall", aVar, D);
            this.a = System.currentTimeMillis();
        }
        r rVar = this.b;
        o oVar = rVar.f2063f;
        oVar.f2072f = null;
        oVar.f2073g = null;
        if (oVar.c != 100) {
            d0.e(rVar, 100, 0, 0.0d, 4, (Object) null);
        }
    }

    public void g(a aVar) {
        h.e(aVar, "installTask");
        r.q.info("download getInstallListener onStartInstall");
        this.b.d(60, 0, (double) aVar.f2275h);
    }

    public void h(View view) {
        f.d0(this, view);
    }

    public boolean i(a aVar) {
        h.e(aVar, "installTask");
        r.q.debug("download getInstallListener onApkProgress");
        this.b.d(61, 0, (double) aVar.f2275h);
        return false;
    }

    public void j(a aVar, int i2, String str) {
        int i3;
        String str2;
        String str3;
        h.e(aVar, "installTask");
        h.e(str, "msg");
        Logger logger = r.q;
        logger.info(h.j("download getInstallListener onError:", str));
        if (i2 == 22) {
            o oVar = this.b.f2063f;
            if (oVar == null) {
                str3 = null;
            } else {
                str3 = oVar.g();
            }
            if (h.a(str3, aVar.a)) {
                return;
            }
        }
        int i4 = i2 == 20 ? 50 : 62;
        g.c.a.b.b.d dVar = g.c.a.b.b.d.a;
        if (!dVar.j(this.b.a, str, aVar)) {
            r rVar = this.b;
            if (rVar.p == null) {
                str2 = "reportObbStorePermissionError downloadTask is null.";
            } else {
                Context context = AegonApplication.getContext();
                h.d(context, "getContext()");
                DownloadTask downloadTask = rVar.p;
                h.c(downloadTask);
                String downloadFilePath = downloadTask.getDownloadFilePath();
                h.d(downloadFilePath, "downloadTask!!.downloadFilePath");
                if (!dVar.g(context, downloadFilePath)) {
                    str2 = "reportObbStorePermissionError is not install obb.";
                } else {
                    String str4 = Environment.getExternalStorageDirectory() + "/Android/obb";
                    k kVar = k.a;
                    if (k.a(str4)) {
                        str2 = "reportObbStorePermissionError obbPath[" + str4 + "] is available.";
                    } else {
                        logger.info("Install obb not READ_EXTERNAL_STORAGE permission. obbPath[" + str4 + ']');
                        i3 = 2024;
                        d0.e(rVar, i4, i3, 0.0d, 4, (Object) null);
                        Map<String, Object> D = e.e.d.l.a.D(aVar);
                        e.e.d.l.a.j0(D, "pop_type", "fast_download_pop");
                        e.e.d.l.a.j0(D, "fail_desc", str);
                        e.e.d.l.a.j0(D, "install_fail_code", String.valueOf(i2));
                        e.e.d.l.a.r0("AppFailInstall", aVar, D);
                    }
                }
            }
            logger.debug(str2);
            i3 = i2;
            d0.e(rVar, i4, i3, 0.0d, 4, (Object) null);
            Map<String, Object> D2 = e.e.d.l.a.D(aVar);
            e.e.d.l.a.j0(D2, "pop_type", "fast_download_pop");
            e.e.d.l.a.j0(D2, "fail_desc", str);
            e.e.d.l.a.j0(D2, "install_fail_code", String.valueOf(i2));
            e.e.d.l.a.r0("AppFailInstall", aVar, D2);
        }
    }
}
