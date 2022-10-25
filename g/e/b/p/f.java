package g.e.b.p;

import g.a.a.a.a;
import java.util.List;
import java.util.Objects;

public final class f extends m {
    public final String a;
    public final List<String> b;

    public f(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.b = list;
    }

    public List<String> a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.b()) && this.b.equals(mVar.a());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("HeartBeatResult{userAgent=");
        i2.append(this.a);
        i2.append(", usedDates=");
        i2.append(this.b);
        i2.append("}");
        return i2.toString();
    }
}
