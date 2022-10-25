package g.e.a.a.f.v;

import g.e.a.a.f.l;
import java.util.Arrays;

public final class a extends f {
    public final Iterable<l> a;
    public final byte[] b;

    public a(Iterable iterable, byte[] bArr, C0103a aVar) {
        this.a = iterable;
        this.b = bArr;
    }

    public Iterable<l> a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("BackendRequest{events=");
        i2.append(this.a);
        i2.append(", extras=");
        i2.append(Arrays.toString(this.b));
        i2.append("}");
        return i2.toString();
    }
}
