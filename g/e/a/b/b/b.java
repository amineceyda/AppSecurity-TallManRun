package g.e.a.b.b;

public class b {
    public static final int a = 12451000;
    public static final b b = new b();

    static {
        boolean z = c.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00dd, code lost:
        if (g.e.a.b.b.h.e.j() == false) goto L_0x00e0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x024f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0250 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(android.content.Context r10, int r11) {
        /*
            r9 = this;
            boolean r0 = g.e.a.b.b.c.a
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ all -> 0x000d }
            r1 = 2131820813(0x7f11010d, float:1.9274352E38)
            r0.getString(r1)     // Catch:{ all -> 0x000d }
            goto L_0x0014
        L_0x000d:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0014:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r10.getPackageName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r0 = g.e.a.b.b.c.c
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x002a
            goto L_0x0077
        L_0x002a:
            java.lang.Object r0 = g.e.a.b.b.f.n.a
            monitor-enter(r0)
            boolean r2 = g.e.a.b.b.f.n.b     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            g.e.a.b.b.f.n.b = r1     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0074 }
            g.e.a.b.b.i.a r3 = g.e.a.b.b.i.b.a(r10)     // Catch:{ all -> 0x0074 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.a(r2, r4)     // Catch:{ NameNotFoundException -> 0x0055 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0055 }
            if (r2 != 0) goto L_0x0047
            goto L_0x005d
        L_0x0047:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0055 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0055 }
            g.e.a.b.b.f.n.c = r2     // Catch:{ NameNotFoundException -> 0x0055 }
            goto L_0x005d
        L_0x0055:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0074 }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            int r0 = g.e.a.b.b.f.n.c
            if (r0 == 0) goto L_0x006e
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0068
            goto L_0x0077
        L_0x0068:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r0)
            throw r10
        L_0x006e:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x0074:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r10
        L_0x0077:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.Boolean r2 = e.e.d.l.a.f1311l
            r3 = 0
            if (r2 != 0) goto L_0x009c
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 20
            if (r2 < r4) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x0095
            java.lang.String r2 = "android.hardware.type.watch"
            boolean r0 = r0.hasSystemFeature(r2)
            if (r0 == 0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            e.e.d.l.a.f1311l = r0
        L_0x009c:
            java.lang.Boolean r0 = e.e.d.l.a.f1311l
            boolean r0 = r0.booleanValue()
            r2 = 21
            if (r0 == 0) goto L_0x00e2
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 < r4) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            if (r4 == 0) goto L_0x00e0
            java.lang.Boolean r4 = e.e.d.l.a.f1312m
            if (r4 != 0) goto L_0x00d1
            if (r0 < r2) goto L_0x00b9
            r0 = 1
            goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            if (r0 == 0) goto L_0x00ca
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r4 = "cn.google"
            boolean r0 = r0.hasSystemFeature(r4)
            if (r0 == 0) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            e.e.d.l.a.f1312m = r0
        L_0x00d1:
            java.lang.Boolean r0 = e.e.d.l.a.f1312m
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e2
            boolean r0 = g.e.a.b.b.h.e.j()
            if (r0 == 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r0 = 1
            goto L_0x00e3
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            if (r0 != 0) goto L_0x0115
            java.lang.Boolean r0 = e.e.d.l.a.n
            if (r0 != 0) goto L_0x010b
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r4 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r4)
            if (r0 != 0) goto L_0x0104
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r4 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r4)
            if (r0 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r0 = 0
            goto L_0x0105
        L_0x0104:
            r0 = 1
        L_0x0105:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            e.e.d.l.a.n = r0
        L_0x010b:
            java.lang.Boolean r0 = e.e.d.l.a.n
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0115
            r0 = 1
            goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            if (r11 < 0) goto L_0x011a
            r4 = 1
            goto L_0x011b
        L_0x011a:
            r4 = 0
        L_0x011b:
            g.c.b.b.f.g(r4)
            java.lang.String r4 = r10.getPackageName()
            android.content.pm.PackageManager r5 = r10.getPackageManager()
            if (r0 == 0) goto L_0x013a
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x0131 }
            goto L_0x013b
        L_0x0131:
            java.lang.String r11 = "GooglePlayServicesUtil"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = " requires the Google Play Store, but it is missing."
            goto L_0x0185
        L_0x013a:
            r6 = 0
        L_0x013b:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x01f6 }
            g.e.a.b.b.d.a(r10)
            boolean r8 = g.e.a.b.b.d.d(r7, r1)
            if (r8 != 0) goto L_0x0155
            java.lang.String r11 = "GooglePlayServicesUtil"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = " requires Google Play services, but their signature is invalid."
            goto L_0x0185
        L_0x0155:
            if (r0 == 0) goto L_0x016b
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r6, r8)
            boolean r8 = g.e.a.b.b.d.d(r6, r1)
            if (r8 != 0) goto L_0x016b
            java.lang.String r11 = "GooglePlayServicesUtil"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0185
        L_0x016b:
            if (r0 == 0) goto L_0x0190
            if (r6 == 0) goto L_0x0190
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r3]
            android.content.pm.Signature[] r6 = r7.signatures
            r6 = r6[r3]
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0190
            java.lang.String r11 = "GooglePlayServicesUtil"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
        L_0x0185:
            java.lang.String r0 = r0.concat(r4)
            android.util.Log.w(r11, r0)
            r11 = 9
            goto L_0x0206
        L_0x0190:
            int r0 = r7.versionCode
            r6 = -1
            if (r0 != r6) goto L_0x0197
            r8 = -1
            goto L_0x0199
        L_0x0197:
            int r8 = r0 / 1000
        L_0x0199:
            if (r11 != r6) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            int r6 = r11 / 1000
        L_0x019e:
            if (r8 >= r6) goto L_0x01d2
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 82
            r6.<init>(r5)
            java.lang.String r5 = "Google Play services out of date for "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = ".  Requires "
            r6.append(r4)
            r6.append(r11)
            java.lang.String r11 = " but found "
            r6.append(r11)
            r6.append(r0)
            java.lang.String r11 = "GooglePlayServicesUtil"
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r11, r0)
            r11 = 2
            goto L_0x0206
        L_0x01d2:
            android.content.pm.ApplicationInfo r11 = r7.applicationInfo
            if (r11 != 0) goto L_0x01ee
            java.lang.String r11 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r11 = r5.getApplicationInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x01dd }
            goto L_0x01ee
        L_0x01dd:
            r11 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r4 = r4.concat(r5)
            android.util.Log.wtf(r0, r4, r11)
            goto L_0x0205
        L_0x01ee:
            boolean r11 = r11.enabled
            if (r11 != 0) goto L_0x01f4
            r11 = 3
            goto L_0x0206
        L_0x01f4:
            r11 = 0
            goto L_0x0206
        L_0x01f6:
            java.lang.String r11 = "GooglePlayServicesUtil"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = " requires Google Play services, but they are missing."
            java.lang.String r0 = r0.concat(r4)
            android.util.Log.w(r11, r0)
        L_0x0205:
            r11 = 1
        L_0x0206:
            r0 = 18
            if (r11 != r0) goto L_0x020b
            goto L_0x024d
        L_0x020b:
            if (r11 != r1) goto L_0x024c
            java.lang.String r4 = "com.google.android.gms"
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L_0x0215
            r2 = 1
            goto L_0x0216
        L_0x0215:
            r2 = 0
        L_0x0216:
            if (r2 == 0) goto L_0x023f
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ Exception -> 0x024c }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x024c }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x024c }
            java.util.Iterator r2 = r2.iterator()
        L_0x0228:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x023f
            java.lang.Object r5 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r5 = (android.content.pm.PackageInstaller.SessionInfo) r5
            java.lang.String r5 = r5.getAppPackageName()
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0228
            goto L_0x024d
        L_0x023f:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r1 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo(r4, r1)     // Catch:{  }
            boolean r1 = r10.enabled     // Catch:{  }
            goto L_0x024d
        L_0x024c:
            r1 = 0
        L_0x024d:
            if (r1 == 0) goto L_0x0250
            return r0
        L_0x0250:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.b.a(android.content.Context, int):int");
    }
}
