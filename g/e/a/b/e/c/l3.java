package g.e.a.b.e.c;

public final class l3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final l3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        l3 l3Var = new l3();
        zza = l3Var;
        o7.k(l3.class, l3Var);
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i3 == 3) {
            return new l3();
        } else {
            if (i3 == 4) {
                return new k3();
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

    public final String u() {
        return this.zzg;
    }
}
