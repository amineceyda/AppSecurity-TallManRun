package g.c.c.n;

import android.content.Context;
import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.e.b.j.a;
import g.c.a.e.b.j.b;
import g.c.a.e.h.b.d;
import g.c.c.l;
import java.util.HashMap;
import org.slf4j.Logger;

public final class e extends a {
    public void onTaskCompletedMainloop(g.i.b.f.a aVar) {
        b.b("下载成功", aVar);
        if (aVar != null) {
            g.i.b.f.k.e eVar = (g.i.b.f.k.e) aVar;
            if (!TextUtils.isEmpty(eVar.w())) {
                Context context = RealApplicationLike.getContext();
                if (context != null) {
                    DataSavingUtils.putData(context, "crab_shell_apkpure_path", eVar.w());
                    DataSavingUtils.putData(context, "crab_shell_apkpure_download_url", eVar.r());
                    DataSavingUtils.putData(context, "crab_shell_apkpure_download_id", eVar.f4316l);
                }
                l.g(eVar.r(), eVar.f4316l);
                f.d(eVar.w());
                return;
            }
        }
        f.a.warn("下载成功后的 task 有问题: {}", (Object) Boolean.valueOf(aVar == null));
        l.d(aVar);
    }

    public void onTaskFailedMainloop(g.i.b.f.a aVar) {
        b.b("下载失败", aVar);
        l.d(aVar);
    }

    public void onTaskPausedMainloop(g.i.b.f.a aVar) {
        b.b("暂停", aVar);
        Logger logger = l.a;
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            g.i.b.f.k.e eVar = (g.i.b.f.k.e) aVar;
            e.e.d.l.a.j0(hashMap, "context", eVar.r());
            e.e.d.l.a.j0(hashMap, "apk_download_id", eVar.f4316l);
            l.a.debug("上报: 暂停下载套壳升包");
            d.f("LitePauseDownload", hashMap);
        }
    }

    public void onTaskPendingMainloop(g.i.b.f.a aVar) {
        g.i.b.f.k.e eVar = (g.i.b.f.k.e) aVar;
        eVar.S(l.a());
        f.a.info("开始下载时的数据: uniqueKey:{}, id:{}", (Object) eVar.v, (Object) eVar.f4316l);
        l.f(eVar.r(), eVar.f4316l);
    }

    public void onTaskReceivedMainloop(g.i.b.f.a aVar) {
        f.a.info("update progress = {}", (Object) Integer.valueOf(((g.i.b.f.k.e) aVar).d()));
    }
}
