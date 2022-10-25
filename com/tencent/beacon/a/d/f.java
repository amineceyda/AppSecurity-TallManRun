package com.tencent.beacon.a.d;

public class f implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ g b;

    public f(g gVar, Runnable runnable) {
        this.b = gVar;
        this.a = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|(2:24|25)|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 != null) goto L_0x0047;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0051 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0051=Splitter:B:26:0x0051, B:20:0x004a=Splitter:B:20:0x004a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            com.tencent.beacon.a.d.g r0 = r8.b
            monitor-enter(r0)
            r1 = 0
            com.tencent.beacon.a.d.g r2 = r8.b     // Catch:{ Exception -> 0x0016 }
            java.nio.channels.FileChannel r2 = r2.b     // Catch:{ Exception -> 0x0016 }
            java.nio.channels.FileLock r1 = r2.lock()     // Catch:{ Exception -> 0x0016 }
            java.lang.Runnable r2 = r8.a     // Catch:{ Exception -> 0x0016 }
            r2.run()     // Catch:{ Exception -> 0x0016 }
            if (r1 == 0) goto L_0x004a
            goto L_0x0047
        L_0x0016:
            r2 = move-exception
            goto L_0x001a
        L_0x0018:
            r2 = move-exception
            goto L_0x004c
        L_0x001a:
            java.lang.String r3 = "[properties]"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0018 }
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r6.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r7 = "file get lock error:"
            r6.append(r7)     // Catch:{ all -> 0x0018 }
            java.lang.String r7 = r2.getMessage()     // Catch:{ all -> 0x0018 }
            r6.append(r7)     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0018 }
            r4[r5] = r6     // Catch:{ all -> 0x0018 }
            com.tencent.beacon.base.util.c.b(r3, r4)     // Catch:{ all -> 0x0018 }
            com.tencent.beacon.a.b.g r3 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "504"
            java.lang.String r5 = "[properties] File get lock error!"
            r3.a(r4, r5, r2)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x004a
        L_0x0047:
            r1.release()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.release()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r2     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.d.f.run():void");
    }
}
