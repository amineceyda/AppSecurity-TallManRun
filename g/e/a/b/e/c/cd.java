package g.e.a.b.e.c;

import g.e.a.b.f.b.e4;
import java.util.List;

public final class cd extends j {

    /* renamed from: d  reason: collision with root package name */
    public final e4 f2911d;

    public cd(e4 e4Var) {
        super("internal.logger");
        this.f2911d = e4Var;
        this.c.put("log", new bd(this, false, true));
        this.c.put("silent", new jc());
        ((j) this.c.get("silent")).c.put("log", new bd(this, true, true));
        this.c.put("unmonitored", new ad());
        ((j) this.c.get("unmonitored")).c.put("log", new bd(this, false, false));
    }

    public final p a(h4 h4Var, List list) {
        return p.E;
    }
}
