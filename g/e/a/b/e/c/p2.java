package g.e.a.b.e.c;

import java.util.List;

public final class p2 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final p2 zza;
    private int zze;
    private int zzf;
    private u7 zzg;
    private u7 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        p2 p2Var = new p2();
        zza = p2Var;
        o7.k(p2.class, p2Var);
    }

    public p2() {
        w8 w8Var = w8.f3078e;
        this.zzg = w8Var;
        this.zzh = w8Var;
    }

    public static /* synthetic */ void A(p2 p2Var, int i2, z2 z2Var) {
        u7 u7Var = p2Var.zzg;
        if (!u7Var.k()) {
            p2Var.zzg = o7.q(u7Var);
        }
        p2Var.zzg.set(i2, z2Var);
    }

    public static /* synthetic */ void B(p2 p2Var, int i2, r2 r2Var) {
        u7 u7Var = p2Var.zzh;
        if (!u7Var.k()) {
            p2Var.zzh = o7.q(u7Var);
        }
        p2Var.zzh.set(i2, r2Var);
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", z2.class, "zzh", r2.class, "zzi", "zzj"});
        } else if (i3 == 3) {
            return new p2();
        } else {
            if (i3 == 4) {
                return new o2((n2) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zzg.size();
    }

    public final r2 w(int i2) {
        return (r2) this.zzh.get(i2);
    }

    public final z2 x(int i2) {
        return (z2) this.zzg.get(i2);
    }

    public final List y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzg;
    }
}
