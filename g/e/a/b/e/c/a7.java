package g.e.a.b.e.c;

public final class a7 {
    public final Object a;
    public final int b;

    public a7(Object obj, int i2) {
        this.a = obj;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return this.a == a7Var.a && this.b == a7Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
