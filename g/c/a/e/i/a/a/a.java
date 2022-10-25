package g.c.a.e.i.a.a;

import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import g.c.a.e.k.a.f;
import java.io.File;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ QDDownloadTaskInternal.DemoDownloaderTaskListener b;

    public /* synthetic */ a(QDDownloadTaskInternal.DemoDownloaderTaskListener demoDownloaderTaskListener) {
        this.b = demoDownloaderTaskListener;
    }

    public final void run() {
        QDDownloadTaskInternal.DemoDownloaderTaskListener demoDownloaderTaskListener = this.b;
        File access$500 = QDDownloadTaskInternal.this.getDownloadFile();
        if (QDDownloadTaskInternal.this.asset.j(access$500)) {
            QDDownloadTaskInternal.this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_SUCCESS;
        } else {
            QDDownloadTaskInternal qDDownloadTaskInternal = QDDownloadTaskInternal.this;
            qDDownloadTaskInternal.downloadStatus = DownloadTask.DOWNLOAD_STATUS_INVALID;
            qDDownloadTaskInternal.setDownloadErrorCode(DownloadTask.DOWNLOAD_STATUS_INVALID);
            if (!access$500.delete()) {
                f.a.info(QDDownloadTaskInternal.TAG, (Object) String.format("Failed to delete invalid download file: %s", new Object[]{access$500.getAbsolutePath()}));
            }
        }
        QDDownloadTaskInternal.this.updateDownloadTasksDao();
        QDDownloadTaskInternal.this.onDownloadFinish();
        f.a.info(QDDownloadTaskInternal.TAG, (Object) String.format("onSuccess: %s, %s", new Object[]{QDDownloadTaskInternal.this.asset.c(), QDDownloadTaskInternal.this.downloadStatus}));
    }
}
