package g.e.a.a;

import java.util.Objects;

public final class a {
    public final String a;

    public a(String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return g.a.a.a.a.f(g.a.a.a.a.i("Encoding{name=\""), this.a, "\"}");
    }
}
