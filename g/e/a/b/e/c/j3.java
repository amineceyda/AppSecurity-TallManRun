package g.e.a.b.e.c;

import java.util.List;

public final class j3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final j3 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private u7 zzi;
    private u7 zzj;
    private u7 zzk;
    private String zzl;
    private boolean zzm;
    private u7 zzn;

    static {
        j3 j3Var = new j3();
        zza = j3Var;
        o7.k(j3.class, j3Var);
    }

    public j3() {
        w8 w8Var = w8.f3078e;
        this.zzi = w8Var;
        this.zzj = w8Var;
        this.zzk = w8Var;
        this.zzl = "";
        this.zzn = w8Var;
    }

    public static /* synthetic */ void D(j3 j3Var, int i2, h3 h3Var) {
        u7 u7Var = j3Var.zzj;
        if (!u7Var.k()) {
            j3Var.zzj = o7.q(u7Var);
        }
        j3Var.zzj.set(i2, h3Var);
    }

    public static void E(j3 j3Var) {
        j3Var.zzk = w8.f3078e;
    }

    public static i3 w() {
        return (i3) zza.m();
    }

    public static j3 y() {
        return zza;
    }

    public final List A() {
        return this.zzk;
    }

    public final List B() {
        return this.zzn;
    }

    public final List C() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzm;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", l3.class, "zzj", h3.class, "zzk", p2.class, "zzl", "zzm", "zzn", v4.class});
        } else if (i3 == 3) {
            return new j3();
        } else {
            if (i3 == 4) {
                return new i3((e3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzn.size();
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final h3 v(int i2) {
        return (h3) this.zzj.get(i2);
    }

    public final String z() {
        return this.zzg;
    }
}
