package g.e.a.b.e.c;

public final class r3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final r3 zza;
    private int zze;
    private int zzf;
    private l4 zzg;
    private l4 zzh;
    private boolean zzi;

    static {
        r3 r3Var = new r3();
        zza = r3Var;
        o7.k(r3.class, r3Var);
    }

    public static /* synthetic */ void A(r3 r3Var, boolean z) {
        r3Var.zze |= 8;
        r3Var.zzi = z;
    }

    public static q3 t() {
        return (q3) zza.m();
    }

    public static /* synthetic */ void x(r3 r3Var, int i2) {
        r3Var.zze |= 1;
        r3Var.zzf = i2;
    }

    public static /* synthetic */ void y(r3 r3Var, l4 l4Var) {
        r3Var.zzg = l4Var;
        r3Var.zze |= 2;
    }

    public static /* synthetic */ void z(r3 r3Var, l4 l4Var) {
        r3Var.zzh = l4Var;
        r3Var.zze |= 4;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 4) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i3 == 3) {
            return new r3();
        } else {
            if (i3 == 4) {
                return new q3((m3) null);
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

    public final l4 v() {
        l4 l4Var = this.zzg;
        return l4Var == null ? l4.z() : l4Var;
    }

    public final l4 w() {
        l4 l4Var = this.zzh;
        return l4Var == null ? l4.z() : l4Var;
    }
}
