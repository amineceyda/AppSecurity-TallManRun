package g.c.a.e.b.j;

import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import g.i.b.f.a;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f1969d = LoggerFactory.getLogger("UrlDownloaderLog");
    public String a;
    public String b;
    public a c = null;

    public b(String str, a aVar) {
        String str2 = null;
        this.a = str;
        String str3 = "";
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(47) + 1;
            if (lastIndexOf == trim.length()) {
                str3 = "update";
            } else {
                str3 = trim.substring(lastIndexOf).replace(".apk", str3) + ".apk";
            }
        }
        this.b = str3;
        if (a()) {
            g.c.a.e.b.i.a.a().b(RealApplicationLike.getContext());
            g.i.b.b c2 = g.i.b.b.c();
            File dir = RealApplicationLike.getApplication().getDir("HalleryDownload", 0);
            if (dir != null) {
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                str2 = dir.getAbsolutePath();
            }
            this.c = c2.a(str, str2, str3, aVar);
        }
    }

    public static void b(String str, a aVar) {
        if (aVar == null) {
            f1969d.debug("{},  $functionName, downloaderTask is null.", (Object) Thread.currentThread().getName());
            return;
        }
        f1969d.debug("{}, downloaderTask is {}, status {}, savePath: {}, scale:{}", str, aVar.x(), aVar.p(), aVar.w(), Integer.valueOf(aVar.d()));
    }

    public final boolean a() {
        Logger logger;
        String str;
        String str2;
        if (TextUtils.isEmpty(this.a)) {
            logger = f1969d;
            str = this.a;
            str2 = "downloadUrl 不合法: {}";
        } else if (!TextUtils.isEmpty(this.b)) {
            return true;
        } else {
            logger = f1969d;
            str = this.b;
            str2 = "fileName 不合法: {}";
        }
        logger.info(str2, (Object) str);
        return false;
    }
}
