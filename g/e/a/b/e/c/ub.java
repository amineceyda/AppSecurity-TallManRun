package g.e.a.b.e.c;

public final class ub implements tb {
    public static final x5 a;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        v5Var.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        v5Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        a = v5Var.b("measurement.lifecycle.app_in_background_parameter", false);
        v5Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean c() {
        return ((Boolean) a.b()).booleanValue();
    }
}
