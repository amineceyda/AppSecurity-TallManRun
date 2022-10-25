package g.c.c;

import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.d.l.a;
import g.c.a.e.h.b.d;
import g.c.a.m.g;
import java.util.HashMap;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ String b;

    public /* synthetic */ h(String str) {
        this.b = str;
    }

    public final void run() {
        String str;
        m b2 = l.b(this.b);
        HashMap hashMap = new HashMap();
        String str2 = "apk_download_id";
        if (b2 != null) {
            a.j0(hashMap, Constants.Raft.VERSION, b2.d());
            a.j0(hashMap, "version_code", String.valueOf(b2.e()));
            a.j0(hashMap, str2, b2.b());
            a.j0(hashMap, "ori_build_no", b2.c());
            str = b2.a();
            str2 = "build_no";
        } else {
            a.j0(hashMap, "ori_build_no", g.b());
            str = l.c;
        }
        a.j0(hashMap, str2, str);
        l.a.debug("上报: 全量包下载成功时,微下载还没有完成的情况,放弃下载任务,等微下载完成再执行套壳");
        d.f("LiteDownSuccAndStuffLoading", hashMap);
    }
}
