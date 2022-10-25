package g.e.a.a.f.z.h;

import g.e.a.a.f.a0.a;
import g.e.a.a.f.x.a.c;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class f implements a.C0102a {
    public final /* synthetic */ u a;
    public final /* synthetic */ Map b;

    public /* synthetic */ f(u uVar, Map map) {
        this.a = uVar;
        this.b = map;
    }

    public final Object a() {
        u uVar = this.a;
        Map map = this.b;
        Objects.requireNonNull(uVar);
        for (Map.Entry entry : map.entrySet()) {
            uVar.f2811i.d((long) ((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }
}
