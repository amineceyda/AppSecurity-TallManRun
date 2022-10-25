package g.c.a.m;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2088d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f2089e;

    public /* synthetic */ c(String str, String str2, String str3, h hVar) {
        this.b = str;
        this.c = str2;
        this.f2088d = str3;
        this.f2089e = hVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = r10.b
            java.lang.String r1 = r10.c
            java.lang.String r2 = r10.f2088d
            g.c.a.m.h r3 = r10.f2089e
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x001e
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r1)
            java.lang.String r1 = java.io.File.separator
            java.lang.String r0 = g.a.a.a.a.f(r0, r1, r2)
            goto L_0x0035
        L_0x001e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r0 = r5.getParent()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            java.lang.String r0 = g.a.a.a.a.f(r1, r0, r2)
        L_0x0035:
            boolean r1 = r4.exists()
            if (r1 != 0) goto L_0x003e
            r3.b()
        L_0x003e:
            r1 = 0
            r2 = 1
            r5 = 0
            r6 = 2
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            boolean r7 = r7.exists()     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            if (r7 == 0) goto L_0x0051
            r3.a()     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            goto L_0x0057
        L_0x0051:
            java.io.File[] r7 = r4.listFiles()     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            if (r7 != 0) goto L_0x0059
        L_0x0057:
            r7 = r1
            goto L_0x0071
        L_0x0059:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0082, all -> 0x007f }
            java.util.zip.ZipOutputStream r0 = new java.util.zip.ZipOutputStream     // Catch:{ FileNotFoundException -> 0x0083 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0083 }
            r8.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0083 }
            r0.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0083 }
            java.lang.String r1 = ""
            e.e.d.l.a.S0(r4, r1, r0)     // Catch:{ FileNotFoundException -> 0x007d, all -> 0x007b }
            r3.a()     // Catch:{ FileNotFoundException -> 0x007d, all -> 0x007b }
            r1 = r0
        L_0x0071:
            java.io.Closeable[] r0 = new java.io.Closeable[r6]
            r0[r5] = r1
            r0[r2] = r7
            e.e.d.l.a.k(r0)
            goto L_0x008e
        L_0x007b:
            r1 = move-exception
            goto L_0x0093
        L_0x007d:
            r1 = r0
            goto L_0x0083
        L_0x007f:
            r0 = move-exception
            r7 = r1
            goto L_0x0096
        L_0x0082:
            r7 = r1
        L_0x0083:
            org.slf4j.Logger r0 = g.c.a.e.e.a.a     // Catch:{ all -> 0x008f }
            java.io.Closeable[] r0 = new java.io.Closeable[r6]
            r0[r5] = r1
            r0[r2] = r7
            e.e.d.l.a.k(r0)
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0093:
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0096:
            java.io.Closeable[] r3 = new java.io.Closeable[r6]
            r3[r5] = r1
            r3[r2] = r7
            e.e.d.l.a.k(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.m.c.run():void");
    }
}
