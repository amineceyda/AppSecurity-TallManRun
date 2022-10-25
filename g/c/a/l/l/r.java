package g.c.a.l.l;

import android.content.Context;
import android.os.Build;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.b.a.k.e;
import g.c.a.b.b.d;
import g.c.a.e.c.b;
import g.c.a.e.h.b.a;
import g.c.a.l.i;
import g.c.b.b.f;
import g.c.b.b.j.b;
import i.l.c;
import i.o.c.h;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class r extends d0 {
    public static final Logger q = LoggerFactory.getLogger("ApkManagerDownloadManagerLog");

    /* renamed from: m  reason: collision with root package name */
    public b.C0060b f2075m;
    public double n;
    public boolean o;
    public DownloadTask p;

    public void c(o oVar, a aVar, e0 e0Var) {
        h.e(oVar, "apkDescription");
        h.e(aVar, "dtPageInfo");
        h.e(e0Var, "listener");
        Logger logger = q;
        StringBuilder i2 = g.a.a.a.a.i("ApkManagerFileManager init2, ");
        i2.append(this.a);
        i2.append(", ");
        i2.append(oVar.g());
        i2.append(", ");
        i2.append(Integer.valueOf(oVar.k()));
        logger.info(i2.toString());
        this.o = false;
        Context context = this.a;
        h.e(context, "<set-?>");
        this.a = context;
        this.f2064g = e0Var;
        l(oVar);
        this.f2065h = aVar;
        r();
    }

    public void f() {
        q.info("Manager销毁");
        j();
        f.f(this.c, (CancellationException) null, 1);
        try {
            b.C0060b bVar = this.f2075m;
            if (bVar != null) {
                bVar.b();
            }
            n();
        } catch (Exception e2) {
            q.error(h.j("onDestroy e:", e2));
        }
    }

    public void g(Context context, String str) {
        g.c.b.b.j.a aVar;
        h.e(context, "context");
        h.e(str, "packageName");
        o oVar = this.f2063f;
        if (oVar == null) {
            aVar = null;
        } else {
            aVar = oVar.f2072f;
        }
        if (aVar != null) {
            g.c.b.b.j.a aVar2 = oVar == null ? null : oVar.f2072f;
            Map<String, Object> j2 = c.j(e.e.d.l.a.D(aVar2));
            o oVar2 = this.f2063f;
            if (oVar2 != null) {
                oVar2.f2072f = null;
            }
            j2.put("fail_desc", "4");
            e.e.d.l.a.r0("AppSuccInstall", aVar2, j2);
        }
        if (this.f2063f.c != 100) {
            d0.e(this, 100, 0, 0.0d, 4, (Object) null);
        }
    }

    public boolean i() {
        Logger logger;
        String str;
        DownloadTask downloadTask = this.p;
        if (downloadTask == null) {
            logger = q;
            str = "reinstallAfterGrantedStorePermission downloadTask is null.";
        } else {
            h.c(downloadTask);
            if (!downloadTask.isSuccess()) {
                DownloadTask downloadTask2 = this.p;
                h.c(downloadTask2);
                if (!downloadTask2.isMissing()) {
                    logger = q;
                    str = "reinstallAfterGrantedStorePermission downloadTask is not success.";
                }
            }
            if (Build.VERSION.SDK_INT < 23 || e.e.c.a.a(AegonApplication.getContext(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                d.a.h(this.a);
                DownloadTask downloadTask3 = this.p;
                h.c(downloadTask3);
                q(downloadTask3);
                return true;
            }
            logger = q;
            str = "ReInstall obb not READ_EXTERNAL_STORAGE permission.";
        }
        logger.info(str);
        d0.e(this, 62, 2001, 0.0d, 4, (Object) null);
        return false;
    }

    public void k() {
        r();
    }

    public final void o(AppDetailInfo appDetailInfo, boolean z, boolean z2) {
        e.e.i.b.D().a(new a(this, appDetailInfo, z2, z));
    }

    public final void p(AppDetailInfo appDetailInfo, DownloadTask downloadTask) {
        int i2;
        if (!h.a(appDetailInfo.versionId, downloadTask.getSimpleDisplayInfo().e())) {
            Logger logger = q;
            StringBuilder i3 = g.a.a.a.a.i("handle listener ppInfo.versionId[");
            i3.append(appDetailInfo.versionId);
            i3.append("] simpleDisplayInfo.versionId[");
            i3.append(downloadTask.getSimpleDisplayInfo().e());
            i3.append(']');
            logger.debug(i3.toString());
            return;
        }
        this.p = downloadTask;
        Logger logger2 = q;
        StringBuilder i4 = g.a.a.a.a.i("isDownloading:");
        i4.append(downloadTask.isDownloading());
        i4.append("\tisWaiting:");
        i4.append(downloadTask.isWaiting());
        i4.append("\tisPreparing:");
        i4.append(downloadTask.isPreparing());
        i4.append("\tisSuccess:");
        i4.append(downloadTask.isSuccess());
        i4.append("\tisAborted:");
        i4.append(downloadTask.isAborted());
        i4.append("\tisCanceled:");
        i4.append(downloadTask.isCanceled());
        i4.append("\tisFailed:");
        i4.append(downloadTask.isFailed());
        i4.append("\tisInvalid:");
        i4.append(downloadTask.isInvalid());
        i4.append("\tisExpired:");
        i4.append(downloadTask.isExpired());
        i4.append("\tisMissing:");
        i4.append(downloadTask.isMissing());
        logger2.debug(i4.toString());
        if (downloadTask.isDownloading()) {
            double downloadPercent = (double) downloadTask.getDownloadPercent();
            double d2 = this.n;
            Double.isNaN(downloadPercent);
            if (downloadPercent - d2 > 1.0d) {
                this.n = downloadPercent;
                d(21, 0, downloadPercent);
                return;
            }
            return;
        }
        if (downloadTask.isCanceled() || downloadTask.isAborted()) {
            i2 = 30;
        } else if (downloadTask.isFailed()) {
            i2 = 22;
        } else if (!downloadTask.isSuccess() && !downloadTask.isMissing()) {
            return;
        } else {
            if (this.o) {
                logger2.info("Had download success");
                return;
            }
            d0.e(this, 23, 0, 0.0d, 4, (Object) null);
            this.o = true;
            i.a.c(this.f2063f);
            d dVar = d.a;
            Context context = AegonApplication.getContext();
            h.d(context, "getContext()");
            String downloadFilePath = downloadTask.getDownloadFilePath();
            h.d(downloadFilePath, "downloadTask.downloadFilePath");
            if (!dVar.g(context, downloadFilePath) || Build.VERSION.SDK_INT < 23 || e.e.c.a.a(AegonApplication.getContext(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                q(downloadTask);
                return;
            }
            logger2.info("Install obb not READ_EXTERNAL_STORAGE permission.");
            d0.e(this, 40, 0, 0.0d, 4, (Object) null);
            return;
        }
        d0.e(this, i2, 0, 0.0d, 4, (Object) null);
    }

    public final void q(DownloadTask downloadTask) {
        Integer num;
        o oVar = this.f2063f;
        String str = null;
        if (oVar == null) {
            num = null;
        } else {
            num = Integer.valueOf(oVar.c);
        }
        if (num != null && num.intValue() == 60) {
            q.info("Had installing.");
            return;
        }
        Context context = this.a;
        if (!(downloadTask.getAsset() != null ? g.c.a.e.d.d.a(context, downloadTask.getAsset().d()) : g.c.a.e.d.d.b(context, downloadTask.getDownloadFilePath())).booleanValue()) {
            d0.e(this, 62, 2021, 0.0d, 4, (Object) null);
            return;
        }
        d0.e(this, 60, 0, 0.0d, 4, (Object) null);
        File file = new File(downloadTask.getDownloadFilePath());
        DTStatInfo statInfo = downloadTask.getStatInfo();
        if (statInfo != null) {
            str = g.c.a.e.k.h.b.c(statInfo);
        }
        HashMap hashMap = new HashMap();
        q.info("安装 dt 参数 {}", (Object) str);
        e.e.d.l.a.j0(hashMap, "stat_info", str);
        b.a aVar = new b.a();
        aVar.a = 4;
        aVar.f2288e = 0;
        aVar.b(new q(this));
        aVar.f2294k = hashMap;
        g.c.b.b.j.b a = aVar.a();
        a();
        h();
        g.c.b.b.c a2 = g.c.b.b.c.f2226m.a();
        Context context2 = this.a;
        String absolutePath = file.getAbsolutePath();
        h.d(absolutePath, "file.absolutePath");
        a2.n(context2, absolutePath, a, false, g.c.b.b.l.f.FAST_DOWNLOAD);
    }

    public final void r() {
        d0.e(this, 20, 0, 0.0d, 4, (Object) null);
        e.a(this.f2063f.g(), new e(this));
    }
}
