package g.e.a.b.f.b;

import java.util.concurrent.Callable;

public final class d5 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ g5 b;

    public d5(g5 g5Var, String str) {
        this.b = g5Var;
        this.a = str;
    }

    public final Object call() throws Exception {
        this.b.a.a();
        k kVar = this.b.a.c;
        k9.I(kVar);
        return kVar.M(this.a);
    }
}
