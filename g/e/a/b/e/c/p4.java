package g.e.a.b.e.c;

public final class p4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final p4 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        p4 p4Var = new p4();
        zza = p4Var;
        o7.k(p4.class, p4Var);
    }

    public static /* synthetic */ void A(p4 p4Var, String str) {
        str.getClass();
        p4Var.zze |= 2;
        p4Var.zzg = str;
    }

    public static /* synthetic */ void B(p4 p4Var, String str) {
        str.getClass();
        p4Var.zze |= 4;
        p4Var.zzh = str;
    }

    public static /* synthetic */ void C(p4 p4Var) {
        p4Var.zze &= -5;
        p4Var.zzh = zza.zzh;
    }

    public static /* synthetic */ void D(p4 p4Var, long j2) {
        p4Var.zze |= 8;
        p4Var.zzi = j2;
    }

    public static /* synthetic */ void E(p4 p4Var) {
        p4Var.zze &= -9;
        p4Var.zzi = 0;
    }

    public static /* synthetic */ void F(p4 p4Var, double d2) {
        p4Var.zze |= 32;
        p4Var.zzk = d2;
    }

    public static /* synthetic */ void G(p4 p4Var) {
        p4Var.zze &= -33;
        p4Var.zzk = 0.0d;
    }

    public static o4 v() {
        return (o4) zza.m();
    }

    public static /* synthetic */ void z(p4 p4Var, long j2) {
        p4Var.zze |= 1;
        p4Var.zzf = j2;
    }

    public final boolean H() {
        return (this.zze & 32) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i3 == 3) {
            return new p4();
        } else {
            if (i3 == 4) {
                return new o4((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double s() {
        return this.zzk;
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzh;
    }
}
