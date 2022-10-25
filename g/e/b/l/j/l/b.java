package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class b extends a0 {
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3600d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3601e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3602f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3603g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e f3604h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.d f3605i;

    /* renamed from: g.e.b.l.j.l.b$b  reason: collision with other inner class name */
    public static final class C0123b extends a0.b {
        public String a;
        public String b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public String f3606d;

        /* renamed from: e  reason: collision with root package name */
        public String f3607e;

        /* renamed from: f  reason: collision with root package name */
        public String f3608f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e f3609g;

        /* renamed from: h  reason: collision with root package name */
        public a0.d f3610h;

        public C0123b() {
        }

        public C0123b(a0 a0Var, a aVar) {
            b bVar = (b) a0Var;
            this.a = bVar.b;
            this.b = bVar.c;
            this.c = Integer.valueOf(bVar.f3600d);
            this.f3606d = bVar.f3601e;
            this.f3607e = bVar.f3602f;
            this.f3608f = bVar.f3603g;
            this.f3609g = bVar.f3604h;
            this.f3610h = bVar.f3605i;
        }

        public a0 a() {
            String str = this.a == null ? " sdkVersion" : "";
            if (this.b == null) {
                str = g.a.a.a.a.w(str, " gmpAppId");
            }
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " platform");
            }
            if (this.f3606d == null) {
                str = g.a.a.a.a.w(str, " installationUuid");
            }
            if (this.f3607e == null) {
                str = g.a.a.a.a.w(str, " buildVersion");
            }
            if (this.f3608f == null) {
                str = g.a.a.a.a.w(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c.intValue(), this.f3606d, this.f3607e, this.f3608f, this.f3609g, this.f3610h, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }
    }

    public b(String str, String str2, int i2, String str3, String str4, String str5, a0.e eVar, a0.d dVar, a aVar) {
        this.b = str;
        this.c = str2;
        this.f3600d = i2;
        this.f3601e = str3;
        this.f3602f = str4;
        this.f3603g = str5;
        this.f3604h = eVar;
        this.f3605i = dVar;
    }

    public String a() {
        return this.f3602f;
    }

    public String b() {
        return this.f3603g;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.f3601e;
    }

    public a0.d e() {
        return this.f3605i;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.b.equals(a0Var.g()) && this.c.equals(a0Var.c()) && this.f3600d == a0Var.f() && this.f3601e.equals(a0Var.d()) && this.f3602f.equals(a0Var.a()) && this.f3603g.equals(a0Var.b()) && ((eVar = this.f3604h) != null ? eVar.equals(a0Var.h()) : a0Var.h() == null)) {
            a0.d dVar = this.f3605i;
            a0.d e2 = a0Var.e();
            if (dVar == null) {
                if (e2 == null) {
                    return true;
                }
            } else if (dVar.equals(e2)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f3600d;
    }

    public String g() {
        return this.b;
    }

    public a0.e h() {
        return this.f3604h;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f3600d) * 1000003) ^ this.f3601e.hashCode()) * 1000003) ^ this.f3602f.hashCode()) * 1000003) ^ this.f3603g.hashCode()) * 1000003;
        a0.e eVar = this.f3604h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f3605i;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public a0.b i() {
        return new C0123b(this, (a) null);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("CrashlyticsReport{sdkVersion=");
        i2.append(this.b);
        i2.append(", gmpAppId=");
        i2.append(this.c);
        i2.append(", platform=");
        i2.append(this.f3600d);
        i2.append(", installationUuid=");
        i2.append(this.f3601e);
        i2.append(", buildVersion=");
        i2.append(this.f3602f);
        i2.append(", displayVersion=");
        i2.append(this.f3603g);
        i2.append(", session=");
        i2.append(this.f3604h);
        i2.append(", ndkPayload=");
        i2.append(this.f3605i);
        i2.append("}");
        return i2.toString();
    }
}
