package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.ArrayList;
import java.util.List;

public final class z extends w {
    public z() {
        this.a.add(l0.APPLY);
        this.a.add(l0.BLOCK);
        this.a.add(l0.BREAK);
        this.a.add(l0.CASE);
        this.a.add(l0.DEFAULT);
        this.a.add(l0.CONTINUE);
        this.a.add(l0.DEFINE_FUNCTION);
        this.a.add(l0.FN);
        this.a.add(l0.IF);
        this.a.add(l0.QUOTE);
        this.a.add(l0.RETURN);
        this.a.add(l0.SWITCH);
        this.a.add(l0.TERNARY);
    }

    public static p c(h4 h4Var, List list) {
        e.c0(l0.FN.name(), 2, list);
        p b = h4Var.b((p) list.get(0));
        p b2 = h4Var.b((p) list.get(1));
        if (b2 instanceof f) {
            List y = ((f) b2).y();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new o(b.e(), y, arrayList, h4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0118, code lost:
        if (r9.equals("continue") == false) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.e.c.p a(java.lang.String r9, g.e.a.b.e.c.h4 r10, java.util.List r11) {
        /*
            r8 = this;
            g.e.a.b.e.c.l0 r0 = g.e.a.b.e.c.l0.ADD
            g.e.a.b.e.c.l0 r0 = g.e.a.b.b.h.e.T(r9)
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            r3 = 3
            r4 = 2
            if (r0 == r4) goto L_0x01eb
            r5 = 15
            if (r0 == r5) goto L_0x01df
            r5 = 25
            if (r0 == r5) goto L_0x01da
            r5 = 41
            r6 = 0
            if (r0 == r5) goto L_0x018a
            r5 = 54
            if (r0 == r5) goto L_0x0184
            r5 = 57
            java.lang.String r7 = "return"
            if (r0 == r5) goto L_0x0168
            r5 = 19
            if (r0 == r5) goto L_0x0149
            r5 = 20
            if (r0 == r5) goto L_0x012f
            r5 = 60
            if (r0 == r5) goto L_0x007f
            r5 = 61
            if (r0 == r5) goto L_0x0059
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0149;
                default: goto L_0x003a;
            }
        L_0x003a:
            r8.b(r9)
            goto L_0x0058
        L_0x003e:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.BREAK
            java.lang.String r9 = r9.name()
            g.e.a.b.b.h.e.a0(r9, r2, r11)
            g.e.a.b.e.c.p r9 = g.e.a.b.e.c.p.H
            return r9
        L_0x004a:
            g.e.a.b.e.c.h4 r9 = r10.a()
            g.e.a.b.e.c.f r10 = new g.e.a.b.e.c.f
            r10.<init>(r11)
            g.e.a.b.e.c.p r9 = r9.c(r10)
            return r9
        L_0x0058:
            throw r6
        L_0x0059:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.TERNARY
            java.lang.Object r9 = g.a.a.a.a.m(r9, r3, r11, r2)
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            java.lang.Boolean r9 = r9.m()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r11.get(r1)
            goto L_0x0078
        L_0x0074:
            java.lang.Object r9 = r11.get(r4)
        L_0x0078:
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            return r9
        L_0x007f:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.SWITCH
            java.lang.Object r9 = g.a.a.a.a.m(r9, r3, r11, r2)
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            java.lang.Object r0 = r11.get(r1)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r10.b(r0)
            java.lang.Object r11 = r11.get(r4)
            g.e.a.b.e.c.p r11 = (g.e.a.b.e.c.p) r11
            g.e.a.b.e.c.p r11 = r10.b(r11)
            boolean r2 = r0 instanceof g.e.a.b.e.c.f
            if (r2 == 0) goto L_0x0127
            boolean r2 = r11 instanceof g.e.a.b.e.c.f
            if (r2 == 0) goto L_0x011f
            g.e.a.b.e.c.f r0 = (g.e.a.b.e.c.f) r0
            g.e.a.b.e.c.f r11 = (g.e.a.b.e.c.f) r11
            r2 = 0
            r3 = 0
        L_0x00ad:
            int r4 = r0.r()
            if (r2 >= r4) goto L_0x00ea
            if (r3 != 0) goto L_0x00c8
            g.e.a.b.e.c.p r3 = r0.v(r2)
            g.e.a.b.e.c.x r4 = r10.b
            g.e.a.b.e.c.p r3 = r4.a(r10, r3)
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r3 = 0
            goto L_0x00e7
        L_0x00c8:
            g.e.a.b.e.c.p r3 = r11.v(r2)
            g.e.a.b.e.c.x r4 = r10.b
            g.e.a.b.e.c.p r3 = r4.a(r10, r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.h
            if (r4 == 0) goto L_0x00e6
            r9 = r3
            g.e.a.b.e.c.h r9 = (g.e.a.b.e.c.h) r9
            java.lang.String r9 = r9.c
            java.lang.String r10 = "break"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x011b
            g.e.a.b.e.c.p r9 = g.e.a.b.e.c.p.E
            return r9
        L_0x00e6:
            r3 = 1
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x00ad
        L_0x00ea:
            int r9 = r0.r()
            int r9 = r9 + r1
            int r1 = r11.r()
            if (r9 != r1) goto L_0x011c
            int r9 = r0.r()
            g.e.a.b.e.c.p r9 = r11.v(r9)
            g.e.a.b.e.c.x r11 = r10.b
            g.e.a.b.e.c.p r3 = r11.a(r10, r9)
            boolean r9 = r3 instanceof g.e.a.b.e.c.h
            if (r9 == 0) goto L_0x011c
            r9 = r3
            g.e.a.b.e.c.h r9 = (g.e.a.b.e.c.h) r9
            java.lang.String r9 = r9.c
            boolean r10 = r9.equals(r7)
            if (r10 != 0) goto L_0x011b
            java.lang.String r10 = "continue"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            return r3
        L_0x011c:
            g.e.a.b.e.c.p r9 = g.e.a.b.e.c.p.E
            return r9
        L_0x011f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Malformed SWITCH statement, case statements are not a list"
            r9.<init>(r10)
            throw r9
        L_0x0127:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Malformed SWITCH statement, cases are not a list"
            r9.<init>(r10)
            throw r9
        L_0x012f:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.DEFINE_FUNCTION
            java.lang.String r9 = r9.name()
            g.e.a.b.b.h.e.c0(r9, r4, r11)
            g.e.a.b.e.c.p r9 = c(r10, r11)
            r11 = r9
            g.e.a.b.e.c.j r11 = (g.e.a.b.e.c.j) r11
            java.lang.String r11 = r11.b
            if (r11 != 0) goto L_0x0145
            java.lang.String r11 = ""
        L_0x0145:
            r10.f(r11, r9)
            return r9
        L_0x0149:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L_0x0150
            goto L_0x0165
        L_0x0150:
            java.lang.Object r9 = r11.get(r2)
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            boolean r11 = r9 instanceof g.e.a.b.e.c.f
            if (r11 == 0) goto L_0x0165
            g.e.a.b.e.c.f r9 = (g.e.a.b.e.c.f) r9
            g.e.a.b.e.c.p r9 = r10.c(r9)
            goto L_0x0167
        L_0x0165:
            g.e.a.b.e.c.p r9 = g.e.a.b.e.c.p.E
        L_0x0167:
            return r9
        L_0x0168:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L_0x0171
            g.e.a.b.e.c.p r9 = g.e.a.b.e.c.p.I
            goto L_0x0183
        L_0x0171:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.RETURN
            java.lang.Object r9 = g.a.a.a.a.m(r9, r1, r11, r2)
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            g.e.a.b.e.c.h r10 = new g.e.a.b.e.c.h
            r10.<init>(r7, r9)
            r9 = r10
        L_0x0183:
            return r9
        L_0x0184:
            g.e.a.b.e.c.f r9 = new g.e.a.b.e.c.f
            r9.<init>(r11)
            return r9
        L_0x018a:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.IF
            java.lang.String r9 = r9.name()
            g.e.a.b.b.h.e.c0(r9, r4, r11)
            java.lang.Object r9 = r11.get(r2)
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            java.lang.Object r0 = r11.get(r1)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r10.b(r0)
            int r1 = r11.size()
            if (r1 <= r4) goto L_0x01b7
            java.lang.Object r11 = r11.get(r4)
            g.e.a.b.e.c.p r11 = (g.e.a.b.e.c.p) r11
            g.e.a.b.e.c.p r6 = r10.b(r11)
        L_0x01b7:
            g.e.a.b.e.c.p r11 = g.e.a.b.e.c.p.E
            java.lang.Boolean r9 = r9.m()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x01ca
            g.e.a.b.e.c.f r0 = (g.e.a.b.e.c.f) r0
            g.e.a.b.e.c.p r9 = r10.c(r0)
            goto L_0x01d4
        L_0x01ca:
            if (r6 == 0) goto L_0x01d3
            g.e.a.b.e.c.f r6 = (g.e.a.b.e.c.f) r6
            g.e.a.b.e.c.p r9 = r10.c(r6)
            goto L_0x01d4
        L_0x01d3:
            r9 = r11
        L_0x01d4:
            boolean r10 = r9 instanceof g.e.a.b.e.c.h
            if (r10 == 0) goto L_0x01d9
            return r9
        L_0x01d9:
            return r11
        L_0x01da:
            g.e.a.b.e.c.p r9 = c(r10, r11)
            return r9
        L_0x01df:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.BREAK
            java.lang.String r9 = r9.name()
            g.e.a.b.b.h.e.a0(r9, r2, r11)
            g.e.a.b.e.c.p r9 = g.e.a.b.e.c.p.G
            return r9
        L_0x01eb:
            g.e.a.b.e.c.l0 r9 = g.e.a.b.e.c.l0.APPLY
            java.lang.Object r9 = g.a.a.a.a.m(r9, r3, r11, r2)
            g.e.a.b.e.c.p r9 = (g.e.a.b.e.c.p) r9
            g.e.a.b.e.c.p r9 = r10.b(r9)
            java.lang.Object r0 = r11.get(r1)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r10.b(r0)
            java.lang.String r0 = r0.e()
            java.lang.Object r11 = r11.get(r4)
            g.e.a.b.e.c.p r11 = (g.e.a.b.e.c.p) r11
            g.e.a.b.e.c.p r11 = r10.b(r11)
            boolean r3 = r11 instanceof g.e.a.b.e.c.f
            if (r3 == 0) goto L_0x022c
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0224
            g.e.a.b.e.c.f r11 = (g.e.a.b.e.c.f) r11
            java.util.List r11 = r11.y()
            g.e.a.b.e.c.p r9 = r9.i(r0, r10, r11)
            return r9
        L_0x0224:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Function name for apply is undefined"
            r9.<init>(r10)
            throw r9
        L_0x022c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getCanonicalName()
            r10[r2] = r11
            java.lang.String r11 = "Function arguments for Apply are not a list found %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            goto L_0x0245
        L_0x0244:
            throw r9
        L_0x0245:
            goto L_0x0244
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.z.a(java.lang.String, g.e.a.b.e.c.h4, java.util.List):g.e.a.b.e.c.p");
    }
}
