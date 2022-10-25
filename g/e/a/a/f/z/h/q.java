package g.e.a.a.f.z.h;

import g.e.a.a.b;
import g.e.a.a.f.b0.a;
import g.e.a.a.f.z.h.t;
import java.util.Map;
import java.util.Objects;

public final class q extends t {
    public final a a;
    public final Map<b, t.a> b;

    public q(a aVar, Map<b, t.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.b = map;
    }

    public a a() {
        return this.a;
    }

    public Map<b, t.a> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a()) && this.b.equals(tVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("SchedulerConfig{clock=");
        i2.append(this.a);
        i2.append(", values=");
        i2.append(this.b);
        i2.append("}");
        return i2.toString();
    }
}
