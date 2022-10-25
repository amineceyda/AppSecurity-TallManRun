package g.e.a.a.e.d;

import g.e.a.a.e.d.q;
import java.util.Arrays;

public final class k extends q {
    public final long a;
    public final Integer b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2715d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2716e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2717f;

    /* renamed from: g  reason: collision with root package name */
    public final t f2718g;

    public static final class b extends q.a {
        public Long a;
        public Integer b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f2719d;

        /* renamed from: e  reason: collision with root package name */
        public String f2720e;

        /* renamed from: f  reason: collision with root package name */
        public Long f2721f;

        /* renamed from: g  reason: collision with root package name */
        public t f2722g;
    }

    public k(long j2, Integer num, long j3, byte[] bArr, String str, long j4, t tVar, a aVar) {
        this.a = j2;
        this.b = num;
        this.c = j3;
        this.f2715d = bArr;
        this.f2716e = str;
        this.f2717f = j4;
        this.f2718g = tVar;
    }

    public Integer a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public t d() {
        return this.f2718g;
    }

    public byte[] e() {
        return this.f2715d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.b() && ((num = this.b) != null ? num.equals(qVar.a()) : qVar.a() == null) && this.c == qVar.c()) {
            if (Arrays.equals(this.f2715d, qVar instanceof k ? ((k) qVar).f2715d : qVar.e()) && ((str = this.f2716e) != null ? str.equals(qVar.f()) : qVar.f() == null) && this.f2717f == qVar.g()) {
                t tVar = this.f2718g;
                t d2 = qVar.d();
                if (tVar == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (tVar.equals(d2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f2716e;
    }

    public long g() {
        return this.f2717f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i3 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2715d)) * 1000003;
        String str = this.f2716e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f2717f;
        int i4 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        t tVar = this.f2718g;
        if (tVar != null) {
            i3 = tVar.hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("LogEvent{eventTimeMs=");
        i2.append(this.a);
        i2.append(", eventCode=");
        i2.append(this.b);
        i2.append(", eventUptimeMs=");
        i2.append(this.c);
        i2.append(", sourceExtension=");
        i2.append(Arrays.toString(this.f2715d));
        i2.append(", sourceExtensionJsonProto3=");
        i2.append(this.f2716e);
        i2.append(", timezoneOffsetSeconds=");
        i2.append(this.f2717f);
        i2.append(", networkConnectionInfo=");
        i2.append(this.f2718g);
        i2.append("}");
        return i2.toString();
    }
}
