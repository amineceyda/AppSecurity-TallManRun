package j.a;

import g.c.b.b.f;
import j.a.t1.j;

public abstract class f1 extends v {
    public abstract f1 O();

    public final String P() {
        f1 f1Var;
        v vVar = h0.a;
        f1 f1Var2 = j.b;
        if (this == f1Var2) {
            return "Dispatchers.Main";
        }
        try {
            f1Var = f1Var2.O();
        } catch (UnsupportedOperationException unused) {
            f1Var = null;
        }
        if (this == f1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String P = P();
        if (P != null) {
            return P;
        }
        return getClass().getSimpleName() + '@' + f.E(this);
    }
}
