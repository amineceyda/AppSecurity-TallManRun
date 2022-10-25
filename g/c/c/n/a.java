package g.c.c.n;

import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.e.b.j.b;
import g.c.a.e.h.b.d;
import g.c.a.m.f;
import g.c.c.l;
import java.io.File;
import java.util.HashMap;
import org.slf4j.Logger;

public final /* synthetic */ class a implements f {
    public static final /* synthetic */ a a = new a();

    public final void a(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3 = (String) obj;
        Integer num = (Integer) obj2;
        String str4 = (String) obj3;
        Logger logger = f.a;
        logger.info("获取到下载地址: {}", (Object) str3);
        if (TextUtils.isEmpty(str3)) {
            logger.warn("获取到的下载地址错误");
            int intValue = num.intValue();
            Logger logger2 = l.a;
            HashMap hashMap = new HashMap();
            e.e.d.l.a.j0(hashMap, "apk_download_id", l.c);
            e.e.d.l.a.j0(hashMap, "return_code", String.valueOf(intValue));
            e.e.d.l.a.j0(hashMap, "message", str4);
            l.a.debug("上报: 获取套壳升级下载地址: {}, {}", (Object) Integer.valueOf(intValue), (Object) str4);
            d.f("LiteFailFetchDownloadUrl", hashMap);
            return;
        }
        Logger logger3 = l.a;
        HashMap hashMap2 = new HashMap();
        e.e.d.l.a.j0(hashMap2, "context", str3);
        e.e.d.l.a.j0(hashMap2, "apk_download_id", l.c);
        l.a.debug("上报: 获取套壳升级下载地址 {}", (Object) str3);
        d.f("LiteSuccFetchDownloadUrl", hashMap2);
        if (RealApplicationLike.getContext() == null || (str = DataSavingUtils.getDataString(AegonApplication.getContext(), "crab_shell_apkpure_path")) == null) {
            str = "";
        }
        logger.info("downloadUrl: {},  apkpurePath: {}", (Object) str3, (Object) str);
        boolean z = false;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            logger.info("url or path error");
        } else {
            String c = f.c(RealApplicationLike.getContext());
            if (!c.equals(str3)) {
                str2 = "url not match, {}";
            } else if (!str.substring(str.lastIndexOf(47)).equals(str3.substring(str3.lastIndexOf(47)))) {
                str2 = "name not match, {}";
            } else {
                z = new File(str).exists();
            }
            logger.info(str2, (Object) c);
        }
        if (z) {
            logger.info("下载历史中已经下载过了, 并且是合法的..");
            l.f(f.c(RealApplicationLike.getContext()), f.b(RealApplicationLike.getContext()));
            l.g(f.c(RealApplicationLike.getContext()), f.b(RealApplicationLike.getContext()));
            f.d(str);
            return;
        }
        try {
            b bVar = new b(str3, new e());
            if (bVar.a()) {
                if (bVar.c == null) {
                    b.f1969d.info("downloaderTask 为空");
                } else {
                    g.i.b.b.c().d(bVar.c);
                }
            }
        } catch (Exception e2) {
            f.a.warn("启动下载失败: {}", (Object) e2.getMessage(), (Object) e2);
        }
    }
}
