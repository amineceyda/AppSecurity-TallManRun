package g.e.a.b.e.c;

import java.util.List;

public final class z4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final z4 zza;
    private int zze;
    private int zzf;
    private u7 zzg = w8.f3078e;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        z4 z4Var = new z4();
        zza = z4Var;
        o7.k(z4.class, z4Var);
    }

    public final boolean A() {
        return (this.zze & 4) != 0;
    }

    public final int B() {
        int a = y4.a(this.zzf);
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
            return new x8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", x4.a, "zzg", z4.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i3 == 3) {
            return new z4();
        } else {
            if (i3 == 4) {
                return new w4();
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

    public final String u() {
        return this.zzh;
    }

    public final String v() {
        return this.zzi;
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }

    public final boolean z() {
        return (this.zze & 16) != 0;
    }
}
