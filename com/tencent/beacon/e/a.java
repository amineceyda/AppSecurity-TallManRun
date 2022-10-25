package com.tencent.beacon.e;

import com.tencent.beacon.base.util.c;
import java.util.Map;

public class a implements c {
    private static volatile a a;
    public boolean b = false;
    private String c = "oth.str.mdt.qq.com";

    /* renamed from: d  reason: collision with root package name */
    private int f655d = 360;

    /* renamed from: e  reason: collision with root package name */
    private int f656e = 100;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f657f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f658g = false;

    /* renamed from: h  reason: collision with root package name */
    private d f659h = new d(1);

    private a() {
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public String a(String str) {
        Map<String, String> a2;
        d dVar = this.f659h;
        if (dVar == null || (a2 = dVar.a()) == null) {
            return null;
        }
        return a2.get(str);
    }

    public void a(int i2) {
        this.f655d = i2;
    }

    public synchronized void a(Map<String, String> map) {
        this.f657f = map;
    }

    public int b() {
        return this.f655d;
    }

    public synchronized int c() {
        String str;
        int i2;
        Map<String, String> map = this.f657f;
        if (map == null || (str = map.get("maxStrategyQueryOneDay")) == null || str.trim().equals("")) {
            return this.f656e;
        }
        i2 = this.f656e;
        try {
            i2 = Integer.parseInt(str);
        } catch (Exception e2) {
            c.a((Throwable) e2);
        }
        return i2;
    }

    public d d() {
        return this.f659h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean e() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f657f     // Catch:{ all -> 0x0027 }
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = "zeroPeak"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "y"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0027 }
            r2 = 11
            int r0 = r0.get(r2)     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            monitor-exit(r3)
            return r1
        L_0x0025:
            monitor-exit(r3)
            return r1
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.e.a.e():boolean");
    }
}
