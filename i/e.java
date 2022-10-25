package i;

import i.o.c.h;
import java.io.Serializable;

public final class e<A, B> implements Serializable {
    private final A first;
    private final B second;

    public e(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public final A a() {
        return this.first;
    }

    public final B b() {
        return this.second;
    }

    public final A c() {
        return this.first;
    }

    public final B d() {
        return this.second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.first, eVar.first) && h.a(this.second, eVar.second);
    }

    public int hashCode() {
        A a = this.first;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.second;
        if (b != null) {
            i2 = b.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
