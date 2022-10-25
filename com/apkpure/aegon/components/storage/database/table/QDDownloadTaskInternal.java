package com.apkpure.aegon.components.storage.database.table;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import g.c.a.e.h.b.d;
import g.c.a.e.k.a.f;
import g.c.a.m.j;
import g.f.a.b.n;
import g.f.a.d.e;
import g.f.a.i.a;
import g.i.b.b;
import g.i.b.f.c;
import i.o.c.h;
import java.io.File;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;

@a(tableName = "qd_download_tasks")
public class QDDownloadTaskInternal extends DownloadTask {
    public static final Parcelable.Creator<QDDownloadTaskInternal> CREATOR = new Parcelable.Creator<QDDownloadTaskInternal>() {
        public QDDownloadTaskInternal createFromParcel(Parcel parcel) {
            return new QDDownloadTaskInternal(parcel);
        }

        public QDDownloadTaskInternal[] newArray(int i2) {
            return new QDDownloadTaskInternal[i2];
        }
    };
    /* access modifiers changed from: private */
    public static final String TAG = QDDownloadTaskInternal.class.getSimpleName();
    private static int _id = 0;
    @e(canBeNull = false, columnName = "asset_hash", id = true, index = true, unique = true, useGetSet = true)
    private String __assetHash;
    @e(canBeNull = false, columnName = "asset_json", useGetSet = true)
    private String __assetJson;
    @e(columnName = "complete_action", useGetSet = true)
    private String __completeAction;
    @e(columnName = "download_date", useGetSet = true)
    private Date __downloadDate;
    @e(canBeNull = false, columnName = "download_file_path", useGetSet = true)
    private String __downloadFilePath;
    @e(columnName = "download_percent", useGetSet = true)
    private float __downloadPercent;
    @e(columnName = "download_status", useGetSet = true)
    private String __downloadStatus;
    @e(columnName = "simple_display_info_json", useGetSet = true)
    private String __simpleDisplayInfoJson;
    @e(columnName = "stat_info_json", useGetSet = true)
    private String __statInfoJson;
    @e(columnName = "user_data", useGetSet = true)
    private String __userData;
    public Context context;
    public g.i.b.f.a currentTask;
    public Date downloadDate;
    public QDDownloadListener downloadListener;
    public float downloadPercent;
    public long downloadSize = -1;
    public String downloadStatus;
    public n<QDDownloadTaskInternal, String> downloadTasksDao;
    public g.i.b.a downloader;
    private long firstReceiveDataBaseSize = -1;
    private long firstReceiveDataTime = -1;
    private int id;
    private boolean isRemoveOnFinish = false;
    public boolean isStarted = false;
    public float lastDownloadPercent;
    private long lastProgressChangeTime = 0;
    public c taskListener = new DemoDownloaderTaskListener();
    public long totalSize = -1;

    public class DemoDownloaderTaskListener implements c {
        private DemoDownloaderTaskListener() {
        }

        public void onTaskCompletedMainloop(g.i.b.f.a aVar) {
            f.a.info(QDDownloadTaskInternal.TAG, (Object) "QDS onTaskCompleted.");
        }

        public void onTaskCompletedSubloop(g.i.b.f.a aVar) {
            try {
                b.c().b(aVar, false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            g.c.a.e.j.b D = e.e.i.b.D();
            g.c.a.e.i.a.a.a aVar2 = new g.c.a.e.i.a.a.a(this);
            AegonApplication.getApplication().getString(2131821518);
            D.a(aVar2);
        }

        public void onTaskDetectedMainloop(g.i.b.f.a aVar) {
            Logger logger = f.a;
            String access$100 = QDDownloadTaskInternal.TAG;
            StringBuilder i2 = g.a.a.a.a.i("QDS onTaskDetected, path=");
            i2.append(aVar.w());
            logger.info(access$100, (Object) i2.toString());
        }

        public void onTaskDetectedSubloop(g.i.b.f.a aVar) {
        }

        public void onTaskFailedMainloop(g.i.b.f.a aVar) {
            f.a.info("QDS onTaskFailed");
        }

        public void onTaskFailedSubloop(g.i.b.f.a aVar) {
            Logger logger = f.a;
            String access$100 = QDDownloadTaskInternal.TAG;
            StringBuilder i2 = g.a.a.a.a.i("task failed:");
            i2.append(aVar.A());
            logger.info(access$100, (Object) i2.toString());
            g.c.a.e.j.b D = e.e.i.b.D();
            g.c.a.e.i.a.a.b bVar = new g.c.a.e.i.a.a.b(this, aVar);
            AegonApplication.getApplication().getString(2131821518);
            D.a(bVar);
        }

        public void onTaskPausedMainloop(g.i.b.f.a aVar) {
            Logger logger = f.a;
            String access$100 = QDDownloadTaskInternal.TAG;
            StringBuilder i2 = g.a.a.a.a.i("QDS onTaskPausedMainloop:");
            i2.append(aVar.o());
            logger.info(access$100, (Object) i2.toString());
        }

        public void onTaskPausedSubloop(g.i.b.f.a aVar) {
            Logger logger = f.a;
            String access$100 = QDDownloadTaskInternal.TAG;
            StringBuilder i2 = g.a.a.a.a.i("onTaskPausedSubloop:");
            i2.append(aVar.o());
            logger.info(access$100, (Object) i2.toString());
            QDDownloadTaskInternal qDDownloadTaskInternal = QDDownloadTaskInternal.this;
            qDDownloadTaskInternal.downloadStatus = DownloadTask.DOWNLOAD_STATUS_CANCEL;
            qDDownloadTaskInternal.updateDownloadTasksDao();
            QDDownloadTaskInternal.this.onDownloadFinish();
        }

        public void onTaskPendingMainloop(g.i.b.f.a aVar) {
            Logger logger = f.a;
            String access$100 = QDDownloadTaskInternal.TAG;
            StringBuilder i2 = g.a.a.a.a.i("onTaskPending, path=");
            i2.append(aVar.w());
            logger.info(access$100, (Object) i2.toString());
        }

        public void onTaskReceivedMainloop(g.i.b.f.a aVar) {
        }

        public void onTaskReceivedSubloop(g.i.b.f.a aVar) {
            QDDownloadTaskInternal qDDownloadTaskInternal;
            double d2;
            double d3;
            Logger logger = f.a;
            StringBuilder i2 = g.a.a.a.a.i("key:");
            i2.append(aVar.x());
            i2.append(",percent:");
            i2.append(aVar.d());
            i2.append("%");
            logger.info(i2.toString());
            long s = aVar.s();
            long m2 = aVar.m();
            if (!DownloadTask.DOWNLOAD_STATUS_DOWNLOADING.equals(QDDownloadTaskInternal.this.downloadStatus)) {
                QDDownloadTaskInternal qDDownloadTaskInternal2 = QDDownloadTaskInternal.this;
                qDDownloadTaskInternal2.downloadStatus = DownloadTask.DOWNLOAD_STATUS_DOWNLOADING;
                qDDownloadTaskInternal2.updateDownloadTasksDao();
            }
            if (s > 0 && m2 > 0) {
                if (m2 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    qDDownloadTaskInternal = QDDownloadTaskInternal.this;
                    d3 = 524288.0d;
                    d2 = (double) s;
                } else {
                    qDDownloadTaskInternal = QDDownloadTaskInternal.this;
                    d3 = (double) m2;
                    d2 = (double) s;
                    Double.isNaN(d3);
                }
                Double.isNaN(d2);
                qDDownloadTaskInternal.downloadPercent = (float) ((d3 / d2) * 100.0d);
                String access$100 = QDDownloadTaskInternal.TAG;
                logger.info(access$100, (Object) "downloadedSize:" + m2 + ",downloadPercent:" + QDDownloadTaskInternal.this.downloadPercent + "%");
                QDDownloadTaskInternal qDDownloadTaskInternal3 = QDDownloadTaskInternal.this;
                qDDownloadTaskInternal3.totalSize = s;
                qDDownloadTaskInternal3.downloadSize = m2;
                qDDownloadTaskInternal3.onDownloadProgressChange();
            }
            QDDownloadTaskInternal qDDownloadTaskInternal4 = QDDownloadTaskInternal.this;
            float f2 = qDDownloadTaskInternal4.downloadPercent;
            if (f2 - qDDownloadTaskInternal4.lastDownloadPercent > 1.0f) {
                qDDownloadTaskInternal4.lastDownloadPercent = f2;
                qDDownloadTaskInternal4.updateDownloadTasksDao();
                logger.info(QDDownloadTaskInternal.TAG, (Object) String.format("onProgressChange: %s, %s, %s / %s", new Object[]{QDDownloadTaskInternal.this.asset.c(), String.valueOf(QDDownloadTaskInternal.this.downloadPercent), String.valueOf(QDDownloadTaskInternal.this.downloadSize), String.valueOf(QDDownloadTaskInternal.this.totalSize)}));
            }
        }

        public void onTaskStartedMainloop(g.i.b.f.a aVar) {
            Logger logger = f.a;
            String access$100 = QDDownloadTaskInternal.TAG;
            StringBuilder i2 = g.a.a.a.a.i("onTaskStarted, path=");
            i2.append(aVar.w());
            logger.info(access$100, (Object) i2.toString());
        }

        public void onTaskStartedSubloop(g.i.b.f.a aVar) {
        }
    }

    public interface QDDownloadListener {
        void onFinish(DownloadTask downloadTask);

        void onProgressChange(DownloadTask downloadTask);

        void onRemove(DownloadTask downloadTask);

        void onStart(DownloadTask downloadTask);
    }

    public QDDownloadTaskInternal() {
        int i2 = _id;
        _id = i2 + 1;
        this.id = i2;
        this.downloader = b.c();
    }

    public QDDownloadTaskInternal(Parcel parcel) {
        super(parcel);
        int i2 = _id;
        _id = i2 + 1;
        this.id = i2;
        this.downloadStatus = parcel.readString();
        this.downloadDate = (Date) parcel.readSerializable();
        this.downloadPercent = parcel.readFloat();
    }

    private void _remove() {
        deleteDownloadedFiles();
        deleteDownloadTaskDao();
        QDDownloadListener qDDownloadListener = this.downloadListener;
        if (qDDownloadListener != null) {
            qDDownloadListener.onRemove(this);
        }
        g.c.a.e.c.b.a(this.context, g.c.a.e.c.b.f1970d, this);
    }

    private void deleteDownloadTaskDao() {
        n<QDDownloadTaskInternal, String> nVar = this.downloadTasksDao;
        if (nVar != null) {
            nVar.S(this);
        }
    }

    /* access modifiers changed from: private */
    public void deleteDownloadedFiles() {
        g.i.b.f.a aVar;
        g.i.b.a aVar2 = this.downloader;
        if (aVar2 != null && (aVar = this.currentTask) != null) {
            ((b) aVar2).b(aVar, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
        if (r5 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void executeCompleteAction() {
        /*
            r9 = this;
            java.lang.String r0 = r9.downloadStatus
            java.lang.String r1 = "SUCCESS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r0 = r9.completeAction
            java.lang.String r1 = "OPEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bd
            g.c.a.e.b.g.a(r9)
            android.content.Context r0 = r9.context
            java.lang.String r1 = r9.downloadFilePath
            com.apkpure.aegon.components.models.Asset r2 = r9.asset
            if (r2 != 0) goto L_0x0022
            goto L_0x00bd
        L_0x0022:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            r5 = 1
            r6 = 0
            if (r3 <= r4) goto L_0x0039
            g.c.a.g.a.o.c r3 = g.c.a.g.a.o.c.b()
            int r3 = r3.a
            if (r3 <= 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 != 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x007a
            g.c.a.e.i.b.a$b r3 = g.c.a.e.i.b.a.c
            java.lang.String r4 = "show_download"
            java.lang.Integer r7 = r3.b(r4)
            if (r7 != 0) goto L_0x0048
            r7 = 0
            goto L_0x004c
        L_0x0048:
            int r7 = r7.intValue()
        L_0x004c:
            r8 = -1
            if (r7 == r8) goto L_0x0078
            g.c.a.e.i.b.a r7 = r3.d()
            android.content.SharedPreferences r7 = r7.b
            if (r7 != 0) goto L_0x005e
            g.c.a.e.i.b.a r7 = r3.d()
            r7.a()
        L_0x005e:
            g.c.a.e.i.b.a r3 = r3.d()
            android.content.SharedPreferences r3 = r3.b
            if (r3 != 0) goto L_0x0068
            r3 = 0
            goto L_0x006c
        L_0x0068:
            android.content.SharedPreferences$Editor r3 = r3.edit()
        L_0x006c:
            if (r3 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r3.putInt(r4, r5)
        L_0x0072:
            if (r3 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r3.apply()
        L_0x0078:
            r3 = 1
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r3 == 0) goto L_0x007e
            goto L_0x00bd
        L_0x007e:
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x00bd
            g.c.a.e.i.b.a$b r2 = g.c.a.e.i.b.a.c
            java.lang.String r3 = r2.a()
            java.lang.String r4 = "install_now"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0093
            goto L_0x00b0
        L_0x0093:
            java.lang.String r3 = r2.a()
            java.lang.String r4 = "background_not_install"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b4
            g.c.a.g.a.o.c r2 = g.c.a.g.a.o.c.b()
            java.util.Stack<android.app.Activity> r2 = r2.b
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00ae
        L_0x00ad:
            r5 = 0
        L_0x00ae:
            if (r5 == 0) goto L_0x00bd
        L_0x00b0:
            g.c.a.e.d.d.e(r0, r1)
            goto L_0x00bd
        L_0x00b4:
            java.lang.String r0 = r2.a()
            java.lang.String r1 = "never_install"
            r0.equals(r1)
        L_0x00bd:
            java.lang.String r0 = r9.completeAction
            java.lang.String r1 = "NONE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ca
            g.c.a.e.b.g.a(r9)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal.executeCompleteAction():void");
    }

    /* access modifiers changed from: private */
    public File getDownloadFile() {
        return new File(this.downloadFilePath);
    }

    /* access modifiers changed from: private */
    public File getDownloadTempFile() {
        return new File(g.a.a.a.a.f(new StringBuilder(), this.downloadFilePath, ".temp"));
    }

    private boolean isRefreshProgress(long j2) {
        return j2 - this.lastProgressChangeTime > 1000 || this.downloadPercent < 5.0f;
    }

    /* access modifiers changed from: private */
    public void onDownloadFinish() {
        QDDownloadListener qDDownloadListener = this.downloadListener;
        if (qDDownloadListener != null) {
            qDDownloadListener.onFinish(this);
        }
        g.c.a.e.c.b.a(this.context, g.c.a.e.c.b.c, this);
        executeCompleteAction();
        this.isStarted = false;
        if (this.isRemoveOnFinish) {
            _remove();
        }
    }

    /* access modifiers changed from: private */
    public void onDownloadProgressChange() {
        long currentTimeMillis = System.currentTimeMillis();
        if (isRefreshProgress(currentTimeMillis)) {
            this.lastProgressChangeTime = currentTimeMillis;
            QDDownloadListener qDDownloadListener = this.downloadListener;
            if (qDDownloadListener != null) {
                qDDownloadListener.onProgressChange(this);
            }
            Context context2 = this.context;
            String str = g.c.a.e.c.b.a;
            System.currentTimeMillis();
            g.c.a.e.c.b.a(context2, g.c.a.e.c.b.b, this);
        }
        if (this.firstReceiveDataTime < 0) {
            this.firstReceiveDataTime = currentTimeMillis;
            this.firstReceiveDataBaseSize = this.downloadSize;
        }
        reportFirstHttpResponseCostTime(this);
    }

    private void onDownloadStart() {
        QDDownloadListener qDDownloadListener = this.downloadListener;
        if (qDDownloadListener != null) {
            qDDownloadListener.onStart(this);
        }
        g.c.a.e.c.b.a(this.context, g.c.a.e.c.b.a, this);
        this.firstReceiveDataTime = -1;
        this.firstReceiveDataBaseSize = -1;
    }

    private void reportFirstHttpResponseCostTime(DownloadTask downloadTask) {
        String str;
        if (this.downloadSize > 0 && !this.isFirstProgressChanged) {
            long j2 = -1;
            if (!(downloadTask == null || downloadTask.getStatInfo() == null)) {
                j2 = System.currentTimeMillis() - downloadTask.getStatInfo().downloadStartTime;
            }
            Map<String, Object> y = e.e.d.l.a.y(downloadTask, j2);
            if (downloadTask != null && downloadTask.isDownloading()) {
                if (e.e.d.l.a.X(downloadTask)) {
                    d.f("AppUpdateDownloadConnectionSucc", y);
                    str = "downloadBtnConnectionSucc(update) params = ";
                } else {
                    d.f("AppDownloadConnectionSucc", y);
                    str = "downloadBtnConnectionSucc params = ";
                }
                j.a("DTDownloadReporter", h.j(str, y));
            }
            this.isFirstProgressChanged = true;
        }
    }

    private boolean resumeBeforeTask(g.i.b.f.a aVar, boolean z) {
        if (aVar == null || aVar.h()) {
            return false;
        }
        Logger logger = f.a;
        String str = TAG;
        StringBuilder i2 = g.a.a.a.a.i("found exist task:");
        i2.append(aVar.f());
        logger.info(str, (Object) i2.toString());
        if (z) {
            ((b) this.downloader).b(aVar, true);
        } else if (aVar.isRunning()) {
            StringBuilder i3 = g.a.a.a.a.i("task is running: ");
            i3.append(aVar.f());
            logger.info(str, (Object) i3.toString());
            return true;
        } else if (resumePausedTask(aVar)) {
            return true;
        } else {
            ((b) this.downloader).b(aVar, false);
        }
        return false;
    }

    private boolean resumePausedTask(g.i.b.f.a aVar) {
        try {
            aVar.t();
            aVar.n(this.taskListener);
            if (aVar.v()) {
                ((b) this.downloader).b(aVar, false);
                return true;
            }
            boolean l2 = aVar.l();
            Logger logger = f.a;
            String str = TAG;
            logger.info(str, (Object) "resume task:" + l2);
            return l2;
        } catch (Exception unused) {
            Logger logger2 = g.c.a.e.e.a.a;
        }
    }

    public void cancel() {
        if (this.downloader != null) {
            g.i.b.f.a aVar = this.currentTask;
            if (aVar != null) {
                try {
                    aVar.b();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (DownloadTask.DOWNLOAD_STATUS_WAITING.equals(this.downloadStatus)) {
                this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_CANCEL;
                updateDownloadTasksDao();
                onDownloadFinish();
            }
        }
    }

    public Date getDownloadDate() {
        return this.downloadDate;
    }

    public float getDownloadPercent() {
        return this.downloadPercent;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public long getDownloadSpeed() {
        if (this.firstReceiveDataTime < 0 || this.firstReceiveDataBaseSize < 0) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.firstReceiveDataTime;
        if (currentTimeMillis < 1000) {
            return -1;
        }
        double d2 = (double) (this.downloadSize - this.firstReceiveDataBaseSize);
        double d3 = (double) currentTimeMillis;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (long) (d2 / (d3 / 1000.0d));
    }

    public g.i.b.f.a getDownloaderTaskById(String str) {
        g.i.b.a aVar = this.downloader;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull((b) aVar);
        for (g.i.b.f.a next : g.i.b.f.h.e.b().h()) {
            if (next.f().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public int getId() {
        return this.id;
    }

    public long getRealTimeDownloadSpeed() {
        return -1;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public String get__assetHash() {
        return this.asset.b();
    }

    public String get__assetJson() {
        Asset asset = this.asset;
        Objects.requireNonNull(asset);
        return g.c.a.e.k.h.b.c(asset);
    }

    public String get__completeAction() {
        return this.completeAction;
    }

    public Date get__downloadDate() {
        return this.downloadDate;
    }

    public String get__downloadFilePath() {
        return this.downloadFilePath;
    }

    public float get__downloadPercent() {
        return this.downloadPercent;
    }

    public String get__downloadStatus() {
        return this.downloadStatus;
    }

    public String get__simpleDisplayInfoJson() {
        SimpleDisplayInfo simpleDisplayInfo = this.simpleDisplayInfo;
        Objects.requireNonNull(simpleDisplayInfo);
        return g.c.a.e.k.h.b.c(simpleDisplayInfo);
    }

    public String get__statInfoJson() {
        DTStatInfo dTStatInfo = this.statInfo;
        if (dTStatInfo == null) {
            return "";
        }
        Objects.requireNonNull(dTStatInfo);
        return g.c.a.e.k.h.b.c(dTStatInfo);
    }

    public String get__userData() {
        return this.userData;
    }

    public boolean isAborted() {
        return !this.isStarted && (DownloadTask.DOWNLOAD_STATUS_WAITING.equals(this.downloadStatus) || DownloadTask.DOWNLOAD_STATUS_PREPARING.equals(this.downloadStatus) || DownloadTask.DOWNLOAD_STATUS_DOWNLOADING.equals(this.downloadStatus));
    }

    public boolean isCanStart() {
        return isInit() && !isDownloading() && !isSuccess();
    }

    public boolean isCanceled() {
        return DownloadTask.DOWNLOAD_STATUS_CANCEL.equals(this.downloadStatus);
    }

    public boolean isDownloading() {
        return this.isStarted && (DownloadTask.DOWNLOAD_STATUS_WAITING.equals(this.downloadStatus) || DownloadTask.DOWNLOAD_STATUS_PREPARING.equals(this.downloadStatus) || DownloadTask.DOWNLOAD_STATUS_DOWNLOADING.equals(this.downloadStatus));
    }

    public boolean isExpired() {
        return DownloadTask.DOWNLOAD_STATUS_EXPIRE.equals(this.downloadStatus);
    }

    public boolean isFailed() {
        return !isDownloading() && !isAborted() && !isCanceled() && !isSuccess();
    }

    public boolean isInit() {
        return (this.context == null || this.downloadTasksDao == null || this.downloader == null) ? false : true;
    }

    public boolean isInvalid() {
        return DownloadTask.DOWNLOAD_STATUS_INVALID.equals(this.downloadStatus);
    }

    public boolean isMissing() {
        return DownloadTask.DOWNLOAD_STATUS_MISSING.equals(this.downloadStatus);
    }

    public boolean isPreparing() {
        return this.isStarted && DownloadTask.DOWNLOAD_STATUS_PREPARING.equals(this.downloadStatus);
    }

    public boolean isSuccess() {
        if (!DownloadTask.DOWNLOAD_STATUS_SUCCESS.equals(this.downloadStatus)) {
            return false;
        }
        if (new File(this.downloadFilePath).exists()) {
            return true;
        }
        this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_MISSING;
        updateDownloadTasksDao();
        return false;
    }

    public boolean isWaiting() {
        return this.isStarted && DownloadTask.DOWNLOAD_STATUS_WAITING.equals(this.downloadStatus);
    }

    public void remove() {
        if (isDownloading()) {
            this.isRemoveOnFinish = true;
            cancel();
            return;
        }
        _remove();
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setDownloadListener(QDDownloadListener qDDownloadListener) {
        this.downloadListener = qDDownloadListener;
    }

    public void setDownloadTasksDao(n<QDDownloadTaskInternal, String> nVar) {
        this.downloadTasksDao = nVar;
    }

    public void set__assetHash(String str) {
    }

    public void set__assetJson(String str) {
        this.asset = (Asset) g.c.a.e.k.h.b.b(str, Asset.class);
    }

    public void set__completeAction(String str) {
        this.completeAction = str;
    }

    public void set__downloadDate(Date date) {
        this.downloadDate = date;
    }

    public void set__downloadFilePath(String str) {
        this.downloadFilePath = str;
    }

    public void set__downloadPercent(float f2) {
        this.downloadPercent = f2;
    }

    public void set__downloadStatus(String str) {
        this.downloadStatus = str;
    }

    public void set__simpleDisplayInfoJson(String str) {
        this.simpleDisplayInfo = (SimpleDisplayInfo) g.c.a.e.k.h.b.b(str, SimpleDisplayInfo.class);
    }

    public void set__statInfoJson(String str) {
        this.statInfo = DTStatInfo.a(str);
    }

    public void set__userData(String str) {
        this.userData = str;
    }

    public boolean start() {
        Asset asset = this.asset;
        if (asset == null || TextUtils.isEmpty(asset.f())) {
            g.c.a.e.e.a.a.error("tag: {}, msg: {}", (Object) TAG, (Object) "asset or asset url is null");
            return false;
        }
        if (this.downloader == null) {
            this.downloader = b.c();
        }
        if (!isCanStart()) {
            return false;
        }
        if (this.statInfo == null) {
            this.statInfo = new DTStatInfo();
        }
        this.statInfo.downloadStartTime = System.currentTimeMillis();
        if (!isAborted() && !isCanceled()) {
            this.downloadDate = new Date();
            this.downloadPercent = 0.0f;
            this.totalSize = -1;
            this.downloadSize = -1;
        }
        this.isStarted = true;
        this.lastDownloadPercent = 0.0f;
        this.downloadStatus = DownloadTask.DOWNLOAD_STATUS_WAITING;
        updateDownloadTasksDao();
        g.i.b.f.a downloaderTaskById = getDownloaderTaskById(Integer.toString(this.statInfo.appId));
        if (!resumeBeforeTask(downloaderTaskById, false)) {
            try {
                downloaderTaskById = ((b) this.downloader).a(this.asset.f(), g.c.a.e.k.e.a.a().getAbsolutePath(), this.asset.a(), this.taskListener);
                Logger logger = f.a;
                logger.info("QDS createNewTask url:" + this.asset.f() + ",path:" + g.c.a.e.k.e.a.a().getAbsolutePath());
                String num = Integer.toString(this.statInfo.appId);
                g.i.b.f.k.e eVar = (g.i.b.f.k.e) downloaderTaskById;
                if (TextUtils.isEmpty(num)) {
                    num = "";
                }
                eVar.f4316l = num;
                ((b) this.downloader).d(downloaderTaskById);
            } catch (Throwable th) {
                this.currentTask = null;
                Logger logger2 = g.c.a.e.e.a.a;
                Logger logger3 = f.a;
                StringBuilder i2 = g.a.a.a.a.i("QDS createNewTask exception:");
                i2.append(th.getMessage());
                logger3.info(i2.toString());
                return false;
            }
        }
        this.currentTask = downloaderTaskById;
        onDownloadStart();
        return true;
    }

    public void updateDownloadTasksDao() {
        n<QDDownloadTaskInternal, String> nVar = this.downloadTasksDao;
        if (nVar != null) {
            nVar.t(this);
        }
    }

    public void updateExpiredAsset(DownloadTask downloadTask) {
        if (this.asset.g() && !downloadTask.getAsset().g() && this.asset.equals(downloadTask.getAsset())) {
            this.asset = downloadTask.getAsset();
            this.statInfo = downloadTask.getStatInfo();
            updateDownloadTasksDao();
        }
    }

    public void updateStatInfo(DTStatInfo dTStatInfo) {
        long j2 = this.statInfo.scene;
        if (j2 != 2008 && j2 != 2007) {
            this.statInfo = dTStatInfo;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.downloadStatus);
        parcel.writeSerializable(this.downloadDate);
        parcel.writeFloat(this.downloadPercent);
    }
}
