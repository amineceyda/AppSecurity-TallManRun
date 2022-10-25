package com.tencent.beacon.a.c;

import android.content.Context;
import com.tencent.beacon.base.util.c;
import java.util.HashMap;
import java.util.Map;

public class i {
    private static h a = new h();
    private static String b = "";
    private static boolean c = false;

    public static h a(Context context) {
        return null;
    }

    public static h a(Context context, String str) {
        return null;
    }

    public static h a(String str) {
        return a;
    }

    public static void a() {
    }

    public static void a(f fVar) throws NullPointerException {
        c.e("外部版该接口无效", new Object[0]);
    }

    public static void a(String str, Context context, f fVar) {
        c.e("外部版该接口无效", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.Class<com.tencent.beacon.a.c.i> r0 = com.tencent.beacon.a.c.i.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00ca }
            r2 = 0
            if (r1 == 0) goto L_0x0019
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x0019
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "qimei can not null!"
            com.tencent.beacon.base.util.c.a((java.lang.String) r7, (java.lang.Object[]) r6)     // Catch:{ all -> 0x00ca }
            monitor-exit(r0)
            return
        L_0x0019:
            java.lang.String r1 = c()     // Catch:{ all -> 0x00ca }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ca }
            r3 = 1
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = c()     // Catch:{ all -> 0x00ca }
            boolean r1 = android.text.TextUtils.equals(r1, r6)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0046
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ca }
            r1[r2] = r6     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "qimei16 changed! qimei16 = %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x00ca }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.base.util.c.a((java.lang.String) r1, (java.lang.Object[]) r4)     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.a.b.g r4 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x00ca }
            java.lang.String r5 = "1102"
            r4.a(r5, r1)     // Catch:{ all -> 0x00ca }
        L_0x0046:
            java.lang.String r1 = d()     // Catch:{ all -> 0x00ca }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0072
            java.lang.String r1 = d()     // Catch:{ all -> 0x00ca }
            boolean r1 = android.text.TextUtils.equals(r1, r7)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0072
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x00ca }
            r1[r2] = r7     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "qimei36 changed! qimei36 = %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x00ca }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.base.util.c.a((java.lang.String) r1, (java.lang.Object[]) r4)     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.a.b.g r4 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x00ca }
            java.lang.String r5 = "1103"
            r4.a(r5, r1)     // Catch:{ all -> 0x00ca }
        L_0x0072:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ca }
            r1[r2] = r6     // Catch:{ all -> 0x00ca }
            r1[r3] = r7     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = "setQimei: qimei16 = %s, qimei36 = %s"
            com.tencent.beacon.base.util.c.a((java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.a.c.h r1 = b()     // Catch:{ all -> 0x00ca }
            boolean r1 = r1.c()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00a0
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x0094
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x00a0
        L_0x0094:
            com.tencent.beacon.a.a.b r1 = com.tencent.beacon.a.a.b.a()     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.a.a.c r2 = new com.tencent.beacon.a.a.c     // Catch:{ all -> 0x00ca }
            r2.<init>(r3)     // Catch:{ all -> 0x00ca }
            r1.a((com.tencent.beacon.a.a.c) r2)     // Catch:{ all -> 0x00ca }
        L_0x00a0:
            com.tencent.beacon.a.c.h r1 = a     // Catch:{ all -> 0x00ca }
            r1.a(r6)     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.a.c.h r6 = a     // Catch:{ all -> 0x00ca }
            r6.b(r7)     // Catch:{ all -> 0x00ca }
            boolean r6 = c     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x00c8
            java.lang.String r6 = c()     // Catch:{ all -> 0x00ca }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x00c8
            com.tencent.beacon.a.a.b r6 = com.tencent.beacon.a.a.b.a()     // Catch:{ all -> 0x00ca }
            com.tencent.beacon.a.a.c r7 = new com.tencent.beacon.a.a.c     // Catch:{ all -> 0x00ca }
            r1 = 13
            r7.<init>(r1)     // Catch:{ all -> 0x00ca }
            r6.a((com.tencent.beacon.a.a.c) r7)     // Catch:{ all -> 0x00ca }
            c = r3     // Catch:{ all -> 0x00ca }
        L_0x00c8:
            monitor-exit(r0)
            return
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.i.a(java.lang.String, java.lang.String):void");
    }

    public static void a(boolean z) {
    }

    public static h b() {
        return a;
    }

    public static synchronized void b(String str) {
        synchronized (i.class) {
            b = str;
        }
    }

    public static synchronized String c() {
        String a2;
        synchronized (i.class) {
            a2 = a.a();
        }
        return a2;
    }

    public static synchronized String d() {
        String b2;
        synchronized (i.class) {
            b2 = a.b();
        }
        return b2;
    }

    public static synchronized Map<String, String> e() {
        HashMap hashMap;
        synchronized (i.class) {
            hashMap = new HashMap(2);
            hashMap.put("A3", c());
            hashMap.put("A153", d());
        }
        return hashMap;
    }

    public static synchronized String f() {
        String str;
        synchronized (i.class) {
            str = b;
        }
        return str;
    }

    public static synchronized String g() {
        synchronized (i.class) {
        }
        return "";
    }

    public static void h() {
    }
}
