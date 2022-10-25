package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;

public final class q extends a0.e.d.a.b.C0118d {
    public final String a;
    public final int b;
    public final b0<a0.e.d.a.b.C0118d.C0119a> c;

    public q(String str, int i2, b0 b0Var, a aVar) {
        this.a = str;
        this.b = i2;
        this.c = b0Var;
    }

    public b0<a0.e.d.a.b.C0118d.C0119a> a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0118d)) {
            return false;
        }
        a0.e.d.a.b.C0118d dVar = (a0.e.d.a.b.C0118d) obj;
        return this.a.equals(dVar.c()) && this.b == dVar.b() && this.c.equals(dVar.a());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Thread{name=");
        i2.append(this.a);
        i2.append(", importance=");
        i2.append(this.b);
        i2.append(", frames=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
