package g.c.a.l;

import android.content.Context;
import com.apkpure.aegon.application.AegonApplication;
import g.c.a.e.k.e.a;
import i.o.c.h;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class k {
    public static final k a = null;
    public static final Logger b = LoggerFactory.getLogger("StuffUtils");

    public static final boolean a(String str) {
        if (str == null || str.length() == 0) {
            b.info("Check out path available outPath is null.");
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                Logger logger = b;
                logger.info("Check out path available outPath[" + str + "] exists.");
                return file.canRead();
            }
            if (file.mkdirs()) {
                file.delete();
                return true;
            }
            return false;
        } catch (Exception e2) {
            Logger logger2 = b;
            logger2.info("Check out path available outPath[" + str + "] exception[]" + e2.getMessage() + '.');
        }
    }

    public static final String b(Context context) {
        if (context == null) {
            b.info("Get ApkPure Apk path context is null");
            return "";
        }
        try {
            String str = context.getPackageManager().getApplicationInfo(context.getPackageName(), 8192).sourceDir;
            h.d(str, "{\n            context.packageManager.getApplicationInfo(context.packageName, PackageManager.GET_UNINSTALLED_PACKAGES).sourceDir\n        }");
            return str;
        } catch (Exception e2) {
            b.warn("Get ApkPure Apk path exception", (Throwable) e2);
            return "";
        }
    }

    public static final String c(String str) {
        h.e(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append(a.a().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        String sb2 = sb.toString();
        if (a(sb2)) {
            b.debug("OutPath[" + sb2 + "] available.");
            return sb2;
        }
        String str3 = AegonApplication.getApplication().getDir("stuff", 0).toString() + str2 + str;
        b.debug("OutPath[" + str3 + "] available.");
        return str3;
    }
}
