package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import g.e.a.b.f.b.f4;
import java.util.List;
import java.util.Map;

public final class k9 extends j {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f4 f2973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k9(f4 f4Var) {
        super("getValue");
        this.f2973d = f4Var;
    }

    public final p a(h4 h4Var, List list) {
        e.a0("getValue", 2, list);
        p b = h4Var.b((p) list.get(0));
        p b2 = h4Var.b((p) list.get(1));
        String e2 = b.e();
        f4 f4Var = this.f2973d;
        Map map = (Map) f4Var.b.f3166d.get(f4Var.a);
        String str = (map == null || !map.containsKey(e2)) ? null : (String) map.get(e2);
        return str != null ? new t(str) : b2;
    }
}
