package com.ola.qsea.p;

public class d {
    public static d a;
    public boolean b = false;

    public static d a() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.b     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003e
            if (r4 != 0) goto L_0x0008
            goto L_0x003e
        L_0x0008:
            boolean r0 = com.ola.qsea.d.a.g()     // Catch:{ all -> 0x0040 }
            r1 = 1
            if (r0 != 0) goto L_0x0013
            r3.b = r1     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return
        L_0x0013:
            java.lang.String r0 = "BuglySdkInfos"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "4ef223fde6"
            java.lang.String r2 = ""
            java.lang.String r0 = r4.getString(r0, r2)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r2 = "1.2.13"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003a
        L_0x002c:
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "4ef223fde6"
            java.lang.String r2 = "1.2.13"
            r4.putString(r0, r2)     // Catch:{ all -> 0x0040 }
            r4.commit()     // Catch:{ all -> 0x0040 }
        L_0x003a:
            r3.b = r1     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.p.d.a(android.content.Context):void");
    }
}
