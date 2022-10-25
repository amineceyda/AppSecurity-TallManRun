package g.e.a.a.e.d;

import java.util.List;

public final class l extends r {
    public final long a;
    public final long b;
    public final p c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f2723d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2724e;

    /* renamed from: f  reason: collision with root package name */
    public final List<q> f2725f;

    /* renamed from: g  reason: collision with root package name */
    public final u f2726g;

    public l(long j2, long j3, p pVar, Integer num, String str, List list, u uVar, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = pVar;
        this.f2723d = num;
        this.f2724e = str;
        this.f2725f = list;
        this.f2726g = uVar;
    }

    public p a() {
        return this.c;
    }

    public List<q> b() {
        return this.f2725f;
    }

    public Integer c() {
        return this.f2723d;
    }

    public String d() {
        return this.f2724e;
    }

    public u e() {
        return this.f2726g;
    }

    public boolean equals(Object obj) {
        p pVar;
        Integer num;
        String str;
        List<q> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a == rVar.f() && this.b == rVar.g() && ((pVar = this.c) != null ? pVar.equals(rVar.a()) : rVar.a() == null) && ((num = this.f2723d) != null ? num.equals(rVar.c()) : rVar.c() == null) && ((str = this.f2724e) != null ? str.equals(rVar.d()) : rVar.d() == null) && ((list = this.f2725f) != null ? list.equals(rVar.b()) : rVar.b() == null)) {
            u uVar = this.f2726g;
            u e2 = rVar.e();
            if (uVar == null) {
                if (e2 == null) {
                    return true;
                }
            } else if (uVar.equals(e2)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.a;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        p pVar = this.c;
        int i3 = 0;
        int hashCode = (i2 ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        Integer num = this.f2723d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2724e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<q> list = this.f2725f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        u uVar = this.f2726g;
        if (uVar != null) {
            i3 = uVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("LogRequest{requestTimeMs=");
        i2.append(this.a);
        i2.append(", requestUptimeMs=");
        i2.append(this.b);
        i2.append(", clientInfo=");
        i2.append(this.c);
        i2.append(", logSource=");
        i2.append(this.f2723d);
        i2.append(", logSourceName=");
        i2.append(this.f2724e);
        i2.append(", logEvents=");
        i2.append(this.f2725f);
        i2.append(", qosTier=");
        i2.append(this.f2726g);
        i2.append("}");
        return i2.toString();
    }
}
