package g.c.a.l.l;

import android.content.Context;
import com.apkpure.aegon.components.download.DownloadTask;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.e.c.b;
import i.o.c.h;

public final class p implements b.a {
    public final /* synthetic */ r a;
    public final /* synthetic */ AppDetailInfo b;

    public p(r rVar, AppDetailInfo appDetailInfo) {
        this.a = rVar;
        this.b = appDetailInfo;
    }

    public void a(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        h.e(downloadTask, "downloadTask");
        r.q.info(h.j("downloadListener onDownloadRemoved:", Float.valueOf(downloadTask.getDownloadPercent())));
        if (h.a(this.b.versionId, downloadTask.getSimpleDisplayInfo().e())) {
            d0.e(this.a, 50, 2006, 0.0d, 4, (Object) null);
        }
    }

    public void b(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        h.e(downloadTask, "downloadTask");
        r.q.debug(h.j("downloadListener onDownloadProgressChanged:", Float.valueOf(downloadTask.getDownloadPercent())));
        this.a.p(this.b, downloadTask);
    }

    public void c(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        h.e(downloadTask, "downloadTask");
        r.q.info(h.j("downloadListener onDownloadStarted:", Float.valueOf(downloadTask.getDownloadPercent())));
        this.a.p(this.b, downloadTask);
    }

    public void d(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        h.e(downloadTask, "downloadTask");
        r.q.info(h.j("downloadListener onDownloadFinished:", Float.valueOf(downloadTask.getDownloadPercent())));
        this.a.p(this.b, downloadTask);
    }
}
