package g.e.b.k;

public class u {
    public final Class<?> a;
    public final boolean b;

    public u(Class cls, boolean z, s sVar) {
        this.a = cls;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.a.equals(this.a) && uVar.b == this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
