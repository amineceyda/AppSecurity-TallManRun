package g.e.a.b.e.c;

public final class ob implements nb {
    public static final x5 a;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        a = v5Var.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        v5Var.b("measurement.client.sessions.check_on_startup", true);
        v5Var.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean c() {
        return true;
    }

    public final boolean j() {
        return ((Boolean) a.b()).booleanValue();
    }
}
