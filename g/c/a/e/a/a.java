package g.c.a.e.a;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import com.apkpure.aegon.application.RealApplicationLike;
import com.tencent.crabshell.loader.ShellClassLoader;
import g.c.a.g.a.o.c;
import g.c.a.m.g;
import g.e.b.l.i;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a implements Thread.UncaughtExceptionHandler {
    public static Logger c = LoggerFactory.getLogger("CrashHandler");

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f1963d;
    public boolean a = false;
    public Thread.UncaughtExceptionHandler b;

    public static void a() {
        if (f1963d == null) {
            synchronized (a.class) {
                if (f1963d == null) {
                    f1963d = new a();
                }
            }
        }
        a aVar = f1963d;
        if (!aVar.a) {
            aVar.b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(aVar);
            aVar.a = true;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        String str2;
        int i2;
        int i3 = 0;
        boolean z = (th instanceof SecurityException) && th.getMessage() != null && th.getMessage().contains("OBSERVE_GRANT_REVOKE_PERMISSIONS");
        c.warn("捕获异常: {}, 是否忽略: {} ", th.getMessage(), Boolean.valueOf(z), th);
        if (z || this.b == null) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        i a2 = i.a();
        c b2 = c.b();
        if (b2.c == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator it = b2.c.iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) it.next();
                if (!(activity == null || activity.getComponentName() == null)) {
                    sb.append(activity.getComponentName().toString());
                    sb.append("\t");
                }
            }
            str = sb.toString();
        }
        a2.c("activity_screens", str);
        Activity c2 = c.b().c();
        a2.c("activity_screen", (c2 == null || c2.getComponentName() == null) ? "null activity" : c2.getComponentName().toString());
        a2.c("app_version", "1.01.10_1011015_9027_is_lite");
        Context context = RealApplicationLike.getContext();
        StringBuilder sb2 = new StringBuilder();
        Logger logger = g.a;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th2) {
            g.a.warn("getManifestVersionName exception:", th2);
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("_");
        try {
            i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable th3) {
            g.a.warn("getManifestVersionCode exception:", th3);
        }
        sb2.append(i3);
        sb2.append("_");
        try {
            i2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt(ShellClassLoader.ORI_BUILD_NO);
        } catch (Throwable th4) {
            th4.printStackTrace();
            g.a.warn("getManifestBuildNo exception:", th4);
            i2 = -1;
        }
        sb2.append(i2 + "");
        sb2.append("_is_lite");
        a2.c("manifest_app_version", sb2.toString());
        Locale c3 = g.c.a.e.i.b.a.c.c();
        a2.c("app_language", c3 == null ? "null_language" : c3.toString());
        this.b.uncaughtException(thread, th);
    }
}
