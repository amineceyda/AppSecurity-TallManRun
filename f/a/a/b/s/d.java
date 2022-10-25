package f.a.a.b.s;

import g.a.a.a.a;

public class d {
    public int a = Integer.MIN_VALUE;
    public int b = Integer.MAX_VALUE;
    public boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1761d = true;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f1761d == dVar.f1761d;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + (this.f1761d ? 1 : 0);
    }

    public String toString() {
        StringBuilder i2 = a.i("FormatInfo(");
        i2.append(this.a);
        i2.append(", ");
        i2.append(this.b);
        i2.append(", ");
        i2.append(this.c);
        i2.append(", ");
        i2.append(this.f1761d);
        i2.append(")");
        return i2.toString();
    }
}
