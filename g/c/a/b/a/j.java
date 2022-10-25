package g.c.a.b.a;

import android.content.Context;
import com.apkpure.aegon.app.activity.ManagerActivity;
import com.apkpure.aegon.components.download.DownloadTask;
import g.c.a.e.c.b;
import i.o.c.h;

public final class j implements b.a {
    public final /* synthetic */ ManagerActivity a;

    public j(ManagerActivity managerActivity) {
        this.a = managerActivity;
    }

    public void a(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        if (downloadTask != null) {
            ManagerActivity.y(this.a, downloadTask);
        }
    }

    public void b(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        if (downloadTask != null) {
            ManagerActivity.y(this.a, downloadTask);
        }
    }

    public void c(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        if (downloadTask != null) {
            ManagerActivity.y(this.a, downloadTask);
        }
    }

    public void d(Context context, DownloadTask downloadTask) {
        h.e(context, "context");
        if (downloadTask != null && downloadTask.isSuccess()) {
            ManagerActivity managerActivity = this.a;
            int i2 = ManagerActivity.A;
            managerActivity.D();
        }
    }
}
