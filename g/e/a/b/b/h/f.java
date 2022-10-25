package g.e.a.b.b.h;

import javax.annotation.Nullable;

public class f {
    @Nullable
    public static String a;
    public static int b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[SYNTHETIC, Splitter:B:25:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[SYNTHETIC, Splitter:B:33:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = a
            if (r0 != 0) goto L_0x0063
            int r0 = b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            b = r0
        L_0x000e:
            r1 = 0
            if (r0 > 0) goto L_0x0012
            goto L_0x0061
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            r3 = 25
            r2.<init>(r3)     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            r2.append(r0)     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x004f }
            r4.<init>(r0)     // Catch:{ all -> 0x004f }
            r3.<init>(r4)     // Catch:{ all -> 0x004f }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x005c, all -> 0x004c }
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)     // Catch:{ IOException -> 0x005c, all -> 0x004c }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x005c, all -> 0x004c }
            r3.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0061
        L_0x004c:
            r0 = move-exception
            r1 = r3
            goto L_0x0055
        L_0x004f:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
            throw r0     // Catch:{ IOException -> 0x005b, all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            throw r0
        L_0x005b:
            r3 = r1
        L_0x005c:
            if (r3 == 0) goto L_0x0061
            r3.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            a = r1
        L_0x0063:
            java.lang.String r0 = a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.h.f.a():java.lang.String");
    }
}
