package g.e.b.l.j.h;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a {
    public final e a;
    public final Object b = new Object();
    public CountDownLatch c;

    public c(e eVar, int i2, TimeUnit timeUnit) {
        this.a = eVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        g.e.b.l.j.f.a.c("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r2.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x005c }
            r2.append(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x005c }
            r2.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005c }
            r1.e(r2)     // Catch:{ all -> 0x005c }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x005c }
            r3 = 1
            r2.<init>(r3)     // Catch:{ all -> 0x005c }
            r4.c = r2     // Catch:{ all -> 0x005c }
            g.e.b.l.j.h.e r2 = r4.a     // Catch:{ all -> 0x005c }
            g.e.b.j.a.a r2 = r2.a     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "clx"
            r2.b(r3, r5, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "Awaiting app exception callback from Analytics..."
            r1.e(r5)     // Catch:{ all -> 0x005c }
            java.util.concurrent.CountDownLatch r5 = r4.c     // Catch:{ InterruptedException -> 0x0050 }
            r6 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r6     // Catch:{ InterruptedException -> 0x0050 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0050 }
            boolean r5 = r5.await(r2, r6)     // Catch:{ InterruptedException -> 0x0050 }
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = "App exception callback received from Analytics listener."
            r1.e(r5)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0057
        L_0x004a:
            java.lang.String r5 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r1.f(r5)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            g.e.b.l.j.f r5 = g.e.b.l.j.f.a     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "Interrupted while awaiting app exception callback from Analytics listener."
            r5.c(r6)     // Catch:{ all -> 0x005c }
        L_0x0057:
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.h.c.a(java.lang.String, android.os.Bundle):void");
    }

    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
