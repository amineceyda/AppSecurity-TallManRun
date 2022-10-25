package g.c.c;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.tencent.crabshell.loader.ShellClassLoader;
import g.c.a.e.h.b.d;
import g.c.a.e.k.h.b;
import g.i.b.f.a;
import i.o.c.h;
import java.util.HashMap;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class l {
    public static final Logger a = LoggerFactory.getLogger("CrabShellReportLog");
    public static String b = "";
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static m f2314d;

    public static String a() {
        if (TextUtils.isEmpty(c)) {
            c = UUID.randomUUID().toString();
        }
        return c;
    }

    public static m b(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (f2314d != null) {
            a.debug("Had parse upgrade app version.");
            return f2314d;
        }
        try {
            m mVar = new m();
            f2314d = mVar;
            mVar.i(c);
            f2314d.j(9027);
            PackageManager packageManager = AegonApplication.getContext().getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 1);
            if (packageArchiveInfo != null) {
                f2314d.l(packageArchiveInfo.versionName);
                f2314d.m((long) packageArchiveInfo.versionCode);
                if (Build.VERSION.SDK_INT >= 28) {
                    f2314d.m(packageArchiveInfo.getLongVersionCode());
                }
            }
            PackageInfo packageArchiveInfo2 = packageManager.getPackageArchiveInfo(str, 128);
            if (!(packageArchiveInfo2 == null || (applicationInfo = packageArchiveInfo2.applicationInfo) == null || (bundle = applicationInfo.metaData) == null)) {
                f2314d.h(bundle.getInt(ShellClassLoader.ORI_BUILD_NO));
            }
            return f2314d;
        } catch (Exception e2) {
            a.warn("Parse upgrade app version exception: ", (Throwable) e2);
            return null;
        }
    }

    public static m c() {
        Logger logger;
        String str;
        String string = PreferenceManager.getDefaultSharedPreferences(AegonApplication.getContext()).getString("CrabShellUpgradeState", "");
        if (TextUtils.isEmpty(string)) {
            logger = a;
            str = "Get upgrade state from share preferences is empty.";
        } else {
            h.e(string, "jsonString");
            m mVar = string.length() == 0 ? null : (m) b.b(string, m.class);
            if (mVar != null && mVar.f()) {
                return mVar;
            }
            logger = a;
            str = "Get upgrade state from share preferences is null or not ready.";
        }
        logger.info(str);
        return null;
    }

    public static void d(a aVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            e.e.d.l.a.j0(hashMap, "context", aVar.r());
            e.e.d.l.a.j0(hashMap, "apk_download_id", aVar.f());
            e.e.d.l.a.j0(hashMap, "return_code", String.valueOf(aVar.A()));
            str = aVar.g();
        } else {
            e.e.d.l.a.j0(hashMap, "apk_download_id", c);
            e.e.d.l.a.j0(hashMap, "return_code", "-1");
            str = "downloaderTask is null";
        }
        e.e.d.l.a.j0(hashMap, "message", str);
        a.debug("上报: 套壳升包下载失败");
        d.f("LiteFailDownload", hashMap);
    }

    public static void e() {
        e.e.i.b.D().a(j.b);
    }

    public static void f(String str, String str2) {
        HashMap hashMap = new HashMap();
        e.e.d.l.a.j0(hashMap, "context", str);
        e.e.d.l.a.j0(hashMap, "apk_download_id", str2);
        a.debug("上报: 开始下载套壳升包");
        d.f("LiteStartDownload", hashMap);
    }

    public static void g(String str, String str2) {
        HashMap hashMap = new HashMap();
        e.e.d.l.a.j0(hashMap, "context", str);
        e.e.d.l.a.j0(hashMap, "apk_download_id", str2);
        a.debug("上报: 套壳升包下载成功");
        d.f("LiteSuccDownload", hashMap);
    }
}
