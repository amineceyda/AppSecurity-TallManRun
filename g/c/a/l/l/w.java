package g.c.a.l.l;

import android.content.Context;
import com.apkpure.aegon.components.download.DownloadTask;
import g.c.a.e.c.b;
import i.o.c.h;

public final class w implements b.a {
    public final /* synthetic */ b0 a;

    public w(b0 b0Var) {
        this.a = b0Var;
    }

    public void a(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        h.e(downloadTask, "downloadTask");
        b0.p.info(h.j("downloadListener onDownloadRemoved:", Float.valueOf(downloadTask.getDownloadPercent())));
        if (h.a(this.a.f2063f.l(), downloadTask.getSimpleDisplayInfo().e())) {
            b0 b0Var = this.a;
            o oVar = b0Var.f2063f;
            oVar.c = 50;
            oVar.f2071e = 2006;
            e0 e0Var = b0Var.f2064g;
            if (e0Var != null) {
                e0Var.a(oVar);
            }
        }
    }

    public void b(Context context, DownloadTask downloadTask) {
    }

    public void c(Context context, DownloadTask downloadTask) {
    }

    public void d(Context context, DownloadTask downloadTask) {
    }
}
