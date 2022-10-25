package g.e.a.b.f.b;

import e.d.e;
import g.c.b.b.f;
import g.e.a.b.e.c.j3;
import g.e.a.b.e.c.w0;
import java.util.LinkedHashMap;

public final class d4 extends e {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g4 f3126i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d4(g4 g4Var) {
        super(20);
        this.f3126i = g4Var;
    }

    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        f.k(str);
        g4 g4Var = this.f3126i;
        g4Var.i();
        f.k(str);
        if (!g4Var.o(str)) {
            return null;
        }
        if (!g4Var.f3169g.containsKey(str) || g4Var.f3169g.get(str) == null) {
            g4Var.w(str);
        } else {
            g4Var.x(str, (j3) g4Var.f3169g.get(str));
        }
        e eVar = g4Var.f3171i;
        synchronized (eVar) {
            linkedHashMap = new LinkedHashMap(eVar.a);
        }
        return (w0) linkedHashMap.get(str);
    }
}
