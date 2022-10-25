package g.c.c;

import com.tencent.crabshell.loader.PatchResult;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.d.l.a;
import g.c.a.e.h.b.d;
import g.c.a.m.g;
import java.util.HashMap;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ PatchResult b;

    public /* synthetic */ f(PatchResult patchResult) {
        this.b = patchResult;
    }

    public final void run() {
        PatchResult patchResult = this.b;
        m b2 = l.b(l.b);
        HashMap hashMap = new HashMap();
        if (patchResult != null) {
            a.j0(hashMap, "cost", patchResult.costTime + "");
            a.j0(hashMap, "is_retry", String.valueOf(patchResult.isRetry ? 1 : 0));
            Throwable th = patchResult.f765e;
            if (th != null) {
                a.j0(hashMap, "exception_info", th.toString());
            }
        }
        if (b2 != null) {
            a.j0(hashMap, Constants.Raft.VERSION, b2.d());
            a.j0(hashMap, "version_code", String.valueOf(b2.e()));
            a.j0(hashMap, "apk_download_id", b2.b());
            a.j0(hashMap, "ori_build_no", b2.c());
            a.j0(hashMap, "build_no", b2.a());
        } else {
            a.j0(hashMap, "ori_build_no", g.b());
            a.j0(hashMap, "apk_download_id", l.c);
        }
        l.a.debug("上报: 套壳升级解压失败");
        d.f("LiteFailUnzip", hashMap);
    }
}
