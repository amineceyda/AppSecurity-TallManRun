package g.e.a.b.e.c;

import java.util.List;

public final class v3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final v3 zza;
    private int zze;
    private u7 zzf = w8.f3078e;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        v3 v3Var = new v3();
        zza = v3Var;
        o7.k(v3.class, v3Var);
    }

    public static /* synthetic */ void B(v3 v3Var, int i2, z3 z3Var) {
        z3Var.getClass();
        v3Var.M();
        v3Var.zzf.set(i2, z3Var);
    }

    public static /* synthetic */ void C(v3 v3Var, z3 z3Var) {
        z3Var.getClass();
        v3Var.M();
        v3Var.zzf.add(z3Var);
    }

    public static /* synthetic */ void D(v3 v3Var, Iterable iterable) {
        v3Var.M();
        h6.g(iterable, v3Var.zzf);
    }

    public static void E(v3 v3Var) {
        v3Var.zzf = w8.f3078e;
    }

    public static /* synthetic */ void F(v3 v3Var, int i2) {
        v3Var.M();
        v3Var.zzf.remove(i2);
    }

    public static /* synthetic */ void G(v3 v3Var, String str) {
        str.getClass();
        v3Var.zze |= 1;
        v3Var.zzg = str;
    }

    public static /* synthetic */ void H(v3 v3Var, long j2) {
        v3Var.zze |= 2;
        v3Var.zzh = j2;
    }

    public static /* synthetic */ void I(v3 v3Var, long j2) {
        v3Var.zze |= 4;
        v3Var.zzi = j2;
    }

    public static u3 w() {
        return (u3) zza.m();
    }

    public final List A() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zze & 8) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final void M() {
        u7 u7Var = this.zzf;
        if (!u7Var.k()) {
            this.zzf = o7.q(u7Var);
        }
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", z3.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i3 == 3) {
            return new v3();
        } else {
            if (i3 == 4) {
                return new u3((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzj;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final long u() {
        return this.zzi;
    }

    public final long v() {
        return this.zzh;
    }

    public final z3 y(int i2) {
        return (z3) this.zzf.get(i2);
    }

    public final String z() {
        return this.zzg;
    }
}
