package g.c.a.e.k.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.apkpure.aegon.components.install.AppInfo;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.b.a.k.e;
import g.c.a.e.e.a;
import g.c.a.e.k.h.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class f {
    public static final Logger a = LoggerFactory.getLogger("AppDownloadLog");
    public static final Object b = new Object();

    public static boolean a(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable th) {
            a.warn("获取包信息异常: {}", (Object) th.getMessage(), (Object) th);
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.apkpure.aegon.components.install.AppInfo b(android.content.pm.PackageManager r18, android.content.pm.PackageInfo r19) {
        /*
            r0 = r19
            java.lang.String r1 = ""
            android.content.pm.ApplicationInfo r2 = r0.applicationInfo
            com.apkpure.aegon.components.install.AppInfo r3 = new com.apkpure.aegon.components.install.AppInfo
            r3.<init>()
            r4 = r18
            java.lang.CharSequence r4 = r4.getApplicationLabel(r2)     // Catch:{ Exception -> 0x0018 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0018 }
            r3.label = r4     // Catch:{ Exception -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r3.label = r1
        L_0x001a:
            java.lang.String r4 = r0.versionName
            r3.versionName = r4
            int r4 = r0.versionCode
            r3.versionCode = r4
            java.lang.String r4 = r0.packageName
            r3.packageName = r4
            android.content.pm.Signature[] r4 = r0.signatures
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L_0x002e
            r4 = r5
            goto L_0x0058
        L_0x002e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.pm.Signature[] r7 = r0.signatures
            int r8 = r7.length
            r9 = 0
        L_0x0037:
            if (r9 >= r8) goto L_0x0058
            r10 = r7[r9]
            byte[] r10 = r10.toByteArray()
            java.security.MessageDigest r11 = g.c.a.e.k.b.a.d()
            if (r11 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            if (r10 != 0) goto L_0x004a
        L_0x0048:
            r10 = r5
            goto L_0x0052
        L_0x004a:
            byte[] r10 = r11.digest(r10)
            java.lang.String r10 = g.c.a.e.k.b.a.a(r10)
        L_0x0052:
            r4.add(r10)
            int r9 = r9 + 1
            goto L_0x0037
        L_0x0058:
            r3.signatures = r4
            long r7 = r0.firstInstallTime
            r3.firstInstallTime = r7
            long r7 = r0.lastUpdateTime
            r3.lastUpdateTime = r7
            int r4 = r2.flags
            r7 = r4 & 1
            r8 = 1
            if (r7 != 0) goto L_0x0070
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r4 = 0
            goto L_0x0071
        L_0x0070:
            r4 = 1
        L_0x0071:
            r3.isSystemApp = r4
            java.lang.String r4 = r2.sourceDir
            r3.sourceDir = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r4 < r7) goto L_0x0089
            java.lang.String[] r4 = r2.splitSourceDirs
            r3.splitSourceDirs = r4
            if (r4 == 0) goto L_0x0089
            int r4 = r4.length
            if (r4 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r4 = 0
            goto L_0x008a
        L_0x0089:
            r4 = 1
        L_0x008a:
            r3.isUploadFile = r4
            java.lang.Class r9 = r19.getClass()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r10 = "coreApp"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ Exception -> 0x00a0 }
            r9.setAccessible(r8)     // Catch:{ Exception -> 0x00a0 }
            boolean r9 = r9.getBoolean(r0)     // Catch:{ Exception -> 0x00a0 }
            r3.isCoreApp = r9     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a2
        L_0x00a0:
            r3.isCoreApp = r6
        L_0x00a2:
            boolean r9 = r2.enabled
            r3.isEnabled = r9
            r3.isUninstalled = r6
            java.lang.String[] r9 = r3.splitSourceDirs
            if (r9 == 0) goto L_0x00c0
            int r12 = r9.length
            if (r12 <= 0) goto L_0x00c0
            int r12 = r9.length
            r13 = 0
            r14 = 0
        L_0x00b3:
            if (r13 >= r12) goto L_0x00c6
            r16 = r9[r13]
            long r16 = g.c.a.e.k.e.a.c(r16)
            long r14 = r16 + r14
            int r13 = r13 + 1
            goto L_0x00b3
        L_0x00c0:
            java.lang.String r9 = r3.sourceDir
            long r14 = g.c.a.e.k.e.a.c(r9)
        L_0x00c6:
            r3.appLength = r14
            int r9 = r2.targetSdkVersion
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r3.targetSdkVersion = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r12 = 24
            if (r9 < r12) goto L_0x00de
            int r12 = r2.minSdkVersion
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r3.minSdkVersion = r12
        L_0x00de:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r13 = r2.publicSourceDir
            if (r13 == 0) goto L_0x00f9
            r12.add(r13)
            if (r9 < r7) goto L_0x00f7
            java.lang.String[] r2 = r2.splitPublicSourceDirs
            if (r2 == 0) goto L_0x00f7
            java.util.List r2 = java.util.Arrays.asList(r2)
            r12.addAll(r2)
        L_0x00f7:
            r3.isExpandApks = r8
        L_0x00f9:
            r3.apksFilePath = r12
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            java.lang.String r7 = "mounted"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x010b
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()
        L_0x010b:
            if (r5 != 0) goto L_0x010e
            goto L_0x0112
        L_0x010e:
            java.lang.String r1 = r5.getAbsolutePath()
        L_0x0112:
            java.lang.String r2 = r0.packageName
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 2
            if (r2 != 0) goto L_0x0194
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0194
            java.lang.Object[] r2 = new java.lang.Object[r5]
            int r7 = r0.versionCode
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r6] = r7
            java.lang.String r7 = r0.packageName
            r2[r8] = r7
            java.lang.String r7 = "main.%s.%s.obb"
            java.lang.String r2 = java.lang.String.format(r7, r2)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r9 = r0.packageName
            r7[r6] = r9
            r7[r8] = r2
            java.lang.String r2 = "Android/obb/%s/%s"
            java.lang.String r7 = java.lang.String.format(r2, r7)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r6] = r1
            r9[r8] = r7
            java.lang.String r13 = "%s/%s"
            java.lang.String r9 = java.lang.String.format(r13, r9)
            java.lang.Object[] r14 = new java.lang.Object[r5]
            int r15 = r0.versionCode
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r6] = r15
            java.lang.String r15 = r0.packageName
            r14[r8] = r15
            java.lang.String r15 = "patch.%s.%s.obb"
            java.lang.String r14 = java.lang.String.format(r15, r14)
            java.lang.Object[] r15 = new java.lang.Object[r5]
            java.lang.String r10 = r0.packageName
            r15[r6] = r10
            r15[r8] = r14
            java.lang.String r2 = java.lang.String.format(r2, r15)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r6] = r1
            r10[r8] = r2
            java.lang.String r1 = java.lang.String.format(r13, r10)
            long r10 = g.c.a.e.k.e.a.c(r9)
            long r13 = g.c.a.e.k.e.a.c(r1)
            long r13 = r13 + r10
            r10 = 0
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0194
            r3.xApkMainObbPath = r7
            r3.xApkMainObbAbsolutePath = r9
            r3.xApkPatchObbPath = r2
            r3.xApkPatchObbAbsolutePath = r1
            r3.xApkObbSize = r13
            r1 = 1
            goto L_0x0195
        L_0x0194:
            r1 = 0
        L_0x0195:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r0.packageName
            r2[r6] = r7
            int r7 = r0.versionCode
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r8] = r7
            int r7 = r12.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r5] = r7
            java.lang.String r5 = "%s.%s.%s.xapk"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r3.xApkFileName = r2
            r3.isObbExists = r1
            if (r1 == 0) goto L_0x01bc
            if (r4 != 0) goto L_0x01c2
        L_0x01bc:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x01c3
        L_0x01c2:
            r6 = 1
        L_0x01c3:
            r3.isExpandXApk = r6
            java.lang.String[] r0 = r0.requestedPermissions
            if (r0 == 0) goto L_0x01dd
            java.util.List<java.lang.String> r1 = r3.permissionsArrays
            if (r1 != 0) goto L_0x01d4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.permissionsArrays = r1
        L_0x01d4:
            java.util.List<java.lang.String> r1 = r3.permissionsArrays
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
        L_0x01dd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.k.a.f.b(android.content.pm.PackageManager, android.content.pm.PackageInfo):com.apkpure.aegon.components.install.AppInfo");
    }

    public static int c(AppDetailInfo appDetailInfo) {
        int i2;
        if (appDetailInfo == null) {
            return -1;
        }
        String[] strArr = appDetailInfo.sign;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, strArr);
        try {
            i2 = Integer.parseInt(appDetailInfo.versionCode);
        } catch (Exception unused) {
            i2 = 0;
        }
        int hashCode = b.c(AppDigest.e(appDetailInfo.packageName, i2, arrayList, appDetailInfo.versionId)).hashCode() & Integer.MAX_VALUE;
        a.a("AppUtils", "appId=" + hashCode + ", this=" + f.class);
        return hashCode;
    }

    public static AppInfo d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4224);
            if (packageInfo != null) {
                return b(packageManager, packageInfo);
            }
            throw new PackageManager.NameNotFoundException(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized List<AppInfo> e(Context context) {
        ArrayList arrayList;
        synchronized (f.class) {
            synchronized (b) {
                PackageManager packageManager = context.getPackageManager();
                arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                try {
                    arrayList2 = packageManager.getInstalledPackages(4224);
                } catch (Throwable th) {
                    a.a.warn("tag: {}, msg: {}", (Object) "AppUtils", (Object) "getInstalledPackages failed" + th.getMessage());
                }
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    AppInfo d2 = d(context, ((PackageInfo) arrayList2.get(i2)).packageName);
                    if (d2 != null) {
                        arrayList.add(d2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void f(String str, DTStatInfo dTStatInfo) {
        if (TextUtils.isEmpty(str)) {
            a.info("需要下载 app 时,package name 为空");
        } else {
            e.a(str, new c(dTStatInfo));
        }
    }

    public static void g(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            launchIntentForPackage = null;
        } else {
            launchIntentForPackage.addFlags(268435456);
        }
        if (launchIntentForPackage != null) {
            try {
                context.startActivity(launchIntentForPackage);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
