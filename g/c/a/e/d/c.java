package g.c.a.e.d;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.apkpure.aegon.components.install.AppWatcherService;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.AssetInfo;
import g.a.a.a.a;
import i.o.c.h;
import java.io.File;
import java.util.Map;

public class c extends AsyncTask<Object, Void, Void> {
    public final /* synthetic */ AppWatcherService a;

    public c(AppWatcherService appWatcherService) {
        this.a = appWatcherService;
    }

    public Object doInBackground(Object[] objArr) {
        String str = objArr[0];
        AssetInfo assetInfo = objArr[1];
        if (assetInfo != null) {
            if (Asset.TYPE_XAPK.equals(assetInfo.type)) {
                AppWatcherService appWatcherService = this.a;
                File file = new File(appWatcherService.getExternalCacheDir(), "asset_info_cache");
                if (!file.exists() && !file.mkdirs()) {
                    Log.d("AssetUtils", "Failed to create app info cache path.");
                }
                File file2 = new File(appWatcherService.getExternalCacheDir(), "temp_apk");
                if (!file2.exists() && !file2.mkdirs()) {
                    Log.d("AssetUtils", "Failed to create temp APK path.");
                }
                File file3 = new File(file2, a.w(str, ".apk"));
                if (file3.exists()) {
                    StringBuilder i2 = a.i("deleteTempApkFile:");
                    i2.append(file3.getAbsolutePath());
                    Log.d("AssetUtils", i2.toString());
                    if (!file3.delete()) {
                        Log.d("AssetUtils", "Failed to delete temp APK file.");
                    }
                }
            }
            g.c.a.e.i.b.a d2 = g.c.a.e.i.b.a.c.d();
            d2.a();
            SharedPreferences sharedPreferences = d2.b;
            h.c(sharedPreferences);
            if (sharedPreferences.getBoolean("delete_packages_after_installation", false) && !TextUtils.isEmpty(assetInfo.filePath) && !new File(assetInfo.filePath).delete()) {
                Log.d("AppWatcherService", "Failed to delete asset file.");
            }
        }
        g.c.a.e.i.b.a d3 = g.c.a.e.i.b.a.c.d();
        d3.a();
        SharedPreferences sharedPreferences2 = d3.b;
        h.c(sharedPreferences2);
        if (!sharedPreferences2.getBoolean("show_notification_after_installation", true)) {
            return null;
        }
        AppWatcherService appWatcherService2 = this.a;
        Map<String, AssetInfo> map = AppWatcherService.b;
        appWatcherService2.a();
        return null;
    }
}
