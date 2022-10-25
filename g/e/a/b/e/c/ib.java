package g.e.a.b.e.c;

public final class ib implements hb {
    public static final x5 a;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        v5Var.b("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        a = v5Var.b("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    public final boolean c() {
        return true;
    }

    public final boolean j() {
        return ((Boolean) a.b()).booleanValue();
    }
}
