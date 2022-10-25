package g.e.a.b.e.c;

import java.util.List;

public final class r4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final r4 zza;
    private u7 zze = w8.f3078e;

    static {
        r4 r4Var = new r4();
        zza = r4Var;
        o7.k(r4.class, r4Var);
    }

    public static r4 u() {
        return zza;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", t4.class});
        } else if (i3 == 3) {
            return new r4();
        } else {
            if (i3 == 4) {
                return new q4();
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zze.size();
    }

    public final List v() {
        return this.zze;
    }
}
