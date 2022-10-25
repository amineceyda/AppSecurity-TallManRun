package g.e.a.b.e.c;

public final class t3 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final t3 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        t3 t3Var = new t3();
        zza = t3Var;
        o7.k(t3.class, t3Var);
    }

    public static s3 u() {
        return (s3) zza.m();
    }

    public static /* synthetic */ void w(t3 t3Var, int i2) {
        t3Var.zze |= 1;
        t3Var.zzf = i2;
    }

    public static /* synthetic */ void x(t3 t3Var, long j2) {
        t3Var.zze |= 2;
        t3Var.zzg = j2;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i3 == 3) {
            return new t3();
        } else {
            if (i3 == 4) {
                return new s3((m3) null);
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

    public final long t() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
