package g.c.a.k;

import android.content.Context;
import android.content.Intent;
import com.apkpure.aegon.services.AppProtoBufUpdateService;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppUpdateRsp;
import g.c.a.e.c.a;
import g.c.b.a.d;
import i.o.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ AppProtoBufUpdateService b;

    public /* synthetic */ e(AppProtoBufUpdateService appProtoBufUpdateService) {
        this.b = appProtoBufUpdateService;
    }

    public final Object g(Object obj) {
        AppDetailInfo[] appDetailInfoArr;
        AppProtoBufUpdateService appProtoBufUpdateService = this.b;
        d dVar = (d) obj;
        synchronized (appProtoBufUpdateService.f264f) {
            appProtoBufUpdateService.f265g = false;
        }
        GetAppUpdateRsp getAppUpdateRsp = (GetAppUpdateRsp) dVar.b;
        if (getAppUpdateRsp == null || (appDetailInfoArr = getAppUpdateRsp.appUpdateResponse) == null || getAppUpdateRsp.retcode != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, appDetailInfoArr);
        synchronized (appProtoBufUpdateService.f266h) {
            appProtoBufUpdateService.f267i = new HashMap<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AppDetailInfo appDetailInfo = (AppDetailInfo) it.next();
                if (appDetailInfo != null) {
                    appProtoBufUpdateService.f267i.put(appDetailInfo.packageName, appDetailInfo);
                }
            }
        }
        System.currentTimeMillis();
        List<AppDetailInfo> c = appProtoBufUpdateService.c();
        if (c == null) {
            return null;
        }
        Context context = appProtoBufUpdateService.c;
        int size = c.size();
        String str = a.a;
        Intent intent = new Intent(a.a);
        intent.putExtra("appUpdatesCount", size);
        e.m.a.a.a(context).b(intent);
        return null;
    }
}
