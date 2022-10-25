package com.apkpure.aegon.services;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.components.storage.database.DownloadDatabaseHelper;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import com.apkpure.aegon.main.activity.SplashActivity;
import com.apkpure.aegon.main.launcher.FrameConfig;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import g.c.a.e.h.b.d;
import g.c.a.m.j;
import g.f.a.b.n;
import i.o.c.h;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Logger;

public class QDDownloadService extends Service {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f271j = 0;
    public final IBinder b = new b();
    public final QDDownloadTaskInternal.QDDownloadListener c = new c((a) null);

    /* renamed from: d  reason: collision with root package name */
    public Context f272d;

    /* renamed from: e  reason: collision with root package name */
    public ConcurrentHashMap<String, DownloadTask> f273e;

    /* renamed from: f  reason: collision with root package name */
    public n<QDDownloadTaskInternal, String> f274f;

    /* renamed from: g  reason: collision with root package name */
    public NotificationManager f275g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f276h;

    /* renamed from: i  reason: collision with root package name */
    public int f277i = 0;

    public class b extends Binder {
        public b() {
        }

        public DownloadTask a(Asset asset) {
            QDDownloadService qDDownloadService = QDDownloadService.this;
            int i2 = QDDownloadService.f271j;
            Objects.requireNonNull(qDDownloadService);
            String b = asset != null ? asset.b() : null;
            if (b != null) {
                return (QDDownloadTaskInternal) qDDownloadService.f273e.get(b);
            }
            return null;
        }
    }

    public class c implements QDDownloadTaskInternal.QDDownloadListener {
        public c(a aVar) {
        }

        public void onFinish(DownloadTask downloadTask) {
            String str;
            String str2;
            QDDownloadService.a(QDDownloadService.this, downloadTask);
            Map<String, Object> y = e.e.d.l.a.y(downloadTask, downloadTask.getStatInfo() != null ? System.currentTimeMillis() - downloadTask.getStatInfo().downloadStartTime : -1);
            if (downloadTask.isFailed()) {
                if (downloadTask.isFailed()) {
                    if (e.e.d.l.a.X(downloadTask)) {
                        d.f("AppUpdateDownloadFail", y);
                        str2 = "downloadBtnFail(update) params = ";
                    } else {
                        d.f("AppFailDownload", y);
                        str2 = "downloadBtnFail params = ";
                    }
                    j.a("DTDownloadReporter", h.j(str2, y));
                }
            } else if (downloadTask.isCanceled() && downloadTask.isCanceled()) {
                if (e.e.d.l.a.X(downloadTask)) {
                    d.f("AppPauseUpdate", y);
                    str = "downloadBtnPause(update) params = ";
                } else {
                    d.f("AppPauseDownload", y);
                    str = "downloadBtnPause params = ";
                }
                j.a("DTDownloadReporter", h.j(str, y));
            }
        }

        public void onProgressChange(DownloadTask downloadTask) {
            QDDownloadService.a(QDDownloadService.this, downloadTask);
        }

        public void onRemove(DownloadTask downloadTask) {
            QDDownloadService qDDownloadService = QDDownloadService.this;
            int i2 = QDDownloadService.f271j;
            String d2 = qDDownloadService.d(downloadTask);
            if (d2 != null) {
                qDDownloadService.f273e.remove(d2);
            }
        }

        public void onStart(DownloadTask downloadTask) {
            String str;
            QDDownloadService.a(QDDownloadService.this, downloadTask);
            Map<String, Object> y = e.e.d.l.a.y(downloadTask, 1);
            if (downloadTask.isWaiting() && downloadTask.getDownloadSize() > 0) {
                if (e.e.d.l.a.X(downloadTask)) {
                    d.f("AppContinueUpdate", y);
                    str = "downloadBtnContinue(update) continueDownload params = ";
                } else {
                    d.f("AppContinueDownload", y);
                    str = "downloadBtnContinue continueDownload params = ";
                }
                j.a("DTDownloadReporter", h.j(str, y));
            }
        }
    }

    public static void a(QDDownloadService qDDownloadService, DownloadTask downloadTask) {
        Objects.requireNonNull(qDDownloadService);
        int z = e.e.d.l.a.z("REQUESTER_COMMON_DOWNLOAD_SERVICE") * 10;
        int z2 = (e.e.d.l.a.z("REQUESTER_COMMON_DOWNLOAD_SERVICE") * 1000000) + ((QDDownloadTaskInternal) downloadTask).getId();
        if (downloadTask.isFailed()) {
            e.e.b.h hVar = new e.e.b.h(qDDownloadService, "0x1001");
            hVar.d(qDDownloadService.getString(2131820545, new Object[]{qDDownloadService.e(downloadTask)}));
            hVar.c(qDDownloadService.getString(2131821529));
            hVar.p.icon = 2131230926;
            hVar.e(qDDownloadService.f276h);
            hVar.f1277g = qDDownloadService.c();
            hVar.b(true);
            e.e.f.b.d("0x1001", "push", qDDownloadService.f275g, false);
            qDDownloadService.f275g.notify(z2, hVar.a());
        }
        ArrayList arrayList = new ArrayList(qDDownloadService.f());
        Collections.sort(arrayList, new DownloadTask.b());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            DownloadTask downloadTask2 = (DownloadTask) it.next();
            if (downloadTask2.isDownloading()) {
                arrayList2.add(qDDownloadService.e(downloadTask2));
                i2 = (int) (downloadTask2.getDownloadPercent() + ((float) i2));
            }
        }
        if (arrayList2.size() > 0) {
            if (qDDownloadService.f277i < arrayList2.size()) {
                qDDownloadService.f277i = arrayList2.size();
            }
            e.e.b.h hVar2 = new e.e.b.h(qDDownloadService, "0x1001");
            hVar2.d(qDDownloadService.getResources().getQuantityString(2131689472, arrayList2.size(), new Object[]{Integer.valueOf(arrayList2.size())}));
            hVar2.c(TextUtils.join(", ", arrayList2));
            hVar2.p.icon = 2131230930;
            hVar2.e(qDDownloadService.f276h);
            int i3 = qDDownloadService.f277i;
            hVar2.f1280j = i3 * 100;
            hVar2.f1281k = ((i3 - arrayList2.size()) * 100) + i2;
            hVar2.f1282l = false;
            hVar2.f1277g = qDDownloadService.c();
            e.e.f.b.d("0x1001", "push", qDDownloadService.f275g, false);
            try {
                qDDownloadService.startForeground(z, hVar2.a());
            } catch (Exception unused) {
                Logger logger = g.c.a.e.e.a.a;
            }
        } else {
            qDDownloadService.f277i = 0;
            qDDownloadService.stopForeground(true);
            if (downloadTask.isSuccess()) {
                e.e.b.h hVar3 = new e.e.b.h(qDDownloadService, "0x1001");
                hVar3.d(qDDownloadService.getString(2131820884));
                hVar3.c(qDDownloadService.getString(2131821528));
                hVar3.p.icon = 2131230931;
                hVar3.e(qDDownloadService.f276h);
                hVar3.f1277g = qDDownloadService.c();
                hVar3.b(true);
                e.e.f.b.d("0x1001", "push", qDDownloadService.f275g, false);
                qDDownloadService.f275g.notify(z, hVar3.a());
            }
        }
    }

    public final void b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            QDDownloadTaskInternal qDDownloadTaskInternal = (QDDownloadTaskInternal) downloadTask;
            qDDownloadTaskInternal.setContext(this.f272d);
            qDDownloadTaskInternal.setDownloadTasksDao(this.f274f);
            qDDownloadTaskInternal.setDownloadListener(this.c);
            this.f273e.put(d(downloadTask), downloadTask);
        }
    }

    public final PendingIntent c() {
        Bundle bundle = new Bundle();
        FrameConfig.b bVar = new FrameConfig.b(this);
        String unused = bVar.b.title = "";
        bVar.a("over", "Over");
        bVar.b("referrer", "DownloadServiceNotification");
        bVar.c();
        bundle.putParcelable("frameConfig", bVar.b);
        Intent intent = new Intent(this, SplashActivity.class);
        intent.putExtras(bundle);
        return PendingIntent.getActivity(this, (e.e.d.l.a.z("REQUESTER_COMMON_DOWNLOAD_SERVICE") * AbstractNetAdapter.READ_TIMEOUT) + 0, intent, 134217728);
    }

    public final String d(DownloadTask downloadTask) {
        Asset asset = downloadTask.getAsset();
        if (asset != null) {
            return asset.b();
        }
        return null;
    }

    public final String e(DownloadTask downloadTask) {
        SimpleDisplayInfo simpleDisplayInfo = downloadTask.getSimpleDisplayInfo();
        String c2 = simpleDisplayInfo != null ? simpleDisplayInfo.c() : null;
        if (c2 == null) {
            c2 = downloadTask.getAsset().c();
        }
        return c2 == null ? getString(2131821545) : c2;
    }

    public final CopyOnWriteArrayList<DownloadTask> f() {
        return this.f273e.size() > 0 ? new CopyOnWriteArrayList<>(this.f273e.values()) : new CopyOnWriteArrayList<>();
    }

    public IBinder onBind(Intent intent) {
        return this.b;
    }

    public void onCreate() {
        n<QDDownloadTaskInternal, String> qDDownloadTasksDao;
        this.f275g = (NotificationManager) getSystemService("notification");
        this.f276h = BitmapFactory.decodeResource(getResources(), 2131623937);
        this.f272d = this;
        this.f273e = new ConcurrentHashMap<>();
        try {
            qDDownloadTasksDao = DownloadDatabaseHelper.getInstance(this).getQDDownloadTasksDao();
            this.f274f = qDDownloadTasksDao;
            Objects.requireNonNull(qDDownloadTasksDao);
            for (T b2 : qDDownloadTasksDao.b.u()) {
                b(b2);
            }
            this.f274f.P("VACUUM", new String[0]);
        } catch (SQLException e2) {
            qDDownloadTasksDao.c(e2, "queryForAll threw exception");
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void onDestroy() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r3, int r4, int r5) {
        /*
            r2 = this;
            r4 = 2
            if (r3 != 0) goto L_0x0004
            return r4
        L_0x0004:
            android.os.Bundle r3 = r3.getExtras()
            if (r3 != 0) goto L_0x000b
            return r4
        L_0x000b:
            java.lang.String r5 = "downloadTask"
            android.os.Parcelable r3 = r3.getParcelable(r5)
            com.apkpure.aegon.components.download.DownloadTask r3 = (com.apkpure.aegon.components.download.DownloadTask) r3
            if (r3 != 0) goto L_0x0016
            return r4
        L_0x0016:
            r5 = 0
            java.lang.String r0 = r2.d(r3)
            if (r0 == 0) goto L_0x0026
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.apkpure.aegon.components.download.DownloadTask> r1 = r2.f273e
            java.lang.Object r0 = r1.get(r0)
            com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal r0 = (com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal) r0
            goto L_0x0027
        L_0x0026:
            r0 = r5
        L_0x0027:
            if (r0 == 0) goto L_0x002e
            r0.updateExpiredAsset(r3)
        L_0x002c:
            r5 = r0
            goto L_0x0046
        L_0x002e:
            boolean r0 = r3 instanceof com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal
            if (r0 != 0) goto L_0x0033
            goto L_0x0046
        L_0x0033:
            r0 = r3
            com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal r0 = (com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal) r0
            g.f.a.b.n<com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal, java.lang.String> r1 = r2.f274f     // Catch:{ Exception -> 0x0042 }
            r1.Q(r0)     // Catch:{ Exception -> 0x0042 }
            g.c.a.e.b.g.d(r3)     // Catch:{ Exception -> 0x0042 }
            r2.b(r0)
            goto L_0x002c
        L_0x0042:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0046:
            if (r5 != 0) goto L_0x0049
            return r4
        L_0x0049:
            org.slf4j.Logger r3 = g.c.a.e.k.a.f.a
            java.lang.String r0 = "QDS startDownloadTask"
            r3.info(r0)
            r5.start()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.services.QDDownloadService.onStartCommand(android.content.Intent, int, int):int");
    }
}
