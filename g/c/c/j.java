package g.c.c;

import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.d.l.a;
import g.c.a.e.h.b.d;
import java.util.HashMap;

public final /* synthetic */ class j implements Runnable {
    public static final /* synthetic */ j b = new j();

    public final void run() {
        m c = l.c();
        if (c != null) {
            HashMap hashMap = new HashMap();
            a.j0(hashMap, Constants.Raft.VERSION, c.d());
            a.j0(hashMap, "version_code", String.valueOf(c.e()));
            a.j0(hashMap, "apk_download_id", c.b());
            a.j0(hashMap, "ori_build_no", c.c());
            a.j0(hashMap, "build_no", c.a());
            l.a.debug("上报: 套壳升级失败");
            d.f("LiteFailUpgrade", hashMap);
        }
    }
}
