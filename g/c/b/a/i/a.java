package g.c.b.a.i;

import g.c.b.a.d;
import g.c.b.a.j.b;
import i.o.c.h;

public final class a implements b {
    public void a(b.a aVar, d<Object> dVar) {
        h.e(dVar, "response");
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0243, code lost:
        if (r3 != false) goto L_0x0245;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(g.c.b.a.j.b.a r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "nextChain"
            i.o.c.h.e(r0, r1)
            r1 = r0
            g.c.b.a.h.f r1 = (g.c.b.a.h.f) r1
            g.c.b.a.c r2 = r1.f2220d
            g.c.b.a.j.d r4 = r2.a
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.c
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f2195d
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Map r5 = r4.d()
            if (r5 != 0) goto L_0x001e
            goto L_0x003e
        L_0x001e:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0026:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r6.put(r8, r7)
            goto L_0x0026
        L_0x003e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "config headers["
            r5.append(r7)
            r5.append(r6)
            r7 = 93
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "RequestBuilderInterceptor"
            java.lang.String r9 = "tag"
            i.o.c.h.e(r8, r9)
            java.lang.String r10 = "message"
            i.o.c.h.e(r5, r10)
            g.c.b.a.j.g r11 = g.c.b.a.l.c.b
            java.lang.String r12 = "ClientChannel|"
            if (r11 == 0) goto L_0x006e
            java.lang.String r13 = i.o.c.h.j(r12, r8)
            r11.d(r13, r5)
            goto L_0x0075
        L_0x006e:
            java.lang.String r11 = i.o.c.h.j(r12, r8)
            android.util.Log.d(r11, r5)
        L_0x0075:
            if (r0 != 0) goto L_0x0078
            goto L_0x0098
        L_0x0078:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0080:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r11 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            r6.put(r11, r5)
            goto L_0x0080
        L_0x0098:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "user headers["
            r0.append(r5)
            r0.append(r6)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            i.o.c.h.e(r8, r9)
            i.o.c.h.e(r0, r10)
            g.c.b.a.j.g r5 = g.c.b.a.l.c.b
            if (r5 == 0) goto L_0x00be
            java.lang.String r11 = i.o.c.h.j(r12, r8)
            r5.d(r11, r0)
            goto L_0x00c5
        L_0x00be:
            java.lang.String r5 = i.o.c.h.j(r12, r8)
            android.util.Log.d(r5, r0)
        L_0x00c5:
            if (r3 == 0) goto L_0x00d0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r0 = 0
            goto L_0x00d1
        L_0x00d0:
            r0 = 1
        L_0x00d1:
            r5 = 0
            if (r0 == 0) goto L_0x00d6
            goto L_0x0213
        L_0x00d6:
            java.lang.String r11 = "Ual-Access-ExtInfo"
            java.lang.Object r0 = r6.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00e9
            int r13 = r0.length()
            if (r13 != 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r13 = 0
            goto L_0x00ea
        L_0x00e9:
            r13 = 1
        L_0x00ea:
            r14 = 3
            if (r13 != 0) goto L_0x0129
            g.c.b.a.l.a r13 = g.c.b.a.l.a.a     // Catch:{ Exception -> 0x00ff }
            java.lang.Class<com.apkpure.components.clientchannel.channel.headers.ExtInfo> r13 = com.apkpure.components.clientchannel.channel.headers.ExtInfo.class
            java.lang.Object r0 = g.c.b.a.l.a.a(r0, r13)     // Catch:{ Exception -> 0x00ff }
            com.apkpure.components.clientchannel.channel.headers.ExtInfo r0 = (com.apkpure.components.clientchannel.channel.headers.ExtInfo) r0     // Catch:{ Exception -> 0x00ff }
            if (r0 != 0) goto L_0x012e
            com.apkpure.components.clientchannel.channel.headers.ExtInfo r0 = new com.apkpure.components.clientchannel.channel.headers.ExtInfo     // Catch:{ Exception -> 0x00ff }
            r0.<init>(r5, r5, r14, r5)     // Catch:{ Exception -> 0x00ff }
            goto L_0x012e
        L_0x00ff:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r13 = "add header ext info exception: "
            java.lang.String r0 = i.o.c.h.j(r13, r0)
            i.o.c.h.e(r8, r9)
            i.o.c.h.e(r0, r10)
            g.c.b.a.j.g r13 = g.c.b.a.l.c.b
            if (r13 == 0) goto L_0x011c
            java.lang.String r15 = i.o.c.h.j(r12, r8)
            r13.e(r15, r0)
            goto L_0x0123
        L_0x011c:
            java.lang.String r13 = i.o.c.h.j(r12, r8)
            android.util.Log.e(r13, r0)
        L_0x0123:
            com.apkpure.components.clientchannel.channel.headers.ExtInfo r0 = new com.apkpure.components.clientchannel.channel.headers.ExtInfo
            r0.<init>(r5, r5, r14, r5)
            goto L_0x012e
        L_0x0129:
            com.apkpure.components.clientchannel.channel.headers.ExtInfo r0 = new com.apkpure.components.clientchannel.channel.headers.ExtInfo
            r0.<init>(r5, r5, r14, r5)
        L_0x012e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "config extInfoStr["
            r5.append(r13)
            r5.append(r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            i.o.c.h.e(r8, r9)
            i.o.c.h.e(r5, r10)
            g.c.b.a.j.g r13 = g.c.b.a.l.c.b
            if (r13 == 0) goto L_0x0154
            java.lang.String r14 = i.o.c.h.j(r12, r8)
            r13.d(r14, r5)
            goto L_0x015b
        L_0x0154:
            java.lang.String r13 = i.o.c.h.j(r12, r8)
            android.util.Log.d(r13, r5)
        L_0x015b:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r13 = r0.getExtInfo()
            if (r13 == 0) goto L_0x016f
            int r13 = r13.length()
            if (r13 != 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r13 = 0
            goto L_0x0170
        L_0x016f:
            r13 = 1
        L_0x0170:
            if (r13 != 0) goto L_0x0189
            g.c.b.a.l.a r13 = g.c.b.a.l.a.a
            java.lang.String r13 = r0.getExtInfo()
            i.o.c.h.c(r13)
            java.lang.Class r14 = r5.getClass()
            java.lang.Object r13 = g.c.b.a.l.a.a(r13, r14)
            java.util.Map r13 = (java.util.Map) r13
            if (r13 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r5 = r13
        L_0x0189:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0191:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x01a9
            java.lang.Object r13 = r3.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.Object r13 = r13.getValue()
            r5.put(r14, r13)
            goto L_0x0191
        L_0x01a9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r13 = "add user extInfo headers["
            r3.append(r13)
            r3.append(r5)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            i.o.c.h.e(r8, r9)
            i.o.c.h.e(r3, r10)
            g.c.b.a.j.g r13 = g.c.b.a.l.c.b
            if (r13 == 0) goto L_0x01cf
            java.lang.String r14 = i.o.c.h.j(r12, r8)
            r13.d(r14, r3)
            goto L_0x01d6
        L_0x01cf:
            java.lang.String r13 = i.o.c.h.j(r12, r8)
            android.util.Log.d(r13, r3)
        L_0x01d6:
            g.c.b.a.l.a r3 = g.c.b.a.l.a.a
            java.lang.String r3 = g.c.b.a.l.a.b(r5)
            r0.setExtInfo(r3)
            java.lang.String r0 = g.c.b.a.l.a.b(r0)
            r6.put(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "marge headers["
            r0.append(r3)
            r0.append(r6)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            i.o.c.h.e(r8, r9)
            i.o.c.h.e(r0, r10)
            g.c.b.a.j.g r3 = g.c.b.a.l.c.b
            if (r3 == 0) goto L_0x020c
            java.lang.String r5 = i.o.c.h.j(r12, r8)
            r3.d(r5, r0)
            goto L_0x0213
        L_0x020c:
            java.lang.String r3 = i.o.c.h.j(r12, r8)
            android.util.Log.d(r3, r0)
        L_0x0213:
            java.lang.String r0 = r2.f2199h
            if (r0 != 0) goto L_0x021b
            java.lang.String r0 = r4.method()
        L_0x021b:
            java.lang.String r3 = "GET"
            boolean r0 = i.o.c.h.a(r3, r0)
            if (r0 == 0) goto L_0x0224
            goto L_0x0248
        L_0x0224:
            java.lang.String r0 = r2.f2198g
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = r4.g()
        L_0x022c:
            java.lang.String r3 = "application/json; charset=utf-8"
            boolean r0 = i.o.c.h.a(r0, r3)
            if (r0 == 0) goto L_0x0248
            java.lang.Object r0 = r2.f2200i
            if (r0 != 0) goto L_0x0239
            goto L_0x0245
        L_0x0239:
            g.c.b.a.l.a r3 = g.c.b.a.l.a.a
            java.lang.String r0 = g.c.b.a.l.a.b(r0)
            boolean r3 = i.t.e.j(r0)
            if (r3 == 0) goto L_0x024a
        L_0x0245:
            java.lang.String r0 = "{}"
            goto L_0x024a
        L_0x0248:
            java.lang.Object r0 = r2.f2200i
        L_0x024a:
            r12 = r0
            g.c.b.a.c r0 = new g.c.b.a.c
            java.lang.String r3 = r2.b
            if (r3 != 0) goto L_0x0255
            java.lang.String r3 = r4.h()
        L_0x0255:
            r5 = r3
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f2195d
            java.lang.String r8 = r2.f2196e
            java.lang.String r3 = r2.f2197f
            if (r3 != 0) goto L_0x0278
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = r4.f()
            r3.append(r9)
            r9 = 47
            r3.append(r9)
            java.lang.String r9 = r2.f2196e
            r3.append(r9)
            java.lang.String r3 = r3.toString()
        L_0x0278:
            r9 = r3
            java.lang.String r3 = r2.f2198g
            if (r3 != 0) goto L_0x0281
            java.lang.String r3 = r4.g()
        L_0x0281:
            r10 = r3
            java.lang.String r3 = r2.f2199h
            if (r3 != 0) goto L_0x028a
            java.lang.String r3 = r4.method()
        L_0x028a:
            r11 = r3
            r3 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            g.c.b.a.j.h r3 = r2.f2201j
            if (r3 != 0) goto L_0x0298
            g.c.b.a.j.h r3 = r4.j()
        L_0x0298:
            r14 = r3
            java.lang.reflect.Type r15 = r2.f2202k
            java.lang.Integer r3 = r2.f2203l
            if (r3 != 0) goto L_0x02a4
            int r3 = r4.a()
            goto L_0x02a8
        L_0x02a4:
            int r3 = r3.intValue()
        L_0x02a8:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r2.f2204m
            if (r3 != 0) goto L_0x02b2
            java.lang.String r3 = ""
        L_0x02b2:
            r17 = r3
            g.c.b.a.j.i r3 = r2.n
            if (r3 != 0) goto L_0x02bc
            g.c.b.a.j.i r3 = r4.c()
        L_0x02bc:
            r18 = r3
            int r2 = r2.o
            r19 = r2
            r2 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g.c.b.a.j.i r3 = r0.n
            if (r3 != 0) goto L_0x02cc
            goto L_0x02d0
        L_0x02cc:
            g.c.b.a.c r2 = r3.a(r0)
        L_0x02d0:
            if (r2 != 0) goto L_0x02d3
            goto L_0x02d4
        L_0x02d3:
            r0 = r2
        L_0x02d4:
            r1.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.a.i.a.b(g.c.b.a.j.b$a):void");
    }
}
