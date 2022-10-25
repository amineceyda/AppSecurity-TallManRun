package com.tencent.crabshell.loader;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.tencent.crabshell.Logger;
import com.tencent.crabshell.builder.ShellBuilderService;
import com.tencent.crabshell.common.CipherManager;
import com.tencent.crabshell.common.DataSavingUtils;
import com.tencent.crabshell.common.SHA1;
import com.tencent.crabshell.common.SharePatchFileUtil;
import g.a.a.a.a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m.b.a.a.b.f;

public class ShellAllLoader {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String CRAB_SHELL_TAG = "crab_shell_tag";
    public static final String DEX_NAME = "/base.dex";
    public static final int FAIL_DEX = 2;
    public static final int FAIL_RESOURCE = 3;
    public static final int FAIL_SO = 4;
    public static final int FAIL_VERIFY = 1;
    public static final String FILE_VERIFY = "file_verify";
    public static final String KEY_HOTFIX_FIRST_EFFECT = "key_hotfix_first_effect";
    public static final String KEY_HOTFIX_FIRST_EFFECT_CODE = "key_hotfix_first_effect_code";
    public static final String KEY_HOTFIX_FIRST_EFFECT_COST = "key_hotfix_first_effect_cost";
    public static final String KEY_HOTFIX_FIRST_EFFECT_UPLOAD = "key_hotfix_first_effect_upload";
    public static final String KEY_HOTFIX_IS_READY = "hotfix_is_ready";
    public static final String KEY_HOTFIX_IS_RETRY = "hotfix_is_retry";
    public static final String KEY_HOTFIX_LAST_PATH = "hotfix_last_path";
    public static final String KEY_HOTFIX_NEW_APK_NAME = "base.apk";
    public static final String KEY_HOTFIX_NEW_LIB_PATH = "/lib/armeabi-v7a";
    public static final String KEY_HOTFIX_SHELL_VERSION = "hotfix_shell_version";
    public static final int LOAD_OK = 0;
    public static final String SHELL_DIR = "/shell";
    private static final String SLASH = "/";
    private static final String UNDER_LINE = "_";
    public static long appCreateTime;
    public static int errorCode = 0;
    public static boolean hotFixReady = false;
    public static String newBuildNo;
    public static String newVersionDir;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-8834763413772527011L, "com/tencent/crabshell/loader/ShellAllLoader", 90);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[89] = true;
    }

    public ShellAllLoader() {
        $jacocoInit()[0] = true;
    }

    public static ArrayList<File> collectDexList(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<File> arrayList = new ArrayList<>();
        $jacocoInit[26] = true;
        arrayList.add(new File(str));
        $jacocoInit[27] = true;
        return arrayList;
    }

    public static String getNewBuildNo() {
        boolean[] $jacocoInit = $jacocoInit();
        String[] split = newVersionDir.split(UNDER_LINE);
        if (split == null) {
            $jacocoInit[22] = true;
        } else if (split.length == 0) {
            $jacocoInit[23] = true;
        } else {
            String str = split[split.length - 1];
            $jacocoInit[25] = true;
            return str;
        }
        $jacocoInit[24] = true;
        return "";
    }

    public static void hookActivitiesWhenCrabShell(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!DataSavingUtils.getDataBoolean(context, KEY_HOTFIX_IS_READY)) {
            $jacocoInit[76] = true;
        } else {
            $jacocoInit[77] = true;
            String dataString = DataSavingUtils.getDataString(context, KEY_HOTFIX_LAST_PATH);
            $jacocoInit[78] = true;
            String c = a.c(dataString, SLASH, KEY_HOTFIX_NEW_APK_NAME);
            $jacocoInit[79] = true;
            Logger.i(CRAB_SHELL_TAG, "--hookActivitiesWhenCrabShell--:");
            try {
                $jacocoInit[80] = true;
                $jacocoInit[81] = true;
                ClassLoader classLoader = context.getClassLoader();
                $jacocoInit[82] = true;
                Class<?> cls = Class.forName("com.tencent.crabshell.loader.instrumentation.HookHelper", false, classLoader);
                $jacocoInit[83] = true;
                Method declaredMethod = cls.getDeclaredMethod("hookInstrumentation", new Class[]{Context.class, String.class});
                $jacocoInit[84] = true;
                declaredMethod.invoke(cls, new Object[]{context, c});
                $jacocoInit[85] = true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                $jacocoInit[86] = true;
                e2.printStackTrace();
                $jacocoInit[87] = true;
            }
        }
        $jacocoInit[88] = true;
    }

    public static void loadNewApk(Application application, long j2) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            appCreateTime = j2;
            if (Build.VERSION.SDK_INT >= 21) {
                $jacocoInit[1] = true;
                boolean dataBoolean = DataSavingUtils.getDataBoolean(application, KEY_HOTFIX_IS_READY);
                hotFixReady = dataBoolean;
                if (dataBoolean) {
                    $jacocoInit[3] = true;
                    newVersionDir = DataSavingUtils.getDataString(application, KEY_HOTFIX_LAST_PATH);
                    $jacocoInit[5] = true;
                    String str = newVersionDir + SLASH + KEY_HOTFIX_NEW_APK_NAME;
                    $jacocoInit[6] = true;
                    verifyNewVersion(application, str);
                    $jacocoInit[7] = true;
                    loadNewDex(application, collectDexList(str), new File(newVersionDir));
                    $jacocoInit[8] = true;
                    loadNewResource(application, str);
                    errorCode = 0;
                    $jacocoInit[9] = true;
                    Logger.i(CRAB_SHELL_TAG, "--loadNewApk--cost:" + (System.currentTimeMillis() - appCreateTime));
                    $jacocoInit[10] = true;
                    $jacocoInit[11] = true;
                    Logger.i(CRAB_SHELL_TAG, "--loadNewSo--start--cost:" + (System.currentTimeMillis() - appCreateTime));
                    $jacocoInit[12] = true;
                    CrabShellLoadLibrary.installNativeLibraryABI(application, newVersionDir + KEY_HOTFIX_NEW_LIB_PATH);
                    $jacocoInit[13] = true;
                    Logger.i(CRAB_SHELL_TAG, "--loadNewSo--done--cost:" + (System.currentTimeMillis() - appCreateTime));
                    $jacocoInit[14] = true;
                    recordIfFirstEffect(application);
                    $jacocoInit[21] = true;
                    return;
                }
                $jacocoInit[4] = true;
                return;
            }
            $jacocoInit[2] = true;
        } catch (Throwable th) {
            $jacocoInit[15] = true;
            th.printStackTrace();
            $jacocoInit[16] = true;
            StringBuilder i2 = a.i("---loadNewApk--exception:");
            i2.append(th.getMessage());
            i2.append(",cost:");
            $jacocoInit[17] = true;
            i2.append(System.currentTimeMillis() - appCreateTime);
            String sb = i2.toString();
            $jacocoInit[18] = true;
            Logger.i(CRAB_SHELL_TAG, sb);
            $jacocoInit[19] = true;
            new ShellBuilderService().cleanLastVersion(application);
            $jacocoInit[20] = true;
        }
    }

    public static void loadNewDex(Application application, ArrayList<File> arrayList, File file) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        errorCode = 2;
        $jacocoInit[28] = true;
        ShellClassLoader.installDex(application, ShellAllLoader.class.getClassLoader(), file, arrayList, true);
        $jacocoInit[29] = true;
    }

    public static void loadNewResource(Application application, String str) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        errorCode = 3;
        $jacocoInit[30] = true;
        ShellResourceLoader.loadTinkerResources(application, str);
        $jacocoInit[31] = true;
    }

    public static void loadNewSo(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        errorCode = 4;
        $jacocoInit[32] = true;
        ShellSoLoader.loadDiffSo(application);
        $jacocoInit[33] = true;
        StringBuilder i2 = a.i("loadNewSo done cost:");
        i2.append(System.currentTimeMillis() - appCreateTime);
        Logger.i(CRAB_SHELL_TAG, i2.toString());
        $jacocoInit[34] = true;
    }

    public static void recordIfFirstEffect(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        newBuildNo = getNewBuildNo();
        $jacocoInit[68] = true;
        StringBuilder i2 = a.i(KEY_HOTFIX_FIRST_EFFECT);
        i2.append(newBuildNo);
        if (!DataSavingUtils.getDataBoolean(application, i2.toString())) {
            $jacocoInit[69] = true;
            return;
        }
        StringBuilder i3 = a.i(KEY_HOTFIX_FIRST_EFFECT);
        i3.append(newBuildNo);
        DataSavingUtils.putData((Context) application, i3.toString(), false);
        $jacocoInit[70] = true;
        DataSavingUtils.putData((Context) application, KEY_HOTFIX_FIRST_EFFECT_UPLOAD, true);
        $jacocoInit[71] = true;
        StringBuilder i4 = a.i("");
        $jacocoInit[72] = true;
        i4.append(System.currentTimeMillis() - appCreateTime);
        String sb = i4.toString();
        $jacocoInit[73] = true;
        DataSavingUtils.putData((Context) application, KEY_HOTFIX_FIRST_EFFECT_COST, sb);
        $jacocoInit[74] = true;
        StringBuilder i5 = a.i("");
        i5.append(errorCode);
        DataSavingUtils.putData((Context) application, KEY_HOTFIX_FIRST_EFFECT_CODE, i5.toString());
        $jacocoInit[75] = true;
    }

    public static boolean verifyApk(SharedPreferences sharedPreferences, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        String string = sharedPreferences.getString(str, "");
        $jacocoInit[56] = true;
        String lengthAndLastModifyTime = SharePatchFileUtil.getLengthAndLastModifyTime(new File(str));
        $jacocoInit[57] = true;
        if (!lengthAndLastModifyTime.equals(string)) {
            $jacocoInit[58] = true;
            return false;
        }
        $jacocoInit[59] = true;
        return true;
    }

    public static void verifyNewVersion(Application application, String str) throws Exception {
        boolean[] $jacocoInit = $jacocoInit();
        errorCode = 1;
        $jacocoInit[35] = true;
        if (!verifyVersion(application)) {
            $jacocoInit[36] = true;
            Exception exc = new Exception("version not match");
            $jacocoInit[37] = true;
            throw exc;
        } else if (verifySaveFile(application)) {
            StringBuilder i2 = a.i(FILE_VERIFY);
            File file = new File(newVersionDir);
            $jacocoInit[40] = true;
            i2.append(file.getName());
            String sb = i2.toString();
            $jacocoInit[41] = true;
            SharedPreferences sharedPreferences = application.getSharedPreferences(sb, 0);
            $jacocoInit[42] = true;
            if (verifyApk(sharedPreferences, str)) {
                $jacocoInit[45] = true;
                return;
            }
            $jacocoInit[43] = true;
            Exception exc2 = new Exception("apk changed");
            $jacocoInit[44] = true;
            throw exc2;
        } else {
            $jacocoInit[38] = true;
            Exception exc3 = new Exception("save file changed");
            $jacocoInit[39] = true;
            throw exc3;
        }
    }

    public static boolean verifySaveFile(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        String dataString = DataSavingUtils.getDataString(application, KEY_HOTFIX_NEW_APK_NAME);
        $jacocoInit[60] = true;
        StringBuilder i2 = a.i(FILE_VERIFY);
        File file = new File(newVersionDir);
        $jacocoInit[61] = true;
        i2.append(file.getName());
        String sb = i2.toString();
        $jacocoInit[62] = true;
        SharedPreferences sharedPreferences = application.getSharedPreferences(sb, 0);
        $jacocoInit[63] = true;
        String sha1 = SHA1.toSHA1(sharedPreferences.getAll().toString());
        $jacocoInit[64] = true;
        String dataString2 = DataSavingUtils.getDataString(application, FILE_VERIFY);
        $jacocoInit[65] = true;
        if (!new CipherManager(dataString).decryptData(dataString2).equals(sha1)) {
            $jacocoInit[66] = true;
            return false;
        }
        $jacocoInit[67] = true;
        return true;
    }

    public static boolean verifyVersion(Application application) throws PackageManager.NameNotFoundException {
        int i2;
        boolean[] $jacocoInit = $jacocoInit();
        PackageManager packageManager = application.getPackageManager();
        $jacocoInit[46] = true;
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128);
        boolean z = false;
        try {
            $jacocoInit[47] = true;
            i2 = applicationInfo.metaData.getInt(ShellClassLoader.ORI_BUILD_NO);
            $jacocoInit[48] = true;
        } catch (Throwable th) {
            $jacocoInit[49] = true;
            th.printStackTrace();
            $jacocoInit[50] = true;
            i2 = 0;
        }
        $jacocoInit[51] = true;
        int parseInt = Integer.parseInt(DataSavingUtils.getDataString(application, KEY_HOTFIX_SHELL_VERSION));
        $jacocoInit[52] = true;
        Logger.i(CRAB_SHELL_TAG, "verifyVersion saveBuildNo:" + parseInt + ",oriBuildNo:" + i2);
        if (i2 == parseInt) {
            $jacocoInit[53] = true;
            z = true;
        } else {
            $jacocoInit[54] = true;
        }
        $jacocoInit[55] = true;
        return z;
    }
}
