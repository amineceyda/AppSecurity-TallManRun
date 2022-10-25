package g.c.a.k;

import android.provider.Settings;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.components.install.AppInfo;
import com.apkpure.aegon.services.AppProtoBufUpdateService;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.AppInfoForUpdate;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppUpdateReq;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppUpdateRsp;
import g.c.a.e.k.a.f;
import g.c.b.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ AppProtoBufUpdateService b;

    public /* synthetic */ c(AppProtoBufUpdateService appProtoBufUpdateService) {
        this.b = appProtoBufUpdateService;
    }

    public final void run() {
        AppProtoBufUpdateService appProtoBufUpdateService = this.b;
        Objects.requireNonNull(appProtoBufUpdateService);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) f.e(appProtoBufUpdateService.c)).iterator();
        while (it.hasNext()) {
            AppInfo appInfo = (AppInfo) it.next();
            if (appInfo != null) {
                if (appInfo.isEnabled) {
                    AppInfoForUpdate appInfoForUpdate = new AppInfoForUpdate();
                    appInfoForUpdate.versionId = "";
                    appInfoForUpdate.packageName = appInfo.packageName;
                    appInfoForUpdate.versionCode = appInfo.versionCode;
                    appInfoForUpdate.isSystem = appInfo.isSystemApp;
                    arrayList.add(appInfoForUpdate);
                }
            } else {
                return;
            }
        }
        GetAppUpdateReq getAppUpdateReq = new GetAppUpdateReq();
        getAppUpdateReq.applicationId = RealApplicationLike.MAIN_PROCESS_NAME;
        getAppUpdateReq.androidId = Settings.Secure.getString(AegonApplication.getContext().getContentResolver(), "android_id");
        getAppUpdateReq.appInfoForUpdate = (AppInfoForUpdate[]) arrayList.toArray(new AppInfoForUpdate[0]);
        e.a aVar = new e.a();
        aVar.f("get_app_update");
        aVar.c = getAppUpdateReq;
        aVar.d(d.b);
        aVar.c(GetAppUpdateRsp.class, new e(appProtoBufUpdateService));
        aVar.b(new b(appProtoBufUpdateService));
        aVar.e();
    }
}
