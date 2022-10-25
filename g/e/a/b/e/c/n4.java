package g.e.a.b.e.c;

import java.util.List;

public final class n4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final n4 zza;
    private int zze;
    private int zzf;
    private t7 zzg = d8.f2915e;

    static {
        n4 n4Var = new n4();
        zza = n4Var;
        o7.k(n4.class, n4Var);
    }

    public static m4 v() {
        return (m4) zza.m();
    }

    public static /* synthetic */ void y(n4 n4Var, int i2) {
        n4Var.zze |= 1;
        n4Var.zzf = i2;
    }

    public static void z(n4 n4Var, Iterable iterable) {
        t7 t7Var = n4Var.zzg;
        if (!((i6) t7Var).b) {
            n4Var.zzg = o7.p(t7Var);
        }
        h6.g(iterable, n4Var.zzg);
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i3 == 3) {
            return new n4();
        } else {
            if (i3 == 4) {
                return new m4((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return ((d8) this.zzg).size();
    }

    public final int t() {
        return this.zzf;
    }

    public final long u(int i2) {
        d8 d8Var = (d8) this.zzg;
        d8Var.l(i2);
        return d8Var.c[i2];
    }

    public final List x() {
        return this.zzg;
    }
}
