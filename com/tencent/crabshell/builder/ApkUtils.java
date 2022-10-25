package com.tencent.crabshell.builder;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.crabshell.loader.ShellClassLoader;
import m.b.a.a.b.f;

public class ApkUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-1110705513228224831L, "com/tencent/crabshell/builder/ApkUtils", 6);
        $jacocoData = a;
        return a;
    }

    public ApkUtils() {
        $jacocoInit()[0] = true;
    }

    public static int getNewBuildNumber(PackageInfo packageInfo) {
        boolean[] $jacocoInit = $jacocoInit();
        int i2 = packageInfo.applicationInfo.metaData.getInt(ShellClassLoader.ORI_BUILD_NO);
        $jacocoInit[1] = true;
        return i2;
    }

    public static int getOldBuildNumber(Context context) throws PackageManager.NameNotFoundException {
        boolean[] $jacocoInit = $jacocoInit();
        PackageManager packageManager = context.getPackageManager();
        $jacocoInit[3] = true;
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        $jacocoInit[4] = true;
        int i2 = applicationInfo.metaData.getInt(ShellClassLoader.ORI_BUILD_NO);
        $jacocoInit[5] = true;
        return i2;
    }

    public static PackageInfo getPackageInfoFromApkFile(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 129);
        $jacocoInit[2] = true;
        return packageArchiveInfo;
    }
}
