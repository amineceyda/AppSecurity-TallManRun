package g.e.b.r.m;

import g.e.b.r.m.d;

public final class a extends d {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3752d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f3753e;

    public a(String str, String str2, String str3, f fVar, d.a aVar, C0126a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f3752d = fVar;
        this.f3753e = aVar;
    }

    public f a() {
        return this.f3752d;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public d.a d() {
        return this.f3753e;
    }

    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f3752d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        d.a aVar = this.f3753e;
                        d.a d2 = dVar.d();
                        if (aVar == null) {
                            if (d2 == null) {
                                return true;
                            }
                        } else if (aVar.equals(d2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f3752d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f3753e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("InstallationResponse{uri=");
        i2.append(this.a);
        i2.append(", fid=");
        i2.append(this.b);
        i2.append(", refreshToken=");
        i2.append(this.c);
        i2.append(", authToken=");
        i2.append(this.f3752d);
        i2.append(", responseCode=");
        i2.append(this.f3753e);
        i2.append("}");
        return i2.toString();
    }
}
