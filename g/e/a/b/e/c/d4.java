package g.e.a.b.e.c;

import java.util.List;

public final class d4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final d4 zza;
    private u7 zze = w8.f3078e;

    static {
        d4 d4Var = new d4();
        zza = d4Var;
        o7.k(d4.class, d4Var);
    }

    public static c4 s() {
        return (c4) zza.m();
    }

    public static /* synthetic */ void w(d4 d4Var, f4 f4Var) {
        u7 u7Var = d4Var.zze;
        if (!u7Var.k()) {
            d4Var.zze = o7.q(u7Var);
        }
        d4Var.zze.add(f4Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", f4.class});
        } else if (i3 == 3) {
            return new d4();
        } else {
            if (i3 == 4) {
                return new c4((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final f4 u() {
        return (f4) this.zze.get(0);
    }

    public final List v() {
        return this.zze;
    }
}
