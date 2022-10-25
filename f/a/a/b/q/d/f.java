package f.a.a.b.q.d;

import java.util.Locale;

public class f extends e {
    public f() {
    }

    public f(String str) {
        super(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.d() != d()) {
            return false;
        }
        int d2 = d();
        for (int i2 = 0; i2 < d2; i2++) {
            if (!b(i2).equalsIgnoreCase(fVar.b(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int d2 = d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            i2 ^= b(i3).toLowerCase(Locale.US).hashCode();
        }
        return i2;
    }
}
