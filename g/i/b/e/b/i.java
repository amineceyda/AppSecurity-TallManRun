package g.i.b.e.b;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class i {

    public static class a implements Runnable {
        public final /* synthetic */ boolean[] b;
        public final /* synthetic */ CountDownLatch c;

        public a(boolean[] zArr, CountDownLatch countDownLatch) {
            this.b = zArr;
            this.c = countDownLatch;
        }

        public final void run() {
            try {
                this.b[0] = i.b();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.c.countDown();
        }
    }

    public static boolean a() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        f.a().a.execute(new a(zArr, countDownLatch));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return zArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[SYNTHETIC, Splitter:B:15:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b() {
        /*
            java.lang.String r0 = "info.3g.qq.com"
            r1 = 0
            java.net.Socket r2 = new java.net.Socket     // Catch:{ all -> 0x0024 }
            r2.<init>()     // Catch:{ all -> 0x0024 }
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0021 }
            r3 = 80
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0021 }
            r0 = 5000(0x1388, float:7.006E-42)
            r2.connect(r1, r0)     // Catch:{ all -> 0x0021 }
            boolean r0 = r2.isConnected()     // Catch:{ all -> 0x0021 }
            r2.close()     // Catch:{ all -> 0x001c }
            goto L_0x0033
        L_0x001c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0033
        L_0x0021:
            r0 = move-exception
            r1 = r2
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            r0.printStackTrace()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ all -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0032:
            r0 = 0
        L_0x0033:
            return r0
        L_0x0034:
            r0 = move-exception
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r1 = move-exception
            r1.printStackTrace()
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.i.b():boolean");
    }
}
