package g.e.a.b.d;

import android.util.Log;

public final class b {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (a == null) {
                a = b();
            }
            classLoader = a;
        }
        return classLoader;
    }

    public static synchronized ClassLoader b() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                b = c();
                if (b == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.Thread c() {
        /*
            java.lang.Class<g.e.a.b.d.b> r0 = g.e.a.b.d.b.class
            monitor-enter(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x009d }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x009d }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x009d }
            r2 = 0
            if (r1 != 0) goto L_0x0014
            monitor-exit(r0)
            return r2
        L_0x0014:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x009d }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0074 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0074 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0074 }
            r6 = 0
            r7 = 0
        L_0x0022:
            if (r7 >= r4) goto L_0x0036
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0074 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0074 }
            if (r9 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0036:
            r8 = r2
        L_0x0037:
            if (r8 != 0) goto L_0x0040
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0074 }
        L_0x0040:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0074 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0074 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0074 }
        L_0x0049:
            if (r6 >= r1) goto L_0x005d
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0074 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0074 }
            if (r7 == 0) goto L_0x005a
            goto L_0x005e
        L_0x005a:
            int r6 = r6 + 1
            goto L_0x0049
        L_0x005d:
            r5 = r2
        L_0x005e:
            if (r5 != 0) goto L_0x0098
            g.e.a.b.d.a r1 = new g.e.a.b.d.a     // Catch:{ SecurityException -> 0x006e }
            r1.<init>(r8)     // Catch:{ SecurityException -> 0x006e }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x006c }
            r1.start()     // Catch:{ SecurityException -> 0x006c }
            goto L_0x0097
        L_0x006c:
            r2 = move-exception
            goto L_0x0078
        L_0x006e:
            r1 = move-exception
            r2 = r1
            r1 = r5
            goto L_0x0078
        L_0x0072:
            r1 = move-exception
            goto L_0x009b
        L_0x0074:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x0078:
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r5 = "Failed to enumerate thread/threadgroup "
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0072 }
            int r6 = r2.length()     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x008f
            java.lang.String r2 = r5.concat(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x0094
        L_0x008f:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0072 }
            r2.<init>(r5)     // Catch:{ all -> 0x0072 }
        L_0x0094:
            android.util.Log.w(r4, r2)     // Catch:{ all -> 0x0072 }
        L_0x0097:
            r5 = r1
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)
            return r5
        L_0x009b:
            monitor-exit(r3)     // Catch:{ all -> 0x0072 }
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x00a1
        L_0x00a0:
            throw r1
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.d.b.c():java.lang.Thread");
    }
}
