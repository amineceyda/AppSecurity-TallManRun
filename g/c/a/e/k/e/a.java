package g.c.a.e.k.e;

import android.text.TextUtils;
import java.io.File;

public class a {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014b, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0150, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0154, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0155, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0159, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015a, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015f, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0162, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014a A[ExcHandler: Exception (r0v21 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:14:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f A[ExcHandler: IllegalAccessException (r0v20 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:14:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0154 A[ExcHandler: InvocationTargetException (r0v19 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:14:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015e A[ExcHandler: ClassNotFoundException (r0v17 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:14:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L_0x0009
            goto L_0x0017
        L_0x0009:
            android.content.Context r1 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            int r1 = e.e.c.a.a(r1, r4)
            if (r1 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x01a7
            g.c.a.e.i.b.a$b r1 = g.c.a.e.i.b.a.c
            java.lang.String r2 = "download_position"
            java.lang.Integer r1 = r1.b(r2)
            if (r1 != 0) goto L_0x0025
            r1 = 0
            goto L_0x0029
        L_0x0025:
            int r1 = r1.intValue()
        L_0x0029:
            if (r1 != 0) goto L_0x0035
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            if (r0 != 0) goto L_0x01a6
            goto L_0x01a5
        L_0x0035:
            android.app.Application r1 = com.apkpure.aegon.application.AegonApplication.getApplication()
            java.lang.String r4 = g.c.a.e.k.d.b.a
            java.lang.String r4 = "("
            java.lang.String r5 = "storage"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.os.storage.StorageManager r1 = (android.os.storage.StorageManager) r1
            java.lang.Class r5 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r6 = "getVolumeList"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r6 = "android.os.storage.StorageVolume"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = "getPath"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.reflect.Method r7 = r6.getMethod(r7, r8)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r8 = "isRemovable"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.reflect.Method r8 = r6.getMethod(r8, r9)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r9 = 19
            if (r0 <= r9) goto L_0x0078
            java.lang.String r0 = "getState"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0074, ClassNotFoundException -> 0x015e, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.reflect.Method r0 = r6.getMethod(r0, r9)     // Catch:{ NoSuchMethodException -> 0x0074, ClassNotFoundException -> 0x015e, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            goto L_0x0079
        L_0x0074:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
        L_0x0078:
            r0 = 0
        L_0x0079:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            int r5 = java.lang.reflect.Array.getLength(r1)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r9 = 0
        L_0x0089:
            if (r9 >= r5) goto L_0x0163
            java.lang.Object r10 = java.lang.reflect.Array.get(r1, r9)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Object r11 = r7.invoke(r10, r11)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Object r12 = r8.invoke(r10, r12)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            boolean r12 = r12.booleanValue()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.Object r3 = r0.invoke(r10, r3)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            goto L_0x00b7
        L_0x00ae:
            java.io.File r3 = new java.io.File     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r3.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r3 = android.os.Environment.getStorageState(r3)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
        L_0x00b7:
            java.lang.String r10 = "mounted"
            boolean r10 = r10.equals(r3)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r13 = 0
            if (r10 == 0) goto L_0x00d2
            long r13 = g.c.a.e.k.d.b.c(r11)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            long r15 = g.c.a.e.k.d.b.b(r11)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r10 = r0
            r18 = r15
            r15 = r1
            r16 = r5
            r0 = r18
            goto L_0x00d7
        L_0x00d2:
            r10 = r0
            r15 = r1
            r16 = r5
            r0 = r13
        L_0x00d7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r17 = r7
            java.lang.String r7 = "path=="
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r11)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = " ,removable=="
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r12)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = ",state=="
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r3)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = ",total size=="
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r13)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = g.c.a.e.k.d.b.a(r13)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = "),availale size=="
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r0)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = g.c.a.e.k.d.b.a(r0)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = ")"
            r5.append(r7)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            java.lang.String r7 = g.c.a.e.k.d.b.a     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            android.util.Log.e(r7, r5)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            com.apkpure.aegon.components.utils.device.StorageBean r5 = new com.apkpure.aegon.components.utils.device.StorageBean     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.b(r0)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.f(r13)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.c(r3)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.d(r11)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r5.e(r12)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            r6.add(r5)     // Catch:{ ClassNotFoundException -> 0x015e, NoSuchMethodException -> 0x0159, InvocationTargetException -> 0x0154, IllegalAccessException -> 0x014f, Exception -> 0x014a }
            int r9 = r9 + 1
            r3 = 0
            r0 = r10
            r1 = r15
            r5 = r16
            r7 = r17
            goto L_0x0089
        L_0x014a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0162
        L_0x014f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0162
        L_0x0154:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0162
        L_0x0159:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0162
        L_0x015e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0162:
            r6 = 0
        L_0x0163:
            if (r6 != 0) goto L_0x0166
            goto L_0x01a5
        L_0x0166:
            g.c.a.e.i.b.a$b r0 = g.c.a.e.i.b.a.c
            java.lang.Integer r0 = r0.b(r2)
            if (r0 != 0) goto L_0x0170
            r0 = 0
            goto L_0x0174
        L_0x0170:
            int r0 = r0.intValue()
        L_0x0174:
            int r1 = r6.size()
            if (r1 <= r0) goto L_0x01a5
            java.lang.Object r0 = r6.get(r0)
            com.apkpure.aegon.components.utils.device.StorageBean r0 = (com.apkpure.aegon.components.utils.device.StorageBean) r0
            java.lang.String r0 = r0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x018b
            goto L_0x01a5
        L_0x018b:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/Android/data/com.apkpure.aegon/download"
            java.lang.String r0 = g.a.a.a.a.w(r0, r2)
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r1.mkdir()
            if (r0 != 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r0 = r1
            goto L_0x01a6
        L_0x01a5:
            r0 = 0
        L_0x01a6:
            return r0
        L_0x01a7:
            android.content.Context r0 = com.apkpure.aegon.application.AegonApplication.getContext()     // Catch:{ all -> 0x01b2 }
            java.lang.String r1 = "download"
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch:{ all -> 0x01b2 }
            goto L_0x01b3
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.k.e.a.a():java.io.File");
    }

    public static long b(File file) {
        long j2 = 0;
        if (!(file != null && file.exists())) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File b : listFiles) {
                j2 += b(b);
            }
        }
        return j2;
    }

    public static long c(String str) {
        boolean z = true;
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            z = false;
        }
        if (z) {
            return b(new File(str));
        }
        return 0;
    }
}
