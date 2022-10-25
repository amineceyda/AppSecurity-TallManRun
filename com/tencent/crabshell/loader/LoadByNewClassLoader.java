package com.tencent.crabshell.loader;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.io.File;
import java.util.List;
import m.b.a.a.b.f;

public final class LoadByNewClassLoader {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-6485954634161330254L, "com/tencent/crabshell/loader/LoadByNewClassLoader", 76);
        $jacocoData = a;
        return a;
    }

    private LoadByNewClassLoader() {
        $jacocoInit()[71] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.ClassLoader createNewClassLoader(java.lang.ClassLoader r10, java.io.File r11, boolean r12, boolean r13, java.lang.String... r14) throws java.lang.Throwable {
        /*
            boolean[] r0 = $jacocoInit()
            java.lang.String r1 = "dalvik.system.BaseDexClassLoader"
            r2 = 7
            r3 = 1
            r0[r2] = r3
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r10)
            r2 = 8
            r0[r2] = r3
            java.lang.String r2 = "pathList"
            java.lang.reflect.Field r1 = findField(r1, r2)
            r2 = 9
            r0[r2] = r3
            java.lang.Object r1 = r1.get(r10)
            r2 = 10
            r0[r2] = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r14 != 0) goto L_0x0031
            r4 = 11
            r0[r4] = r3
            goto L_0x0038
        L_0x0031:
            int r4 = r14.length
            if (r4 > 0) goto L_0x003e
            r4 = 12
            r0[r4] = r3
        L_0x0038:
            r4 = 14
            r0[r4] = r3
            r4 = 0
            goto L_0x0043
        L_0x003e:
            r4 = 13
            r0[r4] = r3
            r4 = 1
        L_0x0043:
            if (r4 != 0) goto L_0x004a
            r14 = 15
            r0[r14] = r3
            goto L_0x0056
        L_0x004a:
            r4 = 16
            r0[r4] = r3
            r4 = 0
        L_0x004f:
            int r5 = r14.length
            if (r4 < r5) goto L_0x016c
            r14 = 17
            r0[r14] = r3
        L_0x0056:
            java.lang.String r14 = r2.toString()
            r2 = 22
            r0[r2] = r3
            java.lang.Class r2 = r1.getClass()
            java.lang.String r4 = "nativeLibraryDirectories"
            java.lang.reflect.Field r2 = findField(r2, r4)
            r4 = 23
            r0[r4] = r3
            java.lang.Class r4 = r2.getType()
            boolean r4 = r4.isArray()
            r5 = 26
            if (r4 == 0) goto L_0x008b
            r4 = 24
            r0[r4] = r3
            java.lang.Object r2 = r2.get(r1)
            java.io.File[] r2 = (java.io.File[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            r4 = 25
            r0[r4] = r3
            goto L_0x0093
        L_0x008b:
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            r0[r5] = r3
        L_0x0093:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = 27
            r0[r6] = r3
            java.util.Iterator r2 = r2.iterator()
            r7 = 28
            r0[r7] = r3
            r7 = 1
        L_0x00a5:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00d5
            java.lang.Object r8 = r2.next()
            java.io.File r8 = (java.io.File) r8
            if (r8 != 0) goto L_0x00b8
            r8 = 29
            r0[r8] = r3
            goto L_0x00a5
        L_0x00b8:
            if (r7 == 0) goto L_0x00c0
            r7 = 30
            r0[r7] = r3
            r7 = 0
            goto L_0x00c9
        L_0x00c0:
            java.lang.String r9 = java.io.File.pathSeparator
            r4.append(r9)
            r9 = 31
            r0[r9] = r3
        L_0x00c9:
            java.lang.String r8 = r8.getAbsolutePath()
            r4.append(r8)
            r8 = 32
            r0[r8] = r3
            goto L_0x00a5
        L_0x00d5:
            java.lang.String r2 = r4.toString()
            if (r12 != 0) goto L_0x00e0
            r12 = 33
            r0[r12] = r3
            goto L_0x00e8
        L_0x00e0:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r6) goto L_0x00f2
            r12 = 34
            r0[r12] = r3
        L_0x00e8:
            com.tencent.crabshell.loader.NewClassLoaderForLowSdk r12 = new com.tencent.crabshell.loader.NewClassLoaderForLowSdk
            r12.<init>(r14, r11, r2, r10)
            r10 = 42
            r0[r10] = r3
            goto L_0x0128
        L_0x00f2:
            r11 = 35
            r0[r11] = r3
            dalvik.system.DelegateLastClassLoader r12 = new dalvik.system.DelegateLastClassLoader
            java.lang.ClassLoader r11 = java.lang.ClassLoader.getSystemClassLoader()
            r12.<init>(r14, r2, r11)
            r11 = 36
            r0[r11] = r3
            java.lang.Class<java.lang.ClassLoader> r11 = java.lang.ClassLoader.class
            java.lang.String r14 = "parent"
            java.lang.reflect.Field r11 = r11.getDeclaredField(r14)
            r14 = 37
            r0[r14] = r3
            r11.setAccessible(r3)
            if (r13 == 0) goto L_0x0119
            r10 = 38
            r0[r10] = r3
            goto L_0x0124
        L_0x0119:
            r13 = 39
            r0[r13] = r3
            r11.set(r12, r10)
            r10 = 40
            r0[r10] = r3
        L_0x0124:
            r10 = 41
            r0[r10] = r3
        L_0x0128:
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r5) goto L_0x0131
            r10 = 43
            r0[r10] = r3
            goto L_0x0146
        L_0x0131:
            r10 = 44
            r0[r10] = r3
            java.lang.Class r10 = r1.getClass()
            java.lang.String r11 = "definingContext"
            java.lang.reflect.Field r10 = findField(r10, r11)
            r10.set(r1, r12)
            r10 = 45
            r0[r10] = r3
        L_0x0146:
            java.lang.String r10 = "---createNewClassLoader--cost:"
            java.lang.StringBuilder r10 = g.a.a.a.a.i(r10)
            r11 = 46
            r0[r11] = r3
            long r13 = java.lang.System.currentTimeMillis()
            long r1 = com.tencent.crabshell.loader.ShellAllLoader.appCreateTime
            long r13 = r13 - r1
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r11 = 47
            r0[r11] = r3
            java.lang.String r11 = "crab_shell_tag"
            com.tencent.crabshell.Logger.i(r11, r10)
            r10 = 48
            r0[r10] = r3
            return r12
        L_0x016c:
            if (r4 > 0) goto L_0x0173
            r5 = 18
            r0[r5] = r3
            goto L_0x0180
        L_0x0173:
            r5 = 19
            r0[r5] = r3
            java.lang.String r5 = java.io.File.pathSeparator
            r2.append(r5)
            r5 = 20
            r0[r5] = r3
        L_0x0180:
            r5 = r14[r4]
            r2.append(r5)
            int r4 = r4 + 1
            r5 = 21
            r0[r5] = r3
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.crabshell.loader.LoadByNewClassLoader.createNewClassLoader(java.lang.ClassLoader, java.io.File, boolean, boolean, java.lang.String[]):java.lang.ClassLoader");
    }

    private static void doInject(Application application, ClassLoader classLoader) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        Thread.currentThread().setContextClassLoader(classLoader);
        $jacocoInit[49] = true;
        Context context = (Context) findField(application.getClass(), "mBase").get(application);
        try {
            $jacocoInit[50] = true;
            findField(context.getClass(), "mClassLoader").set(context, classLoader);
            $jacocoInit[51] = true;
        } catch (Throwable unused) {
            $jacocoInit[52] = true;
        }
        Object obj = findField(context.getClass(), "mPackageInfo").get(context);
        $jacocoInit[53] = true;
        findField(obj.getClass(), "mClassLoader").set(obj, classLoader);
        if (Build.VERSION.SDK_INT >= 27) {
            $jacocoInit[54] = true;
        } else {
            $jacocoInit[55] = true;
            Resources resources = application.getResources();
            try {
                $jacocoInit[56] = true;
                findField(resources.getClass(), "mClassLoader").set(resources, classLoader);
                $jacocoInit[57] = true;
                Object obj2 = findField(resources.getClass(), "mDrawableInflater").get(resources);
                if (obj2 == null) {
                    $jacocoInit[58] = true;
                } else {
                    $jacocoInit[59] = true;
                    findField(obj2.getClass(), "mClassLoader").set(obj2, classLoader);
                    $jacocoInit[60] = true;
                }
                $jacocoInit[61] = true;
            } catch (Throwable unused2) {
                $jacocoInit[62] = true;
            }
        }
        $jacocoInit[63] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Field findField(java.lang.Class<?> r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            boolean[] r0 = $jacocoInit()
            r1 = 64
            r2 = 1
            r0[r1] = r2     // Catch:{ all -> 0x000d }
            r1 = r0
            r0 = r6
            r6 = r5
            goto L_0x001c
        L_0x000d:
            r1 = r0
            r0 = r6
            r6 = r5
        L_0x0010:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r5 == r3) goto L_0x002e
            java.lang.Class r5 = r5.getSuperclass()
            r3 = 70
            r1[r3] = r2
        L_0x001c:
            java.lang.reflect.Field r3 = r5.getDeclaredField(r0)     // Catch:{ all -> 0x002c }
            r4 = 65
            r1[r4] = r2     // Catch:{ all -> 0x002c }
            r3.setAccessible(r2)     // Catch:{ all -> 0x002c }
            r5 = 66
            r1[r5] = r2
            return r3
        L_0x002c:
            goto L_0x0010
        L_0x002e:
            r5 = 67
            r1[r5] = r2
            java.lang.NoSuchFieldException r5 = new java.lang.NoSuchFieldException
            java.lang.String r3 = "Cannot find field "
            java.lang.String r4 = " in class "
            java.lang.StringBuilder r0 = g.a.a.a.a.n(r3, r0, r4)
            r3 = 68
            r1[r3] = r2
            java.lang.String r6 = r6.getName()
            r0.append(r6)
            java.lang.String r6 = " and its super classes."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            r6 = 69
            r1[r6] = r2
            goto L_0x0059
        L_0x0058:
            throw r5
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.crabshell.loader.LoadByNewClassLoader.findField(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    public static ClassLoader inject(Application application, ClassLoader classLoader, File file, boolean z, List<File> list) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        int size = list.size();
        String[] strArr = new String[size];
        $jacocoInit[0] = true;
        int i2 = 0;
        while (i2 < size) {
            $jacocoInit[1] = true;
            strArr[i2] = list.get(i2).getAbsolutePath();
            i2++;
            $jacocoInit[2] = true;
        }
        $jacocoInit[3] = true;
        ClassLoader createNewClassLoader = createNewClassLoader(classLoader, file, z, false, strArr);
        $jacocoInit[4] = true;
        doInject(application, createNewClassLoader);
        $jacocoInit[5] = true;
        return createNewClassLoader;
    }

    public static void preInject(Context context, File file, boolean z, List<File> list) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        int size = list.size();
        String[] strArr = new String[size];
        $jacocoInit[72] = true;
        int i2 = 0;
        while (i2 < size) {
            $jacocoInit[73] = true;
            strArr[i2] = list.get(i2).getAbsolutePath();
            i2++;
            $jacocoInit[74] = true;
        }
        triggerDex2Oat(context, file, z, strArr);
        $jacocoInit[75] = true;
    }

    public static void triggerDex2Oat(Context context, File file, boolean z, String... strArr) throws Throwable {
        boolean[] $jacocoInit = $jacocoInit();
        createNewClassLoader(context.getClassLoader(), file, z, true, strArr);
        $jacocoInit[6] = true;
    }
}
