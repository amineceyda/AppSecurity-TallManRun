package g.c.b.b;

import android.content.Context;
import g.c.b.b.i.c;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ c c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.c.b.b.j.b f2223d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c f2224e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f2225f;

    public /* synthetic */ b(Context context, c cVar, g.c.b.b.j.b bVar, c cVar2, boolean z) {
        this.b = context;
        this.c = cVar;
        this.f2223d = bVar;
        this.f2224e = cVar2;
        this.f2225f = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: int} */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: type inference failed for: r15v12 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v18 */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        if (r9.x(r12) != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a4, code lost:
        r0 = th;
        r15 = r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:58:0x0174, B:61:0x0179] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            android.content.Context r8 = r1.b
            g.c.b.b.c r9 = r1.c
            g.c.b.b.j.b r10 = r1.f2223d
            g.c.b.b.i.c r0 = r1.f2224e
            boolean r11 = r1.f2225f
            java.lang.String r2 = "$context"
            i.o.c.h.e(r8, r2)
            java.lang.String r2 = "this$0"
            i.o.c.h.e(r9, r2)
            java.lang.String r2 = "$mOptions"
            i.o.c.h.e(r10, r2)
            java.lang.String r2 = "$installListener"
            i.o.c.h.e(r0, r2)
            java.lang.String r2 = r9.a
            r3 = 0
            g.c.b.b.l.g r2 = g.c.b.b.l.g.b(r8, r2, r3)
            java.lang.String r4 = r9.b
            android.content.SharedPreferences r2 = r2.a
            r5 = -1
            long r4 = r2.getLong(r4, r5)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            r2 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x005d
            java.lang.String r4 = "ctx"
            i.o.c.h.e(r8, r4)
            java.lang.String r4 = android.os.Environment.getExternalStorageState()
            java.lang.String r5 = "mounted"
            boolean r4 = i.o.c.h.a(r4, r5)
            if (r4 == 0) goto L_0x005d
            java.io.File r4 = new java.io.File
            java.io.File r5 = r8.getExternalFilesDir(r2)
            java.lang.String r6 = "Installer"
            r4.<init>(r5, r6)
            g.c.b.b.l.d.b(r4)
        L_0x005d:
            android.view.View r4 = r10.f2281f
            if (r4 == 0) goto L_0x0064
            r0.h(r4)
        L_0x0064:
            java.lang.String r4 = r9.f2231h
            java.lang.String r4 = g.c.b.b.f.u0(r4)
            java.lang.String r5 = ".apk"
            boolean r5 = i.o.c.h.a(r4, r5)
            if (r5 == 0) goto L_0x0079
            java.lang.String r0 = r9.f2231h
            r9.i(r8, r0, r10, r11)
            goto L_0x0221
        L_0x0079:
            java.lang.String r5 = ".xapk"
            boolean r4 = i.o.c.h.a(r4, r5)
            if (r4 == 0) goto L_0x01f7
            org.slf4j.Logger r0 = g.c.b.b.c.n
            java.lang.String r4 = "installAPK context: "
            java.lang.String r4 = i.o.c.h.j(r4, r8)
            r0.info(r4)
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r9.f2231h
            r0.<init>(r4)
            boolean r0 = r0.exists()
            java.lang.String r4 = "installListener"
            if (r0 != 0) goto L_0x00cd
            g.c.b.b.i.c r0 = r9.c
            if (r0 == 0) goto L_0x00c9
            g.c.b.b.j.a r5 = new g.c.b.b.j.a
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            java.lang.String r6 = r9.f2231h
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.util.Map<java.lang.String, java.lang.String> r7 = r10.f2286k
            r25 = 1007(0x3ef, float:1.411E-42)
            r12 = r5
            r18 = r6
            r24 = r7
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = 8
            java.lang.String r7 = g.c.b.b.f.C(r6)
            r0.j(r5, r6, r7)
            goto L_0x00cd
        L_0x00c9:
            i.o.c.h.k(r4)
            throw r2
        L_0x00cd:
            g.c.b.c.b.b r0 = g.c.b.c.b.b.a
            java.lang.String r5 = r9.f2231h
            g.c.b.c.b.a r12 = r0.c(r8, r5)
            r9.f2229f = r12
            r13 = 1
            if (r12 != 0) goto L_0x010a
            g.c.b.b.i.c r0 = r9.c
            if (r0 == 0) goto L_0x0106
            g.c.b.b.j.a r2 = new g.c.b.b.j.a
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            java.lang.String r3 = r9.f2231h
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 2031(0x7ef, float:2.846E-42)
            r14 = r2
            r20 = r3
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r3 = g.c.b.b.f.C(r13)
            r0.j(r2, r13, r3)
            goto L_0x0221
        L_0x0106:
            i.o.c.h.k(r4)
            throw r2
        L_0x010a:
            g.c.b.b.j.a r14 = r9.c(r12, r10)
            g.c.b.b.i.c r0 = r9.c
            if (r0 == 0) goto L_0x01f3
            r0.a(r14)
            r0 = 3
            r2 = 2
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch:{ all -> 0x01a6 }
            java.lang.String r5 = r12.b     // Catch:{ all -> 0x01a6 }
            if (r5 != 0) goto L_0x0121
            goto L_0x0221
        L_0x0121:
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r5, r3)     // Catch:{ all -> 0x01a6 }
            boolean r4 = r10.f2283h     // Catch:{ all -> 0x01a6 }
            if (r4 == 0) goto L_0x014c
            java.lang.String r4 = r12.f2310f     // Catch:{ all -> 0x01a6 }
            if (r4 == 0) goto L_0x014c
            i.o.c.h.c(r4)     // Catch:{ all -> 0x01a6 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x01a6 }
            long r4 = (long) r4     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = "pi"
            i.o.c.h.d(r3, r6)     // Catch:{ all -> 0x01a6 }
            long r6 = r9.f(r3)     // Catch:{ all -> 0x01a6 }
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x014c
            java.lang.String r0 = r12.b     // Catch:{ all -> 0x01a6 }
            if (r0 != 0) goto L_0x0148
            goto L_0x0221
        L_0x0148:
            r9.v(r8, r0, r14)     // Catch:{ all -> 0x01a6 }
            goto L_0x0164
        L_0x014c:
            int r3 = r10.b     // Catch:{ all -> 0x01a6 }
            if (r3 == r13) goto L_0x0197
            if (r3 == r2) goto L_0x018c
            if (r3 == r0) goto L_0x0167
            boolean r0 = r9.w(r12)     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x015b
            goto L_0x016d
        L_0x015b:
            boolean r0 = r9.x(r12)     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0164
            r0 = 2
            r15 = 2
            goto L_0x0180
        L_0x0164:
            r0 = 2
            r15 = 2
            goto L_0x01a1
        L_0x0167:
            boolean r0 = r9.w(r12)     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x0178
        L_0x016d:
            r15 = 2
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.j(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a1
        L_0x0178:
            r2 = 2
            boolean r0 = r9.x(r12)     // Catch:{ all -> 0x018a }
            r15 = 2
            if (r0 == 0) goto L_0x01a1
        L_0x0180:
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.k(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a1
        L_0x018a:
            r0 = move-exception
            goto L_0x01a8
        L_0x018c:
            r15 = 2
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.k(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a1
        L_0x0197:
            r15 = 2
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.j(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01a4 }
        L_0x01a1:
            i.j r0 = i.j.a     // Catch:{ all -> 0x01a4 }
            goto L_0x01ad
        L_0x01a4:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a6:
            r0 = move-exception
            r2 = 2
        L_0x01a8:
            r15 = 2
        L_0x01a9:
            java.lang.Object r0 = g.c.b.b.f.v(r0)
        L_0x01ad:
            java.lang.Throwable r0 = i.f.a(r0)
            if (r0 == 0) goto L_0x0221
            int r0 = r10.b
            if (r0 == r13) goto L_0x01e9
            if (r0 == r15) goto L_0x01df
            r2 = 3
            if (r0 == r2) goto L_0x01be
            goto L_0x0221
        L_0x01be:
            boolean r0 = r9.w(r12)
            if (r0 == 0) goto L_0x01cf
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.j(r3, r4, r5, r6, r7)
            goto L_0x0221
        L_0x01cf:
            boolean r0 = r9.x(r12)
            if (r0 == 0) goto L_0x0221
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.k(r3, r4, r5, r6, r7)
            goto L_0x0221
        L_0x01df:
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.k(r3, r4, r5, r6, r7)
            goto L_0x0221
        L_0x01e9:
            r2 = r9
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r11
            r2.j(r3, r4, r5, r6, r7)
            goto L_0x0221
        L_0x01f3:
            i.o.c.h.k(r4)
            throw r2
        L_0x01f7:
            g.c.b.b.j.a r2 = new g.c.b.b.j.a
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            java.lang.String r3 = r9.f2231h
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            java.util.Map<java.lang.String, java.lang.String> r4 = r10.f2286k
            r28 = 1007(0x3ef, float:1.411E-42)
            r15 = r2
            r21 = r3
            r27 = r4
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = -1
            java.lang.String r4 = g.c.b.b.f.C(r3)
            r0.j(r2, r3, r4)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.b.run():void");
    }
}
