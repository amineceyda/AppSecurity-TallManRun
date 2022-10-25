package g.e.b.l.j.j;

import java.util.concurrent.Callable;

public class w implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v c;

    public w(v vVar, long j2, String str) {
        this.c = vVar;
        this.a = j2;
        this.b = str;
    }

    public Object call() throws Exception {
        f0 f0Var = this.c.f3530m;
        if (f0Var != null && f0Var.f3487e.get()) {
            return null;
        }
        this.c.f3526i.b.c(this.a, this.b);
        return null;
    }
}
