package g.e.a.a.f.v;

import g.a.a.a.a;
import g.e.a.a.f.v.g;
import java.util.Objects;

public final class b extends g {
    public final g.a a;
    public final long b;

    public b(g.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.b = j2;
    }

    public long b() {
        return this.b;
    }

    public g.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.c()) && this.b == gVar.b();
    }

    public int hashCode() {
        long j2 = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder i2 = a.i("BackendResponse{status=");
        i2.append(this.a);
        i2.append(", nextRequestWaitMillis=");
        i2.append(this.b);
        i2.append("}");
        return i2.toString();
    }
}
