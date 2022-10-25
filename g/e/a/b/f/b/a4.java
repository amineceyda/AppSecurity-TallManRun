package g.e.a.b.f.b;

import g.e.a.b.e.c.ia;
import java.util.concurrent.Callable;

public final /* synthetic */ class a4 implements Callable {
    public final /* synthetic */ g4 a;
    public final /* synthetic */ String b;

    public /* synthetic */ a4(g4 g4Var, String str) {
        this.a = g4Var;
        this.b = str;
    }

    public final Object call() {
        return new ia("internal.remoteConfig", new f4(this.a, this.b));
    }
}
