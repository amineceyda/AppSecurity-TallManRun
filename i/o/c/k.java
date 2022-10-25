package i.o.c;

import i.r.a;
import i.r.d;
import i.r.e;
import java.util.Objects;

public abstract class k extends m implements d {
    public k() {
    }

    public k(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    public a c() {
        Objects.requireNonNull(p.a);
        return this;
    }

    public d.a e() {
        a b = b();
        if (b != this) {
            return ((d) ((e) b)).e();
        }
        throw new i.o.a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [i.r.d$a, i.r.a] */
    public Object g(Object obj) {
        return ((l) this).e().a(obj);
    }
}
