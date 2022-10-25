package g.e.a.b.e.c;

import java.util.List;

public final class d3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final d3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private u7 zzi = w8.f3078e;

    static {
        d3 d3Var = new d3();
        zza = d3Var;
        o7.k(d3.class, d3Var);
    }

    public static d3 u() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final int B() {
        int a = c3.a(this.zzf);
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
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", b3.a, "zzg", "zzh", "zzi"});
        } else if (i3 == 3) {
            return new d3();
        } else {
            if (i3 == 4) {
                return new a3();
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzi.size();
    }

    public final String v() {
        return this.zzg;
    }

    public final List w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
