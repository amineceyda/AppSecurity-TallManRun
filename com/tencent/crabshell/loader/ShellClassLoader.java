package com.tencent.crabshell.loader;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.crabshell.Logger;
import com.tencent.crabshell.common.SharePatchFileUtil;
import dalvik.system.DexFile;
import g.a.a.a.a;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import m.b.a.a.b.f;

public class ShellClassLoader {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String CHECK_DEX_CLASS2 = "com.apkpure.crabshell.GlobalConst";
    private static final String CHECK_DEX_FIELD2 = "BUILD_NO";
    private static final Pattern CLASS_N_PATTERN = Pattern.compile("classes(?:[2-9]?|[1-9][0-9]+)\\.dex(\\.jar)?");
    public static final String ORI_BUILD_NO = "ORI_BUILD_NO";
    private static int sPatchDexCount = 0;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(6081290154455202081L, "com/tencent/crabshell/loader/ShellClassLoader", EventResult.ERROR_CODE_SAMPLE);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[99] = true;
        $jacocoInit[100] = true;
    }

    public ShellClassLoader() {
        $jacocoInit()[0] = true;
    }

    private static boolean checkDexInstall(Application application, ClassLoader classLoader) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, PackageManager.NameNotFoundException {
        int i2;
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[29] = true;
        Class<?> cls = Class.forName(CHECK_DEX_CLASS2, true, classLoader);
        $jacocoInit[30] = true;
        Field findField = ShareReflectUtil.findField(cls, CHECK_DEX_FIELD2);
        $jacocoInit[31] = true;
        String valueOf = String.valueOf(findField.get((Object) null));
        $jacocoInit[32] = true;
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "nowBuildNo:" + valueOf);
        $jacocoInit[33] = true;
        PackageManager packageManager = application.getPackageManager();
        $jacocoInit[34] = true;
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128);
        boolean z = false;
        try {
            $jacocoInit[35] = true;
            i2 = applicationInfo.metaData.getInt(ORI_BUILD_NO);
            $jacocoInit[36] = true;
        } catch (Throwable th) {
            $jacocoInit[37] = true;
            th.printStackTrace();
            $jacocoInit[38] = true;
            i2 = 0;
        }
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "oriBuildNo:" + i2);
        $jacocoInit[39] = true;
        if (TextUtils.isEmpty(valueOf)) {
            $jacocoInit[40] = true;
        } else if (valueOf.equals(String.valueOf(i2))) {
            $jacocoInit[41] = true;
        } else {
            $jacocoInit[42] = true;
            z = true;
        }
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "checkDexInstall:" + z);
        $jacocoInit[43] = true;
        return z;
    }

    private static List<File> createSortedAdditionalPathEntries(List<File> list) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList(list);
        $jacocoInit[44] = true;
        final HashMap hashMap = new HashMap();
        $jacocoInit[45] = true;
        Iterator it = arrayList.iterator();
        $jacocoInit[46] = true;
        while (it.hasNext()) {
            $jacocoInit[47] = true;
            String name = ((File) it.next()).getName();
            $jacocoInit[48] = true;
            hashMap.put(name, Boolean.valueOf(CLASS_N_PATTERN.matcher(name).matches()));
            $jacocoInit[49] = true;
        }
        Collections.sort(arrayList, new Comparator<File>() {
            private static transient /* synthetic */ boolean[] $jacocoData;

            private static /* synthetic */ boolean[] $jacocoInit() {
                boolean[] zArr = $jacocoData;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = f.a(-1149619456490457492L, "com/tencent/crabshell/loader/ShellClassLoader$1", 3);
                $jacocoData = a;
                return a;
            }

            {
                boolean[] $jacocoInit = $jacocoInit();
                $jacocoInit[0] = true;
            }

            public int compare(File file, File file2) {
                boolean[] $jacocoInit = $jacocoInit();
                int compareFiles = SharePatchFileUtil.compareFiles(file, file2, hashMap);
                $jacocoInit[1] = true;
                return compareFiles;
            }

            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                boolean[] $jacocoInit = $jacocoInit();
                int compare = compare((File) obj, (File) obj2);
                $jacocoInit[2] = true;
                return compare;
            }
        });
        $jacocoInit[50] = true;
        return arrayList;
    }

    public static void injectDexInternal(ClassLoader classLoader, List<File> list, File file) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        if (Build.VERSION.SDK_INT >= 23) {
            $jacocoInit[14] = true;
            installForV23(classLoader, list, file);
            $jacocoInit[15] = true;
        } else {
            installForV19(classLoader, list, file);
            $jacocoInit[16] = true;
        }
        $jacocoInit[17] = true;
    }

    public static void installDex(Application application, ClassLoader classLoader, File file, List<File> list, boolean z) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder i2 = a.i("installDex dexOptDir: ");
        i2.append(file.getAbsolutePath());
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, i2.toString());
        $jacocoInit[1] = true;
        if (list.isEmpty()) {
            $jacocoInit[2] = true;
        } else {
            $jacocoInit[3] = true;
            List<File> createSortedAdditionalPathEntries = createSortedAdditionalPathEntries(list);
            if (Build.VERSION.SDK_INT >= 24) {
                $jacocoInit[4] = true;
                classLoader = LoadByNewClassLoader.inject(application, classLoader, file, z, createSortedAdditionalPathEntries);
                $jacocoInit[5] = true;
            } else {
                injectDexInternal(classLoader, createSortedAdditionalPathEntries, file);
                $jacocoInit[6] = true;
            }
            sPatchDexCount = createSortedAdditionalPathEntries.size();
            $jacocoInit[7] = true;
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "after: " + classLoader + ", dex size:" + sPatchDexCount);
            $jacocoInit[8] = true;
            if (checkDexInstall(application, classLoader)) {
                $jacocoInit[9] = true;
            } else {
                $jacocoInit[10] = true;
                uninstallPatchDex(classLoader);
                $jacocoInit[11] = true;
                Exception exc = new Exception("ShareConstants.CHECK_DEX_INSTALL_FAIL");
                $jacocoInit[12] = true;
                throw exc;
            }
        }
        $jacocoInit[13] = true;
    }

    private static void installForV19(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        boolean[] $jacocoInit = $jacocoInit();
        Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
        $jacocoInit[70] = true;
        Object obj = findField.get(classLoader);
        $jacocoInit[71] = true;
        ArrayList arrayList = new ArrayList();
        $jacocoInit[72] = true;
        ShareReflectUtil.expandFieldArray(obj, "dexElements", makeDexElementsForV19(obj, new ArrayList(list), file, arrayList));
        $jacocoInit[73] = true;
        if (arrayList.size() <= 0) {
            $jacocoInit[74] = true;
        } else {
            $jacocoInit[75] = true;
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                $jacocoInit[76] = true;
            } else {
                IOException iOException = (IOException) it.next();
                $jacocoInit[77] = true;
                Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "Exception in makeDexElement", iOException);
                $jacocoInit[78] = true;
                throw iOException;
            }
        }
        $jacocoInit[79] = true;
    }

    private static void installForV23(ClassLoader classLoader, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        boolean[] $jacocoInit = $jacocoInit();
        Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
        $jacocoInit[51] = true;
        Object obj = findField.get(classLoader);
        $jacocoInit[52] = true;
        ArrayList arrayList = new ArrayList();
        $jacocoInit[53] = true;
        ShareReflectUtil.expandFieldArray(obj, "dexElements", makePathElementsForV23(obj, new ArrayList(list), file, arrayList));
        $jacocoInit[54] = true;
        if (arrayList.size() == 0) {
            $jacocoInit[55] = true;
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            $jacocoInit[58] = true;
            return;
        }
        IOException iOException = (IOException) it.next();
        $jacocoInit[56] = true;
        Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "Exception in makePathElement", iOException);
        $jacocoInit[57] = true;
        throw iOException;
    }

    private static Object[] makeDexElementsForV19(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Method method;
        boolean[] $jacocoInit = $jacocoInit();
        try {
            $jacocoInit[80] = true;
            method = ShareReflectUtil.findMethod(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class});
            $jacocoInit[81] = true;
        } catch (NoSuchMethodException unused) {
            $jacocoInit[82] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
            try {
                $jacocoInit[83] = true;
                method = ShareReflectUtil.findMethod(obj, "makeDexElements", (Class<?>[]) new Class[]{List.class, File.class, List.class});
                $jacocoInit[84] = true;
            } catch (NoSuchMethodException e2) {
                $jacocoInit[85] = true;
                Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "NoSuchMethodException: makeDexElements(List,File,List) failure");
                $jacocoInit[86] = true;
                throw e2;
            }
        }
        Object[] objArr = (Object[]) method.invoke(obj, new Object[]{arrayList, file, arrayList2});
        $jacocoInit[87] = true;
        return objArr;
    }

    private static Object[] makePathElementsForV23(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Method method;
        boolean[] $jacocoInit = $jacocoInit();
        try {
            method = ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class});
            $jacocoInit[59] = true;
        } catch (NoSuchMethodException unused) {
            $jacocoInit[60] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "NoSuchMethodException: makePathElements(List,File,List) failure");
            try {
                $jacocoInit[61] = true;
                method = ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class});
                $jacocoInit[62] = true;
            } catch (NoSuchMethodException unused2) {
                $jacocoInit[63] = true;
                Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
                try {
                    $jacocoInit[64] = true;
                    Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "NoSuchMethodException: try use v19 instead");
                    $jacocoInit[65] = true;
                    Object[] makeDexElementsForV19 = makeDexElementsForV19(obj, arrayList, file, arrayList2);
                    $jacocoInit[66] = true;
                    return makeDexElementsForV19;
                } catch (NoSuchMethodException e2) {
                    $jacocoInit[67] = true;
                    Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "NoSuchMethodException: makeDexElements(List,File,List) failure");
                    $jacocoInit[68] = true;
                    throw e2;
                }
            }
        }
        Object[] objArr = (Object[]) method.invoke(obj, new Object[]{arrayList, file, arrayList2});
        $jacocoInit[69] = true;
        return objArr;
    }

    public static void preInstallDex(Context context, File file, List<File> list, boolean z, String str) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder i2 = a.i("preInstallDex:");
        i2.append(file.getAbsolutePath());
        i2.append(",size:");
        i2.append(list.size());
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, i2.toString());
        $jacocoInit[88] = true;
        if (list.isEmpty()) {
            $jacocoInit[89] = true;
            return;
        }
        List<File> createSortedAdditionalPathEntries = createSortedAdditionalPathEntries(list);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            $jacocoInit[90] = true;
            StringBuilder sb = new StringBuilder();
            $jacocoInit[91] = true;
            sb.append(file.getAbsolutePath());
            sb.append(ShellAllLoader.DEX_NAME);
            File file2 = new File(sb.toString());
            $jacocoInit[92] = true;
            LoadByNewClassLoader.preInject(context, file2, z, createSortedAdditionalPathEntries);
            $jacocoInit[93] = true;
        } else if (i3 >= 24) {
            $jacocoInit[94] = true;
            File file3 = new File(file.getAbsolutePath());
            $jacocoInit[95] = true;
            LoadByNewClassLoader.preInject(context, file3, z, createSortedAdditionalPathEntries);
            $jacocoInit[96] = true;
        } else {
            DexFile.loadDex(str, file.getAbsolutePath() + ShellAllLoader.DEX_NAME, 0);
            $jacocoInit[97] = true;
        }
        $jacocoInit[98] = true;
    }

    public static void uninstallPatchDex(ClassLoader classLoader) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        if (sPatchDexCount <= 0) {
            $jacocoInit[18] = true;
            return;
        }
        $jacocoInit[19] = true;
        Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
        $jacocoInit[20] = true;
        Object obj = findField.get(classLoader);
        $jacocoInit[21] = true;
        ShareReflectUtil.reduceFieldArray(obj, "dexElements", sPatchDexCount);
        $jacocoInit[22] = true;
        $jacocoInit[28] = true;
    }
}
