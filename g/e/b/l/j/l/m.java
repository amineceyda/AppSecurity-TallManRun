package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class m extends a0.e.d.a.b {
    public final b0<a0.e.d.a.b.C0118d> a;
    public final a0.e.d.a.b.C0117b b;
    public final a0.a c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.c f3661d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0116a> f3662e;

    public m(b0 b0Var, a0.e.d.a.b.C0117b bVar, a0.a aVar, a0.e.d.a.b.c cVar, b0 b0Var2, a aVar2) {
        this.a = b0Var;
        this.b = bVar;
        this.c = aVar;
        this.f3661d = cVar;
        this.f3662e = b0Var2;
    }

    public a0.a a() {
        return this.c;
    }

    public b0<a0.e.d.a.b.C0116a> b() {
        return this.f3662e;
    }

    public a0.e.d.a.b.C0117b c() {
        return this.b;
    }

    public a0.e.d.a.b.c d() {
        return this.f3661d;
    }

    public b0<a0.e.d.a.b.C0118d> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b)) {
            return false;
        }
        a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
        b0<a0.e.d.a.b.C0118d> b0Var = this.a;
        if (b0Var != null ? b0Var.equals(bVar.e()) : bVar.e() == null) {
            a0.e.d.a.b.C0117b bVar2 = this.b;
            if (bVar2 != null ? bVar2.equals(bVar.c()) : bVar.c() == null) {
                a0.a aVar = this.c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    return this.f3661d.equals(bVar.d()) && this.f3662e.equals(bVar.b());
                }
            }
        }
    }

    public int hashCode() {
        b0<a0.e.d.a.b.C0118d> b0Var = this.a;
        int i2 = 0;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.C0117b bVar = this.b;
        int hashCode2 = (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        a0.a aVar = this.c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return ((((hashCode2 ^ i2) * 1000003) ^ this.f3661d.hashCode()) * 1000003) ^ this.f3662e.hashCode();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Execution{threads=");
        i2.append(this.a);
        i2.append(", exception=");
        i2.append(this.b);
        i2.append(", appExitInfo=");
        i2.append(this.c);
        i2.append(", signal=");
        i2.append(this.f3661d);
        i2.append(", binaries=");
        i2.append(this.f3662e);
        i2.append("}");
        return i2.toString();
    }
}
