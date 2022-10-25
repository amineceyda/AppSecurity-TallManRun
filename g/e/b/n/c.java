package g.e.b.n;

import java.util.Collections;
import java.util.Map;

public final class c {
    public final String a;
    public final Map<Class<?>, Object> b;

    public c(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public c(String str, Map map, a aVar) {
        this.a = str;
        this.b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("FieldDescriptor{name=");
        i2.append(this.a);
        i2.append(", properties=");
        i2.append(this.b.values());
        i2.append("}");
        return i2.toString();
    }
}
