package com.tencent.beacon.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;

public class a {
    private static boolean a = false;
    private static String b = "load_so";
    private static String c = "load_so_version";

    /* renamed from: d  reason: collision with root package name */
    private static String f649d = "beacon_so_beacon";

    private static int a(Context context) {
        return b(context).getInt(b, 0);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String a(android.content.Context r6, int r7, android.app.Activity r8, java.lang.String r9, int r10) {
        /*
            java.lang.Class<com.tencent.beacon.c.a> r0 = com.tencent.beacon.c.a.class
            monitor-enter(r0)
            java.lang.String r1 = com.tencent.beacon.a.c.b.a()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = c(r6)     // Catch:{ all -> 0x008c }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x008c }
            r3 = 0
            if (r2 != 0) goto L_0x0021
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "[audit] app update"
            com.tencent.beacon.base.util.c.d(r4, r2)     // Catch:{ all -> 0x008c }
            a((android.content.Context) r6, (java.lang.String) r1)     // Catch:{ all -> 0x008c }
            a((android.content.Context) r6, (int) r3)     // Catch:{ all -> 0x008c }
            r1 = 0
            goto L_0x0025
        L_0x0021:
            int r1 = a(r6)     // Catch:{ all -> 0x008c }
        L_0x0025:
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x008c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008c }
            r4[r3] = r5     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "[audit] last load so occur fetal error cnt: %s"
            com.tencent.beacon.base.util.c.a((java.lang.String) r5, (java.lang.Object[]) r4)     // Catch:{ all -> 0x008c }
            if (r1 < r10) goto L_0x004a
            com.tencent.beacon.a.b.g r6 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x008c }
            java.lang.String r7 = "502"
            java.lang.String r8 = "[audit] load so error count over max!"
            r6.a(r7, r8)     // Catch:{ all -> 0x008c }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
            java.lang.String r7 = "[audit] !!!!!!!!!!LOADERROR!!!!!!!!!! "
            com.tencent.beacon.base.util.c.b(r7, r6)     // Catch:{ all -> 0x008c }
            java.lang.String r6 = "LOADERROR"
            goto L_0x0077
        L_0x004a:
            boolean r10 = a     // Catch:{ UnsatisfiedLinkError -> 0x0067, all -> 0x0060 }
            if (r10 != 0) goto L_0x005b
            int r1 = r1 + r2
            a((android.content.Context) r6, (int) r1)     // Catch:{ UnsatisfiedLinkError -> 0x0067, all -> 0x0060 }
            java.lang.String r10 = "[audit] load libBeacon.so success"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ UnsatisfiedLinkError -> 0x0067, all -> 0x0060 }
            com.tencent.beacon.base.util.c.d(r10, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0067, all -> 0x0060 }
            a = r2     // Catch:{ UnsatisfiedLinkError -> 0x0067, all -> 0x0060 }
        L_0x005b:
            java.lang.String r7 = com.tencent.qmsp.sdk.u.U.a(r6, r7, r8, r9)     // Catch:{ UnsatisfiedLinkError -> 0x0067, all -> 0x0060 }
            goto L_0x0073
        L_0x0060:
            r7 = move-exception
            a((android.content.Context) r6, (java.lang.Throwable) r7)     // Catch:{ all -> 0x008c }
        L_0x0064:
            java.lang.String r7 = "NOLIB"
            goto L_0x0073
        L_0x0067:
            a = r2     // Catch:{ all -> 0x006e }
            java.lang.String r7 = com.tencent.qmsp.sdk.u.U.a(r6, r7, r8, r9)     // Catch:{ all -> 0x006e }
            goto L_0x0073
        L_0x006e:
            r7 = move-exception
            a((android.content.Context) r6, (java.lang.Throwable) r7)     // Catch:{ all -> 0x008c }
            goto L_0x0064
        L_0x0073:
            a((android.content.Context) r6, (int) r3)     // Catch:{ all -> 0x008c }
            r6 = r7
        L_0x0077:
            if (r6 == 0) goto L_0x007f
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x008a
        L_0x007f:
            com.tencent.beacon.a.b.g r7 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x008c }
            java.lang.String r8 = "501"
            java.lang.String r9 = "[audit] audit run fail! result is empty!"
            r7.a(r8, r9)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r0)
            return r6
        L_0x008c:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x0090
        L_0x008f:
            throw r6
        L_0x0090:
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.c.a.a(android.content.Context, int, android.app.Activity, java.lang.String, int):java.lang.String");
    }

    private static void a(Context context, int i2) {
        SharedPreferences.Editor edit = b(context).edit();
        if (b.a(edit)) {
            edit.putInt(b, i2).apply();
        }
    }

    private static void a(Context context, String str) {
        SharedPreferences.Editor edit = b(context).edit();
        if (b.a(edit)) {
            edit.putString(c, str).apply();
        }
    }

    private static void a(Context context, Throwable th) {
        c.b("[audit] libBeacon.so load failed!", new Object[0]);
        c.a(th);
        g.e().a("501", "[audit] libBeacon.so load failed!", th);
    }

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences(f649d, 0);
    }

    private static String c(Context context) {
        return b(context).getString(c, "");
    }
}
