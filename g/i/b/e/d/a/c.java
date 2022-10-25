package g.i.b.e.d.a;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.h.a.a;
import g.i.b.e.b.b;
import g.i.b.e.b.c;
import g.i.b.e.f.f;
import g.i.b.e.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class c extends a {
    public static boolean w = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4145m = true;
    public boolean n = false;
    public g o;
    public f p;
    public b q;
    public f r;
    public String s;
    public b t;
    public String u;
    public String v;

    public c(String str, Map<String, String> map, byte[] bArr, int i2, String str2, f fVar, String str3) {
        this.a = str;
        this.b = false;
        this.c = map;
        this.f4132d = bArr;
        this.f4133e = i2;
        this.f4135g = str2;
        this.r = fVar;
        this.u = str3;
    }

    public static c a(String str, Map<String, String> map, byte[] bArr, int i2, String str2, f fVar) {
        return new c(str, map, bArr, i2, str2, fVar, "");
    }

    public final boolean a() {
        this.f4139k = true;
        g gVar = this.o;
        if (gVar == null) {
            return false;
        }
        gVar.f4139k = true;
        return false;
    }

    public final void b(boolean z) {
        g gVar = this.o;
        if (gVar != null) {
            if (this.f4137i) {
                gVar.f4137i = true;
            }
            HashMap hashMap = new HashMap();
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f4138j);
                hashMap.put("B22", sb.toString());
            } else {
                hashMap.put("B46", SLAConstant.TYPE_DEPRECATED_START);
            }
            if (!e.e(this.s)) {
                hashMap.put("B15", this.s);
            }
            if (!e.e(this.u)) {
                hashMap.put("B54", this.u);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("B82", this.f4135g);
            hashMap2.put("B44", (Object) null);
            if (TextUtils.isEmpty((CharSequence) null)) {
                b bVar = this.t;
                if (bVar != null) {
                    if (!(bVar.f4097d == 3)) {
                        hashMap2.put("B10", bVar.b + Constants.KEY_INDEX_FILE_SEPARATOR + bVar.c);
                    }
                    if (this.t.a != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.t.a);
                        hashMap2.put("B45", sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.t.f4097d);
                    hashMap2.put("B202", sb3.toString());
                    Objects.requireNonNull(this.t);
                    hashMap2.put("B204", "-1");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.n ? 1 : 0);
                    hashMap2.put("B203", sb4.toString());
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f4140l.get());
                hashMap2.put("B53", sb5.toString());
                if (!TextUtils.isEmpty(this.q.c)) {
                    hashMap2.put("B26", this.q.c);
                }
                g gVar2 = this.o;
                Objects.requireNonNull(gVar2);
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(gVar2.f4148m);
                hashMap3.put("B59", sb6.toString());
                if (gVar2.v) {
                    hashMap3.put("B85", SLAConstant.TYPE_DEPRECATED_START);
                }
                if (gVar2.b) {
                    hashMap3.put("B95", SLAConstant.TYPE_DEPRECATED_START);
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(gVar2.y);
                    hashMap3.put("B96", sb7.toString());
                }
                if (!gVar2.w) {
                    hashMap3.put("B23", SLAConstant.TYPE_DEPRECATED_START);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(g.i.b.e.b.e.c);
                hashMap3.put("B220", sb8.toString());
                HashMap hashMap4 = new HashMap();
                hashMap4.putAll(hashMap2);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(gVar2.x);
                hashMap4.put("B88", sb9.toString());
                StringBuilder sb10 = new StringBuilder();
                sb10.append(gVar2.A.f4152g);
                hashMap4.put("B90", sb10.toString());
                StringBuilder sb11 = new StringBuilder();
                sb11.append(gVar2.A.f4153h);
                hashMap4.put("B91", sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(gVar2.A.f4154i);
                hashMap4.put("B92", sb12.toString());
                StringBuilder sb13 = new StringBuilder();
                sb13.append(gVar2.A.f4155j);
                hashMap4.put("B93", sb13.toString());
                StringBuilder sb14 = new StringBuilder();
                sb14.append(gVar2.A.f4156k);
                hashMap4.put("B94", sb14.toString());
                if (!TextUtils.isEmpty(gVar2.f4136h)) {
                    hashMap4.put("B47", gVar2.f4136h);
                }
                if (!TextUtils.isEmpty(gVar2.z)) {
                    hashMap4.put("B41", gVar2.z);
                }
                f fVar = gVar2.t;
                int i2 = fVar.a;
                int i3 = (i2 == 0 && (i2 = fVar.c) == 200) ? 0 : i2;
                if (!gVar2.p || i3 == -4) {
                    int i4 = g.i.b.e.c.f4126h;
                    String str = fVar.b;
                    boolean z2 = gVar2.f4137i;
                    Handler handler = c.e.a;
                    g.i.b.e.h.b.f("halley-cloud-EventReportExecutor", "report " + "HLHttpDirect" + ",appId:" + i4 + ",errorCode:" + i3);
                    c.e.a.post(new c.d("HLHttpDirect", i4, i3, str, hashMap3, hashMap4, z2));
                    return;
                }
                int i5 = g.i.b.e.c.f4126h;
                String str2 = fVar.b;
                boolean z3 = gVar2.f4137i;
                Handler handler2 = c.e.a;
                boolean g2 = a.g(1);
                g.i.b.e.h.b.f("halley-cloud-EventReportExecutor", "EventName:" + "HLHttpDirect" + " denominator:1 canReport:" + g2);
                if (g2) {
                    c.e.a.post(new c.C0146c("HLHttpDirect", i5, i3, str2, hashMap3, hashMap4, z3));
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.i.b.e.d.a.f c() {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = w
            r2 = 1
            if (r0 != 0) goto L_0x0011
            w = r2
            java.lang.String r0 = android.os.Build.VERSION.SDK     // Catch:{ Exception -> 0x000c }
            goto L_0x0011
        L_0x000c:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x0011:
            g.i.b.e.d.a.f r0 = new g.i.b.e.d.a.f
            java.lang.String r3 = ""
            r0.<init>(r3)
            r1.p = r0
            r0 = -300(0xfffffffffffffed4, float:NaN)
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0245 }
            java.lang.String r4 = r1.a     // Catch:{ MalformedURLException -> 0x0245 }
            r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x0245 }
            java.lang.String r4 = r3.getHost()     // Catch:{ MalformedURLException -> 0x0245 }
            g.i.b.e.d.a.b r5 = new g.i.b.e.d.a.b
            java.lang.String r6 = r1.a
            r5.<init>(r3, r6)
            r1.q = r5
            java.lang.String r3 = r3.getProtocol()
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r5 = "https"
            r3.startsWith(r5)
            g.i.b.e.d.a.b r3 = r1.q
            g.i.b.e.b.b r5 = new g.i.b.e.b.b
            java.net.URL r6 = r3.f4142e
            java.lang.String r6 = r6.getHost()
            r5.<init>(r6)
            r6 = 3
            r5.f4097d = r6
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0058 }
            r7.<init>()     // Catch:{ Exception -> 0x0058 }
            r7.add(r5)     // Catch:{ Exception -> 0x0058 }
            r5.a = r2     // Catch:{ Exception -> 0x0058 }
            goto L_0x006c
        L_0x0058:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x005e:
            int r9 = r3.f4141d
            if (r8 >= r9) goto L_0x0068
            r7.add(r5)
            int r8 = r8 + 1
            goto L_0x005e
        L_0x0068:
            r3 = 8
            r5.a = r3
        L_0x006c:
            r3 = r7
            int r13 = r3.size()
            long r14 = android.os.SystemClock.elapsedRealtime()
            int r5 = r1.f4133e
            if (r13 <= r2) goto L_0x007b
            int r5 = r5 / 2
        L_0x007b:
            r16 = r5
            r5 = 0
            r12 = 0
        L_0x007f:
            if (r12 >= r13) goto L_0x0242
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f4140l
            r5.incrementAndGet()
            java.lang.Object r5 = r3.get(r12)
            g.i.b.e.b.b r5 = (g.i.b.e.b.b) r5
            r1.t = r5
            byte r7 = r5.f4097d
            if (r7 == r6) goto L_0x0097
            r8 = 4
            if (r7 == r8) goto L_0x0097
            r8 = 1
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            if (r8 == 0) goto L_0x009c
            r1.n = r2
        L_0x009c:
            g.i.b.e.d.a.b r8 = r1.q
            if (r7 != r6) goto L_0x00a2
            r6 = 1
            goto L_0x00a3
        L_0x00a2:
            r6 = 0
        L_0x00a3:
            if (r6 == 0) goto L_0x00aa
            java.lang.String r5 = r8.f4143f
        L_0x00a7:
            r7 = r5
            goto L_0x0134
        L_0x00aa:
            java.net.URL r6 = r8.f4142e
            java.lang.String r6 = r6.getProtocol()
            java.lang.String r7 = "https"
            boolean r6 = r6.startsWith(r7)
            if (r6 != 0) goto L_0x00cc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "http://"
            r6.<init>(r7)
            java.lang.String r7 = r5.b
            r6.append(r7)
            java.lang.String r7 = ":"
            r6.append(r7)
            int r5 = r5.c
            goto L_0x00e3
        L_0x00cc:
            int r6 = r8.f4144g
            if (r6 == 0) goto L_0x00e7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "https://"
            r6.<init>(r7)
            java.lang.String r5 = r5.b
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            int r5 = r8.f4144g
        L_0x00e3:
            r6.append(r5)
            goto L_0x00f8
        L_0x00e7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "https://"
            r6.<init>(r7)
            java.lang.String r5 = r5.b
            r6.append(r5)
            java.lang.String r5 = ":443"
            r6.append(r5)
        L_0x00f8:
            java.lang.String r5 = r6.toString()
            java.net.URL r6 = r8.f4142e
            java.lang.String r6 = r6.getFile()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0120
            java.lang.String r7 = "/"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0116
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L_0x011c
        L_0x0116:
            java.lang.StringBuilder r7 = g.a.a.a.a.i(r5)
            java.lang.String r5 = "/"
        L_0x011c:
            java.lang.String r5 = g.a.a.a.a.f(r7, r5, r6)
        L_0x0120:
            java.net.URL r6 = r8.f4142e
            java.lang.String r6 = r6.getRef()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x00a7
            java.lang.String r7 = "#"
            java.lang.String r5 = g.a.a.a.a.c(r5, r7, r6)
            goto L_0x00a7
        L_0x0134:
            r1.v = r7
            g.i.b.e.d.a.g r11 = new g.i.b.e.d.a.g
            boolean r8 = r1.b
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.c
            byte[] r10 = r1.f4132d
            java.lang.String r6 = r1.f4135g
            r5 = r11
            r17 = r6
            r6 = r4
            r2 = r11
            r11 = r16
            r18 = r3
            r3 = r12
            r12 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.o = r2
            r5 = 1
            if (r3 != 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r2.p = r5
        L_0x0157:
            boolean r2 = g.i.b.e.b.e.a
            if (r2 == 0) goto L_0x0161
            if (r3 == 0) goto L_0x0161
            g.i.b.e.d.a.g r2 = r1.o
            r2.n = r5
        L_0x0161:
            g.i.b.e.d.a.g r2 = r1.o
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f4140l
            int r5 = r5.get()
            r2.o = r5
            g.i.b.e.d.a.g r2 = r1.o
            java.util.Objects.requireNonNull(r2)
            g.i.b.e.d.a.g r2 = r1.o
            g.i.b.e.d.a.f r2 = r2.c()
            r1.p = r2
            boolean r5 = r1.n
            if (r5 == 0) goto L_0x01d0
            int r2 = r2.a
            if (r2 == 0) goto L_0x01d0
            boolean r2 = g.i.b.e.b.e.f4109d
            if (r2 == 0) goto L_0x01d0
            g.i.b.e.b.b r2 = r1.t
            g.i.b.e.d.a.f r5 = r1.p
            int r6 = r5.a
            int r5 = r5.c
            java.lang.String r7 = g.i.b.e.b.c.a
            if (r6 != 0) goto L_0x0194
            r6 = 500(0x1f4, float:7.0E-43)
            if (r5 < r6) goto L_0x01d0
        L_0x0194:
            java.util.Map<java.lang.String, g.i.b.e.b.c$b> r5 = g.i.b.e.b.c.b
            java.lang.Object r5 = r5.get(r4)
            g.i.b.e.b.c$b r5 = (g.i.b.e.b.c.b) r5
            if (r5 == 0) goto L_0x01d0
            monitor-enter(r5)
            if (r2 != 0) goto L_0x01a2
            goto L_0x01cb
        L_0x01a2:
            byte r6 = r2.f4097d     // Catch:{ all -> 0x01cd }
            r7 = 1
            if (r6 == r7) goto L_0x01aa
            r7 = 2
            if (r6 != r7) goto L_0x01cb
        L_0x01aa:
            java.util.List<g.i.b.e.b.b> r6 = r5.c     // Catch:{ all -> 0x01cd }
            boolean r6 = r6.contains(r2)     // Catch:{ all -> 0x01cd }
            if (r6 == 0) goto L_0x01bc
            java.util.List<g.i.b.e.b.b> r6 = r5.c     // Catch:{ all -> 0x01cd }
            r6.remove(r2)     // Catch:{ all -> 0x01cd }
            java.lang.String r6 = "halley-cloud-AccessIpMgr"
            java.lang.String r7 = "remove accessIp:"
            goto L_0x01c0
        L_0x01bc:
            java.lang.String r6 = "halley-cloud-AccessIpMgr"
            java.lang.String r7 = "not contain ready to remove accessIp:"
        L_0x01c0:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01cd }
            java.lang.String r2 = r7.concat(r2)     // Catch:{ all -> 0x01cd }
            g.i.b.e.h.b.c(r6, r2)     // Catch:{ all -> 0x01cd }
        L_0x01cb:
            monitor-exit(r5)
            goto L_0x01d0
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x01d0:
            int r2 = r1.f4133e
            long r5 = (long) r2
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r14
            long r5 = r5 - r7
            int r2 = (int) r5
            g.i.b.e.d.a.f r5 = r1.p
            int r6 = r5.a
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != 0) goto L_0x01ea
            int r5 = r5.c
            if (r5 < r7) goto L_0x01ea
            r8 = 400(0x190, float:5.6E-43)
            if (r5 < r8) goto L_0x01fb
        L_0x01ea:
            r5 = -20
            if (r6 == r5) goto L_0x01fb
            if (r6 == r0) goto L_0x01fb
            r0 = -306(0xfffffffffffffece, float:NaN)
            if (r6 == r0) goto L_0x01fb
            r0 = -292(0xfffffffffffffedc, float:NaN)
            if (r6 != r0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            r0 = 0
            goto L_0x01fc
        L_0x01fb:
            r0 = 1
        L_0x01fc:
            if (r0 != 0) goto L_0x0207
            int r0 = r13 + -1
            if (r3 == r0) goto L_0x0207
            if (r2 > r7) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r0 = 0
            goto L_0x0208
        L_0x0207:
            r0 = 1
        L_0x0208:
            if (r0 != 0) goto L_0x022d
            r2 = -4
            if (r6 != r2) goto L_0x022d
            java.lang.String r2 = "direct_nonet_retry_gap"
            r5 = 10000(0x2710, float:1.4013E-41)
            r6 = 3000(0xbb8, float:4.204E-42)
            r8 = 0
            int r2 = g.h.a.a.b(r2, r8, r5, r6)
            g.i.b.e.d.a.g r5 = r1.o
            long r5 = r5.f4148m
            long r8 = (long) r2
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0223
            r0 = 1
            goto L_0x022d
        L_0x0223:
            long r8 = r8 - r5
            int r5 = (int) r8
            int r2 = g.i.b.e.h.e.a(r5, r7, r2, r7)
            long r5 = (long) r2
            android.os.SystemClock.sleep(r5)
        L_0x022d:
            if (r0 == 0) goto L_0x0232
            r0 = 1
            r2 = 1
            goto L_0x0237
        L_0x0232:
            r2 = 1
            r1.b(r2)
            r0 = 0
        L_0x0237:
            if (r0 != 0) goto L_0x0242
            int r12 = r3 + 1
            r0 = -300(0xfffffffffffffed4, float:NaN)
            r6 = 3
            r3 = r18
            goto L_0x007f
        L_0x0242:
            g.i.b.e.d.a.f r0 = r1.p
            return r0
        L_0x0245:
            g.i.b.e.d.a.f r0 = r1.p
            r2 = -300(0xfffffffffffffed4, float:NaN)
            r0.a = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.d.a.c.c():g.i.b.e.d.a.f");
    }
}
