package g.c.a.e.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.components.models.AssetInfo;
import com.tencent.raft.measure.utils.MeasureConst;
import g.c.a.e.k.d.a;
import g.c.a.m.g;
import g.c.b.c.b.a;
import g.c.b.c.b.b;
import i.o.c.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;

public class d {
    public Context a;
    public File b;

    public d(Context context) {
        this.a = context;
        File file = new File(this.a.getExternalCacheDir(), "asset_info_cache");
        this.b = file;
        if (!file.exists() && !this.b.mkdirs()) {
            Log.d("AssetUtils", "Failed to create app info cache path.");
        }
    }

    public static Boolean a(Context context, long j2) {
        if (a.a() + 104857600 >= j2) {
            return Boolean.TRUE;
        }
        Log.i("AssetUtils", "diskAvailableSize below " + j2);
        g.a(context, context.getString(2131821004), context.getString(2131821750));
        return Boolean.FALSE;
    }

    public static Boolean b(Context context, String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    AssetInfo d2 = new d(context).d(new File(str));
                    return d2 == null ? Boolean.TRUE : a(context, d2.size);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return Boolean.TRUE;
            }
        }
        return Boolean.TRUE;
    }

    public static void e(Context context, String str) {
        g.c.a.b.b.d.a.d(context, str, 3);
    }

    public final void c(String str) {
        if (!new File(this.b, g.a.a.a.a.w(str, ".info")).delete()) {
            Log.d("AssetUtils", "Failed to delete info cache.");
        }
        if (!new File(this.b, g.a.a.a.a.w(str, ".icon")).delete()) {
            Log.d("AssetUtils", "Failed to delete icon cache.");
        }
    }

    public AssetInfo d(File file) throws IOException {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        ApplicationInfo applicationInfo;
        AssetInfo assetInfo = null;
        if (file.exists()) {
            boolean z = false;
            if (file.getName().toLowerCase().endsWith(".apk")) {
                if (!file.exists() || !file.getName().toLowerCase(Locale.getDefault()).endsWith(".apk") || (packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getPath(), 0)) == null || (applicationInfo = packageArchiveInfo.applicationInfo) == null) {
                    return null;
                }
                AssetInfo assetInfo2 = new AssetInfo();
                assetInfo2.type = Asset.TYPE_APK;
                assetInfo2.packageName = packageArchiveInfo.packageName;
                assetInfo2.filePath = file.getAbsolutePath();
                assetInfo2.size = file.length();
                assetInfo2.versionCode = packageArchiveInfo.versionCode;
                assetInfo2.versionName = packageArchiveInfo.versionName;
                String str = assetInfo2.filePath;
                applicationInfo.sourceDir = str;
                applicationInfo.publicSourceDir = str;
                assetInfo2.label = (String) (packageManager = this.a.getPackageManager()).getApplicationLabel(applicationInfo);
                assetInfo2.icon = applicationInfo.loadIcon(packageManager);
                assetInfo2.lastModified = file.lastModified();
                f(assetInfo2);
                return assetInfo2;
            } else if (file.exists() && file.getName().toLowerCase(Locale.getDefault()).endsWith(".xapk")) {
                b bVar = b.a;
                Context context = this.a;
                h.e(context, "context");
                h.e(file, "file");
                g.c.b.c.b.a d2 = bVar.d(context, bVar.b(file));
                if (d2 != null) {
                    assetInfo = new AssetInfo();
                    assetInfo.type = Asset.TYPE_XAPK;
                    assetInfo.packageName = d2.b;
                    assetInfo.filePath = file.getCanonicalPath();
                    assetInfo.label = d2.c;
                    assetInfo.size = file.length();
                    assetInfo.versionName = d2.f2309e;
                    assetInfo.versionCode = Integer.parseInt(d2.f2310f);
                    InputStream a2 = d2.a(d2.f2308d);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a.getResources(), a2);
                    if (a2 != null) {
                        a2.close();
                    }
                    assetInfo.icon = bitmapDrawable;
                    List<a.b> list = d2.f2312h;
                    assetInfo.isInstallXapkObb = list != null && list.size() > 0;
                    List<a.C0077a> list2 = d2.f2311g;
                    if (list2 != null && list2.size() > 0) {
                        z = true;
                    }
                    assetInfo.isInstallSplitXApk = z;
                    assetInfo.lastModified = file.lastModified();
                    f(assetInfo);
                }
            }
        }
        return assetInfo;
    }

    public final void f(AssetInfo assetInfo) {
        String str;
        Bitmap bitmap;
        File file = new File(assetInfo.filePath);
        boolean z = false;
        try {
            str = new BigInteger(1, MessageDigest.getInstance("MD5").digest(String.format("%s:%x:%x", new Object[]{file.getCanonicalPath(), Long.valueOf(file.lastModified()), Long.valueOf(file.length())}).getBytes(MeasureConst.CHARSET_UTF8))).toString(16);
        } catch (IOException | NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            str = null;
        }
        File file2 = new File(this.b, g.a.a.a.a.w(str, ".info"));
        File file3 = new File(this.b, g.a.a.a.a.w(str, ".icon"));
        String c = g.c.a.e.k.h.b.c(assetInfo);
        if ("".equals(c)) {
            c(str);
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(c);
            fileWriter.close();
            Drawable drawable = assetInfo.icon;
            if (drawable == null) {
                bitmap = null;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() != null) {
                        bitmap = bitmapDrawable.getBitmap();
                    }
                }
                bitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }
            try {
                z = bitmap.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(file3));
            } catch (FileNotFoundException e3) {
                e3.printStackTrace();
            }
            if (!z) {
                c(str);
            } else {
                assetInfo.iconUrl = file3.getAbsolutePath();
            }
            assetInfo.icon = null;
        } catch (Exception e4) {
            e4.printStackTrace();
            c(str);
        }
    }
}
