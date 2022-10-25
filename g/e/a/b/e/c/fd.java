package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class fd extends j {

    /* renamed from: d  reason: collision with root package name */
    public final u6 f2928d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f2929e = new HashMap();

    public fd(u6 u6Var) {
        super("require");
        this.f2928d = u6Var;
    }

    public final p a(h4 h4Var, List list) {
        p pVar;
        e.a0("require", 1, list);
        String e2 = h4Var.b((p) list.get(0)).e();
        if (this.f2929e.containsKey(e2)) {
            return (p) this.f2929e.get(e2);
        }
        u6 u6Var = this.f2928d;
        if (u6Var.a.containsKey(e2)) {
            try {
                pVar = (p) ((Callable) u6Var.a.get(e2)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(e2);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            pVar = p.E;
        }
        if (pVar instanceof j) {
            this.f2929e.put(e2, (j) pVar);
        }
        return pVar;
    }
}
