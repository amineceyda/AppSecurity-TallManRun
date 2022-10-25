package g.c.a.e.b;

import android.content.Context;
import com.apkpure.aegon.components.download.DownloadTask;
import g.c.a.e.c.b;

public class c implements b.a {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public void a(Context context, DownloadTask downloadTask) {
        if (d.a(this.a, downloadTask)) {
            d.f1964d.info("addListenerForDownloading onDownloadRemoved downloadTask 非法.");
            return;
        }
        this.a.b.remove(downloadTask.getSimpleDisplayInfo().b());
        this.a.d();
    }

    public void b(Context context, DownloadTask downloadTask) {
    }

    public void c(Context context, DownloadTask downloadTask) {
        if (d.a(this.a, downloadTask)) {
            d.f1964d.info("addListenerForDownloading onDownloadStarted downloadTask 非法.");
            return;
        }
        this.a.b.add(downloadTask.getSimpleDisplayInfo().b());
        this.a.d();
    }

    public void d(Context context, DownloadTask downloadTask) {
        if (d.a(this.a, downloadTask)) {
            d.f1964d.info("addListenerForDownloading onDownloadFinished downloadTask 非法.");
        } else if (downloadTask.isSuccess() || downloadTask.isMissing()) {
            this.a.b.remove(downloadTask.getSimpleDisplayInfo().b());
            this.a.d();
        }
    }
}
