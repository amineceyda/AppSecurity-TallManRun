package g.e.a.b.e.c;

import g.a.a.a.a;
import javax.annotation.CheckForNull;

public final class b6 extends a6 {
    private final Object zza;

    public b6(Object obj) {
        this.zza = obj;
    }

    public final Object a() {
        return this.zza;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof b6) {
            return this.zza.equals(((b6) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return a.g(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }
}
