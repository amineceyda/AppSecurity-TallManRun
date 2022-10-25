package g.c.b.b.m;

import android.content.Context;
import android.content.pm.PackageInstaller;
import i.c;
import i.o.c.i;
import java.io.File;
import org.slf4j.Logger;

public final class e {
    public final Context a;
    public final g.c.b.c.b.a b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final g.c.b.b.i.a f2303d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2304e;

    /* renamed from: f  reason: collision with root package name */
    public final c f2305f;

    /* renamed from: g  reason: collision with root package name */
    public final Logger f2306g;

    public static final class a extends i implements i.o.b.a<PackageInstaller> {
        public final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        public Object a() {
            return this.this$0.a.getPackageManager().getPackageInstaller();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.content.pm.PackageInstaller$Session} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.content.pm.PackageInstaller$Session} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.RuntimeException} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086 A[Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088 A[Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6 A[Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r10, g.c.b.c.b.a r11, java.io.File r12, g.c.b.b.i.a r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            i.o.c.h.e(r10, r0)
            java.lang.String r0 = "listener"
            i.o.c.h.e(r13, r0)
            r9.<init>()
            r9.a = r10
            r9.b = r11
            r9.c = r12
            r9.f2303d = r13
            r9.f2304e = r14
            g.c.b.b.m.e$a r0 = new g.c.b.b.m.e$a
            r0.<init>(r9)
            i.c r0 = g.c.b.b.f.U(r0)
            r9.f2305f = r0
            java.lang.String r1 = "SessionPackageInstallerLog"
            org.slf4j.Logger r1 = org.slf4j.LoggerFactory.getLogger((java.lang.String) r1)
            r9.f2306g = r1
            java.lang.String r2 = "SessionPackageInstaller installer"
            r1.info(r2)
            r2 = 0
            android.content.pm.PackageInstaller$SessionParams r3 = new android.content.pm.PackageInstaller$SessionParams     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            r4 = 1
            r3.<init>(r4)     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            r5 = 0
            r3.setInstallLocation(r5)     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            java.lang.Object r6 = r0.getValue()     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            android.content.pm.PackageInstaller r6 = (android.content.pm.PackageInstaller) r6     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            int r3 = r6.createSession(r3)     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            android.content.pm.PackageInstaller r0 = (android.content.pm.PackageInstaller) r0     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            android.content.pm.PackageInstaller$Session r0 = r0.openSession(r3)     // Catch:{ IOException -> 0x011c, RuntimeException -> 0x00fd }
            if (r11 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            java.util.List<g.c.b.c.b.a$a> r2 = r11.f2311g     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
        L_0x0053:
            com.apkpure.components.installer.ui.InstallApksActivity$a r3 = com.apkpure.components.installer.ui.InstallApksActivity.r     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.String r6 = "install"
            java.lang.String r7 = "position"
            i.o.c.h.e(r6, r7)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            com.apkpure.components.installer.ui.InstallApksActivity$a r6 = com.apkpure.components.installer.ui.InstallApksActivity.r     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.String r6 = "开始提取..."
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.String r6 = i.o.c.h.j(r6, r7)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            r1.debug(r6)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            if (r11 != 0) goto L_0x0078
            if (r12 == 0) goto L_0x0078
            boolean r11 = r9.a(r0)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            goto L_0x00aa
        L_0x0078:
            if (r2 == 0) goto L_0x0083
            boolean r11 = r2.isEmpty()     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            if (r11 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r11 = 0
            goto L_0x0084
        L_0x0083:
            r11 = 1
        L_0x0084:
            if (r11 == 0) goto L_0x0088
            goto L_0x0137
        L_0x0088:
            if (r2 == 0) goto L_0x0093
            boolean r11 = r2.isEmpty()     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            if (r11 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r11 = 1
            goto L_0x0095
        L_0x0093:
            r11 = 10
        L_0x0095:
            if (r11 == r4) goto L_0x00a1
            r11 = 14
            java.lang.String r12 = g.c.b.b.f.C(r11)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            r13.d(r11, r12)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            goto L_0x00a2
        L_0x00a1:
            r4 = 0
        L_0x00a2:
            if (r4 == 0) goto L_0x00a6
            goto L_0x0137
        L_0x00a6:
            boolean r11 = r9.b(r2, r0)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
        L_0x00aa:
            java.lang.String r12 = "提取结束..."
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.String r12 = i.o.c.h.j(r12, r13)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            r1.debug(r12)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            if (r14 == 0) goto L_0x00c5
            android.content.Intent r12 = new android.content.Intent     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.Class<com.apkpure.components.installer.ui.InstallApksActivity> r13 = com.apkpure.components.installer.ui.InstallApksActivity.class
            r12.<init>(r10, r13)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            goto L_0x00cc
        L_0x00c5:
            android.content.Intent r12 = new android.content.Intent     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.Class<com.apkpure.components.installer.ui.InstallReceiverActivity> r13 = com.apkpure.components.installer.ui.InstallReceiverActivity.class
            r12.<init>(r10, r13)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
        L_0x00cc:
            java.lang.String r13 = r3.a(r10)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            r12.setAction(r13)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r10, r5, r12, r5)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            android.content.IntentSender r10 = r10.getIntentSender()     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            if (r11 == 0) goto L_0x0137
            java.lang.String r11 = "SessionPackageInstaller commit session"
            r1.info(r11)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.String r11 = "开始拉起页面..."
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            java.lang.String r11 = i.o.c.h.j(r11, r12)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            r1.debug(r11)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            r0.commit(r10)     // Catch:{ IOException -> 0x00fa, RuntimeException -> 0x00f7 }
            goto L_0x0137
        L_0x00f7:
            r10 = move-exception
            r2 = r0
            goto L_0x00fe
        L_0x00fa:
            r10 = move-exception
            r2 = r0
            goto L_0x011d
        L_0x00fd:
            r10 = move-exception
        L_0x00fe:
            java.lang.String r11 = g.c.b.b.f.D(r10)
            if (r2 != 0) goto L_0x0105
            goto L_0x0108
        L_0x0105:
            r2.abandon()
        L_0x0108:
            if (r2 != 0) goto L_0x010b
            goto L_0x010e
        L_0x010b:
            r2.close()
        L_0x010e:
            g.c.b.b.i.a r12 = r9.f2303d
            r13 = 6
            r12.d(r13, r11)
            r10.printStackTrace()
            org.slf4j.Logger r11 = r9.f2306g
            java.lang.String r12 = "SessionPackageInstaller installer 2"
            goto L_0x0134
        L_0x011c:
            r10 = move-exception
        L_0x011d:
            java.lang.String r11 = g.c.b.b.f.D(r10)
            if (r2 != 0) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r2.close()
        L_0x0127:
            g.c.b.b.i.a r12 = r9.f2303d
            r13 = 5
            r12.d(r13, r11)
            r10.printStackTrace()
            org.slf4j.Logger r11 = r9.f2306g
            java.lang.String r12 = "SessionPackageInstaller installer 1"
        L_0x0134:
            r11.warn((java.lang.String) r12, (java.lang.Throwable) r10)
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.m.e.<init>(android.content.Context, g.c.b.c.b.a, java.io.File, g.c.b.b.i.a, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, g.c.b.c.b.a aVar, File file, g.c.b.b.i.a aVar2, boolean z, int i2) {
        this(context, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : file, aVar2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0111 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.pm.PackageInstaller.Session r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = 1
            r3 = 0
            java.io.File r0 = r1.c     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x000c
            r5 = r17
            goto L_0x009d
        L_0x000c:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00d8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00d8 }
            r5 = 0
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00d8 }
            r7.<init>(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r9 = r0.getName()     // Catch:{ all -> 0x00c9 }
            r10 = 0
            r12 = -1
            r8 = r17
            java.io.OutputStream r4 = r8.openWrite(r9, r10, r12)     // Catch:{ all -> 0x00c9 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ba }
            r8.<init>(r7)     // Catch:{ all -> 0x00ba }
            r9 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x00ab }
            i.o.c.n r10 = new i.o.c.n     // Catch:{ all -> 0x00ab }
            r10.<init>()     // Catch:{ all -> 0x00ab }
        L_0x0034:
            int r11 = r8.read(r9)     // Catch:{ all -> 0x00ab }
            r10.element = r11     // Catch:{ all -> 0x00ab }
            r12 = 0
            if (r11 < 0) goto L_0x008f
            r4.write(r9, r3, r11)     // Catch:{ all -> 0x00ab }
            int r11 = r10.element     // Catch:{ all -> 0x00ab }
            long r13 = (long) r11     // Catch:{ all -> 0x00ab }
            long r5 = r5 + r13
            g.c.b.b.i.a r11 = r1.f2303d     // Catch:{ all -> 0x00ab }
            float r13 = (float) r5     // Catch:{ all -> 0x00ab }
            long r14 = r0.length()     // Catch:{ all -> 0x00ab }
            float r14 = (float) r14     // Catch:{ all -> 0x00ab }
            float r13 = r13 / r14
            r14 = 2
            boolean r11 = r11.c(r13, r14)     // Catch:{ all -> 0x00ab }
            if (r11 == 0) goto L_0x0034
            r17.abandon()     // Catch:{ all -> 0x0089 }
            r17.close()     // Catch:{ all -> 0x0089 }
            g.c.b.b.i.a r0 = r1.f2303d     // Catch:{ all -> 0x0089 }
            r5 = 7
            java.lang.String r6 = g.c.b.b.f.C(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r9 = "_sessionPackage_apk"
            java.lang.String r6 = i.o.c.h.j(r6, r9)     // Catch:{ all -> 0x0089 }
            r0.d(r5, r6)     // Catch:{ all -> 0x0089 }
            g.c.b.b.f.s(r8, r12)     // Catch:{ all -> 0x0083 }
            g.c.b.b.f.s(r4, r12)     // Catch:{ all -> 0x007d }
            g.c.b.b.f.s(r7, r12)     // Catch:{ all -> 0x0077 }
            r5 = r17
            r4 = 1
            goto L_0x009e
        L_0x0077:
            r0 = move-exception
            r5 = r17
            r4 = 1
            goto L_0x00dc
        L_0x007d:
            r0 = move-exception
            r5 = r17
            r4 = r0
            r9 = 1
            goto L_0x00ce
        L_0x0083:
            r0 = move-exception
            r5 = r17
            r6 = r0
            r9 = 1
            goto L_0x00bf
        L_0x0089:
            r0 = move-exception
            r5 = r17
            r6 = r0
            r9 = 1
            goto L_0x00b0
        L_0x008f:
            r5 = r17
            r5.fsync(r4)     // Catch:{ all -> 0x00a9 }
            g.c.b.b.f.s(r8, r12)     // Catch:{ all -> 0x00a7 }
            g.c.b.b.f.s(r4, r12)     // Catch:{ all -> 0x00a5 }
            g.c.b.b.f.s(r7, r12)     // Catch:{ all -> 0x00a3 }
        L_0x009d:
            r4 = 0
        L_0x009e:
            i.j r0 = i.j.a     // Catch:{ all -> 0x00a1 }
            goto L_0x00e0
        L_0x00a1:
            r0 = move-exception
            goto L_0x00dc
        L_0x00a3:
            r0 = move-exception
            goto L_0x00db
        L_0x00a5:
            r0 = move-exception
            goto L_0x00cc
        L_0x00a7:
            r0 = move-exception
            goto L_0x00bd
        L_0x00a9:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            r5 = r17
        L_0x00ae:
            r6 = r0
            r9 = 0
        L_0x00b0:
            throw r6     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            r10 = r0
            g.c.b.b.f.s(r8, r6)     // Catch:{ all -> 0x00b7 }
            throw r10     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            r6 = r0
            goto L_0x00bf
        L_0x00ba:
            r0 = move-exception
            r5 = r17
        L_0x00bd:
            r6 = r0
            r9 = 0
        L_0x00bf:
            throw r6     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            r8 = r0
            g.c.b.b.f.s(r4, r6)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            r4 = r0
            goto L_0x00ce
        L_0x00c9:
            r0 = move-exception
            r5 = r17
        L_0x00cc:
            r4 = r0
            r9 = 0
        L_0x00ce:
            throw r4     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            r6 = r0
            g.c.b.b.f.s(r7, r4)     // Catch:{ all -> 0x00d5 }
            throw r6     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            r4 = r9
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            r5 = r17
        L_0x00db:
            r4 = 0
        L_0x00dc:
            java.lang.Object r0 = g.c.b.b.f.v(r0)
        L_0x00e0:
            java.lang.Throwable r6 = i.f.a(r0)
            if (r6 == 0) goto L_0x00f5
            java.lang.String r6 = g.c.b.b.f.D(r6)
            r17.close()
            if (r4 != 0) goto L_0x00f5
            g.c.b.b.i.a r4 = r1.f2303d
            r5 = 5
            r4.d(r5, r6)
        L_0x00f5:
            boolean r4 = r0 instanceof i.f.a
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0111
            i.j r0 = (i.j) r0
            g.c.b.b.i.a r0 = r1.f2303d
            java.io.File r3 = r1.c
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0105
            goto L_0x010d
        L_0x0105:
            java.lang.String r3 = r3.getPath()
            if (r3 != 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r4 = r3
        L_0x010d:
            r0.a(r4)
            goto L_0x0112
        L_0x0111:
            r2 = 0
        L_0x0112:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.m.e.a(android.content.pm.PackageInstaller$Session):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r22.abandon();
        r22.close();
        r1.f2303d.d(7, i.o.c.h.j(g.c.b.b.f.C(7), "_sessionPackage_apks"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        g.c.b.b.f.s(r12, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        g.c.b.b.f.s(r11, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        g.c.b.b.f.s(r10, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        r13 = r22;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r13 = r22;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r22;
        r3 = r0;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        r13 = r22;
        r3 = r0;
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r22.fsync(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        g.c.b.b.f.s(r12, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        g.c.b.b.f.s(r11, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00ff, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0133 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.util.List<g.c.b.c.b.a.C0077a> r21, android.content.pm.PackageInstaller.Session r22) {
        /*
            r20 = this;
            r1 = r20
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 16384(0x4000, float:2.2959E-41)
            r4 = 0
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0107 }
            java.util.Iterator r5 = r21.iterator()     // Catch:{ all -> 0x0105 }
            r6 = 0
            r8 = r6
        L_0x0013:
            boolean r10 = r5.hasNext()     // Catch:{ all -> 0x0105 }
            if (r10 == 0) goto L_0x0023
            java.lang.Object r10 = r5.next()     // Catch:{ all -> 0x0105 }
            g.c.b.c.b.a$a r10 = (g.c.b.c.b.a.C0077a) r10     // Catch:{ all -> 0x0105 }
            long r10 = r10.b     // Catch:{ all -> 0x0105 }
            long r8 = r8 + r10
            goto L_0x0013
        L_0x0023:
            java.util.Iterator r5 = r21.iterator()     // Catch:{ all -> 0x0107 }
        L_0x0027:
            boolean r10 = r5.hasNext()     // Catch:{ all -> 0x0107 }
            if (r10 == 0) goto L_0x0037
            java.lang.Object r10 = r5.next()     // Catch:{ all -> 0x0107 }
            g.c.b.c.b.a$a r10 = (g.c.b.c.b.a.C0077a) r10     // Catch:{ all -> 0x0107 }
            java.lang.String r12 = r10.a     // Catch:{ all -> 0x0107 }
            if (r12 != 0) goto L_0x003b
        L_0x0037:
            r13 = r22
            goto L_0x00ff
        L_0x003b:
            r2.add(r12)     // Catch:{ all -> 0x0107 }
            g.c.b.c.b.a r10 = r1.b     // Catch:{ all -> 0x0107 }
            r15 = 0
            if (r10 != 0) goto L_0x0045
            r10 = r15
            goto L_0x004d
        L_0x0045:
            i.o.b.l<java.lang.String, java.io.InputStream> r10 = r10.a     // Catch:{ all -> 0x0107 }
            java.lang.Object r10 = r10.g(r12)     // Catch:{ all -> 0x0107 }
            java.io.InputStream r10 = (java.io.InputStream) r10     // Catch:{ all -> 0x0107 }
        L_0x004d:
            if (r10 != 0) goto L_0x0050
            goto L_0x0037
        L_0x0050:
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0107 }
            r13.<init>(r10)     // Catch:{ all -> 0x0107 }
            r16 = 0
            r18 = -1
            r11 = r22
            r10 = r13
            r13 = r16
            r3 = r15
            r15 = r18
            java.io.OutputStream r11 = r11.openWrite(r12, r13, r15)     // Catch:{ all -> 0x00f3 }
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e4 }
            r12.<init>(r10)     // Catch:{ all -> 0x00e4 }
        L_0x006a:
            int r13 = r12.read(r0)     // Catch:{ all -> 0x00d5 }
            if (r13 < 0) goto L_0x00bd
            r11.write(r0, r4, r13)     // Catch:{ all -> 0x00d5 }
            long r13 = (long) r13     // Catch:{ all -> 0x00d5 }
            long r6 = r6 + r13
            g.c.b.b.i.a r13 = r1.f2303d     // Catch:{ all -> 0x00d5 }
            float r14 = (float) r6     // Catch:{ all -> 0x00d5 }
            float r15 = (float) r8     // Catch:{ all -> 0x00d5 }
            float r14 = r14 / r15
            r15 = 2
            boolean r13 = r13.c(r14, r15)     // Catch:{ all -> 0x00d5 }
            if (r13 == 0) goto L_0x006a
            r22.abandon()     // Catch:{ all -> 0x00b7 }
            r22.close()     // Catch:{ all -> 0x00b7 }
            g.c.b.b.i.a r0 = r1.f2303d     // Catch:{ all -> 0x00b7 }
            r5 = 7
            java.lang.String r6 = g.c.b.b.f.C(r5)     // Catch:{ all -> 0x00b7 }
            java.lang.String r7 = "_sessionPackage_apks"
            java.lang.String r6 = i.o.c.h.j(r6, r7)     // Catch:{ all -> 0x00b7 }
            r0.d(r5, r6)     // Catch:{ all -> 0x00b7 }
            g.c.b.b.f.s(r12, r3)     // Catch:{ all -> 0x00b1 }
            g.c.b.b.f.s(r11, r3)     // Catch:{ all -> 0x00ab }
            g.c.b.b.f.s(r10, r3)     // Catch:{ all -> 0x00a5 }
            r13 = r22
            r5 = 1
            goto L_0x0100
        L_0x00a5:
            r0 = move-exception
            r13 = r22
            r5 = 1
            goto L_0x010b
        L_0x00ab:
            r0 = move-exception
            r13 = r22
            r3 = r0
            r5 = 1
            goto L_0x00f8
        L_0x00b1:
            r0 = move-exception
            r13 = r22
            r3 = r0
            r5 = 1
            goto L_0x00e9
        L_0x00b7:
            r0 = move-exception
            r13 = r22
            r3 = r0
            r5 = 1
            goto L_0x00da
        L_0x00bd:
            r13 = r22
            r13.fsync(r11)     // Catch:{ all -> 0x00d3 }
            g.c.b.b.f.s(r12, r3)     // Catch:{ all -> 0x00d1 }
            g.c.b.b.f.s(r11, r3)     // Catch:{ all -> 0x00cf }
            g.c.b.b.f.s(r10, r3)     // Catch:{ all -> 0x00cd }
            goto L_0x0027
        L_0x00cd:
            r0 = move-exception
            goto L_0x010a
        L_0x00cf:
            r0 = move-exception
            goto L_0x00f6
        L_0x00d1:
            r0 = move-exception
            goto L_0x00e7
        L_0x00d3:
            r0 = move-exception
            goto L_0x00d8
        L_0x00d5:
            r0 = move-exception
            r13 = r22
        L_0x00d8:
            r3 = r0
            r5 = 0
        L_0x00da:
            throw r3     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            r6 = r0
            g.c.b.b.f.s(r12, r3)     // Catch:{ all -> 0x00e1 }
            throw r6     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            r3 = r0
            goto L_0x00e9
        L_0x00e4:
            r0 = move-exception
            r13 = r22
        L_0x00e7:
            r3 = r0
            r5 = 0
        L_0x00e9:
            throw r3     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            r6 = r0
            g.c.b.b.f.s(r11, r3)     // Catch:{ all -> 0x00f0 }
            throw r6     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            r3 = r0
            goto L_0x00f8
        L_0x00f3:
            r0 = move-exception
            r13 = r22
        L_0x00f6:
            r3 = r0
            r5 = 0
        L_0x00f8:
            throw r3     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            r6 = r0
            g.c.b.b.f.s(r10, r3)     // Catch:{ all -> 0x0103 }
            throw r6     // Catch:{ all -> 0x0103 }
        L_0x00ff:
            r5 = 0
        L_0x0100:
            i.j r0 = i.j.a     // Catch:{ all -> 0x0103 }
            goto L_0x010f
        L_0x0103:
            r0 = move-exception
            goto L_0x010b
        L_0x0105:
            r0 = move-exception
            goto L_0x0108
        L_0x0107:
            r0 = move-exception
        L_0x0108:
            r13 = r22
        L_0x010a:
            r5 = 0
        L_0x010b:
            java.lang.Object r0 = g.c.b.b.f.v(r0)
        L_0x010f:
            java.lang.Throwable r3 = i.f.a(r0)
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = g.c.b.b.f.D(r3)
            r22.close()
            if (r5 != 0) goto L_0x0124
            g.c.b.b.i.a r5 = r1.f2303d
            r6 = 5
            r5.d(r6, r3)
        L_0x0124:
            boolean r3 = r0 instanceof i.f.a
            r5 = 1
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0133
            i.j r0 = (i.j) r0
            g.c.b.b.i.a r0 = r1.f2303d
            r0.b(r2)
            r3 = 1
            goto L_0x0134
        L_0x0133:
            r3 = 0
        L_0x0134:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.m.e.b(java.util.List, android.content.pm.PackageInstaller$Session):boolean");
    }
}
