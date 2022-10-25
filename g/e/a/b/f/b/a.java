package g.e.a.b.f.b;

import g.c.b.b.f;
import java.util.Map;

public final class a implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z1 f3104d;

    public a(z1 z1Var, String str, long j2) {
        this.f3104d = z1Var;
        this.b = str;
        this.c = j2;
    }

    public final void run() {
        Map map;
        Object valueOf;
        z1 z1Var = this.f3104d;
        String str = this.b;
        long j2 = this.c;
        z1Var.h();
        f.k(str);
        if (z1Var.c.isEmpty()) {
            z1Var.f3421d = j2;
        }
        Integer num = (Integer) z1Var.c.get(str);
        if (num != null) {
            map = z1Var.c;
            valueOf = Integer.valueOf(num.intValue() + 1);
        } else if (z1Var.c.size() >= 100) {
            z1Var.a.d().f3139i.a("Too many ads visible");
            return;
        } else {
            z1Var.c.put(str, 1);
            map = z1Var.b;
            valueOf = Long.valueOf(j2);
        }
        map.put(str, valueOf);
    }
}
