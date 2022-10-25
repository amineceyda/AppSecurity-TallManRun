package g.e.b.k;

import g.a.a.a.a;
import java.util.Objects;

public final class v {
    public final Class<?> a;
    public final int b;
    public final int c;

    public v(Class<?> cls, int i2, int i3) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i2;
        this.c = i3;
    }

    public boolean a() {
        return this.b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i3 = this.c;
        if (i3 == 0) {
            str = "direct";
        } else if (i3 == 1) {
            str = "provider";
        } else if (i3 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(a.q("Unsupported injection: ", i3));
        }
        return a.f(sb, str, "}");
    }
}
