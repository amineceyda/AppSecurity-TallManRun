package g.c.c;

import android.os.Handler;
import android.os.Looper;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.d.l.a;
import g.c.a.e.h.b.d;
import g.c.a.g.a.o.b;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;

public final /* synthetic */ class e implements Runnable {
    public static final /* synthetic */ e b = new e();

    public final void run() {
        Logger logger = l.a;
        logger.info("延时重启任务执行到.");
        m c = l.c();
        if (c != null) {
            HashMap hashMap = new HashMap();
            a.j0(hashMap, Constants.Raft.VERSION, c.d());
            a.j0(hashMap, "version_code", String.valueOf(c.e()));
            a.j0(hashMap, "apk_download_id", c.b());
            a.j0(hashMap, "ori_build_no", c.c());
            a.j0(hashMap, "build_no", c.a());
            logger.debug("上报: 套壳升级上报重启进程失败");
            d.f("LiteFailResetProcess", hashMap);
            if (!g.c.a.g.a.o.d.b) {
                logger.info("延时杀死进程.");
                g.c.a.g.a.o.d.a.info("delayKillProcess");
                new Handler(Looper.getMainLooper()).postDelayed(b.b, (long) 1000);
                return;
            }
            Logger logger2 = g.c.a.g.a.o.d.a;
            List<g.c.a.m.d> list = g.c.a.g.a.o.d.c;
            logger2.info("清空所有进入后台的监听器 len: {}.", (Object) Integer.valueOf(list.size()));
            list.clear();
            g.c.a.g.a.o.d.a(d.a);
        }
    }
}
