package g.c.b.b.k;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import g.c.b.b.c;
import g.c.b.b.f;
import g.c.b.b.i.e.k;
import g.c.b.b.j.a;
import g.c.b.b.j.b;
import g.c.b.b.l.e;
import java.io.File;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2298d;

    public /* synthetic */ m(int i2, Context context, String str) {
        this.b = i2;
        this.c = context;
        this.f2298d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        k kVar;
        a aVar;
        a aVar2;
        long j2;
        int i3 = this.b;
        Context context = this.c;
        String str = this.f2298d;
        dialogInterface.dismiss();
        boolean z = i3 == 3;
        if (c.d().f2227d != null) {
            c.d().s();
            e.g(context);
            k kVar2 = c.d().f2227d;
            b bVar = c.d().f2228e;
            if (TextUtils.isEmpty(str)) {
                e.a.debug("path: {} 为空", (Object) str);
                aVar = new a();
            } else if (z || new File(str).exists()) {
                if (z) {
                    g.c.b.c.b.a aVar3 = c.d().f2229f;
                    if (aVar3 == null) {
                        aVar = new a();
                    } else {
                        String str2 = aVar3.b;
                        String str3 = aVar3.f2309e;
                        try {
                            j2 = Long.parseLong(aVar3.f2310f);
                        } catch (Exception e2) {
                            e.a.warn("解析versionCode异常", (Throwable) e2);
                            j2 = 0;
                        }
                        kVar = kVar2;
                        aVar2 = new a(str2, str3, j2, aVar3.c, str, ".xapk", "", 0, false, false, bVar.f2286k);
                    }
                } else {
                    kVar = kVar2;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
                        String str4 = packageArchiveInfo.packageName;
                        String str5 = packageArchiveInfo.versionName;
                        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageArchiveInfo.getLongVersionCode() : (long) packageArchiveInfo.versionCode;
                        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                        applicationInfo.sourceDir = str;
                        applicationInfo.publicSourceDir = str;
                        aVar2 = new a(str4, str5, longVersionCode, packageManager.getApplicationLabel(applicationInfo).toString(), str, ".apk", "", 0, false, false, bVar.f2286k);
                    } catch (Exception e3) {
                        e.a.warn("获取包信息异常", (Throwable) e3);
                        aVar = new a();
                    }
                }
                aVar = aVar2;
                kVar.c(aVar, 18, f.C(18));
            } else {
                e.a.debug("apk 类型路径不存在.");
                aVar = new a();
            }
            kVar = kVar2;
            kVar.c(aVar, 18, f.C(18));
        }
        ((Activity) context).finish();
    }
}
