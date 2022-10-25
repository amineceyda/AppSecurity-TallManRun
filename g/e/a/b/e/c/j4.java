package g.e.a.b.e.c;

public final class j4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final j4 zza;
    private int zze;
    private int zzf = 1;
    private u7 zzg = w8.f3078e;

    static {
        j4 j4Var = new j4();
        zza = j4Var;
        o7.k(j4.class, j4Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", i4.a, "zzg", x3.class});
        } else if (i3 == 3) {
            return new j4();
        } else {
            if (i3 == 4) {
                return new g4((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }
}
