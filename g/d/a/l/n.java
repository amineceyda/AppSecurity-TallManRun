package g.d.a.l;

import e.d.a;
import g.d.a.l.m;
import g.d.a.r.b;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

public final class n implements l {
    public final a<m<?>, Object> b = new b();

    public void b(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            a<m<?>, Object> aVar = this.b;
            if (i2 < aVar.f1260d) {
                m h2 = aVar.h(i2);
                Object l2 = this.b.l(i2);
                m.b<T> bVar = h2.b;
                if (h2.f2412d == null) {
                    h2.f2412d = h2.c.getBytes(l.a);
                }
                bVar.a(h2.f2412d, l2, messageDigest);
                i2++;
            } else {
                return;
            }
        }
    }

    public <T> T c(m<T> mVar) {
        if (this.b.e(mVar) >= 0) {
            return this.b.getOrDefault(mVar, null);
        }
        return mVar.a;
    }

    public void d(n nVar) {
        this.b.i(nVar.b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.b.equals(((n) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Options{values=");
        i2.append(this.b);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
