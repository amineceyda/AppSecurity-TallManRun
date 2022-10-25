package com.tencent.crabshell.loader;

import android.content.Context;
import android.os.Build;
import com.tencent.crabshell.Logger;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.a.a.a.a;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.b.a.a.b.f;

public class CrabShellLoadLibrary {
    private static transient /* synthetic */ boolean[] $jacocoData;

    public static final class V14 {
        private static transient /* synthetic */ boolean[] $jacocoData;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = f.a(-1183154299149549078L, "com/tencent/crabshell/loader/CrabShellLoadLibrary$V14", 14);
            $jacocoData = a;
            return a;
        }

        private V14() {
            $jacocoInit()[0] = true;
        }

        public static /* synthetic */ void access$200(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            install(classLoader, file);
            $jacocoInit[13] = true;
        }

        private static void install(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
            $jacocoInit[1] = true;
            Object obj = findField.get(classLoader);
            $jacocoInit[2] = true;
            Field findField2 = ShareReflectUtil.findField(obj, "nativeLibraryDirectories");
            $jacocoInit[3] = true;
            File[] fileArr = (File[]) findField2.get(obj);
            $jacocoInit[4] = true;
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            $jacocoInit[5] = true;
            arrayList.add(file);
            int length = fileArr.length;
            $jacocoInit[6] = true;
            int i2 = 0;
            while (i2 < length) {
                File file2 = fileArr[i2];
                $jacocoInit[7] = true;
                if (file.equals(file2)) {
                    $jacocoInit[8] = true;
                } else {
                    $jacocoInit[9] = true;
                    arrayList.add(file2);
                    $jacocoInit[10] = true;
                }
                i2++;
                $jacocoInit[11] = true;
            }
            findField2.set(obj, arrayList.toArray(new File[0]));
            $jacocoInit[12] = true;
        }
    }

    public static final class V23 {
        private static transient /* synthetic */ boolean[] $jacocoData;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = f.a(5039193239112669286L, "com/tencent/crabshell/loader/CrabShellLoadLibrary$V23", 28);
            $jacocoData = a;
            return a;
        }

        private V23() {
            $jacocoInit()[0] = true;
        }

        public static /* synthetic */ void access$100(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            install(classLoader, file);
            $jacocoInit[27] = true;
        }

        private static void install(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
            $jacocoInit[1] = true;
            Object obj = findField.get(classLoader);
            $jacocoInit[2] = true;
            Field findField2 = ShareReflectUtil.findField(obj, "nativeLibraryDirectories");
            $jacocoInit[3] = true;
            List list = (List) findField2.get(obj);
            if (list != null) {
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
                list = new ArrayList(2);
                $jacocoInit[6] = true;
            }
            Iterator it = list.iterator();
            $jacocoInit[7] = true;
            while (true) {
                if (!it.hasNext()) {
                    $jacocoInit[8] = true;
                    break;
                }
                $jacocoInit[9] = true;
                $jacocoInit[10] = true;
                if (file.equals((File) it.next())) {
                    $jacocoInit[11] = true;
                    it.remove();
                    $jacocoInit[12] = true;
                    break;
                }
                $jacocoInit[13] = true;
            }
            list.add(0, file);
            $jacocoInit[14] = true;
            Field findField3 = ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories");
            $jacocoInit[15] = true;
            List list2 = (List) findField3.get(obj);
            if (list2 != null) {
                $jacocoInit[16] = true;
            } else {
                $jacocoInit[17] = true;
                list2 = new ArrayList(2);
                $jacocoInit[18] = true;
            }
            ArrayList arrayList = new ArrayList(list2.size() + list.size() + 1);
            $jacocoInit[19] = true;
            arrayList.addAll(list);
            $jacocoInit[20] = true;
            arrayList.addAll(list2);
            $jacocoInit[21] = true;
            Method findMethod = ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class});
            $jacocoInit[22] = true;
            ArrayList arrayList2 = new ArrayList();
            $jacocoInit[23] = true;
            $jacocoInit[24] = true;
            Field findField4 = ShareReflectUtil.findField(obj, "nativeLibraryPathElements");
            $jacocoInit[25] = true;
            findField4.set(obj, (Object[]) findMethod.invoke(obj, new Object[]{arrayList, null, arrayList2}));
            $jacocoInit[26] = true;
        }
    }

    public static final class V25 {
        private static transient /* synthetic */ boolean[] $jacocoData;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = f.a(-8243465958762647485L, "com/tencent/crabshell/loader/CrabShellLoadLibrary$V25", 27);
            $jacocoData = a;
            return a;
        }

        private V25() {
            $jacocoInit()[0] = true;
        }

        public static /* synthetic */ void access$000(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            install(classLoader, file);
            $jacocoInit[26] = true;
        }

        private static void install(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
            $jacocoInit[1] = true;
            Object obj = findField.get(classLoader);
            $jacocoInit[2] = true;
            Field findField2 = ShareReflectUtil.findField(obj, "nativeLibraryDirectories");
            $jacocoInit[3] = true;
            List list = (List) findField2.get(obj);
            if (list != null) {
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
                list = new ArrayList(2);
                $jacocoInit[6] = true;
            }
            Iterator it = list.iterator();
            $jacocoInit[7] = true;
            while (true) {
                if (!it.hasNext()) {
                    $jacocoInit[8] = true;
                    break;
                }
                $jacocoInit[9] = true;
                $jacocoInit[10] = true;
                if (file.equals((File) it.next())) {
                    $jacocoInit[11] = true;
                    it.remove();
                    $jacocoInit[12] = true;
                    break;
                }
                $jacocoInit[13] = true;
            }
            list.add(0, file);
            $jacocoInit[14] = true;
            Field findField3 = ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories");
            $jacocoInit[15] = true;
            List list2 = (List) findField3.get(obj);
            if (list2 != null) {
                $jacocoInit[16] = true;
            } else {
                $jacocoInit[17] = true;
                list2 = new ArrayList(2);
                $jacocoInit[18] = true;
            }
            ArrayList arrayList = new ArrayList(list2.size() + list.size() + 1);
            $jacocoInit[19] = true;
            arrayList.addAll(list);
            $jacocoInit[20] = true;
            arrayList.addAll(list2);
            $jacocoInit[21] = true;
            Method findMethod = ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class});
            $jacocoInit[22] = true;
            Object[] objArr = {arrayList};
            $jacocoInit[23] = true;
            Field findField4 = ShareReflectUtil.findField(obj, "nativeLibraryPathElements");
            $jacocoInit[24] = true;
            findField4.set(obj, (Object[]) findMethod.invoke(obj, objArr));
            $jacocoInit[25] = true;
        }
    }

    public static final class V4 {
        private static transient /* synthetic */ boolean[] $jacocoData;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = f.a(-8378467097853553771L, "com/tencent/crabshell/loader/CrabShellLoadLibrary$V4", 24);
            $jacocoData = a;
            return a;
        }

        private V4() {
            $jacocoInit()[0] = true;
        }

        public static /* synthetic */ void access$300(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            install(classLoader, file);
            $jacocoInit[23] = true;
        }

        private static void install(ClassLoader classLoader, File file) throws Throwable {
            boolean[] $jacocoInit = $jacocoInit();
            String path = file.getPath();
            $jacocoInit[1] = true;
            Field findField = ShareReflectUtil.findField((Object) classLoader, "libPath");
            $jacocoInit[2] = true;
            $jacocoInit[3] = true;
            String[] split = ((String) findField.get(classLoader)).split(Constants.KEY_INDEX_FILE_SEPARATOR);
            $jacocoInit[4] = true;
            StringBuilder sb = new StringBuilder(path);
            int length = split.length;
            $jacocoInit[5] = true;
            int i2 = 0;
            while (i2 < length) {
                String str = split[i2];
                $jacocoInit[6] = true;
                if (str == null) {
                    $jacocoInit[7] = true;
                } else if (path.equals(str)) {
                    $jacocoInit[8] = true;
                } else {
                    sb.append(':');
                    sb.append(str);
                    $jacocoInit[9] = true;
                }
                i2++;
                $jacocoInit[10] = true;
            }
            findField.set(classLoader, sb.toString());
            $jacocoInit[11] = true;
            Field findField2 = ShareReflectUtil.findField((Object) classLoader, "libraryPathElements");
            $jacocoInit[12] = true;
            List list = (List) findField2.get(classLoader);
            $jacocoInit[13] = true;
            Iterator it = list.iterator();
            $jacocoInit[14] = true;
            while (true) {
                if (!it.hasNext()) {
                    $jacocoInit[15] = true;
                    break;
                }
                $jacocoInit[16] = true;
                $jacocoInit[17] = true;
                if (path.equals((String) it.next())) {
                    $jacocoInit[18] = true;
                    it.remove();
                    $jacocoInit[19] = true;
                    break;
                }
                $jacocoInit[20] = true;
            }
            list.add(0, path);
            $jacocoInit[21] = true;
            findField2.set(classLoader, list);
            $jacocoInit[22] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(6150809091340340759L, "com/tencent/crabshell/loader/CrabShellLoadLibrary", 37);
        $jacocoData = a;
        return a;
    }

    public CrabShellLoadLibrary() {
        $jacocoInit()[0] = true;
    }

    public static boolean installNativeLibraryABI(Context context, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        File file = new File(str);
        $jacocoInit[1] = true;
        if (!file.exists()) {
            $jacocoInit[2] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "current libraryABI folder is not exist, path: %s" + str);
            $jacocoInit[3] = true;
            return false;
        }
        ClassLoader classLoader = context.getClassLoader();
        if (classLoader == null) {
            $jacocoInit[4] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "classloader is null");
            $jacocoInit[5] = true;
            return false;
        }
        StringBuilder i2 = a.i("before hack classloader:");
        i2.append(classLoader.toString());
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, i2.toString());
        try {
            $jacocoInit[6] = true;
            installNativeLibraryPath(classLoader, file);
            $jacocoInit[7] = true;
            return true;
        } catch (Throwable th) {
            $jacocoInit[9] = true;
            Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "installNativeLibraryPath fail:" + th);
            $jacocoInit[10] = true;
            return false;
        } finally {
            StringBuilder i3 = a.i("after hack classloader:");
            i3.append(classLoader.toString());
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, i3.toString());
            $jacocoInit[12] = true;
        }
    }

    private static void installNativeLibraryPath(ClassLoader classLoader, File file) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        if (file == null) {
            $jacocoInit[13] = true;
        } else if (!file.exists()) {
            $jacocoInit[14] = true;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 != 25) {
                $jacocoInit[16] = true;
            } else if (Build.VERSION.PREVIEW_SDK_INT != 0) {
                $jacocoInit[17] = true;
                V25.access$000(classLoader, file);
                $jacocoInit[20] = true;
                $jacocoInit[36] = true;
                return;
            } else {
                $jacocoInit[18] = true;
            }
            if (i2 > 25) {
                try {
                    $jacocoInit[19] = true;
                    V25.access$000(classLoader, file);
                    $jacocoInit[20] = true;
                } catch (Throwable th) {
                    $jacocoInit[21] = true;
                    StringBuilder i3 = a.i("installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23");
                    i3.append(Build.VERSION.SDK_INT);
                    $jacocoInit[22] = true;
                    i3.append(th.getMessage());
                    String sb = i3.toString();
                    $jacocoInit[23] = true;
                    Logger.e(ShellAllLoader.CRAB_SHELL_TAG, sb);
                    $jacocoInit[24] = true;
                    V23.access$100(classLoader, file);
                    $jacocoInit[25] = true;
                }
            } else if (i2 >= 23) {
                try {
                    $jacocoInit[26] = true;
                    V23.access$100(classLoader, file);
                    $jacocoInit[27] = true;
                } catch (Throwable th2) {
                    $jacocoInit[28] = true;
                    StringBuilder i4 = a.i("installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14");
                    i4.append(Build.VERSION.SDK_INT);
                    $jacocoInit[29] = true;
                    i4.append(th2.getMessage());
                    String sb2 = i4.toString();
                    $jacocoInit[30] = true;
                    Logger.e(ShellAllLoader.CRAB_SHELL_TAG, sb2);
                    $jacocoInit[31] = true;
                    V14.access$200(classLoader, file);
                    $jacocoInit[32] = true;
                }
            } else {
                $jacocoInit[33] = true;
                V14.access$200(classLoader, file);
                $jacocoInit[34] = true;
            }
            $jacocoInit[36] = true;
            return;
        }
        Logger.e(ShellAllLoader.CRAB_SHELL_TAG, "installNativeLibraryPath, folder %s is illegal" + file);
        $jacocoInit[15] = true;
    }
}
