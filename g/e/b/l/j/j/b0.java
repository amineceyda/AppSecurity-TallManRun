package g.e.b.l.j.j;

import g.e.b.l.j.f;
import java.util.concurrent.Callable;

public class b0 implements Callable<Boolean> {
    public final /* synthetic */ a0 a;

    public b0(a0 a0Var) {
        this.a = a0Var;
    }

    public Object call() throws Exception {
        v vVar = this.a.f3475f;
        boolean z = true;
        if (!vVar.c.b().exists()) {
            String f2 = vVar.f();
            if (f2 == null || !vVar.f3527j.d(f2)) {
                z = false;
            }
        } else {
            f.a.e("Found previous crash marker.");
            vVar.c.b().delete();
        }
        return Boolean.valueOf(z);
    }
}
