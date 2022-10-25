package e.n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public final class a {
    public static final Set<File> a = new HashSet();
    public static final boolean b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder l2 = g.a.a.a.a.l("VM with version ", property);
        l2.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", l2.toString());
        b = z;
    }

    public static void a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field d2 = d(obj, str);
        Object[] objArr2 = (Object[]) d2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        d2.set(obj, objArr3);
    }

    public static void b(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder i2 = g.a.a.a.a.i("Clearing old secondary dex dir (");
            i2.append(file.getPath());
            i2.append(").");
            Log.i("MultiDex", i2.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder i3 = g.a.a.a.a.i("Failed to list secondary dex dir content (");
                i3.append(file.getPath());
                i3.append(").");
                Log.w("MultiDex", i3.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder i4 = g.a.a.a.a.i("Trying to delete old file ");
                i4.append(file2.getPath());
                i4.append(" of size ");
                i4.append(file2.length());
                Log.i("MultiDex", i4.toString());
                if (!file2.delete()) {
                    StringBuilder i5 = g.a.a.a.a.i("Failed to delete old file ");
                    i5.append(file2.getPath());
                    Log.w("MultiDex", i5.toString());
                } else {
                    StringBuilder i6 = g.a.a.a.a.i("Deleted old file ");
                    i6.append(file2.getPath());
                    Log.i("MultiDex", i6.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder i7 = g.a.a.a.a.i("Failed to delete secondary dex dir ");
                i7.append(file.getPath());
                Log.w("MultiDex", i7.toString());
                return;
            }
            StringBuilder i8 = g.a.a.a.a.i("Deleted old secondary dex dir ");
            i8.append(file.getPath());
            Log.i("MultiDex", i8.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00c6 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ RuntimeException -> 0x0061 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = a
            monitor-enter(r0)
            boolean r1 = r0.contains(r7)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x000b:
            r0.add(r7)     // Catch:{ all -> 0x00c7 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c7 }
            r2 = 20
            if (r1 <= r2) goto L_0x004f
            java.lang.String r3 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r4.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = "MultiDex is not guaranteed to work in SDK version "
            r4.append(r5)     // Catch:{ all -> 0x00c7 }
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = ": SDK version higher than "
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            r4.append(r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = " should be backed by "
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "case here: java.vm.version=\""
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x00c7 }
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c7 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x00c7 }
        L_0x004f:
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch:{ RuntimeException -> 0x0061 }
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x005b
            goto L_0x0068
        L_0x005b:
            java.lang.String r3 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x00c7 }
            goto L_0x0067
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r4, r3)     // Catch:{ all -> 0x00c7 }
        L_0x0067:
            r3 = r2
        L_0x0068:
            if (r3 != 0) goto L_0x006c
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x006c:
            b(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0078
        L_0x0070:
            r1 = move-exception
            java.lang.String r4 = "MultiDex"
            java.lang.String r5 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x00c7 }
        L_0x0078:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "code_cache"
            r1.<init>(r8, r4)     // Catch:{ all -> 0x00c7 }
            g(r1)     // Catch:{ IOException -> 0x0083 }
            goto L_0x008f
        L_0x0083:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c7 }
            java.io.File r8 = r6.getFilesDir()     // Catch:{ all -> 0x00c7 }
            r1.<init>(r8, r4)     // Catch:{ all -> 0x00c7 }
            g(r1)     // Catch:{ all -> 0x00c7 }
        L_0x008f:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00c7 }
            r8.<init>(r1, r9)     // Catch:{ all -> 0x00c7 }
            g(r8)     // Catch:{ all -> 0x00c7 }
            e.n.c r9 = new e.n.c     // Catch:{ all -> 0x00c7 }
            r9.<init>(r7, r8)     // Catch:{ all -> 0x00c7 }
            r7 = 0
            java.util.List r7 = r9.g(r6, r10, r7)     // Catch:{ all -> 0x00c2 }
            f(r3, r8, r7)     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00b7
        L_0x00a5:
            r7 = move-exception
            if (r11 == 0) goto L_0x00c1
            java.lang.String r11 = "MultiDex"
            java.lang.String r1 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r11, r1, r7)     // Catch:{ all -> 0x00c2 }
            r7 = 1
            java.util.List r6 = r9.g(r6, r10, r7)     // Catch:{ all -> 0x00c2 }
            f(r3, r8, r6)     // Catch:{ all -> 0x00c2 }
        L_0x00b7:
            r9.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
            r2 = move-exception
        L_0x00bc:
            if (r2 != 0) goto L_0x00c0
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return
        L_0x00c0:
            throw r2     // Catch:{ all -> 0x00c7 }
        L_0x00c1:
            throw r7     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r6 = move-exception
            r9.close()     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            throw r6     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.a.c(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    public static Field d(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder n = g.a.a.a.a.n("Field ", str, " not found in ");
        n.append(obj.getClass());
        throw new NoSuchFieldException(n.toString());
    }

    public static void e(Context context) {
        String str;
        ApplicationInfo applicationInfo;
        Log.i("MultiDex", "Installing application");
        if (b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else {
            try {
                applicationInfo = context.getApplicationInfo();
            } catch (RuntimeException e2) {
                try {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                    applicationInfo = null;
                } catch (Exception e3) {
                    Log.e("MultiDex", "MultiDex installation failure", e3);
                    StringBuilder i2 = g.a.a.a.a.i("MultiDex installation failed (");
                    i2.append(e3.getMessage());
                    i2.append(").");
                    throw new RuntimeException(i2.toString());
                }
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            c(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
            str = "install done";
        }
        Log.i("MultiDex", str);
    }

    public static void f(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            Object obj = d(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class cls = obj.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    a(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList2, file, arrayList}));
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field d2 = d(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) d2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        d2.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            StringBuilder n = g.a.a.a.a.n("Method ", "makeDexElements", " with parameters ");
            n.append(Arrays.asList(clsArr));
            n.append(" not found in ");
            n.append(obj.getClass());
            throw new NoSuchMethodException(n.toString());
        }
    }

    public static void g(File file) throws IOException {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder i2 = g.a.a.a.a.i("Failed to create dir ");
                i2.append(file.getPath());
                i2.append(". Parent file is null.");
                str = i2.toString();
            } else {
                StringBuilder i3 = g.a.a.a.a.i("Failed to create dir ");
                i3.append(file.getPath());
                i3.append(". parent file is a dir ");
                i3.append(parentFile.isDirectory());
                i3.append(", a file ");
                i3.append(parentFile.isFile());
                i3.append(", exists ");
                i3.append(parentFile.exists());
                i3.append(", readable ");
                i3.append(parentFile.canRead());
                i3.append(", writable ");
                i3.append(parentFile.canWrite());
                str = i3.toString();
            }
            Log.e("MultiDex", str);
            StringBuilder i4 = g.a.a.a.a.i("Failed to create directory ");
            i4.append(file.getPath());
            throw new IOException(i4.toString());
        }
    }
}
