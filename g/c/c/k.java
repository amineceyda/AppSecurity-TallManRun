package g.c.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.crabshell.builder.ShellBuilderReporter;
import com.tencent.crabshell.loader.PatchResult;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.i.b;
import g.c.a.b.c.g;
import g.c.a.g.a.o.a;
import g.c.a.g.a.o.d;
import g.c.b.b.c;
import i.o.c.h;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class k implements ShellBuilderReporter {
    public static final Logger b = LoggerFactory.getLogger("CrabShellManagerLog");
    public static volatile k c = null;
    public boolean a = false;

    public static k a() {
        if (c == null) {
            synchronized (k.class) {
                if (c == null) {
                    c = new k();
                }
            }
        }
        return c;
    }

    public final boolean b() {
        if (!(!d.b) || (!c.d().f2234k.isEmpty())) {
            return false;
        }
        return true;
    }

    public void c(Context context, String str) {
        if (this.a) {
            b.info("正在进行套壳安装, 不能重入.");
            return;
        }
        this.a = true;
        b.info("开始执行套壳升级");
        b.D().a(new a(this, context, str));
    }

    public void notifyNewVersionReady() {
        Logger logger = b;
        logger.info("notifyNewVersionReady");
        if (b()) {
            logger.info("延时 1s 套壳升级重启进程.");
            new Handler(Looper.getMainLooper()).postDelayed(new a(RealApplicationLike.getContext()), (long) 1000);
            return;
        }
        d.a(new b(this));
    }

    public void notifyRollBack() {
        b.info("notifyRollBack");
    }

    public void reportShellUnzipDone(PatchResult patchResult) {
        b.info("reportShellUnzipDone");
        m b2 = l.b(l.b);
        HashMap hashMap = new HashMap();
        if (patchResult != null) {
            e.e.d.l.a.j0(hashMap, "cost", patchResult.costTime + "");
            e.e.d.l.a.j0(hashMap, "is_retry", String.valueOf(patchResult.isRetry ? 1 : 0));
        }
        if (b2 != null) {
            e.e.d.l.a.j0(hashMap, Constants.Raft.VERSION, b2.d());
            e.e.d.l.a.j0(hashMap, "version_code", String.valueOf(b2.e()));
            e.e.d.l.a.j0(hashMap, "apk_download_id", b2.b());
            e.e.d.l.a.j0(hashMap, "ori_build_no", b2.c());
            e.e.d.l.a.j0(hashMap, "build_no", b2.a());
            b2.k(true);
            b2.g(g.a());
        } else {
            e.e.d.l.a.j0(hashMap, "ori_build_no", g.c.a.m.g.b());
            e.e.d.l.a.j0(hashMap, "apk_download_id", l.c);
        }
        Logger logger = l.a;
        logger.debug("上报: 套壳升级解压成功");
        g.c.a.e.h.b.d.f("LiteSuccUnzip", hashMap);
        if (b2 == null) {
            logger.warn("Save upgrade state fail, state is null.");
        } else {
            String c2 = g.c.a.e.k.h.b.c(b2);
            h.d(c2, "objectToJson(this)");
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(AegonApplication.getContext()).edit();
            edit.putString("CrabShellUpgradeState", c2);
            edit.commit();
            logger.info("Save upgrade state[{}] success.", (Object) c2);
        }
        this.a = true;
    }

    public void reportShellUnzipFail(PatchResult patchResult) {
        b.info("reportShellUnzipFail");
        Logger logger = l.a;
        b.D().a(new f(patchResult));
        this.a = true;
    }
}
