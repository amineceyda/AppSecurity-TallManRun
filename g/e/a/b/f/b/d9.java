package g.e.a.b.f.b;

import g.e.a.b.b.h.c;
import java.util.Objects;

public final class d9 implements Runnable {
    public final /* synthetic */ l9 b;
    public final /* synthetic */ k9 c;

    public d9(k9 k9Var, l9 l9Var) {
        this.c = k9Var;
        this.b = l9Var;
    }

    public final void run() {
        k9 k9Var = this.c;
        k9Var.b().h();
        k9Var.f3237k = new v3(k9Var);
        k kVar = new k(k9Var);
        kVar.j();
        k9Var.c = kVar;
        f K = k9Var.K();
        g4 g4Var = k9Var.a;
        Objects.requireNonNull(g4Var, "null reference");
        K.c = g4Var;
        h8 h8Var = new h8(k9Var);
        h8Var.j();
        k9Var.f3235i = h8Var;
        ca caVar = new ca(k9Var);
        caVar.j();
        k9Var.f3232f = caVar;
        w6 w6Var = new w6(k9Var);
        w6Var.j();
        k9Var.f3234h = w6Var;
        z8 z8Var = new z8(k9Var);
        z8Var.j();
        k9Var.f3231e = z8Var;
        k9Var.f3230d = new m3(k9Var);
        if (k9Var.q != k9Var.r) {
            k9Var.d().f3136f.c("Not all upload components initialized", Integer.valueOf(k9Var.q), Integer.valueOf(k9Var.r));
        }
        k9Var.f3239m = true;
        k9 k9Var2 = this.c;
        k9Var2.b().h();
        k kVar2 = k9Var2.c;
        k9.I(kVar2);
        kVar2.R();
        if (k9Var2.f3235i.f3186j.a() == 0) {
            p3 p3Var = k9Var2.f3235i.f3186j;
            Objects.requireNonNull((c) k9Var2.e());
            p3Var.b(System.currentTimeMillis());
        }
        k9Var2.D();
    }
}
