package g.c.c.n;

import g.c.a.m.f;
import i.o.b.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ f b;

    public /* synthetic */ d(f fVar) {
        this.b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.Object r7) {
        /*
            r6 = this;
            g.c.a.m.f r0 = r6.b
            g.c.b.a.d r7 = (g.c.b.a.d) r7
            T r1 = r7.b
            r2 = 0
            if (r1 != 0) goto L_0x0020
            org.slf4j.Logger r1 = g.c.c.n.g.a
            java.lang.String r3 = "fetchCrabVersion 成功, 回包为空"
            r1.info(r3)
            if (r0 == 0) goto L_0x0075
            int r1 = r7.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r7 = r7.f2205d
            java.lang.String r3 = ""
            r0.a(r3, r1, r7)
            goto L_0x0075
        L_0x0020:
            int r3 = r7.c
            if (r3 == 0) goto L_0x003f
            org.slf4j.Logger r1 = g.c.c.n.g.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r7.f2205d
            java.lang.String r5 = "fetchCrabVersion 成功, 回包错误接入层出错 code: {}, msg: {}"
            r1.info((java.lang.String) r5, (java.lang.Object) r3, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x0075
        L_0x0033:
            int r1 = r7.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r7 = r7.f2205d
            r0.a(r2, r1, r7)
            goto L_0x0075
        L_0x003f:
            com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp r1 = (com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp) r1
            int r3 = r1.retcode
            if (r3 == 0) goto L_0x0059
            org.slf4j.Logger r1 = g.c.c.n.g.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            T r4 = r7.b
            com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp r4 = (com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp) r4
            java.lang.String r4 = r4.errmsg
            java.lang.String r5 = "fetchCrabVersion 成功, 回包错误出错, code: {}, msg: {}"
            r1.info((java.lang.String) r5, (java.lang.Object) r3, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x0075
            goto L_0x0033
        L_0x0059:
            org.slf4j.Logger r3 = g.c.c.n.g.a
            java.lang.String r1 = r1.downloadUrl
            java.lang.String r4 = "fetchCrabVersion 信息: {}"
            r3.debug((java.lang.String) r4, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x0075
            T r1 = r7.b
            com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp r1 = (com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp) r1
            java.lang.String r1 = r1.downloadUrl
            int r3 = r7.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r7 = r7.f2205d
            r0.a(r1, r3, r7)
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.c.n.d.g(java.lang.Object):java.lang.Object");
    }
}
