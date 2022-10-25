package g.e.a.b.e.c;

import g.a.a.a.a;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class d6 implements Serializable, c6 {
    public volatile transient boolean b;
    @CheckForNull
    public transient Object c;
    public final c6 zza;

    public d6(c6 c6Var) {
        Objects.requireNonNull(c6Var);
        this.zza = c6Var;
    }

    public final Object c() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object c2 = this.zza.c();
                    this.c = c2;
                    this.b = true;
                    return c2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            obj = a.g(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return a.g(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }
}
