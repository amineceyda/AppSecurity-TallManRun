package g.e.a.a.f;

import g.e.a.a.f.l;
import java.util.Map;
import java.util.Objects;

public final class h extends l {
    public final String a;
    public final Integer b;
    public final k c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2756d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2757e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f2758f;

    public static final class b extends l.a {
        public String a;
        public Integer b;
        public k c;

        /* renamed from: d  reason: collision with root package name */
        public Long f2759d;

        /* renamed from: e  reason: collision with root package name */
        public Long f2760e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f2761f;

        public l b() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " encodedPayload");
            }
            if (this.f2759d == null) {
                str = g.a.a.a.a.w(str, " eventMillis");
            }
            if (this.f2760e == null) {
                str = g.a.a.a.a.w(str, " uptimeMillis");
            }
            if (this.f2761f == null) {
                str = g.a.a.a.a.w(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.a, this.b, this.c, this.f2759d.longValue(), this.f2760e.longValue(), this.f2761f, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public Map<String, String> c() {
            Map<String, String> map = this.f2761f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public l.a d(k kVar) {
            Objects.requireNonNull(kVar, "Null encodedPayload");
            this.c = kVar;
            return this;
        }

        public l.a e(long j2) {
            this.f2759d = Long.valueOf(j2);
            return this;
        }

        public l.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        public l.a g(long j2) {
            this.f2760e = Long.valueOf(j2);
            return this;
        }
    }

    public h(String str, Integer num, k kVar, long j2, long j3, Map map, a aVar) {
        this.a = str;
        this.b = num;
        this.c = kVar;
        this.f2756d = j2;
        this.f2757e = j3;
        this.f2758f = map;
    }

    public Map<String, String> c() {
        return this.f2758f;
    }

    public Integer d() {
        return this.b;
    }

    public k e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof g.e.a.a.f.l
            r2 = 0
            if (r1 == 0) goto L_0x005b
            g.e.a.a.f.l r8 = (g.e.a.a.f.l) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            g.e.a.a.f.k r1 = r7.c
            g.e.a.a.f.k r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f2756d
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f2757e
            long r5 = r8.i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f2758f
            java.util.Map r8 = r8.c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.a.f.h.equals(java.lang.Object):boolean");
    }

    public long f() {
        return this.f2756d;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f2756d;
        long j3 = this.f2757e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f2758f.hashCode();
    }

    public long i() {
        return this.f2757e;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("EventInternal{transportName=");
        i2.append(this.a);
        i2.append(", code=");
        i2.append(this.b);
        i2.append(", encodedPayload=");
        i2.append(this.c);
        i2.append(", eventMillis=");
        i2.append(this.f2756d);
        i2.append(", uptimeMillis=");
        i2.append(this.f2757e);
        i2.append(", autoMetadata=");
        i2.append(this.f2758f);
        i2.append("}");
        return i2.toString();
    }
}
