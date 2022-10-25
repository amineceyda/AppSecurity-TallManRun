package g.e.b.l.j.l;

import g.a.a.a.a;
import g.e.b.l.j.l.c0;
import java.util.Objects;

public final class y extends c0.b {
    public final int a;
    public final String b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3680d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3681e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3682f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3683g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3684h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3685i;

    public y(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        Objects.requireNonNull(str, "Null model");
        this.b = str;
        this.c = i3;
        this.f3680d = j2;
        this.f3681e = j3;
        this.f3682f = z;
        this.f3683g = i4;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f3684h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f3685i = str3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public long c() {
        return this.f3681e;
    }

    public boolean d() {
        return this.f3682f;
    }

    public String e() {
        return this.f3684h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.b)) {
            return false;
        }
        c0.b bVar = (c0.b) obj;
        return this.a == bVar.a() && this.b.equals(bVar.f()) && this.c == bVar.b() && this.f3680d == bVar.i() && this.f3681e == bVar.c() && this.f3682f == bVar.d() && this.f3683g == bVar.h() && this.f3684h.equals(bVar.e()) && this.f3685i.equals(bVar.g());
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.f3685i;
    }

    public int h() {
        return this.f3683g;
    }

    public int hashCode() {
        long j2 = this.f3680d;
        long j3 = this.f3681e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f3682f ? 1231 : 1237)) * 1000003) ^ this.f3683g) * 1000003) ^ this.f3684h.hashCode()) * 1000003) ^ this.f3685i.hashCode();
    }

    public long i() {
        return this.f3680d;
    }

    public String toString() {
        StringBuilder i2 = a.i("DeviceData{arch=");
        i2.append(this.a);
        i2.append(", model=");
        i2.append(this.b);
        i2.append(", availableProcessors=");
        i2.append(this.c);
        i2.append(", totalRam=");
        i2.append(this.f3680d);
        i2.append(", diskSpace=");
        i2.append(this.f3681e);
        i2.append(", isEmulator=");
        i2.append(this.f3682f);
        i2.append(", state=");
        i2.append(this.f3683g);
        i2.append(", manufacturer=");
        i2.append(this.f3684h);
        i2.append(", modelClass=");
        return a.f(i2, this.f3685i, "}");
    }
}
