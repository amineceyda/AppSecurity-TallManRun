package g.e.a.b.f.b;

import g.e.a.b.e.c.d3;
import g.e.a.b.e.c.x2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class aa {
    public final String a;
    public final int b;
    public Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f3110d;

    /* renamed from: e  reason: collision with root package name */
    public Long f3111e;

    /* renamed from: f  reason: collision with root package name */
    public Long f3112f;

    public aa(String str, int i2) {
        this.a = str;
        this.b = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        if (r8.compareTo(r5) <= 0) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean d(java.math.BigDecimal r8, g.e.a.b.e.c.x2 r9, double r10) {
        /*
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            boolean r0 = r9.y()
            r1 = 0
            if (r0 == 0) goto L_0x010b
            int r0 = r9.D()
            r2 = 1
            if (r0 != r2) goto L_0x0015
            goto L_0x010b
        L_0x0015:
            int r0 = r9.D()
            r3 = 5
            if (r0 != r3) goto L_0x002a
            boolean r0 = r9.C()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r9.B()
            if (r0 == 0) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            return r1
        L_0x002a:
            boolean r0 = r9.z()
            if (r0 != 0) goto L_0x0031
            return r1
        L_0x0031:
            int r0 = r9.D()
            int r4 = r9.D()
            if (r4 != r3) goto L_0x0066
            java.lang.String r4 = r9.w()
            boolean r4 = g.e.a.b.f.b.m9.L(r4)
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r9.v()
            boolean r4 = g.e.a.b.f.b.m9.L(r4)
            if (r4 != 0) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r5 = r9.w()     // Catch:{ NumberFormatException -> 0x0065 }
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x0065 }
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0065 }
            java.lang.String r9 = r9.v()     // Catch:{ NumberFormatException -> 0x0065 }
            r5.<init>(r9)     // Catch:{ NumberFormatException -> 0x0065 }
            r9 = r4
            r4 = r1
            goto L_0x007c
        L_0x0065:
            return r1
        L_0x0066:
            java.lang.String r4 = r9.u()
            boolean r4 = g.e.a.b.f.b.m9.L(r4)
            if (r4 != 0) goto L_0x0071
            return r1
        L_0x0071:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x010b }
            java.lang.String r9 = r9.u()     // Catch:{ NumberFormatException -> 0x010b }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x010b }
            r9 = r1
            r5 = r9
        L_0x007c:
            if (r0 != r3) goto L_0x0081
            if (r9 == 0) goto L_0x00fd
            goto L_0x0085
        L_0x0081:
            if (r4 != 0) goto L_0x0085
            goto L_0x00fd
        L_0x0085:
            int r0 = r0 + -1
            r3 = 0
            if (r0 == r2) goto L_0x00fb
            r6 = 2
            if (r0 == r6) goto L_0x00eb
            r7 = 3
            if (r0 == r7) goto L_0x00a4
            r10 = 4
            if (r0 == r10) goto L_0x0095
            goto L_0x00fd
        L_0x0095:
            if (r9 == 0) goto L_0x00fd
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00e5
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00a4:
            if (r4 != 0) goto L_0x00a7
            goto L_0x00fd
        L_0x00a7:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00de
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00e5
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00de:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x00fd
        L_0x00eb:
            if (r4 != 0) goto L_0x00ee
            goto L_0x00fd
        L_0x00ee:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x00fb:
            if (r4 != 0) goto L_0x00fe
        L_0x00fd:
            return r1
        L_0x00fe:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = 0
        L_0x0106:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x010b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.aa.d(java.math.BigDecimal, g.e.a.b.e.c.x2, double):java.lang.Boolean");
    }

    public static Boolean e(String str, d3 d3Var, f3 f3Var) {
        List<String> list;
        boolean z;
        Objects.requireNonNull(d3Var, "null reference");
        if (str == null || !d3Var.A() || d3Var.B() == 1) {
            return null;
        }
        if (d3Var.B() == 7) {
            if (d3Var.s() == 0) {
                return null;
            }
        } else if (!d3Var.z()) {
            return null;
        }
        int B = d3Var.B();
        boolean x = d3Var.x();
        String v = (x || B == 2 || B == 7) ? d3Var.v() : d3Var.v().toUpperCase(Locale.ENGLISH);
        if (d3Var.s() == 0) {
            list = null;
        } else {
            list = d3Var.w();
            if (!x) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = B == 2 ? v : null;
        if (B == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (v == null) {
            return null;
        }
        if (!x && B != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (B - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != x ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (f3Var == null) {
                        return null;
                    }
                    f3Var.f3139i.b("Invalid regular expression in REGEXP audience filter. expression", str2);
                    return null;
                }
            case 2:
                z = str.startsWith(v);
                break;
            case 3:
                z = str.endsWith(v);
                break;
            case 4:
                z = str.contains(v);
                break;
            case 5:
                z = str.equals(v);
                break;
            case 6:
                if (list != null) {
                    z = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean f(long j2, x2 x2Var) {
        try {
            return d(new BigDecimal(j2), x2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean g(String str, x2 x2Var) {
        if (!m9.L(str)) {
            return null;
        }
        try {
            return d(new BigDecimal(str), x2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
