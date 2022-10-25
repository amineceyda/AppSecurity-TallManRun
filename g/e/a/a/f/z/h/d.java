package g.e.a.a.f.z.h;

import g.e.a.a.f.p;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ u b;
    public final /* synthetic */ p c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2799d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Runnable f2800e;

    public /* synthetic */ d(u uVar, p pVar, int i2, Runnable runnable) {
        this.b = uVar;
        this.c = pVar;
        this.f2799d = i2;
        this.f2800e = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f2806d.a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            g.e.a.a.f.z.h.u r0 = r8.b
            g.e.a.a.f.p r1 = r8.c
            int r2 = r8.f2799d
            java.lang.Runnable r3 = r8.f2800e
            java.util.Objects.requireNonNull(r0)
            r4 = 1
            g.e.a.a.f.a0.a r5 = r0.f2808f     // Catch:{ SynchronizationException -> 0x0047 }
            g.e.a.a.f.z.i.a0 r6 = r0.c     // Catch:{ SynchronizationException -> 0x0047 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            g.e.a.a.f.z.h.b r7 = new g.e.a.a.f.z.h.b     // Catch:{ SynchronizationException -> 0x0047 }
            r7.<init>(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            r5.a(r7)     // Catch:{ SynchronizationException -> 0x0047 }
            android.content.Context r5 = r0.a     // Catch:{ SynchronizationException -> 0x0047 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x0047 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0041
            g.e.a.a.f.a0.a r5 = r0.f2808f     // Catch:{ SynchronizationException -> 0x0047 }
            g.e.a.a.f.z.h.k r6 = new g.e.a.a.f.z.h.k     // Catch:{ SynchronizationException -> 0x0047 }
            r6.<init>(r0, r1, r2)     // Catch:{ SynchronizationException -> 0x0047 }
            r5.a(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            goto L_0x004d
        L_0x0041:
            r0.a(r1, r2)     // Catch:{ SynchronizationException -> 0x0047 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            g.e.a.a.f.z.h.y r0 = r0.f2806d     // Catch:{ all -> 0x0045 }
            int r2 = r2 + r4
            r0.a(r1, r2)     // Catch:{ all -> 0x0045 }
        L_0x004d:
            r3.run()
            return
        L_0x0051:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.a.f.z.h.d.run():void");
    }
}
