package j.a;

public class a1 extends c1 implements o {
    public final boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var) {
        super(true);
        c1 c1Var;
        boolean z = true;
        H(y0Var);
        j jVar = (j) this._parentHandle;
        k kVar = (k) (!(jVar instanceof k) ? null : jVar);
        if (kVar != null && (c1Var = (c1) kVar.f4584e) != null) {
            while (true) {
                if (!c1Var.B()) {
                    j jVar2 = (j) c1Var._parentHandle;
                    k kVar2 = (k) (!(jVar2 instanceof k) ? null : jVar2);
                    if (kVar2 != null) {
                        c1Var = (c1) kVar2.f4584e;
                        if (c1Var == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.c = z;
    }

    public boolean B() {
        return this.c;
    }

    public boolean C() {
        return true;
    }
}
