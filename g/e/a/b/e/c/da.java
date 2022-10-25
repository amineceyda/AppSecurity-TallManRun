package g.e.a.b.e.c;

public final class da implements ca {
    public static final x5 a;
    public static final x5 b;
    public static final x5 c;

    /* renamed from: d  reason: collision with root package name */
    public static final x5 f2917d;

    /* renamed from: e  reason: collision with root package name */
    public static final x5 f2918e;

    /* renamed from: f  reason: collision with root package name */
    public static final x5 f2919f;

    static {
        v5 v5Var = new v5((String) null, p5.a("com.google.android.gms.measurement"), true);
        a = v5Var.b("measurement.adid_zero.app_instance_id_fix", true);
        b = v5Var.b("measurement.adid_zero.service", true);
        c = v5Var.b("measurement.adid_zero.adid_uid", false);
        v5Var.a("measurement.id.adid_zero.service", 0);
        f2917d = v5Var.b("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f2918e = v5Var.b("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f2919f = v5Var.b("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    public final boolean b() {
        return ((Boolean) f2917d.b()).booleanValue();
    }

    public final boolean c() {
        return true;
    }

    public final boolean g() {
        return ((Boolean) f2918e.b()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) a.b()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) b.b()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) c.b()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) f2919f.b()).booleanValue();
    }
}
