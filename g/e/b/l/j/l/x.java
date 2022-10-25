package g.e.b.l.j.l;

import g.a.a.a.a;
import g.e.b.l.j.e;
import g.e.b.l.j.l.c0;
import java.util.Objects;

public final class x extends c0.a {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3677d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3678e;

    /* renamed from: f  reason: collision with root package name */
    public final e f3679f;

    public x(String str, String str2, String str3, String str4, int i2, e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f3677d = str4;
        this.f3678e = i2;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f3679f = eVar;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.f3678e;
    }

    public e c() {
        return this.f3679f;
    }

    public String d() {
        return this.f3677d;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.f3677d.equals(aVar.d()) && this.f3678e == aVar.b() && this.f3679f.equals(aVar.c());
    }

    public String f() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f3677d.hashCode()) * 1000003) ^ this.f3678e) * 1000003) ^ this.f3679f.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("AppData{appIdentifier=");
        i2.append(this.a);
        i2.append(", versionCode=");
        i2.append(this.b);
        i2.append(", versionName=");
        i2.append(this.c);
        i2.append(", installUuid=");
        i2.append(this.f3677d);
        i2.append(", deliveryMechanism=");
        i2.append(this.f3678e);
        i2.append(", developmentPlatformProvider=");
        i2.append(this.f3679f);
        i2.append("}");
        return i2.toString();
    }
}
