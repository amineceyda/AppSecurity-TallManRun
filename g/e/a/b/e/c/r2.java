package g.e.a.b.e.c;

import java.util.List;

public final class r2 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final r2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private u7 zzh = w8.f3078e;
    private boolean zzi;
    private x2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        r2 r2Var = new r2();
        zza = r2Var;
        o7.k(r2.class, r2Var);
    }

    public static /* synthetic */ void A(r2 r2Var, String str) {
        r2Var.zze |= 2;
        r2Var.zzg = str;
    }

    public static /* synthetic */ void B(r2 r2Var, int i2, t2 t2Var) {
        t2Var.getClass();
        u7 u7Var = r2Var.zzh;
        if (!u7Var.k()) {
            r2Var.zzh = o7.q(u7Var);
        }
        r2Var.zzh.set(i2, t2Var);
    }

    public static q2 u() {
        return (q2) zza.m();
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzm;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 64) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", t2.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i3 == 3) {
            return new r2();
        } else {
            if (i3 == 4) {
                return new q2((n2) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzf;
    }

    public final t2 w(int i2) {
        return (t2) this.zzh.get(i2);
    }

    public final x2 x() {
        x2 x2Var = this.zzj;
        return x2Var == null ? x2.t() : x2Var;
    }

    public final String y() {
        return this.zzg;
    }

    public final List z() {
        return this.zzh;
    }
}
