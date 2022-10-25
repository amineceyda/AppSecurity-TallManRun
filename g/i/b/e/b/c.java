package g.i.b.e.b;

import android.os.Handler;
import g.i.b.e.f.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {
    public static String a;
    public static Map<String, b> b = new ConcurrentHashMap();
    public static g c = new a();

    public static class a implements g {
        public final void a(int i2, String str) {
            String str2 = c.a;
            g.i.b.e.h.b.h("halley-cloud-AccessIpMgr", "onNetworkSwitch refresh ScheduleInfo:" + str + ",netType:" + i2);
            if (i2 != 0) {
                i.e().f();
                g.i.b.e.h.b.h("halley-cloud-AccessIpMgr", "appidSchContainers is null.");
                c.a();
                c.a = str;
            }
        }
    }

    public static class b {
        public String a;
        public String b;
        public List<b> c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public String f4098d;

        public class a implements Comparator<b> {
            public a(b bVar) {
            }

            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((b) obj).f4097d - ((b) obj2).f4097d;
            }
        }

        public b(String str) {
            this.a = str;
        }

        public final void a(b bVar) {
            if (bVar != null) {
                byte b2 = bVar.f4097d;
                if (b2 <= 0 || b2 > 5) {
                    String str = c.a;
                    g.i.b.e.h.b.i("halley-cloud-AccessIpMgr", "Error when addAccessIPToList as iptype:" + bVar.f4097d);
                    return;
                }
                this.c.add(bVar);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Appid：" + null + " domain：" + this.b + "\r\n");
            sb.append("apn：" + this.a + " ckIP：" + null + "\r\n");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append("accessIP：" + ((b) it.next()).toString() + "\r\n");
            }
            return sb.toString();
        }
    }

    /* renamed from: g.i.b.e.b.c$c  reason: collision with other inner class name */
    public final class C0146c implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f4099d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4100e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Map f4101f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Map f4102g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ boolean f4103h;

        public C0146c(String str, int i2, int i3, String str2, Map map, Map map2, boolean z) {
            this.b = str;
            this.c = i2;
            this.f4099d = i3;
            this.f4100e = str2;
            this.f4101f = map;
            this.f4102g = map2;
            this.f4103h = z;
        }

        public final void run() {
            e.a(this.b, this.c, this.f4099d, this.f4100e, this.f4101f, this.f4102g, this.f4103h, 1);
        }
    }

    public final class d implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f4104d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4105e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Map f4106f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Map f4107g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ boolean f4108h;

        public d(String str, int i2, int i3, String str2, Map map, Map map2, boolean z) {
            this.b = str;
            this.c = i2;
            this.f4104d = i3;
            this.f4105e = str2;
            this.f4106f = map;
            this.f4107g = map2;
            this.f4108h = z;
        }

        public final void run() {
            e.a(this.b, this.c, this.f4104d, this.f4105e, this.f4106f, this.f4107g, this.f4108h, 0);
        }
    }

    public final class e {
        public static Handler a = g.i.b.e.c.n;

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[Catch:{ all -> 0x0048 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x0048 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[Catch:{ all -> 0x0048 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(java.lang.String r16, int r17, int r18, java.lang.String r19, java.util.Map r20, java.util.Map r21, boolean r22, int r23) {
            /*
                r0 = r16
                r1 = r17
                r2 = r20
                r3 = r21
                java.lang.String r4 = "B47"
                java.lang.String r5 = "B49"
                java.lang.String r6 = ","
                java.lang.String r7 = "B44"
                java.lang.String r9 = "halley-cloud-EventReportExecutor"
                if (r22 == 0) goto L_0x004b
                boolean r10 = g.i.b.e.b.e.h()     // Catch:{ all -> 0x0048 }
                r11 = -3
                if (r10 == 0) goto L_0x001e
                r10 = -288(0xfffffffffffffee0, float:NaN)
                goto L_0x0036
            L_0x001e:
                g.i.b.e.b.e.d()     // Catch:{ all -> 0x0048 }
                boolean r10 = g.i.b.e.b.e.f4109d     // Catch:{ all -> 0x0048 }
                if (r10 != 0) goto L_0x002c
                java.lang.String r10 = "fix code NoNetwork"
                g.i.b.e.h.b.h(r9, r10)     // Catch:{ all -> 0x0048 }
                r10 = -4
                goto L_0x0036
            L_0x002c:
                boolean r10 = g.i.b.e.b.i.a()     // Catch:{ all -> 0x0048 }
                if (r10 != 0) goto L_0x0034
                r10 = -3
                goto L_0x0036
            L_0x0034:
                r10 = r18
            L_0x0036:
                if (r10 != r11) goto L_0x004d
                java.lang.String r11 = "ping failed, "
                java.lang.String r12 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x0048 }
                java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x0048 }
                java.lang.String r12 = "fix code PingFail"
                g.i.b.e.h.b.h(r9, r12)     // Catch:{ all -> 0x0048 }
                goto L_0x004f
            L_0x0048:
                r0 = move-exception
                goto L_0x01c4
            L_0x004b:
                r10 = r18
            L_0x004d:
                r11 = r19
            L_0x004f:
                r12 = 1
                if (r23 <= 0) goto L_0x0056
                r13 = r23
                r14 = 1
                goto L_0x005e
            L_0x0056:
                int r13 = g.h.a.a.c(r0, r1, r10, r2)     // Catch:{ all -> 0x0048 }
                boolean r14 = g.h.a.a.g(r13)     // Catch:{ all -> 0x0048 }
            L_0x005e:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                java.lang.String r8 = "getEventDenominator: "
                r15.<init>(r8)     // Catch:{ all -> 0x0048 }
                r15.append(r13)     // Catch:{ all -> 0x0048 }
                r15.append(r6)     // Catch:{ all -> 0x0048 }
                r15.append(r0)     // Catch:{ all -> 0x0048 }
                r15.append(r6)     // Catch:{ all -> 0x0048 }
                r15.append(r1)     // Catch:{ all -> 0x0048 }
                r15.append(r6)     // Catch:{ all -> 0x0048 }
                r15.append(r10)     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = ",canReport:"
                r15.append(r6)     // Catch:{ all -> 0x0048 }
                r15.append(r14)     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = r15.toString()     // Catch:{ all -> 0x0048 }
                g.i.b.e.h.b.a(r9, r6)     // Catch:{ all -> 0x0048 }
                if (r14 == 0) goto L_0x01c3
                if (r3 == 0) goto L_0x00dd
                boolean r6 = r3.containsKey(r7)     // Catch:{ all -> 0x0048 }
                if (r6 == 0) goto L_0x00b7
                java.lang.Object r6 = r3.get(r7)     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = g.i.b.e.h.e.g(r6)     // Catch:{ all -> 0x0048 }
                r3.put(r7, r6)     // Catch:{ all -> 0x0048 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                java.lang.String r8 = "httpBizUrl:"
                r6.<init>(r8)     // Catch:{ all -> 0x0048 }
                java.lang.Object r7 = r3.get(r7)     // Catch:{ all -> 0x0048 }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0048 }
                r6.append(r7)     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0048 }
                g.i.b.e.h.b.c(r9, r6)     // Catch:{ all -> 0x0048 }
            L_0x00b7:
                boolean r6 = r3.containsKey(r5)     // Catch:{ all -> 0x0048 }
                if (r6 == 0) goto L_0x00ca
                java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = g.i.b.e.h.e.g(r6)     // Catch:{ all -> 0x0048 }
                r3.put(r5, r6)     // Catch:{ all -> 0x0048 }
            L_0x00ca:
                boolean r5 = r3.containsKey(r4)     // Catch:{ all -> 0x0048 }
                if (r5 == 0) goto L_0x00dd
                java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = g.i.b.e.h.e.g(r5)     // Catch:{ all -> 0x0048 }
                r3.put(r4, r5)     // Catch:{ all -> 0x0048 }
            L_0x00dd:
                if (r2 != 0) goto L_0x00e4
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0048 }
                r2.<init>()     // Catch:{ all -> 0x0048 }
            L_0x00e4:
                java.lang.String r4 = "B31"
                java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0048 }
                r2.put(r4, r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "B7"
                java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0048 }
                r2.put(r4, r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "B1"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r5.<init>()     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = g.i.b.e.c.f4129k     // Catch:{ all -> 0x0048 }
                r5.append(r6)     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0048 }
                r2.put(r4, r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "B2"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r5.<init>()     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = g.i.b.e.c.b     // Catch:{ all -> 0x0048 }
                r5.append(r6)     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0048 }
                r2.put(r4, r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "B30"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r5.<init>()     // Catch:{ all -> 0x0048 }
                java.lang.String r6 = g.i.b.e.c.f4128j     // Catch:{ all -> 0x0048 }
                r5.append(r6)     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0048 }
                r2.put(r4, r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "B3"
                java.lang.String r1 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0048 }
                r2.put(r4, r1)     // Catch:{ all -> 0x0048 }
                java.lang.String r1 = g.i.b.e.c.a()     // Catch:{ all -> 0x0048 }
                boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0048 }
                if (r4 != 0) goto L_0x0147
                java.lang.String r4 = "B4"
                r2.put(r4, r1)     // Catch:{ all -> 0x0048 }
            L_0x0147:
                java.lang.String r1 = "B5"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r4.<init>()     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = g.i.b.e.f.j.b()     // Catch:{ all -> 0x0048 }
                r4.append(r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0048 }
                r2.put(r1, r4)     // Catch:{ all -> 0x0048 }
                java.lang.String r1 = g.i.b.e.b.e.c()     // Catch:{ all -> 0x0048 }
                boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0048 }
                if (r4 != 0) goto L_0x016b
                java.lang.String r4 = "B29"
                r2.put(r4, r1)     // Catch:{ all -> 0x0048 }
            L_0x016b:
                java.lang.String r1 = "access_report_detail"
                r4 = 0
                int r1 = g.h.a.a.b(r1, r4, r12, r12)     // Catch:{ all -> 0x0048 }
                if (r1 != r12) goto L_0x019a
                if (r3 == 0) goto L_0x0179
                r2.putAll(r3)     // Catch:{ all -> 0x0048 }
            L_0x0179:
                java.lang.String r1 = "B6"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                r3.<init>()     // Catch:{ all -> 0x0048 }
                java.lang.String r5 = g.i.b.e.b.e.f4111f     // Catch:{ all -> 0x0048 }
                r3.append(r5)     // Catch:{ all -> 0x0048 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0048 }
                r2.put(r1, r3)     // Catch:{ all -> 0x0048 }
                r1 = -4
                if (r10 == r1) goto L_0x019a
                boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0048 }
                if (r1 != 0) goto L_0x019a
                java.lang.String r1 = "B8"
                r2.put(r1, r11)     // Catch:{ all -> 0x0048 }
            L_0x019a:
                if (r10 != 0) goto L_0x019d
                goto L_0x019e
            L_0x019d:
                r12 = 0
            L_0x019e:
                boolean r1 = g.h.a.a.j(r0, r12, r2, r4)     // Catch:{ all -> 0x0048 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "report:"
                r3.<init>(r4)     // Catch:{ all -> 0x0048 }
                r3.append(r1)     // Catch:{ all -> 0x0048 }
                java.lang.String r1 = ",event:"
                r3.append(r1)     // Catch:{ all -> 0x0048 }
                r3.append(r0)     // Catch:{ all -> 0x0048 }
                java.lang.String r0 = ",reportMap:"
                r3.append(r0)     // Catch:{ all -> 0x0048 }
                r3.append(r2)     // Catch:{ all -> 0x0048 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0048 }
                g.i.b.e.h.b.f(r9, r0)     // Catch:{ all -> 0x0048 }
            L_0x01c3:
                return
            L_0x01c4:
                java.lang.String r1 = "doReport err"
                g.i.b.e.h.b.e(r9, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.c.e.a(java.lang.String, int, int, java.lang.String, java.util.Map, java.util.Map, boolean, int):void");
        }
    }

    static {
        new ConcurrentHashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            g.i.b.e.f.i r0 = g.i.b.e.f.i.e()
            g.i.b.e.f.f r0 = r0.f()
            java.util.List r0 = r0.a()
            java.lang.String r1 = "halley-cloud-AccessIpMgr"
            if (r0 == 0) goto L_0x00e7
            java.lang.String r2 = "app_schdule_use_ipv6"
            r3 = 0
            r4 = 1
            int r2 = g.h.a.a.b(r2, r3, r4, r4)
            if (r2 != r4) goto L_0x001b
            r3 = 1
        L_0x001b:
            java.util.Map<java.lang.String, g.i.b.e.b.c$b> r2 = b
            r2.clear()
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e6
            java.lang.Object r2 = r0.next()
            g.i.b.e.b.e$c r2 = (g.i.b.e.b.e.c) r2
            g.i.b.e.b.c$b r5 = new g.i.b.e.b.c$b
            java.lang.String r6 = a
            r5.<init>(r6)
            java.lang.String r6 = r2.a
            r5.b = r6
            java.lang.String r6 = r2.b
            r5.f4098d = r6
            java.lang.String r7 = "bottom"
            boolean r6 = r6.startsWith(r7)
            java.util.List<g.i.b.e.b.b> r7 = r2.c
            java.util.Iterator r7 = r7.iterator()
        L_0x004b:
            boolean r8 = r7.hasNext()
            java.lang.String r9 = " for domain:"
            java.lang.String r10 = "directScheduleInfo "
            r11 = 3
            if (r8 == 0) goto L_0x00b0
            java.lang.Object r8 = r7.next()
            g.i.b.e.b.b r8 = (g.i.b.e.b.b) r8
            if (r3 != 0) goto L_0x006a
            boolean r12 = r8.b()
            if (r12 == 0) goto L_0x006a
            java.lang.String r8 = "ignore ipv6 accessIp due to cloud-settings"
        L_0x0066:
            g.i.b.e.h.b.c(r1, r8)
            goto L_0x004b
        L_0x006a:
            byte r12 = g.i.b.e.b.e.c
            if (r12 != r4) goto L_0x007f
            boolean r11 = r8.b()
            if (r11 == 0) goto L_0x0090
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "ignore ipv6 accessIp for ipv4 only, accessIp: "
        L_0x007a:
            java.lang.String r8 = r9.concat(r8)
            goto L_0x0066
        L_0x007f:
            byte r12 = g.i.b.e.b.e.c
            if (r12 != r11) goto L_0x0090
            boolean r11 = r8.b()
            if (r11 != 0) goto L_0x0090
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "ignore ipv4 accessIp for ipv6 only, accessIp: "
            goto L_0x007a
        L_0x0090:
            if (r6 == 0) goto L_0x0095
            r11 = 5
            r8.f4097d = r11
        L_0x0095:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r11.append(r8)
            r11.append(r9)
            java.lang.String r9 = r5.b
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            g.i.b.e.h.b.c(r1, r9)
            r5.a(r8)
            goto L_0x004b
        L_0x00b0:
            g.i.b.e.b.b r6 = new g.i.b.e.b.b
            java.lang.String r7 = r2.a
            r6.<init>(r7)
            r6.f4097d = r11
            r5.a(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r10)
            r7.append(r6)
            r7.append(r9)
            java.lang.String r6 = r5.b
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            g.i.b.e.h.b.c(r1, r6)
            java.util.List<g.i.b.e.b.b> r6 = r5.c
            g.i.b.e.b.c$b$a r7 = new g.i.b.e.b.c$b$a
            r7.<init>(r5)
            java.util.Collections.sort(r6, r7)
            java.util.Map<java.lang.String, g.i.b.e.b.c$b> r6 = b
            java.lang.String r2 = r2.a
            r6.put(r2, r5)
            goto L_0x0024
        L_0x00e6:
            return
        L_0x00e7:
            java.lang.String r0 = "getDirectAccessInfo is null."
            g.i.b.e.h.b.h(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.c.a():void");
    }
}
