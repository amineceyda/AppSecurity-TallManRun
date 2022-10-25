package g.e.a.b.e.c;

import g.a.a.a.a;
import java.util.Map;

public final class f9 implements Map.Entry, Comparable {
    public final Comparable b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i9 f2927d;

    public f9(i9 i9Var, Comparable comparable, Object obj) {
        this.f2927d = i9Var;
        this.b = comparable;
        this.c = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((f9) obj).b);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.b;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.c;
            Object value = entry.getValue();
            if (obj2 == null) {
                z = value == null;
            } else {
                z = obj2.equals(value);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.b;
    }

    public final Object getValue() {
        return this.c;
    }

    public final int hashCode() {
        Comparable comparable = this.b;
        int i2 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.c;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode ^ i2;
    }

    public final Object setValue(Object obj) {
        i9 i9Var = this.f2927d;
        int i2 = i9.f2956h;
        i9Var.h();
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return a.g(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
