package g.e.a.b.e.c;

import java.util.List;

public final class t4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final t4 zza;
    private int zze;
    private String zzf = "";
    private u7 zzg = w8.f3078e;

    static {
        t4 t4Var = new t4();
        zza = t4Var;
        o7.k(t4.class, t4Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", z4.class});
        } else if (i3 == 3) {
            return new t4();
        } else {
            if (i3 == 4) {
                return new s4();
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzg;
    }
}
