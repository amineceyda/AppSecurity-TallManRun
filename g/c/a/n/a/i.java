package g.c.a.n.a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import com.tencent.raft.raftframework.sla.SLAConstant;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo;
import g.c.a.e.b.e;
import g.c.a.e.b.g;
import g.c.a.e.d.d;
import g.c.a.g.d.a;
import g.c.a.n.b.b;
import g.c.b.b.f;
import i.l.c;
import i.o.c.h;
import java.io.File;
import java.util.List;
import org.slf4j.Logger;

public final class i {
    public final void a(Context context, k kVar) {
        h.e(context, "context");
        h.e(kVar, "stateInfo");
        DownloadTask f2 = e.i(RealApplicationLike.getContext()).f(RealApplicationLike.MAIN_PROCESS_NAME);
        boolean z = false;
        if (f2 != null && f2.isDownloading()) {
            f.j0(RealApplicationLike.getContext(), context.getString(2131820882));
            return;
        }
        DownloadTask f3 = e.i(RealApplicationLike.getContext()).f(RealApplicationLike.MAIN_PROCESS_NAME);
        if (f3 != null && f3.isSuccess()) {
            z = true;
        }
        if (z && !TextUtils.isEmpty(c())) {
            d.e(context, c());
        }
        g.c.a.e.k.a.f.f(RealApplicationLike.MAIN_PROCESS_NAME, new DTStatInfo());
    }

    public final void b(Context context, k kVar, g.c.a.m.e<k> eVar) {
        AppDetailInfo appDetailInfo = kVar.c;
        h.c(appDetailInfo);
        if (h.a(appDetailInfo.assetUsability, "INCOMPATIBLE")) {
            int color = context.getResources().getColor(2131100019);
            b bVar = new b(context, true);
            bVar.k(2131820999, Integer.valueOf(color));
            bVar.n(17039379, new f(kVar, this, context, eVar));
            bVar.m(17039369, e.b);
            bVar.e();
            return;
        }
        AppDetailInfo appDetailInfo2 = kVar.c;
        h.c(appDetailInfo2);
        kVar.b = f(context, appDetailInfo2, kVar.f2108d);
        if (eVar != null) {
            eVar.a(kVar);
        }
    }

    public final String c() {
        DownloadTask f2 = e.i(RealApplicationLike.getContext()).f(RealApplicationLike.MAIN_PROCESS_NAME);
        return (f2 == null || !f2.isSuccess()) ? "" : f2.getDownloadFilePath();
    }

    public final void d(Context context, k kVar) {
        h.e(context, "context");
        h.e(kVar, "stateInfo");
        AppDetailInfo appDetailInfo = kVar.c;
        if (appDetailInfo != null) {
            a.b(context, appDetailInfo);
        } else {
            g.c.a.e.e.a.a.info("下载按钮跳转时,信息为空");
        }
    }

    public final void e(Context context, k kVar) {
        String str;
        SimpleDisplayInfo simpleDisplayInfo;
        h.e(context, "context");
        h.e(kVar, "stateInfo");
        AppDetailInfo appDetailInfo = kVar.c;
        String str2 = null;
        if (appDetailInfo == null) {
            str = null;
        } else {
            str = appDetailInfo.packageName;
        }
        if (str == null) {
            DownloadTask downloadTask = kVar.b;
            if (!(downloadTask == null || (simpleDisplayInfo = downloadTask.getSimpleDisplayInfo()) == null)) {
                str2 = simpleDisplayInfo.b();
            }
        } else {
            str2 = str;
        }
        if (str2 != null) {
            if (!(str2.length() == 0)) {
                Logger logger = a.a;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str2));
                    intent.setPackage("com.android.vending");
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str2));
                    intent2.setFlags(268435456);
                    if (intent2.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent2);
                        return;
                    }
                    return;
                }
            }
        }
        g.c.a.e.e.a.b("DownloadButton", "package Name is empty, cannot goto google store");
    }

    public final DownloadTask f(Context context, AppDetailInfo appDetailInfo, DTStatInfo dTStatInfo) {
        String str;
        g.c.a.e.b.h.a a = g.c.a.e.b.h.a.a();
        h.d(a, "newSingleTask()");
        int i2 = 0;
        dTStatInfo.isUpdate = 0;
        h.c(appDetailInfo);
        dTStatInfo.isApks = appDetailInfo.isAPKs ? SLAConstant.TYPE_DEPRECATED_START : "0";
        a.c = dTStatInfo;
        AssetInfo assetInfo = appDetailInfo.asset;
        h.d(assetInfo, "appDetailInfo.asset");
        Asset i3 = Asset.i(assetInfo);
        h.d(i3, "newInstance(assetInfo)");
        if (g.c.a.e.k.d.a.a() + 104857600 < i3.d()) {
            g.c.a.e.k.a.f.a.info("diskAvailableSize below 100MB");
            return null;
        }
        String[] strArr = appDetailInfo.sign;
        h.d(strArr, "appDetailInfo.sign");
        List h2 = c.h(strArr);
        try {
            String str2 = appDetailInfo.versionCode;
            h.d(str2, "appDetailInfo.versionCode");
            i2 = Integer.parseInt(str2);
        } catch (Exception unused) {
        }
        AppDigest e2 = AppDigest.e(appDetailInfo.packageName, i2, h2, appDetailInfo.versionId);
        h.d(e2, "newInstance(appDetailInfo.packageName, versionCode, signLists, appDetailInfo.versionId)");
        SimpleDisplayInfo g2 = SimpleDisplayInfo.g(appDetailInfo.label, appDetailInfo.icon.original.url, appDetailInfo.packageName);
        h.d(g2, "newInstance(\n                appDetailInfo.label,\n                appDetailInfo.icon.original.url,\n                appDetailInfo.packageName\n        )");
        g2.j(String.valueOf(i2));
        g2.k(appDetailInfo.versionId);
        Logger logger = g.c.a.e.k.a.f.a;
        StringBuilder j2 = g.a.a.a.a.j("get versionCode:", i2, ",versionId:");
        j2.append(appDetailInfo.versionId);
        logger.info(j2.toString());
        DTStatInfo dTStatInfo2 = a.c;
        String c = g.c.a.e.k.h.b.c(e2);
        QDDownloadTaskInternal qDDownloadTaskInternal = new QDDownloadTaskInternal();
        qDDownloadTaskInternal.asset = i3;
        qDDownloadTaskInternal.simpleDisplayInfo = g2;
        qDDownloadTaskInternal.completeAction = DownloadTask.COMPLETE_ACTION_OPEN;
        qDDownloadTaskInternal.userData = c;
        String a2 = i3.a();
        File a3 = g.c.a.e.k.e.a.a();
        File file = a3 == null ? null : new File(a3, a2);
        if (file == null) {
            str = null;
        } else {
            str = file.getAbsolutePath();
        }
        qDDownloadTaskInternal.downloadFilePath = str;
        qDDownloadTaskInternal.statInfo = dTStatInfo2;
        h.d(qDDownloadTaskInternal, "Builder(asset)\n                .setSimpleDisplayInfo(simpleDisplayInfo)\n                .setCompleteAction(completeAction)\n                .setStatInfo(taskContext.dtStatInfo)\n                .setUserData(appDigest.toJson())\n                .build()");
        Boolean bool = Boolean.TRUE;
        if (!e.b(context, qDDownloadTaskInternal, a, bool, bool, false)) {
            return null;
        }
        return qDDownloadTaskInternal;
    }

    public final void g(Context context, k kVar, g.c.a.m.e<k> eVar) {
        h.e(context, "context");
        h.e(kVar, "downloadButtonStateInfo");
        if (!g.c.a.e.f.b.a.c(context)) {
            f.j0(context, context.getResources().getString(2131821132));
            return;
        }
        DownloadTask downloadTask = kVar.b;
        if (downloadTask != null) {
            h.c(downloadTask);
            if (downloadTask.getStatInfo() != null) {
                downloadTask.getStatInfo().isRetryDownload = 1;
            }
            e.c(context, downloadTask, Boolean.TRUE, false);
        } else if (kVar.c == null) {
            g.c.a.e.k.a.f.a.info("no app detail info");
        } else {
            DTStatInfo dTStatInfo = kVar.f2108d;
            dTStatInfo.downloadId = g.b(dTStatInfo.appId);
            AppDetailInfo appDetailInfo = kVar.c;
            h.c(appDetailInfo);
            if (h.a(appDetailInfo.assetUsability, "REFERENCED")) {
                AppDetailInfo appDetailInfo2 = kVar.c;
                h.c(appDetailInfo2);
                g.c.a.b.a.k.e.a(appDetailInfo2.packageName, new g(kVar, this, context, eVar));
                return;
            }
            b(context, kVar, eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (com.apkpure.aegon.application.AegonApplication.getApplication().getPackageManager().getPackageInfo(r10, 256) != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r9.a(r10) != null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080 A[SYNTHETIC, Splitter:B:29:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.content.Context r14, g.c.a.n.a.k r15) {
        /*
            r13 = this;
            g.c.a.n.a.j r0 = g.c.a.n.a.j.PAUSED
            g.c.a.n.a.j r1 = g.c.a.n.a.j.WAITING_FOR_INSTALL
            g.c.a.n.a.j r2 = g.c.a.n.a.j.INSTALLED
            g.c.a.n.a.j r3 = g.c.a.n.a.j.f2102h
            java.lang.String r4 = "context"
            i.o.c.h.e(r14, r4)
            java.lang.String r4 = "stateInfo"
            i.o.c.h.e(r15, r4)
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r4 = r15.c
            r5 = 0
            if (r4 == 0) goto L_0x0122
            i.o.c.h.c(r4)
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r4 = r4.asset
            java.lang.String r6 = "stateInfo.appDetailInfo!!.asset"
            i.o.c.h.d(r4, r6)
            com.apkpure.aegon.components.models.Asset r4 = com.apkpure.aegon.components.models.Asset.i(r4)
            g.c.a.e.b.e r6 = g.c.a.e.b.e.i(r14)
            com.apkpure.aegon.components.download.DownloadTask r4 = r6.e(r4)
            if (r4 == 0) goto L_0x003d
            r15.b = r4
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r6 = r4.getStatInfo()
            java.lang.String r7 = "downloadTask.statInfo"
            i.o.c.h.d(r6, r7)
            r15.a(r6)
        L_0x003d:
            if (r4 != 0) goto L_0x0041
            r6 = 0
            goto L_0x0045
        L_0x0041:
            boolean r6 = r4.isCanceled()
        L_0x0045:
            r7 = 1
            if (r6 != 0) goto L_0x0055
            if (r4 != 0) goto L_0x004c
            r6 = 0
            goto L_0x0050
        L_0x004c:
            boolean r6 = r4.isAborted()
        L_0x0050:
            if (r6 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r6 = 0
            goto L_0x0056
        L_0x0055:
            r6 = 1
        L_0x0056:
            com.apkpure.aegon.components.download.DownloadTask r8 = r15.b
            if (r8 == 0) goto L_0x0065
            i.o.c.h.c(r8)
            boolean r8 = r8.isDownloading()
            if (r8 == 0) goto L_0x0065
            r8 = 1
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            if (r4 == 0) goto L_0x0070
            boolean r4 = r4.isSuccess()
            if (r4 == 0) goto L_0x0070
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            g.c.a.e.k.a.d r9 = g.c.a.e.k.a.d.b(r14)
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r10 = r15.c
            i.o.c.h.c(r10)
            java.lang.String r10 = r10.packageName
            java.util.HashMap<java.lang.String, com.apkpure.aegon.components.install.AppInfo> r11 = r9.f1997f
            if (r11 != 0) goto L_0x0091
            android.app.Application r9 = com.apkpure.aegon.application.AegonApplication.getApplication()     // Catch:{ NameNotFoundException -> 0x0099 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0099 }
            r11 = 256(0x100, float:3.59E-43)
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r10, r11)     // Catch:{ NameNotFoundException -> 0x0099 }
            if (r9 == 0) goto L_0x0099
            goto L_0x0097
        L_0x0091:
            com.apkpure.aegon.components.install.AppInfo r9 = r9.a(r10)
            if (r9 == 0) goto L_0x0099
        L_0x0097:
            r9 = 1
            goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            g.c.a.e.k.a.e r14 = g.c.a.e.k.a.e.a(r14)
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r10 = r15.c
            i.o.c.h.c(r10)
            java.lang.String r10 = r10.packageName
            com.apkpure.aegon.services.AppProtoBufUpdateService$d r14 = r14.b
            if (r14 == 0) goto L_0x00ab
            r11 = 1
            goto L_0x00ac
        L_0x00ab:
            r11 = 0
        L_0x00ac:
            if (r11 == 0) goto L_0x00bf
            com.apkpure.aegon.services.AppProtoBufUpdateService r14 = com.apkpure.aegon.services.AppProtoBufUpdateService.this
            int r11 = com.apkpure.aegon.services.AppProtoBufUpdateService.f261m
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r14 = r14.b(r10)
            if (r14 == 0) goto L_0x00ba
            r14 = 1
            goto L_0x00bb
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            if (r14 == 0) goto L_0x00bf
            r14 = 1
            goto L_0x00c0
        L_0x00bf:
            r14 = 0
        L_0x00c0:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r10 = r15.c
            i.o.c.h.c(r10)
            boolean r10 = r10.isFree
            if (r10 != 0) goto L_0x00cd
            if (r9 != 0) goto L_0x00cd
            r10 = 1
            goto L_0x00ce
        L_0x00cd:
            r10 = 0
        L_0x00ce:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r11 = r15.c
            i.o.c.h.c(r11)
            boolean r12 = r11.hasVersion
            if (r12 != 0) goto L_0x00e4
            com.tencent.trpcprotocol.projecta.common.preregister.nano.PreRegister r11 = r11.preRegisterInfo
            if (r11 == 0) goto L_0x00e4
            java.lang.String r11 = r11.releaseDate
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00e4
            r5 = 1
        L_0x00e4:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r11 = r15.c
            i.o.c.h.c(r11)
            boolean r11 = r11.hasVersion
            r7 = r7 ^ r11
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r11 = r15.c
            i.o.c.h.c(r11)
            boolean r11 = r11.isShowGpIcon
            if (r8 == 0) goto L_0x00f7
            r0 = r3
            goto L_0x011d
        L_0x00f7:
            if (r14 == 0) goto L_0x00fc
            g.c.a.n.a.j r0 = g.c.a.n.a.j.WAITING_FOR_UPDATE
            goto L_0x011d
        L_0x00fc:
            if (r10 == 0) goto L_0x0101
            g.c.a.n.a.j r0 = g.c.a.n.a.j.NEED_BUY
            goto L_0x011d
        L_0x0101:
            if (r9 == 0) goto L_0x0105
            r0 = r2
            goto L_0x011d
        L_0x0105:
            if (r4 == 0) goto L_0x0109
            r0 = r1
            goto L_0x011d
        L_0x0109:
            if (r6 == 0) goto L_0x010c
            goto L_0x011d
        L_0x010c:
            if (r5 == 0) goto L_0x0111
            g.c.a.n.a.j r0 = g.c.a.n.a.j.PRE_REGISTER
            goto L_0x011d
        L_0x0111:
            if (r7 == 0) goto L_0x0116
            g.c.a.n.a.j r0 = g.c.a.n.a.j.HAVE_NO_VERSION
            goto L_0x011d
        L_0x0116:
            if (r11 == 0) goto L_0x011b
            g.c.a.n.a.j r0 = g.c.a.n.a.j.SHOW_GP_ICON
            goto L_0x011d
        L_0x011b:
            g.c.a.n.a.j r0 = g.c.a.n.a.j.WAITING_FOR_DOWNLOAD
        L_0x011d:
            r15.b(r0)
            goto L_0x0199
        L_0x0122:
            com.apkpure.aegon.components.download.DownloadTask r4 = r15.b
            if (r4 == 0) goto L_0x018e
            i.o.c.h.c(r4)
            com.apkpure.aegon.components.models.Asset r6 = r4.getAsset()
            java.lang.String r7 = "downloadTask.asset"
            i.o.c.h.d(r6, r7)
            java.lang.String r7 = r4.getUserData()
            java.lang.String r8 = "downloadTask.userData"
            i.o.c.h.d(r7, r8)
            com.apkpure.aegon.components.models.AppDigest r7 = com.apkpure.aegon.components.models.AppDigest.d(r7)
            if (r7 == 0) goto L_0x0149
            g.c.a.e.k.a.d r14 = g.c.a.e.k.a.d.b(r14)
            boolean r5 = r14.c(r7)
        L_0x0149:
            boolean r14 = r4.isDownloading()
            if (r14 == 0) goto L_0x0151
            r0 = r3
            goto L_0x018a
        L_0x0151:
            boolean r14 = r4.isSuccess()
            if (r14 != 0) goto L_0x015d
            boolean r14 = r4.isMissing()
            if (r14 == 0) goto L_0x0160
        L_0x015d:
            if (r5 == 0) goto L_0x0160
            goto L_0x016e
        L_0x0160:
            boolean r14 = r4.isSuccess()
            if (r14 == 0) goto L_0x0172
            boolean r14 = r6.h()
            if (r14 == 0) goto L_0x016e
            r0 = r1
            goto L_0x018a
        L_0x016e:
            r15.b(r2)
            goto L_0x0199
        L_0x0172:
            boolean r14 = r4.isCanceled()
            if (r14 != 0) goto L_0x018a
            boolean r14 = r4.isAborted()
            if (r14 == 0) goto L_0x017f
            goto L_0x018a
        L_0x017f:
            boolean r14 = r4.isFailed()
            if (r14 == 0) goto L_0x0188
            g.c.a.n.a.j r0 = g.c.a.n.a.j.DOWNLOADED_FAILED
            goto L_0x018a
        L_0x0188:
            g.c.a.n.a.j r0 = g.c.a.n.a.j.UNKNOWN
        L_0x018a:
            r15.b(r0)
            goto L_0x0199
        L_0x018e:
            org.slf4j.Logger r14 = g.c.a.e.e.a.a
            java.lang.String r15 = "tag: {}, msg: {}"
            java.lang.String r0 = "DownloadButton"
            java.lang.String r1 = "No appDetailInfo and downloadTask"
            r14.error((java.lang.String) r15, (java.lang.Object) r0, (java.lang.Object) r1)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.n.a.i.h(android.content.Context, g.c.a.n.a.k):void");
    }
}
