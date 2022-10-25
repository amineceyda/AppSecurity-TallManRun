package g.c.a.l.l;

import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ r b;
    public final /* synthetic */ AppDetailInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2054d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f2055e;

    public /* synthetic */ a(r rVar, AppDetailInfo appDetailInfo, boolean z, boolean z2) {
        this.b = rVar;
        this.c = appDetailInfo;
        this.f2054d = z;
        this.f2055e = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            g.c.a.l.l.r r0 = r14.b
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r14.c
            boolean r2 = r14.f2054d
            boolean r3 = r14.f2055e
            java.lang.String r4 = "this$0"
            i.o.c.h.e(r0, r4)
            java.lang.String r4 = "$appDetailInfo"
            i.o.c.h.e(r1, r4)
            org.slf4j.Logger r4 = g.c.a.l.l.r.q
            java.lang.String r5 = "Start down load apk."
            r4.info(r5)
            android.content.Context r5 = r0.a
            g.c.a.e.b.e r5 = g.c.a.e.b.e.i(r5)
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r6 = r1.asset
            com.apkpure.aegon.components.models.Asset r6 = com.apkpure.aegon.components.models.Asset.i(r6)
            com.apkpure.aegon.components.download.DownloadTask r5 = r5.e(r6)
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0035
            boolean r9 = r5.isSuccess()
            if (r9 == 0) goto L_0x0035
            r9 = 1
            goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            if (r9 == 0) goto L_0x0047
            java.lang.String r2 = "Start download apk, had download success."
            r4.info(r2)
            java.lang.String r2 = "downloadTask"
            i.o.c.h.d(r5, r2)
            r0.p(r1, r5)
            goto L_0x0217
        L_0x0047:
            if (r2 != 0) goto L_0x006c
            i.o.c.h.c(r1)
            java.lang.String r9 = r1.assetUsability
            java.lang.String r10 = "INCOMPATIBLE"
            boolean r9 = i.o.c.h.a(r9, r10)
            if (r9 != 0) goto L_0x005d
            java.lang.String r9 = "Check compatible success."
            r4.info(r9)
            r9 = 1
            goto L_0x0068
        L_0x005d:
            android.os.Handler r9 = r0.b
            g.c.a.l.l.b r10 = new g.c.a.l.l.b
            r10.<init>(r0, r1, r3)
            r9.post(r10)
            r9 = 0
        L_0x0068:
            if (r9 != 0) goto L_0x006c
            goto L_0x0217
        L_0x006c:
            long r9 = g.c.a.e.k.d.a.a()
            r11 = 104857600(0x6400000, double:5.1806538E-316)
            long r9 = r9 + r11
            long r11 = r6.d()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0083
            java.lang.String r9 = "Check memory size,disk available size below 100MB."
            r4.info(r9)
            r4 = 0
            goto L_0x0084
        L_0x0083:
            r4 = 1
        L_0x0084:
            if (r4 != 0) goto L_0x0093
            r1 = 22
            r2 = 2021(0x7e5, float:2.832E-42)
            r3 = 0
            r5 = 4
            r6 = 0
            g.c.a.l.l.d0.e(r0, r1, r2, r3, r5, r6)
            goto L_0x0217
        L_0x0093:
            if (r3 != 0) goto L_0x00b1
            android.content.Context r3 = r0.a
            int r3 = g.c.a.e.f.b.a.a(r3)
            java.lang.String r4 = g.c.a.e.f.b.a.a
            r4 = 2
            if (r3 == r4) goto L_0x00a2
            r2 = 0
            goto L_0x00ad
        L_0x00a2:
            android.os.Handler r3 = r0.b
            g.c.a.l.l.c r4 = new g.c.a.l.l.c
            r4.<init>(r0, r1, r2)
            r3.post(r4)
            r2 = 1
        L_0x00ad:
            if (r2 == 0) goto L_0x00b1
            goto L_0x0217
        L_0x00b1:
            java.lang.String[] r2 = r1.sign
            java.lang.String r3 = "appDetailInfo.sign"
            i.o.c.h.d(r2, r3)
            java.util.List r2 = i.l.c.h(r2)
            java.lang.String r3 = r1.versionCode     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "appDetailInfo.versionCode"
            i.o.c.h.d(r3, r4)     // Catch:{ Exception -> 0x00c8 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00c9
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            r4 = 0
            if (r5 != 0) goto L_0x00ce
            r5 = r4
            goto L_0x00d2
        L_0x00ce:
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r5 = r5.getStatInfo()
        L_0x00d2:
            if (r5 != 0) goto L_0x0167
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r5 = new com.apkpure.aegon.components.statistics.datong.DTStatInfo
            g.c.a.e.h.b.a r9 = r0.f2065h
            r5.<init>((g.c.a.e.h.b.a) r9)
            int r9 = g.c.a.e.k.a.f.c(r1)
            r5.appId = r9
            boolean r10 = r1.isAPKs
            if (r10 == 0) goto L_0x00e8
            java.lang.String r10 = "1"
            goto L_0x00ea
        L_0x00e8:
            java.lang.String r10 = "0"
        L_0x00ea:
            r5.isApks = r10
            g.c.a.e.h.b.a r10 = r0.f2065h
            if (r10 != 0) goto L_0x00f8
            org.slf4j.Logger r10 = g.c.a.l.l.r.q
            java.lang.String r11 = " dtPageInfo is Null"
            r10.info(r11)
            goto L_0x0108
        L_0x00f8:
            org.slf4j.Logger r11 = g.c.a.l.l.r.q
            i.o.c.h.c(r10)
            java.lang.String r10 = r10.fastDownloadId
            java.lang.String r12 = "fastDownloadId:"
            java.lang.String r10 = i.o.c.h.j(r12, r10)
            r11.info(r10)
        L_0x0108:
            g.c.a.e.h.b.a r10 = r0.f2065h
            if (r10 == 0) goto L_0x0127
            i.o.c.h.c(r10)
            java.lang.String r10 = r10.fastDownloadId
            if (r10 == 0) goto L_0x011c
            int r10 = r10.length()
            if (r10 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r10 = 0
            goto L_0x011d
        L_0x011c:
            r10 = 1
        L_0x011d:
            if (r10 != 0) goto L_0x0127
            g.c.a.e.h.b.a r9 = r0.f2065h
            i.o.c.h.c(r9)
            java.lang.String r9 = r9.fastDownloadId
            goto L_0x012b
        L_0x0127:
            java.lang.String r9 = g.c.a.e.b.g.b(r9)
        L_0x012b:
            r5.downloadId = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            g.c.a.e.h.b.a r10 = r0.f2065h
            if (r10 == 0) goto L_0x0157
            i.o.c.h.c(r10)
            java.lang.String r10 = r10.pop_type
            if (r10 == 0) goto L_0x0143
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0144
        L_0x0143:
            r8 = 1
        L_0x0144:
            if (r8 != 0) goto L_0x0157
            g.c.a.e.h.b.a r8 = r0.f2065h
            i.o.c.h.c(r8)
            java.lang.String r8 = r8.pop_type
            java.lang.String r10 = "dtPageInfo!!.pop_type"
            i.o.c.h.d(r8, r10)
            java.lang.String r10 = "pop_type"
            r9.put(r10, r8)
        L_0x0157:
            boolean r8 = r9.isEmpty()
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0161
            r5.c(r9)
        L_0x0161:
            long r7 = java.lang.System.currentTimeMillis()
            r5.downloadStartTime = r7
        L_0x0167:
            g.c.a.e.b.h.a r9 = g.c.a.e.b.h.a.a()
            java.lang.String r7 = "newSingleTask()"
            i.o.c.h.d(r9, r7)
            r9.c = r5
            java.lang.String r5 = r1.packageName
            java.lang.String r7 = r1.versionId
            com.apkpure.aegon.components.models.AppDigest r2 = com.apkpure.aegon.components.models.AppDigest.e(r5, r3, r2, r7)
            java.lang.String r5 = "newInstance(\n                appDetailInfo.packageName,\n                versionCode,\n                signLists,\n                appDetailInfo.versionId)"
            i.o.c.h.d(r2, r5)
            java.lang.String r5 = r1.label
            com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage r7 = r1.icon
            com.tencent.trpcprotocol.projecta.common.imageinfo.nano.ImageInfo r7 = r7.original
            java.lang.String r7 = r7.url
            java.lang.String r8 = r1.packageName
            com.apkpure.aegon.components.models.SimpleDisplayInfo r5 = com.apkpure.aegon.components.models.SimpleDisplayInfo.g(r5, r7, r8)
            java.lang.String r7 = "newInstance(\n                appDetailInfo.label,\n                appDetailInfo.icon.original.url,\n                appDetailInfo.packageName)"
            i.o.c.h.d(r5, r7)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r5.j(r7)
            java.lang.String r7 = r1.versionId
            r5.k(r7)
            org.slf4j.Logger r13 = g.c.a.l.l.r.q
            java.lang.String r7 = "versionCode:"
            java.lang.String r8 = ",versionId:"
            java.lang.StringBuilder r3 = g.a.a.a.a.j(r7, r3, r8)
            java.lang.String r7 = r1.versionId
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r13.info(r3)
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r3 = r9.c
            java.lang.String r2 = g.c.a.e.k.h.b.c(r2)
            com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal r8 = new com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal
            r8.<init>()
            r8.asset = r6
            r8.simpleDisplayInfo = r5
            java.lang.String r5 = "NONE"
            r8.completeAction = r5
            r8.userData = r2
            java.lang.String r2 = r6.a()
            java.io.File r5 = g.c.a.e.k.e.a.a()
            if (r5 != 0) goto L_0x01d5
            r6 = r4
            goto L_0x01da
        L_0x01d5:
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r2)
        L_0x01da:
            if (r6 != 0) goto L_0x01dd
            goto L_0x01e1
        L_0x01dd:
            java.lang.String r4 = r6.getAbsolutePath()
        L_0x01e1:
            r8.downloadFilePath = r4
            r8.statInfo = r3
            java.lang.String r2 = "Builder(asset)\n                .setSimpleDisplayInfo(simpleDisplayInfo)\n                .setCompleteAction(completeAction)\n                .setStatInfo(taskContext.dtStatInfo)\n                .setUserData(appDigest.toJson())\n                .build()"
            i.o.c.h.d(r8, r2)
            g.c.a.e.c.b$b r2 = new g.c.a.e.c.b$b
            android.content.Context r3 = r0.a
            g.c.a.l.l.p r4 = new g.c.a.l.l.p
            r4.<init>(r0, r1)
            r2.<init>(r3, r4)
            r0.f2075m = r2
            r2.a()
            android.content.Context r7 = r0.a
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r12 = 0
            boolean r1 = g.c.a.e.b.e.b(r7, r8, r9, r10, r11, r12)
            if (r1 != 0) goto L_0x0217
            java.lang.String r1 = "Add download task fail."
            r13.info(r1)
            r1 = 22
            r2 = 0
            r3 = 0
            r5 = 4
            r6 = 0
            g.c.a.l.l.d0.e(r0, r1, r2, r3, r5, r6)
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.l.a.run():void");
    }
}
