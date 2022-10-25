package g.e.a.b.g;

import g.c.b.b.f;
import java.util.Objects;

public class g<TResult> {
    public final b0<TResult> a = new b0<>();

    public boolean a(Exception exc) {
        b0<TResult> b0Var = this.a;
        Objects.requireNonNull(b0Var);
        f.o(exc, "Exception must not be null");
        synchronized (b0Var.a) {
            if (b0Var.c) {
                return false;
            }
            b0Var.c = true;
            b0Var.f3434f = exc;
            b0Var.b.b(b0Var);
            return true;
        }
    }

    public boolean b(TResult tresult) {
        b0<TResult> b0Var = this.a;
        synchronized (b0Var.a) {
            if (b0Var.c) {
                return false;
            }
            b0Var.c = true;
            b0Var.f3433e = tresult;
            b0Var.b.b(b0Var);
            return true;
        }
    }
}
