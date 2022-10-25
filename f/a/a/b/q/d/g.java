package f.a.a.b.q.d;

import f.a.a.b.q.c.d;
import java.util.List;

public class g {
    public final j a;
    public List<d> b;
    public int c;

    public g(j jVar) {
        this.a = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x00a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0153 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<f.a.a.b.q.c.d> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r1.b = r0
            r0 = 0
            r1.c = r0
        L_0x0009:
            int r0 = r1.c
            java.util.List<f.a.a.b.q.c.d> r2 = r1.b
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x045d
            java.util.List<f.a.a.b.q.c.d> r0 = r1.b
            int r2 = r1.c
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            f.a.a.b.q.c.d r2 = (f.a.a.b.q.c.d) r2
            boolean r0 = r2 instanceof f.a.a.b.q.c.f
            java.lang.String r3 = "RuntimeException in Action for tag ["
            java.lang.String r4 = "ActionException in Action for tag ["
            java.lang.String r5 = "]"
            r6 = 1
            if (r0 == 0) goto L_0x035d
            f.a.a.b.q.d.j r7 = r1.a
            r0 = r2
            f.a.a.b.q.c.f r0 = (f.a.a.b.q.c.f) r0
            java.util.Objects.requireNonNull(r7)
            org.xml.sax.Locator r8 = r0.f1732d
            r7.f1748f = r8
            java.lang.String r8 = r0.b
            java.lang.String r9 = r0.c
            org.xml.sax.Attributes r10 = r0.f1735e
            if (r8 == 0) goto L_0x0043
            int r0 = r8.length()
            if (r0 >= r6) goto L_0x0044
        L_0x0043:
            r8 = r9
        L_0x0044:
            f.a.a.b.q.d.e r0 = r7.f1747e
            java.util.ArrayList<java.lang.String> r0 = r0.a
            r0.add(r8)
            f.a.a.b.q.d.e r0 = r7.f1751i
            if (r0 == 0) goto L_0x005c
            java.util.Stack<java.util.List<f.a.a.b.q.b.b>> r0 = r7.f1750h
            java.util.List<f.a.a.b.q.b.b> r6 = f.a.a.b.q.d.j.f1745j
            r0.add(r6)
            r22 = r3
            r18 = r4
            goto L_0x0355
        L_0x005c:
            f.a.a.b.q.d.e r0 = r7.f1747e
            f.a.a.b.q.d.l r6 = r7.a
            f.a.a.b.q.d.m r6 = (f.a.a.b.q.d.m) r6
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r9 = r6.f1752e
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x006c:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00ac
            java.lang.Object r11 = r9.next()
            f.a.a.b.q.d.f r11 = (f.a.a.b.q.d.f) r11
            java.util.Objects.requireNonNull(r11)
            int r12 = r0.d()
            int r13 = r11.d()
            if (r12 == r13) goto L_0x0086
            goto L_0x009b
        L_0x0086:
            int r12 = r11.d()
            r13 = 0
        L_0x008b:
            if (r13 >= r12) goto L_0x00a0
            java.lang.String r14 = r11.b(r13)
            java.lang.String r15 = r0.b(r13)
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 != 0) goto L_0x009d
        L_0x009b:
            r12 = 0
            goto L_0x00a1
        L_0x009d:
            int r13 = r13 + 1
            goto L_0x008b
        L_0x00a0:
            r12 = 1
        L_0x00a1:
            if (r12 == 0) goto L_0x006c
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r9 = r6.f1752e
            java.lang.Object r9 = r9.get(r11)
            java.util.List r9 = (java.util.List) r9
            goto L_0x00ad
        L_0x00ac:
            r9 = 0
        L_0x00ad:
            if (r9 == 0) goto L_0x00b5
            r22 = r3
            r18 = r4
            goto L_0x02b7
        L_0x00b5:
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r9 = r6.f1752e
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
            r11 = 0
            r12 = 0
        L_0x00c1:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x015b
            java.lang.Object r13 = r9.next()
            f.a.a.b.q.d.f r13 = (f.a.a.b.q.d.f) r13
            int r14 = r13.d()
            r15 = 1
            if (r14 <= r15) goto L_0x00e3
            r14 = 0
            java.lang.String r14 = r13.b(r14)
            java.lang.String r15 = "*"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00e3
            r14 = 1
            goto L_0x00e4
        L_0x00e3:
            r14 = 0
        L_0x00e4:
            if (r14 == 0) goto L_0x014d
            if (r0 != 0) goto L_0x00e9
            goto L_0x013c
        L_0x00e9:
            java.util.ArrayList<java.lang.String> r14 = r13.a
            int r14 = r14.size()
            java.util.ArrayList<java.lang.String> r15 = r0.a
            int r15 = r15.size()
            if (r14 == 0) goto L_0x013c
            if (r15 != 0) goto L_0x00fa
            goto L_0x013c
        L_0x00fa:
            r22 = r3
            if (r14 > r15) goto L_0x0100
            r3 = r14
            goto L_0x0101
        L_0x0100:
            r3 = r15
        L_0x0101:
            r16 = 1
            r17 = 0
            r18 = r4
            r4 = 1
        L_0x0108:
            if (r4 > r3) goto L_0x0135
            r16 = r3
            java.util.ArrayList<java.lang.String> r3 = r13.a
            r19 = r9
            int r9 = r14 - r4
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList<java.lang.String> r9 = r0.a
            r20 = r13
            int r13 = r15 - r4
            java.lang.Object r9 = r9.get(r13)
            java.lang.String r9 = (java.lang.String) r9
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0139
            int r17 = r17 + 1
            int r4 = r4 + 1
            r3 = r16
            r9 = r19
            r13 = r20
            goto L_0x0108
        L_0x0135:
            r19 = r9
            r20 = r13
        L_0x0139:
            r3 = r17
            goto L_0x0147
        L_0x013c:
            r22 = r3
            r18 = r4
            r19 = r9
            r20 = r13
            r17 = 0
            r3 = 0
        L_0x0147:
            if (r3 <= r11) goto L_0x0153
            r11 = r3
            r12 = r20
            goto L_0x0153
        L_0x014d:
            r22 = r3
            r18 = r4
            r19 = r9
        L_0x0153:
            r3 = r22
            r4 = r18
            r9 = r19
            goto L_0x00c1
        L_0x015b:
            r22 = r3
            r18 = r4
            if (r12 == 0) goto L_0x016a
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r3 = r6.f1752e
            java.lang.Object r3 = r3.get(r12)
            java.util.List r3 = (java.util.List) r3
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            r9 = r3
            if (r9 == 0) goto L_0x0170
            goto L_0x02b7
        L_0x0170:
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r3 = r6.f1752e
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r9 = 0
        L_0x017c:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01e5
            java.lang.Object r11 = r3.next()
            f.a.a.b.q.d.f r11 = (f.a.a.b.q.d.f) r11
            java.lang.String r12 = r11.c()
            boolean r12 = r6.u(r12)
            if (r12 == 0) goto L_0x01e0
            if (r0 != 0) goto L_0x0195
            goto L_0x01d0
        L_0x0195:
            java.util.ArrayList<java.lang.String> r12 = r11.a
            int r12 = r12.size()
            java.util.ArrayList<java.lang.String> r13 = r0.a
            int r13 = r13.size()
            if (r12 == 0) goto L_0x01d0
            if (r13 != 0) goto L_0x01a6
            goto L_0x01d0
        L_0x01a6:
            if (r12 > r13) goto L_0x01a9
            goto L_0x01aa
        L_0x01a9:
            r12 = r13
        L_0x01aa:
            r13 = 0
            r14 = 0
        L_0x01ac:
            if (r13 >= r12) goto L_0x01cd
            java.util.ArrayList<java.lang.String> r15 = r11.a
            java.lang.Object r15 = r15.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            r16 = r3
            java.util.ArrayList<java.lang.String> r3 = r0.a
            java.lang.Object r3 = r3.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r15.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x01d3
            int r14 = r14 + 1
            int r13 = r13 + 1
            r3 = r16
            goto L_0x01ac
        L_0x01cd:
            r16 = r3
            goto L_0x01d3
        L_0x01d0:
            r16 = r3
            r14 = 0
        L_0x01d3:
            int r3 = r11.d()
            int r3 = r3 + -1
            if (r14 != r3) goto L_0x01e2
            if (r14 <= r4) goto L_0x01e2
            r9 = r11
            r4 = r14
            goto L_0x01e2
        L_0x01e0:
            r16 = r3
        L_0x01e2:
            r3 = r16
            goto L_0x017c
        L_0x01e5:
            if (r9 == 0) goto L_0x01f0
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r3 = r6.f1752e
            java.lang.Object r3 = r3.get(r9)
            java.util.List r3 = (java.util.List) r3
            goto L_0x01f1
        L_0x01f0:
            r3 = 0
        L_0x01f1:
            r9 = r3
            if (r9 == 0) goto L_0x01f6
            goto L_0x02b7
        L_0x01f6:
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r3 = r6.f1752e
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r9 = 0
        L_0x0202:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x02a6
            java.lang.Object r11 = r3.next()
            f.a.a.b.q.d.f r11 = (f.a.a.b.q.d.f) r11
            java.lang.String r12 = r11.c()
            int r13 = r11.d()
            r14 = 1
            if (r13 <= r14) goto L_0x021f
            r13 = 0
            java.lang.String r13 = r11.b(r13)
            goto L_0x0220
        L_0x021f:
            r13 = 0
        L_0x0220:
            boolean r12 = r6.u(r12)
            if (r12 == 0) goto L_0x02a0
            boolean r12 = r6.u(r13)
            if (r12 == 0) goto L_0x02a0
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r13 = r11.a
            r12.<init>(r13)
            int r13 = r12.size()
            r14 = 2
            if (r13 <= r14) goto L_0x0247
            r13 = 0
            r12.remove(r13)
            int r13 = r12.size()
            int r13 = r13 + -1
            r12.remove(r13)
        L_0x0247:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r12)
            if (r0 != 0) goto L_0x0257
            r12 = 0
            r17 = r3
            r16 = r11
            goto L_0x0292
        L_0x0257:
            java.lang.String r12 = r0.e()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.Iterator r15 = r13.iterator()
        L_0x0264:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0286
            java.lang.Object r16 = r15.next()
            r17 = r3
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            r16 = r11
            java.lang.String r11 = "["
            r14.append(r11)
            r14.append(r3)
            r14.append(r5)
            r11 = r16
            r3 = r17
            goto L_0x0264
        L_0x0286:
            r17 = r3
            r16 = r11
            java.lang.String r3 = r14.toString()
            boolean r12 = r12.contains(r3)
        L_0x0292:
            if (r12 == 0) goto L_0x0299
            int r3 = r13.size()
            goto L_0x029a
        L_0x0299:
            r3 = 0
        L_0x029a:
            if (r3 <= r9) goto L_0x02a2
            r9 = r3
            r4 = r16
            goto L_0x02a2
        L_0x02a0:
            r17 = r3
        L_0x02a2:
            r3 = r17
            goto L_0x0202
        L_0x02a6:
            if (r4 == 0) goto L_0x02b1
            java.util.HashMap<f.a.a.b.q.d.f, java.util.List<f.a.a.b.q.b.b>> r3 = r6.f1752e
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            goto L_0x02b2
        L_0x02b1:
            r3 = 0
        L_0x02b2:
            r9 = r3
            if (r9 == 0) goto L_0x02b6
            goto L_0x02b7
        L_0x02b6:
            r9 = 0
        L_0x02b7:
            if (r9 != 0) goto L_0x02e1
            f.a.a.b.q.d.i r3 = r7.b
            java.util.ArrayList<f.a.a.b.q.b.j> r4 = r7.c
            int r4 = r4.size()
            r6 = 0
        L_0x02c2:
            if (r6 >= r4) goto L_0x02e0
            java.util.ArrayList<f.a.a.b.q.b.j> r9 = r7.c
            java.lang.Object r9 = r9.get(r6)
            f.a.a.b.q.b.j r9 = (f.a.a.b.q.b.j) r9
            boolean r11 = r9.w(r0, r10, r3)
            if (r11 == 0) goto L_0x02dd
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 1
            r0.<init>(r3)
            r0.add(r9)
            r9 = r0
            goto L_0x02e1
        L_0x02dd:
            int r6 = r6 + 1
            goto L_0x02c2
        L_0x02e0:
            r9 = 0
        L_0x02e1:
            if (r9 == 0) goto L_0x032b
            java.util.Stack<java.util.List<f.a.a.b.q.b.b>> r0 = r7.f1750h
            r0.add(r9)
            java.util.Iterator r3 = r9.iterator()
        L_0x02ec:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0355
            java.lang.Object r0 = r3.next()
            f.a.a.b.q.b.b r0 = (f.a.a.b.q.b.b) r0
            f.a.a.b.q.d.i r4 = r7.b     // Catch:{ ActionException -> 0x0311, RuntimeException -> 0x02fe }
            r0.s(r4, r8, r10)     // Catch:{ ActionException -> 0x0311, RuntimeException -> 0x02fe }
            goto L_0x02ec
        L_0x02fe:
            r0 = move-exception
            f.a.a.b.q.d.e r4 = r7.f1747e
            f.a.a.b.q.d.e r4 = r4.a()
            r7.f1751i = r4
            f.a.a.b.q.d.a r4 = r7.f1746d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = r22
            goto L_0x0323
        L_0x0311:
            r0 = move-exception
            f.a.a.b.q.d.e r4 = r7.f1747e
            f.a.a.b.q.d.e r4 = r4.a()
            r7.f1751i = r4
            f.a.a.b.q.d.a r4 = r7.f1746d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = r18
        L_0x0323:
            java.lang.String r6 = g.a.a.a.a.g(r6, r9, r8, r5)
            r4.c(r6, r0)
            goto L_0x02ec
        L_0x032b:
            java.util.Stack<java.util.List<f.a.a.b.q.b.b>> r0 = r7.f1750h
            java.util.List<f.a.a.b.q.b.b> r3 = f.a.a.b.q.d.j.f1745j
            r0.add(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "no applicable action for ["
            r0.append(r3)
            r0.append(r8)
            java.lang.String r3 = "], current ElementPath  is ["
            r0.append(r3)
            f.a.a.b.q.d.e r3 = r7.f1747e
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            f.a.a.b.q.d.a r3 = r7.f1746d
            r3.b(r0)
        L_0x0355:
            f.a.a.b.q.d.j r0 = r1.a
            f.a.a.b.q.d.i r0 = r0.b
            r0.s(r2)
            goto L_0x0361
        L_0x035d:
            r22 = r3
            r18 = r4
        L_0x0361:
            boolean r0 = r2 instanceof f.a.a.b.q.c.a
            if (r0 == 0) goto L_0x03c9
            f.a.a.b.q.d.j r0 = r1.a
            f.a.a.b.q.d.i r0 = r0.b
            r0.s(r2)
            f.a.a.b.q.d.j r3 = r1.a
            r0 = r2
            f.a.a.b.q.c.a r0 = (f.a.a.b.q.c.a) r0
            java.util.Objects.requireNonNull(r3)
            org.xml.sax.Locator r4 = r0.f1732d
            r3.f1748f = r4
            java.lang.String r0 = r0.f1731e
            if (r0 == 0) goto L_0x0380
            java.lang.String r0 = r0.trim()
        L_0x0380:
            java.util.Stack<java.util.List<f.a.a.b.q.b.b>> r4 = r3.f1750h
            java.lang.Object r4 = r4.peek()
            java.util.List r4 = (java.util.List) r4
            if (r0 == 0) goto L_0x03c9
            java.lang.String r6 = r0.trim()
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x03c9
            if (r4 != 0) goto L_0x0397
            goto L_0x03c9
        L_0x0397:
            java.util.Iterator r4 = r4.iterator()
        L_0x039b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03c9
            java.lang.Object r0 = r4.next()
            r7 = r0
            f.a.a.b.q.b.b r7 = (f.a.a.b.q.b.b) r7
            f.a.a.b.q.d.i r0 = r3.b     // Catch:{ ActionException -> 0x03ae }
            r7.t(r0, r6)     // Catch:{ ActionException -> 0x03ae }
            goto L_0x039b
        L_0x03ae:
            r0 = move-exception
            f.a.a.b.q.d.a r8 = r3.f1746d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Exception in end() methd for action ["
            r9.append(r10)
            r9.append(r7)
            r9.append(r5)
            java.lang.String r7 = r9.toString()
            r8.c(r7, r0)
            goto L_0x039b
        L_0x03c9:
            boolean r0 = r2 instanceof f.a.a.b.q.c.b
            if (r0 == 0) goto L_0x0455
            f.a.a.b.q.d.j r0 = r1.a
            f.a.a.b.q.d.i r0 = r0.b
            r0.s(r2)
            f.a.a.b.q.d.j r3 = r1.a
            f.a.a.b.q.c.b r2 = (f.a.a.b.q.c.b) r2
            java.util.Objects.requireNonNull(r3)
            org.xml.sax.Locator r0 = r2.f1732d
            r3.f1748f = r0
            java.lang.String r0 = r2.b
            java.lang.String r2 = r2.c
            java.util.Stack<java.util.List<f.a.a.b.q.b.b>> r4 = r3.f1750h
            java.lang.Object r4 = r4.pop()
            java.util.List r4 = (java.util.List) r4
            f.a.a.b.q.d.e r6 = r3.f1751i
            if (r6 == 0) goto L_0x03fb
            f.a.a.b.q.d.e r0 = r3.f1747e
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0440
            r0 = 0
            r3.f1751i = r0
            goto L_0x0440
        L_0x03fb:
            java.util.List<f.a.a.b.q.b.b> r6 = f.a.a.b.q.d.j.f1745j
            if (r4 == r6) goto L_0x0440
            if (r0 == 0) goto L_0x040a
            int r6 = r0.length()
            r7 = 1
            if (r6 >= r7) goto L_0x0409
            goto L_0x040a
        L_0x0409:
            r2 = r0
        L_0x040a:
            if (r4 != 0) goto L_0x040d
            goto L_0x0440
        L_0x040d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0411:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0440
            java.lang.Object r0 = r4.next()
            f.a.a.b.q.b.b r0 = (f.a.a.b.q.b.b) r0
            f.a.a.b.q.d.i r6 = r3.b     // Catch:{ ActionException -> 0x042e, RuntimeException -> 0x0423 }
            r0.u(r6, r2)     // Catch:{ ActionException -> 0x042e, RuntimeException -> 0x0423 }
            goto L_0x0411
        L_0x0423:
            r0 = move-exception
            f.a.a.b.q.d.a r6 = r3.f1746d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r22
            goto L_0x0438
        L_0x042e:
            r0 = move-exception
            f.a.a.b.q.d.a r6 = r3.f1746d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r18
        L_0x0438:
            java.lang.String r7 = g.a.a.a.a.g(r7, r8, r2, r5)
            r6.c(r7, r0)
            goto L_0x0411
        L_0x0440:
            f.a.a.b.q.d.e r0 = r3.f1747e
            java.util.ArrayList<java.lang.String> r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0455
            java.util.ArrayList<java.lang.String> r0 = r0.a
            int r2 = r0.size()
            int r2 = r2 + -1
            r0.remove(r2)
        L_0x0455:
            int r0 = r1.c
            int r0 = r0 + 1
            r1.c = r0
            goto L_0x0009
        L_0x045d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.q.d.g.a(java.util.List):void");
    }
}
