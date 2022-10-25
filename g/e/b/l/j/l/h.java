package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class h extends a0.e.a {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.a.C0114a f3637d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f3638e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3639f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3640g;

    public h(String str, String str2, String str3, a0.e.a.C0114a aVar, String str4, String str5, String str6, a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f3638e = str4;
        this.f3639f = str5;
        this.f3640g = str6;
    }

    public String a() {
        return this.f3639f;
    }

    public String b() {
        return this.f3640g;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f3638e;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.C0114a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.a)) {
            return false;
        }
        a0.e.a aVar2 = (a0.e.a) obj;
        if (this.a.equals(aVar2.d()) && this.b.equals(aVar2.g()) && ((str = this.c) != null ? str.equals(aVar2.c()) : aVar2.c() == null) && ((aVar = this.f3637d) != null ? aVar.equals(aVar2.f()) : aVar2.f() == null) && ((str2 = this.f3638e) != null ? str2.equals(aVar2.e()) : aVar2.e() == null) && ((str3 = this.f3639f) != null ? str3.equals(aVar2.a()) : aVar2.a() == null)) {
            String str4 = this.f3640g;
            String b2 = aVar2.b();
            if (str4 == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (str4.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public a0.e.a.C0114a f() {
        return this.f3637d;
    }

    public String g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.C0114a aVar = this.f3637d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f3638e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3639f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3640g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Application{identifier=");
        i2.append(this.a);
        i2.append(", version=");
        i2.append(this.b);
        i2.append(", displayVersion=");
        i2.append(this.c);
        i2.append(", organization=");
        i2.append(this.f3637d);
        i2.append(", installationUuid=");
        i2.append(this.f3638e);
        i2.append(", developmentPlatform=");
        i2.append(this.f3639f);
        i2.append(", developmentPlatformVersion=");
        return g.a.a.a.a.f(i2, this.f3640g, "}");
    }
}
