package g.d.a.q;

import g.a.a.a.a;
import g.d.a.l.l;
import java.security.MessageDigest;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class b implements l {
    public final Object b;

    public b(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(l.a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("ObjectKey{object=");
        i2.append(this.b);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
