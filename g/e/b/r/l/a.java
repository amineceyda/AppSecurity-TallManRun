package g.e.b.r.l;

import g.e.b.r.l.c;
import g.e.b.r.l.d;
import java.util.Objects;

public final class a extends d {
    public final String b;
    public final c.a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3739d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3740e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3741f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3742g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3743h;

    public static final class b extends d.a {
        public String a;
        public c.a b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f3744d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3745e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3746f;

        /* renamed from: g  reason: collision with root package name */
        public String f3747g;

        public b() {
        }

        public b(d dVar, C0125a aVar) {
            a aVar2 = (a) dVar;
            this.a = aVar2.b;
            this.b = aVar2.c;
            this.c = aVar2.f3739d;
            this.f3744d = aVar2.f3740e;
            this.f3745e = Long.valueOf(aVar2.f3741f);
            this.f3746f = Long.valueOf(aVar2.f3742g);
            this.f3747g = aVar2.f3743h;
        }

        public d a() {
            String str = this.b == null ? " registrationStatus" : "";
            if (this.f3745e == null) {
                str = g.a.a.a.a.w(str, " expiresInSecs");
            }
            if (this.f3746f == null) {
                str = g.a.a.a.a.w(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.f3744d, this.f3745e.longValue(), this.f3746f.longValue(), this.f3747g, (C0125a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public d.a b(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.b = aVar;
            return this;
        }

        public d.a c(long j2) {
            this.f3745e = Long.valueOf(j2);
            return this;
        }

        public d.a d(long j2) {
            this.f3746f = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4, C0125a aVar2) {
        this.b = str;
        this.c = aVar;
        this.f3739d = str2;
        this.f3740e = str3;
        this.f3741f = j2;
        this.f3742g = j3;
        this.f3743h = str4;
    }

    public String a() {
        return this.f3739d;
    }

    public long b() {
        return this.f3741f;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f3743h;
    }

    public String e() {
        return this.f3740e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.c.equals(dVar.f()) && ((str = this.f3739d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f3740e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f3741f == dVar.b() && this.f3742g == dVar.g()) {
                String str4 = this.f3743h;
                String d2 = dVar.d();
                if (str4 == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (str4.equals(d2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public c.a f() {
        return this.c;
    }

    public long g() {
        return this.f3742g;
    }

    public int hashCode() {
        String str = this.b;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.f3739d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3740e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f3741f;
        long j3 = this.f3742g;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f3743h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    public d.a j() {
        return new b(this, (C0125a) null);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("PersistedInstallationEntry{firebaseInstallationId=");
        i2.append(this.b);
        i2.append(", registrationStatus=");
        i2.append(this.c);
        i2.append(", authToken=");
        i2.append(this.f3739d);
        i2.append(", refreshToken=");
        i2.append(this.f3740e);
        i2.append(", expiresInSecs=");
        i2.append(this.f3741f);
        i2.append(", tokenCreationEpochInSecs=");
        i2.append(this.f3742g);
        i2.append(", fisError=");
        return g.a.a.a.a.f(i2, this.f3743h, "}");
    }
}
