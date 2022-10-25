package g.c.c;

import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.d.l.a;
import g.c.a.e.h.b.d;
import java.util.HashMap;

public final /* synthetic */ class g implements Runnable {
    public static final /* synthetic */ g b = new g();

    public final void run() {
        String str;
        m b2 = l.b(l.b);
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
            a.j0(hashMap, "ori_build_no", g.c.a.m.g.b());
            str = l.c;
        }
        a.j0(hashMap, str2, str);
        l.a.debug("上报: 上报通知套壳重启");
        d.f("LiteStartReset", hashMap);
    }
}
