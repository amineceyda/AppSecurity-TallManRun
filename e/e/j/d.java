package e.e.j;

import g.a.a.a.a;
import java.util.Objects;

public final class d {
    public final Object a;

    public d(Object obj) {
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((d) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("DisplayCutoutCompat{");
        i2.append(this.a);
        i2.append("}");
        return i2.toString();
    }
}
