package g.e.b.l.j.l;

import g.e.b.l.j.l.a0;
import java.util.Arrays;

public final class f extends a0.d.a {
    public final String a;
    public final byte[] b;

    public f(String str, byte[] bArr, a aVar) {
        this.a = str;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d.a)) {
            return false;
        }
        a0.d.a aVar = (a0.d.a) obj;
        if (this.a.equals(aVar.b())) {
            if (Arrays.equals(this.b, aVar instanceof f ? ((f) aVar).b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("File{filename=");
        i2.append(this.a);
        i2.append(", contents=");
        i2.append(Arrays.toString(this.b));
        i2.append("}");
        return i2.toString();
    }
}
