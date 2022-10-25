package g.e.a.b.e.c;

import java.util.List;

public final class z3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final z3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    private u7 zzk = w8.f3078e;

    static {
        z3 z3Var = new z3();
        zza = z3Var;
        o7.k(z3.class, z3Var);
    }

    public static /* synthetic */ void B(z3 z3Var, String str) {
        str.getClass();
        z3Var.zze |= 1;
        z3Var.zzf = str;
    }

    public static /* synthetic */ void C(z3 z3Var, String str) {
        str.getClass();
        z3Var.zze |= 2;
        z3Var.zzg = str;
    }

    public static /* synthetic */ void D(z3 z3Var) {
        z3Var.zze &= -3;
        z3Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void E(z3 z3Var, long j2) {
        z3Var.zze |= 4;
        z3Var.zzh = j2;
    }

    public static /* synthetic */ void F(z3 z3Var) {
        z3Var.zze &= -5;
        z3Var.zzh = 0;
    }

    public static /* synthetic */ void G(z3 z3Var, double d2) {
        z3Var.zze |= 16;
        z3Var.zzj = d2;
    }

    public static /* synthetic */ void H(z3 z3Var) {
        z3Var.zze &= -17;
        z3Var.zzj = 0.0d;
    }

    public static void I(z3 z3Var, z3 z3Var2) {
        u7 u7Var = z3Var.zzk;
        if (!u7Var.k()) {
            z3Var.zzk = o7.q(u7Var);
        }
        z3Var.zzk.add(z3Var2);
    }

    public static void J(z3 z3Var, Iterable iterable) {
        u7 u7Var = z3Var.zzk;
        if (!u7Var.k()) {
            z3Var.zzk = o7.q(u7Var);
        }
        h6.g(iterable, z3Var.zzk);
    }

    public static void K(z3 z3Var) {
        z3Var.zzk = w8.f3078e;
    }

    public static y3 w() {
        return (y3) zza.m();
    }

    public final List A() {
        return this.zzk;
    }

    public final boolean L() {
        return (this.zze & 16) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", z3.class});
        } else if (i3 == 3) {
            return new z3();
        } else {
            if (i3 == 4) {
                return new y3((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double s() {
        return this.zzj;
    }

    public final float t() {
        return this.zzi;
    }

    public final int u() {
        return this.zzk.size();
    }

    public final long v() {
        return this.zzh;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
