package g.d.a.l.t;

import g.a.a.a.a;
import g.d.a.l.l;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

public final class e implements l {
    public final l b;
    public final l c;

    public e(l lVar, l lVar2) {
        this.b = lVar;
        this.c = lVar2;
    }

    public void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b.equals(eVar.b) && this.c.equals(eVar.c);
    }

    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder i2 = a.i("DataCacheKey{sourceKey=");
        i2.append(this.b);
        i2.append(", signature=");
        i2.append(this.c);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
