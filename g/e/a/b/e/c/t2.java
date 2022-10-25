package g.e.a.b.e.c;

public final class t2 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final t2 zza;
    private int zze;
    private d3 zzf;
    private x2 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        t2 t2Var = new t2();
        zza = t2Var;
        o7.k(t2.class, t2Var);
    }

    public static t2 t() {
        return zza;
    }

    public static /* synthetic */ void x(t2 t2Var, String str) {
        t2Var.zze |= 8;
        t2Var.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i3 == 3) {
            return new t2();
        } else {
            if (i3 == 4) {
                return new s2((n2) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final x2 u() {
        x2 x2Var = this.zzg;
        return x2Var == null ? x2.t() : x2Var;
    }

    public final d3 v() {
        d3 d3Var = this.zzf;
        return d3Var == null ? d3.u() : d3Var;
    }

    public final String w() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
