package g.c.a.n.a;

import com.apkpure.aegon.view.button.DownloadButton;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.o.b.p;
import j.a.x;

@e(c = "com.apkpure.aegon.view.button.DownloadButton$buttonClickedReport$2", f = "DownloadButton.kt", l = {}, m = "invokeSuspend")
public final class h extends i.m.j.a.h implements p<x, d<? super j>, Object> {
    public final /* synthetic */ k $downloadButtonStateInfo;
    public int label;
    public final /* synthetic */ DownloadButton this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(k kVar, DownloadButton downloadButton, d<? super h> dVar) {
        super(2, dVar);
        this.$downloadButtonStateInfo = kVar;
        this.this$0 = downloadButton;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        return new h(this.$downloadButtonStateInfo, this.this$0, dVar);
    }

    public Object d(Object obj, Object obj2) {
        x xVar = (x) obj;
        return new h(this.$downloadButtonStateInfo, this.this$0, (d) obj2).l(j.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r1 != 13) goto L_0x0100;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0103
            g.c.b.b.f.q0(r7)
            g.c.a.n.a.k r7 = r6.$downloadButtonStateInfo
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r0 = r7.c
            if (r0 != 0) goto L_0x0010
            i.j r7 = i.j.a
            return r7
        L_0x0010:
            com.apkpure.aegon.view.button.DownloadButton r0 = r6.this$0
            g.c.a.n.a.j r1 = r7.a
            int r1 = r1.ordinal()
            r2 = 1
            r3 = 1
            java.lang.String r5 = "DTDownloadReporter"
            if (r1 == r2) goto L_0x00e0
            r2 = 2
            if (r1 == r2) goto L_0x0066
            r2 = 4
            if (r1 == r2) goto L_0x0032
            r2 = 7
            if (r1 == r2) goto L_0x00e0
            r2 = 12
            if (r1 == r2) goto L_0x00e0
            r2 = 13
            if (r1 == r2) goto L_0x00e0
            goto L_0x0100
        L_0x0032:
            android.content.Context r1 = r0.getContext()
            g.c.a.e.b.e r1 = g.c.a.e.b.e.i(r1)
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r7 = r7.f2108d
            int r7 = r7.appId
            com.apkpure.aegon.components.download.DownloadTask r7 = r1.g(r7)
            if (r7 == 0) goto L_0x0100
            boolean r1 = r7.isSuccess()
            if (r1 == 0) goto L_0x0100
            java.util.Map r7 = e.e.d.l.a.y(r7, r3)
            android.widget.TextView r0 = r0.getButtonTextView()
            if (r0 != 0) goto L_0x0056
            goto L_0x0100
        L_0x0056:
            java.lang.String r1 = "AppClickToInstall"
            e.e.d.l.a.q0(r1, r0, r7)
            java.lang.String r0 = "installBtnClick params = "
            java.lang.String r7 = i.o.c.h.j(r0, r7)
            g.c.a.m.j.a(r5, r7)
            goto L_0x0100
        L_0x0066:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r7.c
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r7 = r7.f2108d
            java.util.HashMap r2 = new java.util.HashMap
            r3 = 20
            r2.<init>(r3)
            if (r1 != 0) goto L_0x0074
            goto L_0x00bf
        L_0x0074:
            java.util.Map r7 = e.e.d.l.a.H(r7)     // Catch:{ Exception -> 0x00bd }
            r3 = r7
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x00bd }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x00bd }
            if (r3 != 0) goto L_0x0084
            r2.putAll(r7)     // Catch:{ Exception -> 0x00bd }
        L_0x0084:
            java.lang.String r7 = "package_name"
            java.lang.String r3 = r1.packageName     // Catch:{ Exception -> 0x00bd }
            e.e.d.l.a.j0(r2, r7, r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r7 = "version"
            java.lang.String r3 = r1.versionId     // Catch:{ Exception -> 0x00bd }
            e.e.d.l.a.j0(r2, r7, r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r7 = "version_code"
            java.lang.String r3 = r1.versionCode     // Catch:{ Exception -> 0x00bd }
            e.e.d.l.a.j0(r2, r7, r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r7 = "is_apks"
            boolean r3 = r1.isAPKs     // Catch:{ Exception -> 0x00bd }
            if (r3 == 0) goto L_0x00a2
            java.lang.String r3 = "1"
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r3 = "0"
        L_0x00a4:
            e.e.d.l.a.j0(r2, r7, r3)     // Catch:{ Exception -> 0x00bd }
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r7 = r1.asset     // Catch:{ Exception -> 0x00bd }
            java.lang.String r1 = "file_size"
            if (r7 == 0) goto L_0x00b4
            long r3 = r7.size     // Catch:{ Exception -> 0x00bd }
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00b9
        L_0x00b4:
            r7 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00bd }
        L_0x00b9:
            r2.put(r1, r7)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bf
        L_0x00bd:
            org.slf4j.Logger r7 = g.c.a.m.j.a
        L_0x00bf:
            java.util.Map r7 = i.l.c.j(r2)
            java.lang.String r1 = "open_install_params"
            java.lang.String r2 = "3"
            r7.put(r1, r2)
            android.widget.TextView r0 = r0.getButtonTextView()
            if (r0 != 0) goto L_0x00d1
            goto L_0x0100
        L_0x00d1:
            java.lang.String r1 = "AppClickToUpdate"
            e.e.d.l.a.q0(r1, r0, r7)
            java.lang.String r0 = "updateBtnClick params = "
            java.lang.String r7 = i.o.c.h.j(r0, r7)
            g.c.a.m.j.a(r5, r7)
            goto L_0x0100
        L_0x00e0:
            com.apkpure.aegon.components.download.DownloadTask r7 = r7.b
            if (r7 != 0) goto L_0x00e7
            i.j r7 = i.j.a
            return r7
        L_0x00e7:
            java.util.Map r7 = e.e.d.l.a.y(r7, r3)
            android.widget.TextView r0 = r0.getButtonTextView()
            if (r0 != 0) goto L_0x00f2
            goto L_0x0100
        L_0x00f2:
            java.lang.String r1 = "AppClickToDownload"
            e.e.d.l.a.q0(r1, r0, r7)
            java.lang.String r0 = "downloadBtnClick params = "
            java.lang.String r7 = i.o.c.h.j(r0, r7)
            g.c.a.m.j.a(r5, r7)
        L_0x0100:
            i.j r7 = i.j.a
            return r7
        L_0x0103:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.n.a.h.l(java.lang.Object):java.lang.Object");
    }
}
