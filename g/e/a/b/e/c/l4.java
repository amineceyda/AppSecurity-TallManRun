package g.e.a.b.e.c;

import java.util.List;

public final class l4 extends o7 implements p8 {
    /* access modifiers changed from: private */
    public static final l4 zza;
    private t7 zze;
    private t7 zzf;
    private u7 zzg;
    private u7 zzh;

    static {
        l4 l4Var = new l4();
        zza = l4Var;
        o7.k(l4.class, l4Var);
    }

    public l4() {
        d8 d8Var = d8.f2915e;
        this.zze = d8Var;
        this.zzf = d8Var;
        w8 w8Var = w8.f3078e;
        this.zzg = w8Var;
        this.zzh = w8Var;
    }

    public static void F(l4 l4Var, Iterable iterable) {
        t7 t7Var = l4Var.zze;
        if (!((i6) t7Var).b) {
            l4Var.zze = o7.p(t7Var);
        }
        h6.g(iterable, l4Var.zze);
    }

    public static void G(l4 l4Var) {
        l4Var.zze = d8.f2915e;
    }

    public static void H(l4 l4Var, Iterable iterable) {
        t7 t7Var = l4Var.zzf;
        if (!((i6) t7Var).b) {
            l4Var.zzf = o7.p(t7Var);
        }
        h6.g(iterable, l4Var.zzf);
    }

    public static void I(l4 l4Var) {
        l4Var.zzf = d8.f2915e;
    }

    public static void J(l4 l4Var, Iterable iterable) {
        u7 u7Var = l4Var.zzg;
        if (!u7Var.k()) {
            l4Var.zzg = o7.q(u7Var);
        }
        h6.g(iterable, l4Var.zzg);
    }

    public static void K(l4 l4Var, int i2) {
        u7 u7Var = l4Var.zzg;
        if (!u7Var.k()) {
            l4Var.zzg = o7.q(u7Var);
        }
        l4Var.zzg.remove(i2);
    }

    public static void L(l4 l4Var, Iterable iterable) {
        u7 u7Var = l4Var.zzh;
        if (!u7Var.k()) {
            l4Var.zzh = o7.q(u7Var);
        }
        h6.g(iterable, l4Var.zzh);
    }

    public static void M(l4 l4Var, int i2) {
        u7 u7Var = l4Var.zzh;
        if (!u7Var.k()) {
            l4Var.zzh = o7.q(u7Var);
        }
        l4Var.zzh.remove(i2);
    }

    public static k4 x() {
        return (k4) zza.m();
    }

    public static l4 z() {
        return zza;
    }

    public final n4 A(int i2) {
        return (n4) this.zzh.get(i2);
    }

    public final List B() {
        return this.zzg;
    }

    public final List C() {
        return this.zzf;
    }

    public final List D() {
        return this.zzh;
    }

    public final List E() {
        return this.zze;
    }

    public final Object r(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new x8(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", t3.class, "zzh", n4.class});
        } else if (i3 == 3) {
            return new l4();
        } else {
            if (i3 == 4) {
                return new k4((m3) null);
            }
            if (i3 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int s() {
        return this.zzg.size();
    }

    public final int t() {
        return ((d8) this.zzf).size();
    }

    public final int u() {
        return this.zzh.size();
    }

    public final int v() {
        return ((d8) this.zze).size();
    }

    public final t3 w(int i2) {
        return (t3) this.zzg.get(i2);
    }
}
