package g.e.a.b.e.c;

public final class h3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final h3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        h3 h3Var = new h3();
        zza = h3Var;
        o7.k(h3.class, h3Var);
    }

    public static /* synthetic */ void v(h3 h3Var, String str) {
        str.getClass();
        h3Var.zze |= 1;
        h3Var.zzf = str;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i3 == 3) {
            return new h3();
        } else {
            if (i3 == 4) {
                return new f3((e3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzi;
    }

    public final String u() {
        return this.zzf;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
