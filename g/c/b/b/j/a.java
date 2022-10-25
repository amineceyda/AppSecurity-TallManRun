package g.c.b.b.j;

import i.o.c.h;
import java.util.Map;

public final class a {
    public final String a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2271d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2272e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2273f;

    /* renamed from: g  reason: collision with root package name */
    public String f2274g;

    /* renamed from: h  reason: collision with root package name */
    public int f2275h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2276i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2277j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, String> f2278k;

    public a() {
        this((String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0, false, false, (Map) null, 2047);
    }

    public a(String str, String str2, long j2, String str3, String str4, String str5, String str6, int i2, boolean z, boolean z2, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f2271d = str3;
        this.f2272e = str4;
        this.f2273f = str5;
        this.f2274g = str6;
        this.f2275h = i2;
        this.f2276i = z;
        this.f2277j = z2;
        this.f2278k = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24, boolean r25, java.util.Map r26, int r27) {
        /*
            r14 = this;
            r0 = r27
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            r3 = 0
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0014
            r4 = -1
            goto L_0x0016
        L_0x0014:
            r4 = r17
        L_0x0016:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001c
            r6 = r2
            goto L_0x001e
        L_0x001c:
            r6 = r19
        L_0x001e:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0024
            r7 = r2
            goto L_0x0026
        L_0x0024:
            r7 = r20
        L_0x0026:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002c
            r8 = r2
            goto L_0x002e
        L_0x002c:
            r8 = r21
        L_0x002e:
            r9 = r0 & 64
            r9 = 0
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0037
            r10 = -1
            goto L_0x0039
        L_0x0037:
            r10 = r23
        L_0x0039:
            r11 = r0 & 256(0x100, float:3.59E-43)
            r12 = 0
            if (r11 == 0) goto L_0x0040
            r11 = 0
            goto L_0x0042
        L_0x0040:
            r11 = r24
        L_0x0042:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r12 = r25
        L_0x0049:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r2 = r26
        L_0x0050:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r2
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.j.a.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, java.util.Map, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c && h.a(this.f2271d, aVar.f2271d) && h.a(this.f2272e, aVar.f2272e) && h.a(this.f2273f, aVar.f2273f) && h.a(this.f2274g, aVar.f2274g) && this.f2275h == aVar.f2275h && this.f2276i == aVar.f2276i && this.f2277j == aVar.f2277j && h.a(this.f2278k, aVar.f2278k);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + c.a(this.c)) * 31;
        String str3 = this.f2271d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2272e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2273f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2274g;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f2275h) * 31;
        boolean z = this.f2276i;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f2277j;
        if (!z3) {
            z2 = z3;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Map<String, String> map = this.f2278k;
        if (map != null) {
            i2 = map.hashCode();
        }
        return i4 + i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("InstallTask(packageName=");
        i2.append(this.a);
        i2.append(", versionName=");
        i2.append(this.b);
        i2.append(", versionCode=");
        i2.append(this.c);
        i2.append(", label=");
        i2.append(this.f2271d);
        i2.append(", path=");
        i2.append(this.f2272e);
        i2.append(", type=");
        i2.append(this.f2273f);
        i2.append(", api=");
        i2.append(this.f2274g);
        i2.append(", percent=");
        i2.append(this.f2275h);
        i2.append(", isContainObb=");
        i2.append(this.f2276i);
        i2.append(", isApks=");
        i2.append(this.f2277j);
        i2.append(", extendMap=");
        i2.append(this.f2278k);
        i2.append(')');
        return i2.toString();
    }
}
