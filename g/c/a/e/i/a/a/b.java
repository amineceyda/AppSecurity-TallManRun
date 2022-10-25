package g.c.a.e.i.a.a;

import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import g.c.a.e.k.a.f;
import g.i.b.f.a;
import java.io.File;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ QDDownloadTaskInternal.DemoDownloaderTaskListener b;
    public final /* synthetic */ a c;

    public /* synthetic */ b(QDDownloadTaskInternal.DemoDownloaderTaskListener demoDownloaderTaskListener, a aVar) {
        this.b = demoDownloaderTaskListener;
        this.c = aVar;
    }

    public final void run() {
        String str;
        QDDownloadTaskInternal qDDownloadTaskInternal;
        QDDownloadTaskInternal.DemoDownloaderTaskListener demoDownloaderTaskListener = this.b;
        a aVar = this.c;
        File access$800 = QDDownloadTaskInternal.this.getDownloadTempFile();
        if (!QDDownloadTaskInternal.this.asset.j(access$800)) {
            if (QDDownloadTaskInternal.this.asset.g()) {
                qDDownloadTaskInternal = QDDownloadTaskInternal.this;
                str = DownloadTask.DOWNLOAD_STATUS_EXPIRE;
                qDDownloadTaskInternal.downloadStatus = str;
            } else {
                qDDownloadTaskInternal = QDDownloadTaskInternal.this;
                qDDownloadTaskInternal.downloadStatus = "ERROR";
                StringBuilder i2 = g.a.a.a.a.i("ERROR_");
                i2.append(aVar.A());
                str = i2.toString();
            }
            qDDownloadTaskInternal.setDownloadErrorCode(str);
        } else if (access$800.renameTo(new File(QDDownloadTaskInternal.this.downloadFilePath))) {
            QDDownloadTaskInternal.this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_SUCCESS;
        } else {
            QDDownloadTaskInternal qDDownloadTaskInternal2 = QDDownloadTaskInternal.this;
            qDDownloadTaskInternal2.downloadStatus = "ERROR";
            qDDownloadTaskInternal2.setDownloadErrorCode("ERROR_verifyFile");
            QDDownloadTaskInternal.this.deleteDownloadedFiles();
        }
        QDDownloadTaskInternal.this.updateDownloadTasksDao();
        QDDownloadTaskInternal.this.onDownloadFinish();
        f.a.info(QDDownloadTaskInternal.TAG, (Object) String.format("onError: %s, %s, %s", new Object[]{QDDownloadTaskInternal.this.asset.c(), QDDownloadTaskInternal.this.downloadStatus, Integer.valueOf(aVar.A())}));
    }
}
