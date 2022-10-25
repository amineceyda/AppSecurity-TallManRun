package com.tencent.crabshell.loader;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import com.tencent.crabshell.Logger;
import com.tencent.crabshell.common.SharePatchFileUtil;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import m.b.a.a.b.f;

public class ShellResourceLoader {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String CHECK_RES_INSTALL_FAIL = "checkResInstall failed";
    private static final String TEST_ASSETS_VALUE = "buildno.ini";
    private static Method addAssetPathAsSharedLibraryMethod = null;
    private static Method addAssetPathMethod = null;
    private static Field assetsFiled = null;
    private static Object currentActivityThread = null;
    private static Method ensureStringBlocksMethod = null;
    private static AssetManager newAssetManager = null;
    private static Field packagesFiled = null;
    private static Field publicSourceDirField = null;
    private static Collection<WeakReference<Resources>> references = null;
    private static Field resDir = null;
    private static Field resourcePackagesFiled = null;
    private static Field resourcesImplFiled = null;
    private static Field stringBlocksField = null;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(400093766509004538L, "com/tencent/crabshell/loader/ShellResourceLoader", 139);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[138] = true;
    }

    public ShellResourceLoader() {
        $jacocoInit()[0] = true;
    }

    private static boolean checkResUpdate(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        InputStream inputStream = null;
        try {
            $jacocoInit[125] = true;
            inputStream = context.getAssets().open(TEST_ASSETS_VALUE);
            $jacocoInit[126] = true;
            SharePatchFileUtil.closeQuietly(inputStream);
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "checkResUpdate success, found test resource assets file buildno.ini");
            $jacocoInit[131] = true;
            return true;
        } catch (Throwable th) {
            SharePatchFileUtil.closeQuietly(inputStream);
            $jacocoInit[130] = true;
            throw th;
        }
    }

    private static void clearPreloadTypedArrayIssue(Resources resources) {
        boolean[] $jacocoInit = $jacocoInit();
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "try to clear typedArray cache!");
        try {
            $jacocoInit[116] = true;
            Field findField = ShareReflectUtil.findField((Class<?>) Resources.class, "mTypedArrayPool");
            $jacocoInit[117] = true;
            Object obj = findField.get(resources);
            $jacocoInit[118] = true;
            Method findMethod = ShareReflectUtil.findMethod(obj, "acquire", (Class<?>[]) new Class[0]);
            $jacocoInit[119] = true;
            while (findMethod.invoke(obj, new Object[0]) != null) {
                $jacocoInit[120] = true;
            }
            $jacocoInit[121] = true;
        } catch (Throwable th) {
            $jacocoInit[122] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "clearPreloadTypedArrayIssue failed, ignore error: " + th);
            $jacocoInit[123] = true;
        }
        $jacocoInit[124] = true;
    }

    public static void initAssetsFiled(Resources resources) throws NoSuchFieldException {
        boolean[] $jacocoInit = $jacocoInit();
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                $jacocoInit[54] = true;
                resourcesImplFiled = ShareReflectUtil.findField((Object) resources, "mResourcesImpl");
                $jacocoInit[55] = true;
            } catch (Throwable unused) {
                $jacocoInit[56] = true;
                assetsFiled = ShareReflectUtil.findField((Object) resources, "mAssets");
                $jacocoInit[57] = true;
            }
        } else {
            assetsFiled = ShareReflectUtil.findField((Object) resources, "mAssets");
            $jacocoInit[58] = true;
        }
        $jacocoInit[59] = true;
    }

    public static void initForReferences(Class<?> cls) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[37] = true;
        Class<?> cls2 = Class.forName("android.app.ResourcesManager");
        $jacocoInit[38] = true;
        Method findMethod = ShareReflectUtil.findMethod(cls2, "getInstance", (Class<?>[]) new Class[0]);
        $jacocoInit[39] = true;
        Object invoke = findMethod.invoke((Object) null, new Object[0]);
        try {
            $jacocoInit[40] = true;
            Field findField = ShareReflectUtil.findField(cls2, "mActiveResources");
            $jacocoInit[41] = true;
            $jacocoInit[42] = true;
            references = ((ArrayMap) findField.get(invoke)).values();
            $jacocoInit[43] = true;
        } catch (NoSuchFieldException unused) {
            $jacocoInit[44] = true;
            Field findField2 = ShareReflectUtil.findField(cls2, "mResourceReferences");
            $jacocoInit[45] = true;
            references = (Collection) findField2.get(invoke);
            $jacocoInit[46] = true;
        }
        $jacocoInit[47] = true;
        if (references != null) {
            $jacocoInit[53] = true;
            return;
        }
        $jacocoInit[51] = true;
        IllegalStateException illegalStateException = new IllegalStateException("resource references is null");
        $jacocoInit[52] = true;
        throw illegalStateException;
    }

    public static void initLoadedApk(Context context, Class<?> cls) throws Exception {
        Class<?> cls2;
        Class<String> cls3 = String.class;
        boolean[] $jacocoInit = $jacocoInit();
        currentActivityThread = ShareReflectUtil.getActivityThread(context, cls);
        try {
            $jacocoInit[20] = true;
            cls2 = Class.forName("android.app.LoadedApk");
            $jacocoInit[21] = true;
        } catch (ClassNotFoundException unused) {
            $jacocoInit[22] = true;
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
            $jacocoInit[23] = true;
        }
        resDir = ShareReflectUtil.findField(cls2, "mResDir");
        $jacocoInit[24] = true;
        packagesFiled = ShareReflectUtil.findField(cls, "mPackages");
        if (Build.VERSION.SDK_INT >= 27) {
            $jacocoInit[25] = true;
        } else {
            $jacocoInit[26] = true;
            resourcePackagesFiled = ShareReflectUtil.findField(cls, "mResourcePackages");
            $jacocoInit[27] = true;
        }
        AssetManager assets = context.getAssets();
        $jacocoInit[28] = true;
        addAssetPathMethod = ShareReflectUtil.findMethod((Object) assets, "addAssetPath", (Class<?>[]) new Class[]{cls3});
        $jacocoInit[29] = true;
        if (!shouldAddSharedLibraryAssets(context.getApplicationInfo())) {
            $jacocoInit[30] = true;
        } else {
            $jacocoInit[31] = true;
            addAssetPathAsSharedLibraryMethod = ShareReflectUtil.findMethod((Object) assets, "addAssetPathAsSharedLibrary", (Class<?>[]) new Class[]{cls3});
            try {
                $jacocoInit[32] = true;
            } catch (Throwable unused2) {
                $jacocoInit[35] = true;
            }
        }
        stringBlocksField = ShareReflectUtil.findField((Object) assets, "mStringBlocks");
        $jacocoInit[33] = true;
        ensureStringBlocksMethod = ShareReflectUtil.findMethod((Object) assets, "ensureStringBlocks", (Class<?>[]) new Class[0]);
        $jacocoInit[34] = true;
        newAssetManager = (AssetManager) ShareReflectUtil.findConstructor(assets, new Class[0]).newInstance(new Object[0]);
        $jacocoInit[36] = true;
    }

    public static void initResourceLoader(Context context) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        Class<?> cls = Class.forName("android.app.ActivityThread");
        $jacocoInit[13] = true;
        initLoadedApk(context, cls);
        $jacocoInit[14] = true;
        initForReferences(cls);
        $jacocoInit[15] = true;
        initAssetsFiled(context.getResources());
        try {
            $jacocoInit[16] = true;
            publicSourceDirField = ShareReflectUtil.findField((Class<?>) ApplicationInfo.class, "publicSourceDir");
            $jacocoInit[17] = true;
        } catch (NoSuchFieldException unused) {
            $jacocoInit[18] = true;
        }
        $jacocoInit[19] = true;
    }

    public static boolean loadTinkerResources(Application application, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            $jacocoInit[1] = true;
            initResourceLoader(application);
            $jacocoInit[2] = true;
            monkeyPatchExistingResources(application, str);
            $jacocoInit[3] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("loadTinkerResources:");
            sb.append(str);
            sb.append(",cost:");
            $jacocoInit[4] = true;
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            String sb2 = sb.toString();
            $jacocoInit[5] = true;
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, sb2);
            $jacocoInit[12] = true;
            return true;
        } catch (Throwable unused) {
            $jacocoInit[9] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "uninstallPatchDex failed", th);
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
        return false;
    }

    public static void monkeyPatchExistingResources(Context context, String str) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        if (str == null) {
            $jacocoInit[60] = true;
            return;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        $jacocoInit[61] = true;
        setPackagesFields(applicationInfo, str);
        $jacocoInit[62] = true;
        setNewAssetManager(applicationInfo, str);
        $jacocoInit[63] = true;
        setPublicSourceDir(context, str);
        $jacocoInit[64] = true;
    }

    public static void setNewAssetManager(ApplicationInfo applicationInfo, String str) throws Exception {
        boolean[] $jacocoInit = $jacocoInit();
        if (((Integer) addAssetPathMethod.invoke(newAssetManager, new Object[]{str})).intValue() != 0) {
            if (!shouldAddSharedLibraryAssets(applicationInfo)) {
                $jacocoInit[82] = true;
            } else {
                String[] strArr = applicationInfo.sharedLibraryFiles;
                int length = strArr.length;
                $jacocoInit[83] = true;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = strArr[i2];
                    $jacocoInit[85] = true;
                    if (!str2.endsWith(".apk")) {
                        $jacocoInit[86] = true;
                    } else {
                        if (((Integer) addAssetPathAsSharedLibraryMethod.invoke(newAssetManager, new Object[]{str2})).intValue() != 0) {
                            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "addAssetPathAsSharedLibrary " + str2);
                            $jacocoInit[89] = true;
                        } else {
                            $jacocoInit[87] = true;
                            IllegalStateException illegalStateException = new IllegalStateException("AssetManager add SharedLibrary Fail");
                            $jacocoInit[88] = true;
                            throw illegalStateException;
                        }
                    }
                    i2++;
                    $jacocoInit[90] = true;
                }
                $jacocoInit[84] = true;
            }
            Field field = stringBlocksField;
            if (field == null) {
                $jacocoInit[91] = true;
            } else if (ensureStringBlocksMethod == null) {
                $jacocoInit[92] = true;
            } else {
                $jacocoInit[93] = true;
                field.set(newAssetManager, (Object) null);
                $jacocoInit[94] = true;
                ensureStringBlocksMethod.invoke(newAssetManager, new Object[0]);
                $jacocoInit[95] = true;
            }
            $jacocoInit[96] = true;
            for (WeakReference<Resources> weakReference : references) {
                $jacocoInit[97] = true;
                Resources resources = (Resources) weakReference.get();
                if (resources != null) {
                    $jacocoInit[98] = true;
                    try {
                        assetsFiled.set(resources, newAssetManager);
                        $jacocoInit[100] = true;
                    } catch (Throwable unused) {
                        $jacocoInit[101] = true;
                        Object obj = resourcesImplFiled.get(resources);
                        $jacocoInit[102] = true;
                        Field findField = ShareReflectUtil.findField(obj, "mAssets");
                        $jacocoInit[103] = true;
                        findField.set(obj, newAssetManager);
                        $jacocoInit[104] = true;
                    }
                    clearPreloadTypedArrayIssue(resources);
                    $jacocoInit[105] = true;
                    resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                    $jacocoInit[106] = true;
                } else {
                    $jacocoInit[99] = true;
                }
            }
            $jacocoInit[107] = true;
            return;
        }
        $jacocoInit[80] = true;
        IllegalStateException illegalStateException2 = new IllegalStateException("Could not create new AssetManager");
        $jacocoInit[81] = true;
        throw illegalStateException2;
    }

    public static void setPackagesFields(ApplicationInfo applicationInfo, String str) throws IllegalAccessException {
        Field[] fieldArr;
        boolean[] $jacocoInit = $jacocoInit();
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 27) {
            fieldArr = new Field[]{packagesFiled, resourcePackagesFiled};
            $jacocoInit[65] = true;
        } else {
            fieldArr = new Field[]{packagesFiled};
            $jacocoInit[66] = true;
        }
        int length = fieldArr.length;
        $jacocoInit[67] = true;
        while (i2 < length) {
            Field field = fieldArr[i2];
            $jacocoInit[68] = true;
            Object obj = field.get(currentActivityThread);
            $jacocoInit[69] = true;
            $jacocoInit[70] = true;
            for (Map.Entry value : ((Map) obj).entrySet()) {
                $jacocoInit[71] = true;
                Object obj2 = ((WeakReference) value.getValue()).get();
                if (obj2 == null) {
                    $jacocoInit[72] = true;
                } else {
                    $jacocoInit[73] = true;
                    if (!applicationInfo.sourceDir.equals((String) resDir.get(obj2))) {
                        $jacocoInit[74] = true;
                    } else {
                        $jacocoInit[75] = true;
                        resDir.set(obj2, str);
                        $jacocoInit[76] = true;
                    }
                    $jacocoInit[77] = true;
                }
            }
            i2++;
            $jacocoInit[78] = true;
        }
        $jacocoInit[79] = true;
    }

    public static void setPublicSourceDir(Context context, String str) throws Exception {
        boolean[] $jacocoInit = $jacocoInit();
        if (Build.VERSION.SDK_INT < 24) {
            $jacocoInit[108] = true;
        } else {
            try {
                $jacocoInit[109] = true;
                Field field = publicSourceDirField;
                if (field == null) {
                    $jacocoInit[110] = true;
                } else {
                    $jacocoInit[111] = true;
                    field.set(context.getApplicationInfo(), str);
                    $jacocoInit[112] = true;
                }
                $jacocoInit[113] = true;
            } catch (Throwable unused) {
                $jacocoInit[114] = true;
            }
        }
        $jacocoInit[115] = true;
    }

    private static boolean shouldAddSharedLibraryAssets(ApplicationInfo applicationInfo) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (Build.VERSION.SDK_INT < 24) {
            $jacocoInit[132] = true;
        } else if (applicationInfo == null) {
            $jacocoInit[133] = true;
        } else if (applicationInfo.sharedLibraryFiles == null) {
            $jacocoInit[134] = true;
        } else {
            $jacocoInit[135] = true;
            z = true;
            $jacocoInit[137] = true;
            return z;
        }
        z = false;
        $jacocoInit[136] = true;
        $jacocoInit[137] = true;
        return z;
    }
}
