package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.List;

public final class g implements p {
    public final boolean b;

    public g(Boolean bool) {
        this.b = bool == null ? false : bool.booleanValue();
    }

    public final Double d() {
        return Double.valueOf(true != this.b ? 0.0d : 1.0d);
    }

    public final String e() {
        return Boolean.toString(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.b == ((g) obj).b;
    }

    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode();
    }

    public final p i(String str, h4 h4Var, List list) {
        if ("toString".equals(str)) {
            return new t(Boolean.toString(this.b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.b), str}));
    }

    public final p l() {
        return new g(Boolean.valueOf(this.b));
    }

    public final Boolean m() {
        return Boolean.valueOf(this.b);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
