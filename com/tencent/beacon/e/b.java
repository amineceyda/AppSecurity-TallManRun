package com.tencent.beacon.e;

import com.tencent.beacon.a.a.c;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.raft.measure.utils.MeasureConst;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class b implements d {
    private static volatile b a;
    public boolean A = true;
    public boolean B = false;
    public int C = 1;
    public int b = 48;
    public int c = 2000;

    /* renamed from: d  reason: collision with root package name */
    public int f660d = 48;

    /* renamed from: e  reason: collision with root package name */
    public int f661e = MeasureConst.DEFAULT_REPORT_DELAY_TIME;

    /* renamed from: f  reason: collision with root package name */
    public boolean f662f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f663g = true;

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f664h = null;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, Float> f665i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f666j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f667k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f668l = false;

    /* renamed from: m  reason: collision with root package name */
    public float f669m = 1.0f;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public int q = 1;
    public long r = 6400;
    public int s = 20;
    public int t = 300;
    public boolean u = true;
    public boolean v = true;
    public boolean w = true;
    public boolean x = true;
    public int y = AbstractNetAdapter.READ_TIMEOUT;
    public boolean z = true;

    public b() {
        com.tencent.beacon.a.a.b.a().a(8, this);
    }

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    private void b(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("d_m", new HashMap(map));
        com.tencent.beacon.a.a.b.a().b(new c(2, hashMap));
    }

    public void a(int i2) {
        if (i2 >= 24 && i2 <= 100) {
            this.f660d = i2;
        }
    }

    public void a(c cVar) {
        if (cVar.a == 8) {
            this.v = cVar.b.containsKey("u_c_a_e") ? ((Boolean) cVar.b.get("u_c_a_e")).booleanValue() : this.v;
            this.u = cVar.b.containsKey("u_c_b_e") ? ((Boolean) cVar.b.get("u_c_b_e")).booleanValue() : this.u;
            this.y = cVar.b.containsKey("u_c_d_s") ? ((Integer) cVar.b.get("u_c_d_s")).intValue() : this.y;
            this.f662f = cVar.b.containsKey("u_c_p_s") ? ((Boolean) cVar.b.get("u_c_p_s")).booleanValue() : this.f662f;
            this.w = cVar.b.containsKey("u_s_o_h") ? ((Boolean) cVar.b.get("u_s_o_h")).booleanValue() : this.w;
        }
    }

    public synchronized void a(Map<String, String> map) {
        if (map != null) {
            b(map);
            try {
                if (this.b == 48) {
                    this.b = com.tencent.beacon.base.util.b.a(map.get("realtimeUploadNum"), this.b, 24, 100);
                }
                if (this.f660d == 48) {
                    this.f660d = com.tencent.beacon.base.util.b.a(map.get("normalUploadNum"), this.f660d, 24, 100);
                }
                if (this.f661e == 5000) {
                    this.f661e = com.tencent.beacon.base.util.b.a(map.get("normalPollingTime"), this.f661e, 2000, 3600000);
                }
                if (this.c == 2000) {
                    this.c = com.tencent.beacon.base.util.b.a(map.get("realtimePollingTime"), this.c, 1000, (int) AbstractNetAdapter.READ_TIMEOUT);
                }
                this.f663g = com.tencent.beacon.base.util.b.a(map.get("heartOnOff"), this.f663g);
                this.f666j = com.tencent.beacon.base.util.b.a(map.get("tidyEF"), this.f666j);
                this.f667k = com.tencent.beacon.base.util.b.a(map.get("lauEveSim"), this.f667k);
                this.f668l = com.tencent.beacon.base.util.b.a(map.get("zeroPeakOnOff"), this.f668l);
                String str = map.get("zeroPeakRate");
                if (str != null) {
                    String trim = str.trim();
                    if (trim.length() > 0) {
                        String[] split = trim.split(",");
                        if (split.length == 2) {
                            try {
                                this.f669m = Float.valueOf(split[0]).floatValue() / Float.valueOf(split[1]).floatValue();
                            } catch (Exception e2) {
                                com.tencent.beacon.base.util.c.a((Throwable) e2);
                            }
                        }
                    }
                }
                this.B = com.tencent.beacon.base.util.b.a(map.get("straOnOff"), this.B);
                this.C = com.tencent.beacon.base.util.b.a(map.get("straDayMaxCount"), this.C, 1, Integer.MAX_VALUE);
                this.n = com.tencent.beacon.base.util.b.a(map.get("acceleEnable"), this.n);
                this.o = com.tencent.beacon.base.util.b.a(map.get("gyroEnable"), this.o);
                this.p = com.tencent.beacon.base.util.b.a(map.get("magneticEnable"), this.p);
                this.q = com.tencent.beacon.base.util.b.a(map.get("gatherCount"), this.q, 1, 50);
                this.r = com.tencent.beacon.base.util.b.a(map.get("gatherDur"), this.r, 1000, 20000);
                this.s = com.tencent.beacon.base.util.b.a(map.get("hertzCount"), this.s, 20, 100);
                this.t = com.tencent.beacon.base.util.b.a(map.get("consuming"), this.t, 60, 86400);
                this.u = com.tencent.beacon.base.util.b.a(map.get("bidEnable"), this.u);
                this.v = com.tencent.beacon.base.util.b.a(map.get("auditEnable"), this.v);
                this.y = com.tencent.beacon.base.util.b.a(map.get("maxDBCount"), this.y, (int) AbstractNetAdapter.READ_TIMEOUT, 100000);
                com.tencent.beacon.base.net.b.b.c(map.get("eventUrl"));
                com.tencent.beacon.base.net.b.b.e(map.get("strategyUrl"));
            } catch (Exception e3) {
                com.tencent.beacon.base.util.c.a((Throwable) e3);
            }
        }
        return;
    }

    public synchronized void a(Set<String> set) {
        this.f664h = set;
    }

    public void a(boolean z2) {
        this.x = z2;
    }

    public synchronized boolean a(String str) {
        boolean z2;
        z2 = false;
        Set<String> set = this.f664h;
        if (set != null && set.size() > 0) {
            z2 = this.f664h.contains(str);
        }
        return z2;
    }

    public int b() {
        return this.y;
    }

    public void b(int i2) {
        if (i2 >= 24 && i2 <= 100) {
            this.b = i2;
        }
    }

    public synchronized void b(Set<String> set) {
        if (this.f665i == null) {
            this.f665i = new HashMap();
        }
        if (set != null) {
            for (String split : set) {
                String[] split2 = split.split(",");
                if (split2.length == 3) {
                    try {
                        this.f665i.put(split2[0].toLowerCase(), Float.valueOf(Float.valueOf(split2[1]).floatValue() / Float.valueOf(split2[2]).floatValue()));
                    } catch (Exception e2) {
                        com.tencent.beacon.base.util.c.a((Throwable) e2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.lang.Float> r0 = r3.f665i     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 == 0) goto L_0x0037
            java.lang.String r2 = r4.toLowerCase()     // Catch:{ all -> 0x0039 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0011
            goto L_0x0037
        L_0x0011:
            java.util.Map<java.lang.String, java.lang.Float> r0 = r3.f665i     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0039 }
            java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ all -> 0x0039 }
            float r4 = r4.floatValue()     // Catch:{ all -> 0x0039 }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r0
            int r4 = (int) r4     // Catch:{ all -> 0x0039 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            r2 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0.nextInt(r2)     // Catch:{ all -> 0x0039 }
            int r0 = r0 + r1
            if (r0 <= r4) goto L_0x0035
            r1 = 0
        L_0x0035:
            monitor-exit(r3)
            return r1
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.e.b.b(java.lang.String):boolean");
    }

    public synchronized int c() {
        return this.f660d;
    }

    public synchronized int d() {
        return this.b;
    }

    public synchronized int e() {
        return this.C;
    }

    public boolean f() {
        return this.v;
    }

    public synchronized boolean g() {
        return this.f667k;
    }

    public boolean h() {
        return this.f662f;
    }

    public boolean i() {
        return this.x;
    }

    public boolean j() {
        return this.w;
    }

    public synchronized boolean k() {
        return this.B;
    }
}
