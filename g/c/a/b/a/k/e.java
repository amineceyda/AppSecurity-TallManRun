package g.c.a.b.a.k;

import android.text.TextUtils;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppDetailV1Req;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.GetAppDetailV1Rsp;
import g.c.b.a.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class e {
    public static final Logger a = LoggerFactory.getLogger("AppDetailApiLog");

    public static void a(String str, g.c.a.m.e<AppDetailInfo> eVar) {
        if (TextUtils.isEmpty(str)) {
            a.warn("拉取详情信息时, packageName 为空.");
            return;
        }
        GetAppDetailV1Req getAppDetailV1Req = new GetAppDetailV1Req();
        getAppDetailV1Req.packageName = str;
        a.info("fetchAppInfo url: {}", (Object) "get_app_detail");
        e.a aVar = new e.a();
        aVar.f("get_app_detail");
        aVar.c = getAppDetailV1Req;
        aVar.d(b.b);
        aVar.c(GetAppDetailV1Rsp.class, new c(eVar));
        aVar.b(new a(eVar));
        aVar.e();
    }
}
