package g.e.a.b.e.c;

public final class ta implements sa {
    public static final x5 a;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        v5Var.b("measurement.client.consent_state_v1", true);
        v5Var.b("measurement.client.3p_consent_state_v1", true);
        v5Var.b("measurement.service.consent_state_v1_W36", true);
        a = v5Var.a("measurement.service.storage_consent_support_version", 203600);
    }

    public final long c() {
        return ((Long) a.b()).longValue();
    }
}
