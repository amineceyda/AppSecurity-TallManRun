package com.tencent.crabshell.builder;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.tencent.crabshell.Logger;
import com.tencent.crabshell.common.CipherManager;
import com.tencent.crabshell.common.DataSavingUtils;
import com.tencent.crabshell.common.SHA1;
import com.tencent.crabshell.common.SharePatchFileUtil;
import com.tencent.crabshell.loader.PatchResult;
import com.tencent.crabshell.loader.ShellAllLoader;
import com.tencent.crabshell.loader.ShellClassLoader;
import com.tencent.crabshell.loader.ShellSoLoader;
import g.a.a.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import m.b.a.a.b.f;

public class ShellBuilderService implements IShellBuilderService {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String SLASH = "/";
    private static final String UNDER_LINE = "_";
    public static final String YYB_SHELL_VERSION = "YYB_SHELL_VERSION";
    public String mDestDir;
    public PatchResult mPatchResult;
    public ShellBuilderReporter mReporter;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(2132330852644070064L, "com/tencent/crabshell/builder/ShellBuilderService", 118);
        $jacocoData = a;
        return a;
    }

    public ShellBuilderService() {
        $jacocoInit()[1] = true;
    }

    public void cleanLastVersion(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[3] = true;
        String dataString = DataSavingUtils.getDataString(context, ShellAllLoader.KEY_HOTFIX_LAST_PATH);
        $jacocoInit[4] = true;
        if (TextUtils.isEmpty(dataString)) {
            $jacocoInit[5] = true;
            return;
        }
        DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_IS_READY, false);
        $jacocoInit[6] = true;
        new File(dataString).delete();
        $jacocoInit[7] = true;
        DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_LAST_PATH, "");
        $jacocoInit[8] = true;
        DataSavingUtils.putData(context, ShellSoLoader.KEY_HOTFIX_SO_LIST, "");
        ShellBuilderReporter shellBuilderReporter = this.mReporter;
        if (shellBuilderReporter == null) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            shellBuilderReporter.notifyRollBack();
            $jacocoInit[11] = true;
        }
        $jacocoInit[12] = true;
    }

    public void createDiffSo(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        HashMap hashMap = new HashMap();
        $jacocoInit[44] = true;
        unZipLocalApp(context, hashMap);
        $jacocoInit[45] = true;
        StringBuilder i2 = a.i(str);
        String str2 = File.separator;
        i2.append(str2);
        i2.append("lib");
        i2.append(str2);
        i2.append("armeabi-v7a");
        File file = new File(i2.toString());
        $jacocoInit[46] = true;
        if (!file.exists()) {
            $jacocoInit[47] = true;
        } else {
            $jacocoInit[48] = true;
            file.delete();
            $jacocoInit[49] = true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            $jacocoInit[50] = true;
        } else if (listFiles.length == 0) {
            $jacocoInit[51] = true;
        } else {
            saveSoList(context, listFiles, hashMap);
            $jacocoInit[53] = true;
            return;
        }
        $jacocoInit[52] = true;
    }

    public void createNewVersion(String str, Context context, String str2, String str3) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        UnZipUtils.upZipFile(str, str2);
        $jacocoInit[36] = true;
        SharePatchFileUtil.copy(str, str3);
        $jacocoInit[37] = true;
        preInstallDex(context, new File(str2), str3);
        $jacocoInit[38] = true;
    }

    public PatchResult getPatchResult() {
        boolean[] $jacocoInit = $jacocoInit();
        PatchResult patchResult = this.mPatchResult;
        $jacocoInit[0] = true;
        return patchResult;
    }

    public void initNewVersion(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean[] $jacocoInit = $jacocoInit();
        PackageInfo packageInfoFromApkFile = ApkUtils.getPackageInfoFromApkFile(context, str);
        if (packageInfoFromApkFile == null) {
            $jacocoInit[86] = true;
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "getPackageInfoFromApkFile null");
            $jacocoInit[87] = true;
            return;
        }
        ApplicationInfo applicationInfo = packageInfoFromApkFile.applicationInfo;
        if (applicationInfo == null) {
            $jacocoInit[88] = true;
        } else if (applicationInfo.metaData == null) {
            $jacocoInit[89] = true;
        } else {
            int newBuildNumber = ApkUtils.getNewBuildNumber(packageInfoFromApkFile);
            $jacocoInit[91] = true;
            int oldBuildNumber = ApkUtils.getOldBuildNumber(context);
            $jacocoInit[92] = true;
            initPatchResult(context, (long) newBuildNumber, (long) oldBuildNumber, packageInfoFromApkFile.versionName);
            int i2 = packageInfoFromApkFile.versionCode;
            $jacocoInit[93] = true;
            int i3 = applicationInfo.metaData.getInt(YYB_SHELL_VERSION);
            $jacocoInit[94] = true;
            StringBuilder k2 = a.k(",versionCode:", i2, ", buildNo:", newBuildNumber, ", newShellVersion :");
            k2.append(i3);
            k2.append(", oldBuildNo:");
            k2.append(oldBuildNumber);
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, k2.toString());
            $jacocoInit[95] = true;
            $jacocoInit[96] = true;
            this.mDestDir = (context.getFilesDir().getAbsolutePath() + ShellAllLoader.SHELL_DIR) + SLASH + i3 + UNDER_LINE + i2 + UNDER_LINE + newBuildNumber;
            $jacocoInit[97] = true;
            return;
        }
        $jacocoInit[90] = true;
    }

    public void initPatchResult(Context context, long j2, long j3, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        PatchResult patchResult = new PatchResult();
        this.mPatchResult = patchResult;
        patchResult.patchBuildNo = j2;
        patchResult.targetBuildNo = j3;
        $jacocoInit[98] = true;
        StringBuilder i2 = a.i(ShellAllLoader.KEY_HOTFIX_IS_RETRY);
        i2.append(this.mPatchResult.patchBuildNo);
        patchResult.isRetry = DataSavingUtils.getDataBoolean(context, i2.toString());
        this.mPatchResult.versionName = str;
        $jacocoInit[99] = true;
    }

    public void preInstallDex(Context context, File file, String str) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[115] = true;
        arrayList.add(new File(str));
        $jacocoInit[116] = true;
        ShellClassLoader.preInstallDex(context, file, arrayList, true, str);
        $jacocoInit[117] = true;
    }

    public void releaseNewApk(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            $jacocoInit[13] = true;
            initNewVersion(context, str);
            $jacocoInit[14] = true;
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "start release,destDir:" + this.mDestDir);
            $jacocoInit[15] = true;
            if (!TextUtils.isEmpty(this.mDestDir)) {
                $jacocoInit[16] = true;
                String str2 = this.mDestDir + SLASH + ShellAllLoader.KEY_HOTFIX_NEW_APK_NAME;
                $jacocoInit[18] = true;
                createNewVersion(str, context, this.mDestDir, str2);
                $jacocoInit[19] = true;
                saveFileSha1(context, this.mDestDir, str2);
                $jacocoInit[20] = true;
                reportAndRestart(currentTimeMillis);
                $jacocoInit[21] = true;
                DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_IS_RETRY + this.mPatchResult.patchBuildNo, true);
                $jacocoInit[22] = true;
                PackageManager packageManager = context.getPackageManager();
                $jacocoInit[23] = true;
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                int i2 = 0;
                $jacocoInit[24] = true;
                i2 = applicationInfo.metaData.getInt(ShellClassLoader.ORI_BUILD_NO);
                $jacocoInit[25] = true;
                Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "oriBuildNo:" + i2);
                $jacocoInit[28] = true;
                DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_SHELL_VERSION, String.valueOf(i2));
                $jacocoInit[29] = true;
                $jacocoInit[35] = true;
                return;
            }
            $jacocoInit[17] = true;
        } catch (Throwable th) {
            this.mPatchResult.f765e = th;
            $jacocoInit[30] = true;
            th.printStackTrace();
            $jacocoInit[31] = true;
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "---unzip--end--exception");
            ShellBuilderReporter shellBuilderReporter = this.mReporter;
            if (shellBuilderReporter == null) {
                $jacocoInit[32] = true;
            } else {
                $jacocoInit[33] = true;
                shellBuilderReporter.reportShellUnzipFail(this.mPatchResult);
                $jacocoInit[34] = true;
            }
        }
    }

    public void reportAndRestart(long j2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.mPatchResult.costTime = System.currentTimeMillis() - j2;
        ShellBuilderReporter shellBuilderReporter = this.mReporter;
        if (shellBuilderReporter == null) {
            $jacocoInit[39] = true;
        } else {
            $jacocoInit[40] = true;
            shellBuilderReporter.reportShellUnzipDone(this.mPatchResult);
            $jacocoInit[41] = true;
            this.mReporter.notifyNewVersionReady();
            $jacocoInit[42] = true;
        }
        $jacocoInit[43] = true;
    }

    public void saveFileSha1(Context context, String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        File file = new File(str);
        $jacocoInit[100] = true;
        String lengthAndLastModifyTime = SharePatchFileUtil.getLengthAndLastModifyTime(new File(str2));
        $jacocoInit[101] = true;
        DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_NEW_APK_NAME, lengthAndLastModifyTime);
        $jacocoInit[102] = true;
        StringBuilder i2 = a.i(ShellAllLoader.FILE_VERIFY);
        i2.append(file.getName());
        DataSavingUtils.setDexSha1(context, i2.toString(), str2, lengthAndLastModifyTime);
        $jacocoInit[103] = true;
        StringBuilder i3 = a.i(ShellAllLoader.FILE_VERIFY);
        $jacocoInit[104] = true;
        i3.append(file.getName());
        String sb = i3.toString();
        $jacocoInit[105] = true;
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb, 0);
        $jacocoInit[106] = true;
        String sha1 = SHA1.toSHA1(sharedPreferences.getAll().toString());
        $jacocoInit[107] = true;
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "verify:" + sha1);
        $jacocoInit[108] = true;
        String encryptData = new CipherManager(lengthAndLastModifyTime).encryptData(sha1);
        $jacocoInit[109] = true;
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "encryptData:" + encryptData);
        $jacocoInit[110] = true;
        DataSavingUtils.putData(context, ShellAllLoader.FILE_VERIFY, encryptData);
        $jacocoInit[111] = true;
        DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_LAST_PATH, str);
        $jacocoInit[112] = true;
        DataSavingUtils.putData(context, ShellAllLoader.KEY_HOTFIX_IS_READY, true);
        $jacocoInit[113] = true;
        StringBuilder i4 = a.i(ShellAllLoader.KEY_HOTFIX_FIRST_EFFECT);
        i4.append(this.mPatchResult.patchBuildNo);
        DataSavingUtils.putData(context, i4.toString(), true);
        $jacocoInit[114] = true;
    }

    public void saveSoList(Context context, File[] fileArr, HashMap<String, String> hashMap) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        int length = fileArr.length;
        $jacocoInit[54] = true;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArr[i2];
            $jacocoInit[55] = true;
            String fileSHA1 = SHA1.getFileSHA1(file);
            $jacocoInit[56] = true;
            String name = file.getName();
            $jacocoInit[57] = true;
            sb.append(",");
            $jacocoInit[58] = true;
            if (!hashMap.containsKey(name)) {
                $jacocoInit[59] = true;
                sb.append(file.getAbsoluteFile());
                $jacocoInit[60] = true;
            } else if (hashMap.get(name).equals(fileSHA1)) {
                $jacocoInit[61] = true;
            } else {
                $jacocoInit[62] = true;
                sb.append(file.getAbsoluteFile());
                $jacocoInit[63] = true;
            }
            i2++;
            $jacocoInit[64] = true;
        }
        DataSavingUtils.putData(context, ShellSoLoader.KEY_HOTFIX_SO_LIST, sb.toString());
        $jacocoInit[65] = true;
        StringBuilder i3 = a.i("newSoFileArray=");
        i3.append(sb.toString());
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, i3.toString());
        $jacocoInit[66] = true;
    }

    public void setReporter(ShellBuilderReporter shellBuilderReporter) {
        boolean[] $jacocoInit = $jacocoInit();
        this.mReporter = shellBuilderReporter;
        $jacocoInit[2] = true;
    }

    public void unZipLocalApp(Context context, HashMap<String, String> hashMap) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            String str = File.separator;
            sb.append(str);
            String str2 = this.mPatchResult.versionName;
            $jacocoInit[67] = true;
            sb.append(str2.trim());
            String sb2 = sb.toString();
            $jacocoInit[68] = true;
            File file = new File(sb2);
            $jacocoInit[69] = true;
            if (!file.exists()) {
                $jacocoInit[70] = true;
            } else {
                $jacocoInit[71] = true;
                file.delete();
                $jacocoInit[72] = true;
            }
            PackageManager packageManager = context.getPackageManager();
            $jacocoInit[73] = true;
            int i2 = 0;
            String str3 = packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir;
            $jacocoInit[74] = true;
            UnZipUtils.upZipFile(str3, sb2);
            $jacocoInit[75] = true;
            File file2 = new File(sb2 + str + "lib" + str + "armeabi-v7a");
            $jacocoInit[76] = true;
            File[] listFiles = file2.listFiles();
            int length = listFiles.length;
            $jacocoInit[77] = true;
            while (i2 < length) {
                File file3 = listFiles[i2];
                $jacocoInit[78] = true;
                String fileSHA1 = SHA1.getFileSHA1(file3);
                $jacocoInit[79] = true;
                String name = file3.getName();
                $jacocoInit[80] = true;
                hashMap.put(name, fileSHA1);
                i2++;
                $jacocoInit[81] = true;
            }
            new File(sb2).delete();
            $jacocoInit[82] = true;
        } catch (Exception e2) {
            $jacocoInit[83] = true;
            e2.printStackTrace();
            $jacocoInit[84] = true;
        }
        $jacocoInit[85] = true;
    }
}
