package k;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import k.h0.c;
import l.e;
import org.slf4j.Marker;

public final class r {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f4909j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4910d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4911e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f4912f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f4913g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f4914h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4915i;

    public static final class a {
        @Nullable
        public String a;
        public String b = "";
        public String c = "";
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f4916d;

        /* renamed from: e  reason: collision with root package name */
        public int f4917e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f4918f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public List<String> f4919g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f4920h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f4918f = arrayList;
            arrayList.add("");
        }

        public r a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f4916d != null) {
                return new r(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public a b(@Nullable String str) {
            this.f4919g = str != null ? r.n(r.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0212, code lost:
            if (r1 <= 65535) goto L_0x021a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0255  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x02a3  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x035d  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x03a3  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x01e1 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01c3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public k.r.a c(@javax.annotation.Nullable k.r r22, java.lang.String r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r10 = r23
                int r2 = r23.length()
                r8 = 0
                int r9 = k.h0.c.w(r10, r8, r2)
                int r2 = r23.length()
                int r11 = k.h0.c.x(r10, r9, r2)
                int r2 = r11 - r9
                r12 = 2
                r13 = 58
                r14 = -1
                if (r2 >= r12) goto L_0x0020
                goto L_0x0062
            L_0x0020:
                char r2 = r10.charAt(r9)
                r3 = 90
                r4 = 122(0x7a, float:1.71E-43)
                r5 = 65
                r6 = 97
                if (r2 < r6) goto L_0x0030
                if (r2 <= r4) goto L_0x0035
            L_0x0030:
                if (r2 < r5) goto L_0x0062
                if (r2 <= r3) goto L_0x0035
                goto L_0x0062
            L_0x0035:
                r2 = r9
            L_0x0036:
                int r2 = r2 + 1
                if (r2 >= r11) goto L_0x0062
                char r7 = r10.charAt(r2)
                if (r7 < r6) goto L_0x0042
                if (r7 <= r4) goto L_0x005f
            L_0x0042:
                if (r7 < r5) goto L_0x0046
                if (r7 <= r3) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r13) goto L_0x0062
                r15 = r2
                goto L_0x0064
            L_0x005f:
                r3 = 90
                goto L_0x0036
            L_0x0062:
                r2 = -1
                r15 = -1
            L_0x0064:
                if (r15 == r14) goto L_0x00ac
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007b
                java.lang.String r2 = "https"
                r0.a = r2
                int r9 = r9 + 6
                goto L_0x00b2
            L_0x007b:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0090
                java.lang.String r2 = "http"
                r0.a = r2
                int r9 = r9 + 5
                goto L_0x00b2
            L_0x0090:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = g.a.a.a.a.i(r2)
                java.lang.String r3 = r10.substring(r8, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ac:
                if (r1 == 0) goto L_0x03bd
                java.lang.String r2 = r1.a
                r0.a = r2
            L_0x00b2:
                r2 = 0
                r3 = r9
            L_0x00b4:
                r4 = 47
                r5 = 92
                if (r3 >= r11) goto L_0x00c7
                char r6 = r10.charAt(r3)
                if (r6 == r5) goto L_0x00c2
                if (r6 != r4) goto L_0x00c7
            L_0x00c2:
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x00b4
            L_0x00c7:
                r3 = 63
                r6 = 35
                if (r2 >= r12) goto L_0x010f
                if (r1 == 0) goto L_0x010f
                java.lang.String r7 = r1.a
                java.lang.String r8 = r0.a
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L_0x00da
                goto L_0x010f
            L_0x00da:
                java.lang.String r2 = r22.h()
                r0.b = r2
                java.lang.String r2 = r22.d()
                r0.c = r2
                java.lang.String r2 = r1.f4910d
                r0.f4916d = r2
                int r2 = r1.f4911e
                r0.f4917e = r2
                java.util.List<java.lang.String> r2 = r0.f4918f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f4918f
                java.util.List r3 = r22.f()
                r2.addAll(r3)
                if (r9 == r11) goto L_0x0104
                char r2 = r10.charAt(r9)
                if (r2 != r6) goto L_0x010b
            L_0x0104:
                java.lang.String r1 = r22.g()
                r0.b(r1)
            L_0x010b:
                r17 = r11
                goto L_0x0256
            L_0x010f:
                int r9 = r9 + r2
                r1 = 0
                r2 = 0
                r14 = r9
                r1 = -1
                r12 = 0
                r15 = 0
            L_0x0116:
                java.lang.String r2 = "@/\\?#"
                int r9 = k.h0.c.k(r10, r14, r11, r2)
                if (r9 == r11) goto L_0x0123
                char r2 = r10.charAt(r9)
                goto L_0x0124
            L_0x0123:
                r2 = -1
            L_0x0124:
                if (r2 == r1) goto L_0x01bf
                if (r2 == r6) goto L_0x01bf
                if (r2 == r4) goto L_0x01bf
                if (r2 == r5) goto L_0x01bf
                if (r2 == r3) goto L_0x01bf
                r1 = 64
                if (r2 == r1) goto L_0x0134
                goto L_0x01b2
            L_0x0134:
                java.lang.String r8 = "%40"
                if (r12 != 0) goto L_0x0182
                int r7 = k.h0.c.j(r10, r14, r9, r13)
                r5 = 1
                r6 = 0
                r16 = 0
                r17 = 1
                r18 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r2 = r14
                r3 = r7
                r14 = r7
                r7 = r16
                r13 = r8
                r8 = r17
                r22 = r12
                r12 = r9
                r9 = r18
                java.lang.String r1 = k.r.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r15 == 0) goto L_0x0166
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.b
                java.lang.String r1 = g.a.a.a.a.g(r2, r3, r13, r1)
            L_0x0166:
                r0.b = r1
                if (r14 == r12) goto L_0x017e
                int r2 = r14 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r3 = r12
                java.lang.String r1 = k.r.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.c = r1
                r1 = 1
                goto L_0x0180
            L_0x017e:
                r1 = r22
            L_0x0180:
                r15 = 1
                goto L_0x01af
            L_0x0182:
                r13 = r8
                r22 = r12
                r12 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = r0.c
                r9.append(r1)
                r9.append(r13)
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r13 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r2 = r14
                r3 = r12
                r14 = r9
                r9 = r13
                java.lang.String r1 = k.r.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.c = r1
                r1 = r22
            L_0x01af:
                int r14 = r12 + 1
                r12 = r1
            L_0x01b2:
                r6 = 35
                r3 = 63
                r5 = 92
                r1 = -1
                r4 = 47
                r13 = 58
                goto L_0x0116
            L_0x01bf:
                r12 = r9
                r9 = r14
            L_0x01c1:
                if (r9 >= r12) goto L_0x01e1
                char r1 = r10.charAt(r9)
                r2 = 58
                if (r1 == r2) goto L_0x01df
                r3 = 91
                if (r1 == r3) goto L_0x01d1
                r1 = 1
                goto L_0x01dd
            L_0x01d1:
                r1 = 1
            L_0x01d2:
                int r9 = r9 + r1
                if (r9 >= r12) goto L_0x01dd
                char r3 = r10.charAt(r9)
                r4 = 93
                if (r3 != r4) goto L_0x01d2
            L_0x01dd:
                int r9 = r9 + r1
                goto L_0x01c1
            L_0x01df:
                r13 = r9
                goto L_0x01e2
            L_0x01e1:
                r13 = r12
            L_0x01e2:
                int r15 = r13 + 1
                r9 = 34
                if (r15 >= r12) goto L_0x023a
                r1 = 0
                java.lang.String r1 = k.r.j(r10, r14, r13, r1)
                java.lang.String r1 = k.h0.c.c(r1)
                r0.f4916d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r16 = 0
                r1 = r23
                r2 = r15
                r3 = r12
                r17 = r11
                r11 = 34
                r9 = r16
                java.lang.String r1 = k.r.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0219 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0219 }
                if (r1 <= 0) goto L_0x0219
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x0219
                goto L_0x021a
            L_0x0215:
                r17 = r11
                r11 = 34
            L_0x0219:
                r1 = -1
            L_0x021a:
                r0.f4917e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0220
                goto L_0x0251
            L_0x0220:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL port: \""
                java.lang.StringBuilder r2 = g.a.a.a.a.i(r2)
                java.lang.String r3 = r10.substring(r15, r12)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x023a:
                r17 = r11
                r11 = 34
                r1 = 0
                java.lang.String r1 = k.r.j(r10, r14, r13, r1)
                java.lang.String r1 = k.h0.c.c(r1)
                r0.f4916d = r1
                java.lang.String r1 = r0.a
                int r1 = k.r.c(r1)
                r0.f4917e = r1
            L_0x0251:
                java.lang.String r1 = r0.f4916d
                if (r1 == 0) goto L_0x03a3
                r9 = r12
            L_0x0256:
                java.lang.String r1 = "?#"
                r2 = r17
                int r1 = k.h0.c.k(r10, r9, r2, r1)
                if (r9 != r1) goto L_0x0267
                r13 = r0
                r3 = r1
                r12 = r2
                r1 = r10
                r2 = r1
                goto L_0x0360
            L_0x0267:
                char r3 = r10.charAt(r9)
                java.lang.String r4 = ""
                r5 = 47
                if (r3 == r5) goto L_0x028b
                r5 = 92
                if (r3 != r5) goto L_0x0276
                goto L_0x028b
            L_0x0276:
                java.util.List<java.lang.String> r3 = r0.f4918f
                int r5 = r3.size()
                int r5 = r5 + -1
                r3.set(r5, r4)
                r7 = r0
                r8 = r7
                r3 = r1
                r11 = r2
                r6 = r4
                r13 = r9
                r2 = r10
                r4 = r3
                r1 = r2
                goto L_0x02a1
            L_0x028b:
                r3 = 1
                java.util.List<java.lang.String> r5 = r0.f4918f
                r5.clear()
                java.util.List<java.lang.String> r5 = r0.f4918f
                r5.add(r4)
                r7 = r0
                r8 = r7
                r3 = r1
                r11 = r2
                r6 = r4
                r2 = r10
                r5 = 1
                r4 = r3
                r1 = r2
            L_0x029f:
                int r9 = r9 + r5
            L_0x02a0:
                r13 = r9
            L_0x02a1:
                if (r13 >= r4) goto L_0x035d
                java.lang.String r5 = "/\\"
                int r9 = k.h0.c.k(r1, r13, r4, r5)
                if (r9 >= r4) goto L_0x02ad
                r5 = 1
                goto L_0x02ae
            L_0x02ad:
                r5 = 0
            L_0x02ae:
                r16 = 1
                r17 = 0
                r18 = 0
                r19 = 1
                r20 = 0
                java.lang.String r15 = " \"<>^`{}|/\\?#"
                r12 = r1
                r14 = r9
                java.lang.String r12 = k.r.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.String r13 = "."
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x02d3
                java.lang.String r13 = "%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 == 0) goto L_0x02d1
                goto L_0x02d3
            L_0x02d1:
                r13 = 0
                goto L_0x02d4
            L_0x02d3:
                r13 = 1
            L_0x02d4:
                if (r13 == 0) goto L_0x02d8
                goto L_0x0358
            L_0x02d8:
                java.lang.String r13 = ".."
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x02fb
                java.lang.String r13 = "%2e."
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 != 0) goto L_0x02fb
                java.lang.String r13 = ".%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 != 0) goto L_0x02fb
                java.lang.String r13 = "%2e%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 == 0) goto L_0x02f9
                goto L_0x02fb
            L_0x02f9:
                r13 = 0
                goto L_0x02fc
            L_0x02fb:
                r13 = 1
            L_0x02fc:
                if (r13 == 0) goto L_0x032c
                java.util.List<java.lang.String> r12 = r8.f4918f
                int r13 = r12.size()
                int r13 = r13 + -1
                java.lang.Object r12 = r12.remove(r13)
                java.lang.String r12 = (java.lang.String) r12
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x0326
                java.util.List<java.lang.String> r12 = r8.f4918f
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L_0x0326
                java.util.List<java.lang.String> r12 = r8.f4918f
                int r13 = r12.size()
                int r13 = r13 + -1
                r12.set(r13, r6)
                goto L_0x0358
            L_0x0326:
                java.util.List<java.lang.String> r12 = r8.f4918f
                r12.add(r6)
                goto L_0x0358
            L_0x032c:
                java.util.List<java.lang.String> r13 = r8.f4918f
                int r14 = r13.size()
                int r14 = r14 + -1
                java.lang.Object r13 = r13.get(r14)
                java.lang.String r13 = (java.lang.String) r13
                boolean r13 = r13.isEmpty()
                if (r13 == 0) goto L_0x034c
                java.util.List<java.lang.String> r13 = r8.f4918f
                int r14 = r13.size()
                int r14 = r14 + -1
                r13.set(r14, r12)
                goto L_0x0351
            L_0x034c:
                java.util.List<java.lang.String> r13 = r8.f4918f
                r13.add(r12)
            L_0x0351:
                if (r5 == 0) goto L_0x0358
                java.util.List<java.lang.String> r12 = r8.f4918f
                r12.add(r6)
            L_0x0358:
                if (r5 == 0) goto L_0x02a0
                r5 = 1
                goto L_0x029f
            L_0x035d:
                r13 = r7
                r1 = r10
                r12 = r11
            L_0x0360:
                if (r3 >= r12) goto L_0x0387
                char r4 = r2.charAt(r3)
                r5 = 63
                if (r4 != r5) goto L_0x0387
                r14 = 35
                int r15 = k.h0.c.j(r2, r3, r12, r14)
                int r4 = r3 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 1
                r11 = 0
                java.lang.String r6 = " \"'<>#"
                r3 = r1
                r5 = r15
                java.lang.String r3 = k.r.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r3 = k.r.n(r3)
                r13.f4919g = r3
                r3 = r15
                goto L_0x0389
            L_0x0387:
                r14 = 35
            L_0x0389:
                if (r3 >= r12) goto L_0x03a2
                char r2 = r2.charAt(r3)
                if (r2 != r14) goto L_0x03a2
                int r4 = r3 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r6 = ""
                r3 = r1
                r5 = r12
                java.lang.String r1 = k.r.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.f4920h = r1
            L_0x03a2:
                return r13
            L_0x03a3:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL host: \""
                java.lang.StringBuilder r2 = g.a.a.a.a.i(r2)
                java.lang.String r3 = r10.substring(r14, r13)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x03bd:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                goto L_0x03c6
            L_0x03c5:
                throw r1
            L_0x03c6:
                goto L_0x03c5
            */
            throw new UnsupportedOperationException("Method not decompiled: k.r.a.c(k.r, java.lang.String):k.r$a");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str3 = this.f4916d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f4916d);
                    sb.append(']');
                } else {
                    sb.append(this.f4916d);
                }
            }
            int i2 = this.f4917e;
            if (!(i2 == -1 && this.a == null)) {
                if (i2 == -1) {
                    i2 = r.c(this.a);
                }
                String str4 = this.a;
                if (str4 == null || i2 != r.c(str4)) {
                    sb.append(':');
                    sb.append(i2);
                }
            }
            List<String> list = this.f4918f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append('/');
                sb.append(list.get(i3));
            }
            if (this.f4919g != null) {
                sb.append('?');
                r.i(sb, this.f4919g);
            }
            if (this.f4920h != null) {
                sb.append('#');
                sb.append(this.f4920h);
            }
            return sb.toString();
        }
    }

    public r(a aVar) {
        this.a = aVar.a;
        this.b = k(aVar.b, false);
        this.c = k(aVar.c, false);
        this.f4910d = aVar.f4916d;
        int i2 = aVar.f4917e;
        this.f4911e = i2 == -1 ? c(aVar.a) : i2;
        this.f4912f = l(aVar.f4918f, false);
        List<String> list = aVar.f4919g;
        String str = null;
        this.f4913g = list != null ? l(list, true) : null;
        String str2 = aVar.f4920h;
        this.f4914h = str2 != null ? j(str2, 0, str2.length(), false) : str;
        this.f4915i = aVar.toString();
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i4 = i3;
        String str4 = str2;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str3.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m(str3, i5, i4)))) || (codePointAt == 43 && z3)))) {
                e eVar = new e();
                eVar.X(str3, i2, i5);
                e eVar2 = null;
                while (i5 < i4) {
                    int codePointAt2 = str3.codePointAt(i5);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z3) {
                            eVar.V(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !m(str3, i5, i4)))))) {
                            if (eVar2 == null) {
                                eVar2 = new e();
                            }
                            eVar2.Y(codePointAt2);
                            while (!eVar2.D()) {
                                byte readByte = eVar2.readByte() & 255;
                                eVar.O(37);
                                char[] cArr = f4909j;
                                eVar.O(cArr[(readByte >> 4) & 15]);
                                eVar.O(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.Y(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                }
                return eVar.o();
            }
            i5 += Character.charCount(codePointAt);
        }
        int i6 = i2;
        return str.substring(i2, i3);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void i(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String j(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                e eVar = new e();
                eVar.X(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int h2 = c.h(str.charAt(i5 + 1));
                        int h3 = c.h(str.charAt(i4));
                        if (!(h2 == -1 || h3 == -1)) {
                            eVar.O((h2 << 4) + h3);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        eVar.O(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    eVar.Y(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return eVar.o();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static String k(String str, boolean z) {
        return j(str, 0, str.length(), z);
    }

    public static boolean m(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && c.h(str.charAt(i2 + 1)) != -1 && c.h(str.charAt(i4)) != -1;
    }

    public static List<String> n(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public String d() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.f4915i.indexOf(64);
        return this.f4915i.substring(this.f4915i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public String e() {
        int indexOf = this.f4915i.indexOf(47, this.a.length() + 3);
        String str = this.f4915i;
        return this.f4915i.substring(indexOf, c.k(str, indexOf, str.length(), "?#"));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r) && ((r) obj).f4915i.equals(this.f4915i);
    }

    public List<String> f() {
        int indexOf = this.f4915i.indexOf(47, this.a.length() + 3);
        String str = this.f4915i;
        int k2 = c.k(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < k2) {
            int i2 = indexOf + 1;
            int j2 = c.j(this.f4915i, i2, k2, '/');
            arrayList.add(this.f4915i.substring(i2, j2));
            indexOf = j2;
        }
        return arrayList;
    }

    @Nullable
    public String g() {
        if (this.f4913g == null) {
            return null;
        }
        int indexOf = this.f4915i.indexOf(63) + 1;
        String str = this.f4915i;
        return this.f4915i.substring(indexOf, c.j(str, indexOf, str.length(), '#'));
    }

    public String h() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f4915i;
        return this.f4915i.substring(length, c.k(str, length, str.length(), ":@"));
    }

    public int hashCode() {
        return this.f4915i.hashCode();
    }

    public final List<String> l(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? j(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public URI o() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = h();
        aVar.c = d();
        aVar.f4916d = this.f4910d;
        aVar.f4917e = this.f4911e != c(this.a) ? this.f4911e : -1;
        aVar.f4918f.clear();
        aVar.f4918f.addAll(f());
        aVar.b(g());
        aVar.f4920h = this.f4914h == null ? null : this.f4915i.substring(this.f4915i.indexOf(35) + 1);
        int size = aVar.f4918f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f4918f.set(i2, b(aVar.f4918f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = aVar.f4919g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = aVar.f4919g.get(i3);
                if (str != null) {
                    aVar.f4919g.set(i3, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = aVar.f4920h;
        if (str2 != null) {
            aVar.f4920h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f4915i;
    }
}
