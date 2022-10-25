package g.e.a.a.f;

import g.e.a.a.a;
import java.util.Arrays;
import java.util.Objects;

public final class k {
    public final a a;
    public final byte[] b;

    public k(a aVar, byte[] bArr) {
        Objects.requireNonNull(aVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = aVar;
        this.b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.a.equals(kVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, kVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("EncodedPayload{encoding=");
        i2.append(this.a);
        i2.append(", bytes=[...]}");
        return i2.toString();
    }
}
