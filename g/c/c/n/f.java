package g.c.c.n;

import android.os.Build;
import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLReq;
import com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano.GetLiteDownloadURLRsp;
import e.e.d.l.a;
import e.e.i.b;
import g.c.a.e.h.b.d;
import g.c.b.a.e;
import g.c.c.h;
import g.c.c.k;
import g.c.c.l;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class f {
    public static final Logger a = LoggerFactory.getLogger("CrabDownloadUtilsLog");
    public static String b = "";

    public static void a() {
        Logger logger = a;
        logger.info("开始套壳地址拉取..");
        if (Build.VERSION.SDK_INT < 21) {
            logger.info("4.4 不进行套壳升级.");
            return;
        }
        l.a();
        HashMap hashMap = new HashMap();
        a.j0(hashMap, "apk_download_id", l.c);
        l.a.debug("上报: 获取套壳升级下载地址");
        d.f("LiteStartFetchDownloadUrl", hashMap);
        a aVar = a.a;
        Logger logger2 = g.a;
        e.a aVar2 = new e.a();
        aVar2.f("get_lite_download_url");
        aVar2.c = new GetLiteDownloadURLReq();
        aVar2.d(b.b);
        aVar2.c(GetLiteDownloadURLRsp.class, new d(aVar));
        aVar2.b(new c(aVar));
        aVar2.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = com.tencent.crabshell.common.DataSavingUtils.getDataString(com.apkpure.aegon.application.AegonApplication.getContext(), "crab_shell_apkpure_download_id");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0005
            return r0
        L_0x0005:
            android.content.Context r2 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r1 = "crab_shell_apkpure_download_id"
            java.lang.String r2 = com.tencent.crabshell.common.DataSavingUtils.getDataString(r2, r1)
            if (r2 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.c.n.f.b(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = com.tencent.crabshell.common.DataSavingUtils.getDataString(com.apkpure.aegon.application.AegonApplication.getContext(), "crab_shell_apkpure_download_url");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0005
            return r0
        L_0x0005:
            android.content.Context r2 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r1 = "crab_shell_apkpure_download_url"
            java.lang.String r2 = com.tencent.crabshell.common.DataSavingUtils.getDataString(r2, r1)
            if (r2 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.c.n.f.c(android.content.Context):java.lang.String");
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            a.info("安装套壳的时候地址不可用");
            return;
        }
        b = str;
        g.c.a.l.d dVar = g.c.a.l.d.a;
        if (!g.c.a.l.d.f2048k) {
            a.info("下载成功的时候,微下载任务还没有完成");
            Logger logger = l.a;
            b.D().a(new h(str));
            return;
        }
        k.a().c(RealApplicationLike.getContext(), b);
    }
}
