package g.e.a.b.e.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class f implements Iterable, p, l {
    public final SortedMap b;
    public final Map c;

    public f() {
        this.b = new TreeMap();
        this.c = new TreeMap();
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                A(i2, (p) list.get(i2));
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void A(int i2, p pVar) {
        if (i2 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (pVar == null) {
            this.b.remove(Integer.valueOf(i2));
        } else {
            this.b.put(Integer.valueOf(i2), pVar);
        }
    }

    public final boolean B(int i2) {
        if (i2 >= 0 && i2 <= ((Integer) this.b.lastKey()).intValue()) {
            return this.b.containsKey(Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final boolean c(String str) {
        return "length".equals(str) || this.c.containsKey(str);
    }

    public final Double d() {
        return this.b.size() == 1 ? v(0).d() : this.b.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final String e() {
        return w(",");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (r() != fVar.r()) {
            return false;
        }
        if (this.b.isEmpty()) {
            return fVar.b.isEmpty();
        }
        for (int intValue = ((Integer) this.b.firstKey()).intValue(); intValue <= ((Integer) this.b.lastKey()).intValue(); intValue++) {
            if (!v(intValue).equals(fVar.v(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final Iterator f() {
        return new d(this.b.keySet().iterator(), this.c.keySet().iterator());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (g.e.a.b.e.c.p) r2.c.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.e.c.p h(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            g.e.a.b.e.c.i r3 = new g.e.a.b.e.c.i
            int r0 = r2.r()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.c(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.c
            java.lang.Object r3 = r0.get(r3)
            g.e.a.b.e.c.p r3 = (g.e.a.b.e.c.p) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            g.e.a.b.e.c.p r3 = g.e.a.b.e.c.p.E
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.f.h(java.lang.String):g.e.a.b.e.c.p");
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: g.e.a.b.e.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v128, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: g.e.a.b.e.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v135, resolved type: g.e.a.b.e.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: g.e.a.b.e.c.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v139, resolved type: g.e.a.b.e.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: g.e.a.b.e.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: g.e.a.b.e.c.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: g.e.a.b.e.c.i} */
    /* JADX WARNING: type inference failed for: r1v107, types: [g.e.a.b.e.c.p] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018f, code lost:
        r7 = r17;
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ae, code lost:
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01be, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01bf, code lost:
        r20 = r2;
        r21 = r3;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c8, code lost:
        switch(r1) {
            case 0: goto L_0x0861;
            case 1: goto L_0x081f;
            case 2: goto L_0x07b9;
            case 3: goto L_0x0788;
            case 4: goto L_0x06e8;
            case 5: goto L_0x06a5;
            case 6: goto L_0x05f3;
            case 7: goto L_0x05c0;
            case 8: goto L_0x05a5;
            case 9: goto L_0x056e;
            case 10: goto L_0x055c;
            case 11: goto L_0x0554;
            case 12: goto L_0x051b;
            case com.google.android.gms.common.ConnectionResult.CANCELED :int: goto L_0x0501;
            case com.google.android.gms.common.ConnectionResult.TIMEOUT :int: goto L_0x046c;
            case com.google.android.gms.common.ConnectionResult.INTERRUPTED :int: goto L_0x03f6;
            case com.google.android.gms.common.ConnectionResult.API_UNAVAILABLE :int: goto L_0x0397;
            case com.google.android.gms.common.ConnectionResult.SIGN_IN_FAILED :int: goto L_0x027f;
            case com.google.android.gms.common.ConnectionResult.SERVICE_UPDATING :int: goto L_0x026a;
            case com.google.android.gms.common.ConnectionResult.SERVICE_MISSING_PERMISSION :int: goto L_0x01d5;
            default: goto L_0x01cb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d4, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d9, code lost:
        if (r26.isEmpty() != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01db, code lost:
        r0 = new g.e.a.b.e.c.f();
        r1 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e8, code lost:
        if (r1.hasNext() == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ea, code lost:
        r2 = r25.b((g.e.a.b.e.c.p) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f8, code lost:
        if ((r2 instanceof g.e.a.b.e.c.h) != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fa, code lost:
        r0.A(r0.r(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0209, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x020a, code lost:
        r1 = r0.r();
        r2 = x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0216, code lost:
        if (r2.hasNext() == false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0218, code lost:
        r3 = (java.lang.Integer) r2.next();
        r0.A(r3.intValue() + r1, v(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0231, code lost:
        r5 = r23;
        r5.b.clear();
        r1 = r0.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0240, code lost:
        if (r1.hasNext() == false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0242, code lost:
        r2 = (java.lang.Integer) r1.next();
        r5.A(r2.intValue(), r0.v(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0258, code lost:
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x025a, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf((double) r()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026a, code lost:
        r5 = r23;
        g.e.a.b.b.h.e.a0(r7, 0, r26);
        r0 = new g.e.a.b.e.c.t(r5.w(","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027f, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x028a, code lost:
        if (r26.isEmpty() == false) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x028c, code lost:
        r0 = new g.e.a.b.e.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0293, code lost:
        r4 = (int) g.e.a.b.b.h.e.q(r3.b((g.e.a.b.e.c.p) r1.get(0)).d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02aa, code lost:
        if (r4 >= 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ac, code lost:
        r4 = java.lang.Math.max(0, r() + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ba, code lost:
        if (r4 <= r()) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02bc, code lost:
        r4 = r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02c0, code lost:
        r0 = r();
        r6 = new g.e.a.b.e.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ce, code lost:
        if (r26.size() <= 1) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d0, code lost:
        r2 = java.lang.Math.max(0, (int) g.e.a.b.b.h.e.q(r3.b((g.e.a.b.e.c.p) r1.get(1)).d().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ec, code lost:
        if (r2 <= 0) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ee, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f5, code lost:
        if (r7 >= java.lang.Math.min(r0, r4 + r2)) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02f7, code lost:
        r6.A(r6.r(), r5.v(r4));
        r5.z(r4);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x030d, code lost:
        if (r26.size() <= 2) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x030f, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0314, code lost:
        if (r9 >= r26.size()) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0316, code lost:
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0322, code lost:
        if ((r0 instanceof g.e.a.b.e.c.h) != false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0324, code lost:
        r2 = (r4 + r9) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0328, code lost:
        if (r2 < 0) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x032e, code lost:
        if (r2 < r()) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        r7 = ((java.lang.Integer) r5.b.lastKey()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x033d, code lost:
        if (r7 < r2) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x033f, code lost:
        r8 = r5.b;
        r10 = java.lang.Integer.valueOf(r7);
        r8 = (g.e.a.b.e.c.p) r8.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x034b, code lost:
        if (r8 == null) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x034d, code lost:
        r5.A(r7 + 1, r8);
        r5.b.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0357, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035a, code lost:
        r5.A(r2, r0);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0360, code lost:
        r1 = new java.lang.StringBuilder(32);
        r1.append("Invalid value index: ");
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0378, code lost:
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0380, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0381, code lost:
        if (r4 >= r0) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0383, code lost:
        r6.A(r6.r(), r5.v(r4));
        r5.A(r4, (g.e.a.b.e.c.p) null);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0394, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0397, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.e0("sort", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a6, code lost:
        if (r() >= 2) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03aa, code lost:
        r0 = y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b2, code lost:
        if (r26.isEmpty() != false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03b4, code lost:
        r1 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03c1, code lost:
        if ((r1 instanceof g.e.a.b.e.c.j) == false) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03c3, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03ce, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03cf, code lost:
        java.util.Collections.sort(r0, new g.e.a.b.e.c.b0(r2, r3));
        r5.b.clear();
        r0 = ((java.util.ArrayList) r0).iterator();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03e7, code lost:
        if (r0.hasNext() == false) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03e9, code lost:
        r5.A(r9, (g.e.a.b.e.c.p) r0.next());
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03f6, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.a0("some", 1, r1);
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040d, code lost:
        if ((r0 instanceof g.e.a.b.e.c.j) == false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0413, code lost:
        if (r() != 0) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0416, code lost:
        r0 = (g.e.a.b.e.c.j) r0;
        r1 = x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0420, code lost:
        if (r1.hasNext() == false) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0422, code lost:
        r2 = ((java.lang.Integer) r1.next()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0430, code lost:
        if (r5.B(r2) == false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x045c, code lost:
        if (r0.a(r3, java.util.Arrays.asList(new g.e.a.b.e.c.p[]{r5.v(r2), new g.e.a.b.e.c.i(java.lang.Double.valueOf((double) r2)), r5})).m().booleanValue() == false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x045e, code lost:
        r0 = g.e.a.b.e.c.p.J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0462, code lost:
        r0 = g.e.a.b.e.c.p.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x046b, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x046c, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.e0(r0, 2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x047a, code lost:
        if (r26.isEmpty() == false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x047c, code lost:
        r0 = l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0482, code lost:
        r6 = (double) r();
        r8 = g.e.a.b.b.h.e.q(r3.b((g.e.a.b.e.c.p) r1.get(0)).d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04a2, code lost:
        if (r8 >= 0.0d) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04a4, code lost:
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r6);
        r8 = java.lang.Math.max(r8 + r6, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04b0, code lost:
        r8 = java.lang.Math.min(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04b9, code lost:
        if (r26.size() != 2) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04bb, code lost:
        r0 = g.e.a.b.b.h.e.q(r3.b((g.e.a.b.e.c.p) r1.get(1)).d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d6, code lost:
        if (r0 >= 0.0d) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d8, code lost:
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r6);
        r6 = java.lang.Math.max(r6 + r0, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e4, code lost:
        r6 = java.lang.Math.min(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04e8, code lost:
        r0 = new g.e.a.b.e.c.f();
        r1 = (int) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04f1, code lost:
        if (((double) r1) >= r6) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04f3, code lost:
        r0.A(r0.r(), r5.v(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0501, code lost:
        r5 = r23;
        g.e.a.b.b.h.e.a0(r21, 0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x050f, code lost:
        if (r() != 0) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0513, code lost:
        r0 = r5.v(0);
        r5.z(0);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x051b, code lost:
        r5 = r23;
        g.e.a.b.b.h.e.a0("reverse", 0, r26);
        r0 = r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0527, code lost:
        if (r0 == 0) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0529, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x052c, code lost:
        if (r9 >= (r0 / 2)) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0532, code lost:
        if (r5.B(r9) == false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0534, code lost:
        r1 = r5.v(r9);
        r5.A(r9, (g.e.a.b.e.c.p) null);
        r3 = (r0 - 1) - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0542, code lost:
        if (r5.B(r3) == false) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0544, code lost:
        r5.A(r9, r5.v(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x054b, code lost:
        r5.A(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x054e, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0551, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0554, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x055c, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0563, code lost:
        r0 = g.e.a.b.b.h.e.M(r5, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0567, code lost:
        r22 = r5;
        r5 = r0;
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x056e, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0578, code lost:
        if (r26.isEmpty() != false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x057a, code lost:
        r0 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0582, code lost:
        if (r0.hasNext() == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0584, code lost:
        r5.A(r(), r3.b((g.e.a.b.e.c.p) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0596, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf((double) r()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05a5, code lost:
        r5 = r23;
        g.e.a.b.b.h.e.a0("pop", 0, r26);
        r0 = r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b1, code lost:
        if (r0 != 0) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05b5, code lost:
        r0 = r0 - 1;
        r1 = r5.v(r0);
        r5.z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05be, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05c0, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.a0("map", 1, r1);
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05d7, code lost:
        if ((r0 instanceof g.e.a.b.e.c.o) == false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05dd, code lost:
        if (r() != 0) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05df, code lost:
        r0 = new g.e.a.b.e.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05e5, code lost:
        r0 = g.e.a.b.b.h.e.E(r5, r3, (g.e.a.b.e.c.o) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05f2, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05f3, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.e0("lastIndexOf", 2, r1);
        r0 = g.e.a.b.e.c.p.E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0603, code lost:
        if (r26.isEmpty() != false) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0605, code lost:
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0610, code lost:
        r6 = (double) (r() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x061c, code lost:
        if (r26.size() <= 1) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x061e, code lost:
        r1 = r3.b((g.e.a.b.e.c.p) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0634, code lost:
        if (java.lang.Double.isNaN(r1.d().doubleValue()) == false) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0636, code lost:
        r1 = (double) (r() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x063e, code lost:
        r1 = g.e.a.b.b.h.e.q(r1.d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x064a, code lost:
        r6 = r1;
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x064f, code lost:
        if (r6 >= 0.0d) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0651, code lost:
        r3 = (double) r();
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r3);
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x065e, code lost:
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0662, code lost:
        if (r6 >= r1) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0664, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x066f, code lost:
        r1 = (int) java.lang.Math.min((double) r(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0679, code lost:
        if (r1 < 0) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x067f, code lost:
        if (r5.B(r1) == false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0689, code lost:
        if (g.e.a.b.b.h.e.i0(r5.v(r1), r0) == false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x068b, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf((double) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0697, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x069a, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06a5, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.e0("join", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06b3, code lost:
        if (r() != 0) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06b5, code lost:
        r0 = g.e.a.b.e.c.p.L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06bd, code lost:
        if (r26.size() <= 0) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06bf, code lost:
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06cc, code lost:
        if ((r0 instanceof g.e.a.b.e.c.n) != false) goto L_0x06d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06d0, code lost:
        if ((r0 instanceof g.e.a.b.e.c.u) == false) goto L_0x06d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06d3, code lost:
        r0 = r0.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06d8, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06db, code lost:
        r0 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06dd, code lost:
        r1 = new g.e.a.b.e.c.t(r5.w(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06e8, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.e0("indexOf", 2, r1);
        r0 = g.e.a.b.e.c.p.E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06f8, code lost:
        if (r26.isEmpty() != false) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06fa, code lost:
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x070a, code lost:
        if (r26.size() <= 1) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x070c, code lost:
        r1 = g.e.a.b.b.h.e.q(r3.b((g.e.a.b.e.c.p) r1.get(1)).d().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0729, code lost:
        if (r1 < ((double) r())) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x072b, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x073a, code lost:
        if (r1 >= 0.0d) goto L_0x074a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x073c, code lost:
        r3 = (double) r();
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r3);
        r2 = r3 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x074a, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x074c, code lost:
        r2 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x074f, code lost:
        r1 = x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0757, code lost:
        if (r1.hasNext() == false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0759, code lost:
        r4 = ((java.lang.Integer) r1.next()).intValue();
        r6 = (double) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0766, code lost:
        if (r6 < r2) goto L_0x0753;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0770, code lost:
        if (g.e.a.b.b.h.e.i0(r5.v(r4), r0) == false) goto L_0x0753;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0772, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x077d, code lost:
        r0 = new g.e.a.b.e.c.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0788, code lost:
        r5 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.a0("forEach", 1, r1);
        r0 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x079f, code lost:
        if ((r0 instanceof g.e.a.b.e.c.o) == false) goto L_0x07b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07a7, code lost:
        if (r5.b.size() != 0) goto L_0x07aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07aa, code lost:
        g.e.a.b.b.h.e.E(r5, r3, (g.e.a.b.e.c.o) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07af, code lost:
        r0 = g.e.a.b.e.c.p.E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07b8, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07b9, code lost:
        r0 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.a0(r5, 1, r1);
        r1 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07d0, code lost:
        if ((r1 instanceof g.e.a.b.e.c.o) == false) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07d8, code lost:
        if (r0.b.size() != 0) goto L_0x07e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07da, code lost:
        r1 = new g.e.a.b.e.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07e2, code lost:
        r4 = l();
        r1 = g.e.a.b.b.h.e.E(r0, r3, (g.e.a.b.e.c.o) r1, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new g.e.a.b.e.c.f();
        r1 = r1.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07fb, code lost:
        if (r1.hasNext() == false) goto L_0x0816;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07fd, code lost:
        r2.A(r2.r(), ((g.e.a.b.e.c.f) r4).v(((java.lang.Integer) r1.next()).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x081e, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x081f, code lost:
        r0 = r23;
        r3 = r25;
        r1 = r26;
        g.e.a.b.b.h.e.a0(r20, 1, r1);
        r1 = r3.b((g.e.a.b.e.c.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0838, code lost:
        if ((r1 instanceof g.e.a.b.e.c.o) == false) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x083e, code lost:
        if (r() != 0) goto L_0x0841;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0853, code lost:
        if (g.e.a.b.b.h.e.E(r0, r3, (g.e.a.b.e.c.o) r1, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).r() == r()) goto L_0x0858;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0855, code lost:
        r1 = g.e.a.b.e.c.p.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0858, code lost:
        r1 = g.e.a.b.e.c.p.J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0860, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0861, code lost:
        r0 = r23;
        r3 = r25;
        r1 = r26;
        r5 = l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x086f, code lost:
        if (r26.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0871, code lost:
        r1 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0879, code lost:
        if (r1.hasNext() == false) goto L_0x08c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x087b, code lost:
        r2 = r3.b((g.e.a.b.e.c.p) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0887, code lost:
        if ((r2 instanceof g.e.a.b.e.c.h) != false) goto L_0x08bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0889, code lost:
        r4 = (g.e.a.b.e.c.f) r5;
        r6 = r4.r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0892, code lost:
        if ((r2 instanceof g.e.a.b.e.c.f) == false) goto L_0x08b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0894, code lost:
        r2 = (g.e.a.b.e.c.f) r2;
        r7 = r2.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x089e, code lost:
        if (r7.hasNext() == false) goto L_0x0875;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08a0, code lost:
        r8 = (java.lang.Integer) r7.next();
        r4.A(r8.intValue() + r6, r2.v(r8.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08b7, code lost:
        r4.A(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08c2, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0567, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r7 = r17;
        r5 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0187  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.e.c.p i(java.lang.String r24, g.e.a.b.e.c.h4 r25, java.util.List r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "splice"
            java.lang.String r7 = "reduce"
            java.lang.String r8 = "toString"
            java.lang.String r9 = "filter"
            java.lang.String r10 = "forEach"
            java.lang.String r11 = "lastIndexOf"
            java.lang.String r12 = "map"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "join"
            java.lang.String r15 = "some"
            r16 = r4
            java.lang.String r4 = "sort"
            java.lang.String r0 = "every"
            java.lang.String r2 = "shift"
            java.lang.String r3 = "slice"
            r17 = r8
            java.lang.String r8 = "reverse"
            r18 = r6
            java.lang.String r6 = "indexOf"
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00d4
            java.lang.String r5 = "push"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00d4
            java.lang.String r5 = "reduceRight"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00d4
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00d4
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00d6
            r18 = r0
            r0 = r17
            boolean r17 = r0.equals(r1)
            if (r17 != 0) goto L_0x00cd
            r17 = r2
            java.lang.String r2 = "unshift"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00bd
            r2 = r18
            r22 = r17
            r17 = r0
            goto L_0x00d9
        L_0x00bd:
            g.e.a.b.e.c.t r0 = new g.e.a.b.e.c.t
            r0.<init>(r1)
            r2 = r23
            r3 = r25
            r1 = r26
            g.e.a.b.e.c.p r0 = g.e.a.b.b.h.e.s(r2, r0, r3, r1)
            return r0
        L_0x00cd:
            r17 = r0
            r0 = r3
            r3 = r2
            r2 = r18
            goto L_0x00dc
        L_0x00d4:
            r5 = r18
        L_0x00d6:
            r22 = r2
            r2 = r0
        L_0x00d9:
            r0 = r3
            r3 = r22
        L_0x00dc:
            int r18 = r24.hashCode()
            r19 = -1
            r20 = r9
            switch(r18) {
                case -1776922004: goto L_0x01b1;
                case -1354795244: goto L_0x01a0;
                case -1274492040: goto L_0x0194;
                case -934873754: goto L_0x0187;
                case -895859076: goto L_0x017e;
                case -678635926: goto L_0x0176;
                case -467511597: goto L_0x016e;
                case -277637751: goto L_0x0163;
                case 107868: goto L_0x015b;
                case 111185: goto L_0x0152;
                case 3267882: goto L_0x014a;
                case 3452698: goto L_0x013f;
                case 3536116: goto L_0x0136;
                case 3536286: goto L_0x012d;
                case 96891675: goto L_0x0120;
                case 109407362: goto L_0x0116;
                case 109526418: goto L_0x010c;
                case 965561430: goto L_0x0100;
                case 1099846370: goto L_0x00f6;
                case 1943291465: goto L_0x00ed;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            r7 = r17
            r5 = r20
            goto L_0x01be
        L_0x00ed:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e7
            r1 = 4
            goto L_0x018f
        L_0x00f6:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00e7
            r1 = 12
            goto L_0x018f
        L_0x0100:
            java.lang.String r5 = "reduceRight"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00e7
            r1 = 11
            goto L_0x018f
        L_0x010c:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00e7
            r1 = 14
            goto L_0x018f
        L_0x0116:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e7
            r1 = 13
            goto L_0x018f
        L_0x0120:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e7
            r7 = r17
            r5 = r20
            r1 = 1
            goto L_0x01bf
        L_0x012d:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00e7
            r1 = 16
            goto L_0x018f
        L_0x0136:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00e7
            r1 = 15
            goto L_0x018f
        L_0x013f:
            java.lang.String r5 = "push"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00e7
            r1 = 9
            goto L_0x018f
        L_0x014a:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00e7
            r1 = 5
            goto L_0x018f
        L_0x0152:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00e7
            r1 = 8
            goto L_0x018f
        L_0x015b:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00e7
            r1 = 7
            goto L_0x018f
        L_0x0163:
            java.lang.String r5 = "unshift"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00e7
            r1 = 19
            goto L_0x018f
        L_0x016e:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00e7
            r1 = 6
            goto L_0x018f
        L_0x0176:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00e7
            r1 = 3
            goto L_0x018f
        L_0x017e:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00e7
            r1 = 17
            goto L_0x018f
        L_0x0187:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00e7
            r1 = 10
        L_0x018f:
            r7 = r17
            r5 = r20
            goto L_0x01bf
        L_0x0194:
            r5 = r20
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01ae
            r7 = r17
            r1 = 2
            goto L_0x01bf
        L_0x01a0:
            r7 = r16
            r5 = r20
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x01ae
            r7 = r17
            r1 = 0
            goto L_0x01bf
        L_0x01ae:
            r7 = r17
            goto L_0x01be
        L_0x01b1:
            r7 = r17
            r5 = r20
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x01be
            r1 = 18
            goto L_0x01bf
        L_0x01be:
            r1 = -1
        L_0x01bf:
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r9 = "Callback should be a method"
            r20 = r2
            r21 = r3
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0861;
                case 1: goto L_0x081f;
                case 2: goto L_0x07b9;
                case 3: goto L_0x0788;
                case 4: goto L_0x06e8;
                case 5: goto L_0x06a5;
                case 6: goto L_0x05f3;
                case 7: goto L_0x05c0;
                case 8: goto L_0x05a5;
                case 9: goto L_0x056e;
                case 10: goto L_0x055c;
                case 11: goto L_0x0554;
                case 12: goto L_0x051b;
                case 13: goto L_0x0501;
                case 14: goto L_0x046c;
                case 15: goto L_0x03f6;
                case 16: goto L_0x0397;
                case 17: goto L_0x027f;
                case 18: goto L_0x026a;
                case 19: goto L_0x01d5;
                default: goto L_0x01cb;
            }
        L_0x01cb:
            r0 = r23
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x01d5:
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x0258
            g.e.a.b.e.c.f r0 = new g.e.a.b.e.c.f
            r0.<init>()
            java.util.Iterator r1 = r26.iterator()
        L_0x01e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x020a
            java.lang.Object r2 = r1.next()
            g.e.a.b.e.c.p r2 = (g.e.a.b.e.c.p) r2
            r3 = r25
            g.e.a.b.e.c.p r2 = r3.b(r2)
            boolean r4 = r2 instanceof g.e.a.b.e.c.h
            if (r4 != 0) goto L_0x0202
            int r4 = r0.r()
            r0.A(r4, r2)
            goto L_0x01e4
        L_0x0202:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x020a:
            int r1 = r0.r()
            java.util.Iterator r2 = r23.x()
        L_0x0212:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0231
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r5 = r23
            g.e.a.b.e.c.p r3 = r5.v(r3)
            r0.A(r4, r3)
            goto L_0x0212
        L_0x0231:
            r5 = r23
            java.util.SortedMap r1 = r5.b
            r1.clear()
            java.util.Iterator r1 = r0.x()
        L_0x023c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x025a
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            g.e.a.b.e.c.p r2 = r0.v(r2)
            r5.A(r3, r2)
            goto L_0x023c
        L_0x0258:
            r5 = r23
        L_0x025a:
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            int r1 = r23.r()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x0567
        L_0x026a:
            r0 = 0
            r5 = r23
            r1 = r26
            g.e.a.b.b.h.e.a0(r7, r0, r1)
            g.e.a.b.e.c.t r0 = new g.e.a.b.e.c.t
            java.lang.String r1 = ","
            java.lang.String r1 = r5.w(r1)
            r0.<init>(r1)
            goto L_0x0567
        L_0x027f:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 0
            boolean r4 = r26.isEmpty()
            if (r4 == 0) goto L_0x0293
            g.e.a.b.e.c.f r0 = new g.e.a.b.e.c.f
            r0.<init>()
            goto L_0x0567
        L_0x0293:
            java.lang.Object r4 = r1.get(r0)
            g.e.a.b.e.c.p r4 = (g.e.a.b.e.c.p) r4
            g.e.a.b.e.c.p r4 = r3.b(r4)
            java.lang.Double r4 = r4.d()
            double r6 = r4.doubleValue()
            double r6 = g.e.a.b.b.h.e.q(r6)
            int r4 = (int) r6
            if (r4 >= 0) goto L_0x02b6
            int r6 = r23.r()
            int r6 = r6 + r4
            int r4 = java.lang.Math.max(r0, r6)
            goto L_0x02c0
        L_0x02b6:
            int r0 = r23.r()
            if (r4 <= r0) goto L_0x02c0
            int r4 = r23.r()
        L_0x02c0:
            int r0 = r23.r()
            g.e.a.b.e.c.f r6 = new g.e.a.b.e.c.f
            r6.<init>()
            int r7 = r26.size()
            r8 = 1
            if (r7 <= r8) goto L_0x0381
            java.lang.Object r2 = r1.get(r8)
            g.e.a.b.e.c.p r2 = (g.e.a.b.e.c.p) r2
            g.e.a.b.e.c.p r2 = r3.b(r2)
            java.lang.Double r2 = r2.d()
            double r7 = r2.doubleValue()
            double r7 = g.e.a.b.b.h.e.q(r7)
            int r2 = (int) r7
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            if (r2 <= 0) goto L_0x0308
            r7 = r4
        L_0x02ef:
            int r8 = r4 + r2
            int r8 = java.lang.Math.min(r0, r8)
            if (r7 >= r8) goto L_0x0308
            g.e.a.b.e.c.p r8 = r5.v(r4)
            int r9 = r6.r()
            r6.A(r9, r8)
            r5.z(r4)
            int r7 = r7 + 1
            goto L_0x02ef
        L_0x0308:
            int r0 = r26.size()
            r2 = 2
            if (r0 <= r2) goto L_0x0394
            r9 = 2
        L_0x0310:
            int r0 = r26.size()
            if (r9 >= r0) goto L_0x0394
            java.lang.Object r0 = r1.get(r9)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
            boolean r2 = r0 instanceof g.e.a.b.e.c.h
            if (r2 != 0) goto L_0x0379
            int r2 = r4 + r9
            int r2 = r2 + -2
            if (r2 < 0) goto L_0x0360
            int r7 = r23.r()
            if (r2 < r7) goto L_0x0331
            goto L_0x035a
        L_0x0331:
            java.util.SortedMap r7 = r5.b
            java.lang.Object r7 = r7.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x033d:
            if (r7 < r2) goto L_0x035a
            java.util.SortedMap r8 = r5.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r8.get(r10)
            g.e.a.b.e.c.p r8 = (g.e.a.b.e.c.p) r8
            if (r8 == 0) goto L_0x0357
            int r11 = r7 + 1
            r5.A(r11, r8)
            java.util.SortedMap r8 = r5.b
            r8.remove(r10)
        L_0x0357:
            int r7 = r7 + -1
            goto L_0x033d
        L_0x035a:
            r5.A(r2, r0)
            int r9 = r9 + 1
            goto L_0x0310
        L_0x0360:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 32
            r1.<init>(r3)
            java.lang.String r3 = "Invalid value index: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0379:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x0381:
            if (r4 >= r0) goto L_0x0394
            g.e.a.b.e.c.p r1 = r5.v(r4)
            int r3 = r6.r()
            r6.A(r3, r1)
            r5.A(r4, r2)
            int r4 = r4 + 1
            goto L_0x0381
        L_0x0394:
            r0 = r6
            goto L_0x0567
        L_0x0397:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 1
            g.e.a.b.b.h.e.e0(r4, r0, r1)
            int r0 = r23.r()
            r4 = 2
            if (r0 >= r4) goto L_0x03aa
            goto L_0x0551
        L_0x03aa:
            java.util.List r0 = r23.y()
            boolean r4 = r26.isEmpty()
            if (r4 != 0) goto L_0x03cf
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r3.b(r1)
            boolean r2 = r1 instanceof g.e.a.b.e.c.j
            if (r2 == 0) goto L_0x03c7
            r2 = r1
            g.e.a.b.e.c.j r2 = (g.e.a.b.e.c.j) r2
            goto L_0x03cf
        L_0x03c7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x03cf:
            g.e.a.b.e.c.b0 r1 = new g.e.a.b.e.c.b0
            r1.<init>(r2, r3)
            java.util.Collections.sort(r0, r1)
            java.util.SortedMap r1 = r5.b
            r1.clear()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x03e3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0551
            int r1 = r9 + 1
            java.lang.Object r2 = r0.next()
            g.e.a.b.e.c.p r2 = (g.e.a.b.e.c.p) r2
            r5.A(r9, r2)
            r9 = r1
            goto L_0x03e3
        L_0x03f6:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 1
            g.e.a.b.b.h.e.a0(r15, r0, r1)
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r0 = r3.b(r1)
            boolean r1 = r0 instanceof g.e.a.b.e.c.j
            if (r1 == 0) goto L_0x0466
            int r1 = r23.r()
            if (r1 != 0) goto L_0x0416
            goto L_0x0462
        L_0x0416:
            g.e.a.b.e.c.j r0 = (g.e.a.b.e.c.j) r0
            java.util.Iterator r1 = r23.x()
        L_0x041c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0462
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r5.B(r2)
            if (r4 == 0) goto L_0x041c
            r4 = 3
            g.e.a.b.e.c.p[] r4 = new g.e.a.b.e.c.p[r4]
            g.e.a.b.e.c.p r6 = r5.v(r2)
            r7 = 0
            r4[r7] = r6
            g.e.a.b.e.c.i r6 = new g.e.a.b.e.c.i
            double r7 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
            r6.<init>(r2)
            r2 = 1
            r4[r2] = r6
            r2 = 2
            r4[r2] = r5
            java.util.List r2 = java.util.Arrays.asList(r4)
            g.e.a.b.e.c.p r2 = r0.a(r3, r2)
            java.lang.Boolean r2 = r2.m()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x041c
            g.e.a.b.e.c.p r0 = g.e.a.b.e.c.p.J
            goto L_0x0567
        L_0x0462:
            g.e.a.b.e.c.p r0 = g.e.a.b.e.c.p.K
            goto L_0x0567
        L_0x0466:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x046c:
            r5 = r23
            r3 = r25
            r1 = r26
            r2 = 2
            g.e.a.b.b.h.e.e0(r0, r2, r1)
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x0482
            g.e.a.b.e.c.p r0 = r23.l()
            goto L_0x0567
        L_0x0482:
            int r0 = r23.r()
            double r6 = (double) r0
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
            java.lang.Double r0 = r0.d()
            double r8 = r0.doubleValue()
            double r8 = g.e.a.b.b.h.e.q(r8)
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x04b0
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r8 = r8 + r6
            double r8 = java.lang.Math.max(r8, r10)
            goto L_0x04b4
        L_0x04b0:
            double r8 = java.lang.Math.min(r8, r6)
        L_0x04b4:
            int r0 = r26.size()
            r2 = 2
            if (r0 != r2) goto L_0x04e8
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
            java.lang.Double r0 = r0.d()
            double r0 = r0.doubleValue()
            double r0 = g.e.a.b.b.h.e.q(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x04e4
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r6 = r6 + r0
            double r6 = java.lang.Math.max(r6, r2)
            goto L_0x04e8
        L_0x04e4:
            double r6 = java.lang.Math.min(r6, r0)
        L_0x04e8:
            g.e.a.b.e.c.f r0 = new g.e.a.b.e.c.f
            r0.<init>()
            int r1 = (int) r8
        L_0x04ee:
            double r2 = (double) r1
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0567
            g.e.a.b.e.c.p r2 = r5.v(r1)
            int r3 = r0.r()
            r0.A(r3, r2)
            int r1 = r1 + 1
            goto L_0x04ee
        L_0x0501:
            r3 = 0
            r5 = r23
            r1 = r26
            r0 = r21
            g.e.a.b.b.h.e.a0(r0, r3, r1)
            int r0 = r23.r()
            if (r0 != 0) goto L_0x0513
            goto L_0x07af
        L_0x0513:
            g.e.a.b.e.c.p r0 = r5.v(r3)
            r5.z(r3)
            goto L_0x0567
        L_0x051b:
            r3 = 0
            r5 = r23
            r1 = r26
            g.e.a.b.b.h.e.a0(r8, r3, r1)
            int r0 = r23.r()
            if (r0 == 0) goto L_0x0551
            r9 = 0
        L_0x052a:
            int r1 = r0 / 2
            if (r9 >= r1) goto L_0x0551
            boolean r1 = r5.B(r9)
            if (r1 == 0) goto L_0x054e
            g.e.a.b.e.c.p r1 = r5.v(r9)
            r5.A(r9, r2)
            int r3 = r0 + -1
            int r3 = r3 - r9
            boolean r4 = r5.B(r3)
            if (r4 == 0) goto L_0x054b
            g.e.a.b.e.c.p r4 = r5.v(r3)
            r5.A(r9, r4)
        L_0x054b:
            r5.A(r3, r1)
        L_0x054e:
            int r9 = r9 + 1
            goto L_0x052a
        L_0x0551:
            r0 = r5
            goto L_0x08c3
        L_0x0554:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 0
            goto L_0x0563
        L_0x055c:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 1
        L_0x0563:
            g.e.a.b.e.c.p r0 = g.e.a.b.b.h.e.M(r5, r3, r1, r0)
        L_0x0567:
            r22 = r5
            r5 = r0
            r0 = r22
            goto L_0x08c3
        L_0x056e:
            r5 = r23
            r3 = r25
            r1 = r26
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x0596
            java.util.Iterator r0 = r26.iterator()
        L_0x057e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0596
            java.lang.Object r1 = r0.next()
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r3.b(r1)
            int r2 = r23.r()
            r5.A(r2, r1)
            goto L_0x057e
        L_0x0596:
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            int r1 = r23.r()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x0567
        L_0x05a5:
            r0 = 0
            r5 = r23
            r1 = r26
            g.e.a.b.b.h.e.a0(r13, r0, r1)
            int r0 = r23.r()
            if (r0 != 0) goto L_0x05b5
            goto L_0x07af
        L_0x05b5:
            int r0 = r0 + -1
            g.e.a.b.e.c.p r1 = r5.v(r0)
            r5.z(r0)
        L_0x05be:
            r0 = r1
            goto L_0x0567
        L_0x05c0:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 0
            r4 = 1
            g.e.a.b.b.h.e.a0(r12, r4, r1)
            java.lang.Object r0 = r1.get(r0)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
            boolean r1 = r0 instanceof g.e.a.b.e.c.o
            if (r1 == 0) goto L_0x05ed
            int r1 = r23.r()
            if (r1 != 0) goto L_0x05e5
            g.e.a.b.e.c.f r0 = new g.e.a.b.e.c.f
            r0.<init>()
            goto L_0x0567
        L_0x05e5:
            g.e.a.b.e.c.o r0 = (g.e.a.b.e.c.o) r0
            g.e.a.b.e.c.f r0 = g.e.a.b.b.h.e.E(r5, r3, r0, r2, r2)
            goto L_0x0567
        L_0x05ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x05f3:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 2
            g.e.a.b.b.h.e.e0(r11, r0, r1)
            g.e.a.b.e.c.p r0 = g.e.a.b.e.c.p.E
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x0610
            r2 = 0
            java.lang.Object r0 = r1.get(r2)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
        L_0x0610:
            int r2 = r23.r()
            int r2 = r2 + -1
            double r6 = (double) r2
            int r2 = r26.size()
            r4 = 1
            if (r2 <= r4) goto L_0x065e
            java.lang.Object r1 = r1.get(r4)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r3.b(r1)
            java.lang.Double r2 = r1.d()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x063e
            int r1 = r23.r()
            int r1 = r1 + -1
            double r1 = (double) r1
            goto L_0x064a
        L_0x063e:
            java.lang.Double r1 = r1.d()
            double r1 = r1.doubleValue()
            double r1 = g.e.a.b.b.h.e.q(r1)
        L_0x064a:
            r6 = r1
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0660
            int r3 = r23.r()
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r3)
            double r6 = r6 + r3
            goto L_0x0660
        L_0x065e:
            r1 = 0
        L_0x0660:
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x066f
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0567
        L_0x066f:
            int r1 = r23.r()
            double r1 = (double) r1
            double r1 = java.lang.Math.min(r1, r6)
            int r1 = (int) r1
        L_0x0679:
            if (r1 < 0) goto L_0x069a
            boolean r2 = r5.B(r1)
            if (r2 == 0) goto L_0x0697
            g.e.a.b.e.c.p r2 = r5.v(r1)
            boolean r2 = g.e.a.b.b.h.e.i0(r2, r0)
            if (r2 == 0) goto L_0x0697
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x0567
        L_0x0697:
            int r1 = r1 + -1
            goto L_0x0679
        L_0x069a:
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0567
        L_0x06a5:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 1
            g.e.a.b.b.h.e.e0(r14, r0, r1)
            int r0 = r23.r()
            if (r0 != 0) goto L_0x06b9
            g.e.a.b.e.c.p r0 = g.e.a.b.e.c.p.L
            goto L_0x0567
        L_0x06b9:
            int r0 = r26.size()
            if (r0 <= 0) goto L_0x06db
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
            boolean r1 = r0 instanceof g.e.a.b.e.c.n
            if (r1 != 0) goto L_0x06d8
            boolean r1 = r0 instanceof g.e.a.b.e.c.u
            if (r1 == 0) goto L_0x06d3
            goto L_0x06d8
        L_0x06d3:
            java.lang.String r0 = r0.e()
            goto L_0x06dd
        L_0x06d8:
            java.lang.String r0 = ""
            goto L_0x06dd
        L_0x06db:
            java.lang.String r0 = ","
        L_0x06dd:
            g.e.a.b.e.c.t r1 = new g.e.a.b.e.c.t
            java.lang.String r0 = r5.w(r0)
            r1.<init>(r0)
            goto L_0x05be
        L_0x06e8:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 2
            g.e.a.b.b.h.e.e0(r6, r0, r1)
            g.e.a.b.e.c.p r0 = g.e.a.b.e.c.p.E
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x0705
            r2 = 0
            java.lang.Object r0 = r1.get(r2)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
        L_0x0705:
            int r2 = r26.size()
            r4 = 1
            if (r2 <= r4) goto L_0x074c
            java.lang.Object r1 = r1.get(r4)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r3.b(r1)
            java.lang.Double r1 = r1.d()
            double r1 = r1.doubleValue()
            double r1 = g.e.a.b.b.h.e.q(r1)
            int r3 = r23.r()
            double r3 = (double) r3
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0736
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0567
        L_0x0736:
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x074a
            int r3 = r23.r()
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r3)
            double r2 = r3 + r1
            goto L_0x074f
        L_0x074a:
            r2 = r1
            goto L_0x074f
        L_0x074c:
            r3 = 0
            r2 = r3
        L_0x074f:
            java.util.Iterator r1 = r23.x()
        L_0x0753:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x077d
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            double r6 = (double) r4
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0753
            g.e.a.b.e.c.p r4 = r5.v(r4)
            boolean r4 = g.e.a.b.b.h.e.i0(r4, r0)
            if (r4 == 0) goto L_0x0753
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
            r0.<init>(r1)
            goto L_0x0567
        L_0x077d:
            g.e.a.b.e.c.i r0 = new g.e.a.b.e.c.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x0567
        L_0x0788:
            r5 = r23
            r3 = r25
            r1 = r26
            r0 = 1
            g.e.a.b.b.h.e.a0(r10, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            g.e.a.b.e.c.p r0 = (g.e.a.b.e.c.p) r0
            g.e.a.b.e.c.p r0 = r3.b(r0)
            boolean r1 = r0 instanceof g.e.a.b.e.c.o
            if (r1 == 0) goto L_0x07b3
            java.util.SortedMap r1 = r5.b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x07aa
            goto L_0x07af
        L_0x07aa:
            g.e.a.b.e.c.o r0 = (g.e.a.b.e.c.o) r0
            g.e.a.b.b.h.e.E(r5, r3, r0, r2, r2)
        L_0x07af:
            g.e.a.b.e.c.p r0 = g.e.a.b.e.c.p.E
            goto L_0x0567
        L_0x07b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x07b9:
            r0 = r23
            r3 = r25
            r1 = r26
            r4 = 1
            g.e.a.b.b.h.e.a0(r5, r4, r1)
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r3.b(r1)
            boolean r4 = r1 instanceof g.e.a.b.e.c.o
            if (r4 == 0) goto L_0x0819
            java.util.SortedMap r4 = r0.b
            int r4 = r4.size()
            if (r4 != 0) goto L_0x07e2
            g.e.a.b.e.c.f r1 = new g.e.a.b.e.c.f
            r1.<init>()
        L_0x07df:
            r5 = r1
            goto L_0x08c3
        L_0x07e2:
            g.e.a.b.e.c.p r4 = r23.l()
            g.e.a.b.e.c.o r1 = (g.e.a.b.e.c.o) r1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            g.e.a.b.e.c.f r1 = g.e.a.b.b.h.e.E(r0, r3, r1, r2, r5)
            g.e.a.b.e.c.f r2 = new g.e.a.b.e.c.f
            r2.<init>()
            java.util.Iterator r1 = r1.x()
        L_0x07f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0816
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = r4
            g.e.a.b.e.c.f r5 = (g.e.a.b.e.c.f) r5
            g.e.a.b.e.c.p r3 = r5.v(r3)
            int r5 = r2.r()
            r2.A(r5, r3)
            goto L_0x07f7
        L_0x0816:
            r5 = r2
            goto L_0x08c3
        L_0x0819:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r9)
            throw r1
        L_0x081f:
            r0 = r23
            r3 = r25
            r1 = r26
            r2 = r20
            r4 = 1
            g.e.a.b.b.h.e.a0(r2, r4, r1)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            g.e.a.b.e.c.p r1 = (g.e.a.b.e.c.p) r1
            g.e.a.b.e.c.p r1 = r3.b(r1)
            boolean r2 = r1 instanceof g.e.a.b.e.c.o
            if (r2 == 0) goto L_0x085b
            int r2 = r23.r()
            if (r2 != 0) goto L_0x0841
            goto L_0x0858
        L_0x0841:
            g.e.a.b.e.c.o r1 = (g.e.a.b.e.c.o) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            g.e.a.b.e.c.f r1 = g.e.a.b.b.h.e.E(r0, r3, r1, r2, r4)
            int r1 = r1.r()
            int r2 = r23.r()
            if (r1 == r2) goto L_0x0858
            g.e.a.b.e.c.p r1 = g.e.a.b.e.c.p.K
            goto L_0x07df
        L_0x0858:
            g.e.a.b.e.c.p r1 = g.e.a.b.e.c.p.J
            goto L_0x07df
        L_0x085b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r9)
            throw r1
        L_0x0861:
            r0 = r23
            r3 = r25
            r1 = r26
            g.e.a.b.e.c.p r5 = r23.l()
            boolean r2 = r26.isEmpty()
            if (r2 != 0) goto L_0x08c3
            java.util.Iterator r1 = r26.iterator()
        L_0x0875:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x08c3
            java.lang.Object r2 = r1.next()
            g.e.a.b.e.c.p r2 = (g.e.a.b.e.c.p) r2
            g.e.a.b.e.c.p r2 = r3.b(r2)
            boolean r4 = r2 instanceof g.e.a.b.e.c.h
            if (r4 != 0) goto L_0x08bb
            r4 = r5
            g.e.a.b.e.c.f r4 = (g.e.a.b.e.c.f) r4
            int r6 = r4.r()
            boolean r7 = r2 instanceof g.e.a.b.e.c.f
            if (r7 == 0) goto L_0x08b7
            g.e.a.b.e.c.f r2 = (g.e.a.b.e.c.f) r2
            java.util.Iterator r7 = r2.x()
        L_0x089a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0875
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r9 = r8.intValue()
            int r8 = r8.intValue()
            g.e.a.b.e.c.p r8 = r2.v(r8)
            int r9 = r9 + r6
            r4.A(r9, r8)
            goto L_0x089a
        L_0x08b7:
            r4.A(r6, r2)
            goto L_0x0875
        L_0x08bb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed evaluation of arguments"
            r1.<init>(r2)
            throw r1
        L_0x08c3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.f.i(java.lang.String, g.e.a.b.e.c.h4, java.util.List):g.e.a.b.e.c.p");
    }

    public final Iterator iterator() {
        return new e(this);
    }

    public final p l() {
        Integer num;
        SortedMap sortedMap;
        p pVar;
        f fVar = new f();
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getValue() instanceof l) {
                sortedMap = fVar.b;
                num = (Integer) entry.getKey();
                pVar = (p) entry.getValue();
            } else {
                sortedMap = fVar.b;
                num = (Integer) entry.getKey();
                pVar = ((p) entry.getValue()).l();
            }
            sortedMap.put(num, pVar);
        }
        return fVar;
    }

    public final Boolean m() {
        return Boolean.TRUE;
    }

    public final void p(String str, p pVar) {
        if (pVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, pVar);
        }
    }

    public final int r() {
        if (this.b.isEmpty()) {
            return 0;
        }
        return ((Integer) this.b.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return w(",");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (g.e.a.b.e.c.p) r1.b.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.e.c.p v(int r2) {
        /*
            r1 = this;
            int r0 = r1.r()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.B(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            g.e.a.b.e.c.p r2 = (g.e.a.b.e.c.p) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            g.e.a.b.e.c.p r2 = g.e.a.b.e.c.p.E
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.f.v(int):g.e.a.b.e.c.p");
    }

    public final String w(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.b.isEmpty()) {
            for (int i2 = 0; i2 < r(); i2++) {
                p v = v(i2);
                sb.append(str);
                if (!(v instanceof u) && !(v instanceof n)) {
                    sb.append(v.e());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator x() {
        return this.b.keySet().iterator();
    }

    public final List y() {
        ArrayList arrayList = new ArrayList(r());
        for (int i2 = 0; i2 < r(); i2++) {
            arrayList.add(v(i2));
        }
        return arrayList;
    }

    public final void z(int i2) {
        int intValue = ((Integer) this.b.lastKey()).intValue();
        if (i2 <= intValue && i2 >= 0) {
            this.b.remove(Integer.valueOf(i2));
            if (i2 == intValue) {
                SortedMap sortedMap = this.b;
                int i3 = i2 - 1;
                Integer valueOf = Integer.valueOf(i3);
                if (!sortedMap.containsKey(valueOf) && i3 >= 0) {
                    this.b.put(valueOf, p.E);
                    return;
                }
                return;
            }
            while (true) {
                i2++;
                if (i2 <= ((Integer) this.b.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.b;
                    Integer valueOf2 = Integer.valueOf(i2);
                    p pVar = (p) sortedMap2.get(valueOf2);
                    if (pVar != null) {
                        this.b.put(Integer.valueOf(i2 - 1), pVar);
                        this.b.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
