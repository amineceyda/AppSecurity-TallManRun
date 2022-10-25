package g.e.a.b.f.b;

import g.e.a.b.e.c.gb;
import java.util.List;
import java.util.Objects;

public final class w2 extends w3 {
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f3368d;

    /* renamed from: e  reason: collision with root package name */
    public int f3369e;

    /* renamed from: f  reason: collision with root package name */
    public String f3370f;

    /* renamed from: g  reason: collision with root package name */
    public long f3371g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3372h;

    /* renamed from: i  reason: collision with root package name */
    public List f3373i;

    /* renamed from: j  reason: collision with root package name */
    public int f3374j;

    /* renamed from: k  reason: collision with root package name */
    public String f3375k;

    /* renamed from: l  reason: collision with root package name */
    public String f3376l;

    public w2(n4 n4Var, long j2) {
        super(n4Var);
        this.f3372h = j2;
    }

    public final boolean k() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110 A[Catch:{ IllegalStateException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119 A[Catch:{ IllegalStateException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148 A[Catch:{ IllegalStateException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ad A[SYNTHETIC, Splitter:B:81:0x01ad] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020d  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r11 = this;
            g.e.a.b.f.b.n4 r0 = r11.a
            android.content.Context r0 = r0.a
            java.lang.String r0 = r0.getPackageName()
            g.e.a.b.f.b.n4 r1 = r11.a
            android.content.Context r1 = r1.a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            java.lang.String r3 = "unknown"
            java.lang.String r4 = "Unknown"
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x002d
            g.e.a.b.f.b.n4 r7 = r11.a
            g.e.a.b.f.b.f3 r7 = r7.d()
            g.e.a.b.f.b.d3 r7 = r7.f3136f
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r3 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            g.e.a.b.f.b.n4 r7 = r11.a
            g.e.a.b.f.b.f3 r7 = r7.d()
            g.e.a.b.f.b.d3 r7 = r7.f3136f
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0043:
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x0051
            r3 = r6
        L_0x0051:
            g.e.a.b.f.b.n4 r7 = r11.a     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.Context r7 = r7.a     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r4
        L_0x0071:
            java.lang.String r4 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r5 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r4
            r4 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r4
        L_0x007a:
            g.e.a.b.f.b.n4 r8 = r11.a
            g.e.a.b.f.b.f3 r8 = r8.d()
            g.e.a.b.f.b.d3 r8 = r8.f3136f
            java.lang.Object r9 = g.e.a.b.f.b.f3.t(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r4)
            r4 = r7
        L_0x008c:
            r11.c = r0
            r11.f3370f = r3
            r11.f3368d = r4
            r11.f3369e = r5
            r3 = 0
            r11.f3371g = r3
            g.e.a.b.f.b.n4 r3 = r11.a
            java.lang.String r3 = r3.b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 1
            if (r3 != 0) goto L_0x00b1
            g.e.a.b.f.b.n4 r3 = r11.a
            java.lang.String r3 = r3.c
            java.lang.String r5 = "am"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = 1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            g.e.a.b.f.b.n4 r5 = r11.a
            int r5 = r5.m()
            g.e.a.b.f.b.n4 r7 = r11.a
            g.e.a.b.f.b.f3 r7 = r7.d()
            switch(r5) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00ea
        L_0x00c2:
            g.e.a.b.f.b.d3 r7 = r7.f3142l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x00ee
        L_0x00c7:
            g.e.a.b.f.b.d3 r7 = r7.f3141k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x00ee
        L_0x00cc:
            g.e.a.b.f.b.d3 r7 = r7.n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x00ee
        L_0x00d1:
            g.e.a.b.f.b.d3 r7 = r7.f3142l
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x00ee
        L_0x00d6:
            g.e.a.b.f.b.d3 r7 = r7.f3142l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x00ee
        L_0x00db:
            g.e.a.b.f.b.d3 r7 = r7.n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x00ee
        L_0x00e0:
            g.e.a.b.f.b.d3 r7 = r7.f3142l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x00ee
        L_0x00e5:
            g.e.a.b.f.b.d3 r7 = r7.n
            java.lang.String r8 = "App measurement collection enabled"
            goto L_0x00ee
        L_0x00ea:
            g.e.a.b.f.b.d3 r7 = r7.f3142l
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
        L_0x00ee:
            r7.a(r8)
            r11.f3375k = r6
            r11.f3376l = r6
            g.e.a.b.f.b.n4 r7 = r11.a
            g.e.a.b.f.b.b r8 = r7.f3257f
            if (r3 == 0) goto L_0x00ff
            java.lang.String r3 = r7.b
            r11.f3376l = r3
        L_0x00ff:
            r3 = 0
            android.content.Context r8 = r7.a     // Catch:{ IllegalStateException -> 0x0165 }
            java.lang.String r7 = r7.s     // Catch:{ IllegalStateException -> 0x0165 }
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = g.e.a.b.f.b.x6.b(r8, r9, r7)     // Catch:{ IllegalStateException -> 0x0165 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0165 }
            if (r4 == r8) goto L_0x0111
            r6 = r7
        L_0x0111:
            r11.f3375k = r6     // Catch:{ IllegalStateException -> 0x0165 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0165 }
            if (r4 != 0) goto L_0x0146
            g.e.a.b.f.b.n4 r4 = r11.a     // Catch:{ IllegalStateException -> 0x0165 }
            android.content.Context r6 = r4.a     // Catch:{ IllegalStateException -> 0x0165 }
            java.lang.String r4 = r4.s     // Catch:{ IllegalStateException -> 0x0165 }
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)     // Catch:{ IllegalStateException -> 0x0165 }
            android.content.res.Resources r7 = r6.getResources()     // Catch:{ IllegalStateException -> 0x0165 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x0165 }
            if (r8 != 0) goto L_0x012f
            goto L_0x0133
        L_0x012f:
            java.lang.String r4 = g.e.a.b.b.h.e.y(r6)     // Catch:{ IllegalStateException -> 0x0165 }
        L_0x0133:
            java.lang.String r6 = "admob_app_id"
            java.lang.String r8 = "string"
            int r4 = r7.getIdentifier(r6, r8, r4)     // Catch:{ IllegalStateException -> 0x0165 }
            if (r4 != 0) goto L_0x013e
            goto L_0x0143
        L_0x013e:
            java.lang.String r4 = r7.getString(r4)     // Catch:{ NotFoundException -> 0x0143 }
            goto L_0x0144
        L_0x0143:
            r4 = r3
        L_0x0144:
            r11.f3376l = r4     // Catch:{ IllegalStateException -> 0x0165 }
        L_0x0146:
            if (r5 != 0) goto L_0x0177
            g.e.a.b.f.b.n4 r4 = r11.a     // Catch:{ IllegalStateException -> 0x0165 }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ IllegalStateException -> 0x0165 }
            g.e.a.b.f.b.d3 r4 = r4.n     // Catch:{ IllegalStateException -> 0x0165 }
            java.lang.String r5 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.c     // Catch:{ IllegalStateException -> 0x0165 }
            java.lang.String r7 = r11.f3375k     // Catch:{ IllegalStateException -> 0x0165 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0165 }
            if (r7 == 0) goto L_0x015f
            java.lang.String r7 = r11.f3376l     // Catch:{ IllegalStateException -> 0x0165 }
            goto L_0x0161
        L_0x015f:
            java.lang.String r7 = r11.f3375k     // Catch:{ IllegalStateException -> 0x0165 }
        L_0x0161:
            r4.c(r5, r6, r7)     // Catch:{ IllegalStateException -> 0x0165 }
            goto L_0x0177
        L_0x0165:
            r4 = move-exception
            g.e.a.b.f.b.n4 r5 = r11.a
            g.e.a.b.f.b.f3 r5 = r5.d()
            g.e.a.b.f.b.d3 r5 = r5.f3136f
            java.lang.Object r0 = g.e.a.b.f.b.f3.t(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r5.c(r6, r0, r4)
        L_0x0177:
            r11.f3373i = r3
            g.e.a.b.f.b.n4 r0 = r11.a
            g.e.a.b.f.b.b r4 = r0.f3257f
            g.e.a.b.f.b.f r0 = r0.f3258g
            java.util.Objects.requireNonNull(r0)
            java.lang.String r4 = "analytics.safelisted_events"
            g.c.b.b.f.k(r4)
            android.os.Bundle r5 = r0.r()
            if (r5 != 0) goto L_0x019b
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.f3136f
            java.lang.String r5 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r5)
            goto L_0x01a1
        L_0x019b:
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L_0x01a3
        L_0x01a1:
            r4 = r3
            goto L_0x01ab
        L_0x01a3:
            int r4 = r5.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x01ab:
            if (r4 == 0) goto L_0x01d3
            g.e.a.b.f.b.n4 r5 = r0.a     // Catch:{ NotFoundException -> 0x01c5 }
            android.content.Context r5 = r5.a     // Catch:{ NotFoundException -> 0x01c5 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NotFoundException -> 0x01c5 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x01c5 }
            java.lang.String[] r4 = r5.getStringArray(r4)     // Catch:{ NotFoundException -> 0x01c5 }
            if (r4 != 0) goto L_0x01c0
            goto L_0x01d3
        L_0x01c0:
            java.util.List r3 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x01c5 }
            goto L_0x01d3
        L_0x01c5:
            r4 = move-exception
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.String r5 = "Failed to load string array from metadata: resource not found"
            r0.b(r5, r4)
        L_0x01d3:
            if (r3 != 0) goto L_0x01d6
            goto L_0x0209
        L_0x01d6:
            int r0 = r3.size()
            if (r0 != 0) goto L_0x01ea
            g.e.a.b.f.b.n4 r0 = r11.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3141k
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r0.a(r3)
            goto L_0x020b
        L_0x01ea:
            java.util.Iterator r0 = r3.iterator()
        L_0x01ee:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0209
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            g.e.a.b.f.b.n4 r5 = r11.a
            g.e.a.b.f.b.q9 r5 = r5.A()
            java.lang.String r6 = "safelisted event"
            boolean r4 = r5.O(r6, r4)
            if (r4 != 0) goto L_0x01ee
            goto L_0x020b
        L_0x0209:
            r11.f3373i = r3
        L_0x020b:
            if (r1 == 0) goto L_0x0218
            g.e.a.b.f.b.n4 r0 = r11.a
            android.content.Context r0 = r0.a
            boolean r0 = g.e.a.b.b.h.e.l(r0)
            r11.f3374j = r0
            return
        L_0x0218:
            r11.f3374j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.w2.l():void");
    }

    public final String m() {
        i();
        Objects.requireNonNull(this.c, "null reference");
        return this.c;
    }

    public final String n() {
        gb.c.c().c();
        if (this.a.f3258g.u((String) null, s2.j0)) {
            h();
        }
        i();
        Objects.requireNonNull(this.f3375k, "null reference");
        return this.f3375k;
    }
}
