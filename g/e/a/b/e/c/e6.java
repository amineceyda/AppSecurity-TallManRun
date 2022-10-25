package g.e.a.b.e.c;

import g.a.a.a.a;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class e6 implements c6 {
    @CheckForNull
    public volatile c6 b;
    public volatile boolean c;
    @CheckForNull

    /* renamed from: d  reason: collision with root package name */
    public Object f2923d;

    public e6(c6 c6Var) {
        Objects.requireNonNull(c6Var);
        this.b = c6Var;
    }

    public final Object c() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    c6 c6Var = this.b;
                    c6Var.getClass();
                    Object c2 = c6Var.c();
                    this.f2923d = c2;
                    this.c = true;
                    this.b = null;
                    return c2;
                }
            }
        }
        return this.f2923d;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f2923d);
            obj = a.g(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return a.g(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }
}
