package f.a.a.a.n;

import f.a.a.a.c;
import f.a.a.b.x.b;
import f.a.a.b.z.m;

public class a {
    public final ClassLoader a = m.a(this);
    public final c b;

    public a(c cVar) {
        this.b = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: android.content.ContextWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: f.a.a.b.x.f} */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.content.ContextWrapper] */
    /* JADX WARNING: type inference failed for: r1v8, types: [f.a.a.b.w.d, f.a.a.a.g.a, f.a.a.b.q.a] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v19, types: [f.a.a.b.x.f] */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r6 = r1.getFilesDir();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r4 = r8.a;
        r5 = f.a.a.b.z.m.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r4 = r4.getResource(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0159, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015a, code lost:
        if (r4 == 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0161, code lost:
        if (r4 != 0) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0163, code lost:
        r4 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0168, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        b(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0170, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0150 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[SYNTHETIC, Splitter:B:53:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ff A[LOOP:0: B:64:0x00f9->B:66:0x00ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0124 A[SYNTHETIC, Splitter:B:69:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() throws ch.qos.logback.core.joran.spi.JoranException {
        /*
            r8 = this;
            f.a.a.a.c r0 = r8.b
            java.lang.String r1 = "logback.statusListenerClass"
            java.lang.String r1 = e.e.f.b.p(r1)
            boolean r2 = e.e.f.b.s(r1)
            r3 = 0
            if (r2 != 0) goto L_0x003a
            java.lang.Class<f.a.a.b.x.f> r2 = f.a.a.b.x.f.class
            java.lang.Object r1 = e.e.f.b.r(r1, r2, r0)     // Catch:{ Exception -> 0x0018 }
            f.a.a.b.x.f r1 = (f.a.a.b.x.f) r1     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r1 = move-exception
            r1.printStackTrace()
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1 instanceof f.a.a.b.w.c
            if (r2 == 0) goto L_0x0029
            r2 = r1
            f.a.a.b.w.c r2 = (f.a.a.b.w.c) r2
            r2.g(r0)
        L_0x0029:
            f.a.a.b.c r0 = r0.f1685d
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x003a
            boolean r0 = r1 instanceof f.a.a.b.w.i
            if (r0 == 0) goto L_0x003a
            f.a.a.b.w.i r1 = (f.a.a.b.w.i) r1
            r1.start()
        L_0x003a:
            r0 = 0
            java.lang.String r1 = "android.app.AppGlobals"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.String r2 = "getInitialApplication"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.Object r1 = r2.invoke(r1, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            f.a.a.a.c r2 = r8.b
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0069
            java.io.File r6 = r1.getFilesDir()
            if (r6 == 0) goto L_0x0069
            java.lang.String r6 = r6.getAbsolutePath()
            goto L_0x006a
        L_0x0069:
            r6 = r5
        L_0x006a:
            java.lang.String r7 = "DATA_DIR"
            r4.setProperty(r7, r6)
            java.lang.String r6 = android.os.Environment.getExternalStorageState()
            java.lang.String r7 = "mounted"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0086
            java.lang.String r7 = "mounted_ro"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r6 = r3
            goto L_0x0092
        L_0x0086:
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = r6.getAbsolutePath()
            goto L_0x0092
        L_0x0091:
            r6 = r5
        L_0x0092:
            if (r6 == 0) goto L_0x0099
            java.lang.String r7 = "EXT_DIR"
            r4.setProperty(r7, r6)
        L_0x0099:
            if (r1 == 0) goto L_0x00a0
            java.lang.String r6 = r1.getPackageName()
            goto L_0x00a1
        L_0x00a0:
            r6 = r5
        L_0x00a1:
            java.lang.String r7 = "PACKAGE_NAME"
            r4.setProperty(r7, r6)
            if (r1 == 0) goto L_0x00ca
            android.content.pm.PackageManager r6 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r1 == 0) goto L_0x00b3
            java.lang.String r7 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ca }
            goto L_0x00b4
        L_0x00b3:
            r7 = r5
        L_0x00b4:
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r0)     // Catch:{ NameNotFoundException -> 0x00ca }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00ca }
            r7.<init>()     // Catch:{ NameNotFoundException -> 0x00ca }
            r7.append(r5)     // Catch:{ NameNotFoundException -> 0x00ca }
            int r6 = r6.versionCode     // Catch:{ NameNotFoundException -> 0x00ca }
            r7.append(r6)     // Catch:{ NameNotFoundException -> 0x00ca }
            java.lang.String r6 = r7.toString()     // Catch:{ NameNotFoundException -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            r6 = r5
        L_0x00cb:
            java.lang.String r7 = "VERSION_CODE"
            r4.setProperty(r7, r6)
            if (r1 == 0) goto L_0x00e5
            android.content.pm.PackageManager r6 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00e5 }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00e5 }
            goto L_0x00de
        L_0x00dd:
            r1 = r5
        L_0x00de:
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00e5 }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x00e5 }
            goto L_0x00e6
        L_0x00e5:
            r1 = r5
        L_0x00e6:
            if (r1 == 0) goto L_0x00e9
            r5 = r1
        L_0x00e9:
            java.lang.String r1 = "VERSION_NAME"
            r4.setProperty(r1, r5)
            java.util.Objects.requireNonNull(r2)
            java.util.Set r1 = r4.stringPropertyNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x010f
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r4.getProperty(r5)
            java.util.Map<java.lang.String, java.lang.String> r7 = r2.f1686e
            r7.put(r5, r6)
            goto L_0x00f9
        L_0x010f:
            r2.o()
            f.a.a.a.g.a r1 = new f.a.a.a.g.a
            r1.<init>()
            f.a.a.a.c r2 = r8.b
            r1.g(r2)
            java.lang.String r2 = "logback.configurationFile"
            java.lang.String r2 = e.e.f.b.p(r2)
            if (r2 == 0) goto L_0x0171
            java.io.File r4 = new java.io.File     // Catch:{ MalformedURLException -> 0x0150 }
            r4.<init>(r2)     // Catch:{ MalformedURLException -> 0x0150 }
            boolean r5 = r4.exists()     // Catch:{ MalformedURLException -> 0x0150 }
            if (r5 == 0) goto L_0x0141
            boolean r5 = r4.isFile()     // Catch:{ MalformedURLException -> 0x0150 }
            if (r5 == 0) goto L_0x0141
            r8.b(r2, r2)     // Catch:{ MalformedURLException -> 0x0150 }
            java.net.URI r4 = r4.toURI()     // Catch:{ MalformedURLException -> 0x0150 }
            java.net.URL r4 = r4.toURL()     // Catch:{ MalformedURLException -> 0x0150 }
            goto L_0x0146
        L_0x0141:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0150 }
            r4.<init>(r2)     // Catch:{ MalformedURLException -> 0x0150 }
        L_0x0146:
            if (r4 == 0) goto L_0x0149
            goto L_0x015c
        L_0x0149:
            r5 = r3
        L_0x014a:
            r8.b(r2, r5)
            goto L_0x0172
        L_0x014e:
            r0 = move-exception
            goto L_0x016d
        L_0x0150:
            java.lang.ClassLoader r4 = r8.a     // Catch:{ all -> 0x014e }
            boolean r5 = f.a.a.b.z.m.a     // Catch:{ all -> 0x014e }
            java.net.URL r4 = r4.getResource(r2)     // Catch:{ all -> 0x0159 }
            goto L_0x015a
        L_0x0159:
            r4 = r3
        L_0x015a:
            if (r4 == 0) goto L_0x0161
        L_0x015c:
            java.lang.String r5 = r4.toString()
            goto L_0x014a
        L_0x0161:
            if (r4 == 0) goto L_0x0168
            java.lang.String r4 = r4.toString()
            goto L_0x0169
        L_0x0168:
            r4 = r3
        L_0x0169:
            r8.b(r2, r4)
            goto L_0x0171
        L_0x016d:
            r8.b(r2, r3)
            throw r0
        L_0x0171:
            r4 = r3
        L_0x0172:
            if (r4 == 0) goto L_0x0178
            r1.x(r4)
            r0 = 1
        L_0x0178:
            if (r0 != 0) goto L_0x018d
            java.lang.ClassLoader r0 = r8.a
            java.lang.String r2 = "assets/logback.xml"
            java.net.URL r0 = r0.getResource(r2)
            if (r0 == 0) goto L_0x0185
            r3 = r2
        L_0x0185:
            r8.b(r2, r3)
            if (r0 == 0) goto L_0x018d
            r1.x(r0)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.n.a.a():void");
    }

    public final void b(String str, String str2) {
        f.a.a.b.c cVar = this.b.f1685d;
        if (str2 == null) {
            cVar.a(new b(g.a.a.a.a.c("Could NOT find resource [", str, "]"), this.b));
        } else {
            cVar.a(new b(g.a.a.a.a.d("Found resource [", str, "] at [", str2, "]"), this.b));
        }
    }
}
