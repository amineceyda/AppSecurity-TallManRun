package g.e.a.b.e.c;

public final class ac implements zb {
    public static final x5 a;
    public static final x5 b;
    public static final x5 c;

    /* renamed from: d  reason: collision with root package name */
    public static final x5 f2894d;

    /* renamed from: e  reason: collision with root package name */
    public static final x5 f2895e;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        a = v5Var.b("measurement.test.boolean_flag", false);
        b = new t5(v5Var, Double.valueOf(-3.0d));
        c = v5Var.a("measurement.test.int_flag", -2);
        f2894d = v5Var.a("measurement.test.long_flag", -1);
        f2895e = new u5(v5Var, "measurement.test.string_flag", "---");
    }

    public final boolean b() {
        return ((Boolean) a.b()).booleanValue();
    }

    public final double c() {
        return ((Double) b.b()).doubleValue();
    }

    public final long j() {
        return ((Long) c.b()).longValue();
    }

    public final long k() {
        return ((Long) f2894d.b()).longValue();
    }

    public final String l() {
        return (String) f2895e.b();
    }
}
