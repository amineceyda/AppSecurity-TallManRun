package g.c.a.l.l;

import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.signstuff.apk.XApkDownloadTask;
import org.slf4j.Logger;

public final /* synthetic */ class i implements XApkDownloadTask.b {
    public static final /* synthetic */ i a = new i();

    public final void a(DownloadTask downloadTask) {
        Logger logger = v.o;
        if (downloadTask == null) {
            v.o.info("Add call back task is null.");
        } else if (downloadTask instanceof XApkDownloadTask) {
            ((XApkDownloadTask) downloadTask).b(Boolean.TRUE);
        }
    }
}
