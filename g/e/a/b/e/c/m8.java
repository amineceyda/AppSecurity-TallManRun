package g.e.a.b.e.c;

public final class m8 extends m {
    public final c c;

    public m8(c cVar) {
        this.c = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.e.c.p i(java.lang.String r17, g.e.a.b.e.c.h4 r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r5 = 5
            r7 = 1
            r8 = 2
            r9 = 3
            r10 = 4
            java.lang.String r11 = "setEventName"
            java.lang.String r12 = "setParamValue"
            java.lang.String r13 = "getParams"
            java.lang.String r14 = "getParamValue"
            java.lang.String r15 = "getTimestamp"
            java.lang.String r6 = "getEventName"
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r14)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r15)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r6)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x013d
            if (r4 == r7) goto L_0x0112
            if (r4 == r8) goto L_0x00e2
            if (r4 == r9) goto L_0x00cd
            if (r4 == r10) goto L_0x0093
            if (r4 == r5) goto L_0x0063
            g.e.a.b.e.c.p r1 = super.i(r17, r18, r19)
            return r1
        L_0x0063:
            g.e.a.b.b.h.e.a0(r12, r8, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r2.b(r1)
            java.lang.String r1 = r1.e()
            java.lang.Object r3 = r3.get(r7)
            g.e.a.b.e.c.p r3 = (g.e.a.b.e.c.p) r3
            g.e.a.b.e.c.p r2 = r2.b(r3)
            g.e.a.b.e.c.c r3 = r0.c
            g.e.a.b.e.c.b r3 = r3.b
            java.lang.Object r4 = g.e.a.b.b.h.e.W(r2)
            java.util.Map r3 = r3.c
            if (r4 != 0) goto L_0x008f
            r3.remove(r1)
            goto L_0x0092
        L_0x008f:
            r3.put(r1, r4)
        L_0x0092:
            return r2
        L_0x0093:
            g.e.a.b.b.h.e.a0(r11, r7, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r2.b(r1)
            g.e.a.b.e.c.p r2 = g.e.a.b.e.c.p.E
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c5
            g.e.a.b.e.c.p r2 = g.e.a.b.e.c.p.F
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c5
            g.e.a.b.e.c.c r2 = r0.c
            g.e.a.b.e.c.b r2 = r2.b
            java.lang.String r3 = r1.e()
            r2.a = r3
            g.e.a.b.e.c.t r2 = new g.e.a.b.e.c.t
            java.lang.String r1 = r1.e()
            r2.<init>(r1)
            return r2
        L_0x00c5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00cd:
            r1 = 0
            g.e.a.b.b.h.e.a0(r15, r1, r3)
            g.e.a.b.e.c.c r1 = r0.c
            g.e.a.b.e.c.b r1 = r1.b
            g.e.a.b.e.c.i r2 = new g.e.a.b.e.c.i
            long r3 = r1.b
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e2:
            r1 = 0
            g.e.a.b.b.h.e.a0(r13, r1, r3)
            g.e.a.b.e.c.c r1 = r0.c
            g.e.a.b.e.c.b r1 = r1.b
            java.util.Map r1 = r1.c
            g.e.a.b.e.c.m r2 = new g.e.a.b.e.c.m
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0111
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            g.e.a.b.e.c.p r5 = g.e.a.b.b.h.e.F(r5)
            r2.p(r4, r5)
            goto L_0x00f9
        L_0x0111:
            return r2
        L_0x0112:
            g.e.a.b.b.h.e.a0(r14, r7, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r2.b(r1)
            java.lang.String r1 = r1.e()
            g.e.a.b.e.c.c r2 = r0.c
            g.e.a.b.e.c.b r2 = r2.b
            java.util.Map r3 = r2.c
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0137
            java.util.Map r2 = r2.c
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            g.e.a.b.e.c.p r1 = g.e.a.b.b.h.e.F(r1)
            return r1
        L_0x013d:
            r1 = 0
            g.e.a.b.b.h.e.a0(r6, r1, r3)
            g.e.a.b.e.c.c r1 = r0.c
            g.e.a.b.e.c.b r1 = r1.b
            g.e.a.b.e.c.t r2 = new g.e.a.b.e.c.t
            java.lang.String r1 = r1.a
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.m8.i(java.lang.String, g.e.a.b.e.c.h4, java.util.List):g.e.a.b.e.c.p");
    }
}
