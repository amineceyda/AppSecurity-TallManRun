package g.e.b.l.j.l;

import g.a.a.a.a;
import g.e.b.l.j.l.c0;
import java.util.Objects;

public final class w extends c0 {
    public final c0.a a;
    public final c0.c b;
    public final c0.b c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.c = bVar;
    }

    public c0.a a() {
        return this.a;
    }

    public c0.b b() {
        return this.c;
    }

    public c0.c c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a.equals(c0Var.a()) && this.b.equals(c0Var.c()) && this.c.equals(c0Var.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("StaticSessionData{appData=");
        i2.append(this.a);
        i2.append(", osData=");
        i2.append(this.b);
        i2.append(", deviceData=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
