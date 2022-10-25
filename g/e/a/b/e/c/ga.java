package g.e.a.b.e.c;

public final class ga implements fa {
    public static final x5 a;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        a = v5Var.b("measurement.androidId.delete_feature", true);
        v5Var.b("measurement.log_androidId_enabled", false);
    }

    public final boolean c() {
        return ((Boolean) a.b()).booleanValue();
    }
}
