package g.e.a.b.e.c;

import g.a.a.a.a;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class f6 implements Serializable, c6 {
    public final Object zza;

    public f6(Object obj) {
        this.zza = obj;
    }

    public final Object c() {
        return this.zza;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof f6)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((f6) obj).zza;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return a.g(new StringBuilder(obj.length() + 22), "Suppliers.ofInstance(", obj, ")");
    }
}
