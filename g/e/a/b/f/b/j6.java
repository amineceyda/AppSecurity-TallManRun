package g.e.a.b.f.b;

import java.util.concurrent.atomic.AtomicReference;

public final class j6 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ q6 c;

    public j6(q6 q6Var, AtomicReference atomicReference) {
        this.c = q6Var;
        this.b = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|(1:5)(2:6|(6:8|9|13|14|15|16))|11|12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.b
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.b     // Catch:{ all -> 0x003e }
            g.e.a.b.f.b.q6 r2 = r7.c     // Catch:{ all -> 0x003e }
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ all -> 0x003e }
            g.e.a.b.f.b.f r3 = r2.f3258g     // Catch:{ all -> 0x003e }
            g.e.a.b.f.b.w2 r2 = r2.q()     // Catch:{ all -> 0x003e }
            java.lang.String r2 = r2.m()     // Catch:{ all -> 0x003e }
            g.e.a.b.f.b.r2 r4 = g.e.a.b.f.b.s2.O     // Catch:{ all -> 0x003e }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x003e }
            r5 = 0
            if (r2 != 0) goto L_0x001c
            goto L_0x0040
        L_0x001c:
            g.e.a.b.f.b.e r3 = r3.c     // Catch:{ all -> 0x003e }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x003e }
            java.lang.String r2 = r3.a(r2, r6)     // Catch:{ all -> 0x003e }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x003e }
            if (r3 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0040 }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0040 }
            java.lang.Object r2 = r4.a(r2)     // Catch:{ NumberFormatException -> 0x0040 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ NumberFormatException -> 0x0040 }
            double r2 = r2.doubleValue()     // Catch:{ NumberFormatException -> 0x0040 }
            goto L_0x004a
        L_0x003e:
            r1 = move-exception
            goto L_0x0058
        L_0x0040:
            java.lang.Object r2 = r4.a(r5)     // Catch:{ all -> 0x003e }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x003e }
            double r2 = r2.doubleValue()     // Catch:{ all -> 0x003e }
        L_0x004a:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x003e }
            r1.set(r2)     // Catch:{ all -> 0x003e }
            java.util.concurrent.atomic.AtomicReference r1 = r7.b     // Catch:{ all -> 0x005e }
            r1.notify()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0058:
            java.util.concurrent.atomic.AtomicReference r2 = r7.b     // Catch:{ all -> 0x005e }
            r2.notify()     // Catch:{ all -> 0x005e }
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.j6.run():void");
    }
}
