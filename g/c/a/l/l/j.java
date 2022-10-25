package g.c.a.l.l;

import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.signstuff.apk.XApkDownloadTask;
import org.slf4j.Logger;

public final /* synthetic */ class j implements XApkDownloadTask.b {
    public static final /* synthetic */ j a = new j();

    public final void a(DownloadTask downloadTask) {
        Logger logger = b0.p;
        if (downloadTask == null) {
            b0.p.info("Add call back task is null.");
        } else if (downloadTask instanceof XApkDownloadTask) {
            ((XApkDownloadTask) downloadTask).b(Boolean.TRUE);
        }
    }
}
