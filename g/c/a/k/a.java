package g.c.a.k;

import com.apkpure.aegon.services.AppProtoBufUpdateService;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ AppProtoBufUpdateService.b b;

    public /* synthetic */ a(AppProtoBufUpdateService.b bVar) {
        this.b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            com.apkpure.aegon.services.AppProtoBufUpdateService$b r0 = r13.b
            com.apkpure.aegon.services.AppProtoBufUpdateService r0 = com.apkpure.aegon.services.AppProtoBufUpdateService.this
            int r1 = com.apkpure.aegon.services.AppProtoBufUpdateService.f261m
            java.util.List r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0011
            r5 = 0
            goto L_0x00a6
        L_0x0011:
            java.lang.String r4 = "last_app_updates"
            android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r3)
            java.util.Iterator r5 = r1.iterator()
        L_0x001b:
            boolean r6 = r5.hasNext()
            r7 = -1
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r6 = (com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo) r6
            java.lang.String r8 = r6.packageName
            r9 = 0
            java.lang.String r8 = r4.getString(r8, r9)
            com.apkpure.aegon.components.models.AppDigest r8 = com.apkpure.aegon.components.models.AppDigest.d(r8)
            java.lang.String[] r9 = r6.sign
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collections.addAll(r10, r9)
            java.lang.String r9 = r6.versionCode
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0047
            r9 = -1
            goto L_0x004d
        L_0x0047:
            java.lang.String r9 = r6.versionCode
            int r9 = java.lang.Integer.parseInt(r9)
        L_0x004d:
            java.lang.String r11 = r6.packageName
            java.lang.String r6 = r6.versionId
            com.apkpure.aegon.components.models.AppDigest r6 = com.apkpure.aegon.components.models.AppDigest.e(r11, r9, r10, r6)
            if (r8 == 0) goto L_0x005d
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x001b
        L_0x005d:
            r5 = 1
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.clear()
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00a3
            java.lang.Object r6 = r1.next()
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r6 = (com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo) r6
            java.lang.String[] r8 = r6.sign
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collections.addAll(r9, r8)
            java.lang.String r8 = r6.versionCode
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x008b
            r8 = -1
            goto L_0x0091
        L_0x008b:
            java.lang.String r8 = r6.versionCode
            int r8 = java.lang.Integer.parseInt(r8)
        L_0x0091:
            java.lang.String r10 = r6.packageName
            java.lang.String r11 = r6.versionId
            com.apkpure.aegon.components.models.AppDigest r8 = com.apkpure.aegon.components.models.AppDigest.e(r10, r8, r9, r11)
            java.lang.String r6 = r6.packageName
            java.lang.String r8 = g.c.a.e.k.h.b.c(r8)
            r4.putString(r6, r8)
            goto L_0x006b
        L_0x00a3:
            r4.apply()
        L_0x00a6:
            if (r5 != 0) goto L_0x00aa
            goto L_0x0166
        L_0x00aa:
            java.util.List r1 = r0.c()
            if (r1 != 0) goto L_0x00b2
            goto L_0x0166
        L_0x00b2:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00bb:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r1.next()
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r5 = (com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo) r5
            java.lang.String r5 = r5.title
            r4.add(r5)
            goto L_0x00bb
        L_0x00cd:
            java.lang.String r1 = "REQUESTER_APP_UPDATE_SERVICE"
            int r5 = e.e.d.l.a.z(r1)
            int r5 = r5 * 10
            e.e.b.h r6 = new e.e.b.h
            java.lang.String r7 = "0x1001"
            r6.<init>(r0, r7)
            android.content.res.Resources r8 = r0.getResources()
            r9 = 2131689473(0x7f0f0001, float:1.9007962E38)
            int r10 = r4.size()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            int r12 = r4.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r3] = r12
            java.lang.String r8 = r8.getQuantityString(r9, r10, r11)
            r6.d(r8)
            java.lang.String r8 = ", "
            java.lang.String r4 = android.text.TextUtils.join(r8, r4)
            r6.c(r4)
            r4 = 2131230810(0x7f08005a, float:1.8077683E38)
            android.app.Notification r8 = r6.p
            r8.icon = r4
            android.graphics.Bitmap r4 = r0.f269k
            r6.e(r4)
            int r1 = e.e.d.l.a.z(r1)
            int r1 = r1 * 10000
            int r1 = r1 + r3
            com.apkpure.aegon.main.launcher.FrameConfig$b r4 = new com.apkpure.aegon.main.launcher.FrameConfig$b
            r4.<init>(r0)
            com.apkpure.aegon.main.launcher.FrameConfig r8 = r4.b
            java.lang.String r9 = ""
            java.lang.String unused = r8.title = r9
            java.lang.String r8 = "over"
            java.lang.String r9 = "Over"
            r4.a(r8, r9)
            java.lang.String r8 = "referrer"
            java.lang.String r9 = "AppUpdateServiceNotification"
            r4.b(r8, r9)
            r4.c()
            com.apkpure.aegon.main.launcher.FrameConfig r4 = r4.b
            org.slf4j.Logger r8 = g.c.a.g.d.a.a
            java.lang.Class<com.apkpure.aegon.main.activity.FrameActivity> r8 = com.apkpure.aegon.main.activity.FrameActivity.class
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = "frameConfig"
            r9.putParcelable(r10, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0, r8)
            r4.putExtras(r9)
            r8 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r0, r1, r4, r8)
            r6.f1277g = r1
            r6.b(r2)
            android.app.NotificationManager r1 = r0.f268j
            java.lang.String r2 = "push"
            e.e.f.b.d(r7, r2, r1, r3)
            android.app.NotificationManager r0 = r0.f268j
            android.app.Notification r1 = r6.a()
            r0.notify(r5, r1)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.k.a.run():void");
    }
}
