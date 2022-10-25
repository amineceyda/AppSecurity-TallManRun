package g.e.a.a.f.z.i;

import g.a.a.a.a;
import g.e.a.a.f.l;
import g.e.a.a.f.p;
import java.util.Objects;

public final class y extends g0 {
    public final long a;
    public final p b;
    public final l c;

    public y(long j2, p pVar, l lVar) {
        this.a = j2;
        Objects.requireNonNull(pVar, "Null transportContext");
        this.b = pVar;
        Objects.requireNonNull(lVar, "Null event");
        this.c = lVar;
    }

    public l a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }

    public p c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.b() && this.b.equals(g0Var.c()) && this.c.equals(g0Var.a());
    }

    public int hashCode() {
        long j2 = this.a;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder i2 = a.i("PersistedEvent{id=");
        i2.append(this.a);
        i2.append(", transportContext=");
        i2.append(this.b);
        i2.append(", event=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
