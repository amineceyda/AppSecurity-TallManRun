package com.apkpure.aegon.signstuff.apk;

import android.os.Parcel;
import android.os.Parcelable;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import g.c.a.e.b.e;
import g.c.a.l.l.o;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XApkDownloadTask extends QDDownloadTaskInternal implements Parcelable {
    public static final Parcelable.Creator<XApkDownloadTask> CREATOR = new a();
    private static Map<String, WeakReference<b>> callbackMap = new HashMap();
    private static final Logger logger = LoggerFactory.getLogger("ApkDownloadTask");
    private String flag = "";

    public static class a implements Parcelable.Creator<XApkDownloadTask> {
        public Object createFromParcel(Parcel parcel) {
            return new XApkDownloadTask(parcel);
        }

        public Object[] newArray(int i2) {
            return new XApkDownloadTask[i2];
        }
    }

    public interface b {
        void a(DownloadTask downloadTask);
    }

    public XApkDownloadTask(Parcel parcel) {
        super(parcel);
        this.flag = parcel.readString();
    }

    public XApkDownloadTask(o oVar, Asset asset, String str, a aVar) {
        this.asset = asset;
        this.downloadFilePath = str;
        this.completeAction = DownloadTask.COMPLETE_ACTION_NONE;
        this.statInfo = new DTStatInfo();
        SimpleDisplayInfo g2 = SimpleDisplayInfo.g(oVar.f(), oVar.d(), oVar.g());
        this.simpleDisplayInfo = g2;
        g2.k(oVar.l());
        this.simpleDisplayInfo.j(String.valueOf(oVar.k()));
        this.userData = g.c.a.e.k.h.b.c(AppDigest.e(oVar.g(), oVar.k(), oVar.h(), oVar.l()));
    }

    public static void a(XApkDownloadTask xApkDownloadTask, b bVar) {
        Objects.requireNonNull(xApkDownloadTask);
        Logger logger2 = logger;
        logger2.debug("Apk download task start add.");
        DownloadTask e2 = e.i(AegonApplication.getApplication()).e(xApkDownloadTask.asset);
        if (e2 != null) {
            StringBuilder i2 = g.a.a.a.a.i("Had apk download task. task name ");
            i2.append(e2.getClass().getName());
            logger2.info(i2.toString());
            bVar.a(e2);
            return;
        }
        logger2.info("Get apk download task from service is null.");
        String valueOf = String.valueOf(bVar.hashCode());
        xApkDownloadTask.flag = valueOf;
        callbackMap.put(valueOf, new WeakReference(bVar));
        if (!e.c(AegonApplication.getContext(), xApkDownloadTask, Boolean.TRUE, false)) {
            logger2.info("Apk download task add fail.");
            bVar.a((DownloadTask) null);
        }
    }

    public void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.downloadPercent = 1.0f;
            this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_SUCCESS;
            updateDownloadTasksDao();
            return;
        }
        this.downloadStatus = "ERROR";
        updateDownloadTasksDao();
        remove();
    }

    public final void c(String str, XApkDownloadTask xApkDownloadTask) {
        Logger logger2;
        StringBuilder sb;
        String str2;
        if (!callbackMap.containsKey(str)) {
            logger2 = logger;
            sb = new StringBuilder();
            str2 = "Notify task start callback is empty. flag=";
        } else {
            b bVar = (b) callbackMap.get(str).get();
            if (bVar == null) {
                logger2 = logger;
                sb = new StringBuilder();
                str2 = "Notify task start callback is released. flag=";
            } else {
                bVar.a(xApkDownloadTask);
                return;
            }
        }
        sb.append(str2);
        sb.append(str);
        logger2.info(sb.toString());
    }

    public int describeContents() {
        return 0;
    }

    public boolean isInit() {
        return (this.context == null || this.downloadTasksDao == null) ? false : true;
    }

    public boolean isSuccess() {
        return super.isSuccess();
    }

    public boolean start() {
        Logger logger2 = logger;
        logger2.debug("Apk download task start.");
        if (!isCanStart()) {
            StringBuilder i2 = g.a.a.a.a.i("Apk download task start fail. can't start.  isInit=");
            i2.append(isInit());
            i2.append(" isDownloading[${isDownloading}]  isSuccess[${isSuccess}]");
            logger2.info(i2.toString());
            c(this.flag, (XApkDownloadTask) null);
            return false;
        }
        this.isStarted = true;
        this.lastDownloadPercent = 0.0f;
        this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_SUCCESS;
        this.statInfo.downloadStartTime = System.currentTimeMillis();
        if (!isAborted() && !isCanceled()) {
            this.downloadDate = new Date();
            this.downloadPercent = 0.0f;
            this.totalSize = -1;
            this.downloadSize = -1;
        }
        updateDownloadTasksDao();
        logger2.debug("Apk download task start update download task dao.");
        c(this.flag, this);
        return true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.flag);
    }
}
