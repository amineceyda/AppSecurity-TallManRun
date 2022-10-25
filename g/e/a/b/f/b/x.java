package g.e.a.b.f.b;

import g.c.b.b.f;

public final class x implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z1 f3393d;

    public x(z1 z1Var, String str, long j2) {
        this.f3393d = z1Var;
        this.b = str;
        this.c = j2;
    }

    public final void run() {
        z1 z1Var = this.f3393d;
        String str = this.b;
        long j2 = this.c;
        z1Var.h();
        f.k(str);
        Integer num = (Integer) z1Var.c.get(str);
        if (num != null) {
            y6 o = z1Var.a.x().o(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                z1Var.c.remove(str);
                Long l2 = (Long) z1Var.b.get(str);
                if (l2 == null) {
                    z1Var.a.d().f3136f.a("First ad unit exposure time was never set");
                } else {
                    long longValue = l2.longValue();
                    z1Var.b.remove(str);
                    z1Var.m(str, j2 - longValue, o);
                }
                if (z1Var.c.isEmpty()) {
                    long j3 = z1Var.f3421d;
                    if (j3 == 0) {
                        z1Var.a.d().f3136f.a("First ad exposure time was never set");
                        return;
                    }
                    z1Var.l(j2 - j3, o);
                    z1Var.f3421d = 0;
                    return;
                }
                return;
            }
            z1Var.c.put(str, Integer.valueOf(intValue));
            return;
        }
        z1Var.a.d().f3136f.b("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
