package g.c.a.e.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import com.apkpure.aegon.services.QDDownloadService;
import g.c.a.e.c.d;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class e {

    /* renamed from: f  reason: collision with root package name */
    public static volatile e f1966f;
    public Context a;
    public QDDownloadService.b b = null;
    public g.c.a.e.c.e c;

    /* renamed from: d  reason: collision with root package name */
    public Set<DownloadTask> f1967d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public ServiceConnection f1968e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e eVar;
            QDDownloadService.b bVar;
            if (iBinder != null) {
                if (QDDownloadService.b.class.equals(iBinder.getClass())) {
                    eVar = e.this;
                    bVar = (QDDownloadService.b) iBinder;
                } else {
                    eVar = e.this;
                    bVar = null;
                }
                eVar.b = bVar;
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            e.this.b = null;
        }
    }

    public class b implements d {
        public b() {
        }

        public void a(Context context) {
            CopyOnWriteArrayList<DownloadTask> h2;
            e eVar = e.this;
            int a2 = g.c.a.e.f.b.a.a(eVar.a);
            String str = g.c.a.e.f.b.a.a;
            if (a2 == 1) {
                CopyOnWriteArrayList<DownloadTask> h3 = eVar.h();
                if (h3 != null) {
                    for (DownloadTask next : eVar.f1967d) {
                        if (h3.contains(next) && next.isCanceled()) {
                            e.a(eVar.a, next);
                        }
                    }
                    eVar.f1967d.clear();
                }
            } else if (!g.c.a.e.f.b.a.c(RealApplicationLike.getContext()) && (h2 = eVar.h()) != null) {
                for (DownloadTask next2 : h2) {
                    if (next2.isDownloading()) {
                        eVar.d(next2.getAsset());
                        eVar.f1967d.add(next2);
                    }
                }
            }
        }
    }

    public e() {
    }

    public e(Context context) {
        this.a = context;
        context.bindService(new Intent(context, QDDownloadService.class), this.f1968e, 1);
        g.c.a.e.c.e eVar = new g.c.a.e.c.e(context, new b());
        this.c = eVar;
        eVar.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r6, com.apkpure.aegon.components.download.DownloadTask r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x000b
            org.slf4j.Logger r6 = g.c.a.e.k.a.f.a
            java.lang.String r7 = "downloadTask is null"
            r6.info(r7)
            return r0
        L_0x000b:
            r1 = 0
            java.lang.Class r2 = r7.getClass()
            java.lang.Class<com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal> r3 = com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal.class
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            org.slf4j.Logger r1 = g.c.a.e.k.a.f.a
            java.lang.String r2 = "downloadTask type: QDDownloadService"
            goto L_0x0025
        L_0x001d:
            boolean r2 = r7 instanceof com.apkpure.aegon.signstuff.apk.XApkDownloadTask
            if (r2 == 0) goto L_0x002a
            org.slf4j.Logger r1 = g.c.a.e.k.a.f.a
            java.lang.String r2 = "downloadTask type: XApkDownloadTask"
        L_0x0025:
            r1.info(r2)
            java.lang.Class<com.apkpure.aegon.services.QDDownloadService> r1 = com.apkpure.aegon.services.QDDownloadService.class
        L_0x002a:
            org.slf4j.Logger r2 = g.c.a.e.k.a.f.a
            java.lang.String r3 = "strat service:"
            java.lang.StringBuilder r3 = g.a.a.a.a.i(r3)
            r4 = 1
            if (r1 == 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.info(r3)
            if (r1 != 0) goto L_0x0045
            return r0
        L_0x0045:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "downloadTask"
            r0.putParcelable(r2, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r6, r1)
            r7.putExtras(r0)
            r6.startService(r7)     // Catch:{ Exception -> 0x005b }
            goto L_0x005d
        L_0x005b:
            org.slf4j.Logger r6 = g.c.a.e.e.a.a
        L_0x005d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.b.e.a(android.content.Context, com.apkpure.aegon.components.download.DownloadTask):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r8, com.apkpure.aegon.components.download.DownloadTask r9, g.c.a.e.b.h.a r10, java.lang.Boolean r11, java.lang.Boolean r12, boolean r13) {
        /*
            boolean r0 = r10.b
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r10.a
            if (r0 <= 0) goto L_0x000c
            r0 = 0
            goto L_0x000d
        L_0x000c:
            r0 = -1
        L_0x000d:
            r2 = 1
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x00f5
            r0 = 2131821477(0x7f1103a5, float:1.9275698E38)
            r3 = 2131820938(0x7f11018a, float:1.9274605E38)
            r4 = 17039360(0x1040000, float:2.424457E-38)
            r5 = 0
            if (r13 == 0) goto L_0x0065
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r6 < r7) goto L_0x0065
            java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
            int r6 = e.e.c.a.a(r8, r6)
            if (r6 == 0) goto L_0x0065
            r10.b = r2
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 == 0) goto L_0x005d
            r9 = r8
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r10 = r9.isFinishing()
            if (r10 != 0) goto L_0x005d
            boolean r9 = r9.isDestroyed()
            if (r9 != 0) goto L_0x005d
            g.c.a.n.b.b r9 = new g.c.a.n.b.b
            r9.<init>(r8, r2)
            java.lang.String r10 = r8.getString(r3)
            r9.l(r10)
            g.c.a.e.g.b r10 = new g.c.a.e.g.b
            r10.<init>(r8)
            r9.n(r0, r10)
            r9.m(r4, r5)
            r9.e()
        L_0x005d:
            org.slf4j.Logger r8 = g.c.a.e.k.a.f.a
            java.lang.String r9 = "checkSelfPermission false"
            r8.info(r9)
            return r1
        L_0x0065:
            if (r13 == 0) goto L_0x00b8
            java.lang.String r13 = android.os.Environment.getExternalStorageState()
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = "mounted"
            boolean r13 = r7.equals(r13)
            if (r13 == 0) goto L_0x009a
            if (r6 != 0) goto L_0x007a
            goto L_0x009a
        L_0x007a:
            boolean r13 = r6.canWrite()
            if (r13 != 0) goto L_0x0098
            g.c.a.n.b.b r13 = new g.c.a.n.b.b
            r13.<init>(r8, r2)
            java.lang.String r3 = r8.getString(r3)
            r13.l(r3)
            g.c.a.e.g.a r3 = new g.c.a.e.g.a
            r3.<init>(r8)
            r13.n(r0, r3)
            r13.m(r4, r5)
            goto L_0x00af
        L_0x0098:
            r13 = 1
            goto L_0x00b3
        L_0x009a:
            g.c.a.n.b.b r13 = new g.c.a.n.b.b
            r13.<init>(r8, r2)
            r0 = 2131820937(0x7f110189, float:1.9274603E38)
            java.lang.String r0 = r8.getString(r0)
            r13.l(r0)
            r0 = 17039370(0x104000a, float:2.42446E-38)
            r13.n(r0, r5)
        L_0x00af:
            r13.e()
            r13 = 0
        L_0x00b3:
            if (r13 != 0) goto L_0x00b8
            r10.b = r2
            return r1
        L_0x00b8:
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00f5
            boolean r11 = r9 instanceof com.apkpure.aegon.signstuff.apk.XApkDownloadTask
            if (r11 != 0) goto L_0x00f5
            int r11 = g.c.a.e.f.b.a.a(r8)
            java.lang.String r13 = g.c.a.e.f.b.a.a
            r13 = 2
            if (r11 != r13) goto L_0x00f5
            g.c.a.n.b.b r11 = new g.c.a.n.b.b
            r11.<init>(r8, r2)
            r13 = 2131820878(0x7f11014e, float:1.9274483E38)
            r11.o(r13)
            r13 = 2131820879(0x7f11014f, float:1.9274485E38)
            r11.j(r13)
            r13 = 2131820827(0x7f11011b, float:1.927438E38)
            r11.n(r13, r5)
            r11.m(r4, r5)
            int r11 = r11.i()
            if (r11 == 0) goto L_0x00f5
            org.slf4j.Logger r8 = g.c.a.e.k.a.f.a
            java.lang.String r9 = "getNetworkType false"
            r8.info(r9)
            r10.b = r2
            return r1
        L_0x00f5:
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L_0x0134
            if (r9 == 0) goto L_0x0134
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r10 = r9.getStatInfo()
            if (r10 == 0) goto L_0x0134
            com.apkpure.aegon.components.models.SimpleDisplayInfo r10 = r9.getSimpleDisplayInfo()
            if (r10 == 0) goto L_0x0134
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r10 = r9.getStatInfo()
            java.lang.String r10 = r10.isApks
            java.lang.String r11 = "1"
            boolean r10 = r11.equals(r10)
            com.apkpure.aegon.components.models.SimpleDisplayInfo r11 = r9.getSimpleDisplayInfo()
            java.lang.String r11 = r11.b()
            boolean r10 = g.c.a.e.d.e.c.a(r10)
            if (r10 == 0) goto L_0x0134
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r10.<init>(r12)
            g.c.a.e.b.f r12 = new g.c.a.e.b.f
            r12.<init>(r8, r11)
            r10.post(r12)
        L_0x0134:
            boolean r8 = a(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.b.e.b(android.content.Context, com.apkpure.aegon.components.download.DownloadTask, g.c.a.e.b.h.a, java.lang.Boolean, java.lang.Boolean, boolean):boolean");
    }

    public static boolean c(Context context, DownloadTask downloadTask, Boolean bool, boolean z) {
        return b(context, downloadTask, g.c.a.e.b.h.a.a(), Boolean.TRUE, bool, z);
    }

    public static e i(Context context) {
        if (f1966f == null) {
            synchronized (e.class) {
                Context applicationContext = context.getApplicationContext();
                if (f1966f == null) {
                    f1966f = new e(applicationContext);
                }
            }
        }
        return f1966f;
    }

    public static void j(Context context) {
        i(context);
    }

    public void d(Asset asset) {
        QDDownloadService.b bVar;
        QDDownloadTaskInternal qDDownloadTaskInternal;
        if (k() && (bVar = this.b) != null && (qDDownloadTaskInternal = (QDDownloadTaskInternal) bVar.a(asset)) != null) {
            qDDownloadTaskInternal.cancel();
        }
    }

    public DownloadTask e(Asset asset) {
        QDDownloadService.b bVar;
        if (k() && (bVar = this.b) != null) {
            return bVar.a(asset);
        }
        return null;
    }

    public DownloadTask f(String str) {
        CopyOnWriteArrayList<DownloadTask> h2;
        AppDigest d2;
        if (!k() || TextUtils.isEmpty(str) || (h2 = h()) == null) {
            return null;
        }
        for (int i2 = 0; i2 < h2.size(); i2++) {
            if (h2.get(i2).getSimpleDisplayInfo() != null && h2.get(i2).getAsset() != null && !TextUtils.isEmpty(h2.get(i2).getUserData()) && (d2 = AppDigest.d(h2.get(i2).getUserData())) != null && !TextUtils.isEmpty(d2.a()) && d2.a().equals(str) && h2.get(i2).isSuccess()) {
                return h2.get(i2);
            }
        }
        return null;
    }

    public void finalize() {
        g.c.a.e.c.e eVar = this.c;
        if (eVar.c) {
            eVar.a.unregisterReceiver(eVar);
            eVar.c = false;
        }
        if (this.b != null) {
            this.a.unbindService(this.f1968e);
            this.b = null;
        }
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public DownloadTask g(int i2) {
        CopyOnWriteArrayList<DownloadTask> h2;
        if (!k() || i2 < 0 || (h2 = h()) == null) {
            return null;
        }
        for (int i3 = 0; i3 < h2.size(); i3++) {
            DownloadTask downloadTask = h2.get(i3);
            if (downloadTask != null && downloadTask.getStatInfo() != null && downloadTask.getStatInfo().appId == i2) {
                return downloadTask;
            }
        }
        return null;
    }

    public CopyOnWriteArrayList<DownloadTask> h() {
        if (!k()) {
            return null;
        }
        CopyOnWriteArrayList<DownloadTask> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        QDDownloadService.b bVar = this.b;
        if (bVar != null) {
            QDDownloadService qDDownloadService = QDDownloadService.this;
            int i2 = QDDownloadService.f271j;
            copyOnWriteArrayList.addAll(qDDownloadService.f());
        }
        return copyOnWriteArrayList;
    }

    public final boolean k() {
        return this.b != null;
    }

    public void l(Asset asset, boolean z) {
        QDDownloadService.b bVar;
        QDDownloadTaskInternal qDDownloadTaskInternal;
        if (k() && (bVar = this.b) != null && (qDDownloadTaskInternal = (QDDownloadTaskInternal) bVar.a(asset)) != null) {
            qDDownloadTaskInternal.remove();
        }
    }
}
