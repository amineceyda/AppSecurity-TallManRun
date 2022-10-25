package g.c.a.e.k.a;

import android.content.Context;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import com.tencent.raft.raftframework.sla.SLAConstant;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.e.b.h.a;
import g.c.a.e.k.h.b;
import g.c.a.m.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.slf4j.Logger;

public final /* synthetic */ class c implements e {
    public final /* synthetic */ DTStatInfo a;

    public /* synthetic */ c(DTStatInfo dTStatInfo) {
        this.a = dTStatInfo;
    }

    public final void a(Object obj) {
        DTStatInfo dTStatInfo = this.a;
        AppDetailInfo appDetailInfo = (AppDetailInfo) obj;
        if (appDetailInfo == null) {
            f.a.info("需要下载 app 时,拉倒的信息为空");
            return;
        }
        a a2 = a.a();
        int i2 = 0;
        dTStatInfo.isUpdate = 0;
        dTStatInfo.isApks = appDetailInfo.isAPKs ? SLAConstant.TYPE_DEPRECATED_START : "0";
        a2.c = dTStatInfo;
        Asset i3 = Asset.i(appDetailInfo.asset);
        String str = null;
        if (Long.valueOf(g.c.a.e.k.d.a.a()).longValue() + 104857600 < i3.d()) {
            f.a.info("diskAvailableSize below 100MB");
            return;
        }
        String[] strArr = appDetailInfo.sign;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArr);
        try {
            i2 = Integer.parseInt(appDetailInfo.versionCode);
        } catch (Exception unused) {
        }
        AppDigest e2 = AppDigest.e(appDetailInfo.packageName, i2, arrayList, appDetailInfo.versionId);
        SimpleDisplayInfo g2 = SimpleDisplayInfo.g(appDetailInfo.label, appDetailInfo.icon.original.url, appDetailInfo.packageName);
        g2.j(i2 + "");
        g2.k(appDetailInfo.versionId);
        Logger logger = f.a;
        StringBuilder j2 = g.a.a.a.a.j("get versionCode:", i2, ",versionId:");
        j2.append(appDetailInfo.versionId);
        logger.info(j2.toString());
        DTStatInfo dTStatInfo2 = a2.c;
        String c = b.c(e2);
        QDDownloadTaskInternal qDDownloadTaskInternal = new QDDownloadTaskInternal();
        qDDownloadTaskInternal.asset = i3;
        qDDownloadTaskInternal.simpleDisplayInfo = g2;
        qDDownloadTaskInternal.completeAction = DownloadTask.COMPLETE_ACTION_OPEN;
        qDDownloadTaskInternal.userData = c;
        String a3 = i3.a();
        File a4 = g.c.a.e.k.e.a.a();
        File file = a4 == null ? null : new File(a4, a3);
        if (file != null) {
            str = file.getAbsolutePath();
        }
        qDDownloadTaskInternal.downloadFilePath = str;
        qDDownloadTaskInternal.statInfo = dTStatInfo2;
        Context context = RealApplicationLike.getContext();
        Boolean bool = Boolean.TRUE;
        g.c.a.e.b.e.b(context, qDDownloadTaskInternal, a2, bool, bool, false);
    }
}
