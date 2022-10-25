package g.e.a.b.e.c;

public final class x2 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final x2 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        x2 x2Var = new x2();
        zza = x2Var;
        o7.k(x2.class, x2Var);
    }

    public static x2 t() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 16) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final int D() {
        int a = w2.a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", v2.a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i3 == 3) {
            return new x2();
        } else {
            if (i3 == 4) {
                return new u2();
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzj;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
