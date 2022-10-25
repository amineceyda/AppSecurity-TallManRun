package g.e.a.b.e.c;

public final class z2 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final z2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private t2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        z2 z2Var = new z2();
        zza = z2Var;
        o7.k(z2.class, z2Var);
    }

    public static y2 u() {
        return (y2) zza.m();
    }

    public static /* synthetic */ void x(z2 z2Var, String str) {
        z2Var.zze |= 2;
        z2Var.zzg = str;
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 32) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i3 == 3) {
            return new z2();
        } else {
            if (i3 == 4) {
                return new y2((n2) null);
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

    public final t2 t() {
        t2 t2Var = this.zzh;
        return t2Var == null ? t2.t() : t2Var;
    }

    public final String w() {
        return this.zzg;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }
}
