package g.d.a.l.v.d;

import g.d.a.l.t.v;
import java.util.Objects;

public class b implements v<byte[]> {
    public final byte[] b;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.b = bArr;
    }

    public int b() {
        return this.b.length;
    }

    public Class<byte[]> c() {
        return byte[].class;
    }

    public void d() {
    }

    public Object get() {
        return this.b;
    }
}
