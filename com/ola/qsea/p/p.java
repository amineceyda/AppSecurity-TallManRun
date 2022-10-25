package com.ola.qsea.p;

import android.content.Context;
import com.ola.qsea.l.c;
import com.ola.qsea.p.f;
import com.ola.qsea.s.b;
import com.ola.qsea.sdk.Qsea;
import com.ola.qsea.w.d;
import java.util.Calendar;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public final class p {

    public static class a {
        public int a = 23;
        public int b = 50;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f502d = 10;

        /* renamed from: e  reason: collision with root package name */
        public int f503e = 60;
    }

    public static void a(long j2, String str) {
        com.ola.qsea.k.a.c(str).a("q_s_t", j2);
    }

    public static void a(String str) {
        if (com.ola.qsea.d.a.g()) {
            b.b().a(str, "");
        }
    }

    public static void a(String str, a aVar) {
        int i2 = aVar.a;
        int i3 = aVar.c;
        int i4 = (i2 > i3 ? (i3 * 60) + aVar.f502d + (1440 - ((i2 * 60) + aVar.b)) : i2 < i3 ? ((i3 * 60) + aVar.f502d) - ((i2 * 60) + aVar.b) : aVar.f502d - aVar.b) * 60 * 1000;
        int identityHashCode = System.identityHashCode(new Object());
        int nextInt = new Random((long) identityHashCode).nextInt(aVar.f503e * 60 * 1000);
        int i5 = i4 + nextInt + 1;
        e.a(str).a(i5);
        com.ola.qsea.m.a.a("seed:%d,random_delay_minu:%d(%d,%d)", Integer.valueOf(identityHashCode), Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(nextInt));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Class<com.ola.qsea.p.p> r0 = com.ola.qsea.p.p.class
            monitor-enter(r0)
            boolean r1 = com.ola.qsea.d.a.g()     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            org.json.JSONObject r1 = g(r7)     // Catch:{ all -> 0x0067 }
            r1.put(r7, r8)     // Catch:{ JSONException -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ all -> 0x0067 }
        L_0x0017:
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0067 }
            com.ola.qsea.s.b r1 = com.ola.qsea.s.b.b()     // Catch:{ all -> 0x0067 }
            byte r1 = r1.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0067 }
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 != 0) goto L_0x0058
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0067 }
            a((long) r5, (java.lang.String) r7)     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0067 }
            r1[r3] = r8     // Catch:{ all -> 0x0067 }
            r1[r2] = r7     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "QSEA"
            java.lang.String r2 = "Qsea successfully updated to the local: %s ,appKey: %s)"
            com.ola.qsea.m.a.b(r8, r2, r1)     // Catch:{ all -> 0x0067 }
            com.ola.qsea.k.a r8 = com.ola.qsea.k.a.c(r7)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "is_first"
            java.lang.String r8 = r8.e(r1)     // Catch:{ all -> 0x0067 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0067 }
            if (r8 == 0) goto L_0x0065
            com.ola.qsea.k.a r7 = com.ola.qsea.k.a.c(r7)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "is_first"
            java.lang.String r1 = "false"
            r7.b(r8, r1)     // Catch:{ all -> 0x0067 }
            goto L_0x0065
        L_0x0058:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0067 }
            r1[r3] = r8     // Catch:{ all -> 0x0067 }
            r1[r2] = r7     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "QSEA"
            java.lang.String r8 = "Qsea unsuccessfully updated to the local: %s ,appKey: %s)"
            com.ola.qsea.m.a.a(r7, r8, r1)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r0)
            return
        L_0x0067:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.p.p.a(java.lang.String, java.lang.String):void");
    }

    public static boolean a(String str, Context context) {
        if (d.a(str).x()) {
            return com.ola.qsea.d.a.b(context);
        }
        com.ola.qsea.m.a.a("[AppInfo] current collect ProcessInfo be refused!", new Object[0]);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject b(java.lang.String r1) {
        /*
            if (r1 == 0) goto L_0x0017
            boolean r0 = r1.isEmpty()     // Catch:{ JSONException -> 0x0013, NullPointerException -> 0x000e }
            if (r0 != 0) goto L_0x0017
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0013, NullPointerException -> 0x000e }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0013, NullPointerException -> 0x000e }
            goto L_0x0018
        L_0x000e:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0017
        L_0x0013:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001f
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.p.p.b(java.lang.String):org.json.JSONObject");
    }

    public static boolean b(String str, Context context) {
        int i2 = Calendar.getInstance().get(11);
        int i3 = Calendar.getInstance().get(12);
        a aVar = new a();
        String g2 = d.a(str).g();
        boolean z = false;
        if (g2.length() == 14) {
            try {
                aVar.a = Integer.parseInt(g2.substring(0, 2));
                aVar.b = Integer.parseInt(g2.substring(3, 5));
                aVar.c = Integer.parseInt(g2.substring(6, 8));
                aVar.f502d = Integer.parseInt(g2.substring(9, 11));
                aVar.f503e = Integer.parseInt(g2.substring(12));
            } catch (Exception unused) {
                aVar = new a();
            }
        }
        if ((i2 == aVar.a && i3 >= aVar.b) || (i2 == aVar.c && i3 <= aVar.f502d)) {
            z = !a(str, context);
        }
        if (z) {
            a(str, aVar);
        }
        return z;
    }

    public static int c(String str) {
        return e.a(str).a();
    }

    public static String d(String str) {
        int c = c(str);
        if (c != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", String.valueOf(c));
                return jSONObject.toString();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static Qsea e(String str) {
        if (i(str)) {
            return null;
        }
        return e.a(str).c();
    }

    public static String f(String str) {
        JSONObject g2 = g(str);
        com.ola.qsea.m.a.b("SDK_INIT ｜ LOCAL-ENCRYPTION", " get stored Qsea :%s ", g2.toString());
        return g2.optString(str);
    }

    public static JSONObject g(String str) {
        return b(b.b().a(str));
    }

    public static String h(String str) {
        if (i(str)) {
            return null;
        }
        return e.a(str).d();
    }

    public static boolean i(String str) {
        return str == null || str.isEmpty() || com.ola.qsea.v.d.b().F() == null;
    }

    public static boolean j(String str) {
        long d2 = com.ola.qsea.k.a.c(str).d("q_s_t");
        boolean a2 = c.a(d2);
        if (a2) {
            com.ola.qsea.m.a.b("SDK_INIT ｜ QSEA", "It is more than 24 hours since the last request for Qsea", new Object[0]);
        }
        com.ola.qsea.m.a.a("[qsea] lastUpdateQsea time: " + d2 + ", isOver24h: " + a2, new Object[0]);
        return a2;
    }

    public static boolean k(String str) {
        if (d.a(str).j()) {
            com.ola.qsea.m.a.b("SDK_INIT ｜ QSEA", "Force to update Qsea", new Object[0]);
            return true;
        }
        Qsea e2 = e(str);
        if (e2 != null && !e2.isEmpty()) {
            return false;
        }
        com.ola.qsea.m.a.b("SDK_INIT ｜ QSEA", "Qsea is empty, need to update Qsea", new Object[0]);
        return true;
    }

    public static boolean l(String str) {
        return j(str) || com.ola.qsea.d.a.c(str);
    }

    public static Qsea m(String str) {
        String f2 = f(str);
        if (f2 == null || f2.isEmpty()) {
            return null;
        }
        Qsea a2 = f.b.a(f2);
        a2.setAppKey(str);
        return a2;
    }
}
