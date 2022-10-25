package g.e.a.b.e.c;

import java.util.List;

public final class v4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final v4 zza;
    private int zze;
    private u7 zzf = w8.f3078e;
    private r4 zzg;

    static {
        v4 v4Var = new v4();
        zza = v4Var;
        o7.k(v4.class, v4Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", z4.class, "zzg"});
        } else if (i3 == 3) {
            return new v4();
        } else {
            if (i3 == 4) {
                return new u4();
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final r4 s() {
        r4 r4Var = this.zzg;
        return r4Var == null ? r4.u() : r4Var;
    }

    public final List u() {
        return this.zzf;
    }
}
