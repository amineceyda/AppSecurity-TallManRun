package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class u extends a0.e.C0122e {
    public final int a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3676d;

    public u(int i2, String str, String str2, boolean z, a aVar) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.f3676d = z;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.f3676d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.C0122e)) {
            return false;
        }
        a0.e.C0122e eVar = (a0.e.C0122e) obj;
        return this.a == eVar.b() && this.b.equals(eVar.c()) && this.c.equals(eVar.a()) && this.f3676d == eVar.d();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f3676d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("OperatingSystem{platform=");
        i2.append(this.a);
        i2.append(", version=");
        i2.append(this.b);
        i2.append(", buildVersion=");
        i2.append(this.c);
        i2.append(", jailbroken=");
        i2.append(this.f3676d);
        i2.append("}");
        return i2.toString();
    }
}
