package g.e.a.a.e.d;

public final class h extends a {
    public final Integer a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2706d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2707e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2708f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2709g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2710h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2711i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2712j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2713k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2714l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, a aVar) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.f2706d = str3;
        this.f2707e = str4;
        this.f2708f = str5;
        this.f2709g = str6;
        this.f2710h = str7;
        this.f2711i = str8;
        this.f2712j = str9;
        this.f2713k = str10;
        this.f2714l = str11;
    }

    public String a() {
        return this.f2714l;
    }

    public String b() {
        return this.f2712j;
    }

    public String c() {
        return this.f2706d;
    }

    public String d() {
        return this.f2710h;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f2706d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f2707e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f2708f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f2709g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f2710h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f2711i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f2712j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f2713k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f2714l;
                                                    String a2 = aVar.a();
                                                    if (str11 == null) {
                                                        if (a2 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(a2)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f2711i;
    }

    public String g() {
        return this.f2709g;
    }

    public String h() {
        return this.f2713k;
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2706d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2707e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2708f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2709g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2710h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f2711i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f2712j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f2713k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f2714l;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode11 ^ i2;
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.f2708f;
    }

    public String k() {
        return this.f2707e;
    }

    public Integer l() {
        return this.a;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("AndroidClientInfo{sdkVersion=");
        i2.append(this.a);
        i2.append(", model=");
        i2.append(this.b);
        i2.append(", hardware=");
        i2.append(this.c);
        i2.append(", device=");
        i2.append(this.f2706d);
        i2.append(", product=");
        i2.append(this.f2707e);
        i2.append(", osBuild=");
        i2.append(this.f2708f);
        i2.append(", manufacturer=");
        i2.append(this.f2709g);
        i2.append(", fingerprint=");
        i2.append(this.f2710h);
        i2.append(", locale=");
        i2.append(this.f2711i);
        i2.append(", country=");
        i2.append(this.f2712j);
        i2.append(", mccMnc=");
        i2.append(this.f2713k);
        i2.append(", applicationBuild=");
        return g.a.a.a.a.f(i2, this.f2714l, "}");
    }
}
