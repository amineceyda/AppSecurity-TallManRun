package g.c.a.e.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import com.apkpure.aegon.signstuff.apk.XApkDownloadTask;
import e.e.d.l.a;
import g.c.a.e.h.b.d;
import g.c.a.e.j.b;
import g.c.a.e.k.a.f;
import g.c.a.m.j;
import i.o.c.h;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;

public class g {
    public static void a(DownloadTask downloadTask) {
        String str;
        String c = c(downloadTask);
        AppDigest d2 = AppDigest.d(downloadTask.getUserData());
        if (!TextUtils.isEmpty(c) && d2 != null) {
            b D = e.e.i.b.D();
            b bVar = b.b;
            AegonApplication.getApplication().getString(2131821518);
            D.a(bVar);
            Bundle bundle = new Bundle();
            bundle.putString("download_package_name", d2.a());
            bundle.putString("engine", c);
            bundle.putString("download_status", "success");
            Map<String, Object> y = a.y(downloadTask, downloadTask.getStatInfo() != null ? System.currentTimeMillis() - downloadTask.getStatInfo().downloadStartTime : -1);
            if (downloadTask.isSuccess()) {
                if (a.X(downloadTask)) {
                    d.f("AppUpdateDownloadSucc", y);
                    str = "downloadBtnSuccess(update) params = ";
                } else {
                    d.f("AppSuccDownload", y);
                    str = "downloadBtnSuccess params = ";
                }
                j.a("DTDownloadReporter", h.j(str, y));
            }
        }
    }

    public static String b(int i2) {
        String str;
        String str2;
        StringBuilder sb;
        Class<g> cls = g.class;
        String c = g.c.a.e.h.a.h.a().c();
        if (TextUtils.isEmpty(c)) {
            c = g.c.a.e.h.a.h.a().b();
        }
        DownloadTask g2 = e.i(AegonApplication.getContext()).g(i2);
        if (g2 == null || g2.getStatInfo() == null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            StringBuilder i3 = g.a.a.a.a.i(c);
            i3.append(UUID.randomUUID().toString());
            i3.append(valueOf);
            str = g.c.a.e.k.b.a.b(g.c.a.e.k.b.a.d(), i3.toString());
            sb = new StringBuilder();
            str2 = "new downloadId=";
        } else {
            str = g2.getStatInfo().downloadId;
            sb = new StringBuilder();
            str2 = "get before downloadId=";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", this=");
        sb.append(cls);
        g.c.a.e.e.a.a("DownloadUtils", sb.toString());
        return str;
    }

    public static String c(DownloadTask downloadTask) {
        return downloadTask instanceof XApkDownloadTask ? "" : downloadTask instanceof QDDownloadTaskInternal ? "QDDownload" : "unKnow";
    }

    public static void d(DownloadTask downloadTask) {
        String str;
        String c = c(downloadTask);
        AppDigest d2 = AppDigest.d(downloadTask.getUserData());
        if (!TextUtils.isEmpty(c) && d2 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("download_package_name", d2.a());
            bundle.putString("engine", c);
            bundle.putString("download_status", "start");
            Logger logger = f.a;
            StringBuilder i2 = g.a.a.a.a.i("QDS startDownload:");
            i2.append(d2.a());
            logger.info(i2.toString());
            Map<String, Object> y = a.y(downloadTask, 1);
            if (a.X(downloadTask)) {
                d.f("AppStartUpdate", y);
                str = "downloadBtnStart(update) params = ";
            } else {
                d.f("AppStartDownload", y);
                str = "downloadBtnStart params = ";
            }
            j.a("DTDownloadReporter", h.j(str, y));
        }
    }
}
