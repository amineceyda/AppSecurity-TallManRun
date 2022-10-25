package g.e.a.b.e.c;

import android.content.Context;

public final /* synthetic */ class q5 implements c6 {
    public final /* synthetic */ Context b;

    public /* synthetic */ q5(Context context) {
        this.b = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x014c */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[Catch:{ RuntimeException -> 0x0064, all -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0154 A[Catch:{ RuntimeException -> 0x0064, all -> 0x015a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c() {
        /*
            r14 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r14.b
            java.lang.Object r2 = g.e.a.b.e.c.x5.f3080f
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0030
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            g.e.a.b.e.c.z5 r0 = g.e.a.b.e.c.z5.b
            goto L_0x0159
        L_0x0030:
            boolean r2 = g.e.a.b.e.c.c5.a()
            if (r2 == 0) goto L_0x0040
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L_0x0040
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L_0x0040:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x015a }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x0064 }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x0064 }
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x0064 }
            boolean r1 = r4.exists()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x0061
            g.e.a.b.e.c.b6 r1 = new g.e.a.b.e.c.b6     // Catch:{ all -> 0x015a }
            r1.<init>(r4)     // Catch:{ all -> 0x015a }
            goto L_0x006b
        L_0x0061:
            g.e.a.b.e.c.z5 r1 = g.e.a.b.e.c.z5.b     // Catch:{ all -> 0x015a }
            goto L_0x006b
        L_0x0064:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x015a }
            goto L_0x0061
        L_0x006b:
            boolean r4 = r1.b()     // Catch:{ all -> 0x015a }
            if (r4 == 0) goto L_0x0154
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x015a }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x015a }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x014d }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x014d }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014d }
            r6.<init>(r1)     // Catch:{ IOException -> 0x014d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x014d }
            r4.<init>(r5)     // Catch:{ IOException -> 0x014d }
            r5 = 1
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0131 }
            r6.<init>()     // Catch:{ all -> 0x0131 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0131 }
            r7.<init>()     // Catch:{ all -> 0x0131 }
        L_0x0091:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x0131 }
            if (r8 == 0) goto L_0x0104
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x0131 }
            int r11 = r9.length     // Catch:{ all -> 0x0131 }
            if (r11 == r10) goto L_0x00b7
            java.lang.String r9 = "Invalid: "
            int r10 = r8.length()     // Catch:{ all -> 0x0131 }
            if (r10 == 0) goto L_0x00ae
            java.lang.String r8 = r9.concat(r8)     // Catch:{ all -> 0x0131 }
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0131 }
            r8.<init>(r9)     // Catch:{ all -> 0x0131 }
        L_0x00b3:
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x0131 }
            goto L_0x0091
        L_0x00b7:
            r8 = r9[r3]     // Catch:{ all -> 0x0131 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0131 }
            r10.<init>(r8)     // Catch:{ all -> 0x0131 }
            r8 = r9[r5]     // Catch:{ all -> 0x0131 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0131 }
            r11.<init>(r8)     // Catch:{ all -> 0x0131 }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0131 }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x0131 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x0131 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0131 }
            if (r12 != 0) goto L_0x00ec
            r9 = r9[r11]     // Catch:{ all -> 0x0131 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0131 }
            r11.<init>(r9)     // Catch:{ all -> 0x0131 }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0131 }
            int r9 = r12.length()     // Catch:{ all -> 0x0131 }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00e9
            if (r12 != r11) goto L_0x00ec
        L_0x00e9:
            r7.put(r11, r12)     // Catch:{ all -> 0x0131 }
        L_0x00ec:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x0131 }
            if (r9 != 0) goto L_0x00fa
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0131 }
            r9.<init>()     // Catch:{ all -> 0x0131 }
            r6.put(r10, r9)     // Catch:{ all -> 0x0131 }
        L_0x00fa:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x0131 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x0131 }
            r9.put(r8, r12)     // Catch:{ all -> 0x0131 }
            goto L_0x0091
        L_0x0104:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0131 }
            int r7 = r1.length()     // Catch:{ all -> 0x0131 }
            int r7 = r7 + 7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0131 }
            r8.<init>(r7)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = "Parsed "
            r8.append(r7)     // Catch:{ all -> 0x0131 }
            r8.append(r1)     // Catch:{ all -> 0x0131 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x0131 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0131 }
            g.e.a.b.e.c.n5 r0 = new g.e.a.b.e.c.n5     // Catch:{ all -> 0x0131 }
            r0.<init>(r6)     // Catch:{ all -> 0x0131 }
            r4.close()     // Catch:{ IOException -> 0x014d }
            g.e.a.b.e.c.b6 r1 = new g.e.a.b.e.c.b6     // Catch:{ all -> 0x015a }
            r1.<init>(r0)     // Catch:{ all -> 0x015a }
            r0 = r1
            goto L_0x0156
        L_0x0131:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0136 }
            goto L_0x014c
        L_0x0136:
            r1 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x014c }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r4[r3] = r6     // Catch:{ Exception -> 0x014c }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x014c }
            r5[r3] = r1     // Catch:{ Exception -> 0x014c }
            r4.invoke(r0, r5)     // Catch:{ Exception -> 0x014c }
        L_0x014c:
            throw r0     // Catch:{ IOException -> 0x014d }
        L_0x014d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x015a }
            r1.<init>(r0)     // Catch:{ all -> 0x015a }
            throw r1     // Catch:{ all -> 0x015a }
        L_0x0154:
            g.e.a.b.e.c.z5 r0 = g.e.a.b.e.c.z5.b     // Catch:{ all -> 0x015a }
        L_0x0156:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x0159:
            return r0
        L_0x015a:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            goto L_0x0160
        L_0x015f:
            throw r0
        L_0x0160:
            goto L_0x015f
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.q5.c():java.lang.Object");
    }
}
