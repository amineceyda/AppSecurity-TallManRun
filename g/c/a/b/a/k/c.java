package g.c.a.b.a.k;

import g.c.a.m.e;
import i.o.b.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar) {
        this.b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.Object r6) {
        /*
            r5 = this;
            g.c.a.m.e r0 = r5.b
            g.c.b.a.d r6 = (g.c.b.a.d) r6
            T r1 = r6.b
            r2 = 0
            if (r1 != 0) goto L_0x0016
            org.slf4j.Logger r6 = g.c.a.b.a.k.e.a
            java.lang.String r1 = "fetchCommonCard 成功, 回包为空"
            r6.info(r1)
            if (r0 == 0) goto L_0x004b
        L_0x0012:
            r0.a(r2)
            goto L_0x004b
        L_0x0016:
            int r3 = r6.c
            if (r3 == 0) goto L_0x002a
            org.slf4j.Logger r1 = g.c.a.b.a.k.e.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r6 = r6.f2205d
            java.lang.String r4 = "fetchCommonCard 成功, 回包错误接入层出错 code: {}, msg: {}"
            r1.info((java.lang.String) r4, (java.lang.Object) r3, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x004b
            goto L_0x0012
        L_0x002a:
            com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppDetailV1Rsp r1 = (com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppDetailV1Rsp) r1
            int r3 = r1.retcode
            if (r3 == 0) goto L_0x0044
            org.slf4j.Logger r1 = g.c.a.b.a.k.e.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            T r6 = r6.b
            com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppDetailV1Rsp r6 = (com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppDetailV1Rsp) r6
            java.lang.String r6 = r6.errmsg
            java.lang.String r4 = "fetchCommonCard 成功, 回包错误出错, code: {}, msg: {}"
            r1.info((java.lang.String) r4, (java.lang.Object) r3, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x004b
            goto L_0x0012
        L_0x0044:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r6 = r1.appDetail
            if (r0 == 0) goto L_0x004b
            r0.a(r6)
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.a.k.c.g(java.lang.Object):java.lang.Object");
    }
}
